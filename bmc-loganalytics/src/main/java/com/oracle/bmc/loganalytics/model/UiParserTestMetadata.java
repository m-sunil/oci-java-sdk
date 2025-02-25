/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * UiParserTestMetadata
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
    builder = UiParserTestMetadata.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UiParserTestMetadata {
    @Deprecated
    @java.beans.ConstructorProperties({"lastModifiedTime", "logFileName", "timeZone"})
    public UiParserTestMetadata(
            String lastModifiedTime, String logFileName, java.util.Date timeZone) {
        super();
        this.lastModifiedTime = lastModifiedTime;
        this.logFileName = logFileName;
        this.timeZone = timeZone;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The last modified time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastModifiedTime")
        private String lastModifiedTime;

        /**
         * The last modified time.
         * @param lastModifiedTime the value to set
         * @return this builder
         **/
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            this.__explicitlySet__.add("lastModifiedTime");
            return this;
        }
        /**
         * The log file name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logFileName")
        private String logFileName;

        /**
         * The log file name.
         * @param logFileName the value to set
         * @return this builder
         **/
        public Builder logFileName(String logFileName) {
            this.logFileName = logFileName;
            this.__explicitlySet__.add("logFileName");
            return this;
        }
        /**
         * The time zone.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private java.util.Date timeZone;

        /**
         * The time zone.
         * @param timeZone the value to set
         * @return this builder
         **/
        public Builder timeZone(java.util.Date timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UiParserTestMetadata build() {
            UiParserTestMetadata __instance__ =
                    new UiParserTestMetadata(lastModifiedTime, logFileName, timeZone);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UiParserTestMetadata o) {
            Builder copiedBuilder =
                    lastModifiedTime(o.getLastModifiedTime())
                            .logFileName(o.getLogFileName())
                            .timeZone(o.getTimeZone());

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
     * The last modified time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastModifiedTime")
    private final String lastModifiedTime;

    /**
     * The last modified time.
     * @return the value
     **/
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * The log file name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logFileName")
    private final String logFileName;

    /**
     * The log file name.
     * @return the value
     **/
    public String getLogFileName() {
        return logFileName;
    }

    /**
     * The time zone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final java.util.Date timeZone;

    /**
     * The time zone.
     * @return the value
     **/
    public java.util.Date getTimeZone() {
        return timeZone;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UiParserTestMetadata(");
        sb.append("lastModifiedTime=").append(String.valueOf(this.lastModifiedTime));
        sb.append(", logFileName=").append(String.valueOf(this.logFileName));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UiParserTestMetadata)) {
            return false;
        }

        UiParserTestMetadata other = (UiParserTestMetadata) o;
        return java.util.Objects.equals(this.lastModifiedTime, other.lastModifiedTime)
                && java.util.Objects.equals(this.logFileName, other.logFileName)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lastModifiedTime == null ? 43 : this.lastModifiedTime.hashCode());
        result = (result * PRIME) + (this.logFileName == null ? 43 : this.logFileName.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
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
