/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Product description
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InvoicingProduct.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InvoicingProduct {
    @Deprecated
    @java.beans.ConstructorProperties({
        "partNumber",
        "name",
        "unitOfMeasure",
        "billingCategory",
        "productCategory",
        "ucmRateCardPartType"
    })
    public InvoicingProduct(
            String partNumber,
            String name,
            String unitOfMeasure,
            String billingCategory,
            String productCategory,
            String ucmRateCardPartType) {
        super();
        this.partNumber = partNumber;
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
        this.billingCategory = billingCategory;
        this.productCategory = productCategory;
        this.ucmRateCardPartType = ucmRateCardPartType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Product part number
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
        private String partNumber;

        /**
         * Product part number
         *
         * @param partNumber the value to set
         * @return this builder
         **/
        public Builder partNumber(String partNumber) {
            this.partNumber = partNumber;
            this.__explicitlySet__.add("partNumber");
            return this;
        }
        /**
         * Product name
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Product name
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Unit of Measure
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
        private String unitOfMeasure;

        /**
         * Unit of Measure
         *
         * @param unitOfMeasure the value to set
         * @return this builder
         **/
        public Builder unitOfMeasure(String unitOfMeasure) {
            this.unitOfMeasure = unitOfMeasure;
            this.__explicitlySet__.add("unitOfMeasure");
            return this;
        }
        /**
         * Metered service billing category
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("billingCategory")
        private String billingCategory;

        /**
         * Metered service billing category
         *
         * @param billingCategory the value to set
         * @return this builder
         **/
        public Builder billingCategory(String billingCategory) {
            this.billingCategory = billingCategory;
            this.__explicitlySet__.add("billingCategory");
            return this;
        }
        /**
         * Product category
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("productCategory")
        private String productCategory;

        /**
         * Product category
         *
         * @param productCategory the value to set
         * @return this builder
         **/
        public Builder productCategory(String productCategory) {
            this.productCategory = productCategory;
            this.__explicitlySet__.add("productCategory");
            return this;
        }
        /**
         * Rate card part type of Product
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ucmRateCardPartType")
        private String ucmRateCardPartType;

        /**
         * Rate card part type of Product
         *
         * @param ucmRateCardPartType the value to set
         * @return this builder
         **/
        public Builder ucmRateCardPartType(String ucmRateCardPartType) {
            this.ucmRateCardPartType = ucmRateCardPartType;
            this.__explicitlySet__.add("ucmRateCardPartType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvoicingProduct build() {
            InvoicingProduct __instance__ =
                    new InvoicingProduct(
                            partNumber,
                            name,
                            unitOfMeasure,
                            billingCategory,
                            productCategory,
                            ucmRateCardPartType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvoicingProduct o) {
            Builder copiedBuilder =
                    partNumber(o.getPartNumber())
                            .name(o.getName())
                            .unitOfMeasure(o.getUnitOfMeasure())
                            .billingCategory(o.getBillingCategory())
                            .productCategory(o.getProductCategory())
                            .ucmRateCardPartType(o.getUcmRateCardPartType());

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
     * Product part number
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
    private final String partNumber;

    /**
     * Product part number
     *
     * @return the value
     **/
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Product name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Product name
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Unit of Measure
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
    private final String unitOfMeasure;

    /**
     * Unit of Measure
     *
     * @return the value
     **/
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Metered service billing category
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingCategory")
    private final String billingCategory;

    /**
     * Metered service billing category
     *
     * @return the value
     **/
    public String getBillingCategory() {
        return billingCategory;
    }

    /**
     * Product category
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productCategory")
    private final String productCategory;

    /**
     * Product category
     *
     * @return the value
     **/
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Rate card part type of Product
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ucmRateCardPartType")
    private final String ucmRateCardPartType;

    /**
     * Rate card part type of Product
     *
     * @return the value
     **/
    public String getUcmRateCardPartType() {
        return ucmRateCardPartType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InvoicingProduct(");
        sb.append("partNumber=").append(String.valueOf(this.partNumber));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", unitOfMeasure=").append(String.valueOf(this.unitOfMeasure));
        sb.append(", billingCategory=").append(String.valueOf(this.billingCategory));
        sb.append(", productCategory=").append(String.valueOf(this.productCategory));
        sb.append(", ucmRateCardPartType=").append(String.valueOf(this.ucmRateCardPartType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvoicingProduct)) {
            return false;
        }

        InvoicingProduct other = (InvoicingProduct) o;
        return java.util.Objects.equals(this.partNumber, other.partNumber)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.unitOfMeasure, other.unitOfMeasure)
                && java.util.Objects.equals(this.billingCategory, other.billingCategory)
                && java.util.Objects.equals(this.productCategory, other.productCategory)
                && java.util.Objects.equals(this.ucmRateCardPartType, other.ucmRateCardPartType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.partNumber == null ? 43 : this.partNumber.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.unitOfMeasure == null ? 43 : this.unitOfMeasure.hashCode());
        result =
                (result * PRIME)
                        + (this.billingCategory == null ? 43 : this.billingCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.productCategory == null ? 43 : this.productCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.ucmRateCardPartType == null
                                ? 43
                                : this.ucmRateCardPartType.hashCode());
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
