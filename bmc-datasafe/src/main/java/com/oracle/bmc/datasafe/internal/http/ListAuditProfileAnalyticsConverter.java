/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.datasafe.model.*;
import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListAuditProfileAnalyticsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListAuditProfileAnalyticsConverter.class);

    public static com.oracle.bmc.datasafe.requests.ListAuditProfileAnalyticsRequest
            interceptRequest(
                    com.oracle.bmc.datasafe.requests.ListAuditProfileAnalyticsRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.datasafe.requests.ListAuditProfileAnalyticsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20181201").path("auditProfileAnalytics");

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

        if (request.getCompartmentIdInSubtree() != null) {
            target =
                    target.queryParam(
                            "compartmentIdInSubtree",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getCompartmentIdInSubtree()));
        }

        if (request.getAccessLevel() != null) {
            target =
                    target.queryParam(
                            "accessLevel",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getAccessLevel().getValue()));
        }

        if (request.getLimit() != null) {
            target =
                    target.queryParam(
                            "limit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLimit()));
        }

        if (request.getPage() != null) {
            target =
                    target.queryParam(
                            "page",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPage()));
        }

        if (request.getGroupBy() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "groupBy",
                            request.getGroupBy(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

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
                    com.oracle.bmc.datasafe.responses.ListAuditProfileAnalyticsResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.datasafe.responses.ListAuditProfileAnalyticsResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.datasafe.responses
                                        .ListAuditProfileAnalyticsResponse>() {
                            @Override
                            public com.oracle.bmc.datasafe.responses
                                            .ListAuditProfileAnalyticsResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.datasafe.responses.ListAuditProfileAnalyticsResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.datasafe.model
                                                                .AuditProfileAnalyticCollection>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        com.oracle.bmc.datasafe.model
                                                                        .AuditProfileAnalyticCollection
                                                                .class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.datasafe.model
                                                        .AuditProfileAnalyticCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.datasafe.responses.ListAuditProfileAnalyticsResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.datasafe.responses
                                                        .ListAuditProfileAnalyticsResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.auditProfileAnalyticCollection(response.getItem());

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

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcNextPageHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-next-page");
                                if (opcNextPageHeader.isPresent()) {
                                    builder.opcNextPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-next-page",
                                                    opcNextPageHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcPrevPageHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-prev-page");
                                if (opcPrevPageHeader.isPresent()) {
                                    builder.opcPrevPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-prev-page",
                                                    opcPrevPageHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.datasafe.responses.ListAuditProfileAnalyticsResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
