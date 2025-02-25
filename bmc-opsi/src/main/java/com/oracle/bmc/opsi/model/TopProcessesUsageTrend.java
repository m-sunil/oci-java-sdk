/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Aggregated data for top processes
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TopProcessesUsageTrend.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TopProcessesUsageTrend {
    @Deprecated
    @java.beans.ConstructorProperties({
        "endTimestamp",
        "cpuUsage",
        "cpuUtilization",
        "memoryUtilization",
        "virtualMemoryInMBs",
        "physicalMemoryInMBs",
        "maxProcessCount"
    })
    public TopProcessesUsageTrend(
            java.util.Date endTimestamp,
            Double cpuUsage,
            Double cpuUtilization,
            Double memoryUtilization,
            Double virtualMemoryInMBs,
            Double physicalMemoryInMBs,
            Integer maxProcessCount) {
        super();
        this.endTimestamp = endTimestamp;
        this.cpuUsage = cpuUsage;
        this.cpuUtilization = cpuUtilization;
        this.memoryUtilization = memoryUtilization;
        this.virtualMemoryInMBs = virtualMemoryInMBs;
        this.physicalMemoryInMBs = physicalMemoryInMBs;
        this.maxProcessCount = maxProcessCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The timestamp in which the current sampling period ends in RFC 3339 format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
        private java.util.Date endTimestamp;

        /**
         * The timestamp in which the current sampling period ends in RFC 3339 format.
         * @param endTimestamp the value to set
         * @return this builder
         **/
        public Builder endTimestamp(java.util.Date endTimestamp) {
            this.endTimestamp = endTimestamp;
            this.__explicitlySet__.add("endTimestamp");
            return this;
        }
        /**
         * Process CPU usage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuUsage")
        private Double cpuUsage;

        /**
         * Process CPU usage.
         * @param cpuUsage the value to set
         * @return this builder
         **/
        public Builder cpuUsage(Double cpuUsage) {
            this.cpuUsage = cpuUsage;
            this.__explicitlySet__.add("cpuUsage");
            return this;
        }
        /**
         * Process CPU utilization percentage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilization")
        private Double cpuUtilization;

        /**
         * Process CPU utilization percentage
         * @param cpuUtilization the value to set
         * @return this builder
         **/
        public Builder cpuUtilization(Double cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            this.__explicitlySet__.add("cpuUtilization");
            return this;
        }
        /**
         * Process memory utilization percentage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilization")
        private Double memoryUtilization;

        /**
         * Process memory utilization percentage
         * @param memoryUtilization the value to set
         * @return this builder
         **/
        public Builder memoryUtilization(Double memoryUtilization) {
            this.memoryUtilization = memoryUtilization;
            this.__explicitlySet__.add("memoryUtilization");
            return this;
        }
        /**
         * Process virtual memory in Megabytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("virtualMemoryInMBs")
        private Double virtualMemoryInMBs;

        /**
         * Process virtual memory in Megabytes
         * @param virtualMemoryInMBs the value to set
         * @return this builder
         **/
        public Builder virtualMemoryInMBs(Double virtualMemoryInMBs) {
            this.virtualMemoryInMBs = virtualMemoryInMBs;
            this.__explicitlySet__.add("virtualMemoryInMBs");
            return this;
        }
        /**
         * Procress physical memory in Megabytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("physicalMemoryInMBs")
        private Double physicalMemoryInMBs;

        /**
         * Procress physical memory in Megabytes
         * @param physicalMemoryInMBs the value to set
         * @return this builder
         **/
        public Builder physicalMemoryInMBs(Double physicalMemoryInMBs) {
            this.physicalMemoryInMBs = physicalMemoryInMBs;
            this.__explicitlySet__.add("physicalMemoryInMBs");
            return this;
        }
        /**
         * Maximum number of processes running at time of collection
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxProcessCount")
        private Integer maxProcessCount;

        /**
         * Maximum number of processes running at time of collection
         * @param maxProcessCount the value to set
         * @return this builder
         **/
        public Builder maxProcessCount(Integer maxProcessCount) {
            this.maxProcessCount = maxProcessCount;
            this.__explicitlySet__.add("maxProcessCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopProcessesUsageTrend build() {
            TopProcessesUsageTrend __instance__ =
                    new TopProcessesUsageTrend(
                            endTimestamp,
                            cpuUsage,
                            cpuUtilization,
                            memoryUtilization,
                            virtualMemoryInMBs,
                            physicalMemoryInMBs,
                            maxProcessCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopProcessesUsageTrend o) {
            Builder copiedBuilder =
                    endTimestamp(o.getEndTimestamp())
                            .cpuUsage(o.getCpuUsage())
                            .cpuUtilization(o.getCpuUtilization())
                            .memoryUtilization(o.getMemoryUtilization())
                            .virtualMemoryInMBs(o.getVirtualMemoryInMBs())
                            .physicalMemoryInMBs(o.getPhysicalMemoryInMBs())
                            .maxProcessCount(o.getMaxProcessCount());

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
     * The timestamp in which the current sampling period ends in RFC 3339 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
    private final java.util.Date endTimestamp;

    /**
     * The timestamp in which the current sampling period ends in RFC 3339 format.
     * @return the value
     **/
    public java.util.Date getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * Process CPU usage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUsage")
    private final Double cpuUsage;

    /**
     * Process CPU usage.
     * @return the value
     **/
    public Double getCpuUsage() {
        return cpuUsage;
    }

    /**
     * Process CPU utilization percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilization")
    private final Double cpuUtilization;

    /**
     * Process CPU utilization percentage
     * @return the value
     **/
    public Double getCpuUtilization() {
        return cpuUtilization;
    }

    /**
     * Process memory utilization percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilization")
    private final Double memoryUtilization;

    /**
     * Process memory utilization percentage
     * @return the value
     **/
    public Double getMemoryUtilization() {
        return memoryUtilization;
    }

    /**
     * Process virtual memory in Megabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualMemoryInMBs")
    private final Double virtualMemoryInMBs;

    /**
     * Process virtual memory in Megabytes
     * @return the value
     **/
    public Double getVirtualMemoryInMBs() {
        return virtualMemoryInMBs;
    }

    /**
     * Procress physical memory in Megabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalMemoryInMBs")
    private final Double physicalMemoryInMBs;

    /**
     * Procress physical memory in Megabytes
     * @return the value
     **/
    public Double getPhysicalMemoryInMBs() {
        return physicalMemoryInMBs;
    }

    /**
     * Maximum number of processes running at time of collection
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxProcessCount")
    private final Integer maxProcessCount;

    /**
     * Maximum number of processes running at time of collection
     * @return the value
     **/
    public Integer getMaxProcessCount() {
        return maxProcessCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TopProcessesUsageTrend(");
        sb.append("endTimestamp=").append(String.valueOf(this.endTimestamp));
        sb.append(", cpuUsage=").append(String.valueOf(this.cpuUsage));
        sb.append(", cpuUtilization=").append(String.valueOf(this.cpuUtilization));
        sb.append(", memoryUtilization=").append(String.valueOf(this.memoryUtilization));
        sb.append(", virtualMemoryInMBs=").append(String.valueOf(this.virtualMemoryInMBs));
        sb.append(", physicalMemoryInMBs=").append(String.valueOf(this.physicalMemoryInMBs));
        sb.append(", maxProcessCount=").append(String.valueOf(this.maxProcessCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopProcessesUsageTrend)) {
            return false;
        }

        TopProcessesUsageTrend other = (TopProcessesUsageTrend) o;
        return java.util.Objects.equals(this.endTimestamp, other.endTimestamp)
                && java.util.Objects.equals(this.cpuUsage, other.cpuUsage)
                && java.util.Objects.equals(this.cpuUtilization, other.cpuUtilization)
                && java.util.Objects.equals(this.memoryUtilization, other.memoryUtilization)
                && java.util.Objects.equals(this.virtualMemoryInMBs, other.virtualMemoryInMBs)
                && java.util.Objects.equals(this.physicalMemoryInMBs, other.physicalMemoryInMBs)
                && java.util.Objects.equals(this.maxProcessCount, other.maxProcessCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endTimestamp == null ? 43 : this.endTimestamp.hashCode());
        result = (result * PRIME) + (this.cpuUsage == null ? 43 : this.cpuUsage.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuUtilization == null ? 43 : this.cpuUtilization.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryUtilization == null ? 43 : this.memoryUtilization.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualMemoryInMBs == null
                                ? 43
                                : this.virtualMemoryInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.physicalMemoryInMBs == null
                                ? 43
                                : this.physicalMemoryInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.maxProcessCount == null ? 43 : this.maxProcessCount.hashCode());
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
