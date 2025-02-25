/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * MacroPivotField is used for the PivotField with macro expressions. It can contain the rules according to the macro pattern/attribute added and create new fields according to the PivotKeyValues
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MacroPivotField.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MacroPivotField {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isUseSourceType",
        "expr",
        "useType",
        "type",
        "columnNamePattern"
    })
    public MacroPivotField(
            Boolean isUseSourceType,
            Expression expr,
            ConfiguredType useType,
            BaseType type,
            String columnNamePattern) {
        super();
        this.isUseSourceType = isUseSourceType;
        this.expr = expr;
        this.useType = useType;
        this.type = type;
        this.columnNamePattern = columnNamePattern;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies whether the type of macro fields is inferred from an expression or useType (false) or the source field (true).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUseSourceType")
        private Boolean isUseSourceType;

        /**
         * Specifies whether the type of macro fields is inferred from an expression or useType (false) or the source field (true).
         * @param isUseSourceType the value to set
         * @return this builder
         **/
        public Builder isUseSourceType(Boolean isUseSourceType) {
            this.isUseSourceType = isUseSourceType;
            this.__explicitlySet__.add("isUseSourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expr")
        private Expression expr;

        public Builder expr(Expression expr) {
            this.expr = expr;
            this.__explicitlySet__.add("expr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("useType")
        private ConfiguredType useType;

        public Builder useType(ConfiguredType useType) {
            this.useType = useType;
            this.__explicitlySet__.add("useType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private BaseType type;

        public Builder type(BaseType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * column name pattern can be used to generate the name structure of the generated columns. By default column names are of %PIVOT_KEY_VALUE% or %MACRO_INPUT%_%PIVOT_KEY_VALUE%, but we can change it something by passing something like MY_PREFIX%PIVOT_KEY_VALUE%MY_SUFFIX or MY_PREFIX%MACRO_INPUT%_%PIVOT_KEY_VALUE%MY_SUFFIX which will add custom prefix and suffix to the column name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnNamePattern")
        private String columnNamePattern;

        /**
         * column name pattern can be used to generate the name structure of the generated columns. By default column names are of %PIVOT_KEY_VALUE% or %MACRO_INPUT%_%PIVOT_KEY_VALUE%, but we can change it something by passing something like MY_PREFIX%PIVOT_KEY_VALUE%MY_SUFFIX or MY_PREFIX%MACRO_INPUT%_%PIVOT_KEY_VALUE%MY_SUFFIX which will add custom prefix and suffix to the column name.
         * @param columnNamePattern the value to set
         * @return this builder
         **/
        public Builder columnNamePattern(String columnNamePattern) {
            this.columnNamePattern = columnNamePattern;
            this.__explicitlySet__.add("columnNamePattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MacroPivotField build() {
            MacroPivotField __instance__ =
                    new MacroPivotField(isUseSourceType, expr, useType, type, columnNamePattern);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MacroPivotField o) {
            Builder copiedBuilder =
                    isUseSourceType(o.getIsUseSourceType())
                            .expr(o.getExpr())
                            .useType(o.getUseType())
                            .type(o.getType())
                            .columnNamePattern(o.getColumnNamePattern());

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
     * Specifies whether the type of macro fields is inferred from an expression or useType (false) or the source field (true).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUseSourceType")
    private final Boolean isUseSourceType;

    /**
     * Specifies whether the type of macro fields is inferred from an expression or useType (false) or the source field (true).
     * @return the value
     **/
    public Boolean getIsUseSourceType() {
        return isUseSourceType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("expr")
    private final Expression expr;

    public Expression getExpr() {
        return expr;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("useType")
    private final ConfiguredType useType;

    public ConfiguredType getUseType() {
        return useType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final BaseType type;

    public BaseType getType() {
        return type;
    }

    /**
     * column name pattern can be used to generate the name structure of the generated columns. By default column names are of %PIVOT_KEY_VALUE% or %MACRO_INPUT%_%PIVOT_KEY_VALUE%, but we can change it something by passing something like MY_PREFIX%PIVOT_KEY_VALUE%MY_SUFFIX or MY_PREFIX%MACRO_INPUT%_%PIVOT_KEY_VALUE%MY_SUFFIX which will add custom prefix and suffix to the column name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnNamePattern")
    private final String columnNamePattern;

    /**
     * column name pattern can be used to generate the name structure of the generated columns. By default column names are of %PIVOT_KEY_VALUE% or %MACRO_INPUT%_%PIVOT_KEY_VALUE%, but we can change it something by passing something like MY_PREFIX%PIVOT_KEY_VALUE%MY_SUFFIX or MY_PREFIX%MACRO_INPUT%_%PIVOT_KEY_VALUE%MY_SUFFIX which will add custom prefix and suffix to the column name.
     * @return the value
     **/
    public String getColumnNamePattern() {
        return columnNamePattern;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MacroPivotField(");
        sb.append("isUseSourceType=").append(String.valueOf(this.isUseSourceType));
        sb.append(", expr=").append(String.valueOf(this.expr));
        sb.append(", useType=").append(String.valueOf(this.useType));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", columnNamePattern=").append(String.valueOf(this.columnNamePattern));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MacroPivotField)) {
            return false;
        }

        MacroPivotField other = (MacroPivotField) o;
        return java.util.Objects.equals(this.isUseSourceType, other.isUseSourceType)
                && java.util.Objects.equals(this.expr, other.expr)
                && java.util.Objects.equals(this.useType, other.useType)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.columnNamePattern, other.columnNamePattern)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isUseSourceType == null ? 43 : this.isUseSourceType.hashCode());
        result = (result * PRIME) + (this.expr == null ? 43 : this.expr.hashCode());
        result = (result * PRIME) + (this.useType == null ? 43 : this.useType.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.columnNamePattern == null ? 43 : this.columnNamePattern.hashCode());
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
