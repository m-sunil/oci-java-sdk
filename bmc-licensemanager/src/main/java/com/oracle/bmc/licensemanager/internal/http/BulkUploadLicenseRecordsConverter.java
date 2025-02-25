/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.licensemanager.model.*;
import com.oracle.bmc.licensemanager.requests.*;
import com.oracle.bmc.licensemanager.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
public class BulkUploadLicenseRecordsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BulkUploadLicenseRecordsConverter.class);

    public static com.oracle.bmc.licensemanager.requests.BulkUploadLicenseRecordsRequest
            interceptRequest(
                    com.oracle.bmc.licensemanager.requests.BulkUploadLicenseRecordsRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.licensemanager.requests.BulkUploadLicenseRecordsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(
                request.getBulkUploadLicenseRecordsDetails(),
                "bulkUploadLicenseRecordsDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20220430")
                        .path("licenses")
                        .path("actions")
                        .path("bulkUpload");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

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
                    com.oracle.bmc.licensemanager.responses.BulkUploadLicenseRecordsResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.licensemanager.responses.BulkUploadLicenseRecordsResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.licensemanager.responses
                                        .BulkUploadLicenseRecordsResponse>() {
                            @Override
                            public com.oracle.bmc.licensemanager.responses
                                            .BulkUploadLicenseRecordsResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.licensemanager.responses.BulkUploadLicenseRecordsResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.licensemanager.model
                                                                .BulkUploadResponse>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        com.oracle.bmc.licensemanager.model
                                                                        .BulkUploadResponse
                                                                .class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.licensemanager.model
                                                        .BulkUploadResponse>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.licensemanager.responses
                                                .BulkUploadLicenseRecordsResponse.Builder
                                        builder =
                                                com.oracle.bmc.licensemanager.responses
                                                        .BulkUploadLicenseRecordsResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.bulkUploadResponse(response.getItem());

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

                                com.oracle.bmc.licensemanager.responses
                                                .BulkUploadLicenseRecordsResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
