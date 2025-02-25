/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Virtual Cloud Network definition.
 *
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
    builder = VirtualCloudNetwork.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VirtualCloudNetwork {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "allowlistedIps"})
    public VirtualCloudNetwork(String id, java.util.List<String> allowlistedIps) {
        super();
        this.id = id;
        this.allowlistedIps = allowlistedIps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Virtual Cloud Network OCID.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Virtual Cloud Network OCID.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Source IP addresses or IP address ranges ingress rules.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowlistedIps")
        private java.util.List<String> allowlistedIps;

        /**
         * Source IP addresses or IP address ranges ingress rules.
         *
         * @param allowlistedIps the value to set
         * @return this builder
         **/
        public Builder allowlistedIps(java.util.List<String> allowlistedIps) {
            this.allowlistedIps = allowlistedIps;
            this.__explicitlySet__.add("allowlistedIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCloudNetwork build() {
            VirtualCloudNetwork __instance__ = new VirtualCloudNetwork(id, allowlistedIps);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCloudNetwork o) {
            Builder copiedBuilder = id(o.getId()).allowlistedIps(o.getAllowlistedIps());

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
     * The Virtual Cloud Network OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Virtual Cloud Network OCID.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Source IP addresses or IP address ranges ingress rules.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowlistedIps")
    private final java.util.List<String> allowlistedIps;

    /**
     * Source IP addresses or IP address ranges ingress rules.
     *
     * @return the value
     **/
    public java.util.List<String> getAllowlistedIps() {
        return allowlistedIps;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VirtualCloudNetwork(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", allowlistedIps=").append(String.valueOf(this.allowlistedIps));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualCloudNetwork)) {
            return false;
        }

        VirtualCloudNetwork other = (VirtualCloudNetwork) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.allowlistedIps, other.allowlistedIps)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.allowlistedIps == null ? 43 : this.allowlistedIps.hashCode());
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
