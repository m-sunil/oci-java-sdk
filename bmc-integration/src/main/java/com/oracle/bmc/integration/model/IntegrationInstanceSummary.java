/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Summary of the Integration Instance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IntegrationInstanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IntegrationInstanceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "integrationInstanceType",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "stateMessage",
        "isByol",
        "instanceUrl",
        "messagePacks",
        "isFileServerEnabled",
        "isVisualBuilderEnabled",
        "customEndpoint",
        "alternateCustomEndpoints",
        "consumptionModel",
        "networkEndpointDetails"
    })
    public IntegrationInstanceSummary(
            String id,
            String displayName,
            String compartmentId,
            IntegrationInstanceType integrationInstanceType,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String stateMessage,
            Boolean isByol,
            String instanceUrl,
            Integer messagePacks,
            Boolean isFileServerEnabled,
            Boolean isVisualBuilderEnabled,
            CustomEndpointDetails customEndpoint,
            java.util.List<CustomEndpointDetails> alternateCustomEndpoints,
            ConsumptionModel consumptionModel,
            NetworkEndpointDetails networkEndpointDetails) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.integrationInstanceType = integrationInstanceType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.stateMessage = stateMessage;
        this.isByol = isByol;
        this.instanceUrl = instanceUrl;
        this.messagePacks = messagePacks;
        this.isFileServerEnabled = isFileServerEnabled;
        this.isVisualBuilderEnabled = isVisualBuilderEnabled;
        this.customEndpoint = customEndpoint;
        this.alternateCustomEndpoints = alternateCustomEndpoints;
        this.consumptionModel = consumptionModel;
        this.networkEndpointDetails = networkEndpointDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier that is immutable on creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Integration Instance Identifier, can be renamed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Integration Instance Identifier, can be renamed.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compartment Identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Standard or Enterprise type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("integrationInstanceType")
        private IntegrationInstanceType integrationInstanceType;

        /**
         * Standard or Enterprise type
         * @param integrationInstanceType the value to set
         * @return this builder
         **/
        public Builder integrationInstanceType(IntegrationInstanceType integrationInstanceType) {
            this.integrationInstanceType = integrationInstanceType;
            this.__explicitlySet__.add("integrationInstanceType");
            return this;
        }
        /**
         * The time the the Integration Instance was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the Integration Instance was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the IntegrationInstance was updated. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the IntegrationInstance was updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the Integration Instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Integration Instance.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
        private String stateMessage;

        /**
         * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param stateMessage the value to set
         * @return this builder
         **/
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = stateMessage;
            this.__explicitlySet__.add("stateMessage");
            return this;
        }
        /**
         * Bring your own license.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isByol")
        private Boolean isByol;

        /**
         * Bring your own license.
         * @param isByol the value to set
         * @return this builder
         **/
        public Builder isByol(Boolean isByol) {
            this.isByol = isByol;
            this.__explicitlySet__.add("isByol");
            return this;
        }
        /**
         * The Integration Instance URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceUrl")
        private String instanceUrl;

        /**
         * The Integration Instance URL.
         * @param instanceUrl the value to set
         * @return this builder
         **/
        public Builder instanceUrl(String instanceUrl) {
            this.instanceUrl = instanceUrl;
            this.__explicitlySet__.add("instanceUrl");
            return this;
        }
        /**
         * The number of configured message packs (if any)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("messagePacks")
        private Integer messagePacks;

        /**
         * The number of configured message packs (if any)
         * @param messagePacks the value to set
         * @return this builder
         **/
        public Builder messagePacks(Integer messagePacks) {
            this.messagePacks = messagePacks;
            this.__explicitlySet__.add("messagePacks");
            return this;
        }
        /**
         * The file server is enabled or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFileServerEnabled")
        private Boolean isFileServerEnabled;

        /**
         * The file server is enabled or not.
         * @param isFileServerEnabled the value to set
         * @return this builder
         **/
        public Builder isFileServerEnabled(Boolean isFileServerEnabled) {
            this.isFileServerEnabled = isFileServerEnabled;
            this.__explicitlySet__.add("isFileServerEnabled");
            return this;
        }
        /**
         * Visual Builder is enabled or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
        private Boolean isVisualBuilderEnabled;

        /**
         * Visual Builder is enabled or not.
         * @param isVisualBuilderEnabled the value to set
         * @return this builder
         **/
        public Builder isVisualBuilderEnabled(Boolean isVisualBuilderEnabled) {
            this.isVisualBuilderEnabled = isVisualBuilderEnabled;
            this.__explicitlySet__.add("isVisualBuilderEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customEndpoint")
        private CustomEndpointDetails customEndpoint;

        public Builder customEndpoint(CustomEndpointDetails customEndpoint) {
            this.customEndpoint = customEndpoint;
            this.__explicitlySet__.add("customEndpoint");
            return this;
        }
        /**
         * A list of alternate custom endpoints used for the integration instance URL.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
        private java.util.List<CustomEndpointDetails> alternateCustomEndpoints;

        /**
         * A list of alternate custom endpoints used for the integration instance URL.
         *
         * @param alternateCustomEndpoints the value to set
         * @return this builder
         **/
        public Builder alternateCustomEndpoints(
                java.util.List<CustomEndpointDetails> alternateCustomEndpoints) {
            this.alternateCustomEndpoints = alternateCustomEndpoints;
            this.__explicitlySet__.add("alternateCustomEndpoints");
            return this;
        }
        /**
         * The entitlement used for billing purposes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
        private ConsumptionModel consumptionModel;

        /**
         * The entitlement used for billing purposes.
         * @param consumptionModel the value to set
         * @return this builder
         **/
        public Builder consumptionModel(ConsumptionModel consumptionModel) {
            this.consumptionModel = consumptionModel;
            this.__explicitlySet__.add("consumptionModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkEndpointDetails")
        private NetworkEndpointDetails networkEndpointDetails;

        public Builder networkEndpointDetails(NetworkEndpointDetails networkEndpointDetails) {
            this.networkEndpointDetails = networkEndpointDetails;
            this.__explicitlySet__.add("networkEndpointDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IntegrationInstanceSummary build() {
            IntegrationInstanceSummary __instance__ =
                    new IntegrationInstanceSummary(
                            id,
                            displayName,
                            compartmentId,
                            integrationInstanceType,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            stateMessage,
                            isByol,
                            instanceUrl,
                            messagePacks,
                            isFileServerEnabled,
                            isVisualBuilderEnabled,
                            customEndpoint,
                            alternateCustomEndpoints,
                            consumptionModel,
                            networkEndpointDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IntegrationInstanceSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .integrationInstanceType(o.getIntegrationInstanceType())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .stateMessage(o.getStateMessage())
                            .isByol(o.getIsByol())
                            .instanceUrl(o.getInstanceUrl())
                            .messagePacks(o.getMessagePacks())
                            .isFileServerEnabled(o.getIsFileServerEnabled())
                            .isVisualBuilderEnabled(o.getIsVisualBuilderEnabled())
                            .customEndpoint(o.getCustomEndpoint())
                            .alternateCustomEndpoints(o.getAlternateCustomEndpoints())
                            .consumptionModel(o.getConsumptionModel())
                            .networkEndpointDetails(o.getNetworkEndpointDetails());

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
     * Unique identifier that is immutable on creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Integration Instance Identifier, can be renamed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Integration Instance Identifier, can be renamed.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Standard or Enterprise type
     **/
    public enum IntegrationInstanceType {
        Standard("STANDARD"),
        Enterprise("ENTERPRISE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IntegrationInstanceType.class);

        private final String value;
        private static java.util.Map<String, IntegrationInstanceType> map;

        static {
            map = new java.util.HashMap<>();
            for (IntegrationInstanceType v : IntegrationInstanceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IntegrationInstanceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IntegrationInstanceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IntegrationInstanceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Standard or Enterprise type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("integrationInstanceType")
    private final IntegrationInstanceType integrationInstanceType;

    /**
     * Standard or Enterprise type
     * @return the value
     **/
    public IntegrationInstanceType getIntegrationInstanceType() {
        return integrationInstanceType;
    }

    /**
     * The time the the Integration Instance was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the Integration Instance was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the IntegrationInstance was updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the IntegrationInstance was updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the Integration Instance.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the Integration Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Integration Instance.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    private final String stateMessage;

    /**
     * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getStateMessage() {
        return stateMessage;
    }

    /**
     * Bring your own license.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isByol")
    private final Boolean isByol;

    /**
     * Bring your own license.
     * @return the value
     **/
    public Boolean getIsByol() {
        return isByol;
    }

    /**
     * The Integration Instance URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceUrl")
    private final String instanceUrl;

    /**
     * The Integration Instance URL.
     * @return the value
     **/
    public String getInstanceUrl() {
        return instanceUrl;
    }

    /**
     * The number of configured message packs (if any)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messagePacks")
    private final Integer messagePacks;

    /**
     * The number of configured message packs (if any)
     * @return the value
     **/
    public Integer getMessagePacks() {
        return messagePacks;
    }

    /**
     * The file server is enabled or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFileServerEnabled")
    private final Boolean isFileServerEnabled;

    /**
     * The file server is enabled or not.
     * @return the value
     **/
    public Boolean getIsFileServerEnabled() {
        return isFileServerEnabled;
    }

    /**
     * Visual Builder is enabled or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
    private final Boolean isVisualBuilderEnabled;

    /**
     * Visual Builder is enabled or not.
     * @return the value
     **/
    public Boolean getIsVisualBuilderEnabled() {
        return isVisualBuilderEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customEndpoint")
    private final CustomEndpointDetails customEndpoint;

    public CustomEndpointDetails getCustomEndpoint() {
        return customEndpoint;
    }

    /**
     * A list of alternate custom endpoints used for the integration instance URL.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
    private final java.util.List<CustomEndpointDetails> alternateCustomEndpoints;

    /**
     * A list of alternate custom endpoints used for the integration instance URL.
     *
     * @return the value
     **/
    public java.util.List<CustomEndpointDetails> getAlternateCustomEndpoints() {
        return alternateCustomEndpoints;
    }

    /**
     * The entitlement used for billing purposes.
     **/
    public enum ConsumptionModel {
        Ucm("UCM"),
        Gov("GOV"),
        Oic4Saas("OIC4SAAS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConsumptionModel.class);

        private final String value;
        private static java.util.Map<String, ConsumptionModel> map;

        static {
            map = new java.util.HashMap<>();
            for (ConsumptionModel v : ConsumptionModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConsumptionModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConsumptionModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConsumptionModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The entitlement used for billing purposes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
    private final ConsumptionModel consumptionModel;

    /**
     * The entitlement used for billing purposes.
     * @return the value
     **/
    public ConsumptionModel getConsumptionModel() {
        return consumptionModel;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkEndpointDetails")
    private final NetworkEndpointDetails networkEndpointDetails;

    public NetworkEndpointDetails getNetworkEndpointDetails() {
        return networkEndpointDetails;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IntegrationInstanceSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", integrationInstanceType=")
                .append(String.valueOf(this.integrationInstanceType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", stateMessage=").append(String.valueOf(this.stateMessage));
        sb.append(", isByol=").append(String.valueOf(this.isByol));
        sb.append(", instanceUrl=").append(String.valueOf(this.instanceUrl));
        sb.append(", messagePacks=").append(String.valueOf(this.messagePacks));
        sb.append(", isFileServerEnabled=").append(String.valueOf(this.isFileServerEnabled));
        sb.append(", isVisualBuilderEnabled=").append(String.valueOf(this.isVisualBuilderEnabled));
        sb.append(", customEndpoint=").append(String.valueOf(this.customEndpoint));
        sb.append(", alternateCustomEndpoints=")
                .append(String.valueOf(this.alternateCustomEndpoints));
        sb.append(", consumptionModel=").append(String.valueOf(this.consumptionModel));
        sb.append(", networkEndpointDetails=").append(String.valueOf(this.networkEndpointDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IntegrationInstanceSummary)) {
            return false;
        }

        IntegrationInstanceSummary other = (IntegrationInstanceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.integrationInstanceType, other.integrationInstanceType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.stateMessage, other.stateMessage)
                && java.util.Objects.equals(this.isByol, other.isByol)
                && java.util.Objects.equals(this.instanceUrl, other.instanceUrl)
                && java.util.Objects.equals(this.messagePacks, other.messagePacks)
                && java.util.Objects.equals(this.isFileServerEnabled, other.isFileServerEnabled)
                && java.util.Objects.equals(
                        this.isVisualBuilderEnabled, other.isVisualBuilderEnabled)
                && java.util.Objects.equals(this.customEndpoint, other.customEndpoint)
                && java.util.Objects.equals(
                        this.alternateCustomEndpoints, other.alternateCustomEndpoints)
                && java.util.Objects.equals(this.consumptionModel, other.consumptionModel)
                && java.util.Objects.equals(
                        this.networkEndpointDetails, other.networkEndpointDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.integrationInstanceType == null
                                ? 43
                                : this.integrationInstanceType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        result = (result * PRIME) + (this.isByol == null ? 43 : this.isByol.hashCode());
        result = (result * PRIME) + (this.instanceUrl == null ? 43 : this.instanceUrl.hashCode());
        result = (result * PRIME) + (this.messagePacks == null ? 43 : this.messagePacks.hashCode());
        result =
                (result * PRIME)
                        + (this.isFileServerEnabled == null
                                ? 43
                                : this.isFileServerEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isVisualBuilderEnabled == null
                                ? 43
                                : this.isVisualBuilderEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.customEndpoint == null ? 43 : this.customEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.alternateCustomEndpoints == null
                                ? 43
                                : this.alternateCustomEndpoints.hashCode());
        result =
                (result * PRIME)
                        + (this.consumptionModel == null ? 43 : this.consumptionModel.hashCode());
        result =
                (result * PRIME)
                        + (this.networkEndpointDetails == null
                                ? 43
                                : this.networkEndpointDetails.hashCode());
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
