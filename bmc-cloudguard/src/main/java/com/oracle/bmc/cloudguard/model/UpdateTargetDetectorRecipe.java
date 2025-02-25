/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information to be updated in attached Target DetectorRecipe
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
    builder = UpdateTargetDetectorRecipe.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateTargetDetectorRecipe {
    @Deprecated
    @java.beans.ConstructorProperties({"targetDetectorRecipeId", "detectorRules"})
    public UpdateTargetDetectorRecipe(
            String targetDetectorRecipeId,
            java.util.List<UpdateTargetRecipeDetectorRuleDetails> detectorRules) {
        super();
        this.targetDetectorRecipeId = targetDetectorRecipeId;
        this.detectorRules = detectorRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Identifier for DetectorRecipe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetDetectorRecipeId")
        private String targetDetectorRecipeId;

        /**
         * Identifier for DetectorRecipe.
         * @param targetDetectorRecipeId the value to set
         * @return this builder
         **/
        public Builder targetDetectorRecipeId(String targetDetectorRecipeId) {
            this.targetDetectorRecipeId = targetDetectorRecipeId;
            this.__explicitlySet__.add("targetDetectorRecipeId");
            return this;
        }
        /**
         * Updates to be applied to Detector Rule associated with the target
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
        private java.util.List<UpdateTargetRecipeDetectorRuleDetails> detectorRules;

        /**
         * Updates to be applied to Detector Rule associated with the target
         * @param detectorRules the value to set
         * @return this builder
         **/
        public Builder detectorRules(
                java.util.List<UpdateTargetRecipeDetectorRuleDetails> detectorRules) {
            this.detectorRules = detectorRules;
            this.__explicitlySet__.add("detectorRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTargetDetectorRecipe build() {
            UpdateTargetDetectorRecipe __instance__ =
                    new UpdateTargetDetectorRecipe(targetDetectorRecipeId, detectorRules);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTargetDetectorRecipe o) {
            Builder copiedBuilder =
                    targetDetectorRecipeId(o.getTargetDetectorRecipeId())
                            .detectorRules(o.getDetectorRules());

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
     * Identifier for DetectorRecipe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetDetectorRecipeId")
    private final String targetDetectorRecipeId;

    /**
     * Identifier for DetectorRecipe.
     * @return the value
     **/
    public String getTargetDetectorRecipeId() {
        return targetDetectorRecipeId;
    }

    /**
     * Updates to be applied to Detector Rule associated with the target
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
    private final java.util.List<UpdateTargetRecipeDetectorRuleDetails> detectorRules;

    /**
     * Updates to be applied to Detector Rule associated with the target
     * @return the value
     **/
    public java.util.List<UpdateTargetRecipeDetectorRuleDetails> getDetectorRules() {
        return detectorRules;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateTargetDetectorRecipe(");
        sb.append("targetDetectorRecipeId=").append(String.valueOf(this.targetDetectorRecipeId));
        sb.append(", detectorRules=").append(String.valueOf(this.detectorRules));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTargetDetectorRecipe)) {
            return false;
        }

        UpdateTargetDetectorRecipe other = (UpdateTargetDetectorRecipe) o;
        return java.util.Objects.equals(this.targetDetectorRecipeId, other.targetDetectorRecipeId)
                && java.util.Objects.equals(this.detectorRules, other.detectorRules)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.targetDetectorRecipeId == null
                                ? 43
                                : this.targetDetectorRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRules == null ? 43 : this.detectorRules.hashCode());
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
