/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * The information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateTableDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateTableDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "ddlStatement",
        "tableLimits",
        "freeformTags",
        "definedTags"
    })
    public UpdateTableDetails(
            String compartmentId,
            String ddlStatement,
            TableLimits tableLimits,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.ddlStatement = ddlStatement;
        this.tableLimits = tableLimits;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the table's current compartment.  Required
         * if the tableNameOrId path parameter is a table name.
         * Optional if tableNameOrId is an OCID.  If tableNameOrId
         * is an OCID, and compartmentId is supplied, the latter
         * must match the identified table's compartmentId.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the table's current compartment.  Required
         * if the tableNameOrId path parameter is a table name.
         * Optional if tableNameOrId is an OCID.  If tableNameOrId
         * is an OCID, and compartmentId is supplied, the latter
         * must match the identified table's compartmentId.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Complete ALTER TABLE DDL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ddlStatement")
        private String ddlStatement;

        /**
         * Complete ALTER TABLE DDL statement.
         * @param ddlStatement the value to set
         * @return this builder
         **/
        public Builder ddlStatement(String ddlStatement) {
            this.ddlStatement = ddlStatement;
            this.__explicitlySet__.add("ddlStatement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tableLimits")
        private TableLimits tableLimits;

        public Builder tableLimits(TableLimits tableLimits) {
            this.tableLimits = tableLimits;
            this.__explicitlySet__.add("tableLimits");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined
         * name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined
         * name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and
         * scoped to a namespace.  Example: {@code {"foo-namespace":
         * {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and
         * scoped to a namespace.  Example: {@code {"foo-namespace":
         * {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTableDetails build() {
            UpdateTableDetails __instance__ =
                    new UpdateTableDetails(
                            compartmentId, ddlStatement, tableLimits, freeformTags, definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTableDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .ddlStatement(o.getDdlStatement())
                            .tableLimits(o.getTableLimits())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The OCID of the table's current compartment.  Required
     * if the tableNameOrId path parameter is a table name.
     * Optional if tableNameOrId is an OCID.  If tableNameOrId
     * is an OCID, and compartmentId is supplied, the latter
     * must match the identified table's compartmentId.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the table's current compartment.  Required
     * if the tableNameOrId path parameter is a table name.
     * Optional if tableNameOrId is an OCID.  If tableNameOrId
     * is an OCID, and compartmentId is supplied, the latter
     * must match the identified table's compartmentId.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Complete ALTER TABLE DDL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ddlStatement")
    private final String ddlStatement;

    /**
     * Complete ALTER TABLE DDL statement.
     * @return the value
     **/
    public String getDdlStatement() {
        return ddlStatement;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tableLimits")
    private final TableLimits tableLimits;

    public TableLimits getTableLimits() {
        return tableLimits;
    }

    /**
     * Simple key-value pair that is applied without any predefined
     * name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined
     * name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and
     * scoped to a namespace.  Example: {@code {"foo-namespace":
     * {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and
     * scoped to a namespace.  Example: {@code {"foo-namespace":
     * {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateTableDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", ddlStatement=").append(String.valueOf(this.ddlStatement));
        sb.append(", tableLimits=").append(String.valueOf(this.tableLimits));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTableDetails)) {
            return false;
        }

        UpdateTableDetails other = (UpdateTableDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.ddlStatement, other.ddlStatement)
                && java.util.Objects.equals(this.tableLimits, other.tableLimits)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.ddlStatement == null ? 43 : this.ddlStatement.hashCode());
        result = (result * PRIME) + (this.tableLimits == null ? 43 : this.tableLimits.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
