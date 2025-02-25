/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover;

import com.oracle.bmc.rover.requests.*;
import com.oracle.bmc.rover.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Shape where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to as ResponseIterators, and the methods are suffixed with ResponseIterator. For example: <i>listUsersResponseIterator</i></li>
 *   <li>Iterating over the resources/records being listed. These are referred to as RecordIterators, and the methods are suffixed with RecordIterator. For example: <i>listUsersRecordIterator</i></li>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping and using the page tokens.
 * They will automatically fetch more data from the service when required.
 *
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public class ShapePaginators {
    private final Shape client;

    public ShapePaginators(Shape client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListShapesResponse> listShapesResponseIterator(
            final ListShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListShapesRequest.Builder, ListShapesRequest, ListShapesResponse>(
                new com.google.common.base.Supplier<ListShapesRequest.Builder>() {
                    @Override
                    public ListShapesRequest.Builder get() {
                        return ListShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListShapesResponse, String>() {
                    @Override
                    public String apply(ListShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListShapesRequest.Builder>,
                        ListShapesRequest>() {
                    @Override
                    public ListShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListShapesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListShapesRequest, ListShapesResponse>() {
                    @Override
                    public ListShapesResponse apply(ListShapesRequest request) {
                        return client.listShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.rover.model.ShapeSummary} objects
     * contained in responses from the listShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.rover.model.ShapeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.rover.model.ShapeSummary> listShapesRecordIterator(
            final ListShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListShapesRequest.Builder, ListShapesRequest, ListShapesResponse,
                com.oracle.bmc.rover.model.ShapeSummary>(
                new com.google.common.base.Supplier<ListShapesRequest.Builder>() {
                    @Override
                    public ListShapesRequest.Builder get() {
                        return ListShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListShapesResponse, String>() {
                    @Override
                    public String apply(ListShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListShapesRequest.Builder>,
                        ListShapesRequest>() {
                    @Override
                    public ListShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListShapesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListShapesRequest, ListShapesResponse>() {
                    @Override
                    public ListShapesResponse apply(ListShapesRequest request) {
                        return client.listShapes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListShapesResponse,
                        java.util.List<com.oracle.bmc.rover.model.ShapeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.rover.model.ShapeSummary> apply(
                            ListShapesResponse response) {
                        return response.getShapeCollection().getItems();
                    }
                });
    }
}
