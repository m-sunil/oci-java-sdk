/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Invoice Line
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InvoiceLineSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InvoiceLineSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "product",
        "arInvoiceNumber",
        "dataCenter",
        "timeStart",
        "timeEnd"
    })
    public InvoiceLineSummary(
            String id,
            InvoicingProduct product,
            String arInvoiceNumber,
            String dataCenter,
            java.util.Date timeStart,
            java.util.Date timeEnd) {
        super();
        this.id = id;
        this.product = product;
        this.arInvoiceNumber = arInvoiceNumber;
        this.dataCenter = dataCenter;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * SPM Invoice Line internal identifier
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * SPM Invoice Line internal identifier
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private InvoicingProduct product;

        public Builder product(InvoicingProduct product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }
        /**
         * AR Invoice Number for Invoice Line
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("arInvoiceNumber")
        private String arInvoiceNumber;

        /**
         * AR Invoice Number for Invoice Line
         *
         * @param arInvoiceNumber the value to set
         * @return this builder
         **/
        public Builder arInvoiceNumber(String arInvoiceNumber) {
            this.arInvoiceNumber = arInvoiceNumber;
            this.__explicitlySet__.add("arInvoiceNumber");
            return this;
        }
        /**
         * Data Center Attribute.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
        private String dataCenter;

        /**
         * Data Center Attribute.
         *
         * @param dataCenter the value to set
         * @return this builder
         **/
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            this.__explicitlySet__.add("dataCenter");
            return this;
        }
        /**
         * Usage start time
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Usage start time
         *
         * @param timeStart the value to set
         * @return this builder
         **/
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * Usage end time
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Usage end time
         *
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvoiceLineSummary build() {
            InvoiceLineSummary __instance__ =
                    new InvoiceLineSummary(
                            id, product, arInvoiceNumber, dataCenter, timeStart, timeEnd);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvoiceLineSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .product(o.getProduct())
                            .arInvoiceNumber(o.getArInvoiceNumber())
                            .dataCenter(o.getDataCenter())
                            .timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * SPM Invoice Line internal identifier
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * SPM Invoice Line internal identifier
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final InvoicingProduct product;

    public InvoicingProduct getProduct() {
        return product;
    }

    /**
     * AR Invoice Number for Invoice Line
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arInvoiceNumber")
    private final String arInvoiceNumber;

    /**
     * AR Invoice Number for Invoice Line
     *
     * @return the value
     **/
    public String getArInvoiceNumber() {
        return arInvoiceNumber;
    }

    /**
     * Data Center Attribute.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
    private final String dataCenter;

    /**
     * Data Center Attribute.
     *
     * @return the value
     **/
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * Usage start time
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Usage start time
     *
     * @return the value
     **/
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * Usage end time
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Usage end time
     *
     * @return the value
     **/
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InvoiceLineSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", arInvoiceNumber=").append(String.valueOf(this.arInvoiceNumber));
        sb.append(", dataCenter=").append(String.valueOf(this.dataCenter));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvoiceLineSummary)) {
            return false;
        }

        InvoiceLineSummary other = (InvoiceLineSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.arInvoiceNumber, other.arInvoiceNumber)
                && java.util.Objects.equals(this.dataCenter, other.dataCenter)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result =
                (result * PRIME)
                        + (this.arInvoiceNumber == null ? 43 : this.arInvoiceNumber.hashCode());
        result = (result * PRIME) + (this.dataCenter == null ? 43 : this.dataCenter.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
