/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Forecast results from the selected time period.
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
    builder = SummarizeDatabaseInsightResourceForecastTrendAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SummarizeDatabaseInsightResourceForecastTrendAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeIntervalStart",
        "timeIntervalEnd",
        "resourceMetric",
        "usageUnit",
        "pattern",
        "tablespaceName",
        "historicalData",
        "projectedData"
    })
    public SummarizeDatabaseInsightResourceForecastTrendAggregation(
            java.util.Date timeIntervalStart,
            java.util.Date timeIntervalEnd,
            ResourceMetric resourceMetric,
            UsageUnit usageUnit,
            Pattern pattern,
            String tablespaceName,
            java.util.List<HistoricalDataItem> historicalData,
            java.util.List<ProjectedDataItem> projectedData) {
        super();
        this.timeIntervalStart = timeIntervalStart;
        this.timeIntervalEnd = timeIntervalEnd;
        this.resourceMetric = resourceMetric;
        this.usageUnit = usageUnit;
        this.pattern = pattern;
        this.tablespaceName = tablespaceName;
        this.historicalData = historicalData;
        this.projectedData = projectedData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The start timestamp that was passed into the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
        private java.util.Date timeIntervalStart;

        /**
         * The start timestamp that was passed into the request.
         * @param timeIntervalStart the value to set
         * @return this builder
         **/
        public Builder timeIntervalStart(java.util.Date timeIntervalStart) {
            this.timeIntervalStart = timeIntervalStart;
            this.__explicitlySet__.add("timeIntervalStart");
            return this;
        }
        /**
         * The end timestamp that was passed into the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
        private java.util.Date timeIntervalEnd;

        /**
         * The end timestamp that was passed into the request.
         * @param timeIntervalEnd the value to set
         * @return this builder
         **/
        public Builder timeIntervalEnd(java.util.Date timeIntervalEnd) {
            this.timeIntervalEnd = timeIntervalEnd;
            this.__explicitlySet__.add("timeIntervalEnd");
            return this;
        }
        /**
         * Defines the type of resource metric (example: CPU, STORAGE)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceMetric")
        private ResourceMetric resourceMetric;

        /**
         * Defines the type of resource metric (example: CPU, STORAGE)
         *
         * @param resourceMetric the value to set
         * @return this builder
         **/
        public Builder resourceMetric(ResourceMetric resourceMetric) {
            this.resourceMetric = resourceMetric;
            this.__explicitlySet__.add("resourceMetric");
            return this;
        }
        /**
         * Displays usage unit ( CORES, GB)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageUnit")
        private UsageUnit usageUnit;

        /**
         * Displays usage unit ( CORES, GB)
         *
         * @param usageUnit the value to set
         * @return this builder
         **/
        public Builder usageUnit(UsageUnit usageUnit) {
            this.usageUnit = usageUnit;
            this.__explicitlySet__.add("usageUnit");
            return this;
        }
        /**
         * Time series patterns used in the forecasting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private Pattern pattern;

        /**
         * Time series patterns used in the forecasting.
         * @param pattern the value to set
         * @return this builder
         **/
        public Builder pattern(Pattern pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }
        /**
         * The name of tablespace.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tablespaceName")
        private String tablespaceName;

        /**
         * The name of tablespace.
         * @param tablespaceName the value to set
         * @return this builder
         **/
        public Builder tablespaceName(String tablespaceName) {
            this.tablespaceName = tablespaceName;
            this.__explicitlySet__.add("tablespaceName");
            return this;
        }
        /**
         * Time series data used for the forecast analysis.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("historicalData")
        private java.util.List<HistoricalDataItem> historicalData;

        /**
         * Time series data used for the forecast analysis.
         * @param historicalData the value to set
         * @return this builder
         **/
        public Builder historicalData(java.util.List<HistoricalDataItem> historicalData) {
            this.historicalData = historicalData;
            this.__explicitlySet__.add("historicalData");
            return this;
        }
        /**
         * Time series data result of the forecasting analysis.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("projectedData")
        private java.util.List<ProjectedDataItem> projectedData;

        /**
         * Time series data result of the forecasting analysis.
         * @param projectedData the value to set
         * @return this builder
         **/
        public Builder projectedData(java.util.List<ProjectedDataItem> projectedData) {
            this.projectedData = projectedData;
            this.__explicitlySet__.add("projectedData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeDatabaseInsightResourceForecastTrendAggregation build() {
            SummarizeDatabaseInsightResourceForecastTrendAggregation __instance__ =
                    new SummarizeDatabaseInsightResourceForecastTrendAggregation(
                            timeIntervalStart,
                            timeIntervalEnd,
                            resourceMetric,
                            usageUnit,
                            pattern,
                            tablespaceName,
                            historicalData,
                            projectedData);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeDatabaseInsightResourceForecastTrendAggregation o) {
            Builder copiedBuilder =
                    timeIntervalStart(o.getTimeIntervalStart())
                            .timeIntervalEnd(o.getTimeIntervalEnd())
                            .resourceMetric(o.getResourceMetric())
                            .usageUnit(o.getUsageUnit())
                            .pattern(o.getPattern())
                            .tablespaceName(o.getTablespaceName())
                            .historicalData(o.getHistoricalData())
                            .projectedData(o.getProjectedData());

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
     * The start timestamp that was passed into the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
    private final java.util.Date timeIntervalStart;

    /**
     * The start timestamp that was passed into the request.
     * @return the value
     **/
    public java.util.Date getTimeIntervalStart() {
        return timeIntervalStart;
    }

    /**
     * The end timestamp that was passed into the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
    private final java.util.Date timeIntervalEnd;

    /**
     * The end timestamp that was passed into the request.
     * @return the value
     **/
    public java.util.Date getTimeIntervalEnd() {
        return timeIntervalEnd;
    }

    /**
     * Defines the type of resource metric (example: CPU, STORAGE)
     *
     **/
    public enum ResourceMetric {
        Cpu("CPU"),
        Storage("STORAGE"),
        Io("IO"),
        Memory("MEMORY"),
        MemoryPga("MEMORY_PGA"),
        MemorySga("MEMORY_SGA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceMetric.class);

        private final String value;
        private static java.util.Map<String, ResourceMetric> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceMetric v : ResourceMetric.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceMetric(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceMetric create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceMetric', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Defines the type of resource metric (example: CPU, STORAGE)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceMetric")
    private final ResourceMetric resourceMetric;

    /**
     * Defines the type of resource metric (example: CPU, STORAGE)
     *
     * @return the value
     **/
    public ResourceMetric getResourceMetric() {
        return resourceMetric;
    }

    /**
     * Displays usage unit ( CORES, GB)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageUnit")
    private final UsageUnit usageUnit;

    /**
     * Displays usage unit ( CORES, GB)
     *
     * @return the value
     **/
    public UsageUnit getUsageUnit() {
        return usageUnit;
    }

    /**
     * Time series patterns used in the forecasting.
     **/
    public enum Pattern {
        Linear("LINEAR"),
        MonthlySeasons("MONTHLY_SEASONS"),
        MonthlyAndYearlySeasons("MONTHLY_AND_YEARLY_SEASONS"),
        WeeklySeasons("WEEKLY_SEASONS"),
        WeeklyAndMonthlySeasons("WEEKLY_AND_MONTHLY_SEASONS"),
        WeeklyMonthlyAndYearlySeasons("WEEKLY_MONTHLY_AND_YEARLY_SEASONS"),
        WeeklyAndYearlySeasons("WEEKLY_AND_YEARLY_SEASONS"),
        YearlySeasons("YEARLY_SEASONS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Pattern.class);

        private final String value;
        private static java.util.Map<String, Pattern> map;

        static {
            map = new java.util.HashMap<>();
            for (Pattern v : Pattern.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Pattern(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Pattern create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Pattern', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Time series patterns used in the forecasting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final Pattern pattern;

    /**
     * Time series patterns used in the forecasting.
     * @return the value
     **/
    public Pattern getPattern() {
        return pattern;
    }

    /**
     * The name of tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tablespaceName")
    private final String tablespaceName;

    /**
     * The name of tablespace.
     * @return the value
     **/
    public String getTablespaceName() {
        return tablespaceName;
    }

    /**
     * Time series data used for the forecast analysis.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("historicalData")
    private final java.util.List<HistoricalDataItem> historicalData;

    /**
     * Time series data used for the forecast analysis.
     * @return the value
     **/
    public java.util.List<HistoricalDataItem> getHistoricalData() {
        return historicalData;
    }

    /**
     * Time series data result of the forecasting analysis.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectedData")
    private final java.util.List<ProjectedDataItem> projectedData;

    /**
     * Time series data result of the forecasting analysis.
     * @return the value
     **/
    public java.util.List<ProjectedDataItem> getProjectedData() {
        return projectedData;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SummarizeDatabaseInsightResourceForecastTrendAggregation(");
        sb.append("timeIntervalStart=").append(String.valueOf(this.timeIntervalStart));
        sb.append(", timeIntervalEnd=").append(String.valueOf(this.timeIntervalEnd));
        sb.append(", resourceMetric=").append(String.valueOf(this.resourceMetric));
        sb.append(", usageUnit=").append(String.valueOf(this.usageUnit));
        sb.append(", pattern=").append(String.valueOf(this.pattern));
        sb.append(", tablespaceName=").append(String.valueOf(this.tablespaceName));
        sb.append(", historicalData=").append(String.valueOf(this.historicalData));
        sb.append(", projectedData=").append(String.valueOf(this.projectedData));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeDatabaseInsightResourceForecastTrendAggregation)) {
            return false;
        }

        SummarizeDatabaseInsightResourceForecastTrendAggregation other =
                (SummarizeDatabaseInsightResourceForecastTrendAggregation) o;
        return java.util.Objects.equals(this.timeIntervalStart, other.timeIntervalStart)
                && java.util.Objects.equals(this.timeIntervalEnd, other.timeIntervalEnd)
                && java.util.Objects.equals(this.resourceMetric, other.resourceMetric)
                && java.util.Objects.equals(this.usageUnit, other.usageUnit)
                && java.util.Objects.equals(this.pattern, other.pattern)
                && java.util.Objects.equals(this.tablespaceName, other.tablespaceName)
                && java.util.Objects.equals(this.historicalData, other.historicalData)
                && java.util.Objects.equals(this.projectedData, other.projectedData)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeIntervalStart == null ? 43 : this.timeIntervalStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalEnd == null ? 43 : this.timeIntervalEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceMetric == null ? 43 : this.resourceMetric.hashCode());
        result = (result * PRIME) + (this.usageUnit == null ? 43 : this.usageUnit.hashCode());
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
        result =
                (result * PRIME)
                        + (this.tablespaceName == null ? 43 : this.tablespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.historicalData == null ? 43 : this.historicalData.hashCode());
        result =
                (result * PRIME)
                        + (this.projectedData == null ? 43 : this.projectedData.hashCode());
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
