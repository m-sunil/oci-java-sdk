/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * The contract guiding the import experience for the consumer and behavior of the resource provider for a single resourceType.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceTypeImportContract.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceTypeImportContract {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceType", "parameters"})
    public ResourceTypeImportContract(
            String resourceType, java.util.List<ParameterDefinition> parameters) {
        super();
        this.resourceType = resourceType;
        this.parameters = parameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of resource to which this resourceType-specific contract applies
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The type of resource to which this resourceType-specific contract applies
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * A list of definitions for parameters that are required to import this package into a target instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<ParameterDefinition> parameters;

        /**
         * A list of definitions for parameters that are required to import this package into a target instance.
         * @param parameters the value to set
         * @return this builder
         **/
        public Builder parameters(java.util.List<ParameterDefinition> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceTypeImportContract build() {
            ResourceTypeImportContract __instance__ =
                    new ResourceTypeImportContract(resourceType, parameters);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceTypeImportContract o) {
            Builder copiedBuilder = resourceType(o.getResourceType()).parameters(o.getParameters());

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
     * The type of resource to which this resourceType-specific contract applies
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The type of resource to which this resourceType-specific contract applies
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    /**
     * A list of definitions for parameters that are required to import this package into a target instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<ParameterDefinition> parameters;

    /**
     * A list of definitions for parameters that are required to import this package into a target instance.
     * @return the value
     **/
    public java.util.List<ParameterDefinition> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceTypeImportContract(");
        sb.append("resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceTypeImportContract)) {
            return false;
        }

        ResourceTypeImportContract other = (ResourceTypeImportContract) o;
        return java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
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
