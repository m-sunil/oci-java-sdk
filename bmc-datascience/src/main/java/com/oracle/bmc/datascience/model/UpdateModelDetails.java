/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Details for updating a model.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateModelDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateModelDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "freeformTags",
        "definedTags",
        "customMetadataList",
        "definedMetadataList"
    })
    public UpdateModelDetails(
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<Metadata> customMetadataList,
            java.util.List<Metadata> definedMetadataList) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.customMetadataList = customMetadataList;
        this.definedMetadataList = definedMetadataList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name for the resource. It does not have to be unique and can be modified. Avoid entering confidential information.
         *  Example: {@code My Model}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource. It does not have to be unique and can be modified. Avoid entering confidential information.
         *  Example: {@code My Model}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A short description of the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the model.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * An array of custom metadata details for the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customMetadataList")
        private java.util.List<Metadata> customMetadataList;

        /**
         * An array of custom metadata details for the model.
         * @param customMetadataList the value to set
         * @return this builder
         **/
        public Builder customMetadataList(java.util.List<Metadata> customMetadataList) {
            this.customMetadataList = customMetadataList;
            this.__explicitlySet__.add("customMetadataList");
            return this;
        }
        /**
         * An array of defined metadata details for the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedMetadataList")
        private java.util.List<Metadata> definedMetadataList;

        /**
         * An array of defined metadata details for the model.
         * @param definedMetadataList the value to set
         * @return this builder
         **/
        public Builder definedMetadataList(java.util.List<Metadata> definedMetadataList) {
            this.definedMetadataList = definedMetadataList;
            this.__explicitlySet__.add("definedMetadataList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateModelDetails build() {
            UpdateModelDetails __instance__ =
                    new UpdateModelDetails(
                            displayName,
                            description,
                            freeformTags,
                            definedTags,
                            customMetadataList,
                            definedMetadataList);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModelDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .customMetadataList(o.getCustomMetadataList())
                            .definedMetadataList(o.getDefinedMetadataList());

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
     * A user-friendly display name for the resource. It does not have to be unique and can be modified. Avoid entering confidential information.
     *  Example: {@code My Model}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource. It does not have to be unique and can be modified. Avoid entering confidential information.
     *  Example: {@code My Model}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A short description of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the model.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * An array of custom metadata details for the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customMetadataList")
    private final java.util.List<Metadata> customMetadataList;

    /**
     * An array of custom metadata details for the model.
     * @return the value
     **/
    public java.util.List<Metadata> getCustomMetadataList() {
        return customMetadataList;
    }

    /**
     * An array of defined metadata details for the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedMetadataList")
    private final java.util.List<Metadata> definedMetadataList;

    /**
     * An array of defined metadata details for the model.
     * @return the value
     **/
    public java.util.List<Metadata> getDefinedMetadataList() {
        return definedMetadataList;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateModelDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", customMetadataList=").append(String.valueOf(this.customMetadataList));
        sb.append(", definedMetadataList=").append(String.valueOf(this.definedMetadataList));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateModelDetails)) {
            return false;
        }

        UpdateModelDetails other = (UpdateModelDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.customMetadataList, other.customMetadataList)
                && java.util.Objects.equals(this.definedMetadataList, other.definedMetadataList)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.customMetadataList == null
                                ? 43
                                : this.customMetadataList.hashCode());
        result =
                (result * PRIME)
                        + (this.definedMetadataList == null
                                ? 43
                                : this.definedMetadataList.hashCode());
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
