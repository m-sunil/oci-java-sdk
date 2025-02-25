/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of the proxy user.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProxyUserSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProxyUserSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "authentication", "flags"})
    public ProxyUserSummary(String name, Authentication authentication, Flags flags) {
        super();
        this.name = name;
        this.authentication = authentication;
        this.flags = flags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of a proxy user or the name of the client user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of a proxy user or the name of the client user.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Indicates whether the proxy is required to supply the client credentials (YES) or not (NO).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authentication")
        private Authentication authentication;

        /**
         * Indicates whether the proxy is required to supply the client credentials (YES) or not (NO).
         * @param authentication the value to set
         * @return this builder
         **/
        public Builder authentication(Authentication authentication) {
            this.authentication = authentication;
            this.__explicitlySet__.add("authentication");
            return this;
        }
        /**
         * The flags associated with the proxy/client pair.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("flags")
        private Flags flags;

        /**
         * The flags associated with the proxy/client pair.
         * @param flags the value to set
         * @return this builder
         **/
        public Builder flags(Flags flags) {
            this.flags = flags;
            this.__explicitlySet__.add("flags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProxyUserSummary build() {
            ProxyUserSummary __instance__ = new ProxyUserSummary(name, authentication, flags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProxyUserSummary o) {
            Builder copiedBuilder =
                    name(o.getName()).authentication(o.getAuthentication()).flags(o.getFlags());

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
     * The name of a proxy user or the name of the client user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of a proxy user or the name of the client user.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Indicates whether the proxy is required to supply the client credentials (YES) or not (NO).
     **/
    public enum Authentication {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Authentication.class);

        private final String value;
        private static java.util.Map<String, Authentication> map;

        static {
            map = new java.util.HashMap<>();
            for (Authentication v : Authentication.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Authentication(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Authentication create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Authentication', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the proxy is required to supply the client credentials (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    private final Authentication authentication;

    /**
     * Indicates whether the proxy is required to supply the client credentials (YES) or not (NO).
     * @return the value
     **/
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * The flags associated with the proxy/client pair.
     **/
    public enum Flags {
        ProxyMayActivateAllClientRoles("PROXY_MAY_ACTIVATE_ALL_CLIENT_ROLES"),
        NoClientRolesMayBeActivated("NO_CLIENT_ROLES_MAY_BE_ACTIVATED"),
        ProxyMayActivateRole("PROXY_MAY_ACTIVATE_ROLE"),
        ProxyMayNotActivateRole("PROXY_MAY_NOT_ACTIVATE_ROLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Flags.class);

        private final String value;
        private static java.util.Map<String, Flags> map;

        static {
            map = new java.util.HashMap<>();
            for (Flags v : Flags.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Flags(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Flags create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Flags', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The flags associated with the proxy/client pair.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flags")
    private final Flags flags;

    /**
     * The flags associated with the proxy/client pair.
     * @return the value
     **/
    public Flags getFlags() {
        return flags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProxyUserSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", authentication=").append(String.valueOf(this.authentication));
        sb.append(", flags=").append(String.valueOf(this.flags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProxyUserSummary)) {
            return false;
        }

        ProxyUserSummary other = (ProxyUserSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.authentication, other.authentication)
                && java.util.Objects.equals(this.flags, other.flags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.authentication == null ? 43 : this.authentication.hashCode());
        result = (result * PRIME) + (this.flags == null ? 43 : this.flags.hashCode());
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
