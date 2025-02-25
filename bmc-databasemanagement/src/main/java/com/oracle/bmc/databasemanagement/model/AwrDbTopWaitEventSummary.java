/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of the AWR top wait event data for one event.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrDbTopWaitEventSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrDbTopWaitEventSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "waitsPerSec", "avgWaitTimePerSec"})
    public AwrDbTopWaitEventSummary(String name, Double waitsPerSec, Double avgWaitTimePerSec) {
        super();
        this.name = name;
        this.waitsPerSec = waitsPerSec;
        this.avgWaitTimePerSec = avgWaitTimePerSec;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the event.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the event.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The wait count per second.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("waitsPerSec")
        private Double waitsPerSec;

        /**
         * The wait count per second.
         * @param waitsPerSec the value to set
         * @return this builder
         **/
        public Builder waitsPerSec(Double waitsPerSec) {
            this.waitsPerSec = waitsPerSec;
            this.__explicitlySet__.add("waitsPerSec");
            return this;
        }
        /**
         * The average wait time per second.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("avgWaitTimePerSec")
        private Double avgWaitTimePerSec;

        /**
         * The average wait time per second.
         * @param avgWaitTimePerSec the value to set
         * @return this builder
         **/
        public Builder avgWaitTimePerSec(Double avgWaitTimePerSec) {
            this.avgWaitTimePerSec = avgWaitTimePerSec;
            this.__explicitlySet__.add("avgWaitTimePerSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDbTopWaitEventSummary build() {
            AwrDbTopWaitEventSummary __instance__ =
                    new AwrDbTopWaitEventSummary(name, waitsPerSec, avgWaitTimePerSec);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDbTopWaitEventSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .waitsPerSec(o.getWaitsPerSec())
                            .avgWaitTimePerSec(o.getAvgWaitTimePerSec());

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
     * The name of the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the event.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The wait count per second.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("waitsPerSec")
    private final Double waitsPerSec;

    /**
     * The wait count per second.
     * @return the value
     **/
    public Double getWaitsPerSec() {
        return waitsPerSec;
    }

    /**
     * The average wait time per second.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("avgWaitTimePerSec")
    private final Double avgWaitTimePerSec;

    /**
     * The average wait time per second.
     * @return the value
     **/
    public Double getAvgWaitTimePerSec() {
        return avgWaitTimePerSec;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AwrDbTopWaitEventSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", waitsPerSec=").append(String.valueOf(this.waitsPerSec));
        sb.append(", avgWaitTimePerSec=").append(String.valueOf(this.avgWaitTimePerSec));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDbTopWaitEventSummary)) {
            return false;
        }

        AwrDbTopWaitEventSummary other = (AwrDbTopWaitEventSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.waitsPerSec, other.waitsPerSec)
                && java.util.Objects.equals(this.avgWaitTimePerSec, other.avgWaitTimePerSec)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.waitsPerSec == null ? 43 : this.waitsPerSec.hashCode());
        result =
                (result * PRIME)
                        + (this.avgWaitTimePerSec == null ? 43 : this.avgWaitTimePerSec.hashCode());
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
