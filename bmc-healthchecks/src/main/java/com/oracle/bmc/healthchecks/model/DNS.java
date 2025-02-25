/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * The DNS resolution results.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DNS.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DNS {
    @Deprecated
    @java.beans.ConstructorProperties({"domainLookupDuration", "addresses"})
    public DNS(Double domainLookupDuration, java.util.List<String> addresses) {
        super();
        this.domainLookupDuration = domainLookupDuration;
        this.addresses = addresses;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Total DNS resolution duration, in milliseconds. Calculated using {@code domainLookupEnd}
         * minus {@code domainLookupStart}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainLookupDuration")
        private Double domainLookupDuration;

        /**
         * Total DNS resolution duration, in milliseconds. Calculated using {@code domainLookupEnd}
         * minus {@code domainLookupStart}.
         *
         * @param domainLookupDuration the value to set
         * @return this builder
         **/
        public Builder domainLookupDuration(Double domainLookupDuration) {
            this.domainLookupDuration = domainLookupDuration;
            this.__explicitlySet__.add("domainLookupDuration");
            return this;
        }
        /**
         * The addresses returned by DNS resolution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("addresses")
        private java.util.List<String> addresses;

        /**
         * The addresses returned by DNS resolution.
         * @param addresses the value to set
         * @return this builder
         **/
        public Builder addresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            this.__explicitlySet__.add("addresses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DNS build() {
            DNS __instance__ = new DNS(domainLookupDuration, addresses);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DNS o) {
            Builder copiedBuilder =
                    domainLookupDuration(o.getDomainLookupDuration()).addresses(o.getAddresses());

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
     * Total DNS resolution duration, in milliseconds. Calculated using {@code domainLookupEnd}
     * minus {@code domainLookupStart}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainLookupDuration")
    private final Double domainLookupDuration;

    /**
     * Total DNS resolution duration, in milliseconds. Calculated using {@code domainLookupEnd}
     * minus {@code domainLookupStart}.
     *
     * @return the value
     **/
    public Double getDomainLookupDuration() {
        return domainLookupDuration;
    }

    /**
     * The addresses returned by DNS resolution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addresses")
    private final java.util.List<String> addresses;

    /**
     * The addresses returned by DNS resolution.
     * @return the value
     **/
    public java.util.List<String> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DNS(");
        sb.append("domainLookupDuration=").append(String.valueOf(this.domainLookupDuration));
        sb.append(", addresses=").append(String.valueOf(this.addresses));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DNS)) {
            return false;
        }

        DNS other = (DNS) o;
        return java.util.Objects.equals(this.domainLookupDuration, other.domainLookupDuration)
                && java.util.Objects.equals(this.addresses, other.addresses)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.domainLookupDuration == null
                                ? 43
                                : this.domainLookupDuration.hashCode());
        result = (result * PRIME) + (this.addresses == null ? 43 : this.addresses.hashCode());
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
