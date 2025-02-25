/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.responses;

import com.oracle.bmc.databasemanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetManagedDatabaseResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned ManagedDatabase instance.
     */
    private com.oracle.bmc.databasemanagement.model.ManagedDatabase managedDatabase;

    /**
     * The returned ManagedDatabase instance.
     * @return the value
     */
    public com.oracle.bmc.databasemanagement.model.ManagedDatabase getManagedDatabase() {
        return managedDatabase;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "managedDatabase"})
    private GetManagedDatabaseResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.databasemanagement.model.ManagedDatabase managedDatabase) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.managedDatabase = managedDatabase;
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
         * The returned ManagedDatabase instance.
         */
        private com.oracle.bmc.databasemanagement.model.ManagedDatabase managedDatabase;

        /**
         * The returned ManagedDatabase instance.
         * @param managedDatabase the value to set
         * @return this builder
         */
        public Builder managedDatabase(
                com.oracle.bmc.databasemanagement.model.ManagedDatabase managedDatabase) {
            this.managedDatabase = managedDatabase;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetManagedDatabaseResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            managedDatabase(o.getManagedDatabase());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetManagedDatabaseResponse build() {
            return new GetManagedDatabaseResponse(
                    __httpStatusCode__, opcRequestId, managedDatabase);
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
        sb.append(",managedDatabase=").append(String.valueOf(managedDatabase));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetManagedDatabaseResponse)) {
            return false;
        }

        GetManagedDatabaseResponse other = (GetManagedDatabaseResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.managedDatabase, other.managedDatabase);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedDatabase == null ? 43 : this.managedDatabase.hashCode());
        return result;
    }
}
