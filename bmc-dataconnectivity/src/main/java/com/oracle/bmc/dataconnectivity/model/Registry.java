/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * A registry is an organizational construct to keep multiple data Connectivity Management solutions and their resources (data assets, data flows, tasks, and so on) separate from each other, helping you to stay organized. For example, you could have separate registries for development, testing, and production.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Registry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Registry {
    @Deprecated
    @java.beans.ConstructorProperties({
        "freeformTags",
        "definedTags",
        "description",
        "displayName",
        "updatedBy",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "stateMessage",
        "id"
    })
    public Registry(
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String description,
            String displayName,
            String updatedBy,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String stateMessage,
            String id) {
        super();
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.updatedBy = updatedBy;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.stateMessage = stateMessage;
        this.id = id;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
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
         * Registry description
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Registry description
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Data Connectivity Management Registry display name, registries can be renamed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Data Connectivity Management Registry display name, registries can be renamed
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Name of the user who updated the DCMS Registry.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        /**
         * Name of the user who updated the DCMS Registry.
         * @param updatedBy the value to set
         * @return this builder
         **/
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }
        /**
         * Compartment Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The time the Data Connectivity Management Registry was created. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the Data Connectivity Management Registry was created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the Data Connectivity Management Registry was updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Data Connectivity Management Registry was updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Lifecycle states for registries in Data Connectivity Management Service
         * CREATING - The resource is being created and may not be usable until the entire metadata is defined
         * UPDATING - The resource is being updated and may not be usable until all changes are commited
         * DELETING - The resource is being deleted and might require deep cleanup of children.
         * ACTIVE   - The resource is valid and available for access
         * INACTIVE - The resource might be incomplete in its definition or might have been made unavailable for
         *          administrative reasons
         * DELETED  - The resource has been deleted and isn't available
         * FAILED   - The resource is in a failed state due to validation or other errors
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle states for registries in Data Connectivity Management Service
         * CREATING - The resource is being created and may not be usable until the entire metadata is defined
         * UPDATING - The resource is being updated and may not be usable until all changes are commited
         * DELETING - The resource is being deleted and might require deep cleanup of children.
         * ACTIVE   - The resource is valid and available for access
         * INACTIVE - The resource might be incomplete in its definition or might have been made unavailable for
         *          administrative reasons
         * DELETED  - The resource has been deleted and isn't available
         * FAILED   - The resource is in a failed state due to validation or other errors
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
        private String stateMessage;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param stateMessage the value to set
         * @return this builder
         **/
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = stateMessage;
            this.__explicitlySet__.add("stateMessage");
            return this;
        }
        /**
         * Unique identifier that is immutable on creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Registry build() {
            Registry __instance__ =
                    new Registry(
                            freeformTags,
                            definedTags,
                            description,
                            displayName,
                            updatedBy,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            stateMessage,
                            id);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Registry o) {
            Builder copiedBuilder =
                    freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .updatedBy(o.getUpdatedBy())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .stateMessage(o.getStateMessage())
                            .id(o.getId());

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
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Registry description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Registry description
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Data Connectivity Management Registry display name, registries can be renamed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Data Connectivity Management Registry display name, registries can be renamed
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Name of the user who updated the DCMS Registry.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

    /**
     * Name of the user who updated the DCMS Registry.
     * @return the value
     **/
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The time the Data Connectivity Management Registry was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Data Connectivity Management Registry was created. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the Data Connectivity Management Registry was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Data Connectivity Management Registry was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Lifecycle states for registries in Data Connectivity Management Service
     * CREATING - The resource is being created and may not be usable until the entire metadata is defined
     * UPDATING - The resource is being updated and may not be usable until all changes are commited
     * DELETING - The resource is being deleted and might require deep cleanup of children.
     * ACTIVE   - The resource is valid and available for access
     * INACTIVE - The resource might be incomplete in its definition or might have been made unavailable for
     *          administrative reasons
     * DELETED  - The resource has been deleted and isn't available
     * FAILED   - The resource is in a failed state due to validation or other errors
     *
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
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
     * Lifecycle states for registries in Data Connectivity Management Service
     * CREATING - The resource is being created and may not be usable until the entire metadata is defined
     * UPDATING - The resource is being updated and may not be usable until all changes are commited
     * DELETING - The resource is being deleted and might require deep cleanup of children.
     * ACTIVE   - The resource is valid and available for access
     * INACTIVE - The resource might be incomplete in its definition or might have been made unavailable for
     *          administrative reasons
     * DELETED  - The resource has been deleted and isn't available
     * FAILED   - The resource is in a failed state due to validation or other errors
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle states for registries in Data Connectivity Management Service
     * CREATING - The resource is being created and may not be usable until the entire metadata is defined
     * UPDATING - The resource is being updated and may not be usable until all changes are commited
     * DELETING - The resource is being deleted and might require deep cleanup of children.
     * ACTIVE   - The resource is valid and available for access
     * INACTIVE - The resource might be incomplete in its definition or might have been made unavailable for
     *          administrative reasons
     * DELETED  - The resource has been deleted and isn't available
     * FAILED   - The resource is in a failed state due to validation or other errors
     *
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    private final String stateMessage;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getStateMessage() {
        return stateMessage;
    }

    /**
     * Unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Registry(");
        sb.append("freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", stateMessage=").append(String.valueOf(this.stateMessage));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Registry)) {
            return false;
        }

        Registry other = (Registry) o;
        return java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.updatedBy, other.updatedBy)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.stateMessage, other.stateMessage)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
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
