/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Business partner.
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
    builder = InvoicingBusinessPartner.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InvoicingBusinessPartner {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "namePhonetic",
        "tcaCustomerAccountNumber",
        "isPublicSector",
        "isChainCustomer",
        "customerChainType",
        "tcaPartyNumber",
        "tcaPartyId",
        "tcaCustomerAccountId"
    })
    public InvoicingBusinessPartner(
            String name,
            String namePhonetic,
            String tcaCustomerAccountNumber,
            Boolean isPublicSector,
            Boolean isChainCustomer,
            String customerChainType,
            String tcaPartyNumber,
            Long tcaPartyId,
            Long tcaCustomerAccountId) {
        super();
        this.name = name;
        this.namePhonetic = namePhonetic;
        this.tcaCustomerAccountNumber = tcaCustomerAccountNumber;
        this.isPublicSector = isPublicSector;
        this.isChainCustomer = isChainCustomer;
        this.customerChainType = customerChainType;
        this.tcaPartyNumber = tcaPartyNumber;
        this.tcaPartyId = tcaPartyId;
        this.tcaCustomerAccountId = tcaCustomerAccountId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Commercial name also called customer name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Commercial name also called customer name.
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
         * Phonetic name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namePhonetic")
        private String namePhonetic;

        /**
         * Phonetic name.
         *
         * @param namePhonetic the value to set
         * @return this builder
         **/
        public Builder namePhonetic(String namePhonetic) {
            this.namePhonetic = namePhonetic;
            this.__explicitlySet__.add("namePhonetic");
            return this;
        }
        /**
         * TCA customer account number.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tcaCustomerAccountNumber")
        private String tcaCustomerAccountNumber;

        /**
         * TCA customer account number.
         *
         * @param tcaCustomerAccountNumber the value to set
         * @return this builder
         **/
        public Builder tcaCustomerAccountNumber(String tcaCustomerAccountNumber) {
            this.tcaCustomerAccountNumber = tcaCustomerAccountNumber;
            this.__explicitlySet__.add("tcaCustomerAccountNumber");
            return this;
        }
        /**
         * The business partner is part of the public sector or not.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPublicSector")
        private Boolean isPublicSector;

        /**
         * The business partner is part of the public sector or not.
         *
         * @param isPublicSector the value to set
         * @return this builder
         **/
        public Builder isPublicSector(Boolean isPublicSector) {
            this.isPublicSector = isPublicSector;
            this.__explicitlySet__.add("isPublicSector");
            return this;
        }
        /**
         * The business partner is chain customer or not.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isChainCustomer")
        private Boolean isChainCustomer;

        /**
         * The business partner is chain customer or not.
         *
         * @param isChainCustomer the value to set
         * @return this builder
         **/
        public Builder isChainCustomer(Boolean isChainCustomer) {
            this.isChainCustomer = isChainCustomer;
            this.__explicitlySet__.add("isChainCustomer");
            return this;
        }
        /**
         * Customer chain type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerChainType")
        private String customerChainType;

        /**
         * Customer chain type.
         *
         * @param customerChainType the value to set
         * @return this builder
         **/
        public Builder customerChainType(String customerChainType) {
            this.customerChainType = customerChainType;
            this.__explicitlySet__.add("customerChainType");
            return this;
        }
        /**
         * TCA party number.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tcaPartyNumber")
        private String tcaPartyNumber;

        /**
         * TCA party number.
         *
         * @param tcaPartyNumber the value to set
         * @return this builder
         **/
        public Builder tcaPartyNumber(String tcaPartyNumber) {
            this.tcaPartyNumber = tcaPartyNumber;
            this.__explicitlySet__.add("tcaPartyNumber");
            return this;
        }
        /**
         * TCA party ID.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tcaPartyId")
        private Long tcaPartyId;

        /**
         * TCA party ID.
         *
         * @param tcaPartyId the value to set
         * @return this builder
         **/
        public Builder tcaPartyId(Long tcaPartyId) {
            this.tcaPartyId = tcaPartyId;
            this.__explicitlySet__.add("tcaPartyId");
            return this;
        }
        /**
         * TCA customer account ID.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tcaCustomerAccountId")
        private Long tcaCustomerAccountId;

        /**
         * TCA customer account ID.
         *
         * @param tcaCustomerAccountId the value to set
         * @return this builder
         **/
        public Builder tcaCustomerAccountId(Long tcaCustomerAccountId) {
            this.tcaCustomerAccountId = tcaCustomerAccountId;
            this.__explicitlySet__.add("tcaCustomerAccountId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvoicingBusinessPartner build() {
            InvoicingBusinessPartner __instance__ =
                    new InvoicingBusinessPartner(
                            name,
                            namePhonetic,
                            tcaCustomerAccountNumber,
                            isPublicSector,
                            isChainCustomer,
                            customerChainType,
                            tcaPartyNumber,
                            tcaPartyId,
                            tcaCustomerAccountId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvoicingBusinessPartner o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .namePhonetic(o.getNamePhonetic())
                            .tcaCustomerAccountNumber(o.getTcaCustomerAccountNumber())
                            .isPublicSector(o.getIsPublicSector())
                            .isChainCustomer(o.getIsChainCustomer())
                            .customerChainType(o.getCustomerChainType())
                            .tcaPartyNumber(o.getTcaPartyNumber())
                            .tcaPartyId(o.getTcaPartyId())
                            .tcaCustomerAccountId(o.getTcaCustomerAccountId());

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
     * Commercial name also called customer name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Commercial name also called customer name.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Phonetic name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namePhonetic")
    private final String namePhonetic;

    /**
     * Phonetic name.
     *
     * @return the value
     **/
    public String getNamePhonetic() {
        return namePhonetic;
    }

    /**
     * TCA customer account number.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tcaCustomerAccountNumber")
    private final String tcaCustomerAccountNumber;

    /**
     * TCA customer account number.
     *
     * @return the value
     **/
    public String getTcaCustomerAccountNumber() {
        return tcaCustomerAccountNumber;
    }

    /**
     * The business partner is part of the public sector or not.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPublicSector")
    private final Boolean isPublicSector;

    /**
     * The business partner is part of the public sector or not.
     *
     * @return the value
     **/
    public Boolean getIsPublicSector() {
        return isPublicSector;
    }

    /**
     * The business partner is chain customer or not.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isChainCustomer")
    private final Boolean isChainCustomer;

    /**
     * The business partner is chain customer or not.
     *
     * @return the value
     **/
    public Boolean getIsChainCustomer() {
        return isChainCustomer;
    }

    /**
     * Customer chain type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerChainType")
    private final String customerChainType;

    /**
     * Customer chain type.
     *
     * @return the value
     **/
    public String getCustomerChainType() {
        return customerChainType;
    }

    /**
     * TCA party number.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tcaPartyNumber")
    private final String tcaPartyNumber;

    /**
     * TCA party number.
     *
     * @return the value
     **/
    public String getTcaPartyNumber() {
        return tcaPartyNumber;
    }

    /**
     * TCA party ID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tcaPartyId")
    private final Long tcaPartyId;

    /**
     * TCA party ID.
     *
     * @return the value
     **/
    public Long getTcaPartyId() {
        return tcaPartyId;
    }

    /**
     * TCA customer account ID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tcaCustomerAccountId")
    private final Long tcaCustomerAccountId;

    /**
     * TCA customer account ID.
     *
     * @return the value
     **/
    public Long getTcaCustomerAccountId() {
        return tcaCustomerAccountId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InvoicingBusinessPartner(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", namePhonetic=").append(String.valueOf(this.namePhonetic));
        sb.append(", tcaCustomerAccountNumber=")
                .append(String.valueOf(this.tcaCustomerAccountNumber));
        sb.append(", isPublicSector=").append(String.valueOf(this.isPublicSector));
        sb.append(", isChainCustomer=").append(String.valueOf(this.isChainCustomer));
        sb.append(", customerChainType=").append(String.valueOf(this.customerChainType));
        sb.append(", tcaPartyNumber=").append(String.valueOf(this.tcaPartyNumber));
        sb.append(", tcaPartyId=").append(String.valueOf(this.tcaPartyId));
        sb.append(", tcaCustomerAccountId=").append(String.valueOf(this.tcaCustomerAccountId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvoicingBusinessPartner)) {
            return false;
        }

        InvoicingBusinessPartner other = (InvoicingBusinessPartner) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.namePhonetic, other.namePhonetic)
                && java.util.Objects.equals(
                        this.tcaCustomerAccountNumber, other.tcaCustomerAccountNumber)
                && java.util.Objects.equals(this.isPublicSector, other.isPublicSector)
                && java.util.Objects.equals(this.isChainCustomer, other.isChainCustomer)
                && java.util.Objects.equals(this.customerChainType, other.customerChainType)
                && java.util.Objects.equals(this.tcaPartyNumber, other.tcaPartyNumber)
                && java.util.Objects.equals(this.tcaPartyId, other.tcaPartyId)
                && java.util.Objects.equals(this.tcaCustomerAccountId, other.tcaCustomerAccountId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.namePhonetic == null ? 43 : this.namePhonetic.hashCode());
        result =
                (result * PRIME)
                        + (this.tcaCustomerAccountNumber == null
                                ? 43
                                : this.tcaCustomerAccountNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.isPublicSector == null ? 43 : this.isPublicSector.hashCode());
        result =
                (result * PRIME)
                        + (this.isChainCustomer == null ? 43 : this.isChainCustomer.hashCode());
        result =
                (result * PRIME)
                        + (this.customerChainType == null ? 43 : this.customerChainType.hashCode());
        result =
                (result * PRIME)
                        + (this.tcaPartyNumber == null ? 43 : this.tcaPartyNumber.hashCode());
        result = (result * PRIME) + (this.tcaPartyId == null ? 43 : this.tcaPartyId.hashCode());
        result =
                (result * PRIME)
                        + (this.tcaCustomerAccountId == null
                                ? 43
                                : this.tcaCustomerAccountId.hashCode());
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
