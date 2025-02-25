/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Simple object representing signal values at a certain point in time.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataItem {
    @Deprecated
    @java.beans.ConstructorProperties({"timestamp", "values"})
    public DataItem(java.util.Date timestamp, java.util.List<Double> values) {
        super();
        this.timestamp = timestamp;
        this.values = values;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Nullable string representing timestamp.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * Nullable string representing timestamp.
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /**
         * Array of double precision values.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<Double> values;

        /**
         * Array of double precision values.
         * @param values the value to set
         * @return this builder
         **/
        public Builder values(java.util.List<Double> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataItem build() {
            DataItem __instance__ = new DataItem(timestamp, values);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataItem o) {
            Builder copiedBuilder = timestamp(o.getTimestamp()).values(o.getValues());

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
     * Nullable string representing timestamp.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * Nullable string representing timestamp.
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * Array of double precision values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<Double> values;

    /**
     * Array of double precision values.
     * @return the value
     **/
    public java.util.List<Double> getValues() {
        return values;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataItem(");
        sb.append("timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataItem)) {
            return false;
        }

        DataItem other = (DataItem) o;
        return java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
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
