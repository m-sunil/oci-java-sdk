/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Provides the timestamps and their corresponding number of remediations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResponderExecutionTrendAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResponderExecutionTrendAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dimensionsMap",
        "startTimestamp",
        "durationInSeconds",
        "count"
    })
    public ResponderExecutionTrendAggregation(
            java.util.Map<String, String> dimensionsMap,
            java.math.BigDecimal startTimestamp,
            Integer durationInSeconds,
            Integer count) {
        super();
        this.dimensionsMap = dimensionsMap;
        this.startTimestamp = startTimestamp;
        this.durationInSeconds = durationInSeconds;
        this.count = count;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The key-value pairs of dimensions and their names.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
        private java.util.Map<String, String> dimensionsMap;

        /**
         * The key-value pairs of dimensions and their names.
         * @param dimensionsMap the value to set
         * @return this builder
         **/
        public Builder dimensionsMap(java.util.Map<String, String> dimensionsMap) {
            this.dimensionsMap = dimensionsMap;
            this.__explicitlySet__.add("dimensionsMap");
            return this;
        }
        /**
         * Start Time in epoch seconds
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTimestamp")
        private java.math.BigDecimal startTimestamp;

        /**
         * Start Time in epoch seconds
         * @param startTimestamp the value to set
         * @return this builder
         **/
        public Builder startTimestamp(java.math.BigDecimal startTimestamp) {
            this.startTimestamp = startTimestamp;
            this.__explicitlySet__.add("startTimestamp");
            return this;
        }
        /**
         * Duration
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
        private Integer durationInSeconds;

        /**
         * Duration
         * @param durationInSeconds the value to set
         * @return this builder
         **/
        public Builder durationInSeconds(Integer durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            this.__explicitlySet__.add("durationInSeconds");
            return this;
        }
        /**
         * The number of remediations for a given time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * The number of remediations for a given time.
         * @param count the value to set
         * @return this builder
         **/
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResponderExecutionTrendAggregation build() {
            ResponderExecutionTrendAggregation __instance__ =
                    new ResponderExecutionTrendAggregation(
                            dimensionsMap, startTimestamp, durationInSeconds, count);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResponderExecutionTrendAggregation o) {
            Builder copiedBuilder =
                    dimensionsMap(o.getDimensionsMap())
                            .startTimestamp(o.getStartTimestamp())
                            .durationInSeconds(o.getDurationInSeconds())
                            .count(o.getCount());

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
     * The key-value pairs of dimensions and their names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
    private final java.util.Map<String, String> dimensionsMap;

    /**
     * The key-value pairs of dimensions and their names.
     * @return the value
     **/
    public java.util.Map<String, String> getDimensionsMap() {
        return dimensionsMap;
    }

    /**
     * Start Time in epoch seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTimestamp")
    private final java.math.BigDecimal startTimestamp;

    /**
     * Start Time in epoch seconds
     * @return the value
     **/
    public java.math.BigDecimal getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * Duration
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
    private final Integer durationInSeconds;

    /**
     * Duration
     * @return the value
     **/
    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * The number of remediations for a given time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * The number of remediations for a given time.
     * @return the value
     **/
    public Integer getCount() {
        return count;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResponderExecutionTrendAggregation(");
        sb.append("dimensionsMap=").append(String.valueOf(this.dimensionsMap));
        sb.append(", startTimestamp=").append(String.valueOf(this.startTimestamp));
        sb.append(", durationInSeconds=").append(String.valueOf(this.durationInSeconds));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResponderExecutionTrendAggregation)) {
            return false;
        }

        ResponderExecutionTrendAggregation other = (ResponderExecutionTrendAggregation) o;
        return java.util.Objects.equals(this.dimensionsMap, other.dimensionsMap)
                && java.util.Objects.equals(this.startTimestamp, other.startTimestamp)
                && java.util.Objects.equals(this.durationInSeconds, other.durationInSeconds)
                && java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dimensionsMap == null ? 43 : this.dimensionsMap.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimestamp == null ? 43 : this.startTimestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.durationInSeconds == null ? 43 : this.durationInSeconds.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
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
