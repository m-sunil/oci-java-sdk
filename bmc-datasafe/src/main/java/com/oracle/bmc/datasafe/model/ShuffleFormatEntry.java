/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Shuffle masking format randomly shuffles values within a column. It
 * can also be used to shuffle column data within discrete units, or groups,
 * where there is a relationship among the members of each group. To learn more,
 * check Shuffle in the Data Safe documentation. The Shuffle masking format
 * randomly shuffles values within a column. It can also be used to shuffle
 * column data within discrete units, or groups, where there is a relationship
 * among the members of each group. To learn more, check Shuffle in the
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
    builder = ShuffleFormatEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ShuffleFormatEntry extends FormatEntry {
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
         * One or more reference columns to be used to group column values so that
         * they can be shuffled within their own group. The grouping columns and
         * the column to be masked must belong to the same table.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupingColumns")
        private java.util.List<String> groupingColumns;

        /**
         * One or more reference columns to be used to group column values so that
         * they can be shuffled within their own group. The grouping columns and
         * the column to be masked must belong to the same table.
         *
         * @param groupingColumns the value to set
         * @return this builder
         **/
        public Builder groupingColumns(java.util.List<String> groupingColumns) {
            this.groupingColumns = groupingColumns;
            this.__explicitlySet__.add("groupingColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShuffleFormatEntry build() {
            ShuffleFormatEntry __instance__ = new ShuffleFormatEntry(description, groupingColumns);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShuffleFormatEntry o) {
            Builder copiedBuilder =
                    description(o.getDescription()).groupingColumns(o.getGroupingColumns());

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
    public ShuffleFormatEntry(String description, java.util.List<String> groupingColumns) {
        super(description);
        this.groupingColumns = groupingColumns;
    }

    /**
     * One or more reference columns to be used to group column values so that
     * they can be shuffled within their own group. The grouping columns and
     * the column to be masked must belong to the same table.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupingColumns")
    private final java.util.List<String> groupingColumns;

    /**
     * One or more reference columns to be used to group column values so that
     * they can be shuffled within their own group. The grouping columns and
     * the column to be masked must belong to the same table.
     *
     * @return the value
     **/
    public java.util.List<String> getGroupingColumns() {
        return groupingColumns;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ShuffleFormatEntry(");
        sb.append("super=").append(super.toString());
        sb.append(", groupingColumns=").append(String.valueOf(this.groupingColumns));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShuffleFormatEntry)) {
            return false;
        }

        ShuffleFormatEntry other = (ShuffleFormatEntry) o;
        return java.util.Objects.equals(this.groupingColumns, other.groupingColumns)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.groupingColumns == null ? 43 : this.groupingColumns.hashCode());
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
