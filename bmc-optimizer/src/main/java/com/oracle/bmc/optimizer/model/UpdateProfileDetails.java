/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * Details for updating a profile.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateProfileDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateProfileDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "aggregationIntervalInDays",
        "definedTags",
        "freeformTags",
        "levelsConfiguration",
        "targetCompartments",
        "targetTags",
        "name"
    })
    public UpdateProfileDetails(
            String description,
            Integer aggregationIntervalInDays,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            LevelsConfiguration levelsConfiguration,
            TargetCompartments targetCompartments,
            TargetTags targetTags,
            String name) {
        super();
        this.description = description;
        this.aggregationIntervalInDays = aggregationIntervalInDays;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.levelsConfiguration = levelsConfiguration;
        this.targetCompartments = targetCompartments;
        this.targetTags = targetTags;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Text describing the profile. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Text describing the profile. Avoid entering confidential information.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The time period over which to collect data for the recommendations, measured in number of days.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aggregationIntervalInDays")
        private Integer aggregationIntervalInDays;

        /**
         * The time period over which to collect data for the recommendations, measured in number of days.
         * @param aggregationIntervalInDays the value to set
         * @return this builder
         **/
        public Builder aggregationIntervalInDays(Integer aggregationIntervalInDays) {
            this.aggregationIntervalInDays = aggregationIntervalInDays;
            this.__explicitlySet__.add("aggregationIntervalInDays");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Simple key-value pair applied without any predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Exists for cross-compatibility only.
         * <p>
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair applied without any predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Exists for cross-compatibility only.
         * <p>
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("levelsConfiguration")
        private LevelsConfiguration levelsConfiguration;

        public Builder levelsConfiguration(LevelsConfiguration levelsConfiguration) {
            this.levelsConfiguration = levelsConfiguration;
            this.__explicitlySet__.add("levelsConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetCompartments")
        private TargetCompartments targetCompartments;

        public Builder targetCompartments(TargetCompartments targetCompartments) {
            this.targetCompartments = targetCompartments;
            this.__explicitlySet__.add("targetCompartments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetTags")
        private TargetTags targetTags;

        public Builder targetTags(TargetTags targetTags) {
            this.targetTags = targetTags;
            this.__explicitlySet__.add("targetTags");
            return this;
        }
        /**
         * The name assigned to the profile. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name assigned to the profile. Avoid entering confidential information.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateProfileDetails build() {
            UpdateProfileDetails __instance__ =
                    new UpdateProfileDetails(
                            description,
                            aggregationIntervalInDays,
                            definedTags,
                            freeformTags,
                            levelsConfiguration,
                            targetCompartments,
                            targetTags,
                            name);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateProfileDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .aggregationIntervalInDays(o.getAggregationIntervalInDays())
                            .definedTags(o.getDefinedTags())
                            .freeformTags(o.getFreeformTags())
                            .levelsConfiguration(o.getLevelsConfiguration())
                            .targetCompartments(o.getTargetCompartments())
                            .targetTags(o.getTargetTags())
                            .name(o.getName());

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
     * Text describing the profile. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Text describing the profile. Avoid entering confidential information.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The time period over which to collect data for the recommendations, measured in number of days.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregationIntervalInDays")
    private final Integer aggregationIntervalInDays;

    /**
     * The time period over which to collect data for the recommendations, measured in number of days.
     * @return the value
     **/
    public Integer getAggregationIntervalInDays() {
        return aggregationIntervalInDays;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Simple key-value pair applied without any predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Exists for cross-compatibility only.
     * <p>
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair applied without any predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Exists for cross-compatibility only.
     * <p>
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("levelsConfiguration")
    private final LevelsConfiguration levelsConfiguration;

    public LevelsConfiguration getLevelsConfiguration() {
        return levelsConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetCompartments")
    private final TargetCompartments targetCompartments;

    public TargetCompartments getTargetCompartments() {
        return targetCompartments;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetTags")
    private final TargetTags targetTags;

    public TargetTags getTargetTags() {
        return targetTags;
    }

    /**
     * The name assigned to the profile. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name assigned to the profile. Avoid entering confidential information.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateProfileDetails(");
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", aggregationIntervalInDays=")
                .append(String.valueOf(this.aggregationIntervalInDays));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", levelsConfiguration=").append(String.valueOf(this.levelsConfiguration));
        sb.append(", targetCompartments=").append(String.valueOf(this.targetCompartments));
        sb.append(", targetTags=").append(String.valueOf(this.targetTags));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateProfileDetails)) {
            return false;
        }

        UpdateProfileDetails other = (UpdateProfileDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.aggregationIntervalInDays, other.aggregationIntervalInDays)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.levelsConfiguration, other.levelsConfiguration)
                && java.util.Objects.equals(this.targetCompartments, other.targetCompartments)
                && java.util.Objects.equals(this.targetTags, other.targetTags)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregationIntervalInDays == null
                                ? 43
                                : this.aggregationIntervalInDays.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.levelsConfiguration == null
                                ? 43
                                : this.levelsConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.targetCompartments == null
                                ? 43
                                : this.targetCompartments.hashCode());
        result = (result * PRIME) + (this.targetTags == null ? 43 : this.targetTags.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
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
