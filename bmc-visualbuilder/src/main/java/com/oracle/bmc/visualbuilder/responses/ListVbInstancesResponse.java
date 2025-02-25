/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.responses;

import com.oracle.bmc.visualbuilder.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
public class ListVbInstancesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For list pagination. When this header appears in the response, additional pages of results remain
     *
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, additional pages of results remain
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * For list pagination. When this header appears in the response, additional pages of results have been previously returned
     *
     */
    private String opcPreviousPage;

    /**
     * For list pagination. When this header appears in the response, additional pages of results have been previously returned
     *
     * @return the value
     */
    public String getOpcPreviousPage() {
        return opcPreviousPage;
    }

    /**
     * The returned VbInstanceSummaryCollection instance.
     */
    private com.oracle.bmc.visualbuilder.model.VbInstanceSummaryCollection
            vbInstanceSummaryCollection;

    /**
     * The returned VbInstanceSummaryCollection instance.
     * @return the value
     */
    public com.oracle.bmc.visualbuilder.model.VbInstanceSummaryCollection
            getVbInstanceSummaryCollection() {
        return vbInstanceSummaryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "opcPreviousPage",
        "vbInstanceSummaryCollection"
    })
    private ListVbInstancesResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            String opcPreviousPage,
            com.oracle.bmc.visualbuilder.model.VbInstanceSummaryCollection
                    vbInstanceSummaryCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcPreviousPage = opcPreviousPage;
        this.vbInstanceSummaryCollection = vbInstanceSummaryCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. When this header appears in the response, additional pages of results remain
         *
         */
        private String opcNextPage;

        /**
         * For list pagination. When this header appears in the response, additional pages of results remain
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * For list pagination. When this header appears in the response, additional pages of results have been previously returned
         *
         */
        private String opcPreviousPage;

        /**
         * For list pagination. When this header appears in the response, additional pages of results have been previously returned
         *
         * @param opcPreviousPage the value to set
         * @return this builder
         */
        public Builder opcPreviousPage(String opcPreviousPage) {
            this.opcPreviousPage = opcPreviousPage;
            return this;
        }

        /**
         * The returned VbInstanceSummaryCollection instance.
         */
        private com.oracle.bmc.visualbuilder.model.VbInstanceSummaryCollection
                vbInstanceSummaryCollection;

        /**
         * The returned VbInstanceSummaryCollection instance.
         * @param vbInstanceSummaryCollection the value to set
         * @return this builder
         */
        public Builder vbInstanceSummaryCollection(
                com.oracle.bmc.visualbuilder.model.VbInstanceSummaryCollection
                        vbInstanceSummaryCollection) {
            this.vbInstanceSummaryCollection = vbInstanceSummaryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListVbInstancesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcPreviousPage(o.getOpcPreviousPage());
            vbInstanceSummaryCollection(o.getVbInstanceSummaryCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListVbInstancesResponse build() {
            return new ListVbInstancesResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    opcPreviousPage,
                    vbInstanceSummaryCollection);
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
        sb.append(",opcPreviousPage=").append(String.valueOf(opcPreviousPage));
        sb.append(",vbInstanceSummaryCollection=")
                .append(String.valueOf(vbInstanceSummaryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListVbInstancesResponse)) {
            return false;
        }

        ListVbInstancesResponse other = (ListVbInstancesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcPreviousPage, other.opcPreviousPage)
                && java.util.Objects.equals(
                        this.vbInstanceSummaryCollection, other.vbInstanceSummaryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.opcPreviousPage == null ? 43 : this.opcPreviousPage.hashCode());
        result =
                (result * PRIME)
                        + (this.vbInstanceSummaryCollection == null
                                ? 43
                                : this.vbInstanceSummaryCollection.hashCode());
        return result;
    }
}
