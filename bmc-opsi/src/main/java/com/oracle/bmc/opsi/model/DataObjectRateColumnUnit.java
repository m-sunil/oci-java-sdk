/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Unit details of a data object column of RATE unit category.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DataObjectRateColumnUnit.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "unitCategory"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataObjectRateColumnUnit extends DataObjectColumnUnit {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numerator")
        private DataObjectColumnUnit numerator;

        public Builder numerator(DataObjectColumnUnit numerator) {
            this.numerator = numerator;
            this.__explicitlySet__.add("numerator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("denominator")
        private DataObjectColumnUnit denominator;

        public Builder denominator(DataObjectColumnUnit denominator) {
            this.denominator = denominator;
            this.__explicitlySet__.add("denominator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataObjectRateColumnUnit build() {
            DataObjectRateColumnUnit __instance__ =
                    new DataObjectRateColumnUnit(displayName, numerator, denominator);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataObjectRateColumnUnit o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .numerator(o.getNumerator())
                            .denominator(o.getDenominator());

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

    @Deprecated
    public DataObjectRateColumnUnit(
            String displayName, DataObjectColumnUnit numerator, DataObjectColumnUnit denominator) {
        super(displayName);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("numerator")
    private final DataObjectColumnUnit numerator;

    public DataObjectColumnUnit getNumerator() {
        return numerator;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("denominator")
    private final DataObjectColumnUnit denominator;

    public DataObjectColumnUnit getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataObjectRateColumnUnit(");
        sb.append("super=").append(super.toString());
        sb.append(", numerator=").append(String.valueOf(this.numerator));
        sb.append(", denominator=").append(String.valueOf(this.denominator));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataObjectRateColumnUnit)) {
            return false;
        }

        DataObjectRateColumnUnit other = (DataObjectRateColumnUnit) o;
        return java.util.Objects.equals(this.numerator, other.numerator)
                && java.util.Objects.equals(this.denominator, other.denominator)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.numerator == null ? 43 : this.numerator.hashCode());
        result = (result * PRIME) + (this.denominator == null ? 43 : this.denominator.hashCode());
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
