/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Logging configuration for resource.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JobLogConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JobLogConfigurationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "enableLogging",
        "enableAutoLogCreation",
        "logGroupId",
        "logId"
    })
    public JobLogConfigurationDetails(
            Boolean enableLogging, Boolean enableAutoLogCreation, String logGroupId, String logId) {
        super();
        this.enableLogging = enableLogging;
        this.enableAutoLogCreation = enableAutoLogCreation;
        this.logGroupId = logGroupId;
        this.logId = logId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If customer logging is enabled for job runs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enableLogging")
        private Boolean enableLogging;

        /**
         * If customer logging is enabled for job runs.
         * @param enableLogging the value to set
         * @return this builder
         **/
        public Builder enableLogging(Boolean enableLogging) {
            this.enableLogging = enableLogging;
            this.__explicitlySet__.add("enableLogging");
            return this;
        }
        /**
         * If automatic on-behalf-of log object creation is enabled for job runs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enableAutoLogCreation")
        private Boolean enableAutoLogCreation;

        /**
         * If automatic on-behalf-of log object creation is enabled for job runs.
         *
         * @param enableAutoLogCreation the value to set
         * @return this builder
         **/
        public Builder enableAutoLogCreation(Boolean enableAutoLogCreation) {
            this.enableAutoLogCreation = enableAutoLogCreation;
            this.__explicitlySet__.add("enableAutoLogCreation");
            return this;
        }
        /**
         * The log group id for where log objects are for job runs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        /**
         * The log group id for where log objects are for job runs.
         *
         * @param logGroupId the value to set
         * @return this builder
         **/
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }
        /**
         * The log id the job run will push logs too.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logId")
        private String logId;

        /**
         * The log id the job run will push logs too.
         *
         * @param logId the value to set
         * @return this builder
         **/
        public Builder logId(String logId) {
            this.logId = logId;
            this.__explicitlySet__.add("logId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobLogConfigurationDetails build() {
            JobLogConfigurationDetails __instance__ =
                    new JobLogConfigurationDetails(
                            enableLogging, enableAutoLogCreation, logGroupId, logId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobLogConfigurationDetails o) {
            Builder copiedBuilder =
                    enableLogging(o.getEnableLogging())
                            .enableAutoLogCreation(o.getEnableAutoLogCreation())
                            .logGroupId(o.getLogGroupId())
                            .logId(o.getLogId());

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
     * If customer logging is enabled for job runs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enableLogging")
    private final Boolean enableLogging;

    /**
     * If customer logging is enabled for job runs.
     * @return the value
     **/
    public Boolean getEnableLogging() {
        return enableLogging;
    }

    /**
     * If automatic on-behalf-of log object creation is enabled for job runs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enableAutoLogCreation")
    private final Boolean enableAutoLogCreation;

    /**
     * If automatic on-behalf-of log object creation is enabled for job runs.
     *
     * @return the value
     **/
    public Boolean getEnableAutoLogCreation() {
        return enableAutoLogCreation;
    }

    /**
     * The log group id for where log objects are for job runs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    private final String logGroupId;

    /**
     * The log group id for where log objects are for job runs.
     *
     * @return the value
     **/
    public String getLogGroupId() {
        return logGroupId;
    }

    /**
     * The log id the job run will push logs too.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logId")
    private final String logId;

    /**
     * The log id the job run will push logs too.
     *
     * @return the value
     **/
    public String getLogId() {
        return logId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("JobLogConfigurationDetails(");
        sb.append("enableLogging=").append(String.valueOf(this.enableLogging));
        sb.append(", enableAutoLogCreation=").append(String.valueOf(this.enableAutoLogCreation));
        sb.append(", logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(", logId=").append(String.valueOf(this.logId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobLogConfigurationDetails)) {
            return false;
        }

        JobLogConfigurationDetails other = (JobLogConfigurationDetails) o;
        return java.util.Objects.equals(this.enableLogging, other.enableLogging)
                && java.util.Objects.equals(this.enableAutoLogCreation, other.enableAutoLogCreation)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(this.logId, other.logId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.enableLogging == null ? 43 : this.enableLogging.hashCode());
        result =
                (result * PRIME)
                        + (this.enableAutoLogCreation == null
                                ? 43
                                : this.enableAutoLogCreation.hashCode());
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result = (result * PRIME) + (this.logId == null ? 43 : this.logId.hashCode());
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
