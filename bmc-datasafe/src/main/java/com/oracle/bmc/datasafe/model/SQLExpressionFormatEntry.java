/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The SQL Expression masking format uses a SQL expression to generate values
 * that are used to replace the original data values. SQL expressions with
 * dbms_lob and other user-defined functions can be used to mask columns of
 * Large Object data type (LOB). To learn more, check SQL Expression in the
 * Data Safe documentation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SQLExpressionFormatEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SQLExpressionFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The SQL expression to be used to generate the masked values. It can
         * consist of one or more values, operators, and SQL functions that
         * evaluate to a value. It can also contain substitution columns from
         * the same table. Specify the substitution columns within percent (%)
         * symbols.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlExpression")
        private String sqlExpression;

        /**
         * The SQL expression to be used to generate the masked values. It can
         * consist of one or more values, operators, and SQL functions that
         * evaluate to a value. It can also contain substitution columns from
         * the same table. Specify the substitution columns within percent (%)
         * symbols.
         *
         * @param sqlExpression the value to set
         * @return this builder
         **/
        public Builder sqlExpression(String sqlExpression) {
            this.sqlExpression = sqlExpression;
            this.__explicitlySet__.add("sqlExpression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SQLExpressionFormatEntry build() {
            SQLExpressionFormatEntry __instance__ =
                    new SQLExpressionFormatEntry(description, sqlExpression);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SQLExpressionFormatEntry o) {
            Builder copiedBuilder =
                    description(o.getDescription()).sqlExpression(o.getSqlExpression());

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
    public SQLExpressionFormatEntry(String description, String sqlExpression) {
        super(description);
        this.sqlExpression = sqlExpression;
    }

    /**
     * The SQL expression to be used to generate the masked values. It can
     * consist of one or more values, operators, and SQL functions that
     * evaluate to a value. It can also contain substitution columns from
     * the same table. Specify the substitution columns within percent (%)
     * symbols.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlExpression")
    private final String sqlExpression;

    /**
     * The SQL expression to be used to generate the masked values. It can
     * consist of one or more values, operators, and SQL functions that
     * evaluate to a value. It can also contain substitution columns from
     * the same table. Specify the substitution columns within percent (%)
     * symbols.
     *
     * @return the value
     **/
    public String getSqlExpression() {
        return sqlExpression;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SQLExpressionFormatEntry(");
        sb.append("super=").append(super.toString());
        sb.append(", sqlExpression=").append(String.valueOf(this.sqlExpression));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SQLExpressionFormatEntry)) {
            return false;
        }

        SQLExpressionFormatEntry other = (SQLExpressionFormatEntry) o;
        return java.util.Objects.equals(this.sqlExpression, other.sqlExpression)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sqlExpression == null ? 43 : this.sqlExpression.hashCode());
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
