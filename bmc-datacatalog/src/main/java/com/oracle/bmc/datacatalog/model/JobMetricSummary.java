/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Job metric summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobMetricSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JobMetricSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "description",
        "jobExecutionKey",
        "uri",
        "timeCreated",
        "timeInserted",
        "category",
        "displayName",
        "subCategory",
        "unit",
        "value",
        "batchKey"
    })
    public JobMetricSummary(
            String key,
            String description,
            String jobExecutionKey,
            String uri,
            java.util.Date timeCreated,
            java.util.Date timeInserted,
            String category,
            String displayName,
            String subCategory,
            String unit,
            String value,
            String batchKey) {
        super();
        this.key = key;
        this.description = description;
        this.jobExecutionKey = jobExecutionKey;
        this.uri = uri;
        this.timeCreated = timeCreated;
        this.timeInserted = timeInserted;
        this.category = category;
        this.displayName = displayName;
        this.subCategory = subCategory;
        this.unit = unit;
        this.value = value;
        this.batchKey = batchKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Key of the job metric that is immutable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Key of the job metric that is immutable.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Detailed description of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the metric.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The unique key of the parent job execution for which the job metric resource was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionKey")
        private String jobExecutionKey;

        /**
         * The unique key of the parent job execution for which the job metric resource was created.
         * @param jobExecutionKey the value to set
         * @return this builder
         **/
        public Builder jobExecutionKey(String jobExecutionKey) {
            this.jobExecutionKey = jobExecutionKey;
            this.__explicitlySet__.add("jobExecutionKey");
            return this;
        }
        /**
         * URI to the job metric instance in the API.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the job metric instance in the API.
         * @param uri the value to set
         * @return this builder
         **/
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /**
         * The date and time the job metric was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the job metric was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the metric was logged or captured in the system where the job executed.
         * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeInserted")
        private java.util.Date timeInserted;

        /**
         * The time the metric was logged or captured in the system where the job executed.
         * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @param timeInserted the value to set
         * @return this builder
         **/
        public Builder timeInserted(java.util.Date timeInserted) {
            this.timeInserted = timeInserted;
            this.__explicitlySet__.add("timeInserted");
            return this;
        }
        /**
         * Category of this metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * Category of this metric.
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Sub category of this metric under the category. Used for aggregating values. May be null.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subCategory")
        private String subCategory;

        /**
         * Sub category of this metric under the category. Used for aggregating values. May be null.
         * @param subCategory the value to set
         * @return this builder
         **/
        public Builder subCategory(String subCategory) {
            this.subCategory = subCategory;
            this.__explicitlySet__.add("subCategory");
            return this;
        }
        /**
         * Unit of this metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        /**
         * Unit of this metric.
         * @param unit the value to set
         * @return this builder
         **/
        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }
        /**
         * Value of this metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Value of this metric.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Batch key for grouping, may be null.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("batchKey")
        private String batchKey;

        /**
         * Batch key for grouping, may be null.
         * @param batchKey the value to set
         * @return this builder
         **/
        public Builder batchKey(String batchKey) {
            this.batchKey = batchKey;
            this.__explicitlySet__.add("batchKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobMetricSummary build() {
            JobMetricSummary __instance__ =
                    new JobMetricSummary(
                            key,
                            description,
                            jobExecutionKey,
                            uri,
                            timeCreated,
                            timeInserted,
                            category,
                            displayName,
                            subCategory,
                            unit,
                            value,
                            batchKey);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobMetricSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .description(o.getDescription())
                            .jobExecutionKey(o.getJobExecutionKey())
                            .uri(o.getUri())
                            .timeCreated(o.getTimeCreated())
                            .timeInserted(o.getTimeInserted())
                            .category(o.getCategory())
                            .displayName(o.getDisplayName())
                            .subCategory(o.getSubCategory())
                            .unit(o.getUnit())
                            .value(o.getValue())
                            .batchKey(o.getBatchKey());

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
     * Key of the job metric that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Key of the job metric that is immutable.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Detailed description of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the metric.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The unique key of the parent job execution for which the job metric resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionKey")
    private final String jobExecutionKey;

    /**
     * The unique key of the parent job execution for which the job metric resource was created.
     * @return the value
     **/
    public String getJobExecutionKey() {
        return jobExecutionKey;
    }

    /**
     * URI to the job metric instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the job metric instance in the API.
     * @return the value
     **/
    public String getUri() {
        return uri;
    }

    /**
     * The date and time the job metric was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the job metric was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the metric was logged or captured in the system where the job executed.
     * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInserted")
    private final java.util.Date timeInserted;

    /**
     * The time the metric was logged or captured in the system where the job executed.
     * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeInserted() {
        return timeInserted;
    }

    /**
     * Category of this metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * Category of this metric.
     * @return the value
     **/
    public String getCategory() {
        return category;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sub category of this metric under the category. Used for aggregating values. May be null.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subCategory")
    private final String subCategory;

    /**
     * Sub category of this metric under the category. Used for aggregating values. May be null.
     * @return the value
     **/
    public String getSubCategory() {
        return subCategory;
    }

    /**
     * Unit of this metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    /**
     * Unit of this metric.
     * @return the value
     **/
    public String getUnit() {
        return unit;
    }

    /**
     * Value of this metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Value of this metric.
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * Batch key for grouping, may be null.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchKey")
    private final String batchKey;

    /**
     * Batch key for grouping, may be null.
     * @return the value
     **/
    public String getBatchKey() {
        return batchKey;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("JobMetricSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", jobExecutionKey=").append(String.valueOf(this.jobExecutionKey));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeInserted=").append(String.valueOf(this.timeInserted));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", subCategory=").append(String.valueOf(this.subCategory));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", batchKey=").append(String.valueOf(this.batchKey));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobMetricSummary)) {
            return false;
        }

        JobMetricSummary other = (JobMetricSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.jobExecutionKey, other.jobExecutionKey)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeInserted, other.timeInserted)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.subCategory, other.subCategory)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.batchKey, other.batchKey)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.jobExecutionKey == null ? 43 : this.jobExecutionKey.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeInserted == null ? 43 : this.timeInserted.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.subCategory == null ? 43 : this.subCategory.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.batchKey == null ? 43 : this.batchKey.hashCode());
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
