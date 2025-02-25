/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DataSafe where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class DataSafePaginators {
    private final DataSafe client;

    public DataSafePaginators(DataSafe client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAlertAnalytics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAlertAnalyticsResponse> listAlertAnalyticsResponseIterator(
            final ListAlertAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlertAnalyticsRequest.Builder, ListAlertAnalyticsRequest,
                ListAlertAnalyticsResponse>(
                new com.google.common.base.Supplier<ListAlertAnalyticsRequest.Builder>() {
                    @Override
                    public ListAlertAnalyticsRequest.Builder get() {
                        return ListAlertAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAlertAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAlertAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertAnalyticsRequest.Builder>,
                        ListAlertAnalyticsRequest>() {
                    @Override
                    public ListAlertAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertAnalyticsRequest.Builder>
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
                        ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>() {
                    @Override
                    public ListAlertAnalyticsResponse apply(ListAlertAnalyticsRequest request) {
                        return client.listAlertAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AlertAggregationItems} objects
     * contained in responses from the listAlertAnalytics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AlertAggregationItems} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AlertAggregationItems>
            listAlertAnalyticsRecordIterator(final ListAlertAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlertAnalyticsRequest.Builder, ListAlertAnalyticsRequest,
                ListAlertAnalyticsResponse, com.oracle.bmc.datasafe.model.AlertAggregationItems>(
                new com.google.common.base.Supplier<ListAlertAnalyticsRequest.Builder>() {
                    @Override
                    public ListAlertAnalyticsRequest.Builder get() {
                        return ListAlertAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAlertAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAlertAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertAnalyticsRequest.Builder>,
                        ListAlertAnalyticsRequest>() {
                    @Override
                    public ListAlertAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertAnalyticsRequest.Builder>
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
                        ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>() {
                    @Override
                    public ListAlertAnalyticsResponse apply(ListAlertAnalyticsRequest request) {
                        return client.listAlertAnalytics(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAlertAnalyticsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AlertAggregationItems>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AlertAggregationItems>
                            apply(ListAlertAnalyticsResponse response) {
                        return response.getAlertAnalyticsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAlertPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAlertPoliciesResponse> listAlertPoliciesResponseIterator(
            final ListAlertPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlertPoliciesRequest.Builder, ListAlertPoliciesRequest,
                ListAlertPoliciesResponse>(
                new com.google.common.base.Supplier<ListAlertPoliciesRequest.Builder>() {
                    @Override
                    public ListAlertPoliciesRequest.Builder get() {
                        return ListAlertPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAlertPoliciesResponse, String>() {
                    @Override
                    public String apply(ListAlertPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertPoliciesRequest.Builder>,
                        ListAlertPoliciesRequest>() {
                    @Override
                    public ListAlertPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertPoliciesRequest.Builder>
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
                        ListAlertPoliciesRequest, ListAlertPoliciesResponse>() {
                    @Override
                    public ListAlertPoliciesResponse apply(ListAlertPoliciesRequest request) {
                        return client.listAlertPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AlertPolicySummary} objects
     * contained in responses from the listAlertPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AlertPolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AlertPolicySummary>
            listAlertPoliciesRecordIterator(final ListAlertPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlertPoliciesRequest.Builder, ListAlertPoliciesRequest,
                ListAlertPoliciesResponse, com.oracle.bmc.datasafe.model.AlertPolicySummary>(
                new com.google.common.base.Supplier<ListAlertPoliciesRequest.Builder>() {
                    @Override
                    public ListAlertPoliciesRequest.Builder get() {
                        return ListAlertPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAlertPoliciesResponse, String>() {
                    @Override
                    public String apply(ListAlertPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertPoliciesRequest.Builder>,
                        ListAlertPoliciesRequest>() {
                    @Override
                    public ListAlertPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertPoliciesRequest.Builder>
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
                        ListAlertPoliciesRequest, ListAlertPoliciesResponse>() {
                    @Override
                    public ListAlertPoliciesResponse apply(ListAlertPoliciesRequest request) {
                        return client.listAlertPolicies(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAlertPoliciesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AlertPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AlertPolicySummary> apply(
                            ListAlertPoliciesResponse response) {
                        return response.getAlertPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAlertPolicyRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAlertPolicyRulesResponse> listAlertPolicyRulesResponseIterator(
            final ListAlertPolicyRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlertPolicyRulesRequest.Builder, ListAlertPolicyRulesRequest,
                ListAlertPolicyRulesResponse>(
                new com.google.common.base.Supplier<ListAlertPolicyRulesRequest.Builder>() {
                    @Override
                    public ListAlertPolicyRulesRequest.Builder get() {
                        return ListAlertPolicyRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAlertPolicyRulesResponse, String>() {
                    @Override
                    public String apply(ListAlertPolicyRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertPolicyRulesRequest.Builder>,
                        ListAlertPolicyRulesRequest>() {
                    @Override
                    public ListAlertPolicyRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertPolicyRulesRequest.Builder>
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
                        ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>() {
                    @Override
                    public ListAlertPolicyRulesResponse apply(ListAlertPolicyRulesRequest request) {
                        return client.listAlertPolicyRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AlertPolicyRuleSummary} objects
     * contained in responses from the listAlertPolicyRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AlertPolicyRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AlertPolicyRuleSummary>
            listAlertPolicyRulesRecordIterator(final ListAlertPolicyRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlertPolicyRulesRequest.Builder, ListAlertPolicyRulesRequest,
                ListAlertPolicyRulesResponse, com.oracle.bmc.datasafe.model.AlertPolicyRuleSummary>(
                new com.google.common.base.Supplier<ListAlertPolicyRulesRequest.Builder>() {
                    @Override
                    public ListAlertPolicyRulesRequest.Builder get() {
                        return ListAlertPolicyRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAlertPolicyRulesResponse, String>() {
                    @Override
                    public String apply(ListAlertPolicyRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertPolicyRulesRequest.Builder>,
                        ListAlertPolicyRulesRequest>() {
                    @Override
                    public ListAlertPolicyRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertPolicyRulesRequest.Builder>
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
                        ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>() {
                    @Override
                    public ListAlertPolicyRulesResponse apply(ListAlertPolicyRulesRequest request) {
                        return client.listAlertPolicyRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAlertPolicyRulesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AlertPolicyRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AlertPolicyRuleSummary>
                            apply(ListAlertPolicyRulesResponse response) {
                        return response.getAlertPolicyRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAlerts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAlertsResponse> listAlertsResponseIterator(
            final ListAlertsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAlertsRequest.Builder, ListAlertsRequest, ListAlertsResponse>(
                new com.google.common.base.Supplier<ListAlertsRequest.Builder>() {
                    @Override
                    public ListAlertsRequest.Builder get() {
                        return ListAlertsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAlertsResponse, String>() {
                    @Override
                    public String apply(ListAlertsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertsRequest.Builder>,
                        ListAlertsRequest>() {
                    @Override
                    public ListAlertsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertsRequest.Builder>
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
                new com.google.common.base.Function<ListAlertsRequest, ListAlertsResponse>() {
                    @Override
                    public ListAlertsResponse apply(ListAlertsRequest request) {
                        return client.listAlerts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AlertSummary} objects
     * contained in responses from the listAlerts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AlertSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AlertSummary> listAlertsRecordIterator(
            final ListAlertsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAlertsRequest.Builder, ListAlertsRequest, ListAlertsResponse,
                com.oracle.bmc.datasafe.model.AlertSummary>(
                new com.google.common.base.Supplier<ListAlertsRequest.Builder>() {
                    @Override
                    public ListAlertsRequest.Builder get() {
                        return ListAlertsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAlertsResponse, String>() {
                    @Override
                    public String apply(ListAlertsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAlertsRequest.Builder>,
                        ListAlertsRequest>() {
                    @Override
                    public ListAlertsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAlertsRequest.Builder>
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
                new com.google.common.base.Function<ListAlertsRequest, ListAlertsResponse>() {
                    @Override
                    public ListAlertsResponse apply(ListAlertsRequest request) {
                        return client.listAlerts(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAlertsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AlertSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AlertSummary> apply(
                            ListAlertsResponse response) {
                        return response.getAlertCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAuditArchiveRetrievals operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAuditArchiveRetrievalsResponse> listAuditArchiveRetrievalsResponseIterator(
            final ListAuditArchiveRetrievalsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditArchiveRetrievalsRequest.Builder, ListAuditArchiveRetrievalsRequest,
                ListAuditArchiveRetrievalsResponse>(
                new com.google.common.base.Supplier<ListAuditArchiveRetrievalsRequest.Builder>() {
                    @Override
                    public ListAuditArchiveRetrievalsRequest.Builder get() {
                        return ListAuditArchiveRetrievalsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditArchiveRetrievalsResponse, String>() {
                    @Override
                    public String apply(ListAuditArchiveRetrievalsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditArchiveRetrievalsRequest.Builder>,
                        ListAuditArchiveRetrievalsRequest>() {
                    @Override
                    public ListAuditArchiveRetrievalsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditArchiveRetrievalsRequest.Builder>
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
                        ListAuditArchiveRetrievalsRequest, ListAuditArchiveRetrievalsResponse>() {
                    @Override
                    public ListAuditArchiveRetrievalsResponse apply(
                            ListAuditArchiveRetrievalsRequest request) {
                        return client.listAuditArchiveRetrievals(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AuditArchiveRetrievalSummary} objects
     * contained in responses from the listAuditArchiveRetrievals operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AuditArchiveRetrievalSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditArchiveRetrievalSummary>
            listAuditArchiveRetrievalsRecordIterator(
                    final ListAuditArchiveRetrievalsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditArchiveRetrievalsRequest.Builder, ListAuditArchiveRetrievalsRequest,
                ListAuditArchiveRetrievalsResponse,
                com.oracle.bmc.datasafe.model.AuditArchiveRetrievalSummary>(
                new com.google.common.base.Supplier<ListAuditArchiveRetrievalsRequest.Builder>() {
                    @Override
                    public ListAuditArchiveRetrievalsRequest.Builder get() {
                        return ListAuditArchiveRetrievalsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditArchiveRetrievalsResponse, String>() {
                    @Override
                    public String apply(ListAuditArchiveRetrievalsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditArchiveRetrievalsRequest.Builder>,
                        ListAuditArchiveRetrievalsRequest>() {
                    @Override
                    public ListAuditArchiveRetrievalsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditArchiveRetrievalsRequest.Builder>
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
                        ListAuditArchiveRetrievalsRequest, ListAuditArchiveRetrievalsResponse>() {
                    @Override
                    public ListAuditArchiveRetrievalsResponse apply(
                            ListAuditArchiveRetrievalsRequest request) {
                        return client.listAuditArchiveRetrievals(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAuditArchiveRetrievalsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.AuditArchiveRetrievalSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.AuditArchiveRetrievalSummary>
                            apply(ListAuditArchiveRetrievalsResponse response) {
                        return response.getAuditArchiveRetrievalCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAuditEventAnalytics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAuditEventAnalyticsResponse> listAuditEventAnalyticsResponseIterator(
            final ListAuditEventAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditEventAnalyticsRequest.Builder, ListAuditEventAnalyticsRequest,
                ListAuditEventAnalyticsResponse>(
                new com.google.common.base.Supplier<ListAuditEventAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditEventAnalyticsRequest.Builder get() {
                        return ListAuditEventAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditEventAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditEventAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditEventAnalyticsRequest.Builder>,
                        ListAuditEventAnalyticsRequest>() {
                    @Override
                    public ListAuditEventAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditEventAnalyticsRequest.Builder>
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
                        ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>() {
                    @Override
                    public ListAuditEventAnalyticsResponse apply(
                            ListAuditEventAnalyticsRequest request) {
                        return client.listAuditEventAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AuditEventAggregationItems} objects
     * contained in responses from the listAuditEventAnalytics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AuditEventAggregationItems} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditEventAggregationItems>
            listAuditEventAnalyticsRecordIterator(final ListAuditEventAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditEventAnalyticsRequest.Builder, ListAuditEventAnalyticsRequest,
                ListAuditEventAnalyticsResponse,
                com.oracle.bmc.datasafe.model.AuditEventAggregationItems>(
                new com.google.common.base.Supplier<ListAuditEventAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditEventAnalyticsRequest.Builder get() {
                        return ListAuditEventAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditEventAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditEventAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditEventAnalyticsRequest.Builder>,
                        ListAuditEventAnalyticsRequest>() {
                    @Override
                    public ListAuditEventAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditEventAnalyticsRequest.Builder>
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
                        ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>() {
                    @Override
                    public ListAuditEventAnalyticsResponse apply(
                            ListAuditEventAnalyticsRequest request) {
                        return client.listAuditEventAnalytics(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAuditEventAnalyticsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.AuditEventAggregationItems>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditEventAggregationItems>
                            apply(ListAuditEventAnalyticsResponse response) {
                        return response.getAuditEventAnalyticsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAuditEvents operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAuditEventsResponse> listAuditEventsResponseIterator(
            final ListAuditEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditEventsRequest.Builder, ListAuditEventsRequest, ListAuditEventsResponse>(
                new com.google.common.base.Supplier<ListAuditEventsRequest.Builder>() {
                    @Override
                    public ListAuditEventsRequest.Builder get() {
                        return ListAuditEventsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditEventsResponse, String>() {
                    @Override
                    public String apply(ListAuditEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditEventsRequest.Builder>,
                        ListAuditEventsRequest>() {
                    @Override
                    public ListAuditEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditEventsRequest.Builder>
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
                        ListAuditEventsRequest, ListAuditEventsResponse>() {
                    @Override
                    public ListAuditEventsResponse apply(ListAuditEventsRequest request) {
                        return client.listAuditEvents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AuditEventSummary} objects
     * contained in responses from the listAuditEvents operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AuditEventSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditEventSummary> listAuditEventsRecordIterator(
            final ListAuditEventsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditEventsRequest.Builder, ListAuditEventsRequest, ListAuditEventsResponse,
                com.oracle.bmc.datasafe.model.AuditEventSummary>(
                new com.google.common.base.Supplier<ListAuditEventsRequest.Builder>() {
                    @Override
                    public ListAuditEventsRequest.Builder get() {
                        return ListAuditEventsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditEventsResponse, String>() {
                    @Override
                    public String apply(ListAuditEventsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditEventsRequest.Builder>,
                        ListAuditEventsRequest>() {
                    @Override
                    public ListAuditEventsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditEventsRequest.Builder>
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
                        ListAuditEventsRequest, ListAuditEventsResponse>() {
                    @Override
                    public ListAuditEventsResponse apply(ListAuditEventsRequest request) {
                        return client.listAuditEvents(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAuditEventsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AuditEventSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditEventSummary> apply(
                            ListAuditEventsResponse response) {
                        return response.getAuditEventCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAuditPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAuditPoliciesResponse> listAuditPoliciesResponseIterator(
            final ListAuditPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditPoliciesRequest.Builder, ListAuditPoliciesRequest,
                ListAuditPoliciesResponse>(
                new com.google.common.base.Supplier<ListAuditPoliciesRequest.Builder>() {
                    @Override
                    public ListAuditPoliciesRequest.Builder get() {
                        return ListAuditPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditPoliciesResponse, String>() {
                    @Override
                    public String apply(ListAuditPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditPoliciesRequest.Builder>,
                        ListAuditPoliciesRequest>() {
                    @Override
                    public ListAuditPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditPoliciesRequest.Builder>
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
                        ListAuditPoliciesRequest, ListAuditPoliciesResponse>() {
                    @Override
                    public ListAuditPoliciesResponse apply(ListAuditPoliciesRequest request) {
                        return client.listAuditPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AuditPolicySummary} objects
     * contained in responses from the listAuditPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AuditPolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditPolicySummary>
            listAuditPoliciesRecordIterator(final ListAuditPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditPoliciesRequest.Builder, ListAuditPoliciesRequest,
                ListAuditPoliciesResponse, com.oracle.bmc.datasafe.model.AuditPolicySummary>(
                new com.google.common.base.Supplier<ListAuditPoliciesRequest.Builder>() {
                    @Override
                    public ListAuditPoliciesRequest.Builder get() {
                        return ListAuditPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditPoliciesResponse, String>() {
                    @Override
                    public String apply(ListAuditPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditPoliciesRequest.Builder>,
                        ListAuditPoliciesRequest>() {
                    @Override
                    public ListAuditPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditPoliciesRequest.Builder>
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
                        ListAuditPoliciesRequest, ListAuditPoliciesResponse>() {
                    @Override
                    public ListAuditPoliciesResponse apply(ListAuditPoliciesRequest request) {
                        return client.listAuditPolicies(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAuditPoliciesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AuditPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditPolicySummary> apply(
                            ListAuditPoliciesResponse response) {
                        return response.getAuditPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAuditProfileAnalytics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAuditProfileAnalyticsResponse> listAuditProfileAnalyticsResponseIterator(
            final ListAuditProfileAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditProfileAnalyticsRequest.Builder, ListAuditProfileAnalyticsRequest,
                ListAuditProfileAnalyticsResponse>(
                new com.google.common.base.Supplier<ListAuditProfileAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditProfileAnalyticsRequest.Builder get() {
                        return ListAuditProfileAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditProfileAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditProfileAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditProfileAnalyticsRequest.Builder>,
                        ListAuditProfileAnalyticsRequest>() {
                    @Override
                    public ListAuditProfileAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditProfileAnalyticsRequest.Builder>
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
                        ListAuditProfileAnalyticsRequest, ListAuditProfileAnalyticsResponse>() {
                    @Override
                    public ListAuditProfileAnalyticsResponse apply(
                            ListAuditProfileAnalyticsRequest request) {
                        return client.listAuditProfileAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AuditProfileAggregationItems} objects
     * contained in responses from the listAuditProfileAnalytics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AuditProfileAggregationItems} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditProfileAggregationItems>
            listAuditProfileAnalyticsRecordIterator(
                    final ListAuditProfileAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditProfileAnalyticsRequest.Builder, ListAuditProfileAnalyticsRequest,
                ListAuditProfileAnalyticsResponse,
                com.oracle.bmc.datasafe.model.AuditProfileAggregationItems>(
                new com.google.common.base.Supplier<ListAuditProfileAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditProfileAnalyticsRequest.Builder get() {
                        return ListAuditProfileAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditProfileAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditProfileAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditProfileAnalyticsRequest.Builder>,
                        ListAuditProfileAnalyticsRequest>() {
                    @Override
                    public ListAuditProfileAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditProfileAnalyticsRequest.Builder>
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
                        ListAuditProfileAnalyticsRequest, ListAuditProfileAnalyticsResponse>() {
                    @Override
                    public ListAuditProfileAnalyticsResponse apply(
                            ListAuditProfileAnalyticsRequest request) {
                        return client.listAuditProfileAnalytics(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAuditProfileAnalyticsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.AuditProfileAggregationItems>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.AuditProfileAggregationItems>
                            apply(ListAuditProfileAnalyticsResponse response) {
                        return response.getAuditProfileAnalyticCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAuditProfiles operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAuditProfilesResponse> listAuditProfilesResponseIterator(
            final ListAuditProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditProfilesRequest.Builder, ListAuditProfilesRequest,
                ListAuditProfilesResponse>(
                new com.google.common.base.Supplier<ListAuditProfilesRequest.Builder>() {
                    @Override
                    public ListAuditProfilesRequest.Builder get() {
                        return ListAuditProfilesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditProfilesResponse, String>() {
                    @Override
                    public String apply(ListAuditProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditProfilesRequest.Builder>,
                        ListAuditProfilesRequest>() {
                    @Override
                    public ListAuditProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditProfilesRequest.Builder>
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
                        ListAuditProfilesRequest, ListAuditProfilesResponse>() {
                    @Override
                    public ListAuditProfilesResponse apply(ListAuditProfilesRequest request) {
                        return client.listAuditProfiles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AuditProfileSummary} objects
     * contained in responses from the listAuditProfiles operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AuditProfileSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditProfileSummary>
            listAuditProfilesRecordIterator(final ListAuditProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditProfilesRequest.Builder, ListAuditProfilesRequest,
                ListAuditProfilesResponse, com.oracle.bmc.datasafe.model.AuditProfileSummary>(
                new com.google.common.base.Supplier<ListAuditProfilesRequest.Builder>() {
                    @Override
                    public ListAuditProfilesRequest.Builder get() {
                        return ListAuditProfilesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditProfilesResponse, String>() {
                    @Override
                    public String apply(ListAuditProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditProfilesRequest.Builder>,
                        ListAuditProfilesRequest>() {
                    @Override
                    public ListAuditProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditProfilesRequest.Builder>
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
                        ListAuditProfilesRequest, ListAuditProfilesResponse>() {
                    @Override
                    public ListAuditProfilesResponse apply(ListAuditProfilesRequest request) {
                        return client.listAuditProfiles(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAuditProfilesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AuditProfileSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditProfileSummary> apply(
                            ListAuditProfilesResponse response) {
                        return response.getAuditProfileCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAuditTrailAnalytics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAuditTrailAnalyticsResponse> listAuditTrailAnalyticsResponseIterator(
            final ListAuditTrailAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditTrailAnalyticsRequest.Builder, ListAuditTrailAnalyticsRequest,
                ListAuditTrailAnalyticsResponse>(
                new com.google.common.base.Supplier<ListAuditTrailAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditTrailAnalyticsRequest.Builder get() {
                        return ListAuditTrailAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditTrailAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditTrailAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditTrailAnalyticsRequest.Builder>,
                        ListAuditTrailAnalyticsRequest>() {
                    @Override
                    public ListAuditTrailAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditTrailAnalyticsRequest.Builder>
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
                        ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>() {
                    @Override
                    public ListAuditTrailAnalyticsResponse apply(
                            ListAuditTrailAnalyticsRequest request) {
                        return client.listAuditTrailAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AuditTrailAggregationItems} objects
     * contained in responses from the listAuditTrailAnalytics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AuditTrailAggregationItems} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditTrailAggregationItems>
            listAuditTrailAnalyticsRecordIterator(final ListAuditTrailAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditTrailAnalyticsRequest.Builder, ListAuditTrailAnalyticsRequest,
                ListAuditTrailAnalyticsResponse,
                com.oracle.bmc.datasafe.model.AuditTrailAggregationItems>(
                new com.google.common.base.Supplier<ListAuditTrailAnalyticsRequest.Builder>() {
                    @Override
                    public ListAuditTrailAnalyticsRequest.Builder get() {
                        return ListAuditTrailAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditTrailAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListAuditTrailAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditTrailAnalyticsRequest.Builder>,
                        ListAuditTrailAnalyticsRequest>() {
                    @Override
                    public ListAuditTrailAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditTrailAnalyticsRequest.Builder>
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
                        ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>() {
                    @Override
                    public ListAuditTrailAnalyticsResponse apply(
                            ListAuditTrailAnalyticsRequest request) {
                        return client.listAuditTrailAnalytics(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAuditTrailAnalyticsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.AuditTrailAggregationItems>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditTrailAggregationItems>
                            apply(ListAuditTrailAnalyticsResponse response) {
                        return response.getAuditTrailAnalyticCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAuditTrails operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAuditTrailsResponse> listAuditTrailsResponseIterator(
            final ListAuditTrailsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuditTrailsRequest.Builder, ListAuditTrailsRequest, ListAuditTrailsResponse>(
                new com.google.common.base.Supplier<ListAuditTrailsRequest.Builder>() {
                    @Override
                    public ListAuditTrailsRequest.Builder get() {
                        return ListAuditTrailsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditTrailsResponse, String>() {
                    @Override
                    public String apply(ListAuditTrailsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditTrailsRequest.Builder>,
                        ListAuditTrailsRequest>() {
                    @Override
                    public ListAuditTrailsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditTrailsRequest.Builder>
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
                        ListAuditTrailsRequest, ListAuditTrailsResponse>() {
                    @Override
                    public ListAuditTrailsResponse apply(ListAuditTrailsRequest request) {
                        return client.listAuditTrails(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AuditTrailSummary} objects
     * contained in responses from the listAuditTrails operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AuditTrailSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AuditTrailSummary> listAuditTrailsRecordIterator(
            final ListAuditTrailsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuditTrailsRequest.Builder, ListAuditTrailsRequest, ListAuditTrailsResponse,
                com.oracle.bmc.datasafe.model.AuditTrailSummary>(
                new com.google.common.base.Supplier<ListAuditTrailsRequest.Builder>() {
                    @Override
                    public ListAuditTrailsRequest.Builder get() {
                        return ListAuditTrailsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuditTrailsResponse, String>() {
                    @Override
                    public String apply(ListAuditTrailsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuditTrailsRequest.Builder>,
                        ListAuditTrailsRequest>() {
                    @Override
                    public ListAuditTrailsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuditTrailsRequest.Builder>
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
                        ListAuditTrailsRequest, ListAuditTrailsResponse>() {
                    @Override
                    public ListAuditTrailsResponse apply(ListAuditTrailsRequest request) {
                        return client.listAuditTrails(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAuditTrailsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.AuditTrailSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AuditTrailSummary> apply(
                            ListAuditTrailsResponse response) {
                        return response.getAuditTrailCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAvailableAuditVolumes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAvailableAuditVolumesResponse> listAvailableAuditVolumesResponseIterator(
            final ListAvailableAuditVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAvailableAuditVolumesRequest.Builder, ListAvailableAuditVolumesRequest,
                ListAvailableAuditVolumesResponse>(
                new com.google.common.base.Supplier<ListAvailableAuditVolumesRequest.Builder>() {
                    @Override
                    public ListAvailableAuditVolumesRequest.Builder get() {
                        return ListAvailableAuditVolumesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAvailableAuditVolumesResponse, String>() {
                    @Override
                    public String apply(ListAvailableAuditVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableAuditVolumesRequest.Builder>,
                        ListAvailableAuditVolumesRequest>() {
                    @Override
                    public ListAvailableAuditVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableAuditVolumesRequest.Builder>
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
                        ListAvailableAuditVolumesRequest, ListAvailableAuditVolumesResponse>() {
                    @Override
                    public ListAvailableAuditVolumesResponse apply(
                            ListAvailableAuditVolumesRequest request) {
                        return client.listAvailableAuditVolumes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.AvailableAuditVolumeSummary} objects
     * contained in responses from the listAvailableAuditVolumes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.AvailableAuditVolumeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.AvailableAuditVolumeSummary>
            listAvailableAuditVolumesRecordIterator(
                    final ListAvailableAuditVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAvailableAuditVolumesRequest.Builder, ListAvailableAuditVolumesRequest,
                ListAvailableAuditVolumesResponse,
                com.oracle.bmc.datasafe.model.AvailableAuditVolumeSummary>(
                new com.google.common.base.Supplier<ListAvailableAuditVolumesRequest.Builder>() {
                    @Override
                    public ListAvailableAuditVolumesRequest.Builder get() {
                        return ListAvailableAuditVolumesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAvailableAuditVolumesResponse, String>() {
                    @Override
                    public String apply(ListAvailableAuditVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableAuditVolumesRequest.Builder>,
                        ListAvailableAuditVolumesRequest>() {
                    @Override
                    public ListAvailableAuditVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableAuditVolumesRequest.Builder>
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
                        ListAvailableAuditVolumesRequest, ListAvailableAuditVolumesResponse>() {
                    @Override
                    public ListAvailableAuditVolumesResponse apply(
                            ListAvailableAuditVolumesRequest request) {
                        return client.listAvailableAuditVolumes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAvailableAuditVolumesResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.AvailableAuditVolumeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.AvailableAuditVolumeSummary>
                            apply(ListAvailableAuditVolumesResponse response) {
                        return response.getAvailableAuditVolumeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCollectedAuditVolumes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCollectedAuditVolumesResponse> listCollectedAuditVolumesResponseIterator(
            final ListCollectedAuditVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCollectedAuditVolumesRequest.Builder, ListCollectedAuditVolumesRequest,
                ListCollectedAuditVolumesResponse>(
                new com.google.common.base.Supplier<ListCollectedAuditVolumesRequest.Builder>() {
                    @Override
                    public ListCollectedAuditVolumesRequest.Builder get() {
                        return ListCollectedAuditVolumesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCollectedAuditVolumesResponse, String>() {
                    @Override
                    public String apply(ListCollectedAuditVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCollectedAuditVolumesRequest.Builder>,
                        ListCollectedAuditVolumesRequest>() {
                    @Override
                    public ListCollectedAuditVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCollectedAuditVolumesRequest.Builder>
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
                        ListCollectedAuditVolumesRequest, ListCollectedAuditVolumesResponse>() {
                    @Override
                    public ListCollectedAuditVolumesResponse apply(
                            ListCollectedAuditVolumesRequest request) {
                        return client.listCollectedAuditVolumes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.CollectedAuditVolumeSummary} objects
     * contained in responses from the listCollectedAuditVolumes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.CollectedAuditVolumeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.CollectedAuditVolumeSummary>
            listCollectedAuditVolumesRecordIterator(
                    final ListCollectedAuditVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCollectedAuditVolumesRequest.Builder, ListCollectedAuditVolumesRequest,
                ListCollectedAuditVolumesResponse,
                com.oracle.bmc.datasafe.model.CollectedAuditVolumeSummary>(
                new com.google.common.base.Supplier<ListCollectedAuditVolumesRequest.Builder>() {
                    @Override
                    public ListCollectedAuditVolumesRequest.Builder get() {
                        return ListCollectedAuditVolumesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCollectedAuditVolumesResponse, String>() {
                    @Override
                    public String apply(ListCollectedAuditVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCollectedAuditVolumesRequest.Builder>,
                        ListCollectedAuditVolumesRequest>() {
                    @Override
                    public ListCollectedAuditVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCollectedAuditVolumesRequest.Builder>
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
                        ListCollectedAuditVolumesRequest, ListCollectedAuditVolumesResponse>() {
                    @Override
                    public ListCollectedAuditVolumesResponse apply(
                            ListCollectedAuditVolumesRequest request) {
                        return client.listCollectedAuditVolumes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCollectedAuditVolumesResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.CollectedAuditVolumeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.CollectedAuditVolumeSummary>
                            apply(ListCollectedAuditVolumesResponse response) {
                        return response.getCollectedAuditVolumeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listColumns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListColumnsResponse> listColumnsResponseIterator(
            final ListColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListColumnsRequest.Builder, ListColumnsRequest, ListColumnsResponse>(
                new com.google.common.base.Supplier<ListColumnsRequest.Builder>() {
                    @Override
                    public ListColumnsRequest.Builder get() {
                        return ListColumnsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListColumnsResponse, String>() {
                    @Override
                    public String apply(ListColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListColumnsRequest.Builder>,
                        ListColumnsRequest>() {
                    @Override
                    public ListColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListColumnsRequest.Builder>
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
                new com.google.common.base.Function<ListColumnsRequest, ListColumnsResponse>() {
                    @Override
                    public ListColumnsResponse apply(ListColumnsRequest request) {
                        return client.listColumns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.ColumnSummary} objects
     * contained in responses from the listColumns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.ColumnSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.ColumnSummary> listColumnsRecordIterator(
            final ListColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListColumnsRequest.Builder, ListColumnsRequest, ListColumnsResponse,
                com.oracle.bmc.datasafe.model.ColumnSummary>(
                new com.google.common.base.Supplier<ListColumnsRequest.Builder>() {
                    @Override
                    public ListColumnsRequest.Builder get() {
                        return ListColumnsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListColumnsResponse, String>() {
                    @Override
                    public String apply(ListColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListColumnsRequest.Builder>,
                        ListColumnsRequest>() {
                    @Override
                    public ListColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListColumnsRequest.Builder>
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
                new com.google.common.base.Function<ListColumnsRequest, ListColumnsResponse>() {
                    @Override
                    public ListColumnsResponse apply(ListColumnsRequest request) {
                        return client.listColumns(request);
                    }
                },
                new com.google.common.base.Function<
                        ListColumnsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.ColumnSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.ColumnSummary> apply(
                            ListColumnsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataSafePrivateEndpoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataSafePrivateEndpointsResponse>
            listDataSafePrivateEndpointsResponseIterator(
                    final ListDataSafePrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataSafePrivateEndpointsRequest.Builder, ListDataSafePrivateEndpointsRequest,
                ListDataSafePrivateEndpointsResponse>(
                new com.google.common.base.Supplier<ListDataSafePrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListDataSafePrivateEndpointsRequest.Builder get() {
                        return ListDataSafePrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataSafePrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListDataSafePrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataSafePrivateEndpointsRequest.Builder>,
                        ListDataSafePrivateEndpointsRequest>() {
                    @Override
                    public ListDataSafePrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataSafePrivateEndpointsRequest.Builder>
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
                        ListDataSafePrivateEndpointsRequest,
                        ListDataSafePrivateEndpointsResponse>() {
                    @Override
                    public ListDataSafePrivateEndpointsResponse apply(
                            ListDataSafePrivateEndpointsRequest request) {
                        return client.listDataSafePrivateEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary} objects
     * contained in responses from the listDataSafePrivateEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary>
            listDataSafePrivateEndpointsRecordIterator(
                    final ListDataSafePrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataSafePrivateEndpointsRequest.Builder, ListDataSafePrivateEndpointsRequest,
                ListDataSafePrivateEndpointsResponse,
                com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary>(
                new com.google.common.base.Supplier<ListDataSafePrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListDataSafePrivateEndpointsRequest.Builder get() {
                        return ListDataSafePrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataSafePrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListDataSafePrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataSafePrivateEndpointsRequest.Builder>,
                        ListDataSafePrivateEndpointsRequest>() {
                    @Override
                    public ListDataSafePrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataSafePrivateEndpointsRequest.Builder>
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
                        ListDataSafePrivateEndpointsRequest,
                        ListDataSafePrivateEndpointsResponse>() {
                    @Override
                    public ListDataSafePrivateEndpointsResponse apply(
                            ListDataSafePrivateEndpointsRequest request) {
                        return client.listDataSafePrivateEndpoints(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataSafePrivateEndpointsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary>
                            apply(ListDataSafePrivateEndpointsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDiscoveryAnalytics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDiscoveryAnalyticsResponse> listDiscoveryAnalyticsResponseIterator(
            final ListDiscoveryAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDiscoveryAnalyticsRequest.Builder, ListDiscoveryAnalyticsRequest,
                ListDiscoveryAnalyticsResponse>(
                new com.google.common.base.Supplier<ListDiscoveryAnalyticsRequest.Builder>() {
                    @Override
                    public ListDiscoveryAnalyticsRequest.Builder get() {
                        return ListDiscoveryAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDiscoveryAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryAnalyticsRequest.Builder>,
                        ListDiscoveryAnalyticsRequest>() {
                    @Override
                    public ListDiscoveryAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryAnalyticsRequest.Builder>
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
                        ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>() {
                    @Override
                    public ListDiscoveryAnalyticsResponse apply(
                            ListDiscoveryAnalyticsRequest request) {
                        return client.listDiscoveryAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.DiscoveryAnalyticsSummary} objects
     * contained in responses from the listDiscoveryAnalytics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.DiscoveryAnalyticsSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.DiscoveryAnalyticsSummary>
            listDiscoveryAnalyticsRecordIterator(final ListDiscoveryAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDiscoveryAnalyticsRequest.Builder, ListDiscoveryAnalyticsRequest,
                ListDiscoveryAnalyticsResponse,
                com.oracle.bmc.datasafe.model.DiscoveryAnalyticsSummary>(
                new com.google.common.base.Supplier<ListDiscoveryAnalyticsRequest.Builder>() {
                    @Override
                    public ListDiscoveryAnalyticsRequest.Builder get() {
                        return ListDiscoveryAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDiscoveryAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryAnalyticsRequest.Builder>,
                        ListDiscoveryAnalyticsRequest>() {
                    @Override
                    public ListDiscoveryAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryAnalyticsRequest.Builder>
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
                        ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>() {
                    @Override
                    public ListDiscoveryAnalyticsResponse apply(
                            ListDiscoveryAnalyticsRequest request) {
                        return client.listDiscoveryAnalytics(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDiscoveryAnalyticsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.DiscoveryAnalyticsSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.DiscoveryAnalyticsSummary>
                            apply(ListDiscoveryAnalyticsResponse response) {
                        return response.getDiscoveryAnalyticsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDiscoveryJobResults operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDiscoveryJobResultsResponse> listDiscoveryJobResultsResponseIterator(
            final ListDiscoveryJobResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDiscoveryJobResultsRequest.Builder, ListDiscoveryJobResultsRequest,
                ListDiscoveryJobResultsResponse>(
                new com.google.common.base.Supplier<ListDiscoveryJobResultsRequest.Builder>() {
                    @Override
                    public ListDiscoveryJobResultsRequest.Builder get() {
                        return ListDiscoveryJobResultsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDiscoveryJobResultsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryJobResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryJobResultsRequest.Builder>,
                        ListDiscoveryJobResultsRequest>() {
                    @Override
                    public ListDiscoveryJobResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryJobResultsRequest.Builder>
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
                        ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>() {
                    @Override
                    public ListDiscoveryJobResultsResponse apply(
                            ListDiscoveryJobResultsRequest request) {
                        return client.listDiscoveryJobResults(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.DiscoveryJobResultSummary} objects
     * contained in responses from the listDiscoveryJobResults operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.DiscoveryJobResultSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.DiscoveryJobResultSummary>
            listDiscoveryJobResultsRecordIterator(final ListDiscoveryJobResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDiscoveryJobResultsRequest.Builder, ListDiscoveryJobResultsRequest,
                ListDiscoveryJobResultsResponse,
                com.oracle.bmc.datasafe.model.DiscoveryJobResultSummary>(
                new com.google.common.base.Supplier<ListDiscoveryJobResultsRequest.Builder>() {
                    @Override
                    public ListDiscoveryJobResultsRequest.Builder get() {
                        return ListDiscoveryJobResultsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDiscoveryJobResultsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryJobResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryJobResultsRequest.Builder>,
                        ListDiscoveryJobResultsRequest>() {
                    @Override
                    public ListDiscoveryJobResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryJobResultsRequest.Builder>
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
                        ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>() {
                    @Override
                    public ListDiscoveryJobResultsResponse apply(
                            ListDiscoveryJobResultsRequest request) {
                        return client.listDiscoveryJobResults(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDiscoveryJobResultsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.DiscoveryJobResultSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.DiscoveryJobResultSummary>
                            apply(ListDiscoveryJobResultsResponse response) {
                        return response.getDiscoveryJobResultCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDiscoveryJobs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDiscoveryJobsResponse> listDiscoveryJobsResponseIterator(
            final ListDiscoveryJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDiscoveryJobsRequest.Builder, ListDiscoveryJobsRequest,
                ListDiscoveryJobsResponse>(
                new com.google.common.base.Supplier<ListDiscoveryJobsRequest.Builder>() {
                    @Override
                    public ListDiscoveryJobsRequest.Builder get() {
                        return ListDiscoveryJobsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDiscoveryJobsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryJobsRequest.Builder>,
                        ListDiscoveryJobsRequest>() {
                    @Override
                    public ListDiscoveryJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryJobsRequest.Builder>
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
                        ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>() {
                    @Override
                    public ListDiscoveryJobsResponse apply(ListDiscoveryJobsRequest request) {
                        return client.listDiscoveryJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.DiscoveryJobSummary} objects
     * contained in responses from the listDiscoveryJobs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.DiscoveryJobSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.DiscoveryJobSummary>
            listDiscoveryJobsRecordIterator(final ListDiscoveryJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDiscoveryJobsRequest.Builder, ListDiscoveryJobsRequest,
                ListDiscoveryJobsResponse, com.oracle.bmc.datasafe.model.DiscoveryJobSummary>(
                new com.google.common.base.Supplier<ListDiscoveryJobsRequest.Builder>() {
                    @Override
                    public ListDiscoveryJobsRequest.Builder get() {
                        return ListDiscoveryJobsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDiscoveryJobsResponse, String>() {
                    @Override
                    public String apply(ListDiscoveryJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDiscoveryJobsRequest.Builder>,
                        ListDiscoveryJobsRequest>() {
                    @Override
                    public ListDiscoveryJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDiscoveryJobsRequest.Builder>
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
                        ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>() {
                    @Override
                    public ListDiscoveryJobsResponse apply(ListDiscoveryJobsRequest request) {
                        return client.listDiscoveryJobs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDiscoveryJobsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.DiscoveryJobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.DiscoveryJobSummary> apply(
                            ListDiscoveryJobsResponse response) {
                        return response.getDiscoveryJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFindings operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListFindingsResponse> listFindingsResponseIterator(
            final ListFindingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFindingsRequest.Builder, ListFindingsRequest, ListFindingsResponse>(
                new com.google.common.base.Supplier<ListFindingsRequest.Builder>() {
                    @Override
                    public ListFindingsRequest.Builder get() {
                        return ListFindingsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFindingsResponse, String>() {
                    @Override
                    public String apply(ListFindingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFindingsRequest.Builder>,
                        ListFindingsRequest>() {
                    @Override
                    public ListFindingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFindingsRequest.Builder>
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
                new com.google.common.base.Function<ListFindingsRequest, ListFindingsResponse>() {
                    @Override
                    public ListFindingsResponse apply(ListFindingsRequest request) {
                        return client.listFindings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.FindingSummary} objects
     * contained in responses from the listFindings operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.FindingSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.FindingSummary> listFindingsRecordIterator(
            final ListFindingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFindingsRequest.Builder, ListFindingsRequest, ListFindingsResponse,
                com.oracle.bmc.datasafe.model.FindingSummary>(
                new com.google.common.base.Supplier<ListFindingsRequest.Builder>() {
                    @Override
                    public ListFindingsRequest.Builder get() {
                        return ListFindingsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFindingsResponse, String>() {
                    @Override
                    public String apply(ListFindingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFindingsRequest.Builder>,
                        ListFindingsRequest>() {
                    @Override
                    public ListFindingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFindingsRequest.Builder>
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
                new com.google.common.base.Function<ListFindingsRequest, ListFindingsResponse>() {
                    @Override
                    public ListFindingsResponse apply(ListFindingsRequest request) {
                        return client.listFindings(request);
                    }
                },
                new com.google.common.base.Function<
                        ListFindingsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.FindingSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.FindingSummary> apply(
                            ListFindingsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGrants operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListGrantsResponse> listGrantsResponseIterator(
            final ListGrantsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGrantsRequest.Builder, ListGrantsRequest, ListGrantsResponse>(
                new com.google.common.base.Supplier<ListGrantsRequest.Builder>() {
                    @Override
                    public ListGrantsRequest.Builder get() {
                        return ListGrantsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGrantsResponse, String>() {
                    @Override
                    public String apply(ListGrantsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGrantsRequest.Builder>,
                        ListGrantsRequest>() {
                    @Override
                    public ListGrantsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGrantsRequest.Builder>
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
                new com.google.common.base.Function<ListGrantsRequest, ListGrantsResponse>() {
                    @Override
                    public ListGrantsResponse apply(ListGrantsRequest request) {
                        return client.listGrants(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.GrantSummary} objects
     * contained in responses from the listGrants operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.GrantSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.GrantSummary> listGrantsRecordIterator(
            final ListGrantsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGrantsRequest.Builder, ListGrantsRequest, ListGrantsResponse,
                com.oracle.bmc.datasafe.model.GrantSummary>(
                new com.google.common.base.Supplier<ListGrantsRequest.Builder>() {
                    @Override
                    public ListGrantsRequest.Builder get() {
                        return ListGrantsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGrantsResponse, String>() {
                    @Override
                    public String apply(ListGrantsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGrantsRequest.Builder>,
                        ListGrantsRequest>() {
                    @Override
                    public ListGrantsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGrantsRequest.Builder>
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
                new com.google.common.base.Function<ListGrantsRequest, ListGrantsResponse>() {
                    @Override
                    public ListGrantsResponse apply(ListGrantsRequest request) {
                        return client.listGrants(request);
                    }
                },
                new com.google.common.base.Function<
                        ListGrantsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.GrantSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.GrantSummary> apply(
                            ListGrantsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLibraryMaskingFormats operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLibraryMaskingFormatsResponse> listLibraryMaskingFormatsResponseIterator(
            final ListLibraryMaskingFormatsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLibraryMaskingFormatsRequest.Builder, ListLibraryMaskingFormatsRequest,
                ListLibraryMaskingFormatsResponse>(
                new com.google.common.base.Supplier<ListLibraryMaskingFormatsRequest.Builder>() {
                    @Override
                    public ListLibraryMaskingFormatsRequest.Builder get() {
                        return ListLibraryMaskingFormatsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLibraryMaskingFormatsResponse, String>() {
                    @Override
                    public String apply(ListLibraryMaskingFormatsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLibraryMaskingFormatsRequest.Builder>,
                        ListLibraryMaskingFormatsRequest>() {
                    @Override
                    public ListLibraryMaskingFormatsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLibraryMaskingFormatsRequest.Builder>
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
                        ListLibraryMaskingFormatsRequest, ListLibraryMaskingFormatsResponse>() {
                    @Override
                    public ListLibraryMaskingFormatsResponse apply(
                            ListLibraryMaskingFormatsRequest request) {
                        return client.listLibraryMaskingFormats(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.LibraryMaskingFormatSummary} objects
     * contained in responses from the listLibraryMaskingFormats operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.LibraryMaskingFormatSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.LibraryMaskingFormatSummary>
            listLibraryMaskingFormatsRecordIterator(
                    final ListLibraryMaskingFormatsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLibraryMaskingFormatsRequest.Builder, ListLibraryMaskingFormatsRequest,
                ListLibraryMaskingFormatsResponse,
                com.oracle.bmc.datasafe.model.LibraryMaskingFormatSummary>(
                new com.google.common.base.Supplier<ListLibraryMaskingFormatsRequest.Builder>() {
                    @Override
                    public ListLibraryMaskingFormatsRequest.Builder get() {
                        return ListLibraryMaskingFormatsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLibraryMaskingFormatsResponse, String>() {
                    @Override
                    public String apply(ListLibraryMaskingFormatsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLibraryMaskingFormatsRequest.Builder>,
                        ListLibraryMaskingFormatsRequest>() {
                    @Override
                    public ListLibraryMaskingFormatsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLibraryMaskingFormatsRequest.Builder>
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
                        ListLibraryMaskingFormatsRequest, ListLibraryMaskingFormatsResponse>() {
                    @Override
                    public ListLibraryMaskingFormatsResponse apply(
                            ListLibraryMaskingFormatsRequest request) {
                        return client.listLibraryMaskingFormats(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLibraryMaskingFormatsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.LibraryMaskingFormatSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.LibraryMaskingFormatSummary>
                            apply(ListLibraryMaskingFormatsResponse response) {
                        return response.getLibraryMaskingFormatCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMaskedColumns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMaskedColumnsResponse> listMaskedColumnsResponseIterator(
            final ListMaskedColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaskedColumnsRequest.Builder, ListMaskedColumnsRequest,
                ListMaskedColumnsResponse>(
                new com.google.common.base.Supplier<ListMaskedColumnsRequest.Builder>() {
                    @Override
                    public ListMaskedColumnsRequest.Builder get() {
                        return ListMaskedColumnsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMaskedColumnsResponse, String>() {
                    @Override
                    public String apply(ListMaskedColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskedColumnsRequest.Builder>,
                        ListMaskedColumnsRequest>() {
                    @Override
                    public ListMaskedColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskedColumnsRequest.Builder>
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
                        ListMaskedColumnsRequest, ListMaskedColumnsResponse>() {
                    @Override
                    public ListMaskedColumnsResponse apply(ListMaskedColumnsRequest request) {
                        return client.listMaskedColumns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.MaskedColumnSummary} objects
     * contained in responses from the listMaskedColumns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.MaskedColumnSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.MaskedColumnSummary>
            listMaskedColumnsRecordIterator(final ListMaskedColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaskedColumnsRequest.Builder, ListMaskedColumnsRequest,
                ListMaskedColumnsResponse, com.oracle.bmc.datasafe.model.MaskedColumnSummary>(
                new com.google.common.base.Supplier<ListMaskedColumnsRequest.Builder>() {
                    @Override
                    public ListMaskedColumnsRequest.Builder get() {
                        return ListMaskedColumnsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMaskedColumnsResponse, String>() {
                    @Override
                    public String apply(ListMaskedColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskedColumnsRequest.Builder>,
                        ListMaskedColumnsRequest>() {
                    @Override
                    public ListMaskedColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskedColumnsRequest.Builder>
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
                        ListMaskedColumnsRequest, ListMaskedColumnsResponse>() {
                    @Override
                    public ListMaskedColumnsResponse apply(ListMaskedColumnsRequest request) {
                        return client.listMaskedColumns(request);
                    }
                },
                new com.google.common.base.Function<
                        ListMaskedColumnsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.MaskedColumnSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.MaskedColumnSummary> apply(
                            ListMaskedColumnsResponse response) {
                        return response.getMaskedColumnCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMaskingAnalytics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMaskingAnalyticsResponse> listMaskingAnalyticsResponseIterator(
            final ListMaskingAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaskingAnalyticsRequest.Builder, ListMaskingAnalyticsRequest,
                ListMaskingAnalyticsResponse>(
                new com.google.common.base.Supplier<ListMaskingAnalyticsRequest.Builder>() {
                    @Override
                    public ListMaskingAnalyticsRequest.Builder get() {
                        return ListMaskingAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMaskingAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListMaskingAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingAnalyticsRequest.Builder>,
                        ListMaskingAnalyticsRequest>() {
                    @Override
                    public ListMaskingAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingAnalyticsRequest.Builder>
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
                        ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>() {
                    @Override
                    public ListMaskingAnalyticsResponse apply(ListMaskingAnalyticsRequest request) {
                        return client.listMaskingAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.MaskingAnalyticsSummary} objects
     * contained in responses from the listMaskingAnalytics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.MaskingAnalyticsSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.MaskingAnalyticsSummary>
            listMaskingAnalyticsRecordIterator(final ListMaskingAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaskingAnalyticsRequest.Builder, ListMaskingAnalyticsRequest,
                ListMaskingAnalyticsResponse,
                com.oracle.bmc.datasafe.model.MaskingAnalyticsSummary>(
                new com.google.common.base.Supplier<ListMaskingAnalyticsRequest.Builder>() {
                    @Override
                    public ListMaskingAnalyticsRequest.Builder get() {
                        return ListMaskingAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMaskingAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListMaskingAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingAnalyticsRequest.Builder>,
                        ListMaskingAnalyticsRequest>() {
                    @Override
                    public ListMaskingAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingAnalyticsRequest.Builder>
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
                        ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>() {
                    @Override
                    public ListMaskingAnalyticsResponse apply(ListMaskingAnalyticsRequest request) {
                        return client.listMaskingAnalytics(request);
                    }
                },
                new com.google.common.base.Function<
                        ListMaskingAnalyticsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.MaskingAnalyticsSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.MaskingAnalyticsSummary>
                            apply(ListMaskingAnalyticsResponse response) {
                        return response.getMaskingAnalyticsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMaskingColumns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMaskingColumnsResponse> listMaskingColumnsResponseIterator(
            final ListMaskingColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaskingColumnsRequest.Builder, ListMaskingColumnsRequest,
                ListMaskingColumnsResponse>(
                new com.google.common.base.Supplier<ListMaskingColumnsRequest.Builder>() {
                    @Override
                    public ListMaskingColumnsRequest.Builder get() {
                        return ListMaskingColumnsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMaskingColumnsResponse, String>() {
                    @Override
                    public String apply(ListMaskingColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingColumnsRequest.Builder>,
                        ListMaskingColumnsRequest>() {
                    @Override
                    public ListMaskingColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingColumnsRequest.Builder>
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
                        ListMaskingColumnsRequest, ListMaskingColumnsResponse>() {
                    @Override
                    public ListMaskingColumnsResponse apply(ListMaskingColumnsRequest request) {
                        return client.listMaskingColumns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.MaskingColumnSummary} objects
     * contained in responses from the listMaskingColumns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.MaskingColumnSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.MaskingColumnSummary>
            listMaskingColumnsRecordIterator(final ListMaskingColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaskingColumnsRequest.Builder, ListMaskingColumnsRequest,
                ListMaskingColumnsResponse, com.oracle.bmc.datasafe.model.MaskingColumnSummary>(
                new com.google.common.base.Supplier<ListMaskingColumnsRequest.Builder>() {
                    @Override
                    public ListMaskingColumnsRequest.Builder get() {
                        return ListMaskingColumnsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMaskingColumnsResponse, String>() {
                    @Override
                    public String apply(ListMaskingColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingColumnsRequest.Builder>,
                        ListMaskingColumnsRequest>() {
                    @Override
                    public ListMaskingColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingColumnsRequest.Builder>
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
                        ListMaskingColumnsRequest, ListMaskingColumnsResponse>() {
                    @Override
                    public ListMaskingColumnsResponse apply(ListMaskingColumnsRequest request) {
                        return client.listMaskingColumns(request);
                    }
                },
                new com.google.common.base.Function<
                        ListMaskingColumnsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.MaskingColumnSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.MaskingColumnSummary> apply(
                            ListMaskingColumnsResponse response) {
                        return response.getMaskingColumnCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMaskingPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMaskingPoliciesResponse> listMaskingPoliciesResponseIterator(
            final ListMaskingPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaskingPoliciesRequest.Builder, ListMaskingPoliciesRequest,
                ListMaskingPoliciesResponse>(
                new com.google.common.base.Supplier<ListMaskingPoliciesRequest.Builder>() {
                    @Override
                    public ListMaskingPoliciesRequest.Builder get() {
                        return ListMaskingPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMaskingPoliciesResponse, String>() {
                    @Override
                    public String apply(ListMaskingPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingPoliciesRequest.Builder>,
                        ListMaskingPoliciesRequest>() {
                    @Override
                    public ListMaskingPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingPoliciesRequest.Builder>
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
                        ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>() {
                    @Override
                    public ListMaskingPoliciesResponse apply(ListMaskingPoliciesRequest request) {
                        return client.listMaskingPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.MaskingPolicySummary} objects
     * contained in responses from the listMaskingPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.MaskingPolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.MaskingPolicySummary>
            listMaskingPoliciesRecordIterator(final ListMaskingPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaskingPoliciesRequest.Builder, ListMaskingPoliciesRequest,
                ListMaskingPoliciesResponse, com.oracle.bmc.datasafe.model.MaskingPolicySummary>(
                new com.google.common.base.Supplier<ListMaskingPoliciesRequest.Builder>() {
                    @Override
                    public ListMaskingPoliciesRequest.Builder get() {
                        return ListMaskingPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMaskingPoliciesResponse, String>() {
                    @Override
                    public String apply(ListMaskingPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingPoliciesRequest.Builder>,
                        ListMaskingPoliciesRequest>() {
                    @Override
                    public ListMaskingPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingPoliciesRequest.Builder>
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
                        ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>() {
                    @Override
                    public ListMaskingPoliciesResponse apply(ListMaskingPoliciesRequest request) {
                        return client.listMaskingPolicies(request);
                    }
                },
                new com.google.common.base.Function<
                        ListMaskingPoliciesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.MaskingPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.MaskingPolicySummary> apply(
                            ListMaskingPoliciesResponse response) {
                        return response.getMaskingPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMaskingReports operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMaskingReportsResponse> listMaskingReportsResponseIterator(
            final ListMaskingReportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaskingReportsRequest.Builder, ListMaskingReportsRequest,
                ListMaskingReportsResponse>(
                new com.google.common.base.Supplier<ListMaskingReportsRequest.Builder>() {
                    @Override
                    public ListMaskingReportsRequest.Builder get() {
                        return ListMaskingReportsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMaskingReportsResponse, String>() {
                    @Override
                    public String apply(ListMaskingReportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingReportsRequest.Builder>,
                        ListMaskingReportsRequest>() {
                    @Override
                    public ListMaskingReportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingReportsRequest.Builder>
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
                        ListMaskingReportsRequest, ListMaskingReportsResponse>() {
                    @Override
                    public ListMaskingReportsResponse apply(ListMaskingReportsRequest request) {
                        return client.listMaskingReports(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.MaskingReportSummary} objects
     * contained in responses from the listMaskingReports operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.MaskingReportSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.MaskingReportSummary>
            listMaskingReportsRecordIterator(final ListMaskingReportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaskingReportsRequest.Builder, ListMaskingReportsRequest,
                ListMaskingReportsResponse, com.oracle.bmc.datasafe.model.MaskingReportSummary>(
                new com.google.common.base.Supplier<ListMaskingReportsRequest.Builder>() {
                    @Override
                    public ListMaskingReportsRequest.Builder get() {
                        return ListMaskingReportsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMaskingReportsResponse, String>() {
                    @Override
                    public String apply(ListMaskingReportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaskingReportsRequest.Builder>,
                        ListMaskingReportsRequest>() {
                    @Override
                    public ListMaskingReportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaskingReportsRequest.Builder>
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
                        ListMaskingReportsRequest, ListMaskingReportsResponse>() {
                    @Override
                    public ListMaskingReportsResponse apply(ListMaskingReportsRequest request) {
                        return client.listMaskingReports(request);
                    }
                },
                new com.google.common.base.Function<
                        ListMaskingReportsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.MaskingReportSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.MaskingReportSummary> apply(
                            ListMaskingReportsResponse response) {
                        return response.getMaskingReportCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOnPremConnectors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOnPremConnectorsResponse> listOnPremConnectorsResponseIterator(
            final ListOnPremConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOnPremConnectorsRequest.Builder, ListOnPremConnectorsRequest,
                ListOnPremConnectorsResponse>(
                new com.google.common.base.Supplier<ListOnPremConnectorsRequest.Builder>() {
                    @Override
                    public ListOnPremConnectorsRequest.Builder get() {
                        return ListOnPremConnectorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListOnPremConnectorsResponse, String>() {
                    @Override
                    public String apply(ListOnPremConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOnPremConnectorsRequest.Builder>,
                        ListOnPremConnectorsRequest>() {
                    @Override
                    public ListOnPremConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOnPremConnectorsRequest.Builder>
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
                        ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>() {
                    @Override
                    public ListOnPremConnectorsResponse apply(ListOnPremConnectorsRequest request) {
                        return client.listOnPremConnectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.OnPremConnectorSummary} objects
     * contained in responses from the listOnPremConnectors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.OnPremConnectorSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.OnPremConnectorSummary>
            listOnPremConnectorsRecordIterator(final ListOnPremConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOnPremConnectorsRequest.Builder, ListOnPremConnectorsRequest,
                ListOnPremConnectorsResponse, com.oracle.bmc.datasafe.model.OnPremConnectorSummary>(
                new com.google.common.base.Supplier<ListOnPremConnectorsRequest.Builder>() {
                    @Override
                    public ListOnPremConnectorsRequest.Builder get() {
                        return ListOnPremConnectorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListOnPremConnectorsResponse, String>() {
                    @Override
                    public String apply(ListOnPremConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOnPremConnectorsRequest.Builder>,
                        ListOnPremConnectorsRequest>() {
                    @Override
                    public ListOnPremConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOnPremConnectorsRequest.Builder>
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
                        ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>() {
                    @Override
                    public ListOnPremConnectorsResponse apply(ListOnPremConnectorsRequest request) {
                        return client.listOnPremConnectors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListOnPremConnectorsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.OnPremConnectorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.OnPremConnectorSummary>
                            apply(ListOnPremConnectorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listReportDefinitions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListReportDefinitionsResponse> listReportDefinitionsResponseIterator(
            final ListReportDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReportDefinitionsRequest.Builder, ListReportDefinitionsRequest,
                ListReportDefinitionsResponse>(
                new com.google.common.base.Supplier<ListReportDefinitionsRequest.Builder>() {
                    @Override
                    public ListReportDefinitionsRequest.Builder get() {
                        return ListReportDefinitionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListReportDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListReportDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReportDefinitionsRequest.Builder>,
                        ListReportDefinitionsRequest>() {
                    @Override
                    public ListReportDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReportDefinitionsRequest.Builder>
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
                        ListReportDefinitionsRequest, ListReportDefinitionsResponse>() {
                    @Override
                    public ListReportDefinitionsResponse apply(
                            ListReportDefinitionsRequest request) {
                        return client.listReportDefinitions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.ReportDefinitionSummary} objects
     * contained in responses from the listReportDefinitions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.ReportDefinitionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.ReportDefinitionSummary>
            listReportDefinitionsRecordIterator(final ListReportDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReportDefinitionsRequest.Builder, ListReportDefinitionsRequest,
                ListReportDefinitionsResponse,
                com.oracle.bmc.datasafe.model.ReportDefinitionSummary>(
                new com.google.common.base.Supplier<ListReportDefinitionsRequest.Builder>() {
                    @Override
                    public ListReportDefinitionsRequest.Builder get() {
                        return ListReportDefinitionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListReportDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListReportDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReportDefinitionsRequest.Builder>,
                        ListReportDefinitionsRequest>() {
                    @Override
                    public ListReportDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReportDefinitionsRequest.Builder>
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
                        ListReportDefinitionsRequest, ListReportDefinitionsResponse>() {
                    @Override
                    public ListReportDefinitionsResponse apply(
                            ListReportDefinitionsRequest request) {
                        return client.listReportDefinitions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListReportDefinitionsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.ReportDefinitionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.ReportDefinitionSummary>
                            apply(ListReportDefinitionsResponse response) {
                        return response.getReportDefinitionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listReports operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListReportsResponse> listReportsResponseIterator(
            final ListReportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReportsRequest.Builder, ListReportsRequest, ListReportsResponse>(
                new com.google.common.base.Supplier<ListReportsRequest.Builder>() {
                    @Override
                    public ListReportsRequest.Builder get() {
                        return ListReportsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListReportsResponse, String>() {
                    @Override
                    public String apply(ListReportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReportsRequest.Builder>,
                        ListReportsRequest>() {
                    @Override
                    public ListReportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReportsRequest.Builder>
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
                new com.google.common.base.Function<ListReportsRequest, ListReportsResponse>() {
                    @Override
                    public ListReportsResponse apply(ListReportsRequest request) {
                        return client.listReports(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.ReportSummary} objects
     * contained in responses from the listReports operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.ReportSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.ReportSummary> listReportsRecordIterator(
            final ListReportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReportsRequest.Builder, ListReportsRequest, ListReportsResponse,
                com.oracle.bmc.datasafe.model.ReportSummary>(
                new com.google.common.base.Supplier<ListReportsRequest.Builder>() {
                    @Override
                    public ListReportsRequest.Builder get() {
                        return ListReportsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListReportsResponse, String>() {
                    @Override
                    public String apply(ListReportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReportsRequest.Builder>,
                        ListReportsRequest>() {
                    @Override
                    public ListReportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReportsRequest.Builder>
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
                new com.google.common.base.Function<ListReportsRequest, ListReportsResponse>() {
                    @Override
                    public ListReportsResponse apply(ListReportsRequest request) {
                        return client.listReports(request);
                    }
                },
                new com.google.common.base.Function<
                        ListReportsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.ReportSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.ReportSummary> apply(
                            ListReportsResponse response) {
                        return response.getReportCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRoles operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRolesResponse> listRolesResponseIterator(final ListRolesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRolesRequest.Builder, ListRolesRequest, ListRolesResponse>(
                new com.google.common.base.Supplier<ListRolesRequest.Builder>() {
                    @Override
                    public ListRolesRequest.Builder get() {
                        return ListRolesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRolesResponse, String>() {
                    @Override
                    public String apply(ListRolesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRolesRequest.Builder>,
                        ListRolesRequest>() {
                    @Override
                    public ListRolesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRolesRequest.Builder>
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
                new com.google.common.base.Function<ListRolesRequest, ListRolesResponse>() {
                    @Override
                    public ListRolesResponse apply(ListRolesRequest request) {
                        return client.listRoles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.RoleSummary} objects
     * contained in responses from the listRoles operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.RoleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.RoleSummary> listRolesRecordIterator(
            final ListRolesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRolesRequest.Builder, ListRolesRequest, ListRolesResponse,
                com.oracle.bmc.datasafe.model.RoleSummary>(
                new com.google.common.base.Supplier<ListRolesRequest.Builder>() {
                    @Override
                    public ListRolesRequest.Builder get() {
                        return ListRolesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRolesResponse, String>() {
                    @Override
                    public String apply(ListRolesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRolesRequest.Builder>,
                        ListRolesRequest>() {
                    @Override
                    public ListRolesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRolesRequest.Builder>
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
                new com.google.common.base.Function<ListRolesRequest, ListRolesResponse>() {
                    @Override
                    public ListRolesResponse apply(ListRolesRequest request) {
                        return client.listRoles(request);
                    }
                },
                new com.google.common.base.Function<
                        ListRolesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.RoleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.RoleSummary> apply(
                            ListRolesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSchemas operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSchemasResponse> listSchemasResponseIterator(
            final ListSchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSchemasRequest.Builder, ListSchemasRequest, ListSchemasResponse>(
                new com.google.common.base.Supplier<ListSchemasRequest.Builder>() {
                    @Override
                    public ListSchemasRequest.Builder get() {
                        return ListSchemasRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSchemasResponse, String>() {
                    @Override
                    public String apply(ListSchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchemasRequest.Builder>,
                        ListSchemasRequest>() {
                    @Override
                    public ListSchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchemasRequest.Builder>
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
                new com.google.common.base.Function<ListSchemasRequest, ListSchemasResponse>() {
                    @Override
                    public ListSchemasResponse apply(ListSchemasRequest request) {
                        return client.listSchemas(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.SchemaSummary} objects
     * contained in responses from the listSchemas operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.SchemaSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SchemaSummary> listSchemasRecordIterator(
            final ListSchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSchemasRequest.Builder, ListSchemasRequest, ListSchemasResponse,
                com.oracle.bmc.datasafe.model.SchemaSummary>(
                new com.google.common.base.Supplier<ListSchemasRequest.Builder>() {
                    @Override
                    public ListSchemasRequest.Builder get() {
                        return ListSchemasRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSchemasResponse, String>() {
                    @Override
                    public String apply(ListSchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchemasRequest.Builder>,
                        ListSchemasRequest>() {
                    @Override
                    public ListSchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchemasRequest.Builder>
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
                new com.google.common.base.Function<ListSchemasRequest, ListSchemasResponse>() {
                    @Override
                    public ListSchemasResponse apply(ListSchemasRequest request) {
                        return client.listSchemas(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSchemasResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SchemaSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SchemaSummary> apply(
                            ListSchemasResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSecurityAssessments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSecurityAssessmentsResponse> listSecurityAssessmentsResponseIterator(
            final ListSecurityAssessmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityAssessmentsRequest.Builder, ListSecurityAssessmentsRequest,
                ListSecurityAssessmentsResponse>(
                new com.google.common.base.Supplier<ListSecurityAssessmentsRequest.Builder>() {
                    @Override
                    public ListSecurityAssessmentsRequest.Builder get() {
                        return ListSecurityAssessmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSecurityAssessmentsResponse, String>() {
                    @Override
                    public String apply(ListSecurityAssessmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAssessmentsRequest.Builder>,
                        ListSecurityAssessmentsRequest>() {
                    @Override
                    public ListSecurityAssessmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAssessmentsRequest.Builder>
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
                        ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>() {
                    @Override
                    public ListSecurityAssessmentsResponse apply(
                            ListSecurityAssessmentsRequest request) {
                        return client.listSecurityAssessments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.SecurityAssessmentSummary} objects
     * contained in responses from the listSecurityAssessments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.SecurityAssessmentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SecurityAssessmentSummary>
            listSecurityAssessmentsRecordIterator(final ListSecurityAssessmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityAssessmentsRequest.Builder, ListSecurityAssessmentsRequest,
                ListSecurityAssessmentsResponse,
                com.oracle.bmc.datasafe.model.SecurityAssessmentSummary>(
                new com.google.common.base.Supplier<ListSecurityAssessmentsRequest.Builder>() {
                    @Override
                    public ListSecurityAssessmentsRequest.Builder get() {
                        return ListSecurityAssessmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSecurityAssessmentsResponse, String>() {
                    @Override
                    public String apply(ListSecurityAssessmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAssessmentsRequest.Builder>,
                        ListSecurityAssessmentsRequest>() {
                    @Override
                    public ListSecurityAssessmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAssessmentsRequest.Builder>
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
                        ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>() {
                    @Override
                    public ListSecurityAssessmentsResponse apply(
                            ListSecurityAssessmentsRequest request) {
                        return client.listSecurityAssessments(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSecurityAssessmentsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentSummary>
                            apply(ListSecurityAssessmentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSensitiveColumns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSensitiveColumnsResponse> listSensitiveColumnsResponseIterator(
            final ListSensitiveColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSensitiveColumnsRequest.Builder, ListSensitiveColumnsRequest,
                ListSensitiveColumnsResponse>(
                new com.google.common.base.Supplier<ListSensitiveColumnsRequest.Builder>() {
                    @Override
                    public ListSensitiveColumnsRequest.Builder get() {
                        return ListSensitiveColumnsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSensitiveColumnsResponse, String>() {
                    @Override
                    public String apply(ListSensitiveColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveColumnsRequest.Builder>,
                        ListSensitiveColumnsRequest>() {
                    @Override
                    public ListSensitiveColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveColumnsRequest.Builder>
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
                        ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>() {
                    @Override
                    public ListSensitiveColumnsResponse apply(ListSensitiveColumnsRequest request) {
                        return client.listSensitiveColumns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.SensitiveColumnSummary} objects
     * contained in responses from the listSensitiveColumns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.SensitiveColumnSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SensitiveColumnSummary>
            listSensitiveColumnsRecordIterator(final ListSensitiveColumnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSensitiveColumnsRequest.Builder, ListSensitiveColumnsRequest,
                ListSensitiveColumnsResponse, com.oracle.bmc.datasafe.model.SensitiveColumnSummary>(
                new com.google.common.base.Supplier<ListSensitiveColumnsRequest.Builder>() {
                    @Override
                    public ListSensitiveColumnsRequest.Builder get() {
                        return ListSensitiveColumnsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSensitiveColumnsResponse, String>() {
                    @Override
                    public String apply(ListSensitiveColumnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveColumnsRequest.Builder>,
                        ListSensitiveColumnsRequest>() {
                    @Override
                    public ListSensitiveColumnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveColumnsRequest.Builder>
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
                        ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>() {
                    @Override
                    public ListSensitiveColumnsResponse apply(ListSensitiveColumnsRequest request) {
                        return client.listSensitiveColumns(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSensitiveColumnsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SensitiveColumnSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SensitiveColumnSummary>
                            apply(ListSensitiveColumnsResponse response) {
                        return response.getSensitiveColumnCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSensitiveDataModels operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSensitiveDataModelsResponse> listSensitiveDataModelsResponseIterator(
            final ListSensitiveDataModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSensitiveDataModelsRequest.Builder, ListSensitiveDataModelsRequest,
                ListSensitiveDataModelsResponse>(
                new com.google.common.base.Supplier<ListSensitiveDataModelsRequest.Builder>() {
                    @Override
                    public ListSensitiveDataModelsRequest.Builder get() {
                        return ListSensitiveDataModelsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSensitiveDataModelsResponse, String>() {
                    @Override
                    public String apply(ListSensitiveDataModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveDataModelsRequest.Builder>,
                        ListSensitiveDataModelsRequest>() {
                    @Override
                    public ListSensitiveDataModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveDataModelsRequest.Builder>
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
                        ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>() {
                    @Override
                    public ListSensitiveDataModelsResponse apply(
                            ListSensitiveDataModelsRequest request) {
                        return client.listSensitiveDataModels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.SensitiveDataModelSummary} objects
     * contained in responses from the listSensitiveDataModels operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.SensitiveDataModelSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SensitiveDataModelSummary>
            listSensitiveDataModelsRecordIterator(final ListSensitiveDataModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSensitiveDataModelsRequest.Builder, ListSensitiveDataModelsRequest,
                ListSensitiveDataModelsResponse,
                com.oracle.bmc.datasafe.model.SensitiveDataModelSummary>(
                new com.google.common.base.Supplier<ListSensitiveDataModelsRequest.Builder>() {
                    @Override
                    public ListSensitiveDataModelsRequest.Builder get() {
                        return ListSensitiveDataModelsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSensitiveDataModelsResponse, String>() {
                    @Override
                    public String apply(ListSensitiveDataModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveDataModelsRequest.Builder>,
                        ListSensitiveDataModelsRequest>() {
                    @Override
                    public ListSensitiveDataModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveDataModelsRequest.Builder>
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
                        ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>() {
                    @Override
                    public ListSensitiveDataModelsResponse apply(
                            ListSensitiveDataModelsRequest request) {
                        return client.listSensitiveDataModels(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSensitiveDataModelsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SensitiveDataModelSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SensitiveDataModelSummary>
                            apply(ListSensitiveDataModelsResponse response) {
                        return response.getSensitiveDataModelCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSensitiveTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSensitiveTypesResponse> listSensitiveTypesResponseIterator(
            final ListSensitiveTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSensitiveTypesRequest.Builder, ListSensitiveTypesRequest,
                ListSensitiveTypesResponse>(
                new com.google.common.base.Supplier<ListSensitiveTypesRequest.Builder>() {
                    @Override
                    public ListSensitiveTypesRequest.Builder get() {
                        return ListSensitiveTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSensitiveTypesResponse, String>() {
                    @Override
                    public String apply(ListSensitiveTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveTypesRequest.Builder>,
                        ListSensitiveTypesRequest>() {
                    @Override
                    public ListSensitiveTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveTypesRequest.Builder>
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
                        ListSensitiveTypesRequest, ListSensitiveTypesResponse>() {
                    @Override
                    public ListSensitiveTypesResponse apply(ListSensitiveTypesRequest request) {
                        return client.listSensitiveTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.SensitiveTypeSummary} objects
     * contained in responses from the listSensitiveTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.SensitiveTypeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SensitiveTypeSummary>
            listSensitiveTypesRecordIterator(final ListSensitiveTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSensitiveTypesRequest.Builder, ListSensitiveTypesRequest,
                ListSensitiveTypesResponse, com.oracle.bmc.datasafe.model.SensitiveTypeSummary>(
                new com.google.common.base.Supplier<ListSensitiveTypesRequest.Builder>() {
                    @Override
                    public ListSensitiveTypesRequest.Builder get() {
                        return ListSensitiveTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSensitiveTypesResponse, String>() {
                    @Override
                    public String apply(ListSensitiveTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSensitiveTypesRequest.Builder>,
                        ListSensitiveTypesRequest>() {
                    @Override
                    public ListSensitiveTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSensitiveTypesRequest.Builder>
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
                        ListSensitiveTypesRequest, ListSensitiveTypesResponse>() {
                    @Override
                    public ListSensitiveTypesResponse apply(ListSensitiveTypesRequest request) {
                        return client.listSensitiveTypes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSensitiveTypesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SensitiveTypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SensitiveTypeSummary> apply(
                            ListSensitiveTypesResponse response) {
                        return response.getSensitiveTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTables operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTablesResponse> listTablesResponseIterator(
            final ListTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTablesRequest.Builder, ListTablesRequest, ListTablesResponse>(
                new com.google.common.base.Supplier<ListTablesRequest.Builder>() {
                    @Override
                    public ListTablesRequest.Builder get() {
                        return ListTablesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTablesResponse, String>() {
                    @Override
                    public String apply(ListTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTablesRequest.Builder>,
                        ListTablesRequest>() {
                    @Override
                    public ListTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTablesRequest.Builder>
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
                new com.google.common.base.Function<ListTablesRequest, ListTablesResponse>() {
                    @Override
                    public ListTablesResponse apply(ListTablesRequest request) {
                        return client.listTables(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.TableSummary} objects
     * contained in responses from the listTables operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.TableSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.TableSummary> listTablesRecordIterator(
            final ListTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTablesRequest.Builder, ListTablesRequest, ListTablesResponse,
                com.oracle.bmc.datasafe.model.TableSummary>(
                new com.google.common.base.Supplier<ListTablesRequest.Builder>() {
                    @Override
                    public ListTablesRequest.Builder get() {
                        return ListTablesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTablesResponse, String>() {
                    @Override
                    public String apply(ListTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTablesRequest.Builder>,
                        ListTablesRequest>() {
                    @Override
                    public ListTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTablesRequest.Builder>
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
                new com.google.common.base.Function<ListTablesRequest, ListTablesResponse>() {
                    @Override
                    public ListTablesResponse apply(ListTablesRequest request) {
                        return client.listTables(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTablesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.TableSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.TableSummary> apply(
                            ListTablesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargetAlertPolicyAssociations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetAlertPolicyAssociationsResponse>
            listTargetAlertPolicyAssociationsResponseIterator(
                    final ListTargetAlertPolicyAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetAlertPolicyAssociationsRequest.Builder,
                ListTargetAlertPolicyAssociationsRequest,
                ListTargetAlertPolicyAssociationsResponse>(
                new com.google.common.base.Supplier<
                        ListTargetAlertPolicyAssociationsRequest.Builder>() {
                    @Override
                    public ListTargetAlertPolicyAssociationsRequest.Builder get() {
                        return ListTargetAlertPolicyAssociationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetAlertPolicyAssociationsResponse, String>() {
                    @Override
                    public String apply(ListTargetAlertPolicyAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetAlertPolicyAssociationsRequest.Builder>,
                        ListTargetAlertPolicyAssociationsRequest>() {
                    @Override
                    public ListTargetAlertPolicyAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetAlertPolicyAssociationsRequest.Builder>
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
                        ListTargetAlertPolicyAssociationsRequest,
                        ListTargetAlertPolicyAssociationsResponse>() {
                    @Override
                    public ListTargetAlertPolicyAssociationsResponse apply(
                            ListTargetAlertPolicyAssociationsRequest request) {
                        return client.listTargetAlertPolicyAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.TargetAlertPolicyAssociationSummary} objects
     * contained in responses from the listTargetAlertPolicyAssociations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.TargetAlertPolicyAssociationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.TargetAlertPolicyAssociationSummary>
            listTargetAlertPolicyAssociationsRecordIterator(
                    final ListTargetAlertPolicyAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetAlertPolicyAssociationsRequest.Builder,
                ListTargetAlertPolicyAssociationsRequest, ListTargetAlertPolicyAssociationsResponse,
                com.oracle.bmc.datasafe.model.TargetAlertPolicyAssociationSummary>(
                new com.google.common.base.Supplier<
                        ListTargetAlertPolicyAssociationsRequest.Builder>() {
                    @Override
                    public ListTargetAlertPolicyAssociationsRequest.Builder get() {
                        return ListTargetAlertPolicyAssociationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetAlertPolicyAssociationsResponse, String>() {
                    @Override
                    public String apply(ListTargetAlertPolicyAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetAlertPolicyAssociationsRequest.Builder>,
                        ListTargetAlertPolicyAssociationsRequest>() {
                    @Override
                    public ListTargetAlertPolicyAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetAlertPolicyAssociationsRequest.Builder>
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
                        ListTargetAlertPolicyAssociationsRequest,
                        ListTargetAlertPolicyAssociationsResponse>() {
                    @Override
                    public ListTargetAlertPolicyAssociationsResponse apply(
                            ListTargetAlertPolicyAssociationsRequest request) {
                        return client.listTargetAlertPolicyAssociations(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetAlertPolicyAssociationsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model
                                        .TargetAlertPolicyAssociationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model
                                            .TargetAlertPolicyAssociationSummary>
                            apply(ListTargetAlertPolicyAssociationsResponse response) {
                        return response.getTargetAlertPolicyAssociationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargetDatabases operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetDatabasesResponse> listTargetDatabasesResponseIterator(
            final ListTargetDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetDatabasesRequest.Builder, ListTargetDatabasesRequest,
                ListTargetDatabasesResponse>(
                new com.google.common.base.Supplier<ListTargetDatabasesRequest.Builder>() {
                    @Override
                    public ListTargetDatabasesRequest.Builder get() {
                        return ListTargetDatabasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTargetDatabasesResponse, String>() {
                    @Override
                    public String apply(ListTargetDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDatabasesRequest.Builder>,
                        ListTargetDatabasesRequest>() {
                    @Override
                    public ListTargetDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDatabasesRequest.Builder>
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
                        ListTargetDatabasesRequest, ListTargetDatabasesResponse>() {
                    @Override
                    public ListTargetDatabasesResponse apply(ListTargetDatabasesRequest request) {
                        return client.listTargetDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.TargetDatabaseSummary} objects
     * contained in responses from the listTargetDatabases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.TargetDatabaseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.TargetDatabaseSummary>
            listTargetDatabasesRecordIterator(final ListTargetDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetDatabasesRequest.Builder, ListTargetDatabasesRequest,
                ListTargetDatabasesResponse, com.oracle.bmc.datasafe.model.TargetDatabaseSummary>(
                new com.google.common.base.Supplier<ListTargetDatabasesRequest.Builder>() {
                    @Override
                    public ListTargetDatabasesRequest.Builder get() {
                        return ListTargetDatabasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTargetDatabasesResponse, String>() {
                    @Override
                    public String apply(ListTargetDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDatabasesRequest.Builder>,
                        ListTargetDatabasesRequest>() {
                    @Override
                    public ListTargetDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDatabasesRequest.Builder>
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
                        ListTargetDatabasesRequest, ListTargetDatabasesResponse>() {
                    @Override
                    public ListTargetDatabasesResponse apply(ListTargetDatabasesRequest request) {
                        return client.listTargetDatabases(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetDatabasesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.TargetDatabaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.TargetDatabaseSummary>
                            apply(ListTargetDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUserAnalytics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUserAnalyticsResponse> listUserAnalyticsResponseIterator(
            final ListUserAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUserAnalyticsRequest.Builder, ListUserAnalyticsRequest,
                ListUserAnalyticsResponse>(
                new com.google.common.base.Supplier<ListUserAnalyticsRequest.Builder>() {
                    @Override
                    public ListUserAnalyticsRequest.Builder get() {
                        return ListUserAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUserAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListUserAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserAnalyticsRequest.Builder>,
                        ListUserAnalyticsRequest>() {
                    @Override
                    public ListUserAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserAnalyticsRequest.Builder>
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
                        ListUserAnalyticsRequest, ListUserAnalyticsResponse>() {
                    @Override
                    public ListUserAnalyticsResponse apply(ListUserAnalyticsRequest request) {
                        return client.listUserAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.UserAggregation} objects
     * contained in responses from the listUserAnalytics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.UserAggregation} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.UserAggregation> listUserAnalyticsRecordIterator(
            final ListUserAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUserAnalyticsRequest.Builder, ListUserAnalyticsRequest,
                ListUserAnalyticsResponse, com.oracle.bmc.datasafe.model.UserAggregation>(
                new com.google.common.base.Supplier<ListUserAnalyticsRequest.Builder>() {
                    @Override
                    public ListUserAnalyticsRequest.Builder get() {
                        return ListUserAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUserAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListUserAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserAnalyticsRequest.Builder>,
                        ListUserAnalyticsRequest>() {
                    @Override
                    public ListUserAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserAnalyticsRequest.Builder>
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
                        ListUserAnalyticsRequest, ListUserAnalyticsResponse>() {
                    @Override
                    public ListUserAnalyticsResponse apply(ListUserAnalyticsRequest request) {
                        return client.listUserAnalytics(request);
                    }
                },
                new com.google.common.base.Function<
                        ListUserAnalyticsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.UserAggregation>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.UserAggregation> apply(
                            ListUserAnalyticsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUserAssessments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUserAssessmentsResponse> listUserAssessmentsResponseIterator(
            final ListUserAssessmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUserAssessmentsRequest.Builder, ListUserAssessmentsRequest,
                ListUserAssessmentsResponse>(
                new com.google.common.base.Supplier<ListUserAssessmentsRequest.Builder>() {
                    @Override
                    public ListUserAssessmentsRequest.Builder get() {
                        return ListUserAssessmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUserAssessmentsResponse, String>() {
                    @Override
                    public String apply(ListUserAssessmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserAssessmentsRequest.Builder>,
                        ListUserAssessmentsRequest>() {
                    @Override
                    public ListUserAssessmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserAssessmentsRequest.Builder>
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
                        ListUserAssessmentsRequest, ListUserAssessmentsResponse>() {
                    @Override
                    public ListUserAssessmentsResponse apply(ListUserAssessmentsRequest request) {
                        return client.listUserAssessments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.UserAssessmentSummary} objects
     * contained in responses from the listUserAssessments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.UserAssessmentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.UserAssessmentSummary>
            listUserAssessmentsRecordIterator(final ListUserAssessmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUserAssessmentsRequest.Builder, ListUserAssessmentsRequest,
                ListUserAssessmentsResponse, com.oracle.bmc.datasafe.model.UserAssessmentSummary>(
                new com.google.common.base.Supplier<ListUserAssessmentsRequest.Builder>() {
                    @Override
                    public ListUserAssessmentsRequest.Builder get() {
                        return ListUserAssessmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUserAssessmentsResponse, String>() {
                    @Override
                    public String apply(ListUserAssessmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserAssessmentsRequest.Builder>,
                        ListUserAssessmentsRequest>() {
                    @Override
                    public ListUserAssessmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserAssessmentsRequest.Builder>
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
                        ListUserAssessmentsRequest, ListUserAssessmentsResponse>() {
                    @Override
                    public ListUserAssessmentsResponse apply(ListUserAssessmentsRequest request) {
                        return client.listUserAssessments(request);
                    }
                },
                new com.google.common.base.Function<
                        ListUserAssessmentsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.UserAssessmentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.UserAssessmentSummary>
                            apply(ListUserAssessmentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUsers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUsersResponse> listUsersResponseIterator(final ListUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUsersRequest.Builder, ListUsersRequest, ListUsersResponse>(
                new com.google.common.base.Supplier<ListUsersRequest.Builder>() {
                    @Override
                    public ListUsersRequest.Builder get() {
                        return ListUsersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUsersResponse, String>() {
                    @Override
                    public String apply(ListUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsersRequest.Builder>,
                        ListUsersRequest>() {
                    @Override
                    public ListUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsersRequest.Builder>
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
                new com.google.common.base.Function<ListUsersRequest, ListUsersResponse>() {
                    @Override
                    public ListUsersResponse apply(ListUsersRequest request) {
                        return client.listUsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.UserSummary} objects
     * contained in responses from the listUsers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.UserSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.UserSummary> listUsersRecordIterator(
            final ListUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUsersRequest.Builder, ListUsersRequest, ListUsersResponse,
                com.oracle.bmc.datasafe.model.UserSummary>(
                new com.google.common.base.Supplier<ListUsersRequest.Builder>() {
                    @Override
                    public ListUsersRequest.Builder get() {
                        return ListUsersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUsersResponse, String>() {
                    @Override
                    public String apply(ListUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsersRequest.Builder>,
                        ListUsersRequest>() {
                    @Override
                    public ListUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsersRequest.Builder>
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
                new com.google.common.base.Function<ListUsersRequest, ListUsersResponse>() {
                    @Override
                    public ListUsersResponse apply(ListUsersRequest request) {
                        return client.listUsers(request);
                    }
                },
                new com.google.common.base.Function<
                        ListUsersResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.UserSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.UserSummary> apply(
                            ListUsersResponse response) {
                        return response.getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.datasafe.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.datasafe.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.datasafe.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.datasafe.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.WorkRequestLogEntry> apply(
                            ListWorkRequestLogsResponse response) {
                        return response.getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.datasafe.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.datasafe.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
