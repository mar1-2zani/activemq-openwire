/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.openwire.commands;

import org.apache.activemq.openwire.annotations.OpenWireType;
import org.apache.activemq.openwire.annotations.OpenWireProperty;

/**
 * @openwire:marshaller code="34"
 */
@OpenWireType(typeCode = 34)
public class IntegerResponse extends Response {

    public static final byte DATA_STRUCTURE_TYPE = CommandTypes.INTEGER_RESPONSE;

    @OpenWireProperty(version = 1, sequence = 1)
    int result;

    public IntegerResponse() {
    }

    public IntegerResponse(int result) {
        this.result = result;
    }

    @Override
    public byte getDataStructureType() {
        return DATA_STRUCTURE_TYPE;
    }

    /**
     * @openwire:property version=1
     */
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
