/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.requests;

import com.oracle.bmc.dataconnectivity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataconnectivity/CreateConnectivityValidationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateConnectivityValidationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class CreateConnectivityValidationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataconnectivity.model.CreateConnectivityValidationDetails> {

    /**
     * The registry Ocid.
     */
    private String registryId;

    /**
     * The registry Ocid.
     */
    public String getRegistryId() {
        return registryId;
    }
    /**
     * Request body parameters to trigger connectivity validations
     */
    private com.oracle.bmc.dataconnectivity.model.CreateConnectivityValidationDetails
            createConnectivityValidationDetails;

    /**
     * Request body parameters to trigger connectivity validations
     */
    public com.oracle.bmc.dataconnectivity.model.CreateConnectivityValidationDetails
            getCreateConnectivityValidationDetails() {
        return createConnectivityValidationDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Endpoint Id used for getDataAssetFullDetails.
     */
    private String endpointId;

    /**
     * Endpoint Id used for getDataAssetFullDetails.
     */
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dataconnectivity.model.CreateConnectivityValidationDetails getBody$() {
        return createConnectivityValidationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateConnectivityValidationRequest,
                    com.oracle.bmc.dataconnectivity.model.CreateConnectivityValidationDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The registry Ocid.
         */
        private String registryId = null;

        /**
         * The registry Ocid.
         * @param registryId the value to set
         * @return this builder instance
         */
        public Builder registryId(String registryId) {
            this.registryId = registryId;
            return this;
        }

        /**
         * Request body parameters to trigger connectivity validations
         */
        private com.oracle.bmc.dataconnectivity.model.CreateConnectivityValidationDetails
                createConnectivityValidationDetails = null;

        /**
         * Request body parameters to trigger connectivity validations
         * @param createConnectivityValidationDetails the value to set
         * @return this builder instance
         */
        public Builder createConnectivityValidationDetails(
                com.oracle.bmc.dataconnectivity.model.CreateConnectivityValidationDetails
                        createConnectivityValidationDetails) {
            this.createConnectivityValidationDetails = createConnectivityValidationDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Endpoint Id used for getDataAssetFullDetails.
         */
        private String endpointId = null;

        /**
         * Endpoint Id used for getDataAssetFullDetails.
         * @param endpointId the value to set
         * @return this builder instance
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateConnectivityValidationRequest o) {
            registryId(o.getRegistryId());
            createConnectivityValidationDetails(o.getCreateConnectivityValidationDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            endpointId(o.getEndpointId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateConnectivityValidationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateConnectivityValidationRequest
         */
        public CreateConnectivityValidationRequest build() {
            CreateConnectivityValidationRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.dataconnectivity.model.CreateConnectivityValidationDetails body) {
            createConnectivityValidationDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateConnectivityValidationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateConnectivityValidationRequest
         */
        public CreateConnectivityValidationRequest buildWithoutInvocationCallback() {
            CreateConnectivityValidationRequest request = new CreateConnectivityValidationRequest();
            request.registryId = registryId;
            request.createConnectivityValidationDetails = createConnectivityValidationDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.endpointId = endpointId;
            return request;
            // new CreateConnectivityValidationRequest(registryId, createConnectivityValidationDetails, opcRequestId, opcRetryToken, endpointId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .registryId(registryId)
                .createConnectivityValidationDetails(createConnectivityValidationDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .endpointId(endpointId);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",registryId=").append(String.valueOf(this.registryId));
        sb.append(",createConnectivityValidationDetails=")
                .append(String.valueOf(this.createConnectivityValidationDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",endpointId=").append(String.valueOf(this.endpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateConnectivityValidationRequest)) {
            return false;
        }

        CreateConnectivityValidationRequest other = (CreateConnectivityValidationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.registryId, other.registryId)
                && java.util.Objects.equals(
                        this.createConnectivityValidationDetails,
                        other.createConnectivityValidationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.endpointId, other.endpointId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.registryId == null ? 43 : this.registryId.hashCode());
        result =
                (result * PRIME)
                        + (this.createConnectivityValidationDetails == null
                                ? 43
                                : this.createConnectivityValidationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        return result;
    }
}
