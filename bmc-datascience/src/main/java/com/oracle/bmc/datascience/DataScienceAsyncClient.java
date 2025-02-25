/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience;

import com.oracle.bmc.datascience.internal.http.*;
import com.oracle.bmc.datascience.requests.*;
import com.oracle.bmc.datascience.responses.*;
import javax.annotation.Nonnull;

/**
 * Async client implementation for DataScience service. <br/>
 * There are two ways to use async client:
 * 1. Use AsyncHandler: using AsyncHandler, if the response to the call is an {@link java.io.InputStream}, like
 * getObject Api in object storage service, developers need to process the stream in AsyncHandler, and not anywhere else,
 * because the stream will be closed right after the AsyncHandler is invoked. <br/>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done with the Java Future.<br/>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or the AsyncHandler,
 * but not both.  If the Future is used, the caller should pass in null as the AsyncHandler.  If the AsyncHandler
 * is used, it is still safe to use the Future to determine whether or not the request was completed via
 * Future.isDone/isCancelled.<br/>
 * Please refer to https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class DataScienceAsyncClient implements DataScienceAsync {
    /**
     * Service instance for DataScience.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATASCIENCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datascience.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataScienceAsyncClient.class);

    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public DataScienceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DataScienceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public DataScienceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                        com.oracle.bmc.http.signing.SigningStrategy.STANDARD));
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public DataScienceAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                new java.util.ArrayList<com.oracle.bmc.http.ClientConfigurator>());
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     */
    public DataScienceAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                additionalClientConfigurators,
                null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public DataScienceAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory
                        .createDefaultRequestSignerFactories(),
                additionalClientConfigurators,
                endpoint);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public DataScienceAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                signingStrategyRequestSignerFactories,
                additionalClientConfigurators,
                endpoint,
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder());
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     * @param restClientFactoryBuilder the builder for the {@link com.oracle.bmc.http.internal.RestClientFactory}
     */
    public DataScienceAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            com.oracle.bmc.http.internal.RestClientFactoryBuilder restClientFactoryBuilder) {
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        java.util.List<com.oracle.bmc.http.ClientConfigurator> authenticationDetailsConfigurators =
                new java.util.ArrayList<>();
        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.ProvidesClientConfigurators) {
            authenticationDetailsConfigurators.addAll(
                    ((com.oracle.bmc.auth.ProvidesClientConfigurators)
                                    this.authenticationDetailsProvider)
                            .getClientConfigurators());
        }
        java.util.List<com.oracle.bmc.http.ClientConfigurator> allConfigurators =
                new java.util.ArrayList<>(additionalClientConfigurators);
        allConfigurators.addAll(authenticationDetailsConfigurators);
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                restClientFactoryBuilder
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(allConfigurators)
                        .build();
        boolean isNonBufferingApacheClient =
                com.oracle.bmc.http.ApacheUtils.isNonBufferingClientConfigurator(
                        restClientFactory.getClientConfigurator());
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner =
                defaultRequestSignerFactory.createRequestSigner(
                        SERVICE, this.authenticationDetailsProvider);
        java.util.Map<
                        com.oracle.bmc.http.signing.SigningStrategy,
                        com.oracle.bmc.http.signing.RequestSigner>
                requestSigners = new java.util.HashMap<>();
        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.BasicAuthenticationDetailsProvider) {
            for (com.oracle.bmc.http.signing.SigningStrategy s :
                    com.oracle.bmc.http.signing.SigningStrategy.values()) {
                requestSigners.put(
                        s,
                        signingStrategyRequestSignerFactories
                                .get(s)
                                .createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }
        this.client =
                restClientFactory.create(
                        defaultRequestSigner,
                        requestSigners,
                        configuration,
                        isNonBufferingApacheClient);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider =
                    (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                this.setRegion(provider.getRegion());
                if (endpoint != null) {
                    LOG.info(
                            "Authentication details provider configured for region '{}', but endpoint specifically set to '{}'. Using endpoint setting instead of region.",
                            provider.getRegion(),
                            endpoint);
                }
            }
        }
        if (endpoint != null) {
            setEndpoint(endpoint);
        }
    }

    /**
     * Create a builder for this client.
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be passed to the
     * {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataScienceAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public DataScienceAsyncClient build(
                @Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DataScienceAsyncClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint);
        }
    }

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
    }

    @Override
    public String getEndpoint() {
        String endpoint = null;
        java.net.URI uri = client.getBaseTarget().getUri();
        if (uri != null) {
            endpoint = uri.toString();
        }
        return endpoint;
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        com.google.common.base.Optional<String> endpoint = region.getEndpoint(SERVICE);
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + SERVICE + " is not known in region " + region);
        }
    }

    @Override
    public void setRegion(String regionId) {
        regionId = regionId.toLowerCase(java.util.Locale.ENGLISH);
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<ActivateModelResponse> activateModel(
            ActivateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ActivateModelRequest, ActivateModelResponse>
                    handler) {
        LOG.trace("Called async activateModel");
        final ActivateModelRequest interceptedRequest =
                ActivateModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateModelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ActivateModelResponse>
                transformer = ActivateModelConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ActivateModel",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/ActivateModel");

        com.oracle.bmc.responses.AsyncHandler<ActivateModelRequest, ActivateModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateModelRequest, ActivateModelResponse>,
                        java.util.concurrent.Future<ActivateModelResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateModelRequest, ActivateModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ActivateModelDeploymentResponse> activateModelDeployment(
            ActivateModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateModelDeploymentRequest, ActivateModelDeploymentResponse>
                    handler) {
        LOG.trace("Called async activateModelDeployment");
        final ActivateModelDeploymentRequest interceptedRequest =
                ActivateModelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateModelDeploymentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ActivateModelDeploymentResponse>
                transformer = ActivateModelDeploymentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ActivateModelDeployment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/ActivateModelDeployment");

        com.oracle.bmc.responses.AsyncHandler<
                        ActivateModelDeploymentRequest, ActivateModelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateModelDeploymentRequest, ActivateModelDeploymentResponse>,
                        java.util.concurrent.Future<ActivateModelDeploymentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateModelDeploymentRequest, ActivateModelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ActivateNotebookSessionResponse> activateNotebookSession(
            ActivateNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateNotebookSessionRequest, ActivateNotebookSessionResponse>
                    handler) {
        LOG.trace("Called async activateNotebookSession");
        final ActivateNotebookSessionRequest interceptedRequest =
                ActivateNotebookSessionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateNotebookSessionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ActivateNotebookSessionResponse>
                transformer = ActivateNotebookSessionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ActivateNotebookSession",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/ActivateNotebookSession");

        com.oracle.bmc.responses.AsyncHandler<
                        ActivateNotebookSessionRequest, ActivateNotebookSessionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateNotebookSessionRequest, ActivateNotebookSessionResponse>,
                        java.util.concurrent.Future<ActivateNotebookSessionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateNotebookSessionRequest, ActivateNotebookSessionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelJobRunResponse> cancelJobRun(
            CancelJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CancelJobRunRequest, CancelJobRunResponse>
                    handler) {
        LOG.trace("Called async cancelJobRun");
        final CancelJobRunRequest interceptedRequest =
                CancelJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelJobRunConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CancelJobRunResponse>
                transformer = CancelJobRunConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "CancelJobRun",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/CancelJobRun");

        com.oracle.bmc.responses.AsyncHandler<CancelJobRunRequest, CancelJobRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelJobRunRequest, CancelJobRunResponse>,
                        java.util.concurrent.Future<CancelJobRunResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelJobRunRequest, CancelJobRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {
        LOG.trace("Called async cancelWorkRequest");
        final CancelWorkRequestRequest interceptedRequest =
                CancelWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelWorkRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CancelWorkRequestResponse>
                transformer = CancelWorkRequestConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "CancelWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequest/CancelWorkRequest");

        com.oracle.bmc.responses.AsyncHandler<CancelWorkRequestRequest, CancelWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelWorkRequestRequest, CancelWorkRequestResponse>,
                        java.util.concurrent.Future<CancelWorkRequestResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelWorkRequestRequest, CancelWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeJobCompartmentResponse> changeJobCompartment(
            ChangeJobCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeJobCompartment");
        final ChangeJobCompartmentRequest interceptedRequest =
                ChangeJobCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeJobCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeJobCompartmentResponse>
                transformer = ChangeJobCompartmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ChangeJobCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/ChangeJobCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>,
                        java.util.concurrent.Future<ChangeJobCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeJobCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeJobRunCompartmentResponse> changeJobRunCompartment(
            ChangeJobRunCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobRunCompartmentRequest, ChangeJobRunCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeJobRunCompartment");
        final ChangeJobRunCompartmentRequest interceptedRequest =
                ChangeJobRunCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeJobRunCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeJobRunCompartmentResponse>
                transformer = ChangeJobRunCompartmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ChangeJobRunCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/ChangeJobRunCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeJobRunCompartmentRequest, ChangeJobRunCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeJobRunCompartmentRequest, ChangeJobRunCompartmentResponse>,
                        java.util.concurrent.Future<ChangeJobRunCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeJobRunCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeJobRunCompartmentRequest, ChangeJobRunCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeModelCompartmentResponse> changeModelCompartment(
            ChangeModelCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeModelCompartment");
        final ChangeModelCompartmentRequest interceptedRequest =
                ChangeModelCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeModelCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeModelCompartmentResponse>
                transformer = ChangeModelCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ChangeModelCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/ChangeModelCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>,
                        java.util.concurrent.Future<ChangeModelCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeModelCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeModelDeploymentCompartmentResponse>
            changeModelDeploymentCompartment(
                    ChangeModelDeploymentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeModelDeploymentCompartmentRequest,
                                    ChangeModelDeploymentCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeModelDeploymentCompartment");
        final ChangeModelDeploymentCompartmentRequest interceptedRequest =
                ChangeModelDeploymentCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeModelDeploymentCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeModelDeploymentCompartmentResponse>
                transformer = ChangeModelDeploymentCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ChangeModelDeploymentCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/ChangeModelDeploymentCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeModelDeploymentCompartmentRequest,
                        ChangeModelDeploymentCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeModelDeploymentCompartmentRequest,
                                ChangeModelDeploymentCompartmentResponse>,
                        java.util.concurrent.Future<ChangeModelDeploymentCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeModelDeploymentCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeModelDeploymentCompartmentRequest,
                    ChangeModelDeploymentCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeNotebookSessionCompartmentResponse>
            changeNotebookSessionCompartment(
                    ChangeNotebookSessionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNotebookSessionCompartmentRequest,
                                    ChangeNotebookSessionCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeNotebookSessionCompartment");
        final ChangeNotebookSessionCompartmentRequest interceptedRequest =
                ChangeNotebookSessionCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeNotebookSessionCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeNotebookSessionCompartmentResponse>
                transformer = ChangeNotebookSessionCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ChangeNotebookSessionCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/ChangeNotebookSessionCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeNotebookSessionCompartmentRequest,
                        ChangeNotebookSessionCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeNotebookSessionCompartmentRequest,
                                ChangeNotebookSessionCompartmentResponse>,
                        java.util.concurrent.Future<ChangeNotebookSessionCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeNotebookSessionCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeNotebookSessionCompartmentRequest,
                    ChangeNotebookSessionCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeProjectCompartmentResponse> changeProjectCompartment(
            ChangeProjectCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeProjectCompartment");
        final ChangeProjectCompartmentRequest interceptedRequest =
                ChangeProjectCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeProjectCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeProjectCompartmentResponse>
                transformer = ChangeProjectCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ChangeProjectCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/ChangeProjectCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>,
                        java.util.concurrent.Future<ChangeProjectCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeProjectCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateJobResponse> createJob(
            CreateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse>
                    handler) {
        LOG.trace("Called async createJob");
        final CreateJobRequest interceptedRequest = CreateJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateJobResponse>
                transformer = CreateJobConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "CreateJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/CreateJob");

        com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse>,
                        java.util.concurrent.Future<CreateJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateJobRequest, CreateJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateJobArtifactResponse> createJobArtifact(
            CreateJobArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateJobArtifactRequest, CreateJobArtifactResponse>
                    handler) {
        LOG.trace("Called async createJobArtifact");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, CreateJobArtifactRequest.builder());
        }
        final CreateJobArtifactRequest interceptedRequest =
                CreateJobArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateJobArtifactConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateJobArtifactResponse>
                transformer = CreateJobArtifactConverter.fromResponse();

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "CreateJobArtifact",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/CreateJobArtifact");

        com.oracle.bmc.responses.AsyncHandler<CreateJobArtifactRequest, CreateJobArtifactResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateJobArtifactRequest, CreateJobArtifactResponse>,
                        java.util.concurrent.Future<CreateJobArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getJobArtifact(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateJobArtifactRequest, CreateJobArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getJobArtifact(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateJobRunResponse> createJobRun(
            CreateJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateJobRunRequest, CreateJobRunResponse>
                    handler) {
        LOG.trace("Called async createJobRun");
        final CreateJobRunRequest interceptedRequest =
                CreateJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateJobRunConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateJobRunResponse>
                transformer = CreateJobRunConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "CreateJobRun",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/CreateJobRun");

        com.oracle.bmc.responses.AsyncHandler<CreateJobRunRequest, CreateJobRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateJobRunRequest, CreateJobRunResponse>,
                        java.util.concurrent.Future<CreateJobRunResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateJobRunDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateJobRunRequest, CreateJobRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelResponse> createModel(
            CreateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateModelRequest, CreateModelResponse>
                    handler) {
        LOG.trace("Called async createModel");
        final CreateModelRequest interceptedRequest =
                CreateModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateModelResponse>
                transformer = CreateModelConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "CreateModel",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModel");

        com.oracle.bmc.responses.AsyncHandler<CreateModelRequest, CreateModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelRequest, CreateModelResponse>,
                        java.util.concurrent.Future<CreateModelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelRequest, CreateModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelArtifactResponse> createModelArtifact(
            CreateModelArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelArtifactRequest, CreateModelArtifactResponse>
                    handler) {
        LOG.trace("Called async createModelArtifact");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, CreateModelArtifactRequest.builder());
        }
        final CreateModelArtifactRequest interceptedRequest =
                CreateModelArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelArtifactConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateModelArtifactResponse>
                transformer = CreateModelArtifactConverter.fromResponse();

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "CreateModelArtifact",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModelArtifact");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateModelArtifactRequest, CreateModelArtifactResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelArtifactRequest, CreateModelArtifactResponse>,
                        java.util.concurrent.Future<CreateModelArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getModelArtifact(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelArtifactRequest, CreateModelArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getModelArtifact(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelDeploymentResponse> createModelDeployment(
            CreateModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelDeploymentRequest, CreateModelDeploymentResponse>
                    handler) {
        LOG.trace("Called async createModelDeployment");
        final CreateModelDeploymentRequest interceptedRequest =
                CreateModelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelDeploymentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateModelDeploymentResponse>
                transformer = CreateModelDeploymentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "CreateModelDeployment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/CreateModelDeployment");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateModelDeploymentRequest, CreateModelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelDeploymentRequest, CreateModelDeploymentResponse>,
                        java.util.concurrent.Future<CreateModelDeploymentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateModelDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelDeploymentRequest, CreateModelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelProvenanceResponse> createModelProvenance(
            CreateModelProvenanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelProvenanceRequest, CreateModelProvenanceResponse>
                    handler) {
        LOG.trace("Called async createModelProvenance");
        final CreateModelProvenanceRequest interceptedRequest =
                CreateModelProvenanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelProvenanceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateModelProvenanceResponse>
                transformer = CreateModelProvenanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "CreateModelProvenance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModelProvenance");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateModelProvenanceRequest, CreateModelProvenanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelProvenanceRequest, CreateModelProvenanceResponse>,
                        java.util.concurrent.Future<CreateModelProvenanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateModelProvenanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelProvenanceRequest, CreateModelProvenanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookSessionResponse> createNotebookSession(
            CreateNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNotebookSessionRequest, CreateNotebookSessionResponse>
                    handler) {
        LOG.trace("Called async createNotebookSession");
        final CreateNotebookSessionRequest interceptedRequest =
                CreateNotebookSessionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNotebookSessionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateNotebookSessionResponse>
                transformer = CreateNotebookSessionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "CreateNotebookSession",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/CreateNotebookSession");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateNotebookSessionRequest, CreateNotebookSessionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNotebookSessionRequest, CreateNotebookSessionResponse>,
                        java.util.concurrent.Future<CreateNotebookSessionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNotebookSessionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNotebookSessionRequest, CreateNotebookSessionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResponse> createProject(
            CreateProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                    handler) {
        LOG.trace("Called async createProject");
        final CreateProjectRequest interceptedRequest =
                CreateProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateProjectConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateProjectResponse>
                transformer = CreateProjectConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "CreateProject",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/CreateProject");

        com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateProjectRequest, CreateProjectResponse>,
                        java.util.concurrent.Future<CreateProjectResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateProjectDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateProjectRequest, CreateProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeactivateModelResponse> deactivateModel(
            DeactivateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateModelRequest, DeactivateModelResponse>
                    handler) {
        LOG.trace("Called async deactivateModel");
        final DeactivateModelRequest interceptedRequest =
                DeactivateModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateModelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeactivateModelResponse>
                transformer = DeactivateModelConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "DeactivateModel",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/DeactivateModel");

        com.oracle.bmc.responses.AsyncHandler<DeactivateModelRequest, DeactivateModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeactivateModelRequest, DeactivateModelResponse>,
                        java.util.concurrent.Future<DeactivateModelResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeactivateModelRequest, DeactivateModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeactivateModelDeploymentResponse> deactivateModelDeployment(
            DeactivateModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateModelDeploymentRequest, DeactivateModelDeploymentResponse>
                    handler) {
        LOG.trace("Called async deactivateModelDeployment");
        final DeactivateModelDeploymentRequest interceptedRequest =
                DeactivateModelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateModelDeploymentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeactivateModelDeploymentResponse>
                transformer = DeactivateModelDeploymentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "DeactivateModelDeployment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/DeactivateModelDeployment");

        com.oracle.bmc.responses.AsyncHandler<
                        DeactivateModelDeploymentRequest, DeactivateModelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeactivateModelDeploymentRequest,
                                DeactivateModelDeploymentResponse>,
                        java.util.concurrent.Future<DeactivateModelDeploymentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeactivateModelDeploymentRequest, DeactivateModelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeactivateNotebookSessionResponse> deactivateNotebookSession(
            DeactivateNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateNotebookSessionRequest, DeactivateNotebookSessionResponse>
                    handler) {
        LOG.trace("Called async deactivateNotebookSession");
        final DeactivateNotebookSessionRequest interceptedRequest =
                DeactivateNotebookSessionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateNotebookSessionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeactivateNotebookSessionResponse>
                transformer = DeactivateNotebookSessionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "DeactivateNotebookSession",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/DeactivateNotebookSession");

        com.oracle.bmc.responses.AsyncHandler<
                        DeactivateNotebookSessionRequest, DeactivateNotebookSessionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeactivateNotebookSessionRequest,
                                DeactivateNotebookSessionResponse>,
                        java.util.concurrent.Future<DeactivateNotebookSessionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeactivateNotebookSessionRequest, DeactivateNotebookSessionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResponse> deleteJob(
            DeleteJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse>
                    handler) {
        LOG.trace("Called async deleteJob");
        final DeleteJobRequest interceptedRequest = DeleteJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteJobResponse>
                transformer = DeleteJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "DeleteJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/DeleteJob");

        com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse>,
                        java.util.concurrent.Future<DeleteJobResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteJobRequest, DeleteJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteJobRunResponse> deleteJobRun(
            DeleteJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteJobRunRequest, DeleteJobRunResponse>
                    handler) {
        LOG.trace("Called async deleteJobRun");
        final DeleteJobRunRequest interceptedRequest =
                DeleteJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteJobRunConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteJobRunResponse>
                transformer = DeleteJobRunConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "DeleteJobRun",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/DeleteJobRun");

        com.oracle.bmc.responses.AsyncHandler<DeleteJobRunRequest, DeleteJobRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteJobRunRequest, DeleteJobRunResponse>,
                        java.util.concurrent.Future<DeleteJobRunResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteJobRunRequest, DeleteJobRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResponse> deleteModel(
            DeleteModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteModelRequest, DeleteModelResponse>
                    handler) {
        LOG.trace("Called async deleteModel");
        final DeleteModelRequest interceptedRequest =
                DeleteModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteModelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteModelResponse>
                transformer = DeleteModelConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "DeleteModel",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/DeleteModel");

        com.oracle.bmc.responses.AsyncHandler<DeleteModelRequest, DeleteModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteModelRequest, DeleteModelResponse>,
                        java.util.concurrent.Future<DeleteModelResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteModelRequest, DeleteModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteModelDeploymentResponse> deleteModelDeployment(
            DeleteModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteModelDeploymentRequest, DeleteModelDeploymentResponse>
                    handler) {
        LOG.trace("Called async deleteModelDeployment");
        final DeleteModelDeploymentRequest interceptedRequest =
                DeleteModelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteModelDeploymentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteModelDeploymentResponse>
                transformer = DeleteModelDeploymentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "DeleteModelDeployment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/DeleteModelDeployment");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteModelDeploymentRequest, DeleteModelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteModelDeploymentRequest, DeleteModelDeploymentResponse>,
                        java.util.concurrent.Future<DeleteModelDeploymentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteModelDeploymentRequest, DeleteModelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookSessionResponse> deleteNotebookSession(
            DeleteNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNotebookSessionRequest, DeleteNotebookSessionResponse>
                    handler) {
        LOG.trace("Called async deleteNotebookSession");
        final DeleteNotebookSessionRequest interceptedRequest =
                DeleteNotebookSessionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNotebookSessionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteNotebookSessionResponse>
                transformer = DeleteNotebookSessionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "DeleteNotebookSession",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/DeleteNotebookSession");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteNotebookSessionRequest, DeleteNotebookSessionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNotebookSessionRequest, DeleteNotebookSessionResponse>,
                        java.util.concurrent.Future<DeleteNotebookSessionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNotebookSessionRequest, DeleteNotebookSessionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResponse> deleteProject(
            DeleteProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                    handler) {
        LOG.trace("Called async deleteProject");
        final DeleteProjectRequest interceptedRequest =
                DeleteProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteProjectConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteProjectResponse>
                transformer = DeleteProjectConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "DeleteProject",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/DeleteProject");

        com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteProjectRequest, DeleteProjectResponse>,
                        java.util.concurrent.Future<DeleteProjectResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteProjectRequest, DeleteProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler) {
        LOG.trace("Called async getJob");
        final GetJobRequest interceptedRequest = GetJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetJobResponse>
                transformer = GetJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "GetJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/GetJob");

        com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse>,
                        java.util.concurrent.Future<GetJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobRequest, GetJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobArtifactContentResponse> getJobArtifactContent(
            GetJobArtifactContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJobArtifactContentRequest, GetJobArtifactContentResponse>
                    handler) {
        LOG.trace("Called async getJobArtifactContent");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "getJobArtifactContent returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final GetJobArtifactContentRequest interceptedRequest =
                GetJobArtifactContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobArtifactContentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetJobArtifactContentResponse>
                transformer = GetJobArtifactContentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "GetJobArtifactContent",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/GetJobArtifactContent");

        com.oracle.bmc.responses.AsyncHandler<
                        GetJobArtifactContentRequest, GetJobArtifactContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetJobArtifactContentRequest, GetJobArtifactContentResponse>,
                        java.util.concurrent.Future<GetJobArtifactContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobArtifactContentRequest, GetJobArtifactContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobRunResponse> getJobRun(
            GetJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse>
                    handler) {
        LOG.trace("Called async getJobRun");
        final GetJobRunRequest interceptedRequest = GetJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobRunConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetJobRunResponse>
                transformer = GetJobRunConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "GetJobRun",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/GetJobRun");

        com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse>,
                        java.util.concurrent.Future<GetJobRunResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobRunRequest, GetJobRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelResponse> getModel(
            GetModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse>
                    handler) {
        LOG.trace("Called async getModel");
        final GetModelRequest interceptedRequest = GetModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetModelResponse>
                transformer = GetModelConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "GetModel",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModel");

        com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse>,
                        java.util.concurrent.Future<GetModelResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelRequest, GetModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelArtifactContentResponse> getModelArtifactContent(
            GetModelArtifactContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModelArtifactContentRequest, GetModelArtifactContentResponse>
                    handler) {
        LOG.trace("Called async getModelArtifactContent");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "getModelArtifactContent returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final GetModelArtifactContentRequest interceptedRequest =
                GetModelArtifactContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelArtifactContentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetModelArtifactContentResponse>
                transformer = GetModelArtifactContentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "GetModelArtifactContent",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModelArtifactContent");

        com.oracle.bmc.responses.AsyncHandler<
                        GetModelArtifactContentRequest, GetModelArtifactContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModelArtifactContentRequest, GetModelArtifactContentResponse>,
                        java.util.concurrent.Future<GetModelArtifactContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelArtifactContentRequest, GetModelArtifactContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelDeploymentResponse> getModelDeployment(
            GetModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModelDeploymentRequest, GetModelDeploymentResponse>
                    handler) {
        LOG.trace("Called async getModelDeployment");
        final GetModelDeploymentRequest interceptedRequest =
                GetModelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelDeploymentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetModelDeploymentResponse>
                transformer = GetModelDeploymentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "GetModelDeployment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/GetModelDeployment");

        com.oracle.bmc.responses.AsyncHandler<GetModelDeploymentRequest, GetModelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModelDeploymentRequest, GetModelDeploymentResponse>,
                        java.util.concurrent.Future<GetModelDeploymentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelDeploymentRequest, GetModelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelProvenanceResponse> getModelProvenance(
            GetModelProvenanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModelProvenanceRequest, GetModelProvenanceResponse>
                    handler) {
        LOG.trace("Called async getModelProvenance");
        final GetModelProvenanceRequest interceptedRequest =
                GetModelProvenanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelProvenanceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetModelProvenanceResponse>
                transformer = GetModelProvenanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "GetModelProvenance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModelProvenance");

        com.oracle.bmc.responses.AsyncHandler<GetModelProvenanceRequest, GetModelProvenanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModelProvenanceRequest, GetModelProvenanceResponse>,
                        java.util.concurrent.Future<GetModelProvenanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelProvenanceRequest, GetModelProvenanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNotebookSessionResponse> getNotebookSession(
            GetNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNotebookSessionRequest, GetNotebookSessionResponse>
                    handler) {
        LOG.trace("Called async getNotebookSession");
        final GetNotebookSessionRequest interceptedRequest =
                GetNotebookSessionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNotebookSessionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetNotebookSessionResponse>
                transformer = GetNotebookSessionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "GetNotebookSession",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/GetNotebookSession");

        com.oracle.bmc.responses.AsyncHandler<GetNotebookSessionRequest, GetNotebookSessionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNotebookSessionRequest, GetNotebookSessionResponse>,
                        java.util.concurrent.Future<GetNotebookSessionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNotebookSessionRequest, GetNotebookSessionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetProjectResponse> getProject(
            GetProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse>
                    handler) {
        LOG.trace("Called async getProject");
        final GetProjectRequest interceptedRequest = GetProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProjectConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetProjectResponse>
                transformer = GetProjectConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "GetProject",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/GetProject");

        com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetProjectRequest, GetProjectResponse>,
                        java.util.concurrent.Future<GetProjectResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetProjectRequest, GetProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {
        LOG.trace("Called async getWorkRequest");
        final GetWorkRequestRequest interceptedRequest =
                GetWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWorkRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer = GetWorkRequestConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "GetWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequest/GetWorkRequest");

        com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWorkRequestRequest, GetWorkRequestResponse>,
                        java.util.concurrent.Future<GetWorkRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWorkRequestRequest, GetWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<HeadJobArtifactResponse> headJobArtifact(
            HeadJobArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            HeadJobArtifactRequest, HeadJobArtifactResponse>
                    handler) {
        LOG.trace("Called async headJobArtifact");
        final HeadJobArtifactRequest interceptedRequest =
                HeadJobArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadJobArtifactConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, HeadJobArtifactResponse>
                transformer = HeadJobArtifactConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "HeadJobArtifact",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/HeadJobArtifact");

        com.oracle.bmc.responses.AsyncHandler<HeadJobArtifactRequest, HeadJobArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                HeadJobArtifactRequest, HeadJobArtifactResponse>,
                        java.util.concurrent.Future<HeadJobArtifactResponse>>
                futureSupplier = client.headFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    HeadJobArtifactRequest, HeadJobArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<HeadModelArtifactResponse> headModelArtifact(
            HeadModelArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            HeadModelArtifactRequest, HeadModelArtifactResponse>
                    handler) {
        LOG.trace("Called async headModelArtifact");
        final HeadModelArtifactRequest interceptedRequest =
                HeadModelArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadModelArtifactConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, HeadModelArtifactResponse>
                transformer = HeadModelArtifactConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "HeadModelArtifact",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/HeadModelArtifact");

        com.oracle.bmc.responses.AsyncHandler<HeadModelArtifactRequest, HeadModelArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                HeadModelArtifactRequest, HeadModelArtifactResponse>,
                        java.util.concurrent.Future<HeadModelArtifactResponse>>
                futureSupplier = client.headFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    HeadModelArtifactRequest, HeadModelArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFastLaunchJobConfigsResponse> listFastLaunchJobConfigs(
            ListFastLaunchJobConfigsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFastLaunchJobConfigsRequest, ListFastLaunchJobConfigsResponse>
                    handler) {
        LOG.trace("Called async listFastLaunchJobConfigs");
        final ListFastLaunchJobConfigsRequest interceptedRequest =
                ListFastLaunchJobConfigsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFastLaunchJobConfigsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListFastLaunchJobConfigsResponse>
                transformer = ListFastLaunchJobConfigsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListFastLaunchJobConfigs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/FastLaunchJobConfigSummary/ListFastLaunchJobConfigs");

        com.oracle.bmc.responses.AsyncHandler<
                        ListFastLaunchJobConfigsRequest, ListFastLaunchJobConfigsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFastLaunchJobConfigsRequest, ListFastLaunchJobConfigsResponse>,
                        java.util.concurrent.Future<ListFastLaunchJobConfigsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFastLaunchJobConfigsRequest, ListFastLaunchJobConfigsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobRunsResponse> listJobRuns(
            ListJobRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse>
                    handler) {
        LOG.trace("Called async listJobRuns");
        final ListJobRunsRequest interceptedRequest =
                ListJobRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobRunsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListJobRunsResponse>
                transformer = ListJobRunsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListJobRuns",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRunSummary/ListJobRuns");

        com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJobRunsRequest, ListJobRunsResponse>,
                        java.util.concurrent.Future<ListJobRunsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobRunsRequest, ListJobRunsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobShapesResponse> listJobShapes(
            ListJobShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobShapesRequest, ListJobShapesResponse>
                    handler) {
        LOG.trace("Called async listJobShapes");
        final ListJobShapesRequest interceptedRequest =
                ListJobShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobShapesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListJobShapesResponse>
                transformer = ListJobShapesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListJobShapes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobShapeSummary/ListJobShapes");

        com.oracle.bmc.responses.AsyncHandler<ListJobShapesRequest, ListJobShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJobShapesRequest, ListJobShapesResponse>,
                        java.util.concurrent.Future<ListJobShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobShapesRequest, ListJobShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse>
                    handler) {
        LOG.trace("Called async listJobs");
        final ListJobsRequest interceptedRequest = ListJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListJobsResponse>
                transformer = ListJobsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListJobs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobSummary/ListJobs");

        com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse>,
                        java.util.concurrent.Future<ListJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobsRequest, ListJobsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModelDeploymentShapesResponse> listModelDeploymentShapes(
            ListModelDeploymentShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModelDeploymentShapesRequest, ListModelDeploymentShapesResponse>
                    handler) {
        LOG.trace("Called async listModelDeploymentShapes");
        final ListModelDeploymentShapesRequest interceptedRequest =
                ListModelDeploymentShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModelDeploymentShapesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListModelDeploymentShapesResponse>
                transformer = ListModelDeploymentShapesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListModelDeploymentShapes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeploymentShapeSummary/ListModelDeploymentShapes");

        com.oracle.bmc.responses.AsyncHandler<
                        ListModelDeploymentShapesRequest, ListModelDeploymentShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModelDeploymentShapesRequest,
                                ListModelDeploymentShapesResponse>,
                        java.util.concurrent.Future<ListModelDeploymentShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModelDeploymentShapesRequest, ListModelDeploymentShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModelDeploymentsResponse> listModelDeployments(
            ListModelDeploymentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModelDeploymentsRequest, ListModelDeploymentsResponse>
                    handler) {
        LOG.trace("Called async listModelDeployments");
        final ListModelDeploymentsRequest interceptedRequest =
                ListModelDeploymentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModelDeploymentsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListModelDeploymentsResponse>
                transformer = ListModelDeploymentsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListModelDeployments",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeploymentSummary/ListModelDeployments");

        com.oracle.bmc.responses.AsyncHandler<
                        ListModelDeploymentsRequest, ListModelDeploymentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModelDeploymentsRequest, ListModelDeploymentsResponse>,
                        java.util.concurrent.Future<ListModelDeploymentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModelDeploymentsRequest, ListModelDeploymentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModelsResponse> listModels(
            ListModelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListModelsRequest, ListModelsResponse>
                    handler) {
        LOG.trace("Called async listModels");
        final ListModelsRequest interceptedRequest = ListModelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModelsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListModelsResponse>
                transformer = ListModelsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListModels",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelSummary/ListModels");

        com.oracle.bmc.responses.AsyncHandler<ListModelsRequest, ListModelsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModelsRequest, ListModelsResponse>,
                        java.util.concurrent.Future<ListModelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModelsRequest, ListModelsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNotebookSessionShapesResponse> listNotebookSessionShapes(
            ListNotebookSessionShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNotebookSessionShapesRequest, ListNotebookSessionShapesResponse>
                    handler) {
        LOG.trace("Called async listNotebookSessionShapes");
        final ListNotebookSessionShapesRequest interceptedRequest =
                ListNotebookSessionShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNotebookSessionShapesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListNotebookSessionShapesResponse>
                transformer = ListNotebookSessionShapesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListNotebookSessionShapes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSessionShapeSummary/ListNotebookSessionShapes");

        com.oracle.bmc.responses.AsyncHandler<
                        ListNotebookSessionShapesRequest, ListNotebookSessionShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNotebookSessionShapesRequest,
                                ListNotebookSessionShapesResponse>,
                        java.util.concurrent.Future<ListNotebookSessionShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNotebookSessionShapesRequest, ListNotebookSessionShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNotebookSessionsResponse> listNotebookSessions(
            ListNotebookSessionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNotebookSessionsRequest, ListNotebookSessionsResponse>
                    handler) {
        LOG.trace("Called async listNotebookSessions");
        final ListNotebookSessionsRequest interceptedRequest =
                ListNotebookSessionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNotebookSessionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListNotebookSessionsResponse>
                transformer = ListNotebookSessionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListNotebookSessions",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSessionSummary/ListNotebookSessions");

        com.oracle.bmc.responses.AsyncHandler<
                        ListNotebookSessionsRequest, ListNotebookSessionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNotebookSessionsRequest, ListNotebookSessionsResponse>,
                        java.util.concurrent.Future<ListNotebookSessionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNotebookSessionsRequest, ListNotebookSessionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResponse> listProjects(
            ListProjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                    handler) {
        LOG.trace("Called async listProjects");
        final ListProjectsRequest interceptedRequest =
                ListProjectsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProjectsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListProjectsResponse>
                transformer = ListProjectsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListProjects",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ProjectSummary/ListProjects");

        com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProjectsRequest, ListProjectsResponse>,
                        java.util.concurrent.Future<ListProjectsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProjectsRequest, ListProjectsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequestErrors");
        final ListWorkRequestErrorsRequest interceptedRequest =
                ListWorkRequestErrorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestErrorsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
                transformer = ListWorkRequestErrorsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListWorkRequestErrors",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequest/ListWorkRequestErrors");

        com.oracle.bmc.responses.AsyncHandler<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>,
                        java.util.concurrent.Future<ListWorkRequestErrorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequestLogs");
        final ListWorkRequestLogsRequest interceptedRequest =
                ListWorkRequestLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestLogsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
                transformer = ListWorkRequestLogsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListWorkRequestLogs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequest/ListWorkRequestLogs");

        com.oracle.bmc.responses.AsyncHandler<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>,
                        java.util.concurrent.Future<ListWorkRequestLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequests");
        final ListWorkRequestsRequest interceptedRequest =
                ListWorkRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer = ListWorkRequestsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "ListWorkRequests",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequestSummary/ListWorkRequests");

        com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestsRequest, ListWorkRequestsResponse>,
                        java.util.concurrent.Future<ListWorkRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestsRequest, ListWorkRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse>
                    handler) {
        LOG.trace("Called async updateJob");
        final UpdateJobRequest interceptedRequest = UpdateJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateJobResponse>
                transformer = UpdateJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "UpdateJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/UpdateJob");

        com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse>,
                        java.util.concurrent.Future<UpdateJobResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateJobRequest, UpdateJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateJobRunResponse> updateJobRun(
            UpdateJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateJobRunRequest, UpdateJobRunResponse>
                    handler) {
        LOG.trace("Called async updateJobRun");
        final UpdateJobRunRequest interceptedRequest =
                UpdateJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateJobRunConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateJobRunResponse>
                transformer = UpdateJobRunConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "UpdateJobRun",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/UpdateJobRun");

        com.oracle.bmc.responses.AsyncHandler<UpdateJobRunRequest, UpdateJobRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateJobRunRequest, UpdateJobRunResponse>,
                        java.util.concurrent.Future<UpdateJobRunResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateJobRunDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateJobRunRequest, UpdateJobRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResponse> updateModel(
            UpdateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateModelRequest, UpdateModelResponse>
                    handler) {
        LOG.trace("Called async updateModel");
        final UpdateModelRequest interceptedRequest =
                UpdateModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateModelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateModelResponse>
                transformer = UpdateModelConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "UpdateModel",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/UpdateModel");

        com.oracle.bmc.responses.AsyncHandler<UpdateModelRequest, UpdateModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateModelRequest, UpdateModelResponse>,
                        java.util.concurrent.Future<UpdateModelResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateModelRequest, UpdateModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateModelDeploymentResponse> updateModelDeployment(
            UpdateModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateModelDeploymentRequest, UpdateModelDeploymentResponse>
                    handler) {
        LOG.trace("Called async updateModelDeployment");
        final UpdateModelDeploymentRequest interceptedRequest =
                UpdateModelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateModelDeploymentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateModelDeploymentResponse>
                transformer = UpdateModelDeploymentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "UpdateModelDeployment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/UpdateModelDeployment");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateModelDeploymentRequest, UpdateModelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateModelDeploymentRequest, UpdateModelDeploymentResponse>,
                        java.util.concurrent.Future<UpdateModelDeploymentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateModelDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateModelDeploymentRequest, UpdateModelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateModelProvenanceResponse> updateModelProvenance(
            UpdateModelProvenanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateModelProvenanceRequest, UpdateModelProvenanceResponse>
                    handler) {
        LOG.trace("Called async updateModelProvenance");
        final UpdateModelProvenanceRequest interceptedRequest =
                UpdateModelProvenanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateModelProvenanceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateModelProvenanceResponse>
                transformer = UpdateModelProvenanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "UpdateModelProvenance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/UpdateModelProvenance");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateModelProvenanceRequest, UpdateModelProvenanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateModelProvenanceRequest, UpdateModelProvenanceResponse>,
                        java.util.concurrent.Future<UpdateModelProvenanceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateModelProvenanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateModelProvenanceRequest, UpdateModelProvenanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookSessionResponse> updateNotebookSession(
            UpdateNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNotebookSessionRequest, UpdateNotebookSessionResponse>
                    handler) {
        LOG.trace("Called async updateNotebookSession");
        final UpdateNotebookSessionRequest interceptedRequest =
                UpdateNotebookSessionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNotebookSessionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateNotebookSessionResponse>
                transformer = UpdateNotebookSessionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "UpdateNotebookSession",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/UpdateNotebookSession");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNotebookSessionRequest, UpdateNotebookSessionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNotebookSessionRequest, UpdateNotebookSessionResponse>,
                        java.util.concurrent.Future<UpdateNotebookSessionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNotebookSessionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNotebookSessionRequest, UpdateNotebookSessionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResponse> updateProject(
            UpdateProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                    handler) {
        LOG.trace("Called async updateProject");
        final UpdateProjectRequest interceptedRequest =
                UpdateProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProjectConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateProjectResponse>
                transformer = UpdateProjectConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataScience",
                "UpdateProject",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/UpdateProject");

        com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateProjectRequest, UpdateProjectResponse>,
                        java.util.concurrent.Future<UpdateProjectResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateProjectDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateProjectRequest, UpdateProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }
}
