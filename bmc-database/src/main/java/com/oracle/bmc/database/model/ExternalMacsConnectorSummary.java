/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * An Oracle Cloud Infrastructure resource that uses the [Management Agent cloud service (MACS)](https://docs.cloud.oracle.com/iaas/management-agents/index.html) to connect to an external Oracle Database.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalMacsConnectorSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectorType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalMacsConnectorSummary extends ExternalDatabaseConnectorSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ExternalDatabaseConnector.LifecycleState lifecycleState;

        public Builder lifecycleState(ExternalDatabaseConnector.LifecycleState lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseId")
        private String externalDatabaseId;

        public Builder externalDatabaseId(String externalDatabaseId) {
            this.externalDatabaseId = externalDatabaseId;
            this.__explicitlySet__.add("externalDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionStatus")
        private String connectionStatus;

        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            this.__explicitlySet__.add("connectionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeConnectionStatusLastUpdated")
        private java.util.Date timeConnectionStatusLastUpdated;

        public Builder timeConnectionStatusLastUpdated(
                java.util.Date timeConnectionStatusLastUpdated) {
            this.timeConnectionStatusLastUpdated = timeConnectionStatusLastUpdated;
            this.__explicitlySet__.add("timeConnectionStatusLastUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private DatabaseConnectionString connectionString;

        public Builder connectionString(DatabaseConnectionString connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionCredentials")
        private DatabaseConnectionCredentials connectionCredentials;

        public Builder connectionCredentials(DatabaseConnectionCredentials connectionCredentials) {
            this.connectionCredentials = connectionCredentials;
            this.__explicitlySet__.add("connectionCredentials");
            return this;
        }
        /**
         * The ID of the agent used for the
         * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectorAgentId")
        private String connectorAgentId;

        /**
         * The ID of the agent used for the
         * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
         *
         * @param connectorAgentId the value to set
         * @return this builder
         **/
        public Builder connectorAgentId(String connectorAgentId) {
            this.connectorAgentId = connectorAgentId;
            this.__explicitlySet__.add("connectorAgentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalMacsConnectorSummary build() {
            ExternalMacsConnectorSummary __instance__ =
                    new ExternalMacsConnectorSummary(
                            compartmentId,
                            freeformTags,
                            definedTags,
                            displayName,
                            id,
                            lifecycleState,
                            lifecycleDetails,
                            timeCreated,
                            externalDatabaseId,
                            connectionStatus,
                            timeConnectionStatusLastUpdated,
                            connectionString,
                            connectionCredentials,
                            connectorAgentId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalMacsConnectorSummary o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeCreated(o.getTimeCreated())
                            .externalDatabaseId(o.getExternalDatabaseId())
                            .connectionStatus(o.getConnectionStatus())
                            .timeConnectionStatusLastUpdated(o.getTimeConnectionStatusLastUpdated())
                            .connectionString(o.getConnectionString())
                            .connectionCredentials(o.getConnectionCredentials())
                            .connectorAgentId(o.getConnectorAgentId());

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
    public ExternalMacsConnectorSummary(
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String id,
            ExternalDatabaseConnector.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            String externalDatabaseId,
            String connectionStatus,
            java.util.Date timeConnectionStatusLastUpdated,
            DatabaseConnectionString connectionString,
            DatabaseConnectionCredentials connectionCredentials,
            String connectorAgentId) {
        super(
                compartmentId,
                freeformTags,
                definedTags,
                displayName,
                id,
                lifecycleState,
                lifecycleDetails,
                timeCreated,
                externalDatabaseId,
                connectionStatus,
                timeConnectionStatusLastUpdated);
        this.connectionString = connectionString;
        this.connectionCredentials = connectionCredentials;
        this.connectorAgentId = connectorAgentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    private final DatabaseConnectionString connectionString;

    public DatabaseConnectionString getConnectionString() {
        return connectionString;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionCredentials")
    private final DatabaseConnectionCredentials connectionCredentials;

    public DatabaseConnectionCredentials getConnectionCredentials() {
        return connectionCredentials;
    }

    /**
     * The ID of the agent used for the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectorAgentId")
    private final String connectorAgentId;

    /**
     * The ID of the agent used for the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
     *
     * @return the value
     **/
    public String getConnectorAgentId() {
        return connectorAgentId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExternalMacsConnectorSummary(");
        sb.append("super=").append(super.toString());
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", connectionCredentials=").append(String.valueOf(this.connectionCredentials));
        sb.append(", connectorAgentId=").append(String.valueOf(this.connectorAgentId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalMacsConnectorSummary)) {
            return false;
        }

        ExternalMacsConnectorSummary other = (ExternalMacsConnectorSummary) o;
        return java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.connectionCredentials, other.connectionCredentials)
                && java.util.Objects.equals(this.connectorAgentId, other.connectorAgentId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.connectionString == null ? 43 : this.connectionString.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionCredentials == null
                                ? 43
                                : this.connectionCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.connectorAgentId == null ? 43 : this.connectorAgentId.hashCode());
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
