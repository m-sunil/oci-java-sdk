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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LaunchEligibility.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LaunchEligibility {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isLaunchAllowed")
        private Boolean isLaunchAllowed;

        public Builder isLaunchAllowed(Boolean isLaunchAllowed) {
            this.isLaunchAllowed = isLaunchAllowed;
            this.__explicitlySet__.add("isLaunchAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("meters")
        private String meters;

        public Builder meters(String meters) {
            this.meters = meters;
            this.__explicitlySet__.add("meters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ineligibilityReason")
        private IneligibilityReasonEnum ineligibilityReason;

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

    /**
     * PIC Image ID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    String imageId;

    /**
     * Is the tenant permitted to launch the PIC image
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLaunchAllowed")
    Boolean isLaunchAllowed;

    /**
     * related meters for the PIC image
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("meters")
    String meters;

    /**
     * Reason the account is ineligible to launch paid listings
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ineligibilityReason")
    IneligibilityReasonEnum ineligibilityReason;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
