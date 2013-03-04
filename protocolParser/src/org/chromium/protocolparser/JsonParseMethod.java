// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolparser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Annotates 'parse' method in user-provided 'root' interface
 * (see {@link JsonParserRoot}). 'Parse' method is the only user access to a JSON parser.
 * <p>
 * 'Parse' method must conform following requirements:
 * <ul>
 * <li>return one of {@link JsonType}-annotated types supported by parser,
 * </ul>
 * Method name is unspecified.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface JsonParseMethod {
}
