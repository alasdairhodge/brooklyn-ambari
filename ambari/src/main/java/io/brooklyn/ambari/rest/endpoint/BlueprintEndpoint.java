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

package io.brooklyn.ambari.rest.endpoint;

import java.util.Map;

import io.brooklyn.ambari.rest.domain.Blueprint;
import io.brooklyn.ambari.rest.domain.Blueprints;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface BlueprintEndpoint {

    @GET("/api/v1/blueprints")
    Blueprints getBlueprints();

    @GET("/api/v1/blueprints/{blueprint}")
    Blueprint getBlueprint(@Path("blueprint") String blueprint);

    @POST("/api/v1/blueprints/{blueprint}")
    Response createBlueprint(@Path("blueprint") String blueprint, @Body Map body);
}
