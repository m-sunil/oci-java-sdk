/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement;

import com.oracle.bmc.osmanagement.internal.http.*;
import com.oracle.bmc.osmanagement.requests.*;
import com.oracle.bmc.osmanagement.responses.*;
import javax.annotation.Nonnull;

/**
 * Async client implementation for OsManagement service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class OsManagementAsyncClient implements OsManagementAsync {
    /**
     * Service instance for OsManagement.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OSMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osms.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OsManagementAsyncClient.class);

    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public OsManagementAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public OsManagementAsyncClient(
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
    public OsManagementAsyncClient(
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
    public OsManagementAsyncClient(
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
    public OsManagementAsyncClient(
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
    public OsManagementAsyncClient(
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
    public OsManagementAsyncClient(
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
    public OsManagementAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OsManagementAsyncClient> {
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
        public OsManagementAsyncClient build(
                @Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new OsManagementAsyncClient(
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
    public java.util.concurrent.Future<AddPackagesToSoftwareSourceResponse>
            addPackagesToSoftwareSource(
                    AddPackagesToSoftwareSourceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddPackagesToSoftwareSourceRequest,
                                    AddPackagesToSoftwareSourceResponse>
                            handler) {
        LOG.trace("Called async addPackagesToSoftwareSource");
        final AddPackagesToSoftwareSourceRequest interceptedRequest =
                AddPackagesToSoftwareSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddPackagesToSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AddPackagesToSoftwareSourceResponse>
                transformer = AddPackagesToSoftwareSourceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "AddPackagesToSoftwareSource",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/AddPackagesToSoftwareSource");

        com.oracle.bmc.responses.AsyncHandler<
                        AddPackagesToSoftwareSourceRequest, AddPackagesToSoftwareSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddPackagesToSoftwareSourceRequest,
                                AddPackagesToSoftwareSourceResponse>,
                        java.util.concurrent.Future<AddPackagesToSoftwareSourceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddPackagesToSoftwareSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddPackagesToSoftwareSourceRequest, AddPackagesToSoftwareSourceResponse>(
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
    public java.util.concurrent.Future<AttachChildSoftwareSourceToManagedInstanceResponse>
            attachChildSoftwareSourceToManagedInstance(
                    AttachChildSoftwareSourceToManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachChildSoftwareSourceToManagedInstanceRequest,
                                    AttachChildSoftwareSourceToManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async attachChildSoftwareSourceToManagedInstance");
        final AttachChildSoftwareSourceToManagedInstanceRequest interceptedRequest =
                AttachChildSoftwareSourceToManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachChildSoftwareSourceToManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        AttachChildSoftwareSourceToManagedInstanceResponse>
                transformer = AttachChildSoftwareSourceToManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "AttachChildSoftwareSourceToManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/AttachChildSoftwareSourceToManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        AttachChildSoftwareSourceToManagedInstanceRequest,
                        AttachChildSoftwareSourceToManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachChildSoftwareSourceToManagedInstanceRequest,
                                AttachChildSoftwareSourceToManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                AttachChildSoftwareSourceToManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getAttachChildSoftwareSourceToManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachChildSoftwareSourceToManagedInstanceRequest,
                    AttachChildSoftwareSourceToManagedInstanceResponse>(
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
    public java.util.concurrent.Future<AttachManagedInstanceToManagedInstanceGroupResponse>
            attachManagedInstanceToManagedInstanceGroup(
                    AttachManagedInstanceToManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachManagedInstanceToManagedInstanceGroupRequest,
                                    AttachManagedInstanceToManagedInstanceGroupResponse>
                            handler) {
        LOG.trace("Called async attachManagedInstanceToManagedInstanceGroup");
        final AttachManagedInstanceToManagedInstanceGroupRequest interceptedRequest =
                AttachManagedInstanceToManagedInstanceGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachManagedInstanceToManagedInstanceGroupConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        AttachManagedInstanceToManagedInstanceGroupResponse>
                transformer = AttachManagedInstanceToManagedInstanceGroupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "AttachManagedInstanceToManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/AttachManagedInstanceToManagedInstanceGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        AttachManagedInstanceToManagedInstanceGroupRequest,
                        AttachManagedInstanceToManagedInstanceGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachManagedInstanceToManagedInstanceGroupRequest,
                                AttachManagedInstanceToManagedInstanceGroupResponse>,
                        java.util.concurrent.Future<
                                AttachManagedInstanceToManagedInstanceGroupResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachManagedInstanceToManagedInstanceGroupRequest,
                    AttachManagedInstanceToManagedInstanceGroupResponse>(
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
    public java.util.concurrent.Future<AttachParentSoftwareSourceToManagedInstanceResponse>
            attachParentSoftwareSourceToManagedInstance(
                    AttachParentSoftwareSourceToManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachParentSoftwareSourceToManagedInstanceRequest,
                                    AttachParentSoftwareSourceToManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async attachParentSoftwareSourceToManagedInstance");
        final AttachParentSoftwareSourceToManagedInstanceRequest interceptedRequest =
                AttachParentSoftwareSourceToManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachParentSoftwareSourceToManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        AttachParentSoftwareSourceToManagedInstanceResponse>
                transformer = AttachParentSoftwareSourceToManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "AttachParentSoftwareSourceToManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/AttachParentSoftwareSourceToManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        AttachParentSoftwareSourceToManagedInstanceRequest,
                        AttachParentSoftwareSourceToManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachParentSoftwareSourceToManagedInstanceRequest,
                                AttachParentSoftwareSourceToManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                AttachParentSoftwareSourceToManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getAttachParentSoftwareSourceToManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachParentSoftwareSourceToManagedInstanceRequest,
                    AttachParentSoftwareSourceToManagedInstanceResponse>(
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
    public java.util.concurrent.Future<ChangeManagedInstanceGroupCompartmentResponse>
            changeManagedInstanceGroupCompartment(
                    ChangeManagedInstanceGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagedInstanceGroupCompartmentRequest,
                                    ChangeManagedInstanceGroupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeManagedInstanceGroupCompartment");
        final ChangeManagedInstanceGroupCompartmentRequest interceptedRequest =
                ChangeManagedInstanceGroupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeManagedInstanceGroupCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeManagedInstanceGroupCompartmentResponse>
                transformer = ChangeManagedInstanceGroupCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ChangeManagedInstanceGroupCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/ChangeManagedInstanceGroupCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeManagedInstanceGroupCompartmentRequest,
                        ChangeManagedInstanceGroupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeManagedInstanceGroupCompartmentRequest,
                                ChangeManagedInstanceGroupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeManagedInstanceGroupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeManagedInstanceGroupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeManagedInstanceGroupCompartmentRequest,
                    ChangeManagedInstanceGroupCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeScheduledJobCompartmentResponse>
            changeScheduledJobCompartment(
                    ChangeScheduledJobCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeScheduledJobCompartmentRequest,
                                    ChangeScheduledJobCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeScheduledJobCompartment");
        final ChangeScheduledJobCompartmentRequest interceptedRequest =
                ChangeScheduledJobCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeScheduledJobCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeScheduledJobCompartmentResponse>
                transformer = ChangeScheduledJobCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ChangeScheduledJobCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/ChangeScheduledJobCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeScheduledJobCompartmentRequest, ChangeScheduledJobCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeScheduledJobCompartmentRequest,
                                ChangeScheduledJobCompartmentResponse>,
                        java.util.concurrent.Future<ChangeScheduledJobCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeScheduledJobCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeScheduledJobCompartmentRequest, ChangeScheduledJobCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeSoftwareSourceCompartmentResponse>
            changeSoftwareSourceCompartment(
                    ChangeSoftwareSourceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSoftwareSourceCompartmentRequest,
                                    ChangeSoftwareSourceCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSoftwareSourceCompartment");
        final ChangeSoftwareSourceCompartmentRequest interceptedRequest =
                ChangeSoftwareSourceCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSoftwareSourceCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeSoftwareSourceCompartmentResponse>
                transformer = ChangeSoftwareSourceCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ChangeSoftwareSourceCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/ChangeSoftwareSourceCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSoftwareSourceCompartmentRequest,
                        ChangeSoftwareSourceCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSoftwareSourceCompartmentRequest,
                                ChangeSoftwareSourceCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSoftwareSourceCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSoftwareSourceCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSoftwareSourceCompartmentRequest,
                    ChangeSoftwareSourceCompartmentResponse>(
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
    public java.util.concurrent.Future<CreateManagedInstanceGroupResponse>
            createManagedInstanceGroup(
                    CreateManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateManagedInstanceGroupRequest,
                                    CreateManagedInstanceGroupResponse>
                            handler) {
        LOG.trace("Called async createManagedInstanceGroup");
        final CreateManagedInstanceGroupRequest interceptedRequest =
                CreateManagedInstanceGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateManagedInstanceGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateManagedInstanceGroupResponse>
                transformer = CreateManagedInstanceGroupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "CreateManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/CreateManagedInstanceGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateManagedInstanceGroupRequest, CreateManagedInstanceGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateManagedInstanceGroupRequest,
                                CreateManagedInstanceGroupResponse>,
                        java.util.concurrent.Future<CreateManagedInstanceGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateManagedInstanceGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateManagedInstanceGroupRequest, CreateManagedInstanceGroupResponse>(
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
    public java.util.concurrent.Future<CreateScheduledJobResponse> createScheduledJob(
            CreateScheduledJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduledJobRequest, CreateScheduledJobResponse>
                    handler) {
        LOG.trace("Called async createScheduledJob");
        final CreateScheduledJobRequest interceptedRequest =
                CreateScheduledJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateScheduledJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateScheduledJobResponse>
                transformer = CreateScheduledJobConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "CreateScheduledJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/CreateScheduledJob");

        com.oracle.bmc.responses.AsyncHandler<CreateScheduledJobRequest, CreateScheduledJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateScheduledJobRequest, CreateScheduledJobResponse>,
                        java.util.concurrent.Future<CreateScheduledJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateScheduledJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateScheduledJobRequest, CreateScheduledJobResponse>(
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
    public java.util.concurrent.Future<CreateSoftwareSourceResponse> createSoftwareSource(
            CreateSoftwareSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSoftwareSourceRequest, CreateSoftwareSourceResponse>
                    handler) {
        LOG.trace("Called async createSoftwareSource");
        final CreateSoftwareSourceRequest interceptedRequest =
                CreateSoftwareSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSoftwareSourceResponse>
                transformer = CreateSoftwareSourceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "CreateSoftwareSource",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/CreateSoftwareSource");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateSoftwareSourceRequest, CreateSoftwareSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSoftwareSourceRequest, CreateSoftwareSourceResponse>,
                        java.util.concurrent.Future<CreateSoftwareSourceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSoftwareSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSoftwareSourceRequest, CreateSoftwareSourceResponse>(
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
    public java.util.concurrent.Future<DeleteManagedInstanceGroupResponse>
            deleteManagedInstanceGroup(
                    DeleteManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteManagedInstanceGroupRequest,
                                    DeleteManagedInstanceGroupResponse>
                            handler) {
        LOG.trace("Called async deleteManagedInstanceGroup");
        final DeleteManagedInstanceGroupRequest interceptedRequest =
                DeleteManagedInstanceGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteManagedInstanceGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteManagedInstanceGroupResponse>
                transformer = DeleteManagedInstanceGroupConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DeleteManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/DeleteManagedInstanceGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteManagedInstanceGroupRequest, DeleteManagedInstanceGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteManagedInstanceGroupRequest,
                                DeleteManagedInstanceGroupResponse>,
                        java.util.concurrent.Future<DeleteManagedInstanceGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteManagedInstanceGroupRequest, DeleteManagedInstanceGroupResponse>(
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
    public java.util.concurrent.Future<DeleteScheduledJobResponse> deleteScheduledJob(
            DeleteScheduledJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduledJobRequest, DeleteScheduledJobResponse>
                    handler) {
        LOG.trace("Called async deleteScheduledJob");
        final DeleteScheduledJobRequest interceptedRequest =
                DeleteScheduledJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteScheduledJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteScheduledJobResponse>
                transformer = DeleteScheduledJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DeleteScheduledJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/DeleteScheduledJob");

        com.oracle.bmc.responses.AsyncHandler<DeleteScheduledJobRequest, DeleteScheduledJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteScheduledJobRequest, DeleteScheduledJobResponse>,
                        java.util.concurrent.Future<DeleteScheduledJobResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteScheduledJobRequest, DeleteScheduledJobResponse>(
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
    public java.util.concurrent.Future<DeleteSoftwareSourceResponse> deleteSoftwareSource(
            DeleteSoftwareSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSoftwareSourceRequest, DeleteSoftwareSourceResponse>
                    handler) {
        LOG.trace("Called async deleteSoftwareSource");
        final DeleteSoftwareSourceRequest interceptedRequest =
                DeleteSoftwareSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteSoftwareSourceResponse>
                transformer = DeleteSoftwareSourceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DeleteSoftwareSource",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/DeleteSoftwareSource");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSoftwareSourceRequest, DeleteSoftwareSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSoftwareSourceRequest, DeleteSoftwareSourceResponse>,
                        java.util.concurrent.Future<DeleteSoftwareSourceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSoftwareSourceRequest, DeleteSoftwareSourceResponse>(
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
    public java.util.concurrent.Future<DetachChildSoftwareSourceFromManagedInstanceResponse>
            detachChildSoftwareSourceFromManagedInstance(
                    DetachChildSoftwareSourceFromManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachChildSoftwareSourceFromManagedInstanceRequest,
                                    DetachChildSoftwareSourceFromManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async detachChildSoftwareSourceFromManagedInstance");
        final DetachChildSoftwareSourceFromManagedInstanceRequest interceptedRequest =
                DetachChildSoftwareSourceFromManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachChildSoftwareSourceFromManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DetachChildSoftwareSourceFromManagedInstanceResponse>
                transformer = DetachChildSoftwareSourceFromManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DetachChildSoftwareSourceFromManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/DetachChildSoftwareSourceFromManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        DetachChildSoftwareSourceFromManagedInstanceRequest,
                        DetachChildSoftwareSourceFromManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachChildSoftwareSourceFromManagedInstanceRequest,
                                DetachChildSoftwareSourceFromManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                DetachChildSoftwareSourceFromManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getDetachChildSoftwareSourceFromManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachChildSoftwareSourceFromManagedInstanceRequest,
                    DetachChildSoftwareSourceFromManagedInstanceResponse>(
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
    public java.util.concurrent.Future<DetachManagedInstanceFromManagedInstanceGroupResponse>
            detachManagedInstanceFromManagedInstanceGroup(
                    DetachManagedInstanceFromManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachManagedInstanceFromManagedInstanceGroupRequest,
                                    DetachManagedInstanceFromManagedInstanceGroupResponse>
                            handler) {
        LOG.trace("Called async detachManagedInstanceFromManagedInstanceGroup");
        final DetachManagedInstanceFromManagedInstanceGroupRequest interceptedRequest =
                DetachManagedInstanceFromManagedInstanceGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachManagedInstanceFromManagedInstanceGroupConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DetachManagedInstanceFromManagedInstanceGroupResponse>
                transformer = DetachManagedInstanceFromManagedInstanceGroupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DetachManagedInstanceFromManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/DetachManagedInstanceFromManagedInstanceGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        DetachManagedInstanceFromManagedInstanceGroupRequest,
                        DetachManagedInstanceFromManagedInstanceGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachManagedInstanceFromManagedInstanceGroupRequest,
                                DetachManagedInstanceFromManagedInstanceGroupResponse>,
                        java.util.concurrent.Future<
                                DetachManagedInstanceFromManagedInstanceGroupResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachManagedInstanceFromManagedInstanceGroupRequest,
                    DetachManagedInstanceFromManagedInstanceGroupResponse>(
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
    public java.util.concurrent.Future<DetachParentSoftwareSourceFromManagedInstanceResponse>
            detachParentSoftwareSourceFromManagedInstance(
                    DetachParentSoftwareSourceFromManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachParentSoftwareSourceFromManagedInstanceRequest,
                                    DetachParentSoftwareSourceFromManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async detachParentSoftwareSourceFromManagedInstance");
        final DetachParentSoftwareSourceFromManagedInstanceRequest interceptedRequest =
                DetachParentSoftwareSourceFromManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachParentSoftwareSourceFromManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DetachParentSoftwareSourceFromManagedInstanceResponse>
                transformer = DetachParentSoftwareSourceFromManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DetachParentSoftwareSourceFromManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/DetachParentSoftwareSourceFromManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        DetachParentSoftwareSourceFromManagedInstanceRequest,
                        DetachParentSoftwareSourceFromManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachParentSoftwareSourceFromManagedInstanceRequest,
                                DetachParentSoftwareSourceFromManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                DetachParentSoftwareSourceFromManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getDetachParentSoftwareSourceFromManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachParentSoftwareSourceFromManagedInstanceRequest,
                    DetachParentSoftwareSourceFromManagedInstanceResponse>(
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
    public java.util.concurrent.Future<DisableModuleStreamOnManagedInstanceResponse>
            disableModuleStreamOnManagedInstance(
                    DisableModuleStreamOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableModuleStreamOnManagedInstanceRequest,
                                    DisableModuleStreamOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async disableModuleStreamOnManagedInstance");
        final DisableModuleStreamOnManagedInstanceRequest interceptedRequest =
                DisableModuleStreamOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableModuleStreamOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DisableModuleStreamOnManagedInstanceResponse>
                transformer = DisableModuleStreamOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DisableModuleStreamOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamDetails/DisableModuleStreamOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        DisableModuleStreamOnManagedInstanceRequest,
                        DisableModuleStreamOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableModuleStreamOnManagedInstanceRequest,
                                DisableModuleStreamOnManagedInstanceResponse>,
                        java.util.concurrent.Future<DisableModuleStreamOnManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableModuleStreamOnManagedInstanceRequest,
                    DisableModuleStreamOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<EnableModuleStreamOnManagedInstanceResponse>
            enableModuleStreamOnManagedInstance(
                    EnableModuleStreamOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableModuleStreamOnManagedInstanceRequest,
                                    EnableModuleStreamOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async enableModuleStreamOnManagedInstance");
        final EnableModuleStreamOnManagedInstanceRequest interceptedRequest =
                EnableModuleStreamOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableModuleStreamOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, EnableModuleStreamOnManagedInstanceResponse>
                transformer = EnableModuleStreamOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "EnableModuleStreamOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamDetails/EnableModuleStreamOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        EnableModuleStreamOnManagedInstanceRequest,
                        EnableModuleStreamOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableModuleStreamOnManagedInstanceRequest,
                                EnableModuleStreamOnManagedInstanceResponse>,
                        java.util.concurrent.Future<EnableModuleStreamOnManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableModuleStreamOnManagedInstanceRequest,
                    EnableModuleStreamOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<GetErratumResponse> getErratum(
            GetErratumRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetErratumRequest, GetErratumResponse>
                    handler) {
        LOG.trace("Called async getErratum");
        final GetErratumRequest interceptedRequest = GetErratumConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetErratumConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetErratumResponse>
                transformer = GetErratumConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetErratum",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/Erratum/GetErratum");

        com.oracle.bmc.responses.AsyncHandler<GetErratumRequest, GetErratumResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetErratumRequest, GetErratumResponse>,
                        java.util.concurrent.Future<GetErratumResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetErratumRequest, GetErratumResponse>(
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
    public java.util.concurrent.Future<GetManagedInstanceResponse> getManagedInstance(
            GetManagedInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedInstanceRequest, GetManagedInstanceResponse>
                    handler) {
        LOG.trace("Called async getManagedInstance");
        final GetManagedInstanceRequest interceptedRequest =
                GetManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedInstanceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetManagedInstanceResponse>
                transformer = GetManagedInstanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/GetManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<GetManagedInstanceRequest, GetManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetManagedInstanceRequest, GetManagedInstanceResponse>,
                        java.util.concurrent.Future<GetManagedInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetManagedInstanceRequest, GetManagedInstanceResponse>(
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
    public java.util.concurrent.Future<GetManagedInstanceGroupResponse> getManagedInstanceGroup(
            GetManagedInstanceGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedInstanceGroupRequest, GetManagedInstanceGroupResponse>
                    handler) {
        LOG.trace("Called async getManagedInstanceGroup");
        final GetManagedInstanceGroupRequest interceptedRequest =
                GetManagedInstanceGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedInstanceGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetManagedInstanceGroupResponse>
                transformer = GetManagedInstanceGroupConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/GetManagedInstanceGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        GetManagedInstanceGroupRequest, GetManagedInstanceGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetManagedInstanceGroupRequest, GetManagedInstanceGroupResponse>,
                        java.util.concurrent.Future<GetManagedInstanceGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetManagedInstanceGroupRequest, GetManagedInstanceGroupResponse>(
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
    public java.util.concurrent.Future<GetModuleStreamResponse> getModuleStream(
            GetModuleStreamRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModuleStreamRequest, GetModuleStreamResponse>
                    handler) {
        LOG.trace("Called async getModuleStream");
        final GetModuleStreamRequest interceptedRequest =
                GetModuleStreamConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModuleStreamConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetModuleStreamResponse>
                transformer = GetModuleStreamConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetModuleStream",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStream/GetModuleStream");

        com.oracle.bmc.responses.AsyncHandler<GetModuleStreamRequest, GetModuleStreamResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModuleStreamRequest, GetModuleStreamResponse>,
                        java.util.concurrent.Future<GetModuleStreamResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModuleStreamRequest, GetModuleStreamResponse>(
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
    public java.util.concurrent.Future<GetModuleStreamProfileResponse> getModuleStreamProfile(
            GetModuleStreamProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModuleStreamProfileRequest, GetModuleStreamProfileResponse>
                    handler) {
        LOG.trace("Called async getModuleStreamProfile");
        final GetModuleStreamProfileRequest interceptedRequest =
                GetModuleStreamProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModuleStreamProfileConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetModuleStreamProfileResponse>
                transformer = GetModuleStreamProfileConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetModuleStreamProfile",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamProfile/GetModuleStreamProfile");

        com.oracle.bmc.responses.AsyncHandler<
                        GetModuleStreamProfileRequest, GetModuleStreamProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModuleStreamProfileRequest, GetModuleStreamProfileResponse>,
                        java.util.concurrent.Future<GetModuleStreamProfileResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModuleStreamProfileRequest, GetModuleStreamProfileResponse>(
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
    public java.util.concurrent.Future<GetScheduledJobResponse> getScheduledJob(
            GetScheduledJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetScheduledJobRequest, GetScheduledJobResponse>
                    handler) {
        LOG.trace("Called async getScheduledJob");
        final GetScheduledJobRequest interceptedRequest =
                GetScheduledJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetScheduledJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetScheduledJobResponse>
                transformer = GetScheduledJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetScheduledJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/GetScheduledJob");

        com.oracle.bmc.responses.AsyncHandler<GetScheduledJobRequest, GetScheduledJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetScheduledJobRequest, GetScheduledJobResponse>,
                        java.util.concurrent.Future<GetScheduledJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetScheduledJobRequest, GetScheduledJobResponse>(
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
    public java.util.concurrent.Future<GetSoftwarePackageResponse> getSoftwarePackage(
            GetSoftwarePackageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwarePackageRequest, GetSoftwarePackageResponse>
                    handler) {
        LOG.trace("Called async getSoftwarePackage");
        final GetSoftwarePackageRequest interceptedRequest =
                GetSoftwarePackageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSoftwarePackageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetSoftwarePackageResponse>
                transformer = GetSoftwarePackageConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetSoftwarePackage",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/GetSoftwarePackage");

        com.oracle.bmc.responses.AsyncHandler<GetSoftwarePackageRequest, GetSoftwarePackageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSoftwarePackageRequest, GetSoftwarePackageResponse>,
                        java.util.concurrent.Future<GetSoftwarePackageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSoftwarePackageRequest, GetSoftwarePackageResponse>(
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
    public java.util.concurrent.Future<GetSoftwareSourceResponse> getSoftwareSource(
            GetSoftwareSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwareSourceRequest, GetSoftwareSourceResponse>
                    handler) {
        LOG.trace("Called async getSoftwareSource");
        final GetSoftwareSourceRequest interceptedRequest =
                GetSoftwareSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetSoftwareSourceResponse>
                transformer = GetSoftwareSourceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetSoftwareSource",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/GetSoftwareSource");

        com.oracle.bmc.responses.AsyncHandler<GetSoftwareSourceRequest, GetSoftwareSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSoftwareSourceRequest, GetSoftwareSourceResponse>,
                        java.util.concurrent.Future<GetSoftwareSourceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSoftwareSourceRequest, GetSoftwareSourceResponse>(
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
    public java.util.concurrent.Future<GetWindowsUpdateResponse> getWindowsUpdate(
            GetWindowsUpdateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWindowsUpdateRequest, GetWindowsUpdateResponse>
                    handler) {
        LOG.trace("Called async getWindowsUpdate");
        final GetWindowsUpdateRequest interceptedRequest =
                GetWindowsUpdateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWindowsUpdateConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetWindowsUpdateResponse>
                transformer = GetWindowsUpdateConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetWindowsUpdate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WindowsUpdate/GetWindowsUpdate");

        com.oracle.bmc.responses.AsyncHandler<GetWindowsUpdateRequest, GetWindowsUpdateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWindowsUpdateRequest, GetWindowsUpdateResponse>,
                        java.util.concurrent.Future<GetWindowsUpdateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWindowsUpdateRequest, GetWindowsUpdateResponse>(
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
                "OsManagement",
                "GetWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WorkRequest/GetWorkRequest");

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
    public java.util.concurrent.Future<InstallAllPackageUpdatesOnManagedInstanceResponse>
            installAllPackageUpdatesOnManagedInstance(
                    InstallAllPackageUpdatesOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallAllPackageUpdatesOnManagedInstanceRequest,
                                    InstallAllPackageUpdatesOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async installAllPackageUpdatesOnManagedInstance");
        final InstallAllPackageUpdatesOnManagedInstanceRequest interceptedRequest =
                InstallAllPackageUpdatesOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallAllPackageUpdatesOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        InstallAllPackageUpdatesOnManagedInstanceResponse>
                transformer = InstallAllPackageUpdatesOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallAllPackageUpdatesOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallAllPackageUpdatesOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        InstallAllPackageUpdatesOnManagedInstanceRequest,
                        InstallAllPackageUpdatesOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallAllPackageUpdatesOnManagedInstanceRequest,
                                InstallAllPackageUpdatesOnManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                InstallAllPackageUpdatesOnManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallAllPackageUpdatesOnManagedInstanceRequest,
                    InstallAllPackageUpdatesOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<InstallAllUpdatesOnManagedInstanceGroupResponse>
            installAllUpdatesOnManagedInstanceGroup(
                    InstallAllUpdatesOnManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallAllUpdatesOnManagedInstanceGroupRequest,
                                    InstallAllUpdatesOnManagedInstanceGroupResponse>
                            handler) {
        LOG.trace("Called async installAllUpdatesOnManagedInstanceGroup");
        final InstallAllUpdatesOnManagedInstanceGroupRequest interceptedRequest =
                InstallAllUpdatesOnManagedInstanceGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallAllUpdatesOnManagedInstanceGroupConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, InstallAllUpdatesOnManagedInstanceGroupResponse>
                transformer = InstallAllUpdatesOnManagedInstanceGroupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallAllUpdatesOnManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/InstallAllUpdatesOnManagedInstanceGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        InstallAllUpdatesOnManagedInstanceGroupRequest,
                        InstallAllUpdatesOnManagedInstanceGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallAllUpdatesOnManagedInstanceGroupRequest,
                                InstallAllUpdatesOnManagedInstanceGroupResponse>,
                        java.util.concurrent.Future<
                                InstallAllUpdatesOnManagedInstanceGroupResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallAllUpdatesOnManagedInstanceGroupRequest,
                    InstallAllUpdatesOnManagedInstanceGroupResponse>(
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
    public java.util.concurrent.Future<InstallAllWindowsUpdatesOnManagedInstanceResponse>
            installAllWindowsUpdatesOnManagedInstance(
                    InstallAllWindowsUpdatesOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallAllWindowsUpdatesOnManagedInstanceRequest,
                                    InstallAllWindowsUpdatesOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async installAllWindowsUpdatesOnManagedInstance");
        final InstallAllWindowsUpdatesOnManagedInstanceRequest interceptedRequest =
                InstallAllWindowsUpdatesOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallAllWindowsUpdatesOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        InstallAllWindowsUpdatesOnManagedInstanceResponse>
                transformer = InstallAllWindowsUpdatesOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallAllWindowsUpdatesOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallAllWindowsUpdatesOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        InstallAllWindowsUpdatesOnManagedInstanceRequest,
                        InstallAllWindowsUpdatesOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallAllWindowsUpdatesOnManagedInstanceRequest,
                                InstallAllWindowsUpdatesOnManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                InstallAllWindowsUpdatesOnManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallAllWindowsUpdatesOnManagedInstanceRequest,
                    InstallAllWindowsUpdatesOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<InstallModuleStreamProfileOnManagedInstanceResponse>
            installModuleStreamProfileOnManagedInstance(
                    InstallModuleStreamProfileOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallModuleStreamProfileOnManagedInstanceRequest,
                                    InstallModuleStreamProfileOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async installModuleStreamProfileOnManagedInstance");
        final InstallModuleStreamProfileOnManagedInstanceRequest interceptedRequest =
                InstallModuleStreamProfileOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallModuleStreamProfileOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        InstallModuleStreamProfileOnManagedInstanceResponse>
                transformer = InstallModuleStreamProfileOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallModuleStreamProfileOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamProfileDetails/InstallModuleStreamProfileOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        InstallModuleStreamProfileOnManagedInstanceRequest,
                        InstallModuleStreamProfileOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallModuleStreamProfileOnManagedInstanceRequest,
                                InstallModuleStreamProfileOnManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                InstallModuleStreamProfileOnManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallModuleStreamProfileOnManagedInstanceRequest,
                    InstallModuleStreamProfileOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<InstallPackageOnManagedInstanceResponse>
            installPackageOnManagedInstance(
                    InstallPackageOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallPackageOnManagedInstanceRequest,
                                    InstallPackageOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async installPackageOnManagedInstance");
        final InstallPackageOnManagedInstanceRequest interceptedRequest =
                InstallPackageOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallPackageOnManagedInstanceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, InstallPackageOnManagedInstanceResponse>
                transformer = InstallPackageOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallPackageOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallPackageOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        InstallPackageOnManagedInstanceRequest,
                        InstallPackageOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallPackageOnManagedInstanceRequest,
                                InstallPackageOnManagedInstanceResponse>,
                        java.util.concurrent.Future<InstallPackageOnManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallPackageOnManagedInstanceRequest,
                    InstallPackageOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<InstallPackageUpdateOnManagedInstanceResponse>
            installPackageUpdateOnManagedInstance(
                    InstallPackageUpdateOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallPackageUpdateOnManagedInstanceRequest,
                                    InstallPackageUpdateOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async installPackageUpdateOnManagedInstance");
        final InstallPackageUpdateOnManagedInstanceRequest interceptedRequest =
                InstallPackageUpdateOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallPackageUpdateOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, InstallPackageUpdateOnManagedInstanceResponse>
                transformer = InstallPackageUpdateOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallPackageUpdateOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallPackageUpdateOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        InstallPackageUpdateOnManagedInstanceRequest,
                        InstallPackageUpdateOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallPackageUpdateOnManagedInstanceRequest,
                                InstallPackageUpdateOnManagedInstanceResponse>,
                        java.util.concurrent.Future<InstallPackageUpdateOnManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallPackageUpdateOnManagedInstanceRequest,
                    InstallPackageUpdateOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<InstallWindowsUpdateOnManagedInstanceResponse>
            installWindowsUpdateOnManagedInstance(
                    InstallWindowsUpdateOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallWindowsUpdateOnManagedInstanceRequest,
                                    InstallWindowsUpdateOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async installWindowsUpdateOnManagedInstance");
        final InstallWindowsUpdateOnManagedInstanceRequest interceptedRequest =
                InstallWindowsUpdateOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallWindowsUpdateOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, InstallWindowsUpdateOnManagedInstanceResponse>
                transformer = InstallWindowsUpdateOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallWindowsUpdateOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallWindowsUpdateOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        InstallWindowsUpdateOnManagedInstanceRequest,
                        InstallWindowsUpdateOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallWindowsUpdateOnManagedInstanceRequest,
                                InstallWindowsUpdateOnManagedInstanceResponse>,
                        java.util.concurrent.Future<InstallWindowsUpdateOnManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallWindowsUpdateOnManagedInstanceRequest,
                    InstallWindowsUpdateOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<ListAvailablePackagesForManagedInstanceResponse>
            listAvailablePackagesForManagedInstance(
                    ListAvailablePackagesForManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailablePackagesForManagedInstanceRequest,
                                    ListAvailablePackagesForManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async listAvailablePackagesForManagedInstance");
        final ListAvailablePackagesForManagedInstanceRequest interceptedRequest =
                ListAvailablePackagesForManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailablePackagesForManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAvailablePackagesForManagedInstanceResponse>
                transformer = ListAvailablePackagesForManagedInstanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListAvailablePackagesForManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListAvailablePackagesForManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAvailablePackagesForManagedInstanceRequest,
                        ListAvailablePackagesForManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAvailablePackagesForManagedInstanceRequest,
                                ListAvailablePackagesForManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                ListAvailablePackagesForManagedInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAvailablePackagesForManagedInstanceRequest,
                    ListAvailablePackagesForManagedInstanceResponse>(
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
    public java.util.concurrent.Future<ListAvailableSoftwareSourcesForManagedInstanceResponse>
            listAvailableSoftwareSourcesForManagedInstance(
                    ListAvailableSoftwareSourcesForManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailableSoftwareSourcesForManagedInstanceRequest,
                                    ListAvailableSoftwareSourcesForManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async listAvailableSoftwareSourcesForManagedInstance");
        final ListAvailableSoftwareSourcesForManagedInstanceRequest interceptedRequest =
                ListAvailableSoftwareSourcesForManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailableSoftwareSourcesForManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ListAvailableSoftwareSourcesForManagedInstanceResponse>
                transformer =
                        ListAvailableSoftwareSourcesForManagedInstanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListAvailableSoftwareSourcesForManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListAvailableSoftwareSourcesForManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAvailableSoftwareSourcesForManagedInstanceRequest,
                        ListAvailableSoftwareSourcesForManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAvailableSoftwareSourcesForManagedInstanceRequest,
                                ListAvailableSoftwareSourcesForManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                ListAvailableSoftwareSourcesForManagedInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAvailableSoftwareSourcesForManagedInstanceRequest,
                    ListAvailableSoftwareSourcesForManagedInstanceResponse>(
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
    public java.util.concurrent.Future<ListAvailableUpdatesForManagedInstanceResponse>
            listAvailableUpdatesForManagedInstance(
                    ListAvailableUpdatesForManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailableUpdatesForManagedInstanceRequest,
                                    ListAvailableUpdatesForManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async listAvailableUpdatesForManagedInstance");
        final ListAvailableUpdatesForManagedInstanceRequest interceptedRequest =
                ListAvailableUpdatesForManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailableUpdatesForManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAvailableUpdatesForManagedInstanceResponse>
                transformer = ListAvailableUpdatesForManagedInstanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListAvailableUpdatesForManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListAvailableUpdatesForManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAvailableUpdatesForManagedInstanceRequest,
                        ListAvailableUpdatesForManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAvailableUpdatesForManagedInstanceRequest,
                                ListAvailableUpdatesForManagedInstanceResponse>,
                        java.util.concurrent.Future<ListAvailableUpdatesForManagedInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAvailableUpdatesForManagedInstanceRequest,
                    ListAvailableUpdatesForManagedInstanceResponse>(
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
    public java.util.concurrent.Future<ListAvailableWindowsUpdatesForManagedInstanceResponse>
            listAvailableWindowsUpdatesForManagedInstance(
                    ListAvailableWindowsUpdatesForManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailableWindowsUpdatesForManagedInstanceRequest,
                                    ListAvailableWindowsUpdatesForManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async listAvailableWindowsUpdatesForManagedInstance");
        final ListAvailableWindowsUpdatesForManagedInstanceRequest interceptedRequest =
                ListAvailableWindowsUpdatesForManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailableWindowsUpdatesForManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ListAvailableWindowsUpdatesForManagedInstanceResponse>
                transformer = ListAvailableWindowsUpdatesForManagedInstanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListAvailableWindowsUpdatesForManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListAvailableWindowsUpdatesForManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAvailableWindowsUpdatesForManagedInstanceRequest,
                        ListAvailableWindowsUpdatesForManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAvailableWindowsUpdatesForManagedInstanceRequest,
                                ListAvailableWindowsUpdatesForManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                ListAvailableWindowsUpdatesForManagedInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAvailableWindowsUpdatesForManagedInstanceRequest,
                    ListAvailableWindowsUpdatesForManagedInstanceResponse>(
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
    public java.util.concurrent.Future<ListErrataResponse> listErrata(
            ListErrataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListErrataRequest, ListErrataResponse>
                    handler) {
        LOG.trace("Called async listErrata");
        final ListErrataRequest interceptedRequest = ListErrataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListErrataConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListErrataResponse>
                transformer = ListErrataConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListErrata",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ErratumSummary/ListErrata");

        com.oracle.bmc.responses.AsyncHandler<ListErrataRequest, ListErrataResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListErrataRequest, ListErrataResponse>,
                        java.util.concurrent.Future<ListErrataResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListErrataRequest, ListErrataResponse>(
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
    public java.util.concurrent.Future<ListManagedInstanceErrataResponse> listManagedInstanceErrata(
            ListManagedInstanceErrataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstanceErrataRequest, ListManagedInstanceErrataResponse>
                    handler) {
        LOG.trace("Called async listManagedInstanceErrata");
        final ListManagedInstanceErrataRequest interceptedRequest =
                ListManagedInstanceErrataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstanceErrataConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListManagedInstanceErrataResponse>
                transformer = ListManagedInstanceErrataConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListManagedInstanceErrata",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListManagedInstanceErrata");

        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedInstanceErrataRequest, ListManagedInstanceErrataResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedInstanceErrataRequest,
                                ListManagedInstanceErrataResponse>,
                        java.util.concurrent.Future<ListManagedInstanceErrataResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedInstanceErrataRequest, ListManagedInstanceErrataResponse>(
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
    public java.util.concurrent.Future<ListManagedInstanceGroupsResponse> listManagedInstanceGroups(
            ListManagedInstanceGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstanceGroupsRequest, ListManagedInstanceGroupsResponse>
                    handler) {
        LOG.trace("Called async listManagedInstanceGroups");
        final ListManagedInstanceGroupsRequest interceptedRequest =
                ListManagedInstanceGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstanceGroupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListManagedInstanceGroupsResponse>
                transformer = ListManagedInstanceGroupsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListManagedInstanceGroups",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroupSummary/ListManagedInstanceGroups");

        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedInstanceGroupsRequest, ListManagedInstanceGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedInstanceGroupsRequest,
                                ListManagedInstanceGroupsResponse>,
                        java.util.concurrent.Future<ListManagedInstanceGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedInstanceGroupsRequest, ListManagedInstanceGroupsResponse>(
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
    public java.util.concurrent.Future<ListManagedInstancesResponse> listManagedInstances(
            ListManagedInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstancesRequest, ListManagedInstancesResponse>
                    handler) {
        LOG.trace("Called async listManagedInstances");
        final ListManagedInstancesRequest interceptedRequest =
                ListManagedInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstancesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListManagedInstancesResponse>
                transformer = ListManagedInstancesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListManagedInstances",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceSummary/ListManagedInstances");

        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedInstancesRequest, ListManagedInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedInstancesRequest, ListManagedInstancesResponse>,
                        java.util.concurrent.Future<ListManagedInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedInstancesRequest, ListManagedInstancesResponse>(
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
    public java.util.concurrent.Future<ListModuleStreamProfilesResponse> listModuleStreamProfiles(
            ListModuleStreamProfilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>
                    handler) {
        LOG.trace("Called async listModuleStreamProfiles");
        final ListModuleStreamProfilesRequest interceptedRequest =
                ListModuleStreamProfilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModuleStreamProfilesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListModuleStreamProfilesResponse>
                transformer = ListModuleStreamProfilesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListModuleStreamProfiles",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamProfileSummary/ListModuleStreamProfiles");

        com.oracle.bmc.responses.AsyncHandler<
                        ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>,
                        java.util.concurrent.Future<ListModuleStreamProfilesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>(
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
    public java.util.concurrent.Future<ListModuleStreamProfilesOnManagedInstanceResponse>
            listModuleStreamProfilesOnManagedInstance(
                    ListModuleStreamProfilesOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListModuleStreamProfilesOnManagedInstanceRequest,
                                    ListModuleStreamProfilesOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async listModuleStreamProfilesOnManagedInstance");
        final ListModuleStreamProfilesOnManagedInstanceRequest interceptedRequest =
                ListModuleStreamProfilesOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModuleStreamProfilesOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ListModuleStreamProfilesOnManagedInstanceResponse>
                transformer = ListModuleStreamProfilesOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListModuleStreamProfilesOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListModuleStreamProfilesOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        ListModuleStreamProfilesOnManagedInstanceRequest,
                        ListModuleStreamProfilesOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModuleStreamProfilesOnManagedInstanceRequest,
                                ListModuleStreamProfilesOnManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                ListModuleStreamProfilesOnManagedInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModuleStreamProfilesOnManagedInstanceRequest,
                    ListModuleStreamProfilesOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<ListModuleStreamsResponse> listModuleStreams(
            ListModuleStreamsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModuleStreamsRequest, ListModuleStreamsResponse>
                    handler) {
        LOG.trace("Called async listModuleStreams");
        final ListModuleStreamsRequest interceptedRequest =
                ListModuleStreamsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModuleStreamsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListModuleStreamsResponse>
                transformer = ListModuleStreamsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListModuleStreams",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamSummary/ListModuleStreams");

        com.oracle.bmc.responses.AsyncHandler<ListModuleStreamsRequest, ListModuleStreamsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModuleStreamsRequest, ListModuleStreamsResponse>,
                        java.util.concurrent.Future<ListModuleStreamsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModuleStreamsRequest, ListModuleStreamsResponse>(
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
    public java.util.concurrent.Future<ListModuleStreamsOnManagedInstanceResponse>
            listModuleStreamsOnManagedInstance(
                    ListModuleStreamsOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListModuleStreamsOnManagedInstanceRequest,
                                    ListModuleStreamsOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async listModuleStreamsOnManagedInstance");
        final ListModuleStreamsOnManagedInstanceRequest interceptedRequest =
                ListModuleStreamsOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModuleStreamsOnManagedInstanceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListModuleStreamsOnManagedInstanceResponse>
                transformer = ListModuleStreamsOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListModuleStreamsOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListModuleStreamsOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        ListModuleStreamsOnManagedInstanceRequest,
                        ListModuleStreamsOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModuleStreamsOnManagedInstanceRequest,
                                ListModuleStreamsOnManagedInstanceResponse>,
                        java.util.concurrent.Future<ListModuleStreamsOnManagedInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModuleStreamsOnManagedInstanceRequest,
                    ListModuleStreamsOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<ListPackagesInstalledOnManagedInstanceResponse>
            listPackagesInstalledOnManagedInstance(
                    ListPackagesInstalledOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListPackagesInstalledOnManagedInstanceRequest,
                                    ListPackagesInstalledOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async listPackagesInstalledOnManagedInstance");
        final ListPackagesInstalledOnManagedInstanceRequest interceptedRequest =
                ListPackagesInstalledOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPackagesInstalledOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListPackagesInstalledOnManagedInstanceResponse>
                transformer = ListPackagesInstalledOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListPackagesInstalledOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListPackagesInstalledOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        ListPackagesInstalledOnManagedInstanceRequest,
                        ListPackagesInstalledOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPackagesInstalledOnManagedInstanceRequest,
                                ListPackagesInstalledOnManagedInstanceResponse>,
                        java.util.concurrent.Future<ListPackagesInstalledOnManagedInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPackagesInstalledOnManagedInstanceRequest,
                    ListPackagesInstalledOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<ListScheduledJobsResponse> listScheduledJobs(
            ListScheduledJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledJobsRequest, ListScheduledJobsResponse>
                    handler) {
        LOG.trace("Called async listScheduledJobs");
        final ListScheduledJobsRequest interceptedRequest =
                ListScheduledJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListScheduledJobsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListScheduledJobsResponse>
                transformer = ListScheduledJobsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListScheduledJobs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/ListScheduledJobs");

        com.oracle.bmc.responses.AsyncHandler<ListScheduledJobsRequest, ListScheduledJobsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListScheduledJobsRequest, ListScheduledJobsResponse>,
                        java.util.concurrent.Future<ListScheduledJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListScheduledJobsRequest, ListScheduledJobsResponse>(
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
    public java.util.concurrent.Future<ListSoftwareSourcePackagesResponse>
            listSoftwareSourcePackages(
                    ListSoftwareSourcePackagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSoftwareSourcePackagesRequest,
                                    ListSoftwareSourcePackagesResponse>
                            handler) {
        LOG.trace("Called async listSoftwareSourcePackages");
        final ListSoftwareSourcePackagesRequest interceptedRequest =
                ListSoftwareSourcePackagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSoftwareSourcePackagesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSoftwareSourcePackagesResponse>
                transformer = ListSoftwareSourcePackagesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListSoftwareSourcePackages",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/ListSoftwareSourcePackages");

        com.oracle.bmc.responses.AsyncHandler<
                        ListSoftwareSourcePackagesRequest, ListSoftwareSourcePackagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSoftwareSourcePackagesRequest,
                                ListSoftwareSourcePackagesResponse>,
                        java.util.concurrent.Future<ListSoftwareSourcePackagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSoftwareSourcePackagesRequest, ListSoftwareSourcePackagesResponse>(
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
    public java.util.concurrent.Future<ListSoftwareSourcesResponse> listSoftwareSources(
            ListSoftwareSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>
                    handler) {
        LOG.trace("Called async listSoftwareSources");
        final ListSoftwareSourcesRequest interceptedRequest =
                ListSoftwareSourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSoftwareSourcesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSoftwareSourcesResponse>
                transformer = ListSoftwareSourcesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListSoftwareSources",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSourceSummary/ListSoftwareSources");

        com.oracle.bmc.responses.AsyncHandler<
                        ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>,
                        java.util.concurrent.Future<ListSoftwareSourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>(
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
    public java.util.concurrent.Future<ListUpcomingScheduledJobsResponse> listUpcomingScheduledJobs(
            ListUpcomingScheduledJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUpcomingScheduledJobsRequest, ListUpcomingScheduledJobsResponse>
                    handler) {
        LOG.trace("Called async listUpcomingScheduledJobs");
        final ListUpcomingScheduledJobsRequest interceptedRequest =
                ListUpcomingScheduledJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUpcomingScheduledJobsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListUpcomingScheduledJobsResponse>
                transformer = ListUpcomingScheduledJobsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListUpcomingScheduledJobs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/ListUpcomingScheduledJobs");

        com.oracle.bmc.responses.AsyncHandler<
                        ListUpcomingScheduledJobsRequest, ListUpcomingScheduledJobsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUpcomingScheduledJobsRequest,
                                ListUpcomingScheduledJobsResponse>,
                        java.util.concurrent.Future<ListUpcomingScheduledJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUpcomingScheduledJobsRequest, ListUpcomingScheduledJobsResponse>(
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
    public java.util.concurrent.Future<ListWindowsUpdatesResponse> listWindowsUpdates(
            ListWindowsUpdatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>
                    handler) {
        LOG.trace("Called async listWindowsUpdates");
        final ListWindowsUpdatesRequest interceptedRequest =
                ListWindowsUpdatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWindowsUpdatesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListWindowsUpdatesResponse>
                transformer = ListWindowsUpdatesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListWindowsUpdates",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WindowsUpdateSummary/ListWindowsUpdates");

        com.oracle.bmc.responses.AsyncHandler<ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>,
                        java.util.concurrent.Future<ListWindowsUpdatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>(
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
    public java.util.concurrent.Future<ListWindowsUpdatesInstalledOnManagedInstanceResponse>
            listWindowsUpdatesInstalledOnManagedInstance(
                    ListWindowsUpdatesInstalledOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListWindowsUpdatesInstalledOnManagedInstanceRequest,
                                    ListWindowsUpdatesInstalledOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async listWindowsUpdatesInstalledOnManagedInstance");
        final ListWindowsUpdatesInstalledOnManagedInstanceRequest interceptedRequest =
                ListWindowsUpdatesInstalledOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWindowsUpdatesInstalledOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ListWindowsUpdatesInstalledOnManagedInstanceResponse>
                transformer = ListWindowsUpdatesInstalledOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListWindowsUpdatesInstalledOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListWindowsUpdatesInstalledOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        ListWindowsUpdatesInstalledOnManagedInstanceRequest,
                        ListWindowsUpdatesInstalledOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWindowsUpdatesInstalledOnManagedInstanceRequest,
                                ListWindowsUpdatesInstalledOnManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                ListWindowsUpdatesInstalledOnManagedInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWindowsUpdatesInstalledOnManagedInstanceRequest,
                    ListWindowsUpdatesInstalledOnManagedInstanceResponse>(
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
                "OsManagement",
                "ListWorkRequestErrors",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WorkRequest/ListWorkRequestErrors");

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
                "OsManagement",
                "ListWorkRequestLogs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WorkRequest/ListWorkRequestLogs");

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
                "OsManagement",
                "ListWorkRequests",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WorkRequestSummary/ListWorkRequests");

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
    public java.util.concurrent.Future<ManageModuleStreamsOnManagedInstanceResponse>
            manageModuleStreamsOnManagedInstance(
                    ManageModuleStreamsOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ManageModuleStreamsOnManagedInstanceRequest,
                                    ManageModuleStreamsOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async manageModuleStreamsOnManagedInstance");
        final ManageModuleStreamsOnManagedInstanceRequest interceptedRequest =
                ManageModuleStreamsOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ManageModuleStreamsOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ManageModuleStreamsOnManagedInstanceResponse>
                transformer = ManageModuleStreamsOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ManageModuleStreamsOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ManageModuleStreamsOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        ManageModuleStreamsOnManagedInstanceRequest,
                        ManageModuleStreamsOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ManageModuleStreamsOnManagedInstanceRequest,
                                ManageModuleStreamsOnManagedInstanceResponse>,
                        java.util.concurrent.Future<ManageModuleStreamsOnManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getManageModuleStreamsOnManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ManageModuleStreamsOnManagedInstanceRequest,
                    ManageModuleStreamsOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<RemoveModuleStreamProfileFromManagedInstanceResponse>
            removeModuleStreamProfileFromManagedInstance(
                    RemoveModuleStreamProfileFromManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveModuleStreamProfileFromManagedInstanceRequest,
                                    RemoveModuleStreamProfileFromManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async removeModuleStreamProfileFromManagedInstance");
        final RemoveModuleStreamProfileFromManagedInstanceRequest interceptedRequest =
                RemoveModuleStreamProfileFromManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveModuleStreamProfileFromManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        RemoveModuleStreamProfileFromManagedInstanceResponse>
                transformer = RemoveModuleStreamProfileFromManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "RemoveModuleStreamProfileFromManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamProfileDetails/RemoveModuleStreamProfileFromManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        RemoveModuleStreamProfileFromManagedInstanceRequest,
                        RemoveModuleStreamProfileFromManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveModuleStreamProfileFromManagedInstanceRequest,
                                RemoveModuleStreamProfileFromManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                RemoveModuleStreamProfileFromManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveModuleStreamProfileFromManagedInstanceRequest,
                    RemoveModuleStreamProfileFromManagedInstanceResponse>(
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
    public java.util.concurrent.Future<RemovePackageFromManagedInstanceResponse>
            removePackageFromManagedInstance(
                    RemovePackageFromManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemovePackageFromManagedInstanceRequest,
                                    RemovePackageFromManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async removePackageFromManagedInstance");
        final RemovePackageFromManagedInstanceRequest interceptedRequest =
                RemovePackageFromManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemovePackageFromManagedInstanceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemovePackageFromManagedInstanceResponse>
                transformer = RemovePackageFromManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "RemovePackageFromManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/RemovePackageFromManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        RemovePackageFromManagedInstanceRequest,
                        RemovePackageFromManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemovePackageFromManagedInstanceRequest,
                                RemovePackageFromManagedInstanceResponse>,
                        java.util.concurrent.Future<RemovePackageFromManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemovePackageFromManagedInstanceRequest,
                    RemovePackageFromManagedInstanceResponse>(
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
    public java.util.concurrent.Future<RemovePackagesFromSoftwareSourceResponse>
            removePackagesFromSoftwareSource(
                    RemovePackagesFromSoftwareSourceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemovePackagesFromSoftwareSourceRequest,
                                    RemovePackagesFromSoftwareSourceResponse>
                            handler) {
        LOG.trace("Called async removePackagesFromSoftwareSource");
        final RemovePackagesFromSoftwareSourceRequest interceptedRequest =
                RemovePackagesFromSoftwareSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemovePackagesFromSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemovePackagesFromSoftwareSourceResponse>
                transformer = RemovePackagesFromSoftwareSourceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "RemovePackagesFromSoftwareSource",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/RemovePackagesFromSoftwareSource");

        com.oracle.bmc.responses.AsyncHandler<
                        RemovePackagesFromSoftwareSourceRequest,
                        RemovePackagesFromSoftwareSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemovePackagesFromSoftwareSourceRequest,
                                RemovePackagesFromSoftwareSourceResponse>,
                        java.util.concurrent.Future<RemovePackagesFromSoftwareSourceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemovePackagesFromSoftwareSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemovePackagesFromSoftwareSourceRequest,
                    RemovePackagesFromSoftwareSourceResponse>(
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
    public java.util.concurrent.Future<RunScheduledJobNowResponse> runScheduledJobNow(
            RunScheduledJobNowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RunScheduledJobNowRequest, RunScheduledJobNowResponse>
                    handler) {
        LOG.trace("Called async runScheduledJobNow");
        final RunScheduledJobNowRequest interceptedRequest =
                RunScheduledJobNowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RunScheduledJobNowConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RunScheduledJobNowResponse>
                transformer = RunScheduledJobNowConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "RunScheduledJobNow",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/RunScheduledJobNow");

        com.oracle.bmc.responses.AsyncHandler<RunScheduledJobNowRequest, RunScheduledJobNowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RunScheduledJobNowRequest, RunScheduledJobNowResponse>,
                        java.util.concurrent.Future<RunScheduledJobNowResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RunScheduledJobNowRequest, RunScheduledJobNowResponse>(
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
    public java.util.concurrent.Future<SearchSoftwarePackagesResponse> searchSoftwarePackages(
            SearchSoftwarePackagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchSoftwarePackagesRequest, SearchSoftwarePackagesResponse>
                    handler) {
        LOG.trace("Called async searchSoftwarePackages");
        final SearchSoftwarePackagesRequest interceptedRequest =
                SearchSoftwarePackagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSoftwarePackagesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SearchSoftwarePackagesResponse>
                transformer = SearchSoftwarePackagesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "SearchSoftwarePackages",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/SearchSoftwarePackages");

        com.oracle.bmc.responses.AsyncHandler<
                        SearchSoftwarePackagesRequest, SearchSoftwarePackagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchSoftwarePackagesRequest, SearchSoftwarePackagesResponse>,
                        java.util.concurrent.Future<SearchSoftwarePackagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchSoftwarePackagesRequest, SearchSoftwarePackagesResponse>(
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
    public java.util.concurrent.Future<SkipNextScheduledJobExecutionResponse>
            skipNextScheduledJobExecution(
                    SkipNextScheduledJobExecutionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SkipNextScheduledJobExecutionRequest,
                                    SkipNextScheduledJobExecutionResponse>
                            handler) {
        LOG.trace("Called async skipNextScheduledJobExecution");
        final SkipNextScheduledJobExecutionRequest interceptedRequest =
                SkipNextScheduledJobExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SkipNextScheduledJobExecutionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SkipNextScheduledJobExecutionResponse>
                transformer = SkipNextScheduledJobExecutionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "SkipNextScheduledJobExecution",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/SkipNextScheduledJobExecution");

        com.oracle.bmc.responses.AsyncHandler<
                        SkipNextScheduledJobExecutionRequest, SkipNextScheduledJobExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SkipNextScheduledJobExecutionRequest,
                                SkipNextScheduledJobExecutionResponse>,
                        java.util.concurrent.Future<SkipNextScheduledJobExecutionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SkipNextScheduledJobExecutionRequest, SkipNextScheduledJobExecutionResponse>(
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
    public java.util.concurrent.Future<SwitchModuleStreamOnManagedInstanceResponse>
            switchModuleStreamOnManagedInstance(
                    SwitchModuleStreamOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SwitchModuleStreamOnManagedInstanceRequest,
                                    SwitchModuleStreamOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async switchModuleStreamOnManagedInstance");
        final SwitchModuleStreamOnManagedInstanceRequest interceptedRequest =
                SwitchModuleStreamOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SwitchModuleStreamOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SwitchModuleStreamOnManagedInstanceResponse>
                transformer = SwitchModuleStreamOnManagedInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "SwitchModuleStreamOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ModuleStreamDetails/SwitchModuleStreamOnManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        SwitchModuleStreamOnManagedInstanceRequest,
                        SwitchModuleStreamOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SwitchModuleStreamOnManagedInstanceRequest,
                                SwitchModuleStreamOnManagedInstanceResponse>,
                        java.util.concurrent.Future<SwitchModuleStreamOnManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SwitchModuleStreamOnManagedInstanceRequest,
                    SwitchModuleStreamOnManagedInstanceResponse>(
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
    public java.util.concurrent.Future<UpdateManagedInstanceResponse> updateManagedInstance(
            UpdateManagedInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedInstanceRequest, UpdateManagedInstanceResponse>
                    handler) {
        LOG.trace("Called async updateManagedInstance");
        final UpdateManagedInstanceRequest interceptedRequest =
                UpdateManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateManagedInstanceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateManagedInstanceResponse>
                transformer = UpdateManagedInstanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "UpdateManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/UpdateManagedInstanceDetails/UpdateManagedInstance");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateManagedInstanceRequest, UpdateManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateManagedInstanceRequest, UpdateManagedInstanceResponse>,
                        java.util.concurrent.Future<UpdateManagedInstanceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateManagedInstanceRequest, UpdateManagedInstanceResponse>(
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
    public java.util.concurrent.Future<UpdateManagedInstanceGroupResponse>
            updateManagedInstanceGroup(
                    UpdateManagedInstanceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateManagedInstanceGroupRequest,
                                    UpdateManagedInstanceGroupResponse>
                            handler) {
        LOG.trace("Called async updateManagedInstanceGroup");
        final UpdateManagedInstanceGroupRequest interceptedRequest =
                UpdateManagedInstanceGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateManagedInstanceGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateManagedInstanceGroupResponse>
                transformer = UpdateManagedInstanceGroupConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "UpdateManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/UpdateManagedInstanceGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateManagedInstanceGroupRequest, UpdateManagedInstanceGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateManagedInstanceGroupRequest,
                                UpdateManagedInstanceGroupResponse>,
                        java.util.concurrent.Future<UpdateManagedInstanceGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateManagedInstanceGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateManagedInstanceGroupRequest, UpdateManagedInstanceGroupResponse>(
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
    public java.util.concurrent.Future<UpdateScheduledJobResponse> updateScheduledJob(
            UpdateScheduledJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduledJobRequest, UpdateScheduledJobResponse>
                    handler) {
        LOG.trace("Called async updateScheduledJob");
        final UpdateScheduledJobRequest interceptedRequest =
                UpdateScheduledJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateScheduledJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateScheduledJobResponse>
                transformer = UpdateScheduledJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "UpdateScheduledJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/UpdateScheduledJob");

        com.oracle.bmc.responses.AsyncHandler<UpdateScheduledJobRequest, UpdateScheduledJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateScheduledJobRequest, UpdateScheduledJobResponse>,
                        java.util.concurrent.Future<UpdateScheduledJobResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateScheduledJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateScheduledJobRequest, UpdateScheduledJobResponse>(
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
    public java.util.concurrent.Future<UpdateSoftwareSourceResponse> updateSoftwareSource(
            UpdateSoftwareSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSoftwareSourceRequest, UpdateSoftwareSourceResponse>
                    handler) {
        LOG.trace("Called async updateSoftwareSource");
        final UpdateSoftwareSourceRequest interceptedRequest =
                UpdateSoftwareSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateSoftwareSourceResponse>
                transformer = UpdateSoftwareSourceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "UpdateSoftwareSource",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/UpdateSoftwareSource");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSoftwareSourceRequest, UpdateSoftwareSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSoftwareSourceRequest, UpdateSoftwareSourceResponse>,
                        java.util.concurrent.Future<UpdateSoftwareSourceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSoftwareSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSoftwareSourceRequest, UpdateSoftwareSourceResponse>(
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
