/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * An object to hold detection result for one timestamp/row.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DetectionResultItem.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetectionResultItem {
    @Deprecated
    @java.beans.ConstructorProperties({"timestamp", "rowIndex", "score", "anomalies"})
    public DetectionResultItem(
            java.util.Date timestamp,
            Integer rowIndex,
            Double score,
            java.util.List<Anomaly> anomalies) {
        super();
        this.timestamp = timestamp;
        this.rowIndex = rowIndex;
        this.score = score;
        this.anomalies = anomalies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The time stamp associated with a list of anomaly points, format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The time stamp associated with a list of anomaly points, format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /**
         * The index number to indicate where anomaly points are located among all rows when there are no timestamps provided.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rowIndex")
        private Integer rowIndex;

        /**
         * The index number to indicate where anomaly points are located among all rows when there are no timestamps provided.
         * @param rowIndex the value to set
         * @return this builder
         **/
        public Builder rowIndex(Integer rowIndex) {
            this.rowIndex = rowIndex;
            this.__explicitlySet__.add("rowIndex");
            return this;
        }
        /**
         * A significant score across multiple signals at timestamp/row level
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Double score;

        /**
         * A significant score across multiple signals at timestamp/row level
         * @param score the value to set
         * @return this builder
         **/
        public Builder score(Double score) {
            this.score = score;
            this.__explicitlySet__.add("score");
            return this;
        }
        /**
         * An array of anomalies associated with a given timestamp/row.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("anomalies")
        private java.util.List<Anomaly> anomalies;

        /**
         * An array of anomalies associated with a given timestamp/row.
         * @param anomalies the value to set
         * @return this builder
         **/
        public Builder anomalies(java.util.List<Anomaly> anomalies) {
            this.anomalies = anomalies;
            this.__explicitlySet__.add("anomalies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectionResultItem build() {
            DetectionResultItem __instance__ =
                    new DetectionResultItem(timestamp, rowIndex, score, anomalies);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectionResultItem o) {
            Builder copiedBuilder =
                    timestamp(o.getTimestamp())
                            .rowIndex(o.getRowIndex())
                            .score(o.getScore())
                            .anomalies(o.getAnomalies());

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
     * The time stamp associated with a list of anomaly points, format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The time stamp associated with a list of anomaly points, format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * The index number to indicate where anomaly points are located among all rows when there are no timestamps provided.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowIndex")
    private final Integer rowIndex;

    /**
     * The index number to indicate where anomaly points are located among all rows when there are no timestamps provided.
     * @return the value
     **/
    public Integer getRowIndex() {
        return rowIndex;
    }

    /**
     * A significant score across multiple signals at timestamp/row level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Double score;

    /**
     * A significant score across multiple signals at timestamp/row level
     * @return the value
     **/
    public Double getScore() {
        return score;
    }

    /**
     * An array of anomalies associated with a given timestamp/row.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("anomalies")
    private final java.util.List<Anomaly> anomalies;

    /**
     * An array of anomalies associated with a given timestamp/row.
     * @return the value
     **/
    public java.util.List<Anomaly> getAnomalies() {
        return anomalies;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectionResultItem(");
        sb.append("timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", rowIndex=").append(String.valueOf(this.rowIndex));
        sb.append(", score=").append(String.valueOf(this.score));
        sb.append(", anomalies=").append(String.valueOf(this.anomalies));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectionResultItem)) {
            return false;
        }

        DetectionResultItem other = (DetectionResultItem) o;
        return java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.rowIndex, other.rowIndex)
                && java.util.Objects.equals(this.score, other.score)
                && java.util.Objects.equals(this.anomalies, other.anomalies)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.rowIndex == null ? 43 : this.rowIndex.hashCode());
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
        result = (result * PRIME) + (this.anomalies == null ? 43 : this.anomalies.hashCode());
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
