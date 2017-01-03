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
package com.datatorrent.stram.engine;

import com.datatorrent.api.ControlSink;
import com.datatorrent.stram.tuple.CustomControlTuple;

/**
 * A default implementation for {@link ControlSink}
 */
public abstract class DefaultControlSink<T> implements ControlSink<T>
{
  private boolean propogateControlTuples = true; // default

  /**
   * {@inheritDoc}
   */
  @Override
  public void putControl(Object payload)
  {
    put((T)new CustomControlTuple(payload));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isPropogateControlTuples()
  {
    return propogateControlTuples;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setPropogateControlTuples(boolean propogate)
  {
    this.propogateControlTuples = propogate;
  }

}
