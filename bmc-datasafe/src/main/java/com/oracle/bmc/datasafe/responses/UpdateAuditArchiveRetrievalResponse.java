/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.responses;

import com.oracle.bmc.datasafe.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateAuditArchiveRetrievalResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with this OCID to track the status of the request.
     *
     */
    private String opcWorkRequestId;

    /**
     * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with this OCID to track the status of the request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "opcWorkRequestId"})
    private UpdateAuditArchiveRetrievalResponse(
            int __httpStatusCode__, String opcRequestId, String opcWorkRequestId) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with this OCID to track the status of the request.
         *
         */
        private String opcWorkRequestId;

        /**
         * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with this OCID to track the status of the request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateAuditArchiveRetrievalResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdateAuditArchiveRetrievalResponse build() {
            return new UpdateAuditArchiveRetrievalResponse(
                    __httpStatusCode__, opcRequestId, opcWorkRequestId);
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAuditArchiveRetrievalResponse)) {
            return false;
        }

        UpdateAuditArchiveRetrievalResponse other = (UpdateAuditArchiveRetrievalResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        return result;
    }
}
