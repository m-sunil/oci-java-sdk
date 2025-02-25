/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CommonPrincipal.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CommonPrincipal {
    @Deprecated
    @java.beans.ConstructorProperties({"tenant", "user"})
    public CommonPrincipal(Tenant tenant, User user) {
        super();
        this.tenant = tenant;
        this.user = user;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The tenant.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenant")
        private Tenant tenant;

        /**
         * The tenant.
         * @param tenant the value to set
         * @return this builder
         **/
        public Builder tenant(Tenant tenant) {
            this.tenant = tenant;
            this.__explicitlySet__.add("tenant");
            return this;
        }
        /**
         * The user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private User user;

        /**
         * The user.
         * @param user the value to set
         * @return this builder
         **/
        public Builder user(User user) {
            this.user = user;
            this.__explicitlySet__.add("user");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommonPrincipal build() {
            CommonPrincipal __instance__ = new CommonPrincipal(tenant, user);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommonPrincipal o) {
            Builder copiedBuilder = tenant(o.getTenant()).user(o.getUser());

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
     * The tenant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenant")
    private final Tenant tenant;

    /**
     * The tenant.
     * @return the value
     **/
    public Tenant getTenant() {
        return tenant;
    }

    /**
     * The user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    private final User user;

    /**
     * The user.
     * @return the value
     **/
    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CommonPrincipal(");
        sb.append("tenant=").append(String.valueOf(this.tenant));
        sb.append(", user=").append(String.valueOf(this.user));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommonPrincipal)) {
            return false;
        }

        CommonPrincipal other = (CommonPrincipal) o;
        return java.util.Objects.equals(this.tenant, other.tenant)
                && java.util.Objects.equals(this.user, other.user)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenant == null ? 43 : this.tenant.hashCode());
        result = (result * PRIME) + (this.user == null ? 43 : this.user.hashCode());
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
