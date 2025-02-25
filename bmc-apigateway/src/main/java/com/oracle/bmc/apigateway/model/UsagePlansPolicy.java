/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Usage plan policies for this deployment
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UsagePlansPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UsagePlansPolicy {
    @Deprecated
    @java.beans.ConstructorProperties({"tokenLocations"})
    public UsagePlansPolicy(java.util.List<String> tokenLocations) {
        super();
        this.tokenLocations = tokenLocations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of context variables specifying where API tokens may be located in a request.
         * Example locations:
         *   - "request.headers[token]"
         *   - "request.query[token]"
         *   - "request.auth[Token]"
         *   - "request.path[TOKEN]"
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tokenLocations")
        private java.util.List<String> tokenLocations;

        /**
         * A list of context variables specifying where API tokens may be located in a request.
         * Example locations:
         *   - "request.headers[token]"
         *   - "request.query[token]"
         *   - "request.auth[Token]"
         *   - "request.path[TOKEN]"
         *
         * @param tokenLocations the value to set
         * @return this builder
         **/
        public Builder tokenLocations(java.util.List<String> tokenLocations) {
            this.tokenLocations = tokenLocations;
            this.__explicitlySet__.add("tokenLocations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsagePlansPolicy build() {
            UsagePlansPolicy __instance__ = new UsagePlansPolicy(tokenLocations);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsagePlansPolicy o) {
            Builder copiedBuilder = tokenLocations(o.getTokenLocations());

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
     * A list of context variables specifying where API tokens may be located in a request.
     * Example locations:
     *   - "request.headers[token]"
     *   - "request.query[token]"
     *   - "request.auth[Token]"
     *   - "request.path[TOKEN]"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokenLocations")
    private final java.util.List<String> tokenLocations;

    /**
     * A list of context variables specifying where API tokens may be located in a request.
     * Example locations:
     *   - "request.headers[token]"
     *   - "request.query[token]"
     *   - "request.auth[Token]"
     *   - "request.path[TOKEN]"
     *
     * @return the value
     **/
    public java.util.List<String> getTokenLocations() {
        return tokenLocations;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UsagePlansPolicy(");
        sb.append("tokenLocations=").append(String.valueOf(this.tokenLocations));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsagePlansPolicy)) {
            return false;
        }

        UsagePlansPolicy other = (UsagePlansPolicy) o;
        return java.util.Objects.equals(this.tokenLocations, other.tokenLocations)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.tokenLocations == null ? 43 : this.tokenLocations.hashCode());
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
