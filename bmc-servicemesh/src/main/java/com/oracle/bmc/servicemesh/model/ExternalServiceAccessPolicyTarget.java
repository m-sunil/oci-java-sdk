/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * External service target that internal virtual services direct traffic to.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalServiceAccessPolicyTarget.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalServiceAccessPolicyTarget extends AccessPolicyTarget {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The hostnames of the external service. Only applicable for HTTP and HTTPS protocols.
         * Wildcard hostnames are supported in the prefix form.
         * Examples of valid hostnames are "www.example.com", "*.example.com", "*.com", "*".
         * Hostname "*" can be used to allow all hosts.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
        private java.util.List<String> hostnames;

        /**
         * The hostnames of the external service. Only applicable for HTTP and HTTPS protocols.
         * Wildcard hostnames are supported in the prefix form.
         * Examples of valid hostnames are "www.example.com", "*.example.com", "*.com", "*".
         * Hostname "*" can be used to allow all hosts.
         *
         * @param hostnames the value to set
         * @return this builder
         **/
        public Builder hostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            this.__explicitlySet__.add("hostnames");
            return this;
        }
        /**
         * The ipAddresses of the external service in CIDR notation. Only applicable for TCP protocol.
         * All requests matching the given CIDR notation will pass through.
         * In case a wildcard CIDR "0.0.0.0/0" is provided, the same port cannot be used for a virtual service communication.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
        private java.util.List<String> ipAddresses;

        /**
         * The ipAddresses of the external service in CIDR notation. Only applicable for TCP protocol.
         * All requests matching the given CIDR notation will pass through.
         * In case a wildcard CIDR "0.0.0.0/0" is provided, the same port cannot be used for a virtual service communication.
         *
         * @param ipAddresses the value to set
         * @return this builder
         **/
        public Builder ipAddresses(java.util.List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            this.__explicitlySet__.add("ipAddresses");
            return this;
        }
        /**
         * Ports exposed by an external service. If left empty all ports will be allowed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ports")
        private java.util.List<Integer> ports;

        /**
         * Ports exposed by an external service. If left empty all ports will be allowed.
         * @param ports the value to set
         * @return this builder
         **/
        public Builder ports(java.util.List<Integer> ports) {
            this.ports = ports;
            this.__explicitlySet__.add("ports");
            return this;
        }
        /**
         * Protocol of the external service
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        /**
         * Protocol of the external service
         * @param protocol the value to set
         * @return this builder
         **/
        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalServiceAccessPolicyTarget build() {
            ExternalServiceAccessPolicyTarget __instance__ =
                    new ExternalServiceAccessPolicyTarget(hostnames, ipAddresses, ports, protocol);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalServiceAccessPolicyTarget o) {
            Builder copiedBuilder =
                    hostnames(o.getHostnames())
                            .ipAddresses(o.getIpAddresses())
                            .ports(o.getPorts())
                            .protocol(o.getProtocol());

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

    @Deprecated
    public ExternalServiceAccessPolicyTarget(
            java.util.List<String> hostnames,
            java.util.List<String> ipAddresses,
            java.util.List<Integer> ports,
            Protocol protocol) {
        super();
        this.hostnames = hostnames;
        this.ipAddresses = ipAddresses;
        this.ports = ports;
        this.protocol = protocol;
    }

    /**
     * The hostnames of the external service. Only applicable for HTTP and HTTPS protocols.
     * Wildcard hostnames are supported in the prefix form.
     * Examples of valid hostnames are "www.example.com", "*.example.com", "*.com", "*".
     * Hostname "*" can be used to allow all hosts.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
    private final java.util.List<String> hostnames;

    /**
     * The hostnames of the external service. Only applicable for HTTP and HTTPS protocols.
     * Wildcard hostnames are supported in the prefix form.
     * Examples of valid hostnames are "www.example.com", "*.example.com", "*.com", "*".
     * Hostname "*" can be used to allow all hosts.
     *
     * @return the value
     **/
    public java.util.List<String> getHostnames() {
        return hostnames;
    }

    /**
     * The ipAddresses of the external service in CIDR notation. Only applicable for TCP protocol.
     * All requests matching the given CIDR notation will pass through.
     * In case a wildcard CIDR "0.0.0.0/0" is provided, the same port cannot be used for a virtual service communication.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
    private final java.util.List<String> ipAddresses;

    /**
     * The ipAddresses of the external service in CIDR notation. Only applicable for TCP protocol.
     * All requests matching the given CIDR notation will pass through.
     * In case a wildcard CIDR "0.0.0.0/0" is provided, the same port cannot be used for a virtual service communication.
     *
     * @return the value
     **/
    public java.util.List<String> getIpAddresses() {
        return ipAddresses;
    }

    /**
     * Ports exposed by an external service. If left empty all ports will be allowed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ports")
    private final java.util.List<Integer> ports;

    /**
     * Ports exposed by an external service. If left empty all ports will be allowed.
     * @return the value
     **/
    public java.util.List<Integer> getPorts() {
        return ports;
    }

    /**
     * Protocol of the external service
     **/
    public enum Protocol {
        Http("HTTP"),
        Https("HTTPS"),
        Tcp("TCP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Protocol.class);

        private final String value;
        private static java.util.Map<String, Protocol> map;

        static {
            map = new java.util.HashMap<>();
            for (Protocol v : Protocol.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Protocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Protocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Protocol', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Protocol of the external service
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Protocol protocol;

    /**
     * Protocol of the external service
     * @return the value
     **/
    public Protocol getProtocol() {
        return protocol;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExternalServiceAccessPolicyTarget(");
        sb.append("super=").append(super.toString());
        sb.append(", hostnames=").append(String.valueOf(this.hostnames));
        sb.append(", ipAddresses=").append(String.valueOf(this.ipAddresses));
        sb.append(", ports=").append(String.valueOf(this.ports));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalServiceAccessPolicyTarget)) {
            return false;
        }

        ExternalServiceAccessPolicyTarget other = (ExternalServiceAccessPolicyTarget) o;
        return java.util.Objects.equals(this.hostnames, other.hostnames)
                && java.util.Objects.equals(this.ipAddresses, other.ipAddresses)
                && java.util.Objects.equals(this.ports, other.ports)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.hostnames == null ? 43 : this.hostnames.hashCode());
        result = (result * PRIME) + (this.ipAddresses == null ? 43 : this.ipAddresses.hashCode());
        result = (result * PRIME) + (this.ports == null ? 43 : this.ports.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
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
