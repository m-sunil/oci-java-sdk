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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DerivedKeyResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DerivedKeyResponse {
    @Deprecated
    @java.beans.ConstructorProperties({"signingKey", "principal"})
    public DerivedKeyResponse(String signingKey, CommonPrincipal principal) {
        super();
        this.signingKey = signingKey;
        this.principal = principal;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The derived key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signingKey")
        private String signingKey;

        /**
         * The derived key.
         * @param signingKey the value to set
         * @return this builder
         **/
        public Builder signingKey(String signingKey) {
            this.signingKey = signingKey;
            this.__explicitlySet__.add("signingKey");
            return this;
        }
        /**
         * The principal.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("principal")
        private CommonPrincipal principal;

        /**
         * The principal.
         * @param principal the value to set
         * @return this builder
         **/
        public Builder principal(CommonPrincipal principal) {
            this.principal = principal;
            this.__explicitlySet__.add("principal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DerivedKeyResponse build() {
            DerivedKeyResponse __instance__ = new DerivedKeyResponse(signingKey, principal);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DerivedKeyResponse o) {
            Builder copiedBuilder = signingKey(o.getSigningKey()).principal(o.getPrincipal());

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
     * The derived key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingKey")
    private final String signingKey;

    /**
     * The derived key.
     * @return the value
     **/
    public String getSigningKey() {
        return signingKey;
    }

    /**
     * The principal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principal")
    private final CommonPrincipal principal;

    /**
     * The principal.
     * @return the value
     **/
    public CommonPrincipal getPrincipal() {
        return principal;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DerivedKeyResponse(");
        sb.append("signingKey=").append(String.valueOf(this.signingKey));
        sb.append(", principal=").append(String.valueOf(this.principal));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DerivedKeyResponse)) {
            return false;
        }

        DerivedKeyResponse other = (DerivedKeyResponse) o;
        return java.util.Objects.equals(this.signingKey, other.signingKey)
                && java.util.Objects.equals(this.principal, other.principal)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.signingKey == null ? 43 : this.signingKey.hashCode());
        result = (result * PRIME) + (this.principal == null ? 43 : this.principal.hashCode());
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
