/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.model;

/**
 * The information about new VbInstance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateVbInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateVbInstanceDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "freeformTags",
        "definedTags",
        "idcsOpenId",
        "nodeCount",
        "isVisualBuilderEnabled",
        "customEndpoint",
        "alternateCustomEndpoints",
        "consumptionModel"
    })
    public CreateVbInstanceDetails(
            String displayName,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String idcsOpenId,
            Integer nodeCount,
            Boolean isVisualBuilderEnabled,
            CreateCustomEndpointDetails customEndpoint,
            java.util.List<CreateCustomEndpointDetails> alternateCustomEndpoints,
            ConsumptionModel consumptionModel) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.idcsOpenId = idcsOpenId;
        this.nodeCount = nodeCount;
        this.isVisualBuilderEnabled = isVisualBuilderEnabled;
        this.customEndpoint = customEndpoint;
        this.alternateCustomEndpoints = alternateCustomEndpoints;
        this.consumptionModel = consumptionModel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Vb Instance Identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Vb Instance Identifier.
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
         * Simple key-value pair that is applied without any predefined name,
         * type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name,
         * type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Usage of predefined tag keys. These predefined keys are scoped to
         * namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to
         * namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not UCPIS, hence not a required parameter
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsOpenId")
        private String idcsOpenId;

        /**
         * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not UCPIS, hence not a required parameter
         * @param idcsOpenId the value to set
         * @return this builder
         **/
        public Builder idcsOpenId(String idcsOpenId) {
            this.idcsOpenId = idcsOpenId;
            this.__explicitlySet__.add("idcsOpenId");
            return this;
        }
        /**
         * The number of Nodes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of Nodes
         * @param nodeCount the value to set
         * @return this builder
         **/
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
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
        private CreateCustomEndpointDetails customEndpoint;

        public Builder customEndpoint(CreateCustomEndpointDetails customEndpoint) {
            this.customEndpoint = customEndpoint;
            this.__explicitlySet__.add("customEndpoint");
            return this;
        }
        /**
         * A list of alternate custom endpoints to be used for the vb instance URL
         * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
        private java.util.List<CreateCustomEndpointDetails> alternateCustomEndpoints;

        /**
         * A list of alternate custom endpoints to be used for the vb instance URL
         * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
         *
         * @param alternateCustomEndpoints the value to set
         * @return this builder
         **/
        public Builder alternateCustomEndpoints(
                java.util.List<CreateCustomEndpointDetails> alternateCustomEndpoints) {
            this.alternateCustomEndpoints = alternateCustomEndpoints;
            this.__explicitlySet__.add("alternateCustomEndpoints");
            return this;
        }
        /**
         * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
        private ConsumptionModel consumptionModel;

        /**
         * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
         * @param consumptionModel the value to set
         * @return this builder
         **/
        public Builder consumptionModel(ConsumptionModel consumptionModel) {
            this.consumptionModel = consumptionModel;
            this.__explicitlySet__.add("consumptionModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVbInstanceDetails build() {
            CreateVbInstanceDetails __instance__ =
                    new CreateVbInstanceDetails(
                            displayName,
                            compartmentId,
                            freeformTags,
                            definedTags,
                            idcsOpenId,
                            nodeCount,
                            isVisualBuilderEnabled,
                            customEndpoint,
                            alternateCustomEndpoints,
                            consumptionModel);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVbInstanceDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .idcsOpenId(o.getIdcsOpenId())
                            .nodeCount(o.getNodeCount())
                            .isVisualBuilderEnabled(o.getIsVisualBuilderEnabled())
                            .customEndpoint(o.getCustomEndpoint())
                            .alternateCustomEndpoints(o.getAlternateCustomEndpoints())
                            .consumptionModel(o.getConsumptionModel());

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
     * Vb Instance Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Vb Instance Identifier.
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
     * Simple key-value pair that is applied without any predefined name,
     * type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name,
     * type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to
     * namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to
     * namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not UCPIS, hence not a required parameter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsOpenId")
    private final String idcsOpenId;

    /**
     * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not UCPIS, hence not a required parameter
     * @return the value
     **/
    public String getIdcsOpenId() {
        return idcsOpenId;
    }

    /**
     * The number of Nodes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of Nodes
     * @return the value
     **/
    public Integer getNodeCount() {
        return nodeCount;
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
    private final CreateCustomEndpointDetails customEndpoint;

    public CreateCustomEndpointDetails getCustomEndpoint() {
        return customEndpoint;
    }

    /**
     * A list of alternate custom endpoints to be used for the vb instance URL
     * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
    private final java.util.List<CreateCustomEndpointDetails> alternateCustomEndpoints;

    /**
     * A list of alternate custom endpoints to be used for the vb instance URL
     * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
     *
     * @return the value
     **/
    public java.util.List<CreateCustomEndpointDetails> getAlternateCustomEndpoints() {
        return alternateCustomEndpoints;
    }

    /**
     * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
     **/
    public enum ConsumptionModel {
        Ucm("UCM"),
        Gov("GOV"),
        Vb4Saas("VB4SAAS"),
        ;

        private final String value;
        private static java.util.Map<String, ConsumptionModel> map;

        static {
            map = new java.util.HashMap<>();
            for (ConsumptionModel v : ConsumptionModel.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ConsumptionModel: " + key);
        }
    };
    /**
     * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
    private final ConsumptionModel consumptionModel;

    /**
     * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
     * @return the value
     **/
    public ConsumptionModel getConsumptionModel() {
        return consumptionModel;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateVbInstanceDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", idcsOpenId=").append(String.valueOf(this.idcsOpenId));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", isVisualBuilderEnabled=").append(String.valueOf(this.isVisualBuilderEnabled));
        sb.append(", customEndpoint=").append(String.valueOf(this.customEndpoint));
        sb.append(", alternateCustomEndpoints=")
                .append(String.valueOf(this.alternateCustomEndpoints));
        sb.append(", consumptionModel=").append(String.valueOf(this.consumptionModel));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVbInstanceDetails)) {
            return false;
        }

        CreateVbInstanceDetails other = (CreateVbInstanceDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.idcsOpenId, other.idcsOpenId)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(
                        this.isVisualBuilderEnabled, other.isVisualBuilderEnabled)
                && java.util.Objects.equals(this.customEndpoint, other.customEndpoint)
                && java.util.Objects.equals(
                        this.alternateCustomEndpoints, other.alternateCustomEndpoints)
                && java.util.Objects.equals(this.consumptionModel, other.consumptionModel)
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.idcsOpenId == null ? 43 : this.idcsOpenId.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
