/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Configuration details for the BROWSER monitor type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BrowserMonitorConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BrowserMonitorConfiguration extends MonitorConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isFailureRetried")
        private Boolean isFailureRetried;

        public Builder isFailureRetried(Boolean isFailureRetried) {
            this.isFailureRetried = isFailureRetried;
            this.__explicitlySet__.add("isFailureRetried");
            return this;
        }
        /**
         * If certificate validation is enabled, then the call will fail in case of certification errors.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCertificateValidationEnabled")
        private Boolean isCertificateValidationEnabled;

        /**
         * If certificate validation is enabled, then the call will fail in case of certification errors.
         * @param isCertificateValidationEnabled the value to set
         * @return this builder
         **/
        public Builder isCertificateValidationEnabled(Boolean isCertificateValidationEnabled) {
            this.isCertificateValidationEnabled = isCertificateValidationEnabled;
            this.__explicitlySet__.add("isCertificateValidationEnabled");
            return this;
        }
        /**
         * Verifies all the search strings present in the response.
         * If any search string is not present in the response, then it will be considered as a failure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("verifyTexts")
        private java.util.List<VerifyText> verifyTexts;

        /**
         * Verifies all the search strings present in the response.
         * If any search string is not present in the response, then it will be considered as a failure.
         *
         * @param verifyTexts the value to set
         * @return this builder
         **/
        public Builder verifyTexts(java.util.List<VerifyText> verifyTexts) {
            this.verifyTexts = verifyTexts;
            this.__explicitlySet__.add("verifyTexts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
        private NetworkConfiguration networkConfiguration;

        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            this.__explicitlySet__.add("networkConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BrowserMonitorConfiguration build() {
            BrowserMonitorConfiguration __instance__ =
                    new BrowserMonitorConfiguration(
                            isFailureRetried,
                            isCertificateValidationEnabled,
                            verifyTexts,
                            networkConfiguration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BrowserMonitorConfiguration o) {
            Builder copiedBuilder =
                    isFailureRetried(o.getIsFailureRetried())
                            .isCertificateValidationEnabled(o.getIsCertificateValidationEnabled())
                            .verifyTexts(o.getVerifyTexts())
                            .networkConfiguration(o.getNetworkConfiguration());

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
    public BrowserMonitorConfiguration(
            Boolean isFailureRetried,
            Boolean isCertificateValidationEnabled,
            java.util.List<VerifyText> verifyTexts,
            NetworkConfiguration networkConfiguration) {
        super(isFailureRetried);
        this.isCertificateValidationEnabled = isCertificateValidationEnabled;
        this.verifyTexts = verifyTexts;
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * If certificate validation is enabled, then the call will fail in case of certification errors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCertificateValidationEnabled")
    private final Boolean isCertificateValidationEnabled;

    /**
     * If certificate validation is enabled, then the call will fail in case of certification errors.
     * @return the value
     **/
    public Boolean getIsCertificateValidationEnabled() {
        return isCertificateValidationEnabled;
    }

    /**
     * Verifies all the search strings present in the response.
     * If any search string is not present in the response, then it will be considered as a failure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyTexts")
    private final java.util.List<VerifyText> verifyTexts;

    /**
     * Verifies all the search strings present in the response.
     * If any search string is not present in the response, then it will be considered as a failure.
     *
     * @return the value
     **/
    public java.util.List<VerifyText> getVerifyTexts() {
        return verifyTexts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
    private final NetworkConfiguration networkConfiguration;

    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BrowserMonitorConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append(", isCertificateValidationEnabled=")
                .append(String.valueOf(this.isCertificateValidationEnabled));
        sb.append(", verifyTexts=").append(String.valueOf(this.verifyTexts));
        sb.append(", networkConfiguration=").append(String.valueOf(this.networkConfiguration));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BrowserMonitorConfiguration)) {
            return false;
        }

        BrowserMonitorConfiguration other = (BrowserMonitorConfiguration) o;
        return java.util.Objects.equals(
                        this.isCertificateValidationEnabled, other.isCertificateValidationEnabled)
                && java.util.Objects.equals(this.verifyTexts, other.verifyTexts)
                && java.util.Objects.equals(this.networkConfiguration, other.networkConfiguration)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isCertificateValidationEnabled == null
                                ? 43
                                : this.isCertificateValidationEnabled.hashCode());
        result = (result * PRIME) + (this.verifyTexts == null ? 43 : this.verifyTexts.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfiguration == null
                                ? 43
                                : this.networkConfiguration.hashCode());
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
