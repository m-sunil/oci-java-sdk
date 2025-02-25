/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Input payload to update a Private Access Channel.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdatePrivateAccessChannelDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdatePrivateAccessChannelDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "vcnId", "subnetId", "privateSourceDnsZones"})
    public UpdatePrivateAccessChannelDetails(
            String displayName,
            String vcnId,
            String subnetId,
            java.util.List<PrivateSourceDnsZone> privateSourceDnsZones) {
        super();
        this.displayName = displayName;
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.privateSourceDnsZones = privateSourceDnsZones;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Display Name of the Private Access Channel.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display Name of the Private Access Channel.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * OCID of the customer VCN peered with private access channel.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * OCID of the customer VCN peered with private access channel.
         *
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * OCID of the customer subnet connected to private access channel.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * OCID of the customer subnet connected to private access channel.
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
         * List of Private Source DNS zones registered with Private Access Channel,
         * where datasource hostnames from these dns zones / domains will be resolved in the peered VCN for access from Analytics Instance.
         * Min of 1 is required and Max of 30 Private Source DNS zones can be registered.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateSourceDnsZones")
        private java.util.List<PrivateSourceDnsZone> privateSourceDnsZones;

        /**
         * List of Private Source DNS zones registered with Private Access Channel,
         * where datasource hostnames from these dns zones / domains will be resolved in the peered VCN for access from Analytics Instance.
         * Min of 1 is required and Max of 30 Private Source DNS zones can be registered.
         *
         * @param privateSourceDnsZones the value to set
         * @return this builder
         **/
        public Builder privateSourceDnsZones(
                java.util.List<PrivateSourceDnsZone> privateSourceDnsZones) {
            this.privateSourceDnsZones = privateSourceDnsZones;
            this.__explicitlySet__.add("privateSourceDnsZones");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePrivateAccessChannelDetails build() {
            UpdatePrivateAccessChannelDetails __instance__ =
                    new UpdatePrivateAccessChannelDetails(
                            displayName, vcnId, subnetId, privateSourceDnsZones);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePrivateAccessChannelDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .vcnId(o.getVcnId())
                            .subnetId(o.getSubnetId())
                            .privateSourceDnsZones(o.getPrivateSourceDnsZones());

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
     * Display Name of the Private Access Channel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display Name of the Private Access Channel.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * OCID of the customer VCN peered with private access channel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * OCID of the customer VCN peered with private access channel.
     *
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    /**
     * OCID of the customer subnet connected to private access channel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * OCID of the customer subnet connected to private access channel.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * List of Private Source DNS zones registered with Private Access Channel,
     * where datasource hostnames from these dns zones / domains will be resolved in the peered VCN for access from Analytics Instance.
     * Min of 1 is required and Max of 30 Private Source DNS zones can be registered.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateSourceDnsZones")
    private final java.util.List<PrivateSourceDnsZone> privateSourceDnsZones;

    /**
     * List of Private Source DNS zones registered with Private Access Channel,
     * where datasource hostnames from these dns zones / domains will be resolved in the peered VCN for access from Analytics Instance.
     * Min of 1 is required and Max of 30 Private Source DNS zones can be registered.
     *
     * @return the value
     **/
    public java.util.List<PrivateSourceDnsZone> getPrivateSourceDnsZones() {
        return privateSourceDnsZones;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdatePrivateAccessChannelDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", privateSourceDnsZones=").append(String.valueOf(this.privateSourceDnsZones));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePrivateAccessChannelDetails)) {
            return false;
        }

        UpdatePrivateAccessChannelDetails other = (UpdatePrivateAccessChannelDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.privateSourceDnsZones, other.privateSourceDnsZones)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateSourceDnsZones == null
                                ? 43
                                : this.privateSourceDnsZones.hashCode());
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
