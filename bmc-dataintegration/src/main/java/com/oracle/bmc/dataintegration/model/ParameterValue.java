/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * User defined value for a parameter.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ParameterValue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ParameterValue {
    @Deprecated
    @java.beans.ConstructorProperties({"simpleValue", "rootObjectValue"})
    public ParameterValue(Object simpleValue, Object rootObjectValue) {
        super();
        this.simpleValue = simpleValue;
        this.rootObjectValue = rootObjectValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A simple value for the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("simpleValue")
        private Object simpleValue;

        /**
         * A simple value for the parameter.
         * @param simpleValue the value to set
         * @return this builder
         **/
        public Builder simpleValue(Object simpleValue) {
            this.simpleValue = simpleValue;
            this.__explicitlySet__.add("simpleValue");
            return this;
        }
        /**
         * This can be any object such as a file entity, a schema, or a table.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rootObjectValue")
        private Object rootObjectValue;

        /**
         * This can be any object such as a file entity, a schema, or a table.
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

        public ParameterValue build() {
            ParameterValue __instance__ = new ParameterValue(simpleValue, rootObjectValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParameterValue o) {
            Builder copiedBuilder =
                    simpleValue(o.getSimpleValue()).rootObjectValue(o.getRootObjectValue());

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
     * A simple value for the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("simpleValue")
    private final Object simpleValue;

    /**
     * A simple value for the parameter.
     * @return the value
     **/
    public Object getSimpleValue() {
        return simpleValue;
    }

    /**
     * This can be any object such as a file entity, a schema, or a table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rootObjectValue")
    private final Object rootObjectValue;

    /**
     * This can be any object such as a file entity, a schema, or a table.
     * @return the value
     **/
    public Object getRootObjectValue() {
        return rootObjectValue;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ParameterValue(");
        sb.append("simpleValue=").append(String.valueOf(this.simpleValue));
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
        if (!(o instanceof ParameterValue)) {
            return false;
        }

        ParameterValue other = (ParameterValue) o;
        return java.util.Objects.equals(this.simpleValue, other.simpleValue)
                && java.util.Objects.equals(this.rootObjectValue, other.rootObjectValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.simpleValue == null ? 43 : this.simpleValue.hashCode());
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
