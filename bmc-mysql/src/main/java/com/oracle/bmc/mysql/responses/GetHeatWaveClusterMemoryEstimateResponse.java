/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.responses;

import com.oracle.bmc.mysql.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class GetHeatWaveClusterMemoryEstimateResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned HeatWaveClusterMemoryEstimate instance.
     */
    private com.oracle.bmc.mysql.model.HeatWaveClusterMemoryEstimate heatWaveClusterMemoryEstimate;

    /**
     * The returned HeatWaveClusterMemoryEstimate instance.
     * @return the value
     */
    public com.oracle.bmc.mysql.model.HeatWaveClusterMemoryEstimate
            getHeatWaveClusterMemoryEstimate() {
        return heatWaveClusterMemoryEstimate;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "heatWaveClusterMemoryEstimate"
    })
    private GetHeatWaveClusterMemoryEstimateResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.mysql.model.HeatWaveClusterMemoryEstimate
                    heatWaveClusterMemoryEstimate) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.heatWaveClusterMemoryEstimate = heatWaveClusterMemoryEstimate;
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
         * The returned HeatWaveClusterMemoryEstimate instance.
         */
        private com.oracle.bmc.mysql.model.HeatWaveClusterMemoryEstimate
                heatWaveClusterMemoryEstimate;

        /**
         * The returned HeatWaveClusterMemoryEstimate instance.
         * @param heatWaveClusterMemoryEstimate the value to set
         * @return this builder
         */
        public Builder heatWaveClusterMemoryEstimate(
                com.oracle.bmc.mysql.model.HeatWaveClusterMemoryEstimate
                        heatWaveClusterMemoryEstimate) {
            this.heatWaveClusterMemoryEstimate = heatWaveClusterMemoryEstimate;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetHeatWaveClusterMemoryEstimateResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            heatWaveClusterMemoryEstimate(o.getHeatWaveClusterMemoryEstimate());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetHeatWaveClusterMemoryEstimateResponse build() {
            return new GetHeatWaveClusterMemoryEstimateResponse(
                    __httpStatusCode__, opcRequestId, heatWaveClusterMemoryEstimate);
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
        sb.append(",heatWaveClusterMemoryEstimate=")
                .append(String.valueOf(heatWaveClusterMemoryEstimate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetHeatWaveClusterMemoryEstimateResponse)) {
            return false;
        }

        GetHeatWaveClusterMemoryEstimateResponse other =
                (GetHeatWaveClusterMemoryEstimateResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.heatWaveClusterMemoryEstimate, other.heatWaveClusterMemoryEstimate);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.heatWaveClusterMemoryEstimate == null
                                ? 43
                                : this.heatWaveClusterMemoryEstimate.hashCode());
        return result;
    }
}
