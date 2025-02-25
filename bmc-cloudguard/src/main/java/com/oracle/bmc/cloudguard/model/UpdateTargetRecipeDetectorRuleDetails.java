/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The details to be updated in TargetDetectorRecipeDetectorRule
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateTargetRecipeDetectorRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateTargetRecipeDetectorRuleDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"detectorRuleId", "details"})
    public UpdateTargetRecipeDetectorRuleDetails(
            String detectorRuleId, UpdateTargetDetectorRuleDetails details) {
        super();
        this.detectorRuleId = detectorRuleId;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Identifier for DetectorRule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
        private String detectorRuleId;

        /**
         * Identifier for DetectorRule.
         * @param detectorRuleId the value to set
         * @return this builder
         **/
        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = detectorRuleId;
            this.__explicitlySet__.add("detectorRuleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private UpdateTargetDetectorRuleDetails details;

        public Builder details(UpdateTargetDetectorRuleDetails details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTargetRecipeDetectorRuleDetails build() {
            UpdateTargetRecipeDetectorRuleDetails __instance__ =
                    new UpdateTargetRecipeDetectorRuleDetails(detectorRuleId, details);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTargetRecipeDetectorRuleDetails o) {
            Builder copiedBuilder = detectorRuleId(o.getDetectorRuleId()).details(o.getDetails());

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
     * Identifier for DetectorRule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
    private final String detectorRuleId;

    /**
     * Identifier for DetectorRule.
     * @return the value
     **/
    public String getDetectorRuleId() {
        return detectorRuleId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final UpdateTargetDetectorRuleDetails details;

    public UpdateTargetDetectorRuleDetails getDetails() {
        return details;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateTargetRecipeDetectorRuleDetails(");
        sb.append("detectorRuleId=").append(String.valueOf(this.detectorRuleId));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTargetRecipeDetectorRuleDetails)) {
            return false;
        }

        UpdateTargetRecipeDetectorRuleDetails other = (UpdateTargetRecipeDetectorRuleDetails) o;
        return java.util.Objects.equals(this.detectorRuleId, other.detectorRuleId)
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.detectorRuleId == null ? 43 : this.detectorRuleId.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
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
