/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Default phase one parameters.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DefaultPhaseOneParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DefaultPhaseOneParameters {
    @Deprecated
    @java.beans.ConstructorProperties({
        "defaultEncryptionAlgorithms",
        "defaultAuthenticationAlgorithms",
        "defaultDhGroups"
    })
    public DefaultPhaseOneParameters(
            java.util.List<String> defaultEncryptionAlgorithms,
            java.util.List<String> defaultAuthenticationAlgorithms,
            java.util.List<String> defaultDhGroups) {
        super();
        this.defaultEncryptionAlgorithms = defaultEncryptionAlgorithms;
        this.defaultAuthenticationAlgorithms = defaultAuthenticationAlgorithms;
        this.defaultDhGroups = defaultDhGroups;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Default phase one encryption algorithms.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultEncryptionAlgorithms")
        private java.util.List<String> defaultEncryptionAlgorithms;

        /**
         * Default phase one encryption algorithms.
         * @param defaultEncryptionAlgorithms the value to set
         * @return this builder
         **/
        public Builder defaultEncryptionAlgorithms(
                java.util.List<String> defaultEncryptionAlgorithms) {
            this.defaultEncryptionAlgorithms = defaultEncryptionAlgorithms;
            this.__explicitlySet__.add("defaultEncryptionAlgorithms");
            return this;
        }
        /**
         * Default phase one authentication algorithms.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationAlgorithms")
        private java.util.List<String> defaultAuthenticationAlgorithms;

        /**
         * Default phase one authentication algorithms.
         * @param defaultAuthenticationAlgorithms the value to set
         * @return this builder
         **/
        public Builder defaultAuthenticationAlgorithms(
                java.util.List<String> defaultAuthenticationAlgorithms) {
            this.defaultAuthenticationAlgorithms = defaultAuthenticationAlgorithms;
            this.__explicitlySet__.add("defaultAuthenticationAlgorithms");
            return this;
        }
        /**
         * Default phase one Diffie-Hellman groups.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultDhGroups")
        private java.util.List<String> defaultDhGroups;

        /**
         * Default phase one Diffie-Hellman groups.
         * @param defaultDhGroups the value to set
         * @return this builder
         **/
        public Builder defaultDhGroups(java.util.List<String> defaultDhGroups) {
            this.defaultDhGroups = defaultDhGroups;
            this.__explicitlySet__.add("defaultDhGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DefaultPhaseOneParameters build() {
            DefaultPhaseOneParameters __instance__ =
                    new DefaultPhaseOneParameters(
                            defaultEncryptionAlgorithms,
                            defaultAuthenticationAlgorithms,
                            defaultDhGroups);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefaultPhaseOneParameters o) {
            Builder copiedBuilder =
                    defaultEncryptionAlgorithms(o.getDefaultEncryptionAlgorithms())
                            .defaultAuthenticationAlgorithms(o.getDefaultAuthenticationAlgorithms())
                            .defaultDhGroups(o.getDefaultDhGroups());

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
     * Default phase one encryption algorithms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultEncryptionAlgorithms")
    private final java.util.List<String> defaultEncryptionAlgorithms;

    /**
     * Default phase one encryption algorithms.
     * @return the value
     **/
    public java.util.List<String> getDefaultEncryptionAlgorithms() {
        return defaultEncryptionAlgorithms;
    }

    /**
     * Default phase one authentication algorithms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationAlgorithms")
    private final java.util.List<String> defaultAuthenticationAlgorithms;

    /**
     * Default phase one authentication algorithms.
     * @return the value
     **/
    public java.util.List<String> getDefaultAuthenticationAlgorithms() {
        return defaultAuthenticationAlgorithms;
    }

    /**
     * Default phase one Diffie-Hellman groups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultDhGroups")
    private final java.util.List<String> defaultDhGroups;

    /**
     * Default phase one Diffie-Hellman groups.
     * @return the value
     **/
    public java.util.List<String> getDefaultDhGroups() {
        return defaultDhGroups;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DefaultPhaseOneParameters(");
        sb.append("defaultEncryptionAlgorithms=")
                .append(String.valueOf(this.defaultEncryptionAlgorithms));
        sb.append(", defaultAuthenticationAlgorithms=")
                .append(String.valueOf(this.defaultAuthenticationAlgorithms));
        sb.append(", defaultDhGroups=").append(String.valueOf(this.defaultDhGroups));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefaultPhaseOneParameters)) {
            return false;
        }

        DefaultPhaseOneParameters other = (DefaultPhaseOneParameters) o;
        return java.util.Objects.equals(
                        this.defaultEncryptionAlgorithms, other.defaultEncryptionAlgorithms)
                && java.util.Objects.equals(
                        this.defaultAuthenticationAlgorithms, other.defaultAuthenticationAlgorithms)
                && java.util.Objects.equals(this.defaultDhGroups, other.defaultDhGroups)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.defaultEncryptionAlgorithms == null
                                ? 43
                                : this.defaultEncryptionAlgorithms.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultAuthenticationAlgorithms == null
                                ? 43
                                : this.defaultAuthenticationAlgorithms.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultDhGroups == null ? 43 : this.defaultDhGroups.hashCode());
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
