/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Optional and valid only for ICMP and ICMPv6. Use to specify a particular ICMP type and code
 * as defined in:
 * - [ICMP Parameters](http://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml)
 * - [ICMPv6 Parameters](https://www.iana.org/assignments/icmpv6-parameters/icmpv6-parameters.xhtml)
 * <p>
 * If you specify ICMP or ICMPv6 as the protocol but omit this object, then all ICMP types and
 * codes are allowed. If you do provide this object, the type is required and the code is optional.
 * To enable MTU negotiation for ingress internet traffic via IPv4, make sure to allow type 3 ("Destination
 * Unreachable") code 4 ("Fragmentation Needed and Don't Fragment was Set"). If you need to specify
 * multiple codes for a single type, create a separate security list rule for each.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IcmpOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IcmpOptions {
    @Deprecated
    @java.beans.ConstructorProperties({"code", "type"})
    public IcmpOptions(Integer code, Integer type) {
        super();
        this.code = code;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ICMP code (optional).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private Integer code;

        /**
         * The ICMP code (optional).
         * @param code the value to set
         * @return this builder
         **/
        public Builder code(Integer code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /**
         * The ICMP type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Integer type;

        /**
         * The ICMP type.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Integer type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IcmpOptions build() {
            IcmpOptions __instance__ = new IcmpOptions(code, type);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IcmpOptions o) {
            Builder copiedBuilder = code(o.getCode()).type(o.getType());

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
     * The ICMP code (optional).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final Integer code;

    /**
     * The ICMP code (optional).
     * @return the value
     **/
    public Integer getCode() {
        return code;
    }

    /**
     * The ICMP type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Integer type;

    /**
     * The ICMP type.
     * @return the value
     **/
    public Integer getType() {
        return type;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IcmpOptions(");
        sb.append("code=").append(String.valueOf(this.code));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IcmpOptions)) {
            return false;
        }

        IcmpOptions other = (IcmpOptions) o;
        return java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
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
