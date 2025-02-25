/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.responses;

import com.oracle.bmc.dataconnectivity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class ListTypesResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * Pagination token for the next page of objects.
     */
    private String opcNextPage;

    /**
     * Pagination token for the next page of objects.
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * Pagination token for the previous page of objects.
     */
    private String opcPrevPage;

    /**
     * Pagination token for the previous page of objects.
     * @return the value
     */
    public String getOpcPrevPage() {
        return opcPrevPage;
    }

    /**
     * Total items in the entire list
     */
    private Integer opcTotalItems;

    /**
     * Total items in the entire list
     * @return the value
     */
    public Integer getOpcTotalItems() {
        return opcTotalItems;
    }

    /**
     * The returned TypesSummaryCollection instance.
     */
    private com.oracle.bmc.dataconnectivity.model.TypesSummaryCollection typesSummaryCollection;

    /**
     * The returned TypesSummaryCollection instance.
     * @return the value
     */
    public com.oracle.bmc.dataconnectivity.model.TypesSummaryCollection
            getTypesSummaryCollection() {
        return typesSummaryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "opcPrevPage",
        "opcTotalItems",
        "typesSummaryCollection"
    })
    private ListTypesResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            String opcPrevPage,
            Integer opcTotalItems,
            com.oracle.bmc.dataconnectivity.model.TypesSummaryCollection typesSummaryCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcPrevPage = opcPrevPage;
        this.opcTotalItems = opcTotalItems;
        this.typesSummaryCollection = typesSummaryCollection;
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
         * Pagination token for the next page of objects.
         */
        private String opcNextPage;

        /**
         * Pagination token for the next page of objects.
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * Pagination token for the previous page of objects.
         */
        private String opcPrevPage;

        /**
         * Pagination token for the previous page of objects.
         * @param opcPrevPage the value to set
         * @return this builder
         */
        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
            return this;
        }

        /**
         * Total items in the entire list
         */
        private Integer opcTotalItems;

        /**
         * Total items in the entire list
         * @param opcTotalItems the value to set
         * @return this builder
         */
        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
            return this;
        }

        /**
         * The returned TypesSummaryCollection instance.
         */
        private com.oracle.bmc.dataconnectivity.model.TypesSummaryCollection typesSummaryCollection;

        /**
         * The returned TypesSummaryCollection instance.
         * @param typesSummaryCollection the value to set
         * @return this builder
         */
        public Builder typesSummaryCollection(
                com.oracle.bmc.dataconnectivity.model.TypesSummaryCollection
                        typesSummaryCollection) {
            this.typesSummaryCollection = typesSummaryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListTypesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcPrevPage(o.getOpcPrevPage());
            opcTotalItems(o.getOpcTotalItems());
            typesSummaryCollection(o.getTypesSummaryCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListTypesResponse build() {
            return new ListTypesResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    opcPrevPage,
                    opcTotalItems,
                    typesSummaryCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcPrevPage=").append(String.valueOf(opcPrevPage));
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",typesSummaryCollection=").append(String.valueOf(typesSummaryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListTypesResponse)) {
            return false;
        }

        ListTypesResponse other = (ListTypesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
                && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
                && java.util.Objects.equals(
                        this.typesSummaryCollection, other.typesSummaryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result =
                (result * PRIME)
                        + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result =
                (result * PRIME)
                        + (this.typesSummaryCollection == null
                                ? 43
                                : this.typesSummaryCollection.hashCode());
        return result;
    }
}
