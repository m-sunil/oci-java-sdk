/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The SQL entity details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateEntityShapeFromSQL.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateEntityShapeFromSQL extends CreateEntityShapeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private Shape shape;

        public Builder shape(Shape shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeId")
        private String shapeId;

        public Builder shapeId(String shapeId) {
            this.shapeId = shapeId;
            this.__explicitlySet__.add("shapeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private EntityType entityType;

        public Builder entityType(EntityType entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("otherTypeLabel")
        private String otherTypeLabel;

        public Builder otherTypeLabel(String otherTypeLabel) {
            this.otherTypeLabel = otherTypeLabel;
            this.__explicitlySet__.add("otherTypeLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uniqueKeys")
        private java.util.List<UniqueKey> uniqueKeys;

        public Builder uniqueKeys(java.util.List<UniqueKey> uniqueKeys) {
            this.uniqueKeys = uniqueKeys;
            this.__explicitlySet__.add("uniqueKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("foreignKeys")
        private java.util.List<ForeignKey> foreignKeys;

        public Builder foreignKeys(java.util.List<ForeignKey> foreignKeys) {
            this.foreignKeys = foreignKeys;
            this.__explicitlySet__.add("foreignKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("types")
        private TypeLibrary types;

        public Builder types(TypeLibrary types) {
            this.types = types;
            this.__explicitlySet__.add("types");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityProperties")
        private java.util.Map<String, String> entityProperties;

        public Builder entityProperties(java.util.Map<String, String> entityProperties) {
            this.entityProperties = entityProperties;
            this.__explicitlySet__.add("entityProperties");
            return this;
        }
        /**
         * sqlQuery
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlQuery")
        private String sqlQuery;

        /**
         * sqlQuery
         * @param sqlQuery the value to set
         * @return this builder
         **/
        public Builder sqlQuery(String sqlQuery) {
            this.sqlQuery = sqlQuery;
            this.__explicitlySet__.add("sqlQuery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateEntityShapeFromSQL build() {
            CreateEntityShapeFromSQL __instance__ =
                    new CreateEntityShapeFromSQL(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            objectVersion,
                            externalKey,
                            shape,
                            shapeId,
                            entityType,
                            otherTypeLabel,
                            uniqueKeys,
                            foreignKeys,
                            resourceName,
                            objectStatus,
                            identifier,
                            types,
                            entityProperties,
                            sqlQuery);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateEntityShapeFromSQL o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .objectVersion(o.getObjectVersion())
                            .externalKey(o.getExternalKey())
                            .shape(o.getShape())
                            .shapeId(o.getShapeId())
                            .entityType(o.getEntityType())
                            .otherTypeLabel(o.getOtherTypeLabel())
                            .uniqueKeys(o.getUniqueKeys())
                            .foreignKeys(o.getForeignKeys())
                            .resourceName(o.getResourceName())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .types(o.getTypes())
                            .entityProperties(o.getEntityProperties())
                            .sqlQuery(o.getSqlQuery());

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
    public CreateEntityShapeFromSQL(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            Integer objectVersion,
            String externalKey,
            Shape shape,
            String shapeId,
            EntityType entityType,
            String otherTypeLabel,
            java.util.List<UniqueKey> uniqueKeys,
            java.util.List<ForeignKey> foreignKeys,
            String resourceName,
            Integer objectStatus,
            String identifier,
            TypeLibrary types,
            java.util.Map<String, String> entityProperties,
            String sqlQuery) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                objectVersion,
                externalKey,
                shape,
                shapeId,
                entityType,
                otherTypeLabel,
                uniqueKeys,
                foreignKeys,
                resourceName,
                objectStatus,
                identifier,
                types,
                entityProperties);
        this.sqlQuery = sqlQuery;
    }

    /**
     * sqlQuery
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlQuery")
    private final String sqlQuery;

    /**
     * sqlQuery
     * @return the value
     **/
    public String getSqlQuery() {
        return sqlQuery;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateEntityShapeFromSQL(");
        sb.append("super=").append(super.toString());
        sb.append(", sqlQuery=").append(String.valueOf(this.sqlQuery));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateEntityShapeFromSQL)) {
            return false;
        }

        CreateEntityShapeFromSQL other = (CreateEntityShapeFromSQL) o;
        return java.util.Objects.equals(this.sqlQuery, other.sqlQuery)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sqlQuery == null ? 43 : this.sqlQuery.hashCode());
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
