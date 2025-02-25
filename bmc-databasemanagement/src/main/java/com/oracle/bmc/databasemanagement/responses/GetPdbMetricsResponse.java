/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.responses;

import com.oracle.bmc.databasemanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetPdbMetricsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned PdbMetrics instance.
     */
    private com.oracle.bmc.databasemanagement.model.PdbMetrics pdbMetrics;

    /**
     * The returned PdbMetrics instance.
     * @return the value
     */
    public com.oracle.bmc.databasemanagement.model.PdbMetrics getPdbMetrics() {
        return pdbMetrics;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "pdbMetrics"})
    private GetPdbMetricsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.databasemanagement.model.PdbMetrics pdbMetrics) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.pdbMetrics = pdbMetrics;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned PdbMetrics instance.
         */
        private com.oracle.bmc.databasemanagement.model.PdbMetrics pdbMetrics;

        /**
         * The returned PdbMetrics instance.
         * @param pdbMetrics the value to set
         * @return this builder
         */
        public Builder pdbMetrics(com.oracle.bmc.databasemanagement.model.PdbMetrics pdbMetrics) {
            this.pdbMetrics = pdbMetrics;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetPdbMetricsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            pdbMetrics(o.getPdbMetrics());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetPdbMetricsResponse build() {
            return new GetPdbMetricsResponse(__httpStatusCode__, opcRequestId, pdbMetrics);
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
        sb.append(",pdbMetrics=").append(String.valueOf(pdbMetrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPdbMetricsResponse)) {
            return false;
        }

        GetPdbMetricsResponse other = (GetPdbMetricsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.pdbMetrics, other.pdbMetrics);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.pdbMetrics == null ? 43 : this.pdbMetrics.hashCode());
        return result;
    }
}
