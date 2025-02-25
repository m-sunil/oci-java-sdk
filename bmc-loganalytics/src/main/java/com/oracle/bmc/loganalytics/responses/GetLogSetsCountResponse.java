/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class GetLogSetsCountResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned LogSetsCount instance.
     */
    private com.oracle.bmc.loganalytics.model.LogSetsCount logSetsCount;

    /**
     * The returned LogSetsCount instance.
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.LogSetsCount getLogSetsCount() {
        return logSetsCount;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "logSetsCount"})
    private GetLogSetsCountResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.LogSetsCount logSetsCount) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.logSetsCount = logSetsCount;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned LogSetsCount instance.
         */
        private com.oracle.bmc.loganalytics.model.LogSetsCount logSetsCount;

        /**
         * The returned LogSetsCount instance.
         * @param logSetsCount the value to set
         * @return this builder
         */
        public Builder logSetsCount(com.oracle.bmc.loganalytics.model.LogSetsCount logSetsCount) {
            this.logSetsCount = logSetsCount;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetLogSetsCountResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            logSetsCount(o.getLogSetsCount());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetLogSetsCountResponse build() {
            return new GetLogSetsCountResponse(__httpStatusCode__, opcRequestId, logSetsCount);
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
        sb.append(",logSetsCount=").append(String.valueOf(logSetsCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetLogSetsCountResponse)) {
            return false;
        }

        GetLogSetsCountResponse other = (GetLogSetsCountResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.logSetsCount, other.logSetsCount);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.logSetsCount == null ? 43 : this.logSetsCount.hashCode());
        return result;
    }
}
