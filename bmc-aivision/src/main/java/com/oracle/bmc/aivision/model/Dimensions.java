/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The width and height of a page.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Dimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Dimensions {
    @Deprecated
    @java.beans.ConstructorProperties({"width", "height", "unit"})
    public Dimensions(Double width, Double height, Unit unit) {
        super();
        this.width = width;
        this.height = height;
        this.unit = unit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * the width of a page.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("width")
        private Double width;

        /**
         * the width of a page.
         * @param width the value to set
         * @return this builder
         **/
        public Builder width(Double width) {
            this.width = width;
            this.__explicitlySet__.add("width");
            return this;
        }
        /**
         * The height of a page.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("height")
        private Double height;

        /**
         * The height of a page.
         * @param height the value to set
         * @return this builder
         **/
        public Builder height(Double height) {
            this.height = height;
            this.__explicitlySet__.add("height");
            return this;
        }
        /**
         * The unit of length.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private Unit unit;

        /**
         * The unit of length.
         * @param unit the value to set
         * @return this builder
         **/
        public Builder unit(Unit unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Dimensions build() {
            Dimensions __instance__ = new Dimensions(width, height, unit);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Dimensions o) {
            Builder copiedBuilder = width(o.getWidth()).height(o.getHeight()).unit(o.getUnit());

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
     * the width of a page.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("width")
    private final Double width;

    /**
     * the width of a page.
     * @return the value
     **/
    public Double getWidth() {
        return width;
    }

    /**
     * The height of a page.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("height")
    private final Double height;

    /**
     * The height of a page.
     * @return the value
     **/
    public Double getHeight() {
        return height;
    }

    /**
     * The unit of length.
     **/
    public enum Unit {
        Pixel("PIXEL"),
        Inch("INCH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Unit.class);

        private final String value;
        private static java.util.Map<String, Unit> map;

        static {
            map = new java.util.HashMap<>();
            for (Unit v : Unit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Unit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Unit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Unit', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The unit of length.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final Unit unit;

    /**
     * The unit of length.
     * @return the value
     **/
    public Unit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Dimensions(");
        sb.append("width=").append(String.valueOf(this.width));
        sb.append(", height=").append(String.valueOf(this.height));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Dimensions)) {
            return false;
        }

        Dimensions other = (Dimensions) o;
        return java.util.Objects.equals(this.width, other.width)
                && java.util.Objects.equals(this.height, other.height)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.width == null ? 43 : this.width.hashCode());
        result = (result * PRIME) + (this.height == null ? 43 : this.height.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
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
