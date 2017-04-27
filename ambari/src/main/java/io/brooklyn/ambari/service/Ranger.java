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

package io.brooklyn.ambari.service;

import org.apache.brooklyn.api.entity.ImplementedBy;
import org.apache.brooklyn.config.ConfigKey;
import org.apache.brooklyn.core.config.ConfigKeys;
import org.apache.brooklyn.util.core.flags.SetFromFlag;

/**
 * Ranger hadoop service
 */
@ImplementedBy(RangerImpl.class)
public interface Ranger extends ExtraService {

    @SetFromFlag("dbUser")
    ConfigKey<String> DB_USER = ConfigKeys.newStringConfigKey(
            "db.user", 
            "MySQL user", 
            "ranger");

    @SetFromFlag("dbPassword")
    ConfigKey<String> DB_PASSWORD = ConfigKeys.newStringConfigKey(
            "db.password", 
            "MySQL user password", 
            "rangerpassword");

    @SetFromFlag("rangerPassword")
    ConfigKey<String> RANGER_PASSWORD = ConfigKeys.newStringConfigKey(
            "ranger.password", 
            "Ranger user password", 
            "rangerpassword");
}
