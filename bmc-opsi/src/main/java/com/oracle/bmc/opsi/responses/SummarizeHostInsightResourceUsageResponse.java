/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeHostInsightResourceUsageResponse
        extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned SummarizeHostInsightResourceUsageAggregation instance.
     */
    private com.oracle.bmc.opsi.model.SummarizeHostInsightResourceUsageAggregation
            summarizeHostInsightResourceUsageAggregation;

    /**
     * The returned SummarizeHostInsightResourceUsageAggregation instance.
     * @return the value
     */
    public com.oracle.bmc.opsi.model.SummarizeHostInsightResourceUsageAggregation
            getSummarizeHostInsightResourceUsageAggregation() {
        return summarizeHostInsightResourceUsageAggregation;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "summarizeHostInsightResourceUsageAggregation"
    })
    private SummarizeHostInsightResourceUsageResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.opsi.model.SummarizeHostInsightResourceUsageAggregation
                    summarizeHostInsightResourceUsageAggregation) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.summarizeHostInsightResourceUsageAggregation =
                summarizeHostInsightResourceUsageAggregation;
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
         * The returned SummarizeHostInsightResourceUsageAggregation instance.
         */
        private com.oracle.bmc.opsi.model.SummarizeHostInsightResourceUsageAggregation
                summarizeHostInsightResourceUsageAggregation;

        /**
         * The returned SummarizeHostInsightResourceUsageAggregation instance.
         * @param summarizeHostInsightResourceUsageAggregation the value to set
         * @return this builder
         */
        public Builder summarizeHostInsightResourceUsageAggregation(
                com.oracle.bmc.opsi.model.SummarizeHostInsightResourceUsageAggregation
                        summarizeHostInsightResourceUsageAggregation) {
            this.summarizeHostInsightResourceUsageAggregation =
                    summarizeHostInsightResourceUsageAggregation;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(SummarizeHostInsightResourceUsageResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            summarizeHostInsightResourceUsageAggregation(
                    o.getSummarizeHostInsightResourceUsageAggregation());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public SummarizeHostInsightResourceUsageResponse build() {
            return new SummarizeHostInsightResourceUsageResponse(
                    __httpStatusCode__, opcRequestId, summarizeHostInsightResourceUsageAggregation);
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
        sb.append(",summarizeHostInsightResourceUsageAggregation=")
                .append(String.valueOf(summarizeHostInsightResourceUsageAggregation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeHostInsightResourceUsageResponse)) {
            return false;
        }

        SummarizeHostInsightResourceUsageResponse other =
                (SummarizeHostInsightResourceUsageResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.summarizeHostInsightResourceUsageAggregation,
                        other.summarizeHostInsightResourceUsageAggregation);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.summarizeHostInsightResourceUsageAggregation == null
                                ? 43
                                : this.summarizeHostInsightResourceUsageAggregation.hashCode());
        return result;
    }
}
