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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WrappedImportKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WrappedImportKey {
    @Deprecated
    @java.beans.ConstructorProperties({"keyMaterial", "wrappingAlgorithm"})
    public WrappedImportKey(String keyMaterial, WrappingAlgorithm wrappingAlgorithm) {
        super();
        this.keyMaterial = keyMaterial;
        this.wrappingAlgorithm = wrappingAlgorithm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The key material to import, wrapped by the vault's RSA public wrapping key and base64-encoded.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyMaterial")
        private String keyMaterial;

        /**
         * The key material to import, wrapped by the vault's RSA public wrapping key and base64-encoded.
         * @param keyMaterial the value to set
         * @return this builder
         **/
        public Builder keyMaterial(String keyMaterial) {
            this.keyMaterial = keyMaterial;
            this.__explicitlySet__.add("keyMaterial");
            return this;
        }
        /**
         * The wrapping mechanism to use during key import.
         * {@code RSA_OAEP_AES_SHA256} invokes the RSA AES key wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped
         * by the vault's RSA public wrapping key, creating a wrapped temporary AES key. The temporary AES key is also used to wrap the private key material.
         * The wrapped temporary AES key and the wrapped exportable key material are concatenated, producing concatenated blob output that jointly represents them.
         * {@code RSA_OAEP_SHA256} means that the exportable key material is wrapped by the vault's RSA public wrapping key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("wrappingAlgorithm")
        private WrappingAlgorithm wrappingAlgorithm;

        /**
         * The wrapping mechanism to use during key import.
         * {@code RSA_OAEP_AES_SHA256} invokes the RSA AES key wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped
         * by the vault's RSA public wrapping key, creating a wrapped temporary AES key. The temporary AES key is also used to wrap the private key material.
         * The wrapped temporary AES key and the wrapped exportable key material are concatenated, producing concatenated blob output that jointly represents them.
         * {@code RSA_OAEP_SHA256} means that the exportable key material is wrapped by the vault's RSA public wrapping key.
         *
         * @param wrappingAlgorithm the value to set
         * @return this builder
         **/
        public Builder wrappingAlgorithm(WrappingAlgorithm wrappingAlgorithm) {
            this.wrappingAlgorithm = wrappingAlgorithm;
            this.__explicitlySet__.add("wrappingAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WrappedImportKey build() {
            WrappedImportKey __instance__ = new WrappedImportKey(keyMaterial, wrappingAlgorithm);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WrappedImportKey o) {
            Builder copiedBuilder =
                    keyMaterial(o.getKeyMaterial()).wrappingAlgorithm(o.getWrappingAlgorithm());

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
     * The key material to import, wrapped by the vault's RSA public wrapping key and base64-encoded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyMaterial")
    private final String keyMaterial;

    /**
     * The key material to import, wrapped by the vault's RSA public wrapping key and base64-encoded.
     * @return the value
     **/
    public String getKeyMaterial() {
        return keyMaterial;
    }

    /**
     * The wrapping mechanism to use during key import.
     * {@code RSA_OAEP_AES_SHA256} invokes the RSA AES key wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped
     * by the vault's RSA public wrapping key, creating a wrapped temporary AES key. The temporary AES key is also used to wrap the private key material.
     * The wrapped temporary AES key and the wrapped exportable key material are concatenated, producing concatenated blob output that jointly represents them.
     * {@code RSA_OAEP_SHA256} means that the exportable key material is wrapped by the vault's RSA public wrapping key.
     *
     **/
    public enum WrappingAlgorithm {
        RsaOaepSha256("RSA_OAEP_SHA256"),
        RsaOaepAesSha256("RSA_OAEP_AES_SHA256"),
        ;

        private final String value;
        private static java.util.Map<String, WrappingAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (WrappingAlgorithm v : WrappingAlgorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        WrappingAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WrappingAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid WrappingAlgorithm: " + key);
        }
    };
    /**
     * The wrapping mechanism to use during key import.
     * {@code RSA_OAEP_AES_SHA256} invokes the RSA AES key wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped
     * by the vault's RSA public wrapping key, creating a wrapped temporary AES key. The temporary AES key is also used to wrap the private key material.
     * The wrapped temporary AES key and the wrapped exportable key material are concatenated, producing concatenated blob output that jointly represents them.
     * {@code RSA_OAEP_SHA256} means that the exportable key material is wrapped by the vault's RSA public wrapping key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wrappingAlgorithm")
    private final WrappingAlgorithm wrappingAlgorithm;

    /**
     * The wrapping mechanism to use during key import.
     * {@code RSA_OAEP_AES_SHA256} invokes the RSA AES key wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped
     * by the vault's RSA public wrapping key, creating a wrapped temporary AES key. The temporary AES key is also used to wrap the private key material.
     * The wrapped temporary AES key and the wrapped exportable key material are concatenated, producing concatenated blob output that jointly represents them.
     * {@code RSA_OAEP_SHA256} means that the exportable key material is wrapped by the vault's RSA public wrapping key.
     *
     * @return the value
     **/
    public WrappingAlgorithm getWrappingAlgorithm() {
        return wrappingAlgorithm;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("WrappedImportKey(");
        sb.append("keyMaterial=").append(String.valueOf(this.keyMaterial));
        sb.append(", wrappingAlgorithm=").append(String.valueOf(this.wrappingAlgorithm));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WrappedImportKey)) {
            return false;
        }

        WrappedImportKey other = (WrappedImportKey) o;
        return java.util.Objects.equals(this.keyMaterial, other.keyMaterial)
                && java.util.Objects.equals(this.wrappingAlgorithm, other.wrappingAlgorithm)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyMaterial == null ? 43 : this.keyMaterial.hashCode());
        result =
                (result * PRIME)
                        + (this.wrappingAlgorithm == null ? 43 : this.wrappingAlgorithm.hashCode());
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
