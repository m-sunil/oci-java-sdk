/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for Oracle Key Vault
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
    builder = KeyStoreTypeFromOracleKeyVaultDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KeyStoreTypeFromOracleKeyVaultDetails extends KeyStoreTypeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of Oracle Key Vault connection IP addresses.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionIps")
        private java.util.List<String> connectionIps;

        /**
         * The list of Oracle Key Vault connection IP addresses.
         * @param connectionIps the value to set
         * @return this builder
         **/
        public Builder connectionIps(java.util.List<String> connectionIps) {
            this.connectionIps = connectionIps;
            this.__explicitlySet__.add("connectionIps");
            return this;
        }
        /**
         * The administrator username to connect to Oracle Key Vault
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
        private String adminUsername;

        /**
         * The administrator username to connect to Oracle Key Vault
         * @param adminUsername the value to set
         * @return this builder
         **/
        public Builder adminUsername(String adminUsername) {
            this.adminUsername = adminUsername;
            this.__explicitlySet__.add("adminUsername");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * @param vaultId the value to set
         * @return this builder
         **/
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * @param secretId the value to set
         * @return this builder
         **/
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyStoreTypeFromOracleKeyVaultDetails build() {
            KeyStoreTypeFromOracleKeyVaultDetails __instance__ =
                    new KeyStoreTypeFromOracleKeyVaultDetails(
                            connectionIps, adminUsername, vaultId, secretId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyStoreTypeFromOracleKeyVaultDetails o) {
            Builder copiedBuilder =
                    connectionIps(o.getConnectionIps())
                            .adminUsername(o.getAdminUsername())
                            .vaultId(o.getVaultId())
                            .secretId(o.getSecretId());

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
    public KeyStoreTypeFromOracleKeyVaultDetails(
            java.util.List<String> connectionIps,
            String adminUsername,
            String vaultId,
            String secretId) {
        super();
        this.connectionIps = connectionIps;
        this.adminUsername = adminUsername;
        this.vaultId = vaultId;
        this.secretId = secretId;
    }

    /**
     * The list of Oracle Key Vault connection IP addresses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionIps")
    private final java.util.List<String> connectionIps;

    /**
     * The list of Oracle Key Vault connection IP addresses.
     * @return the value
     **/
    public java.util.List<String> getConnectionIps() {
        return connectionIps;
    }

    /**
     * The administrator username to connect to Oracle Key Vault
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
    private final String adminUsername;

    /**
     * The administrator username to connect to Oracle Key Vault
     * @return the value
     **/
    public String getAdminUsername() {
        return adminUsername;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * @return the value
     **/
    public String getSecretId() {
        return secretId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("KeyStoreTypeFromOracleKeyVaultDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", connectionIps=").append(String.valueOf(this.connectionIps));
        sb.append(", adminUsername=").append(String.valueOf(this.adminUsername));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyStoreTypeFromOracleKeyVaultDetails)) {
            return false;
        }

        KeyStoreTypeFromOracleKeyVaultDetails other = (KeyStoreTypeFromOracleKeyVaultDetails) o;
        return java.util.Objects.equals(this.connectionIps, other.connectionIps)
                && java.util.Objects.equals(this.adminUsername, other.adminUsername)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.connectionIps == null ? 43 : this.connectionIps.hashCode());
        result =
                (result * PRIME)
                        + (this.adminUsername == null ? 43 : this.adminUsername.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
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
