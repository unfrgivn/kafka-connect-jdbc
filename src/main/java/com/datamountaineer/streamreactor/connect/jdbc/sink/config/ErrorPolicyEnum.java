/**
 * Copyright 2015 Datamountaineer.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package com.datamountaineer.streamreactor.connect.jdbc.sink.config;

/**
 * Specifies the approach taken when an error occurs while the data is inserted.
 */
public enum ErrorPolicyEnum {
  /**
   * The exception is swallowed.
   */
  NOOP("noop"),
  /**
   * The exception is propagate up the stack by rethrowing it.
   */
  THROW("throw"),

  /**
   * The exception causes the Connect framework to retry the message
   * */
  RETRY("retry");

  private final String value;

  ErrorPolicyEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}
