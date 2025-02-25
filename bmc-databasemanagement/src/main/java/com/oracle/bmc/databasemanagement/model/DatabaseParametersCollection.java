/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A collection of database parameters.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseParametersCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseParametersCollection {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseName",
        "databaseType",
        "databaseSubType",
        "databaseVersion",
        "items"
    })
    public DatabaseParametersCollection(
            String databaseName,
            DatabaseType databaseType,
            DatabaseSubType databaseSubType,
            String databaseVersion,
            java.util.List<DatabaseParameterSummary> items) {
        super();
        this.databaseName = databaseName;
        this.databaseType = databaseType;
        this.databaseSubType = databaseSubType;
        this.databaseVersion = databaseVersion;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the Managed Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * The name of the Managed Database.
         * @param databaseName the value to set
         * @return this builder
         **/
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /**
         * The type of Oracle Database installation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseType databaseType;

        /**
         * The type of Oracle Database installation.
         * @param databaseType the value to set
         * @return this builder
         **/
        public Builder databaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /**
         * The subtype of the Oracle Database. Indicates whether the database
         * is a Container Database, Pluggable Database, or a Non-container Database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
        private DatabaseSubType databaseSubType;

        /**
         * The subtype of the Oracle Database. Indicates whether the database
         * is a Container Database, Pluggable Database, or a Non-container Database.
         *
         * @param databaseSubType the value to set
         * @return this builder
         **/
        public Builder databaseSubType(DatabaseSubType databaseSubType) {
            this.databaseSubType = databaseSubType;
            this.__explicitlySet__.add("databaseSubType");
            return this;
        }
        /**
         * The Oracle Database version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The Oracle Database version.
         * @param databaseVersion the value to set
         * @return this builder
         **/
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /**
         * An array of DatabaseParameterSummary objects.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<DatabaseParameterSummary> items;

        /**
         * An array of DatabaseParameterSummary objects.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<DatabaseParameterSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseParametersCollection build() {
            DatabaseParametersCollection __instance__ =
                    new DatabaseParametersCollection(
                            databaseName, databaseType, databaseSubType, databaseVersion, items);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseParametersCollection o) {
            Builder copiedBuilder =
                    databaseName(o.getDatabaseName())
                            .databaseType(o.getDatabaseType())
                            .databaseSubType(o.getDatabaseSubType())
                            .databaseVersion(o.getDatabaseVersion())
                            .items(o.getItems());

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
     * The name of the Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The name of the Managed Database.
     * @return the value
     **/
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * The type of Oracle Database installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final DatabaseType databaseType;

    /**
     * The type of Oracle Database installation.
     * @return the value
     **/
    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    /**
     * The subtype of the Oracle Database. Indicates whether the database
     * is a Container Database, Pluggable Database, or a Non-container Database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    private final DatabaseSubType databaseSubType;

    /**
     * The subtype of the Oracle Database. Indicates whether the database
     * is a Container Database, Pluggable Database, or a Non-container Database.
     *
     * @return the value
     **/
    public DatabaseSubType getDatabaseSubType() {
        return databaseSubType;
    }

    /**
     * The Oracle Database version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The Oracle Database version.
     * @return the value
     **/
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /**
     * An array of DatabaseParameterSummary objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<DatabaseParameterSummary> items;

    /**
     * An array of DatabaseParameterSummary objects.
     * @return the value
     **/
    public java.util.List<DatabaseParameterSummary> getItems() {
        return items;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatabaseParametersCollection(");
        sb.append("databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", databaseSubType=").append(String.valueOf(this.databaseSubType));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseParametersCollection)) {
            return false;
        }

        DatabaseParametersCollection other = (DatabaseParametersCollection) o;
        return java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.databaseSubType, other.databaseSubType)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSubType == null ? 43 : this.databaseSubType.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
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
