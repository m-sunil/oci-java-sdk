/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The Logging source.
 * For configuration instructions, see
 * [To create a service connector](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/managingconnectors.htm#create).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LoggingSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LoggingSourceDetails extends SourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The logs for this Logging source.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logSources")
        private java.util.List<LogSource> logSources;

        /**
         * The logs for this Logging source.
         *
         * @param logSources the value to set
         * @return this builder
         **/
        public Builder logSources(java.util.List<LogSource> logSources) {
            this.logSources = logSources;
            this.__explicitlySet__.add("logSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoggingSourceDetails build() {
            LoggingSourceDetails __instance__ = new LoggingSourceDetails(logSources);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoggingSourceDetails o) {
            Builder copiedBuilder = logSources(o.getLogSources());

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

    @Deprecated
    public LoggingSourceDetails(java.util.List<LogSource> logSources) {
        super();
        this.logSources = logSources;
    }

    /**
     * The logs for this Logging source.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logSources")
    private final java.util.List<LogSource> logSources;

    /**
     * The logs for this Logging source.
     *
     * @return the value
     **/
    public java.util.List<LogSource> getLogSources() {
        return logSources;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LoggingSourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", logSources=").append(String.valueOf(this.logSources));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoggingSourceDetails)) {
            return false;
        }

        LoggingSourceDetails other = (LoggingSourceDetails) o;
        return java.util.Objects.equals(this.logSources, other.logSources)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.logSources == null ? 43 : this.logSources.hashCode());
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
