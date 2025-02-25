/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details required to establish a TLS enabled connection.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TlsConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TlsConfig {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "certificateStoreType",
        "storePassword",
        "trustStoreContent",
        "keyStoreContent"
    })
    public TlsConfig(
            Status status,
            CertificateStoreType certificateStoreType,
            String storePassword,
            String trustStoreContent,
            String keyStoreContent) {
        super();
        this.status = status;
        this.certificateStoreType = certificateStoreType;
        this.storePassword = storePassword;
        this.trustStoreContent = trustStoreContent;
        this.keyStoreContent = keyStoreContent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Status to represent whether the database connection is TLS enabled or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status to represent whether the database connection is TLS enabled or not.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The format of the certificate store.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateStoreType")
        private CertificateStoreType certificateStoreType;

        /**
         * The format of the certificate store.
         * @param certificateStoreType the value to set
         * @return this builder
         **/
        public Builder certificateStoreType(CertificateStoreType certificateStoreType) {
            this.certificateStoreType = certificateStoreType;
            this.__explicitlySet__.add("certificateStoreType");
            return this;
        }
        /**
         * The password to read the trust store and key store files, if they are password protected.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storePassword")
        private String storePassword;

        /**
         * The password to read the trust store and key store files, if they are password protected.
         * @param storePassword the value to set
         * @return this builder
         **/
        public Builder storePassword(String storePassword) {
            this.storePassword = storePassword;
            this.__explicitlySet__.add("storePassword");
            return this;
        }
        /**
         * Base64 encoded string of trust store file content.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trustStoreContent")
        private String trustStoreContent;

        /**
         * Base64 encoded string of trust store file content.
         * @param trustStoreContent the value to set
         * @return this builder
         **/
        public Builder trustStoreContent(String trustStoreContent) {
            this.trustStoreContent = trustStoreContent;
            this.__explicitlySet__.add("trustStoreContent");
            return this;
        }
        /**
         * Base64 encoded string of key store file content.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreContent")
        private String keyStoreContent;

        /**
         * Base64 encoded string of key store file content.
         * @param keyStoreContent the value to set
         * @return this builder
         **/
        public Builder keyStoreContent(String keyStoreContent) {
            this.keyStoreContent = keyStoreContent;
            this.__explicitlySet__.add("keyStoreContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TlsConfig build() {
            TlsConfig __instance__ =
                    new TlsConfig(
                            status,
                            certificateStoreType,
                            storePassword,
                            trustStoreContent,
                            keyStoreContent);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TlsConfig o) {
            Builder copiedBuilder =
                    status(o.getStatus())
                            .certificateStoreType(o.getCertificateStoreType())
                            .storePassword(o.getStorePassword())
                            .trustStoreContent(o.getTrustStoreContent())
                            .keyStoreContent(o.getKeyStoreContent());

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
     * Status to represent whether the database connection is TLS enabled or not.
     **/
    public enum Status {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status to represent whether the database connection is TLS enabled or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status to represent whether the database connection is TLS enabled or not.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * The format of the certificate store.
     **/
    public enum CertificateStoreType {
        Jks("JKS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CertificateStoreType.class);

        private final String value;
        private static java.util.Map<String, CertificateStoreType> map;

        static {
            map = new java.util.HashMap<>();
            for (CertificateStoreType v : CertificateStoreType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CertificateStoreType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CertificateStoreType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CertificateStoreType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The format of the certificate store.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateStoreType")
    private final CertificateStoreType certificateStoreType;

    /**
     * The format of the certificate store.
     * @return the value
     **/
    public CertificateStoreType getCertificateStoreType() {
        return certificateStoreType;
    }

    /**
     * The password to read the trust store and key store files, if they are password protected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storePassword")
    private final String storePassword;

    /**
     * The password to read the trust store and key store files, if they are password protected.
     * @return the value
     **/
    public String getStorePassword() {
        return storePassword;
    }

    /**
     * Base64 encoded string of trust store file content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreContent")
    private final String trustStoreContent;

    /**
     * Base64 encoded string of trust store file content.
     * @return the value
     **/
    public String getTrustStoreContent() {
        return trustStoreContent;
    }

    /**
     * Base64 encoded string of key store file content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreContent")
    private final String keyStoreContent;

    /**
     * Base64 encoded string of key store file content.
     * @return the value
     **/
    public String getKeyStoreContent() {
        return keyStoreContent;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TlsConfig(");
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", certificateStoreType=").append(String.valueOf(this.certificateStoreType));
        sb.append(", storePassword=").append(String.valueOf(this.storePassword));
        sb.append(", trustStoreContent=").append(String.valueOf(this.trustStoreContent));
        sb.append(", keyStoreContent=").append(String.valueOf(this.keyStoreContent));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TlsConfig)) {
            return false;
        }

        TlsConfig other = (TlsConfig) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.certificateStoreType, other.certificateStoreType)
                && java.util.Objects.equals(this.storePassword, other.storePassword)
                && java.util.Objects.equals(this.trustStoreContent, other.trustStoreContent)
                && java.util.Objects.equals(this.keyStoreContent, other.keyStoreContent)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateStoreType == null
                                ? 43
                                : this.certificateStoreType.hashCode());
        result =
                (result * PRIME)
                        + (this.storePassword == null ? 43 : this.storePassword.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStoreContent == null ? 43 : this.trustStoreContent.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStoreContent == null ? 43 : this.keyStoreContent.hashCode());
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
