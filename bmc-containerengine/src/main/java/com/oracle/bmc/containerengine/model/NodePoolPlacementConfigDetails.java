/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The location where a node pool will place nodes.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NodePoolPlacementConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NodePoolPlacementConfigDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "subnetId",
        "capacityReservationId",
        "faultDomains"
    })
    public NodePoolPlacementConfigDetails(
            String availabilityDomain,
            String subnetId,
            String capacityReservationId,
            java.util.List<String> faultDomains) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.subnetId = subnetId;
        this.capacityReservationId = capacityReservationId;
        this.faultDomains = faultDomains;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain in which to place nodes.
         * Example: {@code Uocm:PHX-AD-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain in which to place nodes.
         * Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The OCID of the subnet in which to place nodes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet in which to place nodes.
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The OCID of the compute capacity reservation in which to place the compute instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The OCID of the compute capacity reservation in which to place the compute instance.
         * @param capacityReservationId the value to set
         * @return this builder
         **/
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
            return this;
        }
        /**
         * A list of fault domains in which to place nodes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
        private java.util.List<String> faultDomains;

        /**
         * A list of fault domains in which to place nodes.
         *
         * @param faultDomains the value to set
         * @return this builder
         **/
        public Builder faultDomains(java.util.List<String> faultDomains) {
            this.faultDomains = faultDomains;
            this.__explicitlySet__.add("faultDomains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodePoolPlacementConfigDetails build() {
            NodePoolPlacementConfigDetails __instance__ =
                    new NodePoolPlacementConfigDetails(
                            availabilityDomain, subnetId, capacityReservationId, faultDomains);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodePoolPlacementConfigDetails o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .subnetId(o.getSubnetId())
                            .capacityReservationId(o.getCapacityReservationId())
                            .faultDomains(o.getFaultDomains());

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
     * The availability domain in which to place nodes.
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain in which to place nodes.
     * Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the subnet in which to place nodes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet in which to place nodes.
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The OCID of the compute capacity reservation in which to place the compute instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The OCID of the compute capacity reservation in which to place the compute instance.
     * @return the value
     **/
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * A list of fault domains in which to place nodes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
    private final java.util.List<String> faultDomains;

    /**
     * A list of fault domains in which to place nodes.
     *
     * @return the value
     **/
    public java.util.List<String> getFaultDomains() {
        return faultDomains;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NodePoolPlacementConfigDetails(");
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", faultDomains=").append(String.valueOf(this.faultDomains));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodePoolPlacementConfigDetails)) {
            return false;
        }

        NodePoolPlacementConfigDetails other = (NodePoolPlacementConfigDetails) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.faultDomains, other.faultDomains)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityReservationId == null
                                ? 43
                                : this.capacityReservationId.hashCode());
        result = (result * PRIME) + (this.faultDomains == null ? 43 : this.faultDomains.hashCode());
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
