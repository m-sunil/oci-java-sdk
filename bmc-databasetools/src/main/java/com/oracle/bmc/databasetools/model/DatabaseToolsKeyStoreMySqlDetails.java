/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * The details of the key store.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseToolsKeyStoreMySqlDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseToolsKeyStoreMySqlDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"keyStoreType", "keyStoreContent", "keyStorePassword"})
    public DatabaseToolsKeyStoreMySqlDetails(
            KeyStoreTypeMySql keyStoreType,
            DatabaseToolsKeyStoreContentMySqlDetails keyStoreContent,
            DatabaseToolsKeyStorePasswordMySqlDetails keyStorePassword) {
        super();
        this.keyStoreType = keyStoreType;
        this.keyStoreContent = keyStoreContent;
        this.keyStorePassword = keyStorePassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The key store type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreType")
        private KeyStoreTypeMySql keyStoreType;

        /**
         * The key store type.
         * @param keyStoreType the value to set
         * @return this builder
         **/
        public Builder keyStoreType(KeyStoreTypeMySql keyStoreType) {
            this.keyStoreType = keyStoreType;
            this.__explicitlySet__.add("keyStoreType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreContent")
        private DatabaseToolsKeyStoreContentMySqlDetails keyStoreContent;

        public Builder keyStoreContent(DatabaseToolsKeyStoreContentMySqlDetails keyStoreContent) {
            this.keyStoreContent = keyStoreContent;
            this.__explicitlySet__.add("keyStoreContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
        private DatabaseToolsKeyStorePasswordMySqlDetails keyStorePassword;

        public Builder keyStorePassword(
                DatabaseToolsKeyStorePasswordMySqlDetails keyStorePassword) {
            this.keyStorePassword = keyStorePassword;
            this.__explicitlySet__.add("keyStorePassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsKeyStoreMySqlDetails build() {
            DatabaseToolsKeyStoreMySqlDetails __instance__ =
                    new DatabaseToolsKeyStoreMySqlDetails(
                            keyStoreType, keyStoreContent, keyStorePassword);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsKeyStoreMySqlDetails o) {
            Builder copiedBuilder =
                    keyStoreType(o.getKeyStoreType())
                            .keyStoreContent(o.getKeyStoreContent())
                            .keyStorePassword(o.getKeyStorePassword());

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
     * The key store type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreType")
    private final KeyStoreTypeMySql keyStoreType;

    /**
     * The key store type.
     * @return the value
     **/
    public KeyStoreTypeMySql getKeyStoreType() {
        return keyStoreType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreContent")
    private final DatabaseToolsKeyStoreContentMySqlDetails keyStoreContent;

    public DatabaseToolsKeyStoreContentMySqlDetails getKeyStoreContent() {
        return keyStoreContent;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
    private final DatabaseToolsKeyStorePasswordMySqlDetails keyStorePassword;

    public DatabaseToolsKeyStorePasswordMySqlDetails getKeyStorePassword() {
        return keyStorePassword;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatabaseToolsKeyStoreMySqlDetails(");
        sb.append("keyStoreType=").append(String.valueOf(this.keyStoreType));
        sb.append(", keyStoreContent=").append(String.valueOf(this.keyStoreContent));
        sb.append(", keyStorePassword=").append(String.valueOf(this.keyStorePassword));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsKeyStoreMySqlDetails)) {
            return false;
        }

        DatabaseToolsKeyStoreMySqlDetails other = (DatabaseToolsKeyStoreMySqlDetails) o;
        return java.util.Objects.equals(this.keyStoreType, other.keyStoreType)
                && java.util.Objects.equals(this.keyStoreContent, other.keyStoreContent)
                && java.util.Objects.equals(this.keyStorePassword, other.keyStorePassword)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyStoreType == null ? 43 : this.keyStoreType.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStoreContent == null ? 43 : this.keyStoreContent.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStorePassword == null ? 43 : this.keyStorePassword.hashCode());
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
