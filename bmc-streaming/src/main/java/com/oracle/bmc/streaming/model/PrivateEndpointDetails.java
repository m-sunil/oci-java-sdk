/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * Optional parameters if a private stream pool is requested.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PrivateEndpointDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PrivateEndpointDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"subnetId", "privateEndpointIp", "nsgIds"})
    public PrivateEndpointDetails(
            String subnetId, String privateEndpointIp, java.util.List<String> nsgIds) {
        super();
        this.subnetId = subnetId;
        this.privateEndpointIp = privateEndpointIp;
        this.nsgIds = nsgIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If specified, the stream pool will be private and only accessible from inside that subnet.
         * Producing-to and consuming-from a stream inside a private stream pool can also only be done from inside the subnet.
         * That value cannot be changed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * If specified, the stream pool will be private and only accessible from inside that subnet.
         * Producing-to and consuming-from a stream inside a private stream pool can also only be done from inside the subnet.
         * That value cannot be changed.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The optional private IP you want to be associated with your private stream pool.
         * That parameter can only be specified when the subnetId parameter is set. It cannot be changed.
         * The private IP needs to be part of the CIDR range of the specified subnetId or the creation will fail.
         * If not specified a random IP inside the subnet will be chosen.
         * After the stream pool is created, a custom FQDN, pointing to this private IP, is created.
         * The FQDN is then used to access the service instead of the private IP.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
        private String privateEndpointIp;

        /**
         * The optional private IP you want to be associated with your private stream pool.
         * That parameter can only be specified when the subnetId parameter is set. It cannot be changed.
         * The private IP needs to be part of the CIDR range of the specified subnetId or the creation will fail.
         * If not specified a random IP inside the subnet will be chosen.
         * After the stream pool is created, a custom FQDN, pointing to this private IP, is created.
         * The FQDN is then used to access the service instead of the private IP.
         *
         * @param privateEndpointIp the value to set
         * @return this builder
         **/
        public Builder privateEndpointIp(String privateEndpointIp) {
            this.privateEndpointIp = privateEndpointIp;
            this.__explicitlySet__.add("privateEndpointIp");
            return this;
        }
        /**
         * The optional list of network security groups to be used with the private endpoint of the stream pool.
         * That value cannot be changed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The optional list of network security groups to be used with the private endpoint of the stream pool.
         * That value cannot be changed.
         *
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateEndpointDetails build() {
            PrivateEndpointDetails __instance__ =
                    new PrivateEndpointDetails(subnetId, privateEndpointIp, nsgIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateEndpointDetails o) {
            Builder copiedBuilder =
                    subnetId(o.getSubnetId())
                            .privateEndpointIp(o.getPrivateEndpointIp())
                            .nsgIds(o.getNsgIds());

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
     * If specified, the stream pool will be private and only accessible from inside that subnet.
     * Producing-to and consuming-from a stream inside a private stream pool can also only be done from inside the subnet.
     * That value cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * If specified, the stream pool will be private and only accessible from inside that subnet.
     * Producing-to and consuming-from a stream inside a private stream pool can also only be done from inside the subnet.
     * That value cannot be changed.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The optional private IP you want to be associated with your private stream pool.
     * That parameter can only be specified when the subnetId parameter is set. It cannot be changed.
     * The private IP needs to be part of the CIDR range of the specified subnetId or the creation will fail.
     * If not specified a random IP inside the subnet will be chosen.
     * After the stream pool is created, a custom FQDN, pointing to this private IP, is created.
     * The FQDN is then used to access the service instead of the private IP.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
    private final String privateEndpointIp;

    /**
     * The optional private IP you want to be associated with your private stream pool.
     * That parameter can only be specified when the subnetId parameter is set. It cannot be changed.
     * The private IP needs to be part of the CIDR range of the specified subnetId or the creation will fail.
     * If not specified a random IP inside the subnet will be chosen.
     * After the stream pool is created, a custom FQDN, pointing to this private IP, is created.
     * The FQDN is then used to access the service instead of the private IP.
     *
     * @return the value
     **/
    public String getPrivateEndpointIp() {
        return privateEndpointIp;
    }

    /**
     * The optional list of network security groups to be used with the private endpoint of the stream pool.
     * That value cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The optional list of network security groups to be used with the private endpoint of the stream pool.
     * That value cannot be changed.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PrivateEndpointDetails(");
        sb.append("subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", privateEndpointIp=").append(String.valueOf(this.privateEndpointIp));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateEndpointDetails)) {
            return false;
        }

        PrivateEndpointDetails other = (PrivateEndpointDetails) o;
        return java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.privateEndpointIp, other.privateEndpointIp)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIp == null ? 43 : this.privateEndpointIp.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
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
