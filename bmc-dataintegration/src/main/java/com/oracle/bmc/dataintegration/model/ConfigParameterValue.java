/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Contains the parameter configuration values.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConfigParameterValue.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConfigParameterValue {
    @Deprecated
    @java.beans.ConstructorProperties({
        "stringValue",
        "intValue",
        "objectValue",
        "refValue",
        "parameterValue",
        "rootObjectValue"
    })
    public ConfigParameterValue(
            String stringValue,
            Integer intValue,
            Object objectValue,
            Object refValue,
            String parameterValue,
            Object rootObjectValue) {
        super();
        this.stringValue = stringValue;
        this.intValue = intValue;
        this.objectValue = objectValue;
        this.refValue = refValue;
        this.parameterValue = parameterValue;
        this.rootObjectValue = rootObjectValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A string value of the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stringValue")
        private String stringValue;

        /**
         * A string value of the parameter.
         * @param stringValue the value to set
         * @return this builder
         **/
        public Builder stringValue(String stringValue) {
            this.stringValue = stringValue;
            this.__explicitlySet__.add("stringValue");
            return this;
        }
        /**
         * An integer value of the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intValue")
        private Integer intValue;

        /**
         * An integer value of the parameter.
         * @param intValue the value to set
         * @return this builder
         **/
        public Builder intValue(Integer intValue) {
            this.intValue = intValue;
            this.__explicitlySet__.add("intValue");
            return this;
        }
        /**
         * An object value of the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectValue")
        private Object objectValue;

        /**
         * An object value of the parameter.
         * @param objectValue the value to set
         * @return this builder
         **/
        public Builder objectValue(Object objectValue) {
            this.objectValue = objectValue;
            this.__explicitlySet__.add("objectValue");
            return this;
        }
        /**
         * The root object reference value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("refValue")
        private Object refValue;

        /**
         * The root object reference value.
         * @param refValue the value to set
         * @return this builder
         **/
        public Builder refValue(Object refValue) {
            this.refValue = refValue;
            this.__explicitlySet__.add("refValue");
            return this;
        }
        /**
         * Reference to the parameter by its key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameterValue")
        private String parameterValue;

        /**
         * Reference to the parameter by its key.
         * @param parameterValue the value to set
         * @return this builder
         **/
        public Builder parameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            this.__explicitlySet__.add("parameterValue");
            return this;
        }
        /**
         * The root object value, used in custom parameters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rootObjectValue")
        private Object rootObjectValue;

        /**
         * The root object value, used in custom parameters.
         * @param rootObjectValue the value to set
         * @return this builder
         **/
        public Builder rootObjectValue(Object rootObjectValue) {
            this.rootObjectValue = rootObjectValue;
            this.__explicitlySet__.add("rootObjectValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigParameterValue build() {
            ConfigParameterValue __instance__ =
                    new ConfigParameterValue(
                            stringValue,
                            intValue,
                            objectValue,
                            refValue,
                            parameterValue,
                            rootObjectValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigParameterValue o) {
            Builder copiedBuilder =
                    stringValue(o.getStringValue())
                            .intValue(o.getIntValue())
                            .objectValue(o.getObjectValue())
                            .refValue(o.getRefValue())
                            .parameterValue(o.getParameterValue())
                            .rootObjectValue(o.getRootObjectValue());

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
     * A string value of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stringValue")
    private final String stringValue;

    /**
     * A string value of the parameter.
     * @return the value
     **/
    public String getStringValue() {
        return stringValue;
    }

    /**
     * An integer value of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intValue")
    private final Integer intValue;

    /**
     * An integer value of the parameter.
     * @return the value
     **/
    public Integer getIntValue() {
        return intValue;
    }

    /**
     * An object value of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectValue")
    private final Object objectValue;

    /**
     * An object value of the parameter.
     * @return the value
     **/
    public Object getObjectValue() {
        return objectValue;
    }

    /**
     * The root object reference value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refValue")
    private final Object refValue;

    /**
     * The root object reference value.
     * @return the value
     **/
    public Object getRefValue() {
        return refValue;
    }

    /**
     * Reference to the parameter by its key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameterValue")
    private final String parameterValue;

    /**
     * Reference to the parameter by its key.
     * @return the value
     **/
    public String getParameterValue() {
        return parameterValue;
    }

    /**
     * The root object value, used in custom parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rootObjectValue")
    private final Object rootObjectValue;

    /**
     * The root object value, used in custom parameters.
     * @return the value
     **/
    public Object getRootObjectValue() {
        return rootObjectValue;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConfigParameterValue(");
        sb.append("stringValue=").append(String.valueOf(this.stringValue));
        sb.append(", intValue=").append(String.valueOf(this.intValue));
        sb.append(", objectValue=").append(String.valueOf(this.objectValue));
        sb.append(", refValue=").append(String.valueOf(this.refValue));
        sb.append(", parameterValue=").append(String.valueOf(this.parameterValue));
        sb.append(", rootObjectValue=").append(String.valueOf(this.rootObjectValue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigParameterValue)) {
            return false;
        }

        ConfigParameterValue other = (ConfigParameterValue) o;
        return java.util.Objects.equals(this.stringValue, other.stringValue)
                && java.util.Objects.equals(this.intValue, other.intValue)
                && java.util.Objects.equals(this.objectValue, other.objectValue)
                && java.util.Objects.equals(this.refValue, other.refValue)
                && java.util.Objects.equals(this.parameterValue, other.parameterValue)
                && java.util.Objects.equals(this.rootObjectValue, other.rootObjectValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stringValue == null ? 43 : this.stringValue.hashCode());
        result = (result * PRIME) + (this.intValue == null ? 43 : this.intValue.hashCode());
        result = (result * PRIME) + (this.objectValue == null ? 43 : this.objectValue.hashCode());
        result = (result * PRIME) + (this.refValue == null ? 43 : this.refValue.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterValue == null ? 43 : this.parameterValue.hashCode());
        result =
                (result * PRIME)
                        + (this.rootObjectValue == null ? 43 : this.rootObjectValue.hashCode());
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
