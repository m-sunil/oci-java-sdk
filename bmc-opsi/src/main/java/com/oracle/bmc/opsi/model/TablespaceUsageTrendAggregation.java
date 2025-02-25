/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Usage data per tablespace for a Pluggable database
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
    builder = TablespaceUsageTrendAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TablespaceUsageTrendAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({"tablespaceName", "tablespaceType", "usageData"})
    public TablespaceUsageTrendAggregation(
            String tablespaceName,
            String tablespaceType,
            java.util.List<TablespaceUsageTrend> usageData) {
        super();
        this.tablespaceName = tablespaceName;
        this.tablespaceType = tablespaceType;
        this.usageData = usageData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of tablespace.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tablespaceName")
        private String tablespaceName;

        /**
         * The name of tablespace.
         * @param tablespaceName the value to set
         * @return this builder
         **/
        public Builder tablespaceName(String tablespaceName) {
            this.tablespaceName = tablespaceName;
            this.__explicitlySet__.add("tablespaceName");
            return this;
        }
        /**
         * Type of tablespace
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tablespaceType")
        private String tablespaceType;

        /**
         * Type of tablespace
         * @param tablespaceType the value to set
         * @return this builder
         **/
        public Builder tablespaceType(String tablespaceType) {
            this.tablespaceType = tablespaceType;
            this.__explicitlySet__.add("tablespaceType");
            return this;
        }
        /**
         * List of usage data samples for a tablespace
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageData")
        private java.util.List<TablespaceUsageTrend> usageData;

        /**
         * List of usage data samples for a tablespace
         * @param usageData the value to set
         * @return this builder
         **/
        public Builder usageData(java.util.List<TablespaceUsageTrend> usageData) {
            this.usageData = usageData;
            this.__explicitlySet__.add("usageData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TablespaceUsageTrendAggregation build() {
            TablespaceUsageTrendAggregation __instance__ =
                    new TablespaceUsageTrendAggregation(tablespaceName, tablespaceType, usageData);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TablespaceUsageTrendAggregation o) {
            Builder copiedBuilder =
                    tablespaceName(o.getTablespaceName())
                            .tablespaceType(o.getTablespaceType())
                            .usageData(o.getUsageData());

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
     * The name of tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tablespaceName")
    private final String tablespaceName;

    /**
     * The name of tablespace.
     * @return the value
     **/
    public String getTablespaceName() {
        return tablespaceName;
    }

    /**
     * Type of tablespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tablespaceType")
    private final String tablespaceType;

    /**
     * Type of tablespace
     * @return the value
     **/
    public String getTablespaceType() {
        return tablespaceType;
    }

    /**
     * List of usage data samples for a tablespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageData")
    private final java.util.List<TablespaceUsageTrend> usageData;

    /**
     * List of usage data samples for a tablespace
     * @return the value
     **/
    public java.util.List<TablespaceUsageTrend> getUsageData() {
        return usageData;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TablespaceUsageTrendAggregation(");
        sb.append("tablespaceName=").append(String.valueOf(this.tablespaceName));
        sb.append(", tablespaceType=").append(String.valueOf(this.tablespaceType));
        sb.append(", usageData=").append(String.valueOf(this.usageData));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TablespaceUsageTrendAggregation)) {
            return false;
        }

        TablespaceUsageTrendAggregation other = (TablespaceUsageTrendAggregation) o;
        return java.util.Objects.equals(this.tablespaceName, other.tablespaceName)
                && java.util.Objects.equals(this.tablespaceType, other.tablespaceType)
                && java.util.Objects.equals(this.usageData, other.usageData)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.tablespaceName == null ? 43 : this.tablespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.tablespaceType == null ? 43 : this.tablespaceType.hashCode());
        result = (result * PRIME) + (this.usageData == null ? 43 : this.usageData.hashCode());
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
