/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The details to update an Amazon s3 connection.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateConnectionFromAmazonS3.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateConnectionFromAmazonS3 extends UpdateConnectionDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
        private java.util.List<ConnectionProperty> connectionProperties;

        public Builder connectionProperties(
                java.util.List<ConnectionProperty> connectionProperties) {
            this.connectionProperties = connectionProperties;
            this.__explicitlySet__.add("connectionProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accessKey")
        private SensitiveAttribute accessKey;

        public Builder accessKey(SensitiveAttribute accessKey) {
            this.accessKey = accessKey;
            this.__explicitlySet__.add("accessKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
        private SensitiveAttribute secretKey;

        public Builder secretKey(SensitiveAttribute secretKey) {
            this.secretKey = secretKey;
            this.__explicitlySet__.add("secretKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateConnectionFromAmazonS3 build() {
            UpdateConnectionFromAmazonS3 __instance__ =
                    new UpdateConnectionFromAmazonS3(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectStatus,
                            objectVersion,
                            identifier,
                            connectionProperties,
                            registryMetadata,
                            accessKey,
                            secretKey);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConnectionFromAmazonS3 o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectStatus(o.getObjectStatus())
                            .objectVersion(o.getObjectVersion())
                            .identifier(o.getIdentifier())
                            .connectionProperties(o.getConnectionProperties())
                            .registryMetadata(o.getRegistryMetadata())
                            .accessKey(o.getAccessKey())
                            .secretKey(o.getSecretKey());

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
    public UpdateConnectionFromAmazonS3(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectStatus,
            Integer objectVersion,
            String identifier,
            java.util.List<ConnectionProperty> connectionProperties,
            RegistryMetadata registryMetadata,
            SensitiveAttribute accessKey,
            SensitiveAttribute secretKey) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectStatus,
                objectVersion,
                identifier,
                connectionProperties,
                registryMetadata);
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("accessKey")
    private final SensitiveAttribute accessKey;

    public SensitiveAttribute getAccessKey() {
        return accessKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
    private final SensitiveAttribute secretKey;

    public SensitiveAttribute getSecretKey() {
        return secretKey;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateConnectionFromAmazonS3(");
        sb.append("super=").append(super.toString());
        sb.append(", accessKey=").append(String.valueOf(this.accessKey));
        sb.append(", secretKey=").append(String.valueOf(this.secretKey));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConnectionFromAmazonS3)) {
            return false;
        }

        UpdateConnectionFromAmazonS3 other = (UpdateConnectionFromAmazonS3) o;
        return java.util.Objects.equals(this.accessKey, other.accessKey)
                && java.util.Objects.equals(this.secretKey, other.secretKey)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.accessKey == null ? 43 : this.accessKey.hashCode());
        result = (result * PRIME) + (this.secretKey == null ? 43 : this.secretKey.hashCode());
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
