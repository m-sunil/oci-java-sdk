/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Container Engine for Kubernetes (OKE) cluster Blue-Green deployment stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOkeBlueGreenDeployStageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOkeBlueGreenDeployStageDetails extends UpdateDeployStageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessorCollection")
        private DeployStagePredecessorCollection deployStagePredecessorCollection;

        public Builder deployStagePredecessorCollection(
                DeployStagePredecessorCollection deployStagePredecessorCollection) {
            this.deployStagePredecessorCollection = deployStagePredecessorCollection;
            this.__explicitlySet__.add("deployStagePredecessorCollection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * List of Kubernetes manifest artifact OCIDs, the manifests should not include any job resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesManifestDeployArtifactIds")
        private java.util.List<String> kubernetesManifestDeployArtifactIds;

        /**
         * List of Kubernetes manifest artifact OCIDs, the manifests should not include any job resource.
         * @param kubernetesManifestDeployArtifactIds the value to set
         * @return this builder
         **/
        public Builder kubernetesManifestDeployArtifactIds(
                java.util.List<String> kubernetesManifestDeployArtifactIds) {
            this.kubernetesManifestDeployArtifactIds = kubernetesManifestDeployArtifactIds;
            this.__explicitlySet__.add("kubernetesManifestDeployArtifactIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOkeBlueGreenDeployStageDetails build() {
            UpdateOkeBlueGreenDeployStageDetails __instance__ =
                    new UpdateOkeBlueGreenDeployStageDetails(
                            description,
                            displayName,
                            deployStagePredecessorCollection,
                            freeformTags,
                            definedTags,
                            kubernetesManifestDeployArtifactIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOkeBlueGreenDeployStageDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .deployStagePredecessorCollection(
                                    o.getDeployStagePredecessorCollection())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .kubernetesManifestDeployArtifactIds(
                                    o.getKubernetesManifestDeployArtifactIds());

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
    public UpdateOkeBlueGreenDeployStageDetails(
            String description,
            String displayName,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<String> kubernetesManifestDeployArtifactIds) {
        super(
                description,
                displayName,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags);
        this.kubernetesManifestDeployArtifactIds = kubernetesManifestDeployArtifactIds;
    }

    /**
     * List of Kubernetes manifest artifact OCIDs, the manifests should not include any job resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesManifestDeployArtifactIds")
    private final java.util.List<String> kubernetesManifestDeployArtifactIds;

    /**
     * List of Kubernetes manifest artifact OCIDs, the manifests should not include any job resource.
     * @return the value
     **/
    public java.util.List<String> getKubernetesManifestDeployArtifactIds() {
        return kubernetesManifestDeployArtifactIds;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateOkeBlueGreenDeployStageDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", kubernetesManifestDeployArtifactIds=")
                .append(String.valueOf(this.kubernetesManifestDeployArtifactIds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOkeBlueGreenDeployStageDetails)) {
            return false;
        }

        UpdateOkeBlueGreenDeployStageDetails other = (UpdateOkeBlueGreenDeployStageDetails) o;
        return java.util.Objects.equals(
                        this.kubernetesManifestDeployArtifactIds,
                        other.kubernetesManifestDeployArtifactIds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.kubernetesManifestDeployArtifactIds == null
                                ? 43
                                : this.kubernetesManifestDeployArtifactIds.hashCode());
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
