/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.responses;

import com.oracle.bmc.ailanguage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
public class DetectDominantLanguageResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned DetectDominantLanguageResult instance.
     */
    private com.oracle.bmc.ailanguage.model.DetectDominantLanguageResult
            detectDominantLanguageResult;

    /**
     * The returned DetectDominantLanguageResult instance.
     * @return the value
     */
    public com.oracle.bmc.ailanguage.model.DetectDominantLanguageResult
            getDetectDominantLanguageResult() {
        return detectDominantLanguageResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "detectDominantLanguageResult"
    })
    private DetectDominantLanguageResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.ailanguage.model.DetectDominantLanguageResult
                    detectDominantLanguageResult) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.detectDominantLanguageResult = detectDominantLanguageResult;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned DetectDominantLanguageResult instance.
         */
        private com.oracle.bmc.ailanguage.model.DetectDominantLanguageResult
                detectDominantLanguageResult;

        /**
         * The returned DetectDominantLanguageResult instance.
         * @param detectDominantLanguageResult the value to set
         * @return this builder
         */
        public Builder detectDominantLanguageResult(
                com.oracle.bmc.ailanguage.model.DetectDominantLanguageResult
                        detectDominantLanguageResult) {
            this.detectDominantLanguageResult = detectDominantLanguageResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DetectDominantLanguageResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            detectDominantLanguageResult(o.getDetectDominantLanguageResult());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public DetectDominantLanguageResponse build() {
            return new DetectDominantLanguageResponse(
                    __httpStatusCode__, opcRequestId, detectDominantLanguageResult);
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
        sb.append(",detectDominantLanguageResult=")
                .append(String.valueOf(detectDominantLanguageResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectDominantLanguageResponse)) {
            return false;
        }

        DetectDominantLanguageResponse other = (DetectDominantLanguageResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.detectDominantLanguageResult, other.detectDominantLanguageResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.detectDominantLanguageResult == null
                                ? 43
                                : this.detectDominantLanguageResult.hashCode());
        return result;
    }
}
