/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.model;

/**
 * The update budget details.
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
    builder = UpdateBudgetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateBudgetDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "amount",
        "budgetProcessingPeriodStartOffset",
        "processingPeriodType",
        "resetPeriod",
        "freeformTags",
        "definedTags"
    })
    public UpdateBudgetDetails(
            String displayName,
            String description,
            java.math.BigDecimal amount,
            Integer budgetProcessingPeriodStartOffset,
            ProcessingPeriodType processingPeriodType,
            ResetPeriod resetPeriod,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.amount = amount;
        this.budgetProcessingPeriodStartOffset = budgetProcessingPeriodStartOffset;
        this.processingPeriodType = processingPeriodType;
        this.resetPeriod = resetPeriod;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The displayName of the budget. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The displayName of the budget. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The description of the budget.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the budget.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The amount of the budget expressed as a whole number in the currency of the customer's rate card.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("amount")
        private java.math.BigDecimal amount;

        /**
         * The amount of the budget expressed as a whole number in the currency of the customer's rate card.
         *
         * @param amount the value to set
         * @return this builder
         **/
        public Builder amount(java.math.BigDecimal amount) {
            this.amount = amount;
            this.__explicitlySet__.add("amount");
            return this;
        }
        /**
         * The number of days offset from the first day of the month, at which the budget processing period starts. In months that have fewer days than this value, processing will begin on the last day of that month. For example, for a value of 12, processing starts every month on the 12th at midnight.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("budgetProcessingPeriodStartOffset")
        private Integer budgetProcessingPeriodStartOffset;

        /**
         * The number of days offset from the first day of the month, at which the budget processing period starts. In months that have fewer days than this value, processing will begin on the last day of that month. For example, for a value of 12, processing starts every month on the 12th at midnight.
         * @param budgetProcessingPeriodStartOffset the value to set
         * @return this builder
         **/
        public Builder budgetProcessingPeriodStartOffset(
                Integer budgetProcessingPeriodStartOffset) {
            this.budgetProcessingPeriodStartOffset = budgetProcessingPeriodStartOffset;
            this.__explicitlySet__.add("budgetProcessingPeriodStartOffset");
            return this;
        }
        /**
         * The type of the budget processing period. Valid values are INVOICE and MONTH.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("processingPeriodType")
        private ProcessingPeriodType processingPeriodType;

        /**
         * The type of the budget processing period. Valid values are INVOICE and MONTH.
         *
         * @param processingPeriodType the value to set
         * @return this builder
         **/
        public Builder processingPeriodType(ProcessingPeriodType processingPeriodType) {
            this.processingPeriodType = processingPeriodType;
            this.__explicitlySet__.add("processingPeriodType");
            return this;
        }
        /**
         * The reset period for the budget.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resetPeriod")
        private ResetPeriod resetPeriod;

        /**
         * The reset period for the budget.
         *
         * @param resetPeriod the value to set
         * @return this builder
         **/
        public Builder resetPeriod(ResetPeriod resetPeriod) {
            this.resetPeriod = resetPeriod;
            this.__explicitlySet__.add("resetPeriod");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBudgetDetails build() {
            UpdateBudgetDetails __instance__ =
                    new UpdateBudgetDetails(
                            displayName,
                            description,
                            amount,
                            budgetProcessingPeriodStartOffset,
                            processingPeriodType,
                            resetPeriod,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBudgetDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .amount(o.getAmount())
                            .budgetProcessingPeriodStartOffset(
                                    o.getBudgetProcessingPeriodStartOffset())
                            .processingPeriodType(o.getProcessingPeriodType())
                            .resetPeriod(o.getResetPeriod())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The displayName of the budget. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The displayName of the budget. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The description of the budget.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the budget.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The amount of the budget expressed as a whole number in the currency of the customer's rate card.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    private final java.math.BigDecimal amount;

    /**
     * The amount of the budget expressed as a whole number in the currency of the customer's rate card.
     *
     * @return the value
     **/
    public java.math.BigDecimal getAmount() {
        return amount;
    }

    /**
     * The number of days offset from the first day of the month, at which the budget processing period starts. In months that have fewer days than this value, processing will begin on the last day of that month. For example, for a value of 12, processing starts every month on the 12th at midnight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("budgetProcessingPeriodStartOffset")
    private final Integer budgetProcessingPeriodStartOffset;

    /**
     * The number of days offset from the first day of the month, at which the budget processing period starts. In months that have fewer days than this value, processing will begin on the last day of that month. For example, for a value of 12, processing starts every month on the 12th at midnight.
     * @return the value
     **/
    public Integer getBudgetProcessingPeriodStartOffset() {
        return budgetProcessingPeriodStartOffset;
    }

    /**
     * The type of the budget processing period. Valid values are INVOICE and MONTH.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processingPeriodType")
    private final ProcessingPeriodType processingPeriodType;

    /**
     * The type of the budget processing period. Valid values are INVOICE and MONTH.
     *
     * @return the value
     **/
    public ProcessingPeriodType getProcessingPeriodType() {
        return processingPeriodType;
    }

    /**
     * The reset period for the budget.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resetPeriod")
    private final ResetPeriod resetPeriod;

    /**
     * The reset period for the budget.
     *
     * @return the value
     **/
    public ResetPeriod getResetPeriod() {
        return resetPeriod;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateBudgetDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", amount=").append(String.valueOf(this.amount));
        sb.append(", budgetProcessingPeriodStartOffset=")
                .append(String.valueOf(this.budgetProcessingPeriodStartOffset));
        sb.append(", processingPeriodType=").append(String.valueOf(this.processingPeriodType));
        sb.append(", resetPeriod=").append(String.valueOf(this.resetPeriod));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBudgetDetails)) {
            return false;
        }

        UpdateBudgetDetails other = (UpdateBudgetDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.amount, other.amount)
                && java.util.Objects.equals(
                        this.budgetProcessingPeriodStartOffset,
                        other.budgetProcessingPeriodStartOffset)
                && java.util.Objects.equals(this.processingPeriodType, other.processingPeriodType)
                && java.util.Objects.equals(this.resetPeriod, other.resetPeriod)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.amount == null ? 43 : this.amount.hashCode());
        result =
                (result * PRIME)
                        + (this.budgetProcessingPeriodStartOffset == null
                                ? 43
                                : this.budgetProcessingPeriodStartOffset.hashCode());
        result =
                (result * PRIME)
                        + (this.processingPeriodType == null
                                ? 43
                                : this.processingPeriodType.hashCode());
        result = (result * PRIME) + (this.resetPeriod == null ? 43 : this.resetPeriod.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
