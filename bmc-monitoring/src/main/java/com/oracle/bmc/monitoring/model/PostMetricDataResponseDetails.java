/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The response object returned from a PostMetricData operation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PostMetricDataResponseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PostMetricDataResponseDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"failedMetricsCount", "failedMetrics"})
    public PostMetricDataResponseDetails(
            Integer failedMetricsCount, java.util.List<FailedMetricRecord> failedMetrics) {
        super();
        this.failedMetricsCount = failedMetricsCount;
        this.failedMetrics = failedMetrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of metric objects that failed input validation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("failedMetricsCount")
        private Integer failedMetricsCount;

        /**
         * The number of metric objects that failed input validation.
         * @param failedMetricsCount the value to set
         * @return this builder
         **/
        public Builder failedMetricsCount(Integer failedMetricsCount) {
            this.failedMetricsCount = failedMetricsCount;
            this.__explicitlySet__.add("failedMetricsCount");
            return this;
        }
        /**
         * A list of records identifying metric objects that failed input validation
         * and the reasons for the failures.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("failedMetrics")
        private java.util.List<FailedMetricRecord> failedMetrics;

        /**
         * A list of records identifying metric objects that failed input validation
         * and the reasons for the failures.
         *
         * @param failedMetrics the value to set
         * @return this builder
         **/
        public Builder failedMetrics(java.util.List<FailedMetricRecord> failedMetrics) {
            this.failedMetrics = failedMetrics;
            this.__explicitlySet__.add("failedMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PostMetricDataResponseDetails build() {
            PostMetricDataResponseDetails __instance__ =
                    new PostMetricDataResponseDetails(failedMetricsCount, failedMetrics);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PostMetricDataResponseDetails o) {
            Builder copiedBuilder =
                    failedMetricsCount(o.getFailedMetricsCount())
                            .failedMetrics(o.getFailedMetrics());

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
     * The number of metric objects that failed input validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failedMetricsCount")
    private final Integer failedMetricsCount;

    /**
     * The number of metric objects that failed input validation.
     * @return the value
     **/
    public Integer getFailedMetricsCount() {
        return failedMetricsCount;
    }

    /**
     * A list of records identifying metric objects that failed input validation
     * and the reasons for the failures.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failedMetrics")
    private final java.util.List<FailedMetricRecord> failedMetrics;

    /**
     * A list of records identifying metric objects that failed input validation
     * and the reasons for the failures.
     *
     * @return the value
     **/
    public java.util.List<FailedMetricRecord> getFailedMetrics() {
        return failedMetrics;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PostMetricDataResponseDetails(");
        sb.append("failedMetricsCount=").append(String.valueOf(this.failedMetricsCount));
        sb.append(", failedMetrics=").append(String.valueOf(this.failedMetrics));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostMetricDataResponseDetails)) {
            return false;
        }

        PostMetricDataResponseDetails other = (PostMetricDataResponseDetails) o;
        return java.util.Objects.equals(this.failedMetricsCount, other.failedMetricsCount)
                && java.util.Objects.equals(this.failedMetrics, other.failedMetrics)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.failedMetricsCount == null
                                ? 43
                                : this.failedMetricsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.failedMetrics == null ? 43 : this.failedMetrics.hashCode());
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
