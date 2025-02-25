/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm;

import com.oracle.bmc.adm.requests.*;
import com.oracle.bmc.adm.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ApplicationDependencyManagement where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ApplicationDependencyManagementPaginators {
    private final ApplicationDependencyManagement client;

    public ApplicationDependencyManagementPaginators(ApplicationDependencyManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listApplicationDependencyVulnerabilities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListApplicationDependencyVulnerabilitiesResponse>
            listApplicationDependencyVulnerabilitiesResponseIterator(
                    final ListApplicationDependencyVulnerabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApplicationDependencyVulnerabilitiesRequest.Builder,
                ListApplicationDependencyVulnerabilitiesRequest,
                ListApplicationDependencyVulnerabilitiesResponse>(
                new com.google.common.base.Supplier<
                        ListApplicationDependencyVulnerabilitiesRequest.Builder>() {
                    @Override
                    public ListApplicationDependencyVulnerabilitiesRequest.Builder get() {
                        return ListApplicationDependencyVulnerabilitiesRequest.builder()
                                .copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListApplicationDependencyVulnerabilitiesResponse, String>() {
                    @Override
                    public String apply(ListApplicationDependencyVulnerabilitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationDependencyVulnerabilitiesRequest.Builder>,
                        ListApplicationDependencyVulnerabilitiesRequest>() {
                    @Override
                    public ListApplicationDependencyVulnerabilitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationDependencyVulnerabilitiesRequest.Builder>
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
                new com.google.common.base.Function<
                        ListApplicationDependencyVulnerabilitiesRequest,
                        ListApplicationDependencyVulnerabilitiesResponse>() {
                    @Override
                    public ListApplicationDependencyVulnerabilitiesResponse apply(
                            ListApplicationDependencyVulnerabilitiesRequest request) {
                        return client.listApplicationDependencyVulnerabilities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilitySummary} objects
     * contained in responses from the listApplicationDependencyVulnerabilities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilitySummary>
            listApplicationDependencyVulnerabilitiesRecordIterator(
                    final ListApplicationDependencyVulnerabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApplicationDependencyVulnerabilitiesRequest.Builder,
                ListApplicationDependencyVulnerabilitiesRequest,
                ListApplicationDependencyVulnerabilitiesResponse,
                com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilitySummary>(
                new com.google.common.base.Supplier<
                        ListApplicationDependencyVulnerabilitiesRequest.Builder>() {
                    @Override
                    public ListApplicationDependencyVulnerabilitiesRequest.Builder get() {
                        return ListApplicationDependencyVulnerabilitiesRequest.builder()
                                .copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListApplicationDependencyVulnerabilitiesResponse, String>() {
                    @Override
                    public String apply(ListApplicationDependencyVulnerabilitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationDependencyVulnerabilitiesRequest.Builder>,
                        ListApplicationDependencyVulnerabilitiesRequest>() {
                    @Override
                    public ListApplicationDependencyVulnerabilitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationDependencyVulnerabilitiesRequest.Builder>
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
                new com.google.common.base.Function<
                        ListApplicationDependencyVulnerabilitiesRequest,
                        ListApplicationDependencyVulnerabilitiesResponse>() {
                    @Override
                    public ListApplicationDependencyVulnerabilitiesResponse apply(
                            ListApplicationDependencyVulnerabilitiesRequest request) {
                        return client.listApplicationDependencyVulnerabilities(request);
                    }
                },
                new com.google.common.base.Function<
                        ListApplicationDependencyVulnerabilitiesResponse,
                        java.util.List<
                                com.oracle.bmc.adm.model
                                        .ApplicationDependencyVulnerabilitySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.adm.model
                                            .ApplicationDependencyVulnerabilitySummary>
                            apply(ListApplicationDependencyVulnerabilitiesResponse response) {
                        return response.getApplicationDependencyVulnerabilityCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listKnowledgeBases operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListKnowledgeBasesResponse> listKnowledgeBasesResponseIterator(
            final ListKnowledgeBasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListKnowledgeBasesRequest.Builder, ListKnowledgeBasesRequest,
                ListKnowledgeBasesResponse>(
                new com.google.common.base.Supplier<ListKnowledgeBasesRequest.Builder>() {
                    @Override
                    public ListKnowledgeBasesRequest.Builder get() {
                        return ListKnowledgeBasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListKnowledgeBasesResponse, String>() {
                    @Override
                    public String apply(ListKnowledgeBasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKnowledgeBasesRequest.Builder>,
                        ListKnowledgeBasesRequest>() {
                    @Override
                    public ListKnowledgeBasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKnowledgeBasesRequest.Builder>
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
                new com.google.common.base.Function<
                        ListKnowledgeBasesRequest, ListKnowledgeBasesResponse>() {
                    @Override
                    public ListKnowledgeBasesResponse apply(ListKnowledgeBasesRequest request) {
                        return client.listKnowledgeBases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.KnowledgeBaseSummary} objects
     * contained in responses from the listKnowledgeBases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.KnowledgeBaseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.KnowledgeBaseSummary> listKnowledgeBasesRecordIterator(
            final ListKnowledgeBasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListKnowledgeBasesRequest.Builder, ListKnowledgeBasesRequest,
                ListKnowledgeBasesResponse, com.oracle.bmc.adm.model.KnowledgeBaseSummary>(
                new com.google.common.base.Supplier<ListKnowledgeBasesRequest.Builder>() {
                    @Override
                    public ListKnowledgeBasesRequest.Builder get() {
                        return ListKnowledgeBasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListKnowledgeBasesResponse, String>() {
                    @Override
                    public String apply(ListKnowledgeBasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKnowledgeBasesRequest.Builder>,
                        ListKnowledgeBasesRequest>() {
                    @Override
                    public ListKnowledgeBasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKnowledgeBasesRequest.Builder>
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
                new com.google.common.base.Function<
                        ListKnowledgeBasesRequest, ListKnowledgeBasesResponse>() {
                    @Override
                    public ListKnowledgeBasesResponse apply(ListKnowledgeBasesRequest request) {
                        return client.listKnowledgeBases(request);
                    }
                },
                new com.google.common.base.Function<
                        ListKnowledgeBasesResponse,
                        java.util.List<com.oracle.bmc.adm.model.KnowledgeBaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.KnowledgeBaseSummary> apply(
                            ListKnowledgeBasesResponse response) {
                        return response.getKnowledgeBaseCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVulnerabilityAudits operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVulnerabilityAuditsResponse> listVulnerabilityAuditsResponseIterator(
            final ListVulnerabilityAuditsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVulnerabilityAuditsRequest.Builder, ListVulnerabilityAuditsRequest,
                ListVulnerabilityAuditsResponse>(
                new com.google.common.base.Supplier<ListVulnerabilityAuditsRequest.Builder>() {
                    @Override
                    public ListVulnerabilityAuditsRequest.Builder get() {
                        return ListVulnerabilityAuditsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVulnerabilityAuditsResponse, String>() {
                    @Override
                    public String apply(ListVulnerabilityAuditsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVulnerabilityAuditsRequest.Builder>,
                        ListVulnerabilityAuditsRequest>() {
                    @Override
                    public ListVulnerabilityAuditsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVulnerabilityAuditsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListVulnerabilityAuditsRequest, ListVulnerabilityAuditsResponse>() {
                    @Override
                    public ListVulnerabilityAuditsResponse apply(
                            ListVulnerabilityAuditsRequest request) {
                        return client.listVulnerabilityAudits(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.VulnerabilityAuditSummary} objects
     * contained in responses from the listVulnerabilityAudits operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.VulnerabilityAuditSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.VulnerabilityAuditSummary>
            listVulnerabilityAuditsRecordIterator(final ListVulnerabilityAuditsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVulnerabilityAuditsRequest.Builder, ListVulnerabilityAuditsRequest,
                ListVulnerabilityAuditsResponse,
                com.oracle.bmc.adm.model.VulnerabilityAuditSummary>(
                new com.google.common.base.Supplier<ListVulnerabilityAuditsRequest.Builder>() {
                    @Override
                    public ListVulnerabilityAuditsRequest.Builder get() {
                        return ListVulnerabilityAuditsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVulnerabilityAuditsResponse, String>() {
                    @Override
                    public String apply(ListVulnerabilityAuditsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVulnerabilityAuditsRequest.Builder>,
                        ListVulnerabilityAuditsRequest>() {
                    @Override
                    public ListVulnerabilityAuditsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVulnerabilityAuditsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListVulnerabilityAuditsRequest, ListVulnerabilityAuditsResponse>() {
                    @Override
                    public ListVulnerabilityAuditsResponse apply(
                            ListVulnerabilityAuditsRequest request) {
                        return client.listVulnerabilityAudits(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVulnerabilityAuditsResponse,
                        java.util.List<com.oracle.bmc.adm.model.VulnerabilityAuditSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.VulnerabilityAuditSummary> apply(
                            ListVulnerabilityAuditsResponse response) {
                        return response.getVulnerabilityAuditCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestErrors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.WorkRequestError> listWorkRequestErrorsRecordIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.adm.model.WorkRequestError>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.adm.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.WorkRequestLogEntry> listWorkRequestLogsRecordIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.adm.model.WorkRequestLogEntry>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.adm.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.WorkRequestLogEntry> apply(
                            ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestsResponse> listWorkRequestsResponseIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.adm.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.adm.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.WorkRequestSummary> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.adm.model.WorkRequestSummary>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                new com.google.common.base.Function<
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.adm.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.adm.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}
