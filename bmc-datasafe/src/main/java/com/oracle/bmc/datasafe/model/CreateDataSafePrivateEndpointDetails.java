/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details used to create a new Data Safe private endpoint.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDataSafePrivateEndpointDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDataSafePrivateEndpointDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "vcnId",
        "subnetId",
        "privateEndpointIp",
        "description",
        "nsgIds",
        "freeformTags",
        "definedTags"
    })
    public CreateDataSafePrivateEndpointDetails(
            String displayName,
            String compartmentId,
            String vcnId,
            String subnetId,
            String privateEndpointIp,
            String description,
            java.util.List<String> nsgIds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.privateEndpointIp = privateEndpointIp;
        this.description = description;
        this.nsgIds = nsgIds;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The display name for the private endpoint. The name does not have to be unique, and it's changeable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name for the private endpoint. The name does not have to be unique, and it's changeable.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the VCN.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The OCID of the VCN.
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The OCID of the subnet.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet.
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The private IP address of the private endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
        private String privateEndpointIp;

        /**
         * The private IP address of the private endpoint.
         * @param privateEndpointIp the value to set
         * @return this builder
         **/
        public Builder privateEndpointIp(String privateEndpointIp) {
            this.privateEndpointIp = privateEndpointIp;
            this.__explicitlySet__.add("privateEndpointIp");
            return this;
        }
        /**
         * The description of the private endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the private endpoint.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The OCIDs of the network security groups that the private endpoint belongs to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The OCIDs of the network security groups that the private endpoint belongs to.
         *
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataSafePrivateEndpointDetails build() {
            CreateDataSafePrivateEndpointDetails __instance__ =
                    new CreateDataSafePrivateEndpointDetails(
                            displayName,
                            compartmentId,
                            vcnId,
                            subnetId,
                            privateEndpointIp,
                            description,
                            nsgIds,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataSafePrivateEndpointDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .vcnId(o.getVcnId())
                            .subnetId(o.getSubnetId())
                            .privateEndpointIp(o.getPrivateEndpointIp())
                            .description(o.getDescription())
                            .nsgIds(o.getNsgIds())
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
     * The display name for the private endpoint. The name does not have to be unique, and it's changeable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name for the private endpoint. The name does not have to be unique, and it's changeable.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the VCN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The OCID of the VCN.
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The OCID of the subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet.
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The private IP address of the private endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
    private final String privateEndpointIp;

    /**
     * The private IP address of the private endpoint.
     * @return the value
     **/
    public String getPrivateEndpointIp() {
        return privateEndpointIp;
    }

    /**
     * The description of the private endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the private endpoint.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The OCIDs of the network security groups that the private endpoint belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The OCIDs of the network security groups that the private endpoint belongs to.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateDataSafePrivateEndpointDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", privateEndpointIp=").append(String.valueOf(this.privateEndpointIp));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
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
        if (!(o instanceof CreateDataSafePrivateEndpointDetails)) {
            return false;
        }

        CreateDataSafePrivateEndpointDetails other = (CreateDataSafePrivateEndpointDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.privateEndpointIp, other.privateEndpointIp)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIp == null ? 43 : this.privateEndpointIp.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
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
