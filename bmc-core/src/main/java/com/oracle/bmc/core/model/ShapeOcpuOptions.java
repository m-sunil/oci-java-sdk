/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For a flexible shape, the number of OCPUs available for instances that use this shape.
 * <p>
 * If this field is null, then this shape has a fixed number of OCPUs equal to {@code ocpus}.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ShapeOcpuOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ShapeOcpuOptions {
    @Deprecated
    @java.beans.ConstructorProperties({"min", "max"})
    public ShapeOcpuOptions(Float min, Float max) {
        super();
        this.min = min;
        this.max = max;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The minimum number of OCPUs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private Float min;

        /**
         * The minimum number of OCPUs.
         *
         * @param min the value to set
         * @return this builder
         **/
        public Builder min(Float min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }
        /**
         * The maximum number of OCPUs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private Float max;

        /**
         * The maximum number of OCPUs.
         *
         * @param max the value to set
         * @return this builder
         **/
        public Builder max(Float max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeOcpuOptions build() {
            ShapeOcpuOptions __instance__ = new ShapeOcpuOptions(min, max);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeOcpuOptions o) {
            Builder copiedBuilder = min(o.getMin()).max(o.getMax());

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
     * The minimum number of OCPUs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    private final Float min;

    /**
     * The minimum number of OCPUs.
     *
     * @return the value
     **/
    public Float getMin() {
        return min;
    }

    /**
     * The maximum number of OCPUs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    private final Float max;

    /**
     * The maximum number of OCPUs.
     *
     * @return the value
     **/
    public Float getMax() {
        return max;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ShapeOcpuOptions(");
        sb.append("min=").append(String.valueOf(this.min));
        sb.append(", max=").append(String.valueOf(this.max));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeOcpuOptions)) {
            return false;
        }

        ShapeOcpuOptions other = (ShapeOcpuOptions) o;
        return java.util.Objects.equals(this.min, other.min)
                && java.util.Objects.equals(this.max, other.max)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.min == null ? 43 : this.min.hashCode());
        result = (result * PRIME) + (this.max == null ? 43 : this.max.hashCode());
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
