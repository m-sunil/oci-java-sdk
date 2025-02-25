/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For a flexible image and shape, the amount of memory supported for instances that use this image.
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
    builder = ImageMemoryConstraints.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImageMemoryConstraints {
    @Deprecated
    @java.beans.ConstructorProperties({"minInGBs", "maxInGBs"})
    public ImageMemoryConstraints(Integer minInGBs, Integer maxInGBs) {
        super();
        this.minInGBs = minInGBs;
        this.maxInGBs = maxInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The minimum amount of memory, in gigabytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
        private Integer minInGBs;

        /**
         * The minimum amount of memory, in gigabytes.
         * @param minInGBs the value to set
         * @return this builder
         **/
        public Builder minInGBs(Integer minInGBs) {
            this.minInGBs = minInGBs;
            this.__explicitlySet__.add("minInGBs");
            return this;
        }
        /**
         * The maximum amount of memory, in gigabytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
        private Integer maxInGBs;

        /**
         * The maximum amount of memory, in gigabytes.
         * @param maxInGBs the value to set
         * @return this builder
         **/
        public Builder maxInGBs(Integer maxInGBs) {
            this.maxInGBs = maxInGBs;
            this.__explicitlySet__.add("maxInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageMemoryConstraints build() {
            ImageMemoryConstraints __instance__ = new ImageMemoryConstraints(minInGBs, maxInGBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageMemoryConstraints o) {
            Builder copiedBuilder = minInGBs(o.getMinInGBs()).maxInGBs(o.getMaxInGBs());

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
     * The minimum amount of memory, in gigabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
    private final Integer minInGBs;

    /**
     * The minimum amount of memory, in gigabytes.
     * @return the value
     **/
    public Integer getMinInGBs() {
        return minInGBs;
    }

    /**
     * The maximum amount of memory, in gigabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
    private final Integer maxInGBs;

    /**
     * The maximum amount of memory, in gigabytes.
     * @return the value
     **/
    public Integer getMaxInGBs() {
        return maxInGBs;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ImageMemoryConstraints(");
        sb.append("minInGBs=").append(String.valueOf(this.minInGBs));
        sb.append(", maxInGBs=").append(String.valueOf(this.maxInGBs));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageMemoryConstraints)) {
            return false;
        }

        ImageMemoryConstraints other = (ImageMemoryConstraints) o;
        return java.util.Objects.equals(this.minInGBs, other.minInGBs)
                && java.util.Objects.equals(this.maxInGBs, other.maxInGBs)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minInGBs == null ? 43 : this.minInGBs.hashCode());
        result = (result * PRIME) + (this.maxInGBs == null ? 43 : this.maxInGBs.hashCode());
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
