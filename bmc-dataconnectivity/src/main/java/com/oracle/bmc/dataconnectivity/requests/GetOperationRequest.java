/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.requests;

import com.oracle.bmc.dataconnectivity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataconnectivity/GetOperationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetOperationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class GetOperationRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The connection key.
     */
    private String connectionKey;

    /**
     * The connection key.
     */
    public String getConnectionKey() {
        return connectionKey;
    }
    /**
     * The schema resource name used for retrieving schemas.
     */
    private String schemaResourceName;

    /**
     * The schema resource name used for retrieving schemas.
     */
    public String getSchemaResourceName() {
        return schemaResourceName;
    }
    /**
     * The opeartion resource name used for retrieving the details of operation.
     */
    private String operationResourceName;

    /**
     * The opeartion resource name used for retrieving the details of operation.
     */
    public String getOperationResourceName() {
        return operationResourceName;
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
     * Endpoint Id used for getDataAssetFullDetails.
     */
    private String endpointId;

    /**
     * Endpoint Id used for getDataAssetFullDetails.
     */
    public String getEndpointId() {
        return endpointId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetOperationRequest, java.lang.Void> {
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
         * The connection key.
         */
        private String connectionKey = null;

        /**
         * The connection key.
         * @param connectionKey the value to set
         * @return this builder instance
         */
        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            return this;
        }

        /**
         * The schema resource name used for retrieving schemas.
         */
        private String schemaResourceName = null;

        /**
         * The schema resource name used for retrieving schemas.
         * @param schemaResourceName the value to set
         * @return this builder instance
         */
        public Builder schemaResourceName(String schemaResourceName) {
            this.schemaResourceName = schemaResourceName;
            return this;
        }

        /**
         * The opeartion resource name used for retrieving the details of operation.
         */
        private String operationResourceName = null;

        /**
         * The opeartion resource name used for retrieving the details of operation.
         * @param operationResourceName the value to set
         * @return this builder instance
         */
        public Builder operationResourceName(String operationResourceName) {
            this.operationResourceName = operationResourceName;
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
        public Builder copy(GetOperationRequest o) {
            registryId(o.getRegistryId());
            connectionKey(o.getConnectionKey());
            schemaResourceName(o.getSchemaResourceName());
            operationResourceName(o.getOperationResourceName());
            opcRequestId(o.getOpcRequestId());
            endpointId(o.getEndpointId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetOperationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetOperationRequest
         */
        public GetOperationRequest build() {
            GetOperationRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetOperationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetOperationRequest
         */
        public GetOperationRequest buildWithoutInvocationCallback() {
            GetOperationRequest request = new GetOperationRequest();
            request.registryId = registryId;
            request.connectionKey = connectionKey;
            request.schemaResourceName = schemaResourceName;
            request.operationResourceName = operationResourceName;
            request.opcRequestId = opcRequestId;
            request.endpointId = endpointId;
            return request;
            // new GetOperationRequest(registryId, connectionKey, schemaResourceName, operationResourceName, opcRequestId, endpointId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .registryId(registryId)
                .connectionKey(connectionKey)
                .schemaResourceName(schemaResourceName)
                .operationResourceName(operationResourceName)
                .opcRequestId(opcRequestId)
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
        sb.append(",connectionKey=").append(String.valueOf(this.connectionKey));
        sb.append(",schemaResourceName=").append(String.valueOf(this.schemaResourceName));
        sb.append(",operationResourceName=").append(String.valueOf(this.operationResourceName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",endpointId=").append(String.valueOf(this.endpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOperationRequest)) {
            return false;
        }

        GetOperationRequest other = (GetOperationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.registryId, other.registryId)
                && java.util.Objects.equals(this.connectionKey, other.connectionKey)
                && java.util.Objects.equals(this.schemaResourceName, other.schemaResourceName)
                && java.util.Objects.equals(this.operationResourceName, other.operationResourceName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.endpointId, other.endpointId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.registryId == null ? 43 : this.registryId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionKey == null ? 43 : this.connectionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.schemaResourceName == null
                                ? 43
                                : this.schemaResourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.operationResourceName == null
                                ? 43
                                : this.operationResourceName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        return result;
    }
}
