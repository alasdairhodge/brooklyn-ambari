/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.brooklyn.ambari;

import org.apache.brooklyn.api.sensor.AttributeSensor;
import org.apache.brooklyn.config.ConfigKey;
import org.apache.brooklyn.core.config.ConfigKeys;
import org.apache.brooklyn.core.entity.Attributes;

import com.google.common.reflect.TypeToken;

public class AmbariConfigAndSensors {
    private AmbariConfigAndSensors() {}

    /**
     * Sets the sensor to use to configure addresses in machines' /etc/hosts file.
     */
    @SuppressWarnings("serial")
    public static final ConfigKey<AttributeSensor<String>> ETC_HOST_ADDRESS = ConfigKeys.newConfigKey(
            new TypeToken<AttributeSensor<String>>() {},
            "entity.hostAddressSensor", "The sensor to use to obtain addresses for each machine's host file",
            Attributes.SUBNET_ADDRESS);
}
