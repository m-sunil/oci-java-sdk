/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The statistics of a SQL execution plan.
 *
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
    builder = SqlTuningTaskPlanStats.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlTuningTaskPlanStats {
    @Deprecated
    @java.beans.ConstructorProperties({"planType", "planStats", "planStatus"})
    public SqlTuningTaskPlanStats(
            String planType, java.util.Map<String, Double> planStats, PlanStatus planStatus) {
        super();
        this.planType = planType;
        this.planStats = planStats;
        this.planStatus = planStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the original or modified plan with profile, index, and so on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planType")
        private String planType;

        /**
         * The type of the original or modified plan with profile, index, and so on.
         * @param planType the value to set
         * @return this builder
         **/
        public Builder planType(String planType) {
            this.planType = planType;
            this.__explicitlySet__.add("planType");
            return this;
        }
        /**
         * A map contains the statistics for the SQL execution using the plan.
         * The key of the map is the metric's name. The value of the map is the metric's value.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planStats")
        private java.util.Map<String, Double> planStats;

        /**
         * A map contains the statistics for the SQL execution using the plan.
         * The key of the map is the metric's name. The value of the map is the metric's value.
         *
         * @param planStats the value to set
         * @return this builder
         **/
        public Builder planStats(java.util.Map<String, Double> planStats) {
            this.planStats = planStats;
            this.__explicitlySet__.add("planStats");
            return this;
        }
        /**
         * The status of the execution using the plan.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planStatus")
        private PlanStatus planStatus;

        /**
         * The status of the execution using the plan.
         *
         * @param planStatus the value to set
         * @return this builder
         **/
        public Builder planStatus(PlanStatus planStatus) {
            this.planStatus = planStatus;
            this.__explicitlySet__.add("planStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningTaskPlanStats build() {
            SqlTuningTaskPlanStats __instance__ =
                    new SqlTuningTaskPlanStats(planType, planStats, planStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningTaskPlanStats o) {
            Builder copiedBuilder =
                    planType(o.getPlanType())
                            .planStats(o.getPlanStats())
                            .planStatus(o.getPlanStatus());

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
     * The type of the original or modified plan with profile, index, and so on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planType")
    private final String planType;

    /**
     * The type of the original or modified plan with profile, index, and so on.
     * @return the value
     **/
    public String getPlanType() {
        return planType;
    }

    /**
     * A map contains the statistics for the SQL execution using the plan.
     * The key of the map is the metric's name. The value of the map is the metric's value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planStats")
    private final java.util.Map<String, Double> planStats;

    /**
     * A map contains the statistics for the SQL execution using the plan.
     * The key of the map is the metric's name. The value of the map is the metric's value.
     *
     * @return the value
     **/
    public java.util.Map<String, Double> getPlanStats() {
        return planStats;
    }

    /**
     * The status of the execution using the plan.
     *
     **/
    public enum PlanStatus {
        Complete("COMPLETE"),
        Partial("PARTIAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlanStatus.class);

        private final String value;
        private static java.util.Map<String, PlanStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (PlanStatus v : PlanStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlanStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlanStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlanStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the execution using the plan.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planStatus")
    private final PlanStatus planStatus;

    /**
     * The status of the execution using the plan.
     *
     * @return the value
     **/
    public PlanStatus getPlanStatus() {
        return planStatus;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlTuningTaskPlanStats(");
        sb.append("planType=").append(String.valueOf(this.planType));
        sb.append(", planStats=").append(String.valueOf(this.planStats));
        sb.append(", planStatus=").append(String.valueOf(this.planStatus));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningTaskPlanStats)) {
            return false;
        }

        SqlTuningTaskPlanStats other = (SqlTuningTaskPlanStats) o;
        return java.util.Objects.equals(this.planType, other.planType)
                && java.util.Objects.equals(this.planStats, other.planStats)
                && java.util.Objects.equals(this.planStatus, other.planStatus)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.planType == null ? 43 : this.planType.hashCode());
        result = (result * PRIME) + (this.planStats == null ? 43 : this.planStats.hashCode());
        result = (result * PRIME) + (this.planStatus == null ? 43 : this.planStatus.hashCode());
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
