/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details required to modify the global settings in Data Safe.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ModifyGlobalSettingsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModifyGlobalSettingsDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isPaidUsage",
        "onlineRetentionPeriod",
        "offlineRetentionPeriod"
    })
    public ModifyGlobalSettingsDetails(
            Boolean isPaidUsage, Integer onlineRetentionPeriod, Integer offlineRetentionPeriod) {
        super();
        this.isPaidUsage = isPaidUsage;
        this.onlineRetentionPeriod = onlineRetentionPeriod;
        this.offlineRetentionPeriod = offlineRetentionPeriod;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The paid usage option chosen by the customer admin.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsage")
        private Boolean isPaidUsage;

        /**
         * The paid usage option chosen by the customer admin.
         * @param isPaidUsage the value to set
         * @return this builder
         **/
        public Builder isPaidUsage(Boolean isPaidUsage) {
            this.isPaidUsage = isPaidUsage;
            this.__explicitlySet__.add("isPaidUsage");
            return this;
        }
        /**
         * The online retention period in months.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("onlineRetentionPeriod")
        private Integer onlineRetentionPeriod;

        /**
         * The online retention period in months.
         * @param onlineRetentionPeriod the value to set
         * @return this builder
         **/
        public Builder onlineRetentionPeriod(Integer onlineRetentionPeriod) {
            this.onlineRetentionPeriod = onlineRetentionPeriod;
            this.__explicitlySet__.add("onlineRetentionPeriod");
            return this;
        }
        /**
         * The offline retention period in months.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offlineRetentionPeriod")
        private Integer offlineRetentionPeriod;

        /**
         * The offline retention period in months.
         * @param offlineRetentionPeriod the value to set
         * @return this builder
         **/
        public Builder offlineRetentionPeriod(Integer offlineRetentionPeriod) {
            this.offlineRetentionPeriod = offlineRetentionPeriod;
            this.__explicitlySet__.add("offlineRetentionPeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModifyGlobalSettingsDetails build() {
            ModifyGlobalSettingsDetails __instance__ =
                    new ModifyGlobalSettingsDetails(
                            isPaidUsage, onlineRetentionPeriod, offlineRetentionPeriod);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModifyGlobalSettingsDetails o) {
            Builder copiedBuilder =
                    isPaidUsage(o.getIsPaidUsage())
                            .onlineRetentionPeriod(o.getOnlineRetentionPeriod())
                            .offlineRetentionPeriod(o.getOfflineRetentionPeriod());

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
     * The paid usage option chosen by the customer admin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsage")
    private final Boolean isPaidUsage;

    /**
     * The paid usage option chosen by the customer admin.
     * @return the value
     **/
    public Boolean getIsPaidUsage() {
        return isPaidUsage;
    }

    /**
     * The online retention period in months.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onlineRetentionPeriod")
    private final Integer onlineRetentionPeriod;

    /**
     * The online retention period in months.
     * @return the value
     **/
    public Integer getOnlineRetentionPeriod() {
        return onlineRetentionPeriod;
    }

    /**
     * The offline retention period in months.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offlineRetentionPeriod")
    private final Integer offlineRetentionPeriod;

    /**
     * The offline retention period in months.
     * @return the value
     **/
    public Integer getOfflineRetentionPeriod() {
        return offlineRetentionPeriod;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ModifyGlobalSettingsDetails(");
        sb.append("isPaidUsage=").append(String.valueOf(this.isPaidUsage));
        sb.append(", onlineRetentionPeriod=").append(String.valueOf(this.onlineRetentionPeriod));
        sb.append(", offlineRetentionPeriod=").append(String.valueOf(this.offlineRetentionPeriod));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModifyGlobalSettingsDetails)) {
            return false;
        }

        ModifyGlobalSettingsDetails other = (ModifyGlobalSettingsDetails) o;
        return java.util.Objects.equals(this.isPaidUsage, other.isPaidUsage)
                && java.util.Objects.equals(this.onlineRetentionPeriod, other.onlineRetentionPeriod)
                && java.util.Objects.equals(
                        this.offlineRetentionPeriod, other.offlineRetentionPeriod)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isPaidUsage == null ? 43 : this.isPaidUsage.hashCode());
        result =
                (result * PRIME)
                        + (this.onlineRetentionPeriod == null
                                ? 43
                                : this.onlineRetentionPeriod.hashCode());
        result =
                (result * PRIME)
                        + (this.offlineRetentionPeriod == null
                                ? 43
                                : this.offlineRetentionPeriod.hashCode());
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
