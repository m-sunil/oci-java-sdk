/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * How a response from a backend is cached in the Response Cache.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FixedTTLResponseCacheStorePolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FixedTTLResponseCacheStorePolicy extends ResponseCacheStorePolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Sets the number of seconds for a response from a backend being stored in the Response Cache before it expires.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeToLiveInSeconds")
        private Integer timeToLiveInSeconds;

        /**
         * Sets the number of seconds for a response from a backend being stored in the Response Cache before it expires.
         *
         * @param timeToLiveInSeconds the value to set
         * @return this builder
         **/
        public Builder timeToLiveInSeconds(Integer timeToLiveInSeconds) {
            this.timeToLiveInSeconds = timeToLiveInSeconds;
            this.__explicitlySet__.add("timeToLiveInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FixedTTLResponseCacheStorePolicy build() {
            FixedTTLResponseCacheStorePolicy __instance__ =
                    new FixedTTLResponseCacheStorePolicy(timeToLiveInSeconds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FixedTTLResponseCacheStorePolicy o) {
            Builder copiedBuilder = timeToLiveInSeconds(o.getTimeToLiveInSeconds());

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
    public FixedTTLResponseCacheStorePolicy(Integer timeToLiveInSeconds) {
        super();
        this.timeToLiveInSeconds = timeToLiveInSeconds;
    }

    /**
     * Sets the number of seconds for a response from a backend being stored in the Response Cache before it expires.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeToLiveInSeconds")
    private final Integer timeToLiveInSeconds;

    /**
     * Sets the number of seconds for a response from a backend being stored in the Response Cache before it expires.
     *
     * @return the value
     **/
    public Integer getTimeToLiveInSeconds() {
        return timeToLiveInSeconds;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FixedTTLResponseCacheStorePolicy(");
        sb.append("super=").append(super.toString());
        sb.append(", timeToLiveInSeconds=").append(String.valueOf(this.timeToLiveInSeconds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FixedTTLResponseCacheStorePolicy)) {
            return false;
        }

        FixedTTLResponseCacheStorePolicy other = (FixedTTLResponseCacheStorePolicy) o;
        return java.util.Objects.equals(this.timeToLiveInSeconds, other.timeToLiveInSeconds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.timeToLiveInSeconds == null
                                ? 43
                                : this.timeToLiveInSeconds.hashCode());
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
