// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.wip;

import org.chromium.sdk.util.GenericCallback;
import org.chromium.wip.protocol.input.page.FrameNavigatedEventData;
import org.chromium.wip.protocol.input.page.FrameValue;
import org.chromium.wip.protocol.input.page.GetResourceTreeData;
import org.chromium.wip.protocol.output.page.GetResourceTree;

/**
 * Collects information about frame tree. At first class only watches for the url of root frame.
 */
class WipFrameManager {
  private final WipTabImpl tabImpl;
  private boolean urlUnknown = true;

  WipFrameManager(WipTabImpl tabImpl) {
    this.tabImpl = tabImpl;
  }

  void readFrames() {
    GenericCallback<GetResourceTreeData> callback =
        new GenericCallback<GetResourceTreeData>() {
          @Override
          public void success(GetResourceTreeData value) {
            FrameValue frame = value.frameTree().frame();
            if (frame.parentId() != null) {
              throw new RuntimeException("Unexpected parentId value");
            }
            String url = frame.url();
            boolean silentUpdate = urlUnknown;
            tabImpl.updateUrl(url, silentUpdate);
            urlUnknown = false;
          }

          @Override public void failure(Exception exception) {
            throw new RuntimeException("Failed to read frame data", exception);
          }
        };

    tabImpl.getCommandProcessor().send(new GetResourceTree(), callback, null);
  }

  void frameNavigated(FrameNavigatedEventData eventData) {
    FrameValue frame = eventData.frame();
    String parentId = frame.parentId();
    if (parentId == null) {
      String newUrl = frame.url();
      tabImpl.updateUrl(newUrl, false);
      urlUnknown = false;
    }
  }
}
