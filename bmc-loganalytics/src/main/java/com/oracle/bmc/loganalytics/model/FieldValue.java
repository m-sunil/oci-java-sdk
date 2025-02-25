/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Field value representing and entry in a list-of-values field.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FieldValue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FieldValue {
    @Deprecated
    @java.beans.ConstructorProperties({"displayValue", "internalValue", "isDeleted"})
    public FieldValue(String displayValue, Object internalValue, Boolean isDeleted) {
        super();
        this.displayValue = displayValue;
        this.internalValue = internalValue;
        this.isDeleted = isDeleted;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Display representation of the field value.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayValue")
        private String displayValue;

        /**
         * Display representation of the field value.
         *
         * @param displayValue the value to set
         * @return this builder
         **/
        public Builder displayValue(String displayValue) {
            this.displayValue = displayValue;
            this.__explicitlySet__.add("displayValue");
            return this;
        }
        /**
         * Internal representation of the field value.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("internalValue")
        private Object internalValue;

        /**
         * Internal representation of the field value.
         *
         * @param internalValue the value to set
         * @return this builder
         **/
        public Builder internalValue(Object internalValue) {
            this.internalValue = internalValue;
            this.__explicitlySet__.add("internalValue");
            return this;
        }
        /**
         * Denotes if this list-of-values value has been marked as deleted.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDeleted")
        private Boolean isDeleted;

        /**
         * Denotes if this list-of-values value has been marked as deleted.
         *
         * @param isDeleted the value to set
         * @return this builder
         **/
        public Builder isDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            this.__explicitlySet__.add("isDeleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FieldValue build() {
            FieldValue __instance__ = new FieldValue(displayValue, internalValue, isDeleted);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FieldValue o) {
            Builder copiedBuilder =
                    displayValue(o.getDisplayValue())
                            .internalValue(o.getInternalValue())
                            .isDeleted(o.getIsDeleted());

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
     * Display representation of the field value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayValue")
    private final String displayValue;

    /**
     * Display representation of the field value.
     *
     * @return the value
     **/
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * Internal representation of the field value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalValue")
    private final Object internalValue;

    /**
     * Internal representation of the field value.
     *
     * @return the value
     **/
    public Object getInternalValue() {
        return internalValue;
    }

    /**
     * Denotes if this list-of-values value has been marked as deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDeleted")
    private final Boolean isDeleted;

    /**
     * Denotes if this list-of-values value has been marked as deleted.
     *
     * @return the value
     **/
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FieldValue(");
        sb.append("displayValue=").append(String.valueOf(this.displayValue));
        sb.append(", internalValue=").append(String.valueOf(this.internalValue));
        sb.append(", isDeleted=").append(String.valueOf(this.isDeleted));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FieldValue)) {
            return false;
        }

        FieldValue other = (FieldValue) o;
        return java.util.Objects.equals(this.displayValue, other.displayValue)
                && java.util.Objects.equals(this.internalValue, other.internalValue)
                && java.util.Objects.equals(this.isDeleted, other.isDeleted)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayValue == null ? 43 : this.displayValue.hashCode());
        result =
                (result * PRIME)
                        + (this.internalValue == null ? 43 : this.internalValue.hashCode());
        result = (result * PRIME) + (this.isDeleted == null ? 43 : this.isDeleted.hashCode());
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
