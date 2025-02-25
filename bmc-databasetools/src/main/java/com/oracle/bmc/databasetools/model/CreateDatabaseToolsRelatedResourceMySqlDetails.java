/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * The related resource
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDatabaseToolsRelatedResourceMySqlDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDatabaseToolsRelatedResourceMySqlDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"entityType", "identifier"})
    public CreateDatabaseToolsRelatedResourceMySqlDetails(
            RelatedResourceEntityTypeMySql entityType, String identifier) {
        super();
        this.entityType = entityType;
        this.identifier = identifier;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The resource entity type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private RelatedResourceEntityTypeMySql entityType;

        /**
         * The resource entity type.
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(RelatedResourceEntityTypeMySql entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related resource.
         * @param identifier the value to set
         * @return this builder
         **/
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabaseToolsRelatedResourceMySqlDetails build() {
            CreateDatabaseToolsRelatedResourceMySqlDetails __instance__ =
                    new CreateDatabaseToolsRelatedResourceMySqlDetails(entityType, identifier);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabaseToolsRelatedResourceMySqlDetails o) {
            Builder copiedBuilder = entityType(o.getEntityType()).identifier(o.getIdentifier());

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
     * The resource entity type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final RelatedResourceEntityTypeMySql entityType;

    /**
     * The resource entity type.
     * @return the value
     **/
    public RelatedResourceEntityTypeMySql getEntityType() {
        return entityType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related resource.
     * @return the value
     **/
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateDatabaseToolsRelatedResourceMySqlDetails(");
        sb.append("entityType=").append(String.valueOf(this.entityType));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseToolsRelatedResourceMySqlDetails)) {
            return false;
        }

        CreateDatabaseToolsRelatedResourceMySqlDetails other =
                (CreateDatabaseToolsRelatedResourceMySqlDetails) o;
        return java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
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
