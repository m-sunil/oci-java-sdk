/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a request to create a cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateClusterDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "compartmentId",
        "endpointConfig",
        "vcnId",
        "kubernetesVersion",
        "kmsKeyId",
        "freeformTags",
        "definedTags",
        "options",
        "imagePolicyConfig"
    })
    public CreateClusterDetails(
            String name,
            String compartmentId,
            CreateClusterEndpointConfigDetails endpointConfig,
            String vcnId,
            String kubernetesVersion,
            String kmsKeyId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            ClusterCreateOptions options,
            CreateImagePolicyConfigDetails imagePolicyConfig) {
        super();
        this.name = name;
        this.compartmentId = compartmentId;
        this.endpointConfig = endpointConfig;
        this.vcnId = vcnId;
        this.kubernetesVersion = kubernetesVersion;
        this.kmsKeyId = kmsKeyId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.options = options;
        this.imagePolicyConfig = imagePolicyConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the cluster. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the cluster. Avoid entering confidential information.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The OCID of the compartment in which to create the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment in which to create the cluster.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The network configuration for access to the Cluster control plane.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpointConfig")
        private CreateClusterEndpointConfigDetails endpointConfig;

        /**
         * The network configuration for access to the Cluster control plane.
         *
         * @param endpointConfig the value to set
         * @return this builder
         **/
        public Builder endpointConfig(CreateClusterEndpointConfigDetails endpointConfig) {
            this.endpointConfig = endpointConfig;
            this.__explicitlySet__.add("endpointConfig");
            return this;
        }
        /**
         * The OCID of the virtual cloud network (VCN) in which to create the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The OCID of the virtual cloud network (VCN) in which to create the cluster.
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The version of Kubernetes to install into the cluster masters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
        private String kubernetesVersion;

        /**
         * The version of Kubernetes to install into the cluster masters.
         * @param kubernetesVersion the value to set
         * @return this builder
         **/
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            this.__explicitlySet__.add("kubernetesVersion");
            return this;
        }
        /**
         * The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption.
         * When used, {@code kubernetesVersion} must be at least {@code v1.13.0}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption.
         * When used, {@code kubernetesVersion} must be at least {@code v1.13.0}.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * Optional attributes for the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private ClusterCreateOptions options;

        /**
         * Optional attributes for the cluster.
         * @param options the value to set
         * @return this builder
         **/
        public Builder options(ClusterCreateOptions options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }
        /**
         * The image verification policy for signature validation. Once a policy is created and enabled with
         * one or more kms keys, the policy will ensure all images deployed has been signed with the key(s)
         * attached to the policy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
        private CreateImagePolicyConfigDetails imagePolicyConfig;

        /**
         * The image verification policy for signature validation. Once a policy is created and enabled with
         * one or more kms keys, the policy will ensure all images deployed has been signed with the key(s)
         * attached to the policy.
         *
         * @param imagePolicyConfig the value to set
         * @return this builder
         **/
        public Builder imagePolicyConfig(CreateImagePolicyConfigDetails imagePolicyConfig) {
            this.imagePolicyConfig = imagePolicyConfig;
            this.__explicitlySet__.add("imagePolicyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateClusterDetails build() {
            CreateClusterDetails __instance__ =
                    new CreateClusterDetails(
                            name,
                            compartmentId,
                            endpointConfig,
                            vcnId,
                            kubernetesVersion,
                            kmsKeyId,
                            freeformTags,
                            definedTags,
                            options,
                            imagePolicyConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateClusterDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .endpointConfig(o.getEndpointConfig())
                            .vcnId(o.getVcnId())
                            .kubernetesVersion(o.getKubernetesVersion())
                            .kmsKeyId(o.getKmsKeyId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .options(o.getOptions())
                            .imagePolicyConfig(o.getImagePolicyConfig());

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
     * The name of the cluster. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the cluster. Avoid entering confidential information.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The OCID of the compartment in which to create the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment in which to create the cluster.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The network configuration for access to the Cluster control plane.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointConfig")
    private final CreateClusterEndpointConfigDetails endpointConfig;

    /**
     * The network configuration for access to the Cluster control plane.
     *
     * @return the value
     **/
    public CreateClusterEndpointConfigDetails getEndpointConfig() {
        return endpointConfig;
    }

    /**
     * The OCID of the virtual cloud network (VCN) in which to create the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The OCID of the virtual cloud network (VCN) in which to create the cluster.
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The version of Kubernetes to install into the cluster masters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
    private final String kubernetesVersion;

    /**
     * The version of Kubernetes to install into the cluster masters.
     * @return the value
     **/
    public String getKubernetesVersion() {
        return kubernetesVersion;
    }

    /**
     * The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption.
     * When used, {@code kubernetesVersion} must be at least {@code v1.13.0}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption.
     * When used, {@code kubernetesVersion} must be at least {@code v1.13.0}.
     *
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Optional attributes for the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final ClusterCreateOptions options;

    /**
     * Optional attributes for the cluster.
     * @return the value
     **/
    public ClusterCreateOptions getOptions() {
        return options;
    }

    /**
     * The image verification policy for signature validation. Once a policy is created and enabled with
     * one or more kms keys, the policy will ensure all images deployed has been signed with the key(s)
     * attached to the policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
    private final CreateImagePolicyConfigDetails imagePolicyConfig;

    /**
     * The image verification policy for signature validation. Once a policy is created and enabled with
     * one or more kms keys, the policy will ensure all images deployed has been signed with the key(s)
     * attached to the policy.
     *
     * @return the value
     **/
    public CreateImagePolicyConfigDetails getImagePolicyConfig() {
        return imagePolicyConfig;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateClusterDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", endpointConfig=").append(String.valueOf(this.endpointConfig));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", kubernetesVersion=").append(String.valueOf(this.kubernetesVersion));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(", imagePolicyConfig=").append(String.valueOf(this.imagePolicyConfig));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateClusterDetails)) {
            return false;
        }

        CreateClusterDetails other = (CreateClusterDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.endpointConfig, other.endpointConfig)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.kubernetesVersion, other.kubernetesVersion)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.options, other.options)
                && java.util.Objects.equals(this.imagePolicyConfig, other.imagePolicyConfig)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.endpointConfig == null ? 43 : this.endpointConfig.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result =
                (result * PRIME)
                        + (this.kubernetesVersion == null ? 43 : this.kubernetesVersion.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result =
                (result * PRIME)
                        + (this.imagePolicyConfig == null ? 43 : this.imagePolicyConfig.hashCode());
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
