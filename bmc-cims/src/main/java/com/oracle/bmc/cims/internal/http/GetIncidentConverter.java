/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.cims.model.*;
import com.oracle.bmc.cims.requests.*;
import com.oracle.bmc.cims.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public class GetIncidentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetIncidentConverter.class);

    public static com.oracle.bmc.cims.requests.GetIncidentRequest interceptRequest(
            com.oracle.bmc.cims.requests.GetIncidentRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.cims.requests.GetIncidentRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getIncidentKey(), "incidentKey must not be blank");
        Validate.notNull(request.getCsi(), "csi is required");
        Validate.notNull(request.getOcid(), "ocid is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20181231")
                        .path("v2")
                        .path("incidents")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getIncidentKey()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        ib.header("csi", request.getCsi());

        ib.header("ocid", request.getOcid());

        if (request.getHomeregion() != null) {
            ib.header("homeregion", request.getHomeregion());
        }

        if (request.getProblemType() != null) {
            ib.header("problem-type", request.getProblemType());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, com.oracle.bmc.cims.responses.GetIncidentResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.cims.responses.GetIncidentResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.cims.responses.GetIncidentResponse>() {
                            @Override
                            public com.oracle.bmc.cims.responses.GetIncidentResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.cims.responses.GetIncidentResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.cims.model.Incident>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        com.oracle.bmc.cims.model.Incident.class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.cims.model.Incident>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.cims.responses.GetIncidentResponse.Builder builder =
                                        com.oracle.bmc.cims.responses.GetIncidentResponse.builder()
                                                .__httpStatusCode__(rawResponse.getStatus());

                                builder.incident(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.cims.responses.GetIncidentResponse responseWrapper =
                                        builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
