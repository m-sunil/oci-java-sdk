/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Scope filter to reduce the scope of the query.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ScopeFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScopeFilter {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldName", "values"})
    public ScopeFilter(String fieldName, java.util.List<Object> values) {
        super();
        this.fieldName = fieldName;
        this.values = values;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Field must be a valid logging-analytics out-of-the-box field.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * Field must be a valid logging-analytics out-of-the-box field.
         *
         * @param fieldName the value to set
         * @return this builder
         **/
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /**
         * Field values that will be used to filter the query scope. Please note all values should reflect the fields data type otherwise the query is subject to fail.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<Object> values;

        /**
         * Field values that will be used to filter the query scope. Please note all values should reflect the fields data type otherwise the query is subject to fail.
         *
         * @param values the value to set
         * @return this builder
         **/
        public Builder values(java.util.List<Object> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScopeFilter build() {
            ScopeFilter __instance__ = new ScopeFilter(fieldName, values);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScopeFilter o) {
            Builder copiedBuilder = fieldName(o.getFieldName()).values(o.getValues());

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
     * Field must be a valid logging-analytics out-of-the-box field.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * Field must be a valid logging-analytics out-of-the-box field.
     *
     * @return the value
     **/
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Field values that will be used to filter the query scope. Please note all values should reflect the fields data type otherwise the query is subject to fail.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<Object> values;

    /**
     * Field values that will be used to filter the query scope. Please note all values should reflect the fields data type otherwise the query is subject to fail.
     *
     * @return the value
     **/
    public java.util.List<Object> getValues() {
        return values;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ScopeFilter(");
        sb.append("fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScopeFilter)) {
            return false;
        }

        ScopeFilter other = (ScopeFilter) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
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
