/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PortRange.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PortRange {
    @Deprecated
    @java.beans.ConstructorProperties({"max", "min"})
    public PortRange(Integer max, Integer min) {
        super();
        this.max = max;
        this.min = min;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The maximum port number, which must not be less than the minimum port number. To specify
         * a single port number, set both the min and max to the same value.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private Integer max;

        /**
         * The maximum port number, which must not be less than the minimum port number. To specify
         * a single port number, set both the min and max to the same value.
         *
         * @param max the value to set
         * @return this builder
         **/
        public Builder max(Integer max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }
        /**
         * The minimum port number, which must not be greater than the maximum port number.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private Integer min;

        /**
         * The minimum port number, which must not be greater than the maximum port number.
         *
         * @param min the value to set
         * @return this builder
         **/
        public Builder min(Integer min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PortRange build() {
            PortRange __instance__ = new PortRange(max, min);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PortRange o) {
            Builder copiedBuilder = max(o.getMax()).min(o.getMin());

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
     * The maximum port number, which must not be less than the minimum port number. To specify
     * a single port number, set both the min and max to the same value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    private final Integer max;

    /**
     * The maximum port number, which must not be less than the minimum port number. To specify
     * a single port number, set both the min and max to the same value.
     *
     * @return the value
     **/
    public Integer getMax() {
        return max;
    }

    /**
     * The minimum port number, which must not be greater than the maximum port number.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    private final Integer min;

    /**
     * The minimum port number, which must not be greater than the maximum port number.
     *
     * @return the value
     **/
    public Integer getMin() {
        return min;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PortRange(");
        sb.append("max=").append(String.valueOf(this.max));
        sb.append(", min=").append(String.valueOf(this.min));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PortRange)) {
            return false;
        }

        PortRange other = (PortRange) o;
        return java.util.Objects.equals(this.max, other.max)
                && java.util.Objects.equals(this.min, other.min)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.max == null ? 43 : this.max.hashCode());
        result = (result * PRIME) + (this.min == null ? 43 : this.min.hashCode());
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
