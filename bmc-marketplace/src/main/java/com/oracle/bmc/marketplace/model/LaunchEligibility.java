/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Tenant eligibility and other information for launching a PIC image
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LaunchEligibility.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LaunchEligibility {
    @Deprecated
    @java.beans.ConstructorProperties({
        "imageId",
        "isLaunchAllowed",
        "meters",
        "ineligibilityReason"
    })
    public LaunchEligibility(
            String imageId,
            Boolean isLaunchAllowed,
            String meters,
            IneligibilityReasonEnum ineligibilityReason) {
        super();
        this.imageId = imageId;
        this.isLaunchAllowed = isLaunchAllowed;
        this.meters = meters;
        this.ineligibilityReason = ineligibilityReason;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * PIC Image ID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * PIC Image ID
         * @param imageId the value to set
         * @return this builder
         **/
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }
        /**
         * Is the tenant permitted to launch the PIC image
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLaunchAllowed")
        private Boolean isLaunchAllowed;

        /**
         * Is the tenant permitted to launch the PIC image
         * @param isLaunchAllowed the value to set
         * @return this builder
         **/
        public Builder isLaunchAllowed(Boolean isLaunchAllowed) {
            this.isLaunchAllowed = isLaunchAllowed;
            this.__explicitlySet__.add("isLaunchAllowed");
            return this;
        }
        /**
         * related meters for the PIC image
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("meters")
        private String meters;

        /**
         * related meters for the PIC image
         * @param meters the value to set
         * @return this builder
         **/
        public Builder meters(String meters) {
            this.meters = meters;
            this.__explicitlySet__.add("meters");
            return this;
        }
        /**
         * Reason the account is ineligible to launch paid listings
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ineligibilityReason")
        private IneligibilityReasonEnum ineligibilityReason;

        /**
         * Reason the account is ineligible to launch paid listings
         * @param ineligibilityReason the value to set
         * @return this builder
         **/
        public Builder ineligibilityReason(IneligibilityReasonEnum ineligibilityReason) {
            this.ineligibilityReason = ineligibilityReason;
            this.__explicitlySet__.add("ineligibilityReason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LaunchEligibility build() {
            LaunchEligibility __instance__ =
                    new LaunchEligibility(imageId, isLaunchAllowed, meters, ineligibilityReason);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LaunchEligibility o) {
            Builder copiedBuilder =
                    imageId(o.getImageId())
                            .isLaunchAllowed(o.getIsLaunchAllowed())
                            .meters(o.getMeters())
                            .ineligibilityReason(o.getIneligibilityReason());

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
     * PIC Image ID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * PIC Image ID
     * @return the value
     **/
    public String getImageId() {
        return imageId;
    }

    /**
     * Is the tenant permitted to launch the PIC image
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLaunchAllowed")
    private final Boolean isLaunchAllowed;

    /**
     * Is the tenant permitted to launch the PIC image
     * @return the value
     **/
    public Boolean getIsLaunchAllowed() {
        return isLaunchAllowed;
    }

    /**
     * related meters for the PIC image
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("meters")
    private final String meters;

    /**
     * related meters for the PIC image
     * @return the value
     **/
    public String getMeters() {
        return meters;
    }

    /**
     * Reason the account is ineligible to launch paid listings
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ineligibilityReason")
    private final IneligibilityReasonEnum ineligibilityReason;

    /**
     * Reason the account is ineligible to launch paid listings
     * @return the value
     **/
    public IneligibilityReasonEnum getIneligibilityReason() {
        return ineligibilityReason;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LaunchEligibility(");
        sb.append("imageId=").append(String.valueOf(this.imageId));
        sb.append(", isLaunchAllowed=").append(String.valueOf(this.isLaunchAllowed));
        sb.append(", meters=").append(String.valueOf(this.meters));
        sb.append(", ineligibilityReason=").append(String.valueOf(this.ineligibilityReason));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LaunchEligibility)) {
            return false;
        }

        LaunchEligibility other = (LaunchEligibility) o;
        return java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.isLaunchAllowed, other.isLaunchAllowed)
                && java.util.Objects.equals(this.meters, other.meters)
                && java.util.Objects.equals(this.ineligibilityReason, other.ineligibilityReason)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result =
                (result * PRIME)
                        + (this.isLaunchAllowed == null ? 43 : this.isLaunchAllowed.hashCode());
        result = (result * PRIME) + (this.meters == null ? 43 : this.meters.hashCode());
        result =
                (result * PRIME)
                        + (this.ineligibilityReason == null
                                ? 43
                                : this.ineligibilityReason.hashCode());
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
