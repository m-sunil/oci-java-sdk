/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.responses;

import com.oracle.bmc.loadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class GetBackendHealthResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned BackendHealth instance.
     */
    private com.oracle.bmc.loadbalancer.model.BackendHealth backendHealth;

    /**
     * The returned BackendHealth instance.
     * @return the value
     */
    public com.oracle.bmc.loadbalancer.model.BackendHealth getBackendHealth() {
        return backendHealth;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "backendHealth"})
    private GetBackendHealthResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.loadbalancer.model.BackendHealth backendHealth) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.backendHealth = backendHealth;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned BackendHealth instance.
         */
        private com.oracle.bmc.loadbalancer.model.BackendHealth backendHealth;

        /**
         * The returned BackendHealth instance.
         * @param backendHealth the value to set
         * @return this builder
         */
        public Builder backendHealth(
                com.oracle.bmc.loadbalancer.model.BackendHealth backendHealth) {
            this.backendHealth = backendHealth;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetBackendHealthResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            backendHealth(o.getBackendHealth());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetBackendHealthResponse build() {
            return new GetBackendHealthResponse(__httpStatusCode__, opcRequestId, backendHealth);
        }
    }

    /**
     * Return a new builder for this response object.
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",backendHealth=").append(String.valueOf(backendHealth));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetBackendHealthResponse)) {
            return false;
        }

        GetBackendHealthResponse other = (GetBackendHealthResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.backendHealth, other.backendHealth);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.backendHealth == null ? 43 : this.backendHealth.hashCode());
        return result;
    }
}
