/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Summary of the spans in a trace by service.
 *
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
    builder = TraceServiceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TraceServiceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"spanServiceName", "totalSpans", "errorSpans"})
    public TraceServiceSummary(String spanServiceName, Long totalSpans, Long errorSpans) {
        super();
        this.spanServiceName = spanServiceName;
        this.totalSpans = totalSpans;
        this.errorSpans = errorSpans;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name associated with the service.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("spanServiceName")
        private String spanServiceName;

        /**
         * Name associated with the service.
         *
         * @param spanServiceName the value to set
         * @return this builder
         **/
        public Builder spanServiceName(String spanServiceName) {
            this.spanServiceName = spanServiceName;
            this.__explicitlySet__.add("spanServiceName");
            return this;
        }
        /**
         * Number of spans for serviceName in the trace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalSpans")
        private Long totalSpans;

        /**
         * Number of spans for serviceName in the trace.
         *
         * @param totalSpans the value to set
         * @return this builder
         **/
        public Builder totalSpans(Long totalSpans) {
            this.totalSpans = totalSpans;
            this.__explicitlySet__.add("totalSpans");
            return this;
        }
        /**
         * Number of spans with errors for serviceName in the trace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorSpans")
        private Long errorSpans;

        /**
         * Number of spans with errors for serviceName in the trace.
         *
         * @param errorSpans the value to set
         * @return this builder
         **/
        public Builder errorSpans(Long errorSpans) {
            this.errorSpans = errorSpans;
            this.__explicitlySet__.add("errorSpans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TraceServiceSummary build() {
            TraceServiceSummary __instance__ =
                    new TraceServiceSummary(spanServiceName, totalSpans, errorSpans);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TraceServiceSummary o) {
            Builder copiedBuilder =
                    spanServiceName(o.getSpanServiceName())
                            .totalSpans(o.getTotalSpans())
                            .errorSpans(o.getErrorSpans());

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
     * Name associated with the service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spanServiceName")
    private final String spanServiceName;

    /**
     * Name associated with the service.
     *
     * @return the value
     **/
    public String getSpanServiceName() {
        return spanServiceName;
    }

    /**
     * Number of spans for serviceName in the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSpans")
    private final Long totalSpans;

    /**
     * Number of spans for serviceName in the trace.
     *
     * @return the value
     **/
    public Long getTotalSpans() {
        return totalSpans;
    }

    /**
     * Number of spans with errors for serviceName in the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorSpans")
    private final Long errorSpans;

    /**
     * Number of spans with errors for serviceName in the trace.
     *
     * @return the value
     **/
    public Long getErrorSpans() {
        return errorSpans;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TraceServiceSummary(");
        sb.append("spanServiceName=").append(String.valueOf(this.spanServiceName));
        sb.append(", totalSpans=").append(String.valueOf(this.totalSpans));
        sb.append(", errorSpans=").append(String.valueOf(this.errorSpans));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TraceServiceSummary)) {
            return false;
        }

        TraceServiceSummary other = (TraceServiceSummary) o;
        return java.util.Objects.equals(this.spanServiceName, other.spanServiceName)
                && java.util.Objects.equals(this.totalSpans, other.totalSpans)
                && java.util.Objects.equals(this.errorSpans, other.errorSpans)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.spanServiceName == null ? 43 : this.spanServiceName.hashCode());
        result = (result * PRIME) + (this.totalSpans == null ? 43 : this.totalSpans.hashCode());
        result = (result * PRIME) + (this.errorSpans == null ? 43 : this.errorSpans.hashCode());
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
