package org.chromium.wip.protocolParser;

import gnu.trove.THashSet;
import gnu.trove.TObjectProcedure;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Records a list of files in the root directory and deletes files that were not re-generated.
 */
class FileSet {
  private final Path rootDir;
  @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
  private final THashSet<Path> unusedFiles;

  FileSet(Path rootDir) throws IOException {
    this.rootDir = rootDir;
    unusedFiles = new THashSet<Path>();
    Files.walkFileTree(rootDir, new SimpleFileVisitor<Path>() {
      @Override
      public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return Files.isHidden(dir) ? FileVisitResult.SKIP_SUBTREE : FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
        if (!Files.isHidden(path)) {
          unusedFiles.add(path);
        }
        return FileVisitResult.CONTINUE;
      }
    });
  }

  JavaFileUpdater createFileUpdater(String filePath) {
    Path file = rootDir.resolve(filePath);
    unusedFiles.remove(file);
    return new JavaFileUpdater(file);
  }

  void deleteOtherFiles() {
    unusedFiles.forEach(new TObjectProcedure<Path>() {
      @Override
      public boolean execute(Path path) {
        try {
          Files.deleteIfExists(path);
        }
        catch (IOException e) {
          throw new RuntimeException(e);
        }
        return true;
      }
    });
  }
}
