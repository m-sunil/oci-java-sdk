/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
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
    builder = BulkMoveResourcesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkMoveResourcesDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"resources", "targetCompartmentId"})
    public BulkMoveResourcesDetails(
            java.util.List<BulkActionResource> resources, String targetCompartmentId) {
        super();
        this.resources = resources;
        this.targetCompartmentId = targetCompartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The resources to be moved.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<BulkActionResource> resources;

        /**
         * The resources to be moved.
         *
         * @param resources the value to set
         * @return this builder
         **/
        public Builder resources(java.util.List<BulkActionResource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the destination compartment
         * into which to move the resources.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
        private String targetCompartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the destination compartment
         * into which to move the resources.
         *
         * @param targetCompartmentId the value to set
         * @return this builder
         **/
        public Builder targetCompartmentId(String targetCompartmentId) {
            this.targetCompartmentId = targetCompartmentId;
            this.__explicitlySet__.add("targetCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkMoveResourcesDetails build() {
            BulkMoveResourcesDetails __instance__ =
                    new BulkMoveResourcesDetails(resources, targetCompartmentId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkMoveResourcesDetails o) {
            Builder copiedBuilder =
                    resources(o.getResources()).targetCompartmentId(o.getTargetCompartmentId());

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
     * The resources to be moved.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<BulkActionResource> resources;

    /**
     * The resources to be moved.
     *
     * @return the value
     **/
    public java.util.List<BulkActionResource> getResources() {
        return resources;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the destination compartment
     * into which to move the resources.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
    private final String targetCompartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the destination compartment
     * into which to move the resources.
     *
     * @return the value
     **/
    public String getTargetCompartmentId() {
        return targetCompartmentId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BulkMoveResourcesDetails(");
        sb.append("resources=").append(String.valueOf(this.resources));
        sb.append(", targetCompartmentId=").append(String.valueOf(this.targetCompartmentId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkMoveResourcesDetails)) {
            return false;
        }

        BulkMoveResourcesDetails other = (BulkMoveResourcesDetails) o;
        return java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.targetCompartmentId, other.targetCompartmentId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result =
                (result * PRIME)
                        + (this.targetCompartmentId == null
                                ? 43
                                : this.targetCompartmentId.hashCode());
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
