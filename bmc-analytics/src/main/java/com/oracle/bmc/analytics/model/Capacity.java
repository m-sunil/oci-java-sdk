/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Service instance capacity metadata (e.g.: OLPU count, number of users, ...etc...).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Capacity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Capacity {
    @Deprecated
    @java.beans.ConstructorProperties({"capacityType", "capacityValue"})
    public Capacity(CapacityType capacityType, Integer capacityValue) {
        super();
        this.capacityType = capacityType;
        this.capacityValue = capacityValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The capacity model to use.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityType")
        private CapacityType capacityType;

        /**
         * The capacity model to use.
         *
         * @param capacityType the value to set
         * @return this builder
         **/
        public Builder capacityType(CapacityType capacityType) {
            this.capacityType = capacityType;
            this.__explicitlySet__.add("capacityType");
            return this;
        }
        /**
         * The capacity value selected (OLPU count, number of users, ...etc...). This parameter affects the
         * number of CPUs, amount of memory or other resources allocated to the instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityValue")
        private Integer capacityValue;

        /**
         * The capacity value selected (OLPU count, number of users, ...etc...). This parameter affects the
         * number of CPUs, amount of memory or other resources allocated to the instance.
         *
         * @param capacityValue the value to set
         * @return this builder
         **/
        public Builder capacityValue(Integer capacityValue) {
            this.capacityValue = capacityValue;
            this.__explicitlySet__.add("capacityValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Capacity build() {
            Capacity __instance__ = new Capacity(capacityType, capacityValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Capacity o) {
            Builder copiedBuilder =
                    capacityType(o.getCapacityType()).capacityValue(o.getCapacityValue());

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
     * The capacity model to use.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityType")
    private final CapacityType capacityType;

    /**
     * The capacity model to use.
     *
     * @return the value
     **/
    public CapacityType getCapacityType() {
        return capacityType;
    }

    /**
     * The capacity value selected (OLPU count, number of users, ...etc...). This parameter affects the
     * number of CPUs, amount of memory or other resources allocated to the instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityValue")
    private final Integer capacityValue;

    /**
     * The capacity value selected (OLPU count, number of users, ...etc...). This parameter affects the
     * number of CPUs, amount of memory or other resources allocated to the instance.
     *
     * @return the value
     **/
    public Integer getCapacityValue() {
        return capacityValue;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Capacity(");
        sb.append("capacityType=").append(String.valueOf(this.capacityType));
        sb.append(", capacityValue=").append(String.valueOf(this.capacityValue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Capacity)) {
            return false;
        }

        Capacity other = (Capacity) o;
        return java.util.Objects.equals(this.capacityType, other.capacityType)
                && java.util.Objects.equals(this.capacityValue, other.capacityValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.capacityType == null ? 43 : this.capacityType.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityValue == null ? 43 : this.capacityValue.hashCode());
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
