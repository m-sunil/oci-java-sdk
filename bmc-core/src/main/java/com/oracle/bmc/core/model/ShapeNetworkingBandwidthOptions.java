/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For a flexible shape, the amount of networking bandwidth available for instances that use this shape.
 * <p>
 * If this field is null, then this shape has a fixed amount of bandwidth equivalent to {@code networkingBandwidthInGbps}.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ShapeNetworkingBandwidthOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ShapeNetworkingBandwidthOptions {
    @Deprecated
    @java.beans.ConstructorProperties({"minInGbps", "maxInGbps", "defaultPerOcpuInGbps"})
    public ShapeNetworkingBandwidthOptions(
            Float minInGbps, Float maxInGbps, Float defaultPerOcpuInGbps) {
        super();
        this.minInGbps = minInGbps;
        this.maxInGbps = maxInGbps;
        this.defaultPerOcpuInGbps = defaultPerOcpuInGbps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The minimum amount of networking bandwidth, in gigabits per second.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minInGbps")
        private Float minInGbps;

        /**
         * The minimum amount of networking bandwidth, in gigabits per second.
         *
         * @param minInGbps the value to set
         * @return this builder
         **/
        public Builder minInGbps(Float minInGbps) {
            this.minInGbps = minInGbps;
            this.__explicitlySet__.add("minInGbps");
            return this;
        }
        /**
         * The maximum amount of networking bandwidth, in gigabits per second.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxInGbps")
        private Float maxInGbps;

        /**
         * The maximum amount of networking bandwidth, in gigabits per second.
         *
         * @param maxInGbps the value to set
         * @return this builder
         **/
        public Builder maxInGbps(Float maxInGbps) {
            this.maxInGbps = maxInGbps;
            this.__explicitlySet__.add("maxInGbps");
            return this;
        }
        /**
         * The default amount of networking bandwidth per OCPU, in gigabits per second.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGbps")
        private Float defaultPerOcpuInGbps;

        /**
         * The default amount of networking bandwidth per OCPU, in gigabits per second.
         *
         * @param defaultPerOcpuInGbps the value to set
         * @return this builder
         **/
        public Builder defaultPerOcpuInGbps(Float defaultPerOcpuInGbps) {
            this.defaultPerOcpuInGbps = defaultPerOcpuInGbps;
            this.__explicitlySet__.add("defaultPerOcpuInGbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeNetworkingBandwidthOptions build() {
            ShapeNetworkingBandwidthOptions __instance__ =
                    new ShapeNetworkingBandwidthOptions(minInGbps, maxInGbps, defaultPerOcpuInGbps);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeNetworkingBandwidthOptions o) {
            Builder copiedBuilder =
                    minInGbps(o.getMinInGbps())
                            .maxInGbps(o.getMaxInGbps())
                            .defaultPerOcpuInGbps(o.getDefaultPerOcpuInGbps());

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
     * The minimum amount of networking bandwidth, in gigabits per second.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minInGbps")
    private final Float minInGbps;

    /**
     * The minimum amount of networking bandwidth, in gigabits per second.
     *
     * @return the value
     **/
    public Float getMinInGbps() {
        return minInGbps;
    }

    /**
     * The maximum amount of networking bandwidth, in gigabits per second.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxInGbps")
    private final Float maxInGbps;

    /**
     * The maximum amount of networking bandwidth, in gigabits per second.
     *
     * @return the value
     **/
    public Float getMaxInGbps() {
        return maxInGbps;
    }

    /**
     * The default amount of networking bandwidth per OCPU, in gigabits per second.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGbps")
    private final Float defaultPerOcpuInGbps;

    /**
     * The default amount of networking bandwidth per OCPU, in gigabits per second.
     *
     * @return the value
     **/
    public Float getDefaultPerOcpuInGbps() {
        return defaultPerOcpuInGbps;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ShapeNetworkingBandwidthOptions(");
        sb.append("minInGbps=").append(String.valueOf(this.minInGbps));
        sb.append(", maxInGbps=").append(String.valueOf(this.maxInGbps));
        sb.append(", defaultPerOcpuInGbps=").append(String.valueOf(this.defaultPerOcpuInGbps));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeNetworkingBandwidthOptions)) {
            return false;
        }

        ShapeNetworkingBandwidthOptions other = (ShapeNetworkingBandwidthOptions) o;
        return java.util.Objects.equals(this.minInGbps, other.minInGbps)
                && java.util.Objects.equals(this.maxInGbps, other.maxInGbps)
                && java.util.Objects.equals(this.defaultPerOcpuInGbps, other.defaultPerOcpuInGbps)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minInGbps == null ? 43 : this.minInGbps.hashCode());
        result = (result * PRIME) + (this.maxInGbps == null ? 43 : this.maxInGbps.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultPerOcpuInGbps == null
                                ? 43
                                : this.defaultPerOcpuInGbps.hashCode());
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
