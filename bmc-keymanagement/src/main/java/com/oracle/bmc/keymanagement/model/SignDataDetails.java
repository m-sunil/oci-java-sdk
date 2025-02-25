/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SignDataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SignDataDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "message",
        "keyId",
        "keyVersionId",
        "messageType",
        "signingAlgorithm"
    })
    public SignDataDetails(
            String message,
            String keyId,
            String keyVersionId,
            MessageType messageType,
            SigningAlgorithm signingAlgorithm) {
        super();
        this.message = message;
        this.keyId = keyId;
        this.keyVersionId = keyVersionId;
        this.messageType = messageType;
        this.signingAlgorithm = signingAlgorithm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The base64-encoded binary data object denoting the message or message digest to sign. You can have a message up to 4096 bytes in size. To sign a larger message, provide the message digest.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * The base64-encoded binary data object denoting the message or message digest to sign. You can have a message up to 4096 bytes in size. To sign a larger message, provide the message digest.
         * @param message the value to set
         * @return this builder
         **/
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * The OCID of the key used to sign the message.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the key used to sign the message.
         * @param keyId the value to set
         * @return this builder
         **/
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /**
         * The OCID of the key version used to sign the message.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
        private String keyVersionId;

        /**
         * The OCID of the key version used to sign the message.
         * @param keyVersionId the value to set
         * @return this builder
         **/
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            this.__explicitlySet__.add("keyVersionId");
            return this;
        }
        /**
         * Denotes whether the value of the message parameter is a raw message or a message digest.
         * The default value, {@code RAW}, indicates a message. To indicate a message digest, use {@code DIGEST}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("messageType")
        private MessageType messageType;

        /**
         * Denotes whether the value of the message parameter is a raw message or a message digest.
         * The default value, {@code RAW}, indicates a message. To indicate a message digest, use {@code DIGEST}.
         *
         * @param messageType the value to set
         * @return this builder
         **/
        public Builder messageType(MessageType messageType) {
            this.messageType = messageType;
            this.__explicitlySet__.add("messageType");
            return this;
        }
        /**
         * The algorithm to use to sign the message or message digest.
         * For RSA keys, supported signature schemes include PKCS #1 and RSASSA-PSS, along with
         * different hashing algorithms.
         * For ECDSA keys, ECDSA is the supported signature scheme with different hashing algorithms.
         * When you pass a message digest for signing, ensure that you specify the same hashing algorithm
         * as used when creating the message digest.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
        private SigningAlgorithm signingAlgorithm;

        /**
         * The algorithm to use to sign the message or message digest.
         * For RSA keys, supported signature schemes include PKCS #1 and RSASSA-PSS, along with
         * different hashing algorithms.
         * For ECDSA keys, ECDSA is the supported signature scheme with different hashing algorithms.
         * When you pass a message digest for signing, ensure that you specify the same hashing algorithm
         * as used when creating the message digest.
         *
         * @param signingAlgorithm the value to set
         * @return this builder
         **/
        public Builder signingAlgorithm(SigningAlgorithm signingAlgorithm) {
            this.signingAlgorithm = signingAlgorithm;
            this.__explicitlySet__.add("signingAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SignDataDetails build() {
            SignDataDetails __instance__ =
                    new SignDataDetails(
                            message, keyId, keyVersionId, messageType, signingAlgorithm);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SignDataDetails o) {
            Builder copiedBuilder =
                    message(o.getMessage())
                            .keyId(o.getKeyId())
                            .keyVersionId(o.getKeyVersionId())
                            .messageType(o.getMessageType())
                            .signingAlgorithm(o.getSigningAlgorithm());

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
     * The base64-encoded binary data object denoting the message or message digest to sign. You can have a message up to 4096 bytes in size. To sign a larger message, provide the message digest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * The base64-encoded binary data object denoting the message or message digest to sign. You can have a message up to 4096 bytes in size. To sign a larger message, provide the message digest.
     * @return the value
     **/
    public String getMessage() {
        return message;
    }

    /**
     * The OCID of the key used to sign the message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the key used to sign the message.
     * @return the value
     **/
    public String getKeyId() {
        return keyId;
    }

    /**
     * The OCID of the key version used to sign the message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
    private final String keyVersionId;

    /**
     * The OCID of the key version used to sign the message.
     * @return the value
     **/
    public String getKeyVersionId() {
        return keyVersionId;
    }

    /**
     * Denotes whether the value of the message parameter is a raw message or a message digest.
     * The default value, {@code RAW}, indicates a message. To indicate a message digest, use {@code DIGEST}.
     *
     **/
    public enum MessageType {
        Raw("RAW"),
        Digest("DIGEST"),
        ;

        private final String value;
        private static java.util.Map<String, MessageType> map;

        static {
            map = new java.util.HashMap<>();
            for (MessageType v : MessageType.values()) {
                map.put(v.getValue(), v);
            }
        }

        MessageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MessageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MessageType: " + key);
        }
    };
    /**
     * Denotes whether the value of the message parameter is a raw message or a message digest.
     * The default value, {@code RAW}, indicates a message. To indicate a message digest, use {@code DIGEST}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messageType")
    private final MessageType messageType;

    /**
     * Denotes whether the value of the message parameter is a raw message or a message digest.
     * The default value, {@code RAW}, indicates a message. To indicate a message digest, use {@code DIGEST}.
     *
     * @return the value
     **/
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * The algorithm to use to sign the message or message digest.
     * For RSA keys, supported signature schemes include PKCS #1 and RSASSA-PSS, along with
     * different hashing algorithms.
     * For ECDSA keys, ECDSA is the supported signature scheme with different hashing algorithms.
     * When you pass a message digest for signing, ensure that you specify the same hashing algorithm
     * as used when creating the message digest.
     *
     **/
    public enum SigningAlgorithm {
        Sha224RsaPkcsPss("SHA_224_RSA_PKCS_PSS"),
        Sha256RsaPkcsPss("SHA_256_RSA_PKCS_PSS"),
        Sha384RsaPkcsPss("SHA_384_RSA_PKCS_PSS"),
        Sha512RsaPkcsPss("SHA_512_RSA_PKCS_PSS"),
        Sha224RsaPkcs1V15("SHA_224_RSA_PKCS1_V1_5"),
        Sha256RsaPkcs1V15("SHA_256_RSA_PKCS1_V1_5"),
        Sha384RsaPkcs1V15("SHA_384_RSA_PKCS1_V1_5"),
        Sha512RsaPkcs1V15("SHA_512_RSA_PKCS1_V1_5"),
        EcdsaSha256("ECDSA_SHA_256"),
        EcdsaSha384("ECDSA_SHA_384"),
        EcdsaSha512("ECDSA_SHA_512"),
        ;

        private final String value;
        private static java.util.Map<String, SigningAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (SigningAlgorithm v : SigningAlgorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        SigningAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SigningAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SigningAlgorithm: " + key);
        }
    };
    /**
     * The algorithm to use to sign the message or message digest.
     * For RSA keys, supported signature schemes include PKCS #1 and RSASSA-PSS, along with
     * different hashing algorithms.
     * For ECDSA keys, ECDSA is the supported signature scheme with different hashing algorithms.
     * When you pass a message digest for signing, ensure that you specify the same hashing algorithm
     * as used when creating the message digest.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
    private final SigningAlgorithm signingAlgorithm;

    /**
     * The algorithm to use to sign the message or message digest.
     * For RSA keys, supported signature schemes include PKCS #1 and RSASSA-PSS, along with
     * different hashing algorithms.
     * For ECDSA keys, ECDSA is the supported signature scheme with different hashing algorithms.
     * When you pass a message digest for signing, ensure that you specify the same hashing algorithm
     * as used when creating the message digest.
     *
     * @return the value
     **/
    public SigningAlgorithm getSigningAlgorithm() {
        return signingAlgorithm;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SignDataDetails(");
        sb.append("message=").append(String.valueOf(this.message));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", keyVersionId=").append(String.valueOf(this.keyVersionId));
        sb.append(", messageType=").append(String.valueOf(this.messageType));
        sb.append(", signingAlgorithm=").append(String.valueOf(this.signingAlgorithm));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SignDataDetails)) {
            return false;
        }

        SignDataDetails other = (SignDataDetails) o;
        return java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.keyVersionId, other.keyVersionId)
                && java.util.Objects.equals(this.messageType, other.messageType)
                && java.util.Objects.equals(this.signingAlgorithm, other.signingAlgorithm)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.keyVersionId == null ? 43 : this.keyVersionId.hashCode());
        result = (result * PRIME) + (this.messageType == null ? 43 : this.messageType.hashCode());
        result =
                (result * PRIME)
                        + (this.signingAlgorithm == null ? 43 : this.signingAlgorithm.hashCode());
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
