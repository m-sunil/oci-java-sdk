/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * NFS export options applied to a specified set of
 * clients. Only governs access through the associated
 * export. Access to the same file system through a different
 * export (on the same or different mount target) will be governed
 * by that export's export options.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClientOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClientOptions {
    @Deprecated
    @java.beans.ConstructorProperties({
        "source",
        "requirePrivilegedSourcePort",
        "access",
        "identitySquash",
        "anonymousUid",
        "anonymousGid"
    })
    public ClientOptions(
            String source,
            Boolean requirePrivilegedSourcePort,
            Access access,
            IdentitySquash identitySquash,
            Long anonymousUid,
            Long anonymousGid) {
        super();
        this.source = source;
        this.requirePrivilegedSourcePort = requirePrivilegedSourcePort;
        this.access = access;
        this.identitySquash = identitySquash;
        this.anonymousUid = anonymousUid;
        this.anonymousGid = anonymousGid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Clients these options should apply to. Must be a either
         * single IPv4 address or single IPv4 CIDR block.
         * <p>
         **Note:** Access will also be limited by any applicable VCN
         * security rules and the ability to route IP packets to the
         * mount target. Mount targets do not have Internet-routable IP addresses.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        /**
         * Clients these options should apply to. Must be a either
         * single IPv4 address or single IPv4 CIDR block.
         * <p>
         **Note:** Access will also be limited by any applicable VCN
         * security rules and the ability to route IP packets to the
         * mount target. Mount targets do not have Internet-routable IP addresses.
         *
         * @param source the value to set
         * @return this builder
         **/
        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /**
         * If {@code true}, clients accessing the file system through this
         * export must connect from a privileged source port. If
         * unspecified, defaults to {@code true}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requirePrivilegedSourcePort")
        private Boolean requirePrivilegedSourcePort;

        /**
         * If {@code true}, clients accessing the file system through this
         * export must connect from a privileged source port. If
         * unspecified, defaults to {@code true}.
         *
         * @param requirePrivilegedSourcePort the value to set
         * @return this builder
         **/
        public Builder requirePrivilegedSourcePort(Boolean requirePrivilegedSourcePort) {
            this.requirePrivilegedSourcePort = requirePrivilegedSourcePort;
            this.__explicitlySet__.add("requirePrivilegedSourcePort");
            return this;
        }
        /**
         * Type of access to grant clients using the file system
         * through this export. If unspecified defaults to {@code READ_ONLY}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("access")
        private Access access;

        /**
         * Type of access to grant clients using the file system
         * through this export. If unspecified defaults to {@code READ_ONLY}.
         *
         * @param access the value to set
         * @return this builder
         **/
        public Builder access(Access access) {
            this.access = access;
            this.__explicitlySet__.add("access");
            return this;
        }
        /**
         * Used when clients accessing the file system through this export
         * have their UID and GID remapped to 'anonymousUid' and
         * 'anonymousGid'. If {@code ALL}, all users and groups are remapped;
         * if {@code ROOT}, only the root user and group (UID/GID 0) are
         * remapped; if {@code NONE}, no remapping is done. If unspecified,
         * defaults to {@code ROOT}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identitySquash")
        private IdentitySquash identitySquash;

        /**
         * Used when clients accessing the file system through this export
         * have their UID and GID remapped to 'anonymousUid' and
         * 'anonymousGid'. If {@code ALL}, all users and groups are remapped;
         * if {@code ROOT}, only the root user and group (UID/GID 0) are
         * remapped; if {@code NONE}, no remapping is done. If unspecified,
         * defaults to {@code ROOT}.
         *
         * @param identitySquash the value to set
         * @return this builder
         **/
        public Builder identitySquash(IdentitySquash identitySquash) {
            this.identitySquash = identitySquash;
            this.__explicitlySet__.add("identitySquash");
            return this;
        }
        /**
         * UID value to remap to when squashing a client UID (see
         * identitySquash for more details.) If unspecified, defaults
         * to {@code 65534}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("anonymousUid")
        private Long anonymousUid;

        /**
         * UID value to remap to when squashing a client UID (see
         * identitySquash for more details.) If unspecified, defaults
         * to {@code 65534}.
         *
         * @param anonymousUid the value to set
         * @return this builder
         **/
        public Builder anonymousUid(Long anonymousUid) {
            this.anonymousUid = anonymousUid;
            this.__explicitlySet__.add("anonymousUid");
            return this;
        }
        /**
         * GID value to remap to when squashing a client GID (see
         * identitySquash for more details.) If unspecified defaults
         * to {@code 65534}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("anonymousGid")
        private Long anonymousGid;

        /**
         * GID value to remap to when squashing a client GID (see
         * identitySquash for more details.) If unspecified defaults
         * to {@code 65534}.
         *
         * @param anonymousGid the value to set
         * @return this builder
         **/
        public Builder anonymousGid(Long anonymousGid) {
            this.anonymousGid = anonymousGid;
            this.__explicitlySet__.add("anonymousGid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClientOptions build() {
            ClientOptions __instance__ =
                    new ClientOptions(
                            source,
                            requirePrivilegedSourcePort,
                            access,
                            identitySquash,
                            anonymousUid,
                            anonymousGid);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClientOptions o) {
            Builder copiedBuilder =
                    source(o.getSource())
                            .requirePrivilegedSourcePort(o.getRequirePrivilegedSourcePort())
                            .access(o.getAccess())
                            .identitySquash(o.getIdentitySquash())
                            .anonymousUid(o.getAnonymousUid())
                            .anonymousGid(o.getAnonymousGid());

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
     * Clients these options should apply to. Must be a either
     * single IPv4 address or single IPv4 CIDR block.
     * <p>
     **Note:** Access will also be limited by any applicable VCN
     * security rules and the ability to route IP packets to the
     * mount target. Mount targets do not have Internet-routable IP addresses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * Clients these options should apply to. Must be a either
     * single IPv4 address or single IPv4 CIDR block.
     * <p>
     **Note:** Access will also be limited by any applicable VCN
     * security rules and the ability to route IP packets to the
     * mount target. Mount targets do not have Internet-routable IP addresses.
     *
     * @return the value
     **/
    public String getSource() {
        return source;
    }

    /**
     * If {@code true}, clients accessing the file system through this
     * export must connect from a privileged source port. If
     * unspecified, defaults to {@code true}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requirePrivilegedSourcePort")
    private final Boolean requirePrivilegedSourcePort;

    /**
     * If {@code true}, clients accessing the file system through this
     * export must connect from a privileged source port. If
     * unspecified, defaults to {@code true}.
     *
     * @return the value
     **/
    public Boolean getRequirePrivilegedSourcePort() {
        return requirePrivilegedSourcePort;
    }

    /**
     * Type of access to grant clients using the file system
     * through this export. If unspecified defaults to {@code READ_ONLY}.
     *
     **/
    public enum Access {
        ReadWrite("READ_WRITE"),
        ReadOnly("READ_ONLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Access.class);

        private final String value;
        private static java.util.Map<String, Access> map;

        static {
            map = new java.util.HashMap<>();
            for (Access v : Access.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Access(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Access create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Access', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of access to grant clients using the file system
     * through this export. If unspecified defaults to {@code READ_ONLY}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("access")
    private final Access access;

    /**
     * Type of access to grant clients using the file system
     * through this export. If unspecified defaults to {@code READ_ONLY}.
     *
     * @return the value
     **/
    public Access getAccess() {
        return access;
    }

    /**
     * Used when clients accessing the file system through this export
     * have their UID and GID remapped to 'anonymousUid' and
     * 'anonymousGid'. If {@code ALL}, all users and groups are remapped;
     * if {@code ROOT}, only the root user and group (UID/GID 0) are
     * remapped; if {@code NONE}, no remapping is done. If unspecified,
     * defaults to {@code ROOT}.
     *
     **/
    public enum IdentitySquash {
        None("NONE"),
        Root("ROOT"),
        All("ALL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IdentitySquash.class);

        private final String value;
        private static java.util.Map<String, IdentitySquash> map;

        static {
            map = new java.util.HashMap<>();
            for (IdentitySquash v : IdentitySquash.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IdentitySquash(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IdentitySquash create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IdentitySquash', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Used when clients accessing the file system through this export
     * have their UID and GID remapped to 'anonymousUid' and
     * 'anonymousGid'. If {@code ALL}, all users and groups are remapped;
     * if {@code ROOT}, only the root user and group (UID/GID 0) are
     * remapped; if {@code NONE}, no remapping is done. If unspecified,
     * defaults to {@code ROOT}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identitySquash")
    private final IdentitySquash identitySquash;

    /**
     * Used when clients accessing the file system through this export
     * have their UID and GID remapped to 'anonymousUid' and
     * 'anonymousGid'. If {@code ALL}, all users and groups are remapped;
     * if {@code ROOT}, only the root user and group (UID/GID 0) are
     * remapped; if {@code NONE}, no remapping is done. If unspecified,
     * defaults to {@code ROOT}.
     *
     * @return the value
     **/
    public IdentitySquash getIdentitySquash() {
        return identitySquash;
    }

    /**
     * UID value to remap to when squashing a client UID (see
     * identitySquash for more details.) If unspecified, defaults
     * to {@code 65534}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("anonymousUid")
    private final Long anonymousUid;

    /**
     * UID value to remap to when squashing a client UID (see
     * identitySquash for more details.) If unspecified, defaults
     * to {@code 65534}.
     *
     * @return the value
     **/
    public Long getAnonymousUid() {
        return anonymousUid;
    }

    /**
     * GID value to remap to when squashing a client GID (see
     * identitySquash for more details.) If unspecified defaults
     * to {@code 65534}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("anonymousGid")
    private final Long anonymousGid;

    /**
     * GID value to remap to when squashing a client GID (see
     * identitySquash for more details.) If unspecified defaults
     * to {@code 65534}.
     *
     * @return the value
     **/
    public Long getAnonymousGid() {
        return anonymousGid;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClientOptions(");
        sb.append("source=").append(String.valueOf(this.source));
        sb.append(", requirePrivilegedSourcePort=")
                .append(String.valueOf(this.requirePrivilegedSourcePort));
        sb.append(", access=").append(String.valueOf(this.access));
        sb.append(", identitySquash=").append(String.valueOf(this.identitySquash));
        sb.append(", anonymousUid=").append(String.valueOf(this.anonymousUid));
        sb.append(", anonymousGid=").append(String.valueOf(this.anonymousGid));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClientOptions)) {
            return false;
        }

        ClientOptions other = (ClientOptions) o;
        return java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(
                        this.requirePrivilegedSourcePort, other.requirePrivilegedSourcePort)
                && java.util.Objects.equals(this.access, other.access)
                && java.util.Objects.equals(this.identitySquash, other.identitySquash)
                && java.util.Objects.equals(this.anonymousUid, other.anonymousUid)
                && java.util.Objects.equals(this.anonymousGid, other.anonymousGid)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result =
                (result * PRIME)
                        + (this.requirePrivilegedSourcePort == null
                                ? 43
                                : this.requirePrivilegedSourcePort.hashCode());
        result = (result * PRIME) + (this.access == null ? 43 : this.access.hashCode());
        result =
                (result * PRIME)
                        + (this.identitySquash == null ? 43 : this.identitySquash.hashCode());
        result = (result * PRIME) + (this.anonymousUid == null ? 43 : this.anonymousUid.hashCode());
        result = (result * PRIME) + (this.anonymousGid == null ? 43 : this.anonymousGid.hashCode());
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
