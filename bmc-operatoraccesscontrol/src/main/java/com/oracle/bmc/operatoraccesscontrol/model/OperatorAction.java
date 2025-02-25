/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Details of the operator action. Operator actions are a pre-defined set of commands available to the operator on different layers of the infrastructure. Although the groupings may differ depending on the infrastructure layers,
 * the groups are designed to enable the operator access to commands to resolve a specific set of issues. The infrastructure layers controlled by the Operator Control include Dom0, CellServer, and Control Plane Server (CPS).
 * <p>
 * There are five groups available to the operator. x-obmcs-top-level-enum: '#/definitions/OperatorActionCategories' enum: *OPERATORACTIONCATEGORIES
 * <p>
 * The following infrastructure layers are controlled by the operator actions x-obmcs-top-level-enum: '#/definitions/InfrastructureLayers' enum: *INFRASTRUCTURELAYERS
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OperatorAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OperatorAction {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "customerDisplayName",
        "component",
        "resourceType",
        "description",
        "properties"
    })
    public OperatorAction(
            String id,
            String name,
            String customerDisplayName,
            String component,
            ResourceTypes resourceType,
            String description,
            java.util.List<OperatorActionProperties> properties) {
        super();
        this.id = id;
        this.name = name;
        this.customerDisplayName = customerDisplayName;
        this.component = component;
        this.resourceType = resourceType;
        this.description = description;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique Oracle assigned identifier for the operator action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique Oracle assigned identifier for the operator action.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique name of the operator action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique name of the operator action.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Display Name of the operator action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerDisplayName")
        private String customerDisplayName;

        /**
         * Display Name of the operator action.
         * @param customerDisplayName the value to set
         * @return this builder
         **/
        public Builder customerDisplayName(String customerDisplayName) {
            this.customerDisplayName = customerDisplayName;
            this.__explicitlySet__.add("customerDisplayName");
            return this;
        }
        /**
         * Name of the infrastructure layer associated with the operator action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("component")
        private String component;

        /**
         * Name of the infrastructure layer associated with the operator action.
         * @param component the value to set
         * @return this builder
         **/
        public Builder component(String component) {
            this.component = component;
            this.__explicitlySet__.add("component");
            return this;
        }
        /**
         * resourceType for which the OperatorAction is applicable
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceTypes resourceType;

        /**
         * resourceType for which the OperatorAction is applicable
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(ResourceTypes resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * Description of the operator action in terms of associated risk profile, and characteristics of the operating system commands made
         * available to the operator under this operator action.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the operator action in terms of associated risk profile, and characteristics of the operating system commands made
         * available to the operator under this operator action.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Fine grained properties associated with the operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<OperatorActionProperties> properties;

        /**
         * Fine grained properties associated with the operator control.
         * @param properties the value to set
         * @return this builder
         **/
        public Builder properties(java.util.List<OperatorActionProperties> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperatorAction build() {
            OperatorAction __instance__ =
                    new OperatorAction(
                            id,
                            name,
                            customerDisplayName,
                            component,
                            resourceType,
                            description,
                            properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatorAction o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .customerDisplayName(o.getCustomerDisplayName())
                            .component(o.getComponent())
                            .resourceType(o.getResourceType())
                            .description(o.getDescription())
                            .properties(o.getProperties());

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
     * Unique Oracle assigned identifier for the operator action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique Oracle assigned identifier for the operator action.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Unique name of the operator action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique name of the operator action.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Display Name of the operator action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerDisplayName")
    private final String customerDisplayName;

    /**
     * Display Name of the operator action.
     * @return the value
     **/
    public String getCustomerDisplayName() {
        return customerDisplayName;
    }

    /**
     * Name of the infrastructure layer associated with the operator action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("component")
    private final String component;

    /**
     * Name of the infrastructure layer associated with the operator action.
     * @return the value
     **/
    public String getComponent() {
        return component;
    }

    /**
     * resourceType for which the OperatorAction is applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceTypes resourceType;

    /**
     * resourceType for which the OperatorAction is applicable
     * @return the value
     **/
    public ResourceTypes getResourceType() {
        return resourceType;
    }

    /**
     * Description of the operator action in terms of associated risk profile, and characteristics of the operating system commands made
     * available to the operator under this operator action.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the operator action in terms of associated risk profile, and characteristics of the operating system commands made
     * available to the operator under this operator action.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Fine grained properties associated with the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<OperatorActionProperties> properties;

    /**
     * Fine grained properties associated with the operator control.
     * @return the value
     **/
    public java.util.List<OperatorActionProperties> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OperatorAction(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", customerDisplayName=").append(String.valueOf(this.customerDisplayName));
        sb.append(", component=").append(String.valueOf(this.component));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperatorAction)) {
            return false;
        }

        OperatorAction other = (OperatorAction) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.customerDisplayName, other.customerDisplayName)
                && java.util.Objects.equals(this.component, other.component)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.customerDisplayName == null
                                ? 43
                                : this.customerDisplayName.hashCode());
        result = (result * PRIME) + (this.component == null ? 43 : this.component.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
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
