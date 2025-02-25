/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The result of the AWR report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwrReport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrReport {
    @Deprecated
    @java.beans.ConstructorProperties({"content", "format"})
    public AwrReport(String content, AwrReportFormatType format) {
        super();
        this.content = content;
        this.format = format;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The content of the report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        /**
         * The content of the report.
         * @param content the value to set
         * @return this builder
         **/
        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /**
         * The format of the report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("format")
        private AwrReportFormatType format;

        /**
         * The format of the report.
         * @param format the value to set
         * @return this builder
         **/
        public Builder format(AwrReportFormatType format) {
            this.format = format;
            this.__explicitlySet__.add("format");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrReport build() {
            AwrReport __instance__ = new AwrReport(content, format);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrReport o) {
            Builder copiedBuilder = content(o.getContent()).format(o.getFormat());

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
     * The content of the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

    /**
     * The content of the report.
     * @return the value
     **/
    public String getContent() {
        return content;
    }

    /**
     * The format of the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final AwrReportFormatType format;

    /**
     * The format of the report.
     * @return the value
     **/
    public AwrReportFormatType getFormat() {
        return format;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AwrReport(");
        sb.append("content=").append(String.valueOf(this.content));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrReport)) {
            return false;
        }

        AwrReport other = (AwrReport) o;
        return java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.format, other.format)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
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
