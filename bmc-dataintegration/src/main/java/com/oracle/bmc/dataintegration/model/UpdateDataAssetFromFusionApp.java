/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details for the Autonomous Transaction Processing data asset type.
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
    builder = UpdateDataAssetFromFusionApp.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDataAssetFromFusionApp extends UpdateDataAssetDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assetProperties")
        private java.util.Map<String, String> assetProperties;

        public Builder assetProperties(java.util.Map<String, String> assetProperties) {
            this.assetProperties = assetProperties;
            this.__explicitlySet__.add("assetProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }
        /**
         * The service url of the BI Server.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceUrl")
        private String serviceUrl;

        /**
         * The service url of the BI Server.
         * @param serviceUrl the value to set
         * @return this builder
         **/
        public Builder serviceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            this.__explicitlySet__.add("serviceUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDataAssetFromFusionApp build() {
            UpdateDataAssetFromFusionApp __instance__ =
                    new UpdateDataAssetFromFusionApp(
                            key,
                            modelVersion,
                            name,
                            description,
                            objectStatus,
                            objectVersion,
                            identifier,
                            externalKey,
                            assetProperties,
                            registryMetadata,
                            serviceUrl);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDataAssetFromFusionApp o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectStatus(o.getObjectStatus())
                            .objectVersion(o.getObjectVersion())
                            .identifier(o.getIdentifier())
                            .externalKey(o.getExternalKey())
                            .assetProperties(o.getAssetProperties())
                            .registryMetadata(o.getRegistryMetadata())
                            .serviceUrl(o.getServiceUrl());

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
    public UpdateDataAssetFromFusionApp(
            String key,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            Integer objectVersion,
            String identifier,
            String externalKey,
            java.util.Map<String, String> assetProperties,
            RegistryMetadata registryMetadata,
            String serviceUrl) {
        super(
                key,
                modelVersion,
                name,
                description,
                objectStatus,
                objectVersion,
                identifier,
                externalKey,
                assetProperties,
                registryMetadata);
        this.serviceUrl = serviceUrl;
    }

    /**
     * The service url of the BI Server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceUrl")
    private final String serviceUrl;

    /**
     * The service url of the BI Server.
     * @return the value
     **/
    public String getServiceUrl() {
        return serviceUrl;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateDataAssetFromFusionApp(");
        sb.append("super=").append(super.toString());
        sb.append(", serviceUrl=").append(String.valueOf(this.serviceUrl));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDataAssetFromFusionApp)) {
            return false;
        }

        UpdateDataAssetFromFusionApp other = (UpdateDataAssetFromFusionApp) o;
        return java.util.Objects.equals(this.serviceUrl, other.serviceUrl)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.serviceUrl == null ? 43 : this.serviceUrl.hashCode());
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
