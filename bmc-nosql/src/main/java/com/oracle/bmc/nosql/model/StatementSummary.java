/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Information derived from parsing a NoSQL SQL statement.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StatementSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StatementSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operation",
        "tableName",
        "indexName",
        "isIfExists",
        "isIfNotExists",
        "syntaxError"
    })
    public StatementSummary(
            Operation operation,
            String tableName,
            String indexName,
            Boolean isIfExists,
            Boolean isIfNotExists,
            String syntaxError) {
        super();
        this.operation = operation;
        this.tableName = tableName;
        this.indexName = indexName;
        this.isIfExists = isIfExists;
        this.isIfNotExists = isIfNotExists;
        this.syntaxError = syntaxError;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The operation represented in the statement, e.g. CREATE_TABLE.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Operation operation;

        /**
         * The operation represented in the statement, e.g. CREATE_TABLE.
         *
         * @param operation the value to set
         * @return this builder
         **/
        public Builder operation(Operation operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }
        /**
         * The table name from the SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        /**
         * The table name from the SQL statement.
         * @param tableName the value to set
         * @return this builder
         **/
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }
        /**
         * The index name from the SQL statement, if present.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("indexName")
        private String indexName;

        /**
         * The index name from the SQL statement, if present.
         * @param indexName the value to set
         * @return this builder
         **/
        public Builder indexName(String indexName) {
            this.indexName = indexName;
            this.__explicitlySet__.add("indexName");
            return this;
        }
        /**
         * True if the statement includes "IF EXISTS."
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIfExists")
        private Boolean isIfExists;

        /**
         * True if the statement includes "IF EXISTS."
         * @param isIfExists the value to set
         * @return this builder
         **/
        public Builder isIfExists(Boolean isIfExists) {
            this.isIfExists = isIfExists;
            this.__explicitlySet__.add("isIfExists");
            return this;
        }
        /**
         * True if the statement includes "IF NOT EXISTS."
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIfNotExists")
        private Boolean isIfNotExists;

        /**
         * True if the statement includes "IF NOT EXISTS."
         * @param isIfNotExists the value to set
         * @return this builder
         **/
        public Builder isIfNotExists(Boolean isIfNotExists) {
            this.isIfNotExists = isIfNotExists;
            this.__explicitlySet__.add("isIfNotExists");
            return this;
        }
        /**
         * If present, indicates a syntax error in the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("syntaxError")
        private String syntaxError;

        /**
         * If present, indicates a syntax error in the statement.
         * @param syntaxError the value to set
         * @return this builder
         **/
        public Builder syntaxError(String syntaxError) {
            this.syntaxError = syntaxError;
            this.__explicitlySet__.add("syntaxError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StatementSummary build() {
            StatementSummary __instance__ =
                    new StatementSummary(
                            operation,
                            tableName,
                            indexName,
                            isIfExists,
                            isIfNotExists,
                            syntaxError);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StatementSummary o) {
            Builder copiedBuilder =
                    operation(o.getOperation())
                            .tableName(o.getTableName())
                            .indexName(o.getIndexName())
                            .isIfExists(o.getIsIfExists())
                            .isIfNotExists(o.getIsIfNotExists())
                            .syntaxError(o.getSyntaxError());

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
     * The operation represented in the statement, e.g. CREATE_TABLE.
     *
     **/
    public enum Operation {
        CreateTable("CREATE_TABLE"),
        AlterTable("ALTER_TABLE"),
        DropTable("DROP_TABLE"),
        CreateIndex("CREATE_INDEX"),
        DropIndex("DROP_INDEX"),
        Select("SELECT"),
        Update("UPDATE"),
        Insert("INSERT"),
        Delete("DELETE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Operation.class);

        private final String value;
        private static java.util.Map<String, Operation> map;

        static {
            map = new java.util.HashMap<>();
            for (Operation v : Operation.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Operation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Operation', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The operation represented in the statement, e.g. CREATE_TABLE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final Operation operation;

    /**
     * The operation represented in the statement, e.g. CREATE_TABLE.
     *
     * @return the value
     **/
    public Operation getOperation() {
        return operation;
    }

    /**
     * The table name from the SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    private final String tableName;

    /**
     * The table name from the SQL statement.
     * @return the value
     **/
    public String getTableName() {
        return tableName;
    }

    /**
     * The index name from the SQL statement, if present.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indexName")
    private final String indexName;

    /**
     * The index name from the SQL statement, if present.
     * @return the value
     **/
    public String getIndexName() {
        return indexName;
    }

    /**
     * True if the statement includes "IF EXISTS."
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIfExists")
    private final Boolean isIfExists;

    /**
     * True if the statement includes "IF EXISTS."
     * @return the value
     **/
    public Boolean getIsIfExists() {
        return isIfExists;
    }

    /**
     * True if the statement includes "IF NOT EXISTS."
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIfNotExists")
    private final Boolean isIfNotExists;

    /**
     * True if the statement includes "IF NOT EXISTS."
     * @return the value
     **/
    public Boolean getIsIfNotExists() {
        return isIfNotExists;
    }

    /**
     * If present, indicates a syntax error in the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("syntaxError")
    private final String syntaxError;

    /**
     * If present, indicates a syntax error in the statement.
     * @return the value
     **/
    public String getSyntaxError() {
        return syntaxError;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StatementSummary(");
        sb.append("operation=").append(String.valueOf(this.operation));
        sb.append(", tableName=").append(String.valueOf(this.tableName));
        sb.append(", indexName=").append(String.valueOf(this.indexName));
        sb.append(", isIfExists=").append(String.valueOf(this.isIfExists));
        sb.append(", isIfNotExists=").append(String.valueOf(this.isIfNotExists));
        sb.append(", syntaxError=").append(String.valueOf(this.syntaxError));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StatementSummary)) {
            return false;
        }

        StatementSummary other = (StatementSummary) o;
        return java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.tableName, other.tableName)
                && java.util.Objects.equals(this.indexName, other.indexName)
                && java.util.Objects.equals(this.isIfExists, other.isIfExists)
                && java.util.Objects.equals(this.isIfNotExists, other.isIfNotExists)
                && java.util.Objects.equals(this.syntaxError, other.syntaxError)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        result = (result * PRIME) + (this.indexName == null ? 43 : this.indexName.hashCode());
        result = (result * PRIME) + (this.isIfExists == null ? 43 : this.isIfExists.hashCode());
        result =
                (result * PRIME)
                        + (this.isIfNotExists == null ? 43 : this.isIfNotExists.hashCode());
        result = (result * PRIME) + (this.syntaxError == null ? 43 : this.syntaxError.hashCode());
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
