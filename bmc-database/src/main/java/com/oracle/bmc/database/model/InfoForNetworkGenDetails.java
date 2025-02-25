/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Parameters for generation of the client or backup network in a VM cluster network in an Exadata Cloud@Customer system.
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
    builder = InfoForNetworkGenDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InfoForNetworkGenDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "networkType",
        "vlanId",
        "cidr",
        "gateway",
        "netmask",
        "domain",
        "prefix"
    })
    public InfoForNetworkGenDetails(
            NetworkType networkType,
            String vlanId,
            String cidr,
            String gateway,
            String netmask,
            String domain,
            String prefix) {
        super();
        this.networkType = networkType;
        this.vlanId = vlanId;
        this.cidr = cidr;
        this.gateway = gateway;
        this.netmask = netmask;
        this.domain = domain;
        this.prefix = prefix;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The network type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkType")
        private NetworkType networkType;

        /**
         * The network type.
         * @param networkType the value to set
         * @return this builder
         **/
        public Builder networkType(NetworkType networkType) {
            this.networkType = networkType;
            this.__explicitlySet__.add("networkType");
            return this;
        }
        /**
         * The network VLAN ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        /**
         * The network VLAN ID.
         * @param vlanId the value to set
         * @return this builder
         **/
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
            return this;
        }
        /**
         * The cidr for the network.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cidr")
        private String cidr;

        /**
         * The cidr for the network.
         * @param cidr the value to set
         * @return this builder
         **/
        public Builder cidr(String cidr) {
            this.cidr = cidr;
            this.__explicitlySet__.add("cidr");
            return this;
        }
        /**
         * The network gateway.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gateway")
        private String gateway;

        /**
         * The network gateway.
         * @param gateway the value to set
         * @return this builder
         **/
        public Builder gateway(String gateway) {
            this.gateway = gateway;
            this.__explicitlySet__.add("gateway");
            return this;
        }
        /**
         * The network netmask.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("netmask")
        private String netmask;

        /**
         * The network netmask.
         * @param netmask the value to set
         * @return this builder
         **/
        public Builder netmask(String netmask) {
            this.netmask = netmask;
            this.__explicitlySet__.add("netmask");
            return this;
        }
        /**
         * The network domain name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * The network domain name.
         * @param domain the value to set
         * @return this builder
         **/
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * The network domain name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * The network domain name.
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InfoForNetworkGenDetails build() {
            InfoForNetworkGenDetails __instance__ =
                    new InfoForNetworkGenDetails(
                            networkType, vlanId, cidr, gateway, netmask, domain, prefix);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InfoForNetworkGenDetails o) {
            Builder copiedBuilder =
                    networkType(o.getNetworkType())
                            .vlanId(o.getVlanId())
                            .cidr(o.getCidr())
                            .gateway(o.getGateway())
                            .netmask(o.getNetmask())
                            .domain(o.getDomain())
                            .prefix(o.getPrefix());

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
     * The network type.
     **/
    public enum NetworkType {
        Client("CLIENT"),
        Backup("BACKUP"),
        ;

        private final String value;
        private static java.util.Map<String, NetworkType> map;

        static {
            map = new java.util.HashMap<>();
            for (NetworkType v : NetworkType.values()) {
                map.put(v.getValue(), v);
            }
        }

        NetworkType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NetworkType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid NetworkType: " + key);
        }
    };
    /**
     * The network type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkType")
    private final NetworkType networkType;

    /**
     * The network type.
     * @return the value
     **/
    public NetworkType getNetworkType() {
        return networkType;
    }

    /**
     * The network VLAN ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    private final String vlanId;

    /**
     * The network VLAN ID.
     * @return the value
     **/
    public String getVlanId() {
        return vlanId;
    }

    /**
     * The cidr for the network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidr")
    private final String cidr;

    /**
     * The cidr for the network.
     * @return the value
     **/
    public String getCidr() {
        return cidr;
    }

    /**
     * The network gateway.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gateway")
    private final String gateway;

    /**
     * The network gateway.
     * @return the value
     **/
    public String getGateway() {
        return gateway;
    }

    /**
     * The network netmask.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netmask")
    private final String netmask;

    /**
     * The network netmask.
     * @return the value
     **/
    public String getNetmask() {
        return netmask;
    }

    /**
     * The network domain name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * The network domain name.
     * @return the value
     **/
    public String getDomain() {
        return domain;
    }

    /**
     * The network domain name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * The network domain name.
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InfoForNetworkGenDetails(");
        sb.append("networkType=").append(String.valueOf(this.networkType));
        sb.append(", vlanId=").append(String.valueOf(this.vlanId));
        sb.append(", cidr=").append(String.valueOf(this.cidr));
        sb.append(", gateway=").append(String.valueOf(this.gateway));
        sb.append(", netmask=").append(String.valueOf(this.netmask));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InfoForNetworkGenDetails)) {
            return false;
        }

        InfoForNetworkGenDetails other = (InfoForNetworkGenDetails) o;
        return java.util.Objects.equals(this.networkType, other.networkType)
                && java.util.Objects.equals(this.vlanId, other.vlanId)
                && java.util.Objects.equals(this.cidr, other.cidr)
                && java.util.Objects.equals(this.gateway, other.gateway)
                && java.util.Objects.equals(this.netmask, other.netmask)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.networkType == null ? 43 : this.networkType.hashCode());
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        result = (result * PRIME) + (this.cidr == null ? 43 : this.cidr.hashCode());
        result = (result * PRIME) + (this.gateway == null ? 43 : this.gateway.hashCode());
        result = (result * PRIME) + (this.netmask == null ? 43 : this.netmask.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
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
