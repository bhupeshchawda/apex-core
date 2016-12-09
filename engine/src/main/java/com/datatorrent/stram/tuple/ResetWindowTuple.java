/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.datatorrent.stram.tuple;

import org.apache.apex.api.MessageType;

/**
 *
 * ResetWindow ids<p>
 * <br>
 *
 * @since 0.3.2
 */
public class ResetWindowTuple extends Tuple
{
  public ResetWindowTuple(long windowId)
  {
    super(MessageType.RESET_WINDOW, windowId);
  }

  @Override
  public final long getWindowId()
  {
    return super.windowId & 0xffffffff00000000L;
  }

  public final int getIntervalMillis()
  {
    return (int)super.windowId;
  }

}
