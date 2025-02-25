/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.responses;

import com.oracle.bmc.networkloadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class GetBackendSetHealthResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you must contact
     * Oracle about a particular request, then provide the request identifier.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you must contact
     * Oracle about a particular request, then provide the request identifier.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The returned BackendSetHealth instance.
     */
    private com.oracle.bmc.networkloadbalancer.model.BackendSetHealth backendSetHealth;

    /**
     * The returned BackendSetHealth instance.
     * @return the value
     */
    public com.oracle.bmc.networkloadbalancer.model.BackendSetHealth getBackendSetHealth() {
        return backendSetHealth;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "etag",
        "backendSetHealth"
    })
    private GetBackendSetHealthResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.networkloadbalancer.model.BackendSetHealth backendSetHealth) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.backendSetHealth = backendSetHealth;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you must contact
         * Oracle about a particular request, then provide the request identifier.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you must contact
         * Oracle about a particular request, then provide the request identifier.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The returned BackendSetHealth instance.
         */
        private com.oracle.bmc.networkloadbalancer.model.BackendSetHealth backendSetHealth;

        /**
         * The returned BackendSetHealth instance.
         * @param backendSetHealth the value to set
         * @return this builder
         */
        public Builder backendSetHealth(
                com.oracle.bmc.networkloadbalancer.model.BackendSetHealth backendSetHealth) {
            this.backendSetHealth = backendSetHealth;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetBackendSetHealthResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            backendSetHealth(o.getBackendSetHealth());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetBackendSetHealthResponse build() {
            return new GetBackendSetHealthResponse(
                    __httpStatusCode__, opcRequestId, etag, backendSetHealth);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",backendSetHealth=").append(String.valueOf(backendSetHealth));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetBackendSetHealthResponse)) {
            return false;
        }

        GetBackendSetHealthResponse other = (GetBackendSetHealthResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.backendSetHealth, other.backendSetHealth);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.backendSetHealth == null ? 43 : this.backendSetHealth.hashCode());
        return result;
    }
}
