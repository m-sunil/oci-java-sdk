/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Database insight resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PeComanagedDatabaseInsight.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PeComanagedDatabaseInsight extends DatabaseInsight {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ResourceStatus status;

        public Builder status(ResourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private String databaseType;

        public Builder databaseType(String databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processorCount")
        private Integer processorCount;

        public Builder processorCount(Integer processorCount) {
            this.processorCount = processorCount;
            this.__explicitlySet__.add("processorCount");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectionStatusDetails")
        private String databaseConnectionStatusDetails;

        public Builder databaseConnectionStatusDetails(String databaseConnectionStatusDetails) {
            this.databaseConnectionStatusDetails = databaseConnectionStatusDetails;
            this.__explicitlySet__.add("databaseConnectionStatusDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OPSI private endpoint
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("opsiPrivateEndpointId")
        private String opsiPrivateEndpointId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OPSI private endpoint
         * @param opsiPrivateEndpointId the value to set
         * @return this builder
         **/
        public Builder opsiPrivateEndpointId(String opsiPrivateEndpointId) {
            this.opsiPrivateEndpointId = opsiPrivateEndpointId;
            this.__explicitlySet__.add("opsiPrivateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
        private PeComanagedDatabaseConnectionDetails connectionDetails;

        public Builder connectionDetails(PeComanagedDatabaseConnectionDetails connectionDetails) {
            this.connectionDetails = connectionDetails;
            this.__explicitlySet__.add("connectionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private CredentialDetails credentialDetails;

        public Builder credentialDetails(CredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
         * @param databaseId the value to set
         * @return this builder
         **/
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /**
         * Name of database
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * Name of database
         * @param databaseName the value to set
         * @return this builder
         **/
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /**
         * Display name of database
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseDisplayName")
        private String databaseDisplayName;

        /**
         * Display name of database
         * @param databaseDisplayName the value to set
         * @return this builder
         **/
        public Builder databaseDisplayName(String databaseDisplayName) {
            this.databaseDisplayName = databaseDisplayName;
            this.__explicitlySet__.add("databaseDisplayName");
            return this;
        }
        /**
         * OCI database resource type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseResourceType")
        private String databaseResourceType;

        /**
         * OCI database resource type
         * @param databaseResourceType the value to set
         * @return this builder
         **/
        public Builder databaseResourceType(String databaseResourceType) {
            this.databaseResourceType = databaseResourceType;
            this.__explicitlySet__.add("databaseResourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PeComanagedDatabaseInsight build() {
            PeComanagedDatabaseInsight __instance__ =
                    new PeComanagedDatabaseInsight(
                            id,
                            compartmentId,
                            status,
                            databaseType,
                            databaseVersion,
                            processorCount,
                            freeformTags,
                            definedTags,
                            systemTags,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            databaseConnectionStatusDetails,
                            opsiPrivateEndpointId,
                            connectionDetails,
                            credentialDetails,
                            databaseId,
                            databaseName,
                            databaseDisplayName,
                            databaseResourceType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PeComanagedDatabaseInsight o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .status(o.getStatus())
                            .databaseType(o.getDatabaseType())
                            .databaseVersion(o.getDatabaseVersion())
                            .processorCount(o.getProcessorCount())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .databaseConnectionStatusDetails(o.getDatabaseConnectionStatusDetails())
                            .opsiPrivateEndpointId(o.getOpsiPrivateEndpointId())
                            .connectionDetails(o.getConnectionDetails())
                            .credentialDetails(o.getCredentialDetails())
                            .databaseId(o.getDatabaseId())
                            .databaseName(o.getDatabaseName())
                            .databaseDisplayName(o.getDatabaseDisplayName())
                            .databaseResourceType(o.getDatabaseResourceType());

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
    public PeComanagedDatabaseInsight(
            String id,
            String compartmentId,
            ResourceStatus status,
            String databaseType,
            String databaseVersion,
            Integer processorCount,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String databaseConnectionStatusDetails,
            String opsiPrivateEndpointId,
            PeComanagedDatabaseConnectionDetails connectionDetails,
            CredentialDetails credentialDetails,
            String databaseId,
            String databaseName,
            String databaseDisplayName,
            String databaseResourceType) {
        super(
                id,
                compartmentId,
                status,
                databaseType,
                databaseVersion,
                processorCount,
                freeformTags,
                definedTags,
                systemTags,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails,
                databaseConnectionStatusDetails);
        this.opsiPrivateEndpointId = opsiPrivateEndpointId;
        this.connectionDetails = connectionDetails;
        this.credentialDetails = credentialDetails;
        this.databaseId = databaseId;
        this.databaseName = databaseName;
        this.databaseDisplayName = databaseDisplayName;
        this.databaseResourceType = databaseResourceType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OPSI private endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opsiPrivateEndpointId")
    private final String opsiPrivateEndpointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OPSI private endpoint
     * @return the value
     **/
    public String getOpsiPrivateEndpointId() {
        return opsiPrivateEndpointId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
    private final PeComanagedDatabaseConnectionDetails connectionDetails;

    public PeComanagedDatabaseConnectionDetails getConnectionDetails() {
        return connectionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final CredentialDetails credentialDetails;

    public CredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     * @return the value
     **/
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * Name of database
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * Name of database
     * @return the value
     **/
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Display name of database
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseDisplayName")
    private final String databaseDisplayName;

    /**
     * Display name of database
     * @return the value
     **/
    public String getDatabaseDisplayName() {
        return databaseDisplayName;
    }

    /**
     * OCI database resource type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseResourceType")
    private final String databaseResourceType;

    /**
     * OCI database resource type
     * @return the value
     **/
    public String getDatabaseResourceType() {
        return databaseResourceType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PeComanagedDatabaseInsight(");
        sb.append("super=").append(super.toString());
        sb.append(", opsiPrivateEndpointId=").append(String.valueOf(this.opsiPrivateEndpointId));
        sb.append(", connectionDetails=").append(String.valueOf(this.connectionDetails));
        sb.append(", credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", databaseDisplayName=").append(String.valueOf(this.databaseDisplayName));
        sb.append(", databaseResourceType=").append(String.valueOf(this.databaseResourceType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeComanagedDatabaseInsight)) {
            return false;
        }

        PeComanagedDatabaseInsight other = (PeComanagedDatabaseInsight) o;
        return java.util.Objects.equals(this.opsiPrivateEndpointId, other.opsiPrivateEndpointId)
                && java.util.Objects.equals(this.connectionDetails, other.connectionDetails)
                && java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.databaseDisplayName, other.databaseDisplayName)
                && java.util.Objects.equals(this.databaseResourceType, other.databaseResourceType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opsiPrivateEndpointId == null
                                ? 43
                                : this.opsiPrivateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionDetails == null ? 43 : this.connectionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseDisplayName == null
                                ? 43
                                : this.databaseDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseResourceType == null
                                ? 43
                                : this.databaseResourceType.hashCode());
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
