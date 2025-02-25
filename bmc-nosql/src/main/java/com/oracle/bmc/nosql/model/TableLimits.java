/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Throughput and storage limits configuration of a table.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TableLimits.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TableLimits {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maxReadUnits",
        "maxWriteUnits",
        "maxStorageInGBs",
        "capacityMode"
    })
    public TableLimits(
            Integer maxReadUnits,
            Integer maxWriteUnits,
            Integer maxStorageInGBs,
            CapacityMode capacityMode) {
        super();
        this.maxReadUnits = maxReadUnits;
        this.maxWriteUnits = maxWriteUnits;
        this.maxStorageInGBs = maxStorageInGBs;
        this.capacityMode = capacityMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Maximum sustained read throughput limit for the table.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxReadUnits")
        private Integer maxReadUnits;

        /**
         * Maximum sustained read throughput limit for the table.
         * @param maxReadUnits the value to set
         * @return this builder
         **/
        public Builder maxReadUnits(Integer maxReadUnits) {
            this.maxReadUnits = maxReadUnits;
            this.__explicitlySet__.add("maxReadUnits");
            return this;
        }
        /**
         * Maximum sustained write throughput limit for the table.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxWriteUnits")
        private Integer maxWriteUnits;

        /**
         * Maximum sustained write throughput limit for the table.
         * @param maxWriteUnits the value to set
         * @return this builder
         **/
        public Builder maxWriteUnits(Integer maxWriteUnits) {
            this.maxWriteUnits = maxWriteUnits;
            this.__explicitlySet__.add("maxWriteUnits");
            return this;
        }
        /**
         * Maximum size of storage used by the table.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxStorageInGBs")
        private Integer maxStorageInGBs;

        /**
         * Maximum size of storage used by the table.
         * @param maxStorageInGBs the value to set
         * @return this builder
         **/
        public Builder maxStorageInGBs(Integer maxStorageInGBs) {
            this.maxStorageInGBs = maxStorageInGBs;
            this.__explicitlySet__.add("maxStorageInGBs");
            return this;
        }
        /**
         * The capacity mode of the table.  If capacityMode = ON_DEMAND,
         * maxReadUnits and maxWriteUnits are not used, and both will have
         * the value of zero.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityMode")
        private CapacityMode capacityMode;

        /**
         * The capacity mode of the table.  If capacityMode = ON_DEMAND,
         * maxReadUnits and maxWriteUnits are not used, and both will have
         * the value of zero.
         *
         * @param capacityMode the value to set
         * @return this builder
         **/
        public Builder capacityMode(CapacityMode capacityMode) {
            this.capacityMode = capacityMode;
            this.__explicitlySet__.add("capacityMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TableLimits build() {
            TableLimits __instance__ =
                    new TableLimits(maxReadUnits, maxWriteUnits, maxStorageInGBs, capacityMode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TableLimits o) {
            Builder copiedBuilder =
                    maxReadUnits(o.getMaxReadUnits())
                            .maxWriteUnits(o.getMaxWriteUnits())
                            .maxStorageInGBs(o.getMaxStorageInGBs())
                            .capacityMode(o.getCapacityMode());

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
     * Maximum sustained read throughput limit for the table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxReadUnits")
    private final Integer maxReadUnits;

    /**
     * Maximum sustained read throughput limit for the table.
     * @return the value
     **/
    public Integer getMaxReadUnits() {
        return maxReadUnits;
    }

    /**
     * Maximum sustained write throughput limit for the table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxWriteUnits")
    private final Integer maxWriteUnits;

    /**
     * Maximum sustained write throughput limit for the table.
     * @return the value
     **/
    public Integer getMaxWriteUnits() {
        return maxWriteUnits;
    }

    /**
     * Maximum size of storage used by the table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxStorageInGBs")
    private final Integer maxStorageInGBs;

    /**
     * Maximum size of storage used by the table.
     * @return the value
     **/
    public Integer getMaxStorageInGBs() {
        return maxStorageInGBs;
    }

    /**
     * The capacity mode of the table.  If capacityMode = ON_DEMAND,
     * maxReadUnits and maxWriteUnits are not used, and both will have
     * the value of zero.
     *
     **/
    public enum CapacityMode {
        Provisioned("PROVISIONED"),
        OnDemand("ON_DEMAND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CapacityMode.class);

        private final String value;
        private static java.util.Map<String, CapacityMode> map;

        static {
            map = new java.util.HashMap<>();
            for (CapacityMode v : CapacityMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CapacityMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CapacityMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CapacityMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The capacity mode of the table.  If capacityMode = ON_DEMAND,
     * maxReadUnits and maxWriteUnits are not used, and both will have
     * the value of zero.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityMode")
    private final CapacityMode capacityMode;

    /**
     * The capacity mode of the table.  If capacityMode = ON_DEMAND,
     * maxReadUnits and maxWriteUnits are not used, and both will have
     * the value of zero.
     *
     * @return the value
     **/
    public CapacityMode getCapacityMode() {
        return capacityMode;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TableLimits(");
        sb.append("maxReadUnits=").append(String.valueOf(this.maxReadUnits));
        sb.append(", maxWriteUnits=").append(String.valueOf(this.maxWriteUnits));
        sb.append(", maxStorageInGBs=").append(String.valueOf(this.maxStorageInGBs));
        sb.append(", capacityMode=").append(String.valueOf(this.capacityMode));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TableLimits)) {
            return false;
        }

        TableLimits other = (TableLimits) o;
        return java.util.Objects.equals(this.maxReadUnits, other.maxReadUnits)
                && java.util.Objects.equals(this.maxWriteUnits, other.maxWriteUnits)
                && java.util.Objects.equals(this.maxStorageInGBs, other.maxStorageInGBs)
                && java.util.Objects.equals(this.capacityMode, other.capacityMode)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.maxReadUnits == null ? 43 : this.maxReadUnits.hashCode());
        result =
                (result * PRIME)
                        + (this.maxWriteUnits == null ? 43 : this.maxWriteUnits.hashCode());
        result =
                (result * PRIME)
                        + (this.maxStorageInGBs == null ? 43 : this.maxStorageInGBs.hashCode());
        result = (result * PRIME) + (this.capacityMode == null ? 43 : this.capacityMode.hashCode());
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
