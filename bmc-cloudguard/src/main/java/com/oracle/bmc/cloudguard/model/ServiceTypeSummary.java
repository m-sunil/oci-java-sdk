/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Summary of Service type
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceTypeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceTypeSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "resourceTypes"})
    public ServiceTypeSummary(String name, java.util.List<ResourceTypeSummary> resourceTypes) {
        super();
        this.name = name;
        this.resourceTypes = resourceTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * name of the service type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * name of the service type
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * List of Resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypes")
        private java.util.List<ResourceTypeSummary> resourceTypes;

        /**
         * List of Resource
         * @param resourceTypes the value to set
         * @return this builder
         **/
        public Builder resourceTypes(java.util.List<ResourceTypeSummary> resourceTypes) {
            this.resourceTypes = resourceTypes;
            this.__explicitlySet__.add("resourceTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceTypeSummary build() {
            ServiceTypeSummary __instance__ = new ServiceTypeSummary(name, resourceTypes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceTypeSummary o) {
            Builder copiedBuilder = name(o.getName()).resourceTypes(o.getResourceTypes());

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
     * name of the service type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * name of the service type
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * List of Resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypes")
    private final java.util.List<ResourceTypeSummary> resourceTypes;

    /**
     * List of Resource
     * @return the value
     **/
    public java.util.List<ResourceTypeSummary> getResourceTypes() {
        return resourceTypes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ServiceTypeSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", resourceTypes=").append(String.valueOf(this.resourceTypes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceTypeSummary)) {
            return false;
        }

        ServiceTypeSummary other = (ServiceTypeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.resourceTypes, other.resourceTypes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypes == null ? 43 : this.resourceTypes.hashCode());
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
