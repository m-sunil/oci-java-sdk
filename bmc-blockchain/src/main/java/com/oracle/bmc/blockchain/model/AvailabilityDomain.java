/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Availability Domains
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AvailabilityDomain.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AvailabilityDomain {
    @Deprecated
    @java.beans.ConstructorProperties({"ads"})
    public AvailabilityDomain(Ads ads) {
        super();
        this.ads = ads;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Availability Domain Identifiers
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ads")
        private Ads ads;

        /**
         * Availability Domain Identifiers
         * @param ads the value to set
         * @return this builder
         **/
        public Builder ads(Ads ads) {
            this.ads = ads;
            this.__explicitlySet__.add("ads");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailabilityDomain build() {
            AvailabilityDomain __instance__ = new AvailabilityDomain(ads);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailabilityDomain o) {
            Builder copiedBuilder = ads(o.getAds());

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
     * Availability Domain Identifiers
     **/
    public enum Ads {
        Ad1("AD1"),
        Ad2("AD2"),
        Ad3("AD3"),
        ;

        private final String value;
        private static java.util.Map<String, Ads> map;

        static {
            map = new java.util.HashMap<>();
            for (Ads v : Ads.values()) {
                map.put(v.getValue(), v);
            }
        }

        Ads(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Ads create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Ads: " + key);
        }
    };
    /**
     * Availability Domain Identifiers
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ads")
    private final Ads ads;

    /**
     * Availability Domain Identifiers
     * @return the value
     **/
    public Ads getAds() {
        return ads;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AvailabilityDomain(");
        sb.append("ads=").append(String.valueOf(this.ads));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailabilityDomain)) {
            return false;
        }

        AvailabilityDomain other = (AvailabilityDomain) o;
        return java.util.Objects.equals(this.ads, other.ads)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ads == null ? 43 : this.ads.hashCode());
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
