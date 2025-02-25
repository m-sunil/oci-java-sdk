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
    builder = PasswordResetAuthenticationRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PasswordResetAuthenticationRequest {
    @Deprecated
    @java.beans.ConstructorProperties({"userId", "passwordResetToken"})
    public PasswordResetAuthenticationRequest(String userId, String passwordResetToken) {
        super();
        this.userId = userId;
        this.passwordResetToken = passwordResetToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The id of the user
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The id of the user
         * @param userId the value to set
         * @return this builder
         **/
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * The password reset token
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordResetToken")
        private String passwordResetToken;

        /**
         * The password reset token
         * @param passwordResetToken the value to set
         * @return this builder
         **/
        public Builder passwordResetToken(String passwordResetToken) {
            this.passwordResetToken = passwordResetToken;
            this.__explicitlySet__.add("passwordResetToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PasswordResetAuthenticationRequest build() {
            PasswordResetAuthenticationRequest __instance__ =
                    new PasswordResetAuthenticationRequest(userId, passwordResetToken);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PasswordResetAuthenticationRequest o) {
            Builder copiedBuilder =
                    userId(o.getUserId()).passwordResetToken(o.getPasswordResetToken());

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
     * The id of the user
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The id of the user
     * @return the value
     **/
    public String getUserId() {
        return userId;
    }

    /**
     * The password reset token
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordResetToken")
    private final String passwordResetToken;

    /**
     * The password reset token
     * @return the value
     **/
    public String getPasswordResetToken() {
        return passwordResetToken;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PasswordResetAuthenticationRequest(");
        sb.append("userId=").append(String.valueOf(this.userId));
        sb.append(", passwordResetToken=").append(String.valueOf(this.passwordResetToken));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PasswordResetAuthenticationRequest)) {
            return false;
        }

        PasswordResetAuthenticationRequest other = (PasswordResetAuthenticationRequest) o;
        return java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.passwordResetToken, other.passwordResetToken)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordResetToken == null
                                ? 43
                                : this.passwordResetToken.hashCode());
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
