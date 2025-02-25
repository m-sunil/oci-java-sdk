/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * AbstractParserTestResultLogLine
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
    builder = AbstractParserTestResultLogLine.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AbstractParserTestResultLogLine {
    @Deprecated
    @java.beans.ConstructorProperties({"originalLogLine", "preProcessedLogLine"})
    public AbstractParserTestResultLogLine(String originalLogLine, String preProcessedLogLine) {
        super();
        this.originalLogLine = originalLogLine;
        this.preProcessedLogLine = preProcessedLogLine;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The original log line.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("originalLogLine")
        private String originalLogLine;

        /**
         * The original log line.
         * @param originalLogLine the value to set
         * @return this builder
         **/
        public Builder originalLogLine(String originalLogLine) {
            this.originalLogLine = originalLogLine;
            this.__explicitlySet__.add("originalLogLine");
            return this;
        }
        /**
         * The pre-processed log line.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("preProcessedLogLine")
        private String preProcessedLogLine;

        /**
         * The pre-processed log line.
         * @param preProcessedLogLine the value to set
         * @return this builder
         **/
        public Builder preProcessedLogLine(String preProcessedLogLine) {
            this.preProcessedLogLine = preProcessedLogLine;
            this.__explicitlySet__.add("preProcessedLogLine");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AbstractParserTestResultLogLine build() {
            AbstractParserTestResultLogLine __instance__ =
                    new AbstractParserTestResultLogLine(originalLogLine, preProcessedLogLine);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AbstractParserTestResultLogLine o) {
            Builder copiedBuilder =
                    originalLogLine(o.getOriginalLogLine())
                            .preProcessedLogLine(o.getPreProcessedLogLine());

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
     * The original log line.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalLogLine")
    private final String originalLogLine;

    /**
     * The original log line.
     * @return the value
     **/
    public String getOriginalLogLine() {
        return originalLogLine;
    }

    /**
     * The pre-processed log line.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preProcessedLogLine")
    private final String preProcessedLogLine;

    /**
     * The pre-processed log line.
     * @return the value
     **/
    public String getPreProcessedLogLine() {
        return preProcessedLogLine;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AbstractParserTestResultLogLine(");
        sb.append("originalLogLine=").append(String.valueOf(this.originalLogLine));
        sb.append(", preProcessedLogLine=").append(String.valueOf(this.preProcessedLogLine));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractParserTestResultLogLine)) {
            return false;
        }

        AbstractParserTestResultLogLine other = (AbstractParserTestResultLogLine) o;
        return java.util.Objects.equals(this.originalLogLine, other.originalLogLine)
                && java.util.Objects.equals(this.preProcessedLogLine, other.preProcessedLogLine)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.originalLogLine == null ? 43 : this.originalLogLine.hashCode());
        result =
                (result * PRIME)
                        + (this.preProcessedLogLine == null
                                ? 43
                                : this.preProcessedLogLine.hashCode());
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
