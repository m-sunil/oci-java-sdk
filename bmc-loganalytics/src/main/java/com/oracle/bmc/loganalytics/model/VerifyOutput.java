/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Verify acceleration output.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VerifyOutput.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VerifyOutput {
    @Deprecated
    @java.beans.ConstructorProperties({
        "scheduledTaskId",
        "responseTimeInMs",
        "totalMatchedCount",
        "totalCount",
        "columns",
        "results"
    })
    public VerifyOutput(
            String scheduledTaskId,
            Long responseTimeInMs,
            Long totalMatchedCount,
            Integer totalCount,
            java.util.List<ResultColumn> columns,
            java.util.List<java.util.Map<String, Object>> results) {
        super();
        this.scheduledTaskId = scheduledTaskId;
        this.responseTimeInMs = responseTimeInMs;
        this.totalMatchedCount = totalMatchedCount;
        this.totalCount = totalCount;
        this.columns = columns;
        this.results = results;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Acceleration task identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledTaskId")
        private String scheduledTaskId;

        /**
         * Acceleration task identifier.
         * @param scheduledTaskId the value to set
         * @return this builder
         **/
        public Builder scheduledTaskId(String scheduledTaskId) {
            this.scheduledTaskId = scheduledTaskId;
            this.__explicitlySet__.add("scheduledTaskId");
            return this;
        }
        /**
         * Response time in ms.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInMs")
        private Long responseTimeInMs;

        /**
         * Response time in ms.
         * @param responseTimeInMs the value to set
         * @return this builder
         **/
        public Builder responseTimeInMs(Long responseTimeInMs) {
            this.responseTimeInMs = responseTimeInMs;
            this.__explicitlySet__.add("responseTimeInMs");
            return this;
        }
        /**
         * Total match count.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalMatchedCount")
        private Long totalMatchedCount;

        /**
         * Total match count.
         * @param totalMatchedCount the value to set
         * @return this builder
         **/
        public Builder totalMatchedCount(Long totalMatchedCount) {
            this.totalMatchedCount = totalMatchedCount;
            this.__explicitlySet__.add("totalMatchedCount");
            return this;
        }
        /**
         * Total count.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Integer totalCount;

        /**
         * Total count.
         * @param totalCount the value to set
         * @return this builder
         **/
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }
        /**
         * Acceleration result columns, included if requested (shouldIncludeResults).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<ResultColumn> columns;

        /**
         * Acceleration result columns, included if requested (shouldIncludeResults).
         * @param columns the value to set
         * @return this builder
         **/
        public Builder columns(java.util.List<ResultColumn> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }
        /**
         * Acceleration result values, included if requested (shouldIncludeResults).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("results")
        private java.util.List<java.util.Map<String, Object>> results;

        /**
         * Acceleration result values, included if requested (shouldIncludeResults).
         * @param results the value to set
         * @return this builder
         **/
        public Builder results(java.util.List<java.util.Map<String, Object>> results) {
            this.results = results;
            this.__explicitlySet__.add("results");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VerifyOutput build() {
            VerifyOutput __instance__ =
                    new VerifyOutput(
                            scheduledTaskId,
                            responseTimeInMs,
                            totalMatchedCount,
                            totalCount,
                            columns,
                            results);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VerifyOutput o) {
            Builder copiedBuilder =
                    scheduledTaskId(o.getScheduledTaskId())
                            .responseTimeInMs(o.getResponseTimeInMs())
                            .totalMatchedCount(o.getTotalMatchedCount())
                            .totalCount(o.getTotalCount())
                            .columns(o.getColumns())
                            .results(o.getResults());

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
     * Acceleration task identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledTaskId")
    private final String scheduledTaskId;

    /**
     * Acceleration task identifier.
     * @return the value
     **/
    public String getScheduledTaskId() {
        return scheduledTaskId;
    }

    /**
     * Response time in ms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInMs")
    private final Long responseTimeInMs;

    /**
     * Response time in ms.
     * @return the value
     **/
    public Long getResponseTimeInMs() {
        return responseTimeInMs;
    }

    /**
     * Total match count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMatchedCount")
    private final Long totalMatchedCount;

    /**
     * Total match count.
     * @return the value
     **/
    public Long getTotalMatchedCount() {
        return totalMatchedCount;
    }

    /**
     * Total count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    private final Integer totalCount;

    /**
     * Total count.
     * @return the value
     **/
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Acceleration result columns, included if requested (shouldIncludeResults).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<ResultColumn> columns;

    /**
     * Acceleration result columns, included if requested (shouldIncludeResults).
     * @return the value
     **/
    public java.util.List<ResultColumn> getColumns() {
        return columns;
    }

    /**
     * Acceleration result values, included if requested (shouldIncludeResults).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("results")
    private final java.util.List<java.util.Map<String, Object>> results;

    /**
     * Acceleration result values, included if requested (shouldIncludeResults).
     * @return the value
     **/
    public java.util.List<java.util.Map<String, Object>> getResults() {
        return results;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VerifyOutput(");
        sb.append("scheduledTaskId=").append(String.valueOf(this.scheduledTaskId));
        sb.append(", responseTimeInMs=").append(String.valueOf(this.responseTimeInMs));
        sb.append(", totalMatchedCount=").append(String.valueOf(this.totalMatchedCount));
        sb.append(", totalCount=").append(String.valueOf(this.totalCount));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", results=").append(String.valueOf(this.results));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VerifyOutput)) {
            return false;
        }

        VerifyOutput other = (VerifyOutput) o;
        return java.util.Objects.equals(this.scheduledTaskId, other.scheduledTaskId)
                && java.util.Objects.equals(this.responseTimeInMs, other.responseTimeInMs)
                && java.util.Objects.equals(this.totalMatchedCount, other.totalMatchedCount)
                && java.util.Objects.equals(this.totalCount, other.totalCount)
                && java.util.Objects.equals(this.columns, other.columns)
                && java.util.Objects.equals(this.results, other.results)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.scheduledTaskId == null ? 43 : this.scheduledTaskId.hashCode());
        result =
                (result * PRIME)
                        + (this.responseTimeInMs == null ? 43 : this.responseTimeInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMatchedCount == null ? 43 : this.totalMatchedCount.hashCode());
        result = (result * PRIME) + (this.totalCount == null ? 43 : this.totalCount.hashCode());
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result = (result * PRIME) + (this.results == null ? 43 : this.results.hashCode());
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
