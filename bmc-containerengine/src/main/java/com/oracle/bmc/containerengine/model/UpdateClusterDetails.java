/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a request to update a cluster.
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
    builder = UpdateClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateClusterDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "kubernetesVersion",
        "options",
        "freeformTags",
        "definedTags",
        "imagePolicyConfig"
    })
    public UpdateClusterDetails(
            String name,
            String kubernetesVersion,
            UpdateClusterOptionsDetails options,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            UpdateImagePolicyConfigDetails imagePolicyConfig) {
        super();
        this.name = name;
        this.kubernetesVersion = kubernetesVersion;
        this.options = options;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.imagePolicyConfig = imagePolicyConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The new name for the cluster. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The new name for the cluster. Avoid entering confidential information.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The version of Kubernetes to which the cluster masters should be upgraded.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
        private String kubernetesVersion;

        /**
         * The version of Kubernetes to which the cluster masters should be upgraded.
         * @param kubernetesVersion the value to set
         * @return this builder
         **/
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            this.__explicitlySet__.add("kubernetesVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private UpdateClusterOptionsDetails options;

        public Builder options(UpdateClusterOptionsDetails options) {
            this.options = options;
            this.__explicitlySet__.add("options");
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
         * The image verification policy for signature validation. Once a policy is created and enabled with
         * one or more kms keys, the policy will ensure all images deployed has been signed with the key(s)
         * attached to the policy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
        private UpdateImagePolicyConfigDetails imagePolicyConfig;

        /**
         * The image verification policy for signature validation. Once a policy is created and enabled with
         * one or more kms keys, the policy will ensure all images deployed has been signed with the key(s)
         * attached to the policy.
         *
         * @param imagePolicyConfig the value to set
         * @return this builder
         **/
        public Builder imagePolicyConfig(UpdateImagePolicyConfigDetails imagePolicyConfig) {
            this.imagePolicyConfig = imagePolicyConfig;
            this.__explicitlySet__.add("imagePolicyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateClusterDetails build() {
            UpdateClusterDetails __instance__ =
                    new UpdateClusterDetails(
                            name,
                            kubernetesVersion,
                            options,
                            freeformTags,
                            definedTags,
                            imagePolicyConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateClusterDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .kubernetesVersion(o.getKubernetesVersion())
                            .options(o.getOptions())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
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
     * The new name for the cluster. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The new name for the cluster. Avoid entering confidential information.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The version of Kubernetes to which the cluster masters should be upgraded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
    private final String kubernetesVersion;

    /**
     * The version of Kubernetes to which the cluster masters should be upgraded.
     * @return the value
     **/
    public String getKubernetesVersion() {
        return kubernetesVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final UpdateClusterOptionsDetails options;

    public UpdateClusterOptionsDetails getOptions() {
        return options;
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
     * The image verification policy for signature validation. Once a policy is created and enabled with
     * one or more kms keys, the policy will ensure all images deployed has been signed with the key(s)
     * attached to the policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
    private final UpdateImagePolicyConfigDetails imagePolicyConfig;

    /**
     * The image verification policy for signature validation. Once a policy is created and enabled with
     * one or more kms keys, the policy will ensure all images deployed has been signed with the key(s)
     * attached to the policy.
     *
     * @return the value
     **/
    public UpdateImagePolicyConfigDetails getImagePolicyConfig() {
        return imagePolicyConfig;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateClusterDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", kubernetesVersion=").append(String.valueOf(this.kubernetesVersion));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
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
        if (!(o instanceof UpdateClusterDetails)) {
            return false;
        }

        UpdateClusterDetails other = (UpdateClusterDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.kubernetesVersion, other.kubernetesVersion)
                && java.util.Objects.equals(this.options, other.options)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
                        + (this.kubernetesVersion == null ? 43 : this.kubernetesVersion.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
