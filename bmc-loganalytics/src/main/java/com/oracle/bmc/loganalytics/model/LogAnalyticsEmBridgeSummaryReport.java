/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Log-Analytics EM Bridge counts summary.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsEmBridgeSummaryReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsEmBridgeSummaryReport {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "activeEmBridgeCount",
        "creatingEmBridgeCount",
        "needsAttentionEmBridgeCount",
        "deletedEmBridgeCount",
        "totalEmBridgeCount"
    })
    public LogAnalyticsEmBridgeSummaryReport(
            String compartmentId,
            Integer activeEmBridgeCount,
            Integer creatingEmBridgeCount,
            Integer needsAttentionEmBridgeCount,
            Integer deletedEmBridgeCount,
            Integer totalEmBridgeCount) {
        super();
        this.compartmentId = compartmentId;
        this.activeEmBridgeCount = activeEmBridgeCount;
        this.creatingEmBridgeCount = creatingEmBridgeCount;
        this.needsAttentionEmBridgeCount = needsAttentionEmBridgeCount;
        this.deletedEmBridgeCount = deletedEmBridgeCount;
        this.totalEmBridgeCount = totalEmBridgeCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Total number of ACTIVE enterprise manager bridges.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("activeEmBridgeCount")
        private Integer activeEmBridgeCount;

        /**
         * Total number of ACTIVE enterprise manager bridges.
         *
         * @param activeEmBridgeCount the value to set
         * @return this builder
         **/
        public Builder activeEmBridgeCount(Integer activeEmBridgeCount) {
            this.activeEmBridgeCount = activeEmBridgeCount;
            this.__explicitlySet__.add("activeEmBridgeCount");
            return this;
        }
        /**
         * Number of enterprise manager bridges in CREATING state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("creatingEmBridgeCount")
        private Integer creatingEmBridgeCount;

        /**
         * Number of enterprise manager bridges in CREATING state.
         *
         * @param creatingEmBridgeCount the value to set
         * @return this builder
         **/
        public Builder creatingEmBridgeCount(Integer creatingEmBridgeCount) {
            this.creatingEmBridgeCount = creatingEmBridgeCount;
            this.__explicitlySet__.add("creatingEmBridgeCount");
            return this;
        }
        /**
         * Number of enterprise manager bridges in NEEDS_ATTENTION state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("needsAttentionEmBridgeCount")
        private Integer needsAttentionEmBridgeCount;

        /**
         * Number of enterprise manager bridges in NEEDS_ATTENTION state.
         *
         * @param needsAttentionEmBridgeCount the value to set
         * @return this builder
         **/
        public Builder needsAttentionEmBridgeCount(Integer needsAttentionEmBridgeCount) {
            this.needsAttentionEmBridgeCount = needsAttentionEmBridgeCount;
            this.__explicitlySet__.add("needsAttentionEmBridgeCount");
            return this;
        }
        /**
         * Number of enterprise manager bridges in DELETED state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deletedEmBridgeCount")
        private Integer deletedEmBridgeCount;

        /**
         * Number of enterprise manager bridges in DELETED state.
         *
         * @param deletedEmBridgeCount the value to set
         * @return this builder
         **/
        public Builder deletedEmBridgeCount(Integer deletedEmBridgeCount) {
            this.deletedEmBridgeCount = deletedEmBridgeCount;
            this.__explicitlySet__.add("deletedEmBridgeCount");
            return this;
        }
        /**
         * Total number of enterprise manager bridges.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalEmBridgeCount")
        private Integer totalEmBridgeCount;

        /**
         * Total number of enterprise manager bridges.
         *
         * @param totalEmBridgeCount the value to set
         * @return this builder
         **/
        public Builder totalEmBridgeCount(Integer totalEmBridgeCount) {
            this.totalEmBridgeCount = totalEmBridgeCount;
            this.__explicitlySet__.add("totalEmBridgeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEmBridgeSummaryReport build() {
            LogAnalyticsEmBridgeSummaryReport __instance__ =
                    new LogAnalyticsEmBridgeSummaryReport(
                            compartmentId,
                            activeEmBridgeCount,
                            creatingEmBridgeCount,
                            needsAttentionEmBridgeCount,
                            deletedEmBridgeCount,
                            totalEmBridgeCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsEmBridgeSummaryReport o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .activeEmBridgeCount(o.getActiveEmBridgeCount())
                            .creatingEmBridgeCount(o.getCreatingEmBridgeCount())
                            .needsAttentionEmBridgeCount(o.getNeedsAttentionEmBridgeCount())
                            .deletedEmBridgeCount(o.getDeletedEmBridgeCount())
                            .totalEmBridgeCount(o.getTotalEmBridgeCount());

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
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Total number of ACTIVE enterprise manager bridges.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeEmBridgeCount")
    private final Integer activeEmBridgeCount;

    /**
     * Total number of ACTIVE enterprise manager bridges.
     *
     * @return the value
     **/
    public Integer getActiveEmBridgeCount() {
        return activeEmBridgeCount;
    }

    /**
     * Number of enterprise manager bridges in CREATING state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("creatingEmBridgeCount")
    private final Integer creatingEmBridgeCount;

    /**
     * Number of enterprise manager bridges in CREATING state.
     *
     * @return the value
     **/
    public Integer getCreatingEmBridgeCount() {
        return creatingEmBridgeCount;
    }

    /**
     * Number of enterprise manager bridges in NEEDS_ATTENTION state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("needsAttentionEmBridgeCount")
    private final Integer needsAttentionEmBridgeCount;

    /**
     * Number of enterprise manager bridges in NEEDS_ATTENTION state.
     *
     * @return the value
     **/
    public Integer getNeedsAttentionEmBridgeCount() {
        return needsAttentionEmBridgeCount;
    }

    /**
     * Number of enterprise manager bridges in DELETED state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deletedEmBridgeCount")
    private final Integer deletedEmBridgeCount;

    /**
     * Number of enterprise manager bridges in DELETED state.
     *
     * @return the value
     **/
    public Integer getDeletedEmBridgeCount() {
        return deletedEmBridgeCount;
    }

    /**
     * Total number of enterprise manager bridges.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalEmBridgeCount")
    private final Integer totalEmBridgeCount;

    /**
     * Total number of enterprise manager bridges.
     *
     * @return the value
     **/
    public Integer getTotalEmBridgeCount() {
        return totalEmBridgeCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsEmBridgeSummaryReport(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", activeEmBridgeCount=").append(String.valueOf(this.activeEmBridgeCount));
        sb.append(", creatingEmBridgeCount=").append(String.valueOf(this.creatingEmBridgeCount));
        sb.append(", needsAttentionEmBridgeCount=")
                .append(String.valueOf(this.needsAttentionEmBridgeCount));
        sb.append(", deletedEmBridgeCount=").append(String.valueOf(this.deletedEmBridgeCount));
        sb.append(", totalEmBridgeCount=").append(String.valueOf(this.totalEmBridgeCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsEmBridgeSummaryReport)) {
            return false;
        }

        LogAnalyticsEmBridgeSummaryReport other = (LogAnalyticsEmBridgeSummaryReport) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.activeEmBridgeCount, other.activeEmBridgeCount)
                && java.util.Objects.equals(this.creatingEmBridgeCount, other.creatingEmBridgeCount)
                && java.util.Objects.equals(
                        this.needsAttentionEmBridgeCount, other.needsAttentionEmBridgeCount)
                && java.util.Objects.equals(this.deletedEmBridgeCount, other.deletedEmBridgeCount)
                && java.util.Objects.equals(this.totalEmBridgeCount, other.totalEmBridgeCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.activeEmBridgeCount == null
                                ? 43
                                : this.activeEmBridgeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.creatingEmBridgeCount == null
                                ? 43
                                : this.creatingEmBridgeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.needsAttentionEmBridgeCount == null
                                ? 43
                                : this.needsAttentionEmBridgeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.deletedEmBridgeCount == null
                                ? 43
                                : this.deletedEmBridgeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalEmBridgeCount == null
                                ? 43
                                : this.totalEmBridgeCount.hashCode());
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
