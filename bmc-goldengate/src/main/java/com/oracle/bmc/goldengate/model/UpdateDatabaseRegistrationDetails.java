/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update for a DatabaseRegistration.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateDatabaseRegistrationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDatabaseRegistrationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "freeformTags",
        "definedTags",
        "fqdn",
        "username",
        "password",
        "connectionString",
        "sessionMode",
        "wallet",
        "aliasName"
    })
    public UpdateDatabaseRegistrationDetails(
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String fqdn,
            String username,
            String password,
            String connectionString,
            SessionMode sessionMode,
            String wallet,
            String aliasName) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.fqdn = fqdn;
        this.username = username;
        this.password = password;
        this.connectionString = connectionString;
        this.sessionMode = sessionMode;
        this.wallet = wallet;
        this.aliasName = aliasName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An object's Display Name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Metadata about this specific object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Metadata about this specific object.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A three-label Fully Qualified Domain Name (FQDN) for a resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
        private String fqdn;

        /**
         * A three-label Fully Qualified Domain Name (FQDN) for a resource.
         *
         * @param fqdn the value to set
         * @return this builder
         **/
        public Builder fqdn(String fqdn) {
            this.fqdn = fqdn;
            this.__explicitlySet__.add("fqdn");
            return this;
        }
        /**
         * The username Oracle GoldenGate uses to connect the associated RDBMS.  This username must already exist and be available for use by the database.  It must conform to the security requirements implemented by the database including length, case sensitivity, and so on.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect the associated RDBMS.  This username must already exist and be available for use by the database.  It must conform to the security requirements implemented by the database including length, case sensitivity, and so on.
         *
         * @param username the value to set
         * @return this builder
         **/
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The password Oracle GoldenGate uses to connect the associated RDBMS.  It must conform to the specific security requirements implemented by the database including length, case sensitivity, and so on.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password Oracle GoldenGate uses to connect the associated RDBMS.  It must conform to the specific security requirements implemented by the database including length, case sensitivity, and so on.
         *
         * @param password the value to set
         * @return this builder
         **/
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /**
         * Connect descriptor or Easy Connect Naming method that Oracle GoldenGate uses to connect to a database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private String connectionString;

        /**
         * Connect descriptor or Easy Connect Naming method that Oracle GoldenGate uses to connect to a database.
         *
         * @param connectionString the value to set
         * @return this builder
         **/
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }
        /**
         * The mode of the database connection session to be established by the data client. REDIRECT - for a RAC database, DIRECT - for a non-RAC database. Connection to a RAC database involves a redirection received from the SCAN listeners to the database node to connect to. By default the mode would be DIRECT.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sessionMode")
        private SessionMode sessionMode;

        /**
         * The mode of the database connection session to be established by the data client. REDIRECT - for a RAC database, DIRECT - for a non-RAC database. Connection to a RAC database involves a redirection received from the SCAN listeners to the database node to connect to. By default the mode would be DIRECT.
         *
         * @param sessionMode the value to set
         * @return this builder
         **/
        public Builder sessionMode(SessionMode sessionMode) {
            this.sessionMode = sessionMode;
            this.__explicitlySet__.add("sessionMode");
            return this;
        }
        /**
         * The wallet contents Oracle GoldenGate uses to make connections to a database.  This attribute is expected to be base64 encoded.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("wallet")
        private String wallet;

        /**
         * The wallet contents Oracle GoldenGate uses to make connections to a database.  This attribute is expected to be base64 encoded.
         *
         * @param wallet the value to set
         * @return this builder
         **/
        public Builder wallet(String wallet) {
            this.wallet = wallet;
            this.__explicitlySet__.add("wallet");
            return this;
        }
        /**
         * Credential store alias.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
        private String aliasName;

        /**
         * Credential store alias.
         *
         * @param aliasName the value to set
         * @return this builder
         **/
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            this.__explicitlySet__.add("aliasName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDatabaseRegistrationDetails build() {
            UpdateDatabaseRegistrationDetails __instance__ =
                    new UpdateDatabaseRegistrationDetails(
                            displayName,
                            description,
                            freeformTags,
                            definedTags,
                            fqdn,
                            username,
                            password,
                            connectionString,
                            sessionMode,
                            wallet,
                            aliasName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDatabaseRegistrationDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .fqdn(o.getFqdn())
                            .username(o.getUsername())
                            .password(o.getPassword())
                            .connectionString(o.getConnectionString())
                            .sessionMode(o.getSessionMode())
                            .wallet(o.getWallet())
                            .aliasName(o.getAliasName());

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
     * An object's Display Name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Metadata about this specific object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Metadata about this specific object.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A three-label Fully Qualified Domain Name (FQDN) for a resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
    private final String fqdn;

    /**
     * A three-label Fully Qualified Domain Name (FQDN) for a resource.
     *
     * @return the value
     **/
    public String getFqdn() {
        return fqdn;
    }

    /**
     * The username Oracle GoldenGate uses to connect the associated RDBMS.  This username must already exist and be available for use by the database.  It must conform to the security requirements implemented by the database including length, case sensitivity, and so on.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect the associated RDBMS.  This username must already exist and be available for use by the database.  It must conform to the security requirements implemented by the database including length, case sensitivity, and so on.
     *
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * The password Oracle GoldenGate uses to connect the associated RDBMS.  It must conform to the specific security requirements implemented by the database including length, case sensitivity, and so on.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password Oracle GoldenGate uses to connect the associated RDBMS.  It must conform to the specific security requirements implemented by the database including length, case sensitivity, and so on.
     *
     * @return the value
     **/
    public String getPassword() {
        return password;
    }

    /**
     * Connect descriptor or Easy Connect Naming method that Oracle GoldenGate uses to connect to a database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    private final String connectionString;

    /**
     * Connect descriptor or Easy Connect Naming method that Oracle GoldenGate uses to connect to a database.
     *
     * @return the value
     **/
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * The mode of the database connection session to be established by the data client. REDIRECT - for a RAC database, DIRECT - for a non-RAC database. Connection to a RAC database involves a redirection received from the SCAN listeners to the database node to connect to. By default the mode would be DIRECT.
     *
     **/
    public enum SessionMode {
        Direct("DIRECT"),
        Redirect("REDIRECT"),
        ;

        private final String value;
        private static java.util.Map<String, SessionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (SessionMode v : SessionMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        SessionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SessionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SessionMode: " + key);
        }
    };
    /**
     * The mode of the database connection session to be established by the data client. REDIRECT - for a RAC database, DIRECT - for a non-RAC database. Connection to a RAC database involves a redirection received from the SCAN listeners to the database node to connect to. By default the mode would be DIRECT.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionMode")
    private final SessionMode sessionMode;

    /**
     * The mode of the database connection session to be established by the data client. REDIRECT - for a RAC database, DIRECT - for a non-RAC database. Connection to a RAC database involves a redirection received from the SCAN listeners to the database node to connect to. By default the mode would be DIRECT.
     *
     * @return the value
     **/
    public SessionMode getSessionMode() {
        return sessionMode;
    }

    /**
     * The wallet contents Oracle GoldenGate uses to make connections to a database.  This attribute is expected to be base64 encoded.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wallet")
    private final String wallet;

    /**
     * The wallet contents Oracle GoldenGate uses to make connections to a database.  This attribute is expected to be base64 encoded.
     *
     * @return the value
     **/
    public String getWallet() {
        return wallet;
    }

    /**
     * Credential store alias.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
    private final String aliasName;

    /**
     * Credential store alias.
     *
     * @return the value
     **/
    public String getAliasName() {
        return aliasName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateDatabaseRegistrationDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", fqdn=").append(String.valueOf(this.fqdn));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append(String.valueOf(this.password));
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", sessionMode=").append(String.valueOf(this.sessionMode));
        sb.append(", wallet=").append(String.valueOf(this.wallet));
        sb.append(", aliasName=").append(String.valueOf(this.aliasName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDatabaseRegistrationDetails)) {
            return false;
        }

        UpdateDatabaseRegistrationDetails other = (UpdateDatabaseRegistrationDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.fqdn, other.fqdn)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.sessionMode, other.sessionMode)
                && java.util.Objects.equals(this.wallet, other.wallet)
                && java.util.Objects.equals(this.aliasName, other.aliasName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.fqdn == null ? 43 : this.fqdn.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionString == null ? 43 : this.connectionString.hashCode());
        result = (result * PRIME) + (this.sessionMode == null ? 43 : this.sessionMode.hashCode());
        result = (result * PRIME) + (this.wallet == null ? 43 : this.wallet.hashCode());
        result = (result * PRIME) + (this.aliasName == null ? 43 : this.aliasName.hashCode());
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
