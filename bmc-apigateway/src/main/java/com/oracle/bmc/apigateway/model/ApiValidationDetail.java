/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Detail of a single error or warning.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApiValidationDetail.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApiValidationDetail {
    @Deprecated
    @java.beans.ConstructorProperties({"msg", "severity", "src"})
    public ApiValidationDetail(
            String msg,
            Severity severity,
            java.util.List<java.util.List<java.math.BigDecimal>> src) {
        super();
        this.msg = msg;
        this.severity = severity;
        this.src = src;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Description of the warning/error.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("msg")
        private String msg;

        /**
         * Description of the warning/error.
         * @param msg the value to set
         * @return this builder
         **/
        public Builder msg(String msg) {
            this.msg = msg;
            this.__explicitlySet__.add("msg");
            return this;
        }
        /**
         * Severity of the issue.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * Severity of the issue.
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * Position of the issue in the specification file (line, column).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("src")
        private java.util.List<java.util.List<java.math.BigDecimal>> src;

        /**
         * Position of the issue in the specification file (line, column).
         * @param src the value to set
         * @return this builder
         **/
        public Builder src(java.util.List<java.util.List<java.math.BigDecimal>> src) {
            this.src = src;
            this.__explicitlySet__.add("src");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiValidationDetail build() {
            ApiValidationDetail __instance__ = new ApiValidationDetail(msg, severity, src);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiValidationDetail o) {
            Builder copiedBuilder = msg(o.getMsg()).severity(o.getSeverity()).src(o.getSrc());

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
     * Description of the warning/error.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("msg")
    private final String msg;

    /**
     * Description of the warning/error.
     * @return the value
     **/
    public String getMsg() {
        return msg;
    }

    /**
     * Severity of the issue.
     **/
    public enum Severity {
        Info("INFO"),
        Warning("WARNING"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Severity.class);

        private final String value;
        private static java.util.Map<String, Severity> map;

        static {
            map = new java.util.HashMap<>();
            for (Severity v : Severity.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Severity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Severity', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Severity of the issue.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * Severity of the issue.
     * @return the value
     **/
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Position of the issue in the specification file (line, column).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("src")
    private final java.util.List<java.util.List<java.math.BigDecimal>> src;

    /**
     * Position of the issue in the specification file (line, column).
     * @return the value
     **/
    public java.util.List<java.util.List<java.math.BigDecimal>> getSrc() {
        return src;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ApiValidationDetail(");
        sb.append("msg=").append(String.valueOf(this.msg));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", src=").append(String.valueOf(this.src));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiValidationDetail)) {
            return false;
        }

        ApiValidationDetail other = (ApiValidationDetail) o;
        return java.util.Objects.equals(this.msg, other.msg)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.src, other.src)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.msg == null ? 43 : this.msg.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.src == null ? 43 : this.src.hashCode());
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
