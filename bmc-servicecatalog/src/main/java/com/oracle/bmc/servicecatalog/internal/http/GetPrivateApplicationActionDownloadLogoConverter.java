/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.internal.http;

import com.oracle.bmc.servicecatalog.model.*;
import com.oracle.bmc.servicecatalog.requests.*;
import com.oracle.bmc.servicecatalog.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public class GetPrivateApplicationActionDownloadLogoConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    GetPrivateApplicationActionDownloadLogoConverter.class);

    public static com.oracle.bmc.servicecatalog.requests
                    .GetPrivateApplicationActionDownloadLogoRequest
            interceptRequest(
                    com.oracle.bmc.servicecatalog.requests
                                    .GetPrivateApplicationActionDownloadLogoRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.servicecatalog.requests.GetPrivateApplicationActionDownloadLogoRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getPrivateApplicationId(), "privateApplicationId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20210527")
                        .path("privateApplications")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getPrivateApplicationId()))
                        .path("actions")
                        .path("downloadLogo");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept("image/bmp", "image/gif", "image/jpeg", "image/png", "image/tiff");

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.servicecatalog.responses
                            .GetPrivateApplicationActionDownloadLogoResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.servicecatalog.responses
                                .GetPrivateApplicationActionDownloadLogoResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.servicecatalog.responses
                                        .GetPrivateApplicationActionDownloadLogoResponse>() {
                            @Override
                            public com.oracle.bmc.servicecatalog.responses
                                            .GetPrivateApplicationActionDownloadLogoResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.servicecatalog.responses.GetPrivateApplicationActionDownloadLogoResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.io.InputStream>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        java.io.InputStream.class);

                                com.oracle.bmc.http.internal.WithHeaders<java.io.InputStream>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.servicecatalog.responses
                                                .GetPrivateApplicationActionDownloadLogoResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.servicecatalog.responses
                                                        .GetPrivateApplicationActionDownloadLogoResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.inputStream(response.getItem());

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

                                com.oracle.bmc.servicecatalog.responses
                                                .GetPrivateApplicationActionDownloadLogoResponse
                                        responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
