/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.openwire.codec.universal;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.activemq.openwire.codec.*;
import org.apache.activemq.openwire.commands.*;

/**
 * Marshalling code for Open Wire for MessageId
 *
 * NOTE!: This file is auto generated - do not modify!
 *
 */
public class MessageIdMarshaller extends BaseDataStreamMarshaller {

    /**
     * Return the type of Data Structure handled by this Marshaler
     *
     * @return short representation of the type data structure
     */
    public byte getDataStructureType() {
        return MessageId.DATA_STRUCTURE_TYPE;
    }
    
    /**
     * @return a new instance of the managed type.
     */
    public DataStructure createObject() {
        return new MessageId();
    }

    /**
     * Un-marshal an object instance from the data input stream
     *
     * @param wireFormat the OpenWireFormat instance to use
     * @param target the object to un-marshal
     * @param dataIn the data input stream to build the object from
     * @param bs the boolean stream where the type's booleans were marshaled
     *
     * @throws IOException if an error occurs while reading the data
     */
    public void tightUnmarshal(OpenWireFormat wireFormat, Object target, DataInput dataIn, BooleanStream bs) throws IOException {
        super.tightUnmarshal(wireFormat, target, dataIn, bs);

        MessageId info = (MessageId) target;
        int version = wireFormat.getVersion();

        if (version >= 10) {
            info.setTextView(tightUnmarshalString(dataIn, bs));
        }
        info.setProducerId((ProducerId) tightUnmarsalCachedObject(wireFormat, dataIn, bs));
        info.setProducerSequenceId(tightUnmarshalLong(wireFormat, dataIn, bs));
        info.setBrokerSequenceId(tightUnmarshalLong(wireFormat, dataIn, bs));
    }

    /**
     * Write the booleans that this object uses to a BooleanStream
     *
     * @param wireFormat the OpenWireFormat instance to use
     * @param source the object to marshal
     * @param bs the boolean stream where the type's booleans are written
     *
     * @throws IOException if an error occurs while writing the data
     */
    public int tightMarshal1(OpenWireFormat wireFormat, Object source, BooleanStream bs) throws IOException {
        MessageId info = (MessageId) source;
        int version = wireFormat.getVersion();

        int rc = super.tightMarshal1(wireFormat, source, bs);
        if (version >= 10) {
            rc += tightMarshalString1(info.getTextView(), bs);
        }
        rc += tightMarshalCachedObject1(wireFormat, (DataStructure)info.getProducerId(), bs);
        rc += tightMarshalLong1(wireFormat, info.getProducerSequenceId(), bs);
        rc += tightMarshalLong1(wireFormat, info.getBrokerSequenceId(), bs);

        return rc + 0;
    }

    /**
     * Write a object instance to data output stream
     *
     * @param wireFormat the OpenWireFormat instance to use
     * @param source the object to marshal
     * @param dataOut the DataOut where the properties are written
     * @param bs the boolean stream where the type's booleans are written
     *
     * @throws IOException if an error occurs while writing the data
     */
    public void tightMarshal2(OpenWireFormat wireFormat, Object source, DataOutput dataOut, BooleanStream bs) throws IOException {
        super.tightMarshal2(wireFormat, source, dataOut, bs);

        MessageId info = (MessageId) source;
        int version = wireFormat.getVersion();

        if (version >= 10) {
            tightMarshalString2(info.getTextView(), dataOut, bs);
        }
        tightMarshalCachedObject2(wireFormat, (DataStructure)info.getProducerId(), dataOut, bs);
        tightMarshalLong2(wireFormat, info.getProducerSequenceId(), dataOut, bs);
        tightMarshalLong2(wireFormat, info.getBrokerSequenceId(), dataOut, bs);
    }

    /**
     * Write the object to the output using loose marshaling.
     *
     * @throws IOException if an error occurs while writing the data
     */
    public void looseMarshal(OpenWireFormat wireFormat, Object source, DataOutput dataOut) throws IOException {
        MessageId info = (MessageId) source;
        int version = wireFormat.getVersion();

        super.looseMarshal(wireFormat, source, dataOut);
        if (version >= 10) {
            looseMarshalString(info.getTextView(), dataOut);
        }
        looseMarshalCachedObject(wireFormat, (DataStructure)info.getProducerId(), dataOut);
        looseMarshalLong(wireFormat, info.getProducerSequenceId(), dataOut);
        looseMarshalLong(wireFormat, info.getBrokerSequenceId(), dataOut);
    }

    /**
     * Un-marshal an object instance from the data input stream
     *
     * @param target the object to un-marshal
     * @param dataIn the data input stream to build the object from
     *
     * @throws IOException if an error occurs while writing the data
     */
    public void looseUnmarshal(OpenWireFormat wireFormat, Object target, DataInput dataIn) throws IOException {
        super.looseUnmarshal(wireFormat, target, dataIn);

        MessageId info = (MessageId) target;
        int version = wireFormat.getVersion();

        if (version >= 10) {
            info.setTextView(looseUnmarshalString(dataIn));
        }
        info.setProducerId((ProducerId) looseUnmarsalCachedObject(wireFormat, dataIn));
        info.setProducerSequenceId(looseUnmarshalLong(wireFormat, dataIn));
        info.setBrokerSequenceId(looseUnmarshalLong(wireFormat, dataIn));
    }
}
