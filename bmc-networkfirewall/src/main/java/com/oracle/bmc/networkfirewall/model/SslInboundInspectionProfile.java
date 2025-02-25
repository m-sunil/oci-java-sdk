/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * SSLInboundInspection used on the firewall policy rules.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SslInboundInspectionProfile.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SslInboundInspectionProfile extends DecryptionProfile {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether to block sessions if SSL version is not supported.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUnsupportedVersionBlocked")
        private Boolean isUnsupportedVersionBlocked;

        /**
         * Whether to block sessions if SSL version is not supported.
         * @param isUnsupportedVersionBlocked the value to set
         * @return this builder
         **/
        public Builder isUnsupportedVersionBlocked(Boolean isUnsupportedVersionBlocked) {
            this.isUnsupportedVersionBlocked = isUnsupportedVersionBlocked;
            this.__explicitlySet__.add("isUnsupportedVersionBlocked");
            return this;
        }
        /**
         * Whether to block sessions if SSL cipher suite is not supported.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUnsupportedCipherBlocked")
        private Boolean isUnsupportedCipherBlocked;

        /**
         * Whether to block sessions if SSL cipher suite is not supported.
         * @param isUnsupportedCipherBlocked the value to set
         * @return this builder
         **/
        public Builder isUnsupportedCipherBlocked(Boolean isUnsupportedCipherBlocked) {
            this.isUnsupportedCipherBlocked = isUnsupportedCipherBlocked;
            this.__explicitlySet__.add("isUnsupportedCipherBlocked");
            return this;
        }
        /**
         * Whether to block sessions if the firewall is temporarily unable to decrypt their traffic.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOutOfCapacityBlocked")
        private Boolean isOutOfCapacityBlocked;

        /**
         * Whether to block sessions if the firewall is temporarily unable to decrypt their traffic.
         * @param isOutOfCapacityBlocked the value to set
         * @return this builder
         **/
        public Builder isOutOfCapacityBlocked(Boolean isOutOfCapacityBlocked) {
            this.isOutOfCapacityBlocked = isOutOfCapacityBlocked;
            this.__explicitlySet__.add("isOutOfCapacityBlocked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SslInboundInspectionProfile build() {
            SslInboundInspectionProfile __instance__ =
                    new SslInboundInspectionProfile(
                            isUnsupportedVersionBlocked,
                            isUnsupportedCipherBlocked,
                            isOutOfCapacityBlocked);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SslInboundInspectionProfile o) {
            Builder copiedBuilder =
                    isUnsupportedVersionBlocked(o.getIsUnsupportedVersionBlocked())
                            .isUnsupportedCipherBlocked(o.getIsUnsupportedCipherBlocked())
                            .isOutOfCapacityBlocked(o.getIsOutOfCapacityBlocked());

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
    public SslInboundInspectionProfile(
            Boolean isUnsupportedVersionBlocked,
            Boolean isUnsupportedCipherBlocked,
            Boolean isOutOfCapacityBlocked) {
        super();
        this.isUnsupportedVersionBlocked = isUnsupportedVersionBlocked;
        this.isUnsupportedCipherBlocked = isUnsupportedCipherBlocked;
        this.isOutOfCapacityBlocked = isOutOfCapacityBlocked;
    }

    /**
     * Whether to block sessions if SSL version is not supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnsupportedVersionBlocked")
    private final Boolean isUnsupportedVersionBlocked;

    /**
     * Whether to block sessions if SSL version is not supported.
     * @return the value
     **/
    public Boolean getIsUnsupportedVersionBlocked() {
        return isUnsupportedVersionBlocked;
    }

    /**
     * Whether to block sessions if SSL cipher suite is not supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnsupportedCipherBlocked")
    private final Boolean isUnsupportedCipherBlocked;

    /**
     * Whether to block sessions if SSL cipher suite is not supported.
     * @return the value
     **/
    public Boolean getIsUnsupportedCipherBlocked() {
        return isUnsupportedCipherBlocked;
    }

    /**
     * Whether to block sessions if the firewall is temporarily unable to decrypt their traffic.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOutOfCapacityBlocked")
    private final Boolean isOutOfCapacityBlocked;

    /**
     * Whether to block sessions if the firewall is temporarily unable to decrypt their traffic.
     * @return the value
     **/
    public Boolean getIsOutOfCapacityBlocked() {
        return isOutOfCapacityBlocked;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SslInboundInspectionProfile(");
        sb.append("super=").append(super.toString());
        sb.append(", isUnsupportedVersionBlocked=")
                .append(String.valueOf(this.isUnsupportedVersionBlocked));
        sb.append(", isUnsupportedCipherBlocked=")
                .append(String.valueOf(this.isUnsupportedCipherBlocked));
        sb.append(", isOutOfCapacityBlocked=").append(String.valueOf(this.isOutOfCapacityBlocked));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SslInboundInspectionProfile)) {
            return false;
        }

        SslInboundInspectionProfile other = (SslInboundInspectionProfile) o;
        return java.util.Objects.equals(
                        this.isUnsupportedVersionBlocked, other.isUnsupportedVersionBlocked)
                && java.util.Objects.equals(
                        this.isUnsupportedCipherBlocked, other.isUnsupportedCipherBlocked)
                && java.util.Objects.equals(
                        this.isOutOfCapacityBlocked, other.isOutOfCapacityBlocked)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isUnsupportedVersionBlocked == null
                                ? 43
                                : this.isUnsupportedVersionBlocked.hashCode());
        result =
                (result * PRIME)
                        + (this.isUnsupportedCipherBlocked == null
                                ? 43
                                : this.isUnsupportedCipherBlocked.hashCode());
        result =
                (result * PRIME)
                        + (this.isOutOfCapacityBlocked == null
                                ? 43
                                : this.isOutOfCapacityBlocked.hashCode());
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
