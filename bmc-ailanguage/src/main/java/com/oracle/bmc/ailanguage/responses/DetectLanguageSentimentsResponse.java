/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.responses;

import com.oracle.bmc.ailanguage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
public class DetectLanguageSentimentsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned DetectLanguageSentimentsResult instance.
     */
    private com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsResult
            detectLanguageSentimentsResult;

    /**
     * The returned DetectLanguageSentimentsResult instance.
     * @return the value
     */
    public com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsResult
            getDetectLanguageSentimentsResult() {
        return detectLanguageSentimentsResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "detectLanguageSentimentsResult"
    })
    private DetectLanguageSentimentsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsResult
                    detectLanguageSentimentsResult) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.detectLanguageSentimentsResult = detectLanguageSentimentsResult;
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
         * The returned DetectLanguageSentimentsResult instance.
         */
        private com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsResult
                detectLanguageSentimentsResult;

        /**
         * The returned DetectLanguageSentimentsResult instance.
         * @param detectLanguageSentimentsResult the value to set
         * @return this builder
         */
        public Builder detectLanguageSentimentsResult(
                com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsResult
                        detectLanguageSentimentsResult) {
            this.detectLanguageSentimentsResult = detectLanguageSentimentsResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DetectLanguageSentimentsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            detectLanguageSentimentsResult(o.getDetectLanguageSentimentsResult());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public DetectLanguageSentimentsResponse build() {
            return new DetectLanguageSentimentsResponse(
                    __httpStatusCode__, opcRequestId, detectLanguageSentimentsResult);
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
        sb.append(",detectLanguageSentimentsResult=")
                .append(String.valueOf(detectLanguageSentimentsResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectLanguageSentimentsResponse)) {
            return false;
        }

        DetectLanguageSentimentsResponse other = (DetectLanguageSentimentsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.detectLanguageSentimentsResult, other.detectLanguageSentimentsResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.detectLanguageSentimentsResult == null
                                ? 43
                                : this.detectLanguageSentimentsResult.hashCode());
        return result;
    }
}
