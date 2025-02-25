/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Properties used for MACsec (if capable).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MacsecProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MacsecProperties {
    @Deprecated
    @java.beans.ConstructorProperties({"state", "primaryKey", "encryptionCipher"})
    public MacsecProperties(
            MacsecState state, MacsecKey primaryKey, MacsecEncryptionCipher encryptionCipher) {
        super();
        this.state = state;
        this.primaryKey = primaryKey;
        this.encryptionCipher = encryptionCipher;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether or not MACsec is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private MacsecState state;

        /**
         * Indicates whether or not MACsec is enabled.
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(MacsecState state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("primaryKey")
        private MacsecKey primaryKey;

        public Builder primaryKey(MacsecKey primaryKey) {
            this.primaryKey = primaryKey;
            this.__explicitlySet__.add("primaryKey");
            return this;
        }
        /**
         * Type of encryption cipher suite to use for the MACsec connection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionCipher")
        private MacsecEncryptionCipher encryptionCipher;

        /**
         * Type of encryption cipher suite to use for the MACsec connection.
         * @param encryptionCipher the value to set
         * @return this builder
         **/
        public Builder encryptionCipher(MacsecEncryptionCipher encryptionCipher) {
            this.encryptionCipher = encryptionCipher;
            this.__explicitlySet__.add("encryptionCipher");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MacsecProperties build() {
            MacsecProperties __instance__ =
                    new MacsecProperties(state, primaryKey, encryptionCipher);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MacsecProperties o) {
            Builder copiedBuilder =
                    state(o.getState())
                            .primaryKey(o.getPrimaryKey())
                            .encryptionCipher(o.getEncryptionCipher());

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
     * Indicates whether or not MACsec is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final MacsecState state;

    /**
     * Indicates whether or not MACsec is enabled.
     * @return the value
     **/
    public MacsecState getState() {
        return state;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("primaryKey")
    private final MacsecKey primaryKey;

    public MacsecKey getPrimaryKey() {
        return primaryKey;
    }

    /**
     * Type of encryption cipher suite to use for the MACsec connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionCipher")
    private final MacsecEncryptionCipher encryptionCipher;

    /**
     * Type of encryption cipher suite to use for the MACsec connection.
     * @return the value
     **/
    public MacsecEncryptionCipher getEncryptionCipher() {
        return encryptionCipher;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MacsecProperties(");
        sb.append("state=").append(String.valueOf(this.state));
        sb.append(", primaryKey=").append(String.valueOf(this.primaryKey));
        sb.append(", encryptionCipher=").append(String.valueOf(this.encryptionCipher));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MacsecProperties)) {
            return false;
        }

        MacsecProperties other = (MacsecProperties) o;
        return java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.primaryKey, other.primaryKey)
                && java.util.Objects.equals(this.encryptionCipher, other.encryptionCipher)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.primaryKey == null ? 43 : this.primaryKey.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionCipher == null ? 43 : this.encryptionCipher.hashCode());
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
