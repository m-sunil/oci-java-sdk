/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details required to save a user assessment.
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
    builder = CreateUserAssessmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateUserAssessmentDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "description",
        "displayName",
        "schedule",
        "targetId",
        "freeformTags",
        "definedTags"
    })
    public CreateUserAssessmentDetails(
            String compartmentId,
            String description,
            String displayName,
            String schedule,
            String targetId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.description = description;
        this.displayName = displayName;
        this.schedule = schedule;
        this.targetId = targetId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment that contains the user assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the user assessment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The description of the user assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the user assessment.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The display name of the user assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the user assessment.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * To schedule the assessment for saving periodically, specify the schedule in this attribute.
         * Create or schedule one assessment per compartment. If not defined, the assessment runs immediately.
         *  Format -
         *   <version-string>;<version-specific-schedule>
         * <p>
         * Allowed version strings - "v1"
         *   v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
         *   Each of the above fields potentially introduce constraints. A workrequest is created only
         *   when clock time satisfies all the constraints. Constraints introduced:
         *   1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
         *   2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
         *   3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
         *   <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
         *   4. No constraint introduced when it is '*'. When not, day of week must equal the given value
         *   <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
         *   5. No constraint introduced when it is '*'. When not, day of month must equal the given value
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        /**
         * To schedule the assessment for saving periodically, specify the schedule in this attribute.
         * Create or schedule one assessment per compartment. If not defined, the assessment runs immediately.
         *  Format -
         *   <version-string>;<version-specific-schedule>
         * <p>
         * Allowed version strings - "v1"
         *   v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
         *   Each of the above fields potentially introduce constraints. A workrequest is created only
         *   when clock time satisfies all the constraints. Constraints introduced:
         *   1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
         *   2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
         *   3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
         *   <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
         *   4. No constraint introduced when it is '*'. When not, day of week must equal the given value
         *   <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
         *   5. No constraint introduced when it is '*'. When not, day of month must equal the given value
         *
         * @param schedule the value to set
         * @return this builder
         **/
        public Builder schedule(String schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }
        /**
         * The OCID of the target database on which the user assessment is to be run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database on which the user assessment is to be run.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateUserAssessmentDetails build() {
            CreateUserAssessmentDetails __instance__ =
                    new CreateUserAssessmentDetails(
                            compartmentId,
                            description,
                            displayName,
                            schedule,
                            targetId,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateUserAssessmentDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .schedule(o.getSchedule())
                            .targetId(o.getTargetId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The OCID of the compartment that contains the user assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the user assessment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The description of the user assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the user assessment.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The display name of the user assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the user assessment.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * To schedule the assessment for saving periodically, specify the schedule in this attribute.
     * Create or schedule one assessment per compartment. If not defined, the assessment runs immediately.
     *  Format -
     *   <version-string>;<version-specific-schedule>
     * <p>
     * Allowed version strings - "v1"
     *   v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
     *   Each of the above fields potentially introduce constraints. A workrequest is created only
     *   when clock time satisfies all the constraints. Constraints introduced:
     *   1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
     *   2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
     *   3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
     *   <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
     *   4. No constraint introduced when it is '*'. When not, day of week must equal the given value
     *   <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
     *   5. No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    /**
     * To schedule the assessment for saving periodically, specify the schedule in this attribute.
     * Create or schedule one assessment per compartment. If not defined, the assessment runs immediately.
     *  Format -
     *   <version-string>;<version-specific-schedule>
     * <p>
     * Allowed version strings - "v1"
     *   v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
     *   Each of the above fields potentially introduce constraints. A workrequest is created only
     *   when clock time satisfies all the constraints. Constraints introduced:
     *   1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
     *   2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
     *   3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
     *   <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
     *   4. No constraint introduced when it is '*'. When not, day of week must equal the given value
     *   <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
     *   5. No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     * @return the value
     **/
    public String getSchedule() {
        return schedule;
    }

    /**
     * The OCID of the target database on which the user assessment is to be run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database on which the user assessment is to be run.
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateUserAssessmentDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateUserAssessmentDetails)) {
            return false;
        }

        CreateUserAssessmentDetails other = (CreateUserAssessmentDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
