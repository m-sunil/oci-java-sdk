/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * Details for updating a secret.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateSecretDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateSecretDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "currentVersionNumber",
        "definedTags",
        "description",
        "freeformTags",
        "metadata",
        "secretContent",
        "secretRules"
    })
    public UpdateSecretDetails(
            Long currentVersionNumber,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, Object> metadata,
            SecretContentDetails secretContent,
            java.util.List<SecretRule> secretRules) {
        super();
        this.currentVersionNumber = currentVersionNumber;
        this.definedTags = definedTags;
        this.description = description;
        this.freeformTags = freeformTags;
        this.metadata = metadata;
        this.secretContent = secretContent;
        this.secretRules = secretRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Details to update the secret version of the specified secret. The secret contents,
         * version number, and rules can't be specified at the same time.
         * Updating the secret contents automatically creates a new secret version.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentVersionNumber")
        private Long currentVersionNumber;

        /**
         * Details to update the secret version of the specified secret. The secret contents,
         * version number, and rules can't be specified at the same time.
         * Updating the secret contents automatically creates a new secret version.
         *
         * @param currentVersionNumber the value to set
         * @return this builder
         **/
        public Builder currentVersionNumber(Long currentVersionNumber) {
            this.currentVersionNumber = currentVersionNumber;
            this.__explicitlySet__.add("currentVersionNumber");
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
         * A brief description of the secret. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A brief description of the secret. Avoid entering confidential information.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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
         * Additional metadata that you can use to provide context about how to use the secret or during rotation or
         * other administrative tasks. For example, for a secret that you use to connect to a database, the additional
         * metadata might specify the connection endpoint and the connection string. Provide additional metadata as key-value pairs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, Object> metadata;

        /**
         * Additional metadata that you can use to provide context about how to use the secret or during rotation or
         * other administrative tasks. For example, for a secret that you use to connect to a database, the additional
         * metadata might specify the connection endpoint and the connection string. Provide additional metadata as key-value pairs.
         *
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(java.util.Map<String, Object> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secretContent")
        private SecretContentDetails secretContent;

        public Builder secretContent(SecretContentDetails secretContent) {
            this.secretContent = secretContent;
            this.__explicitlySet__.add("secretContent");
            return this;
        }
        /**
         * A list of rules to control how the secret is used and managed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secretRules")
        private java.util.List<SecretRule> secretRules;

        /**
         * A list of rules to control how the secret is used and managed.
         * @param secretRules the value to set
         * @return this builder
         **/
        public Builder secretRules(java.util.List<SecretRule> secretRules) {
            this.secretRules = secretRules;
            this.__explicitlySet__.add("secretRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSecretDetails build() {
            UpdateSecretDetails __instance__ =
                    new UpdateSecretDetails(
                            currentVersionNumber,
                            definedTags,
                            description,
                            freeformTags,
                            metadata,
                            secretContent,
                            secretRules);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSecretDetails o) {
            Builder copiedBuilder =
                    currentVersionNumber(o.getCurrentVersionNumber())
                            .definedTags(o.getDefinedTags())
                            .description(o.getDescription())
                            .freeformTags(o.getFreeformTags())
                            .metadata(o.getMetadata())
                            .secretContent(o.getSecretContent())
                            .secretRules(o.getSecretRules());

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
     * Details to update the secret version of the specified secret. The secret contents,
     * version number, and rules can't be specified at the same time.
     * Updating the secret contents automatically creates a new secret version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentVersionNumber")
    private final Long currentVersionNumber;

    /**
     * Details to update the secret version of the specified secret. The secret contents,
     * version number, and rules can't be specified at the same time.
     * Updating the secret contents automatically creates a new secret version.
     *
     * @return the value
     **/
    public Long getCurrentVersionNumber() {
        return currentVersionNumber;
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
     * A brief description of the secret. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A brief description of the secret. Avoid entering confidential information.
     * @return the value
     **/
    public String getDescription() {
        return description;
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
     * Additional metadata that you can use to provide context about how to use the secret or during rotation or
     * other administrative tasks. For example, for a secret that you use to connect to a database, the additional
     * metadata might specify the connection endpoint and the connection string. Provide additional metadata as key-value pairs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, Object> metadata;

    /**
     * Additional metadata that you can use to provide context about how to use the secret or during rotation or
     * other administrative tasks. For example, for a secret that you use to connect to a database, the additional
     * metadata might specify the connection endpoint and the connection string. Provide additional metadata as key-value pairs.
     *
     * @return the value
     **/
    public java.util.Map<String, Object> getMetadata() {
        return metadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secretContent")
    private final SecretContentDetails secretContent;

    public SecretContentDetails getSecretContent() {
        return secretContent;
    }

    /**
     * A list of rules to control how the secret is used and managed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretRules")
    private final java.util.List<SecretRule> secretRules;

    /**
     * A list of rules to control how the secret is used and managed.
     * @return the value
     **/
    public java.util.List<SecretRule> getSecretRules() {
        return secretRules;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateSecretDetails(");
        sb.append("currentVersionNumber=").append(String.valueOf(this.currentVersionNumber));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", secretContent=").append(String.valueOf(this.secretContent));
        sb.append(", secretRules=").append(String.valueOf(this.secretRules));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSecretDetails)) {
            return false;
        }

        UpdateSecretDetails other = (UpdateSecretDetails) o;
        return java.util.Objects.equals(this.currentVersionNumber, other.currentVersionNumber)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.secretContent, other.secretContent)
                && java.util.Objects.equals(this.secretRules, other.secretRules)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.currentVersionNumber == null
                                ? 43
                                : this.currentVersionNumber.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.secretContent == null ? 43 : this.secretContent.hashCode());
        result = (result * PRIME) + (this.secretRules == null ? 43 : this.secretRules.hashCode());
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
