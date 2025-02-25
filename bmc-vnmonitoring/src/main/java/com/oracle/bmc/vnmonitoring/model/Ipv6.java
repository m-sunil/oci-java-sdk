/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * An *IPv6* is a conceptual term that refers to an IPv6 address and related properties.
 * The {@code IPv6} object is the API representation of an IPv6.
 * <p>
 * You can create and assign an IPv6 to any VNIC that is in an IPv6-enabled subnet in an
 * IPv6-enabled VCN.
 * <p>
 **Note:** IPv6 addressing is supported for all commercial and government regions. For important
 * details about IPv6 addressing in a VCN, see [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Ipv6.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Ipv6 {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "ipAddress",
        "isInternetAccessAllowed",
        "lifecycleState",
        "publicIpAddress",
        "subnetId",
        "timeCreated",
        "vnicId"
    })
    public Ipv6(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            String ipAddress,
            Boolean isInternetAccessAllowed,
            LifecycleState lifecycleState,
            String publicIpAddress,
            String subnetId,
            java.util.Date timeCreated,
            String vnicId) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.ipAddress = ipAddress;
        this.isInternetAccessAllowed = isInternetAccessAllowed;
        this.lifecycleState = lifecycleState;
        this.publicIpAddress = publicIpAddress;
        this.subnetId = subnetId;
        this.timeCreated = timeCreated;
        this.vnicId = vnicId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the IPv6.
         * This is the same as the VNIC's compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the IPv6.
         * This is the same as the VNIC's compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
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
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPv6.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPv6.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The IPv6 address of the {@code IPv6} object. The address is within the IPv6 CIDR block
         * of the VNIC's subnet (see the {@code ipv6CidrBlock} attribute for the {@link Subnet}
         * object.
         * <p>
         * Example: {@code 2001:0db8:0123:1111:abcd:ef01:2345:6789}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IPv6 address of the {@code IPv6} object. The address is within the IPv6 CIDR block
         * of the VNIC's subnet (see the {@code ipv6CidrBlock} attribute for the {@link Subnet}
         * object.
         * <p>
         * Example: {@code 2001:0db8:0123:1111:abcd:ef01:2345:6789}
         *
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * Whether the IPv6 can be used for internet communication. Allowed by default for an IPv6 in
         * a public subnet. Never allowed for an IPv6 in a private subnet. If the value is {@code true}, the
         * IPv6 uses its public IP address for internet communication.
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isInternetAccessAllowed")
        private Boolean isInternetAccessAllowed;

        /**
         * Whether the IPv6 can be used for internet communication. Allowed by default for an IPv6 in
         * a public subnet. Never allowed for an IPv6 in a private subnet. If the value is {@code true}, the
         * IPv6 uses its public IP address for internet communication.
         * <p>
         * Example: {@code true}
         *
         * @param isInternetAccessAllowed the value to set
         * @return this builder
         **/
        public Builder isInternetAccessAllowed(Boolean isInternetAccessAllowed) {
            this.isInternetAccessAllowed = isInternetAccessAllowed;
            this.__explicitlySet__.add("isInternetAccessAllowed");
            return this;
        }
        /**
         * The IPv6's current state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The IPv6's current state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The IPv6 address to be used for internet communication. The address is within the
         * IPv6 CIDR block of the VNIC's subnet (see the {@code ipv6PublicCidrBlock} attribute for the
         * {@link Subnet} object).
         * <p>
         * If your organization did NOT assign a custom IPv6 CIDR to the VCN for the private address
         * space, Oracle provides the IPv6 CIDR and uses that same CIDR for the private and public
         * address space. Therefore the {@code publicIpAddress} would be the same as the {@code ipAddress}.
         * <p>
         * If your organization assigned a custom IPv6 CIDR to the VCN for the address space,
         * the right 80 bits of the IPv6 IP (the subnet and address bits) are the same as for
         * the {@code ipAddress}. But the left 48 bits are from the IPv6 CIDR that Oracle assigned
         * to the VCN.
         * <p>
         * This is null if the IPv6 is created with {@code isInternetAccessAllowed} set to {@code false}.
         * <p>
         * Example: {@code 2001:0db8:0123:1111:abcd:ef01:2345:6789}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicIpAddress")
        private String publicIpAddress;

        /**
         * The IPv6 address to be used for internet communication. The address is within the
         * IPv6 CIDR block of the VNIC's subnet (see the {@code ipv6PublicCidrBlock} attribute for the
         * {@link Subnet} object).
         * <p>
         * If your organization did NOT assign a custom IPv6 CIDR to the VCN for the private address
         * space, Oracle provides the IPv6 CIDR and uses that same CIDR for the private and public
         * address space. Therefore the {@code publicIpAddress} would be the same as the {@code ipAddress}.
         * <p>
         * If your organization assigned a custom IPv6 CIDR to the VCN for the address space,
         * the right 80 bits of the IPv6 IP (the subnet and address bits) are the same as for
         * the {@code ipAddress}. But the left 48 bits are from the IPv6 CIDR that Oracle assigned
         * to the VCN.
         * <p>
         * This is null if the IPv6 is created with {@code isInternetAccessAllowed} set to {@code false}.
         * <p>
         * Example: {@code 2001:0db8:0123:1111:abcd:ef01:2345:6789}
         *
         * @param publicIpAddress the value to set
         * @return this builder
         **/
        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            this.__explicitlySet__.add("publicIpAddress");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the VNIC is in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the VNIC is in.
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The date and time the IPv6 was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the IPv6 was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC the IPv6 is assigned to.
         * The VNIC and IPv6 must be in the same subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC the IPv6 is assigned to.
         * The VNIC and IPv6 must be in the same subnet.
         *
         * @param vnicId the value to set
         * @return this builder
         **/
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Ipv6 build() {
            Ipv6 __instance__ =
                    new Ipv6(
                            compartmentId,
                            definedTags,
                            displayName,
                            freeformTags,
                            id,
                            ipAddress,
                            isInternetAccessAllowed,
                            lifecycleState,
                            publicIpAddress,
                            subnetId,
                            timeCreated,
                            vnicId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Ipv6 o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .ipAddress(o.getIpAddress())
                            .isInternetAccessAllowed(o.getIsInternetAccessAllowed())
                            .lifecycleState(o.getLifecycleState())
                            .publicIpAddress(o.getPublicIpAddress())
                            .subnetId(o.getSubnetId())
                            .timeCreated(o.getTimeCreated())
                            .vnicId(o.getVnicId());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the IPv6.
     * This is the same as the VNIC's compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the IPv6.
     * This is the same as the VNIC's compartment.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPv6.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPv6.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The IPv6 address of the {@code IPv6} object. The address is within the IPv6 CIDR block
     * of the VNIC's subnet (see the {@code ipv6CidrBlock} attribute for the {@link Subnet}
     * object.
     * <p>
     * Example: {@code 2001:0db8:0123:1111:abcd:ef01:2345:6789}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IPv6 address of the {@code IPv6} object. The address is within the IPv6 CIDR block
     * of the VNIC's subnet (see the {@code ipv6CidrBlock} attribute for the {@link Subnet}
     * object.
     * <p>
     * Example: {@code 2001:0db8:0123:1111:abcd:ef01:2345:6789}
     *
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Whether the IPv6 can be used for internet communication. Allowed by default for an IPv6 in
     * a public subnet. Never allowed for an IPv6 in a private subnet. If the value is {@code true}, the
     * IPv6 uses its public IP address for internet communication.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInternetAccessAllowed")
    private final Boolean isInternetAccessAllowed;

    /**
     * Whether the IPv6 can be used for internet communication. Allowed by default for an IPv6 in
     * a public subnet. Never allowed for an IPv6 in a private subnet. If the value is {@code true}, the
     * IPv6 uses its public IP address for internet communication.
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getIsInternetAccessAllowed() {
        return isInternetAccessAllowed;
    }

    /**
     * The IPv6's current state.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
    /**
     * The IPv6's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The IPv6's current state.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The IPv6 address to be used for internet communication. The address is within the
     * IPv6 CIDR block of the VNIC's subnet (see the {@code ipv6PublicCidrBlock} attribute for the
     * {@link Subnet} object).
     * <p>
     * If your organization did NOT assign a custom IPv6 CIDR to the VCN for the private address
     * space, Oracle provides the IPv6 CIDR and uses that same CIDR for the private and public
     * address space. Therefore the {@code publicIpAddress} would be the same as the {@code ipAddress}.
     * <p>
     * If your organization assigned a custom IPv6 CIDR to the VCN for the address space,
     * the right 80 bits of the IPv6 IP (the subnet and address bits) are the same as for
     * the {@code ipAddress}. But the left 48 bits are from the IPv6 CIDR that Oracle assigned
     * to the VCN.
     * <p>
     * This is null if the IPv6 is created with {@code isInternetAccessAllowed} set to {@code false}.
     * <p>
     * Example: {@code 2001:0db8:0123:1111:abcd:ef01:2345:6789}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicIpAddress")
    private final String publicIpAddress;

    /**
     * The IPv6 address to be used for internet communication. The address is within the
     * IPv6 CIDR block of the VNIC's subnet (see the {@code ipv6PublicCidrBlock} attribute for the
     * {@link Subnet} object).
     * <p>
     * If your organization did NOT assign a custom IPv6 CIDR to the VCN for the private address
     * space, Oracle provides the IPv6 CIDR and uses that same CIDR for the private and public
     * address space. Therefore the {@code publicIpAddress} would be the same as the {@code ipAddress}.
     * <p>
     * If your organization assigned a custom IPv6 CIDR to the VCN for the address space,
     * the right 80 bits of the IPv6 IP (the subnet and address bits) are the same as for
     * the {@code ipAddress}. But the left 48 bits are from the IPv6 CIDR that Oracle assigned
     * to the VCN.
     * <p>
     * This is null if the IPv6 is created with {@code isInternetAccessAllowed} set to {@code false}.
     * <p>
     * Example: {@code 2001:0db8:0123:1111:abcd:ef01:2345:6789}
     *
     * @return the value
     **/
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the VNIC is in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the VNIC is in.
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The date and time the IPv6 was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the IPv6 was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC the IPv6 is assigned to.
     * The VNIC and IPv6 must be in the same subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC the IPv6 is assigned to.
     * The VNIC and IPv6 must be in the same subnet.
     *
     * @return the value
     **/
    public String getVnicId() {
        return vnicId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Ipv6(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", isInternetAccessAllowed=")
                .append(String.valueOf(this.isInternetAccessAllowed));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", publicIpAddress=").append(String.valueOf(this.publicIpAddress));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", vnicId=").append(String.valueOf(this.vnicId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ipv6)) {
            return false;
        }

        Ipv6 other = (Ipv6) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(
                        this.isInternetAccessAllowed, other.isInternetAccessAllowed)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.publicIpAddress, other.publicIpAddress)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.isInternetAccessAllowed == null
                                ? 43
                                : this.isInternetAccessAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.publicIpAddress == null ? 43 : this.publicIpAddress.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
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
