/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The summary of a security assessment.
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
    builder = SecurityAssessmentSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SecurityAssessmentSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "description",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "compartmentId",
        "displayName",
        "targetIds",
        "ignoredTargetIds",
        "ignoredAssessmentIds",
        "isBaseline",
        "isDeviatedFromBaseline",
        "lastComparedBaselineId",
        "scheduleSecurityAssessmentId",
        "schedule",
        "triggeredBy",
        "link",
        "type",
        "statistics",
        "freeformTags",
        "definedTags"
    })
    public SecurityAssessmentSummary(
            String id,
            String description,
            SecurityAssessmentLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String compartmentId,
            String displayName,
            java.util.List<String> targetIds,
            java.util.List<Object> ignoredTargetIds,
            java.util.List<Object> ignoredAssessmentIds,
            Boolean isBaseline,
            Boolean isDeviatedFromBaseline,
            String lastComparedBaselineId,
            String scheduleSecurityAssessmentId,
            String schedule,
            TriggeredBy triggeredBy,
            String link,
            Type type,
            SecurityAssessmentStatistics statistics,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.description = description;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.targetIds = targetIds;
        this.ignoredTargetIds = ignoredTargetIds;
        this.ignoredAssessmentIds = ignoredAssessmentIds;
        this.isBaseline = isBaseline;
        this.isDeviatedFromBaseline = isDeviatedFromBaseline;
        this.lastComparedBaselineId = lastComparedBaselineId;
        this.scheduleSecurityAssessmentId = scheduleSecurityAssessmentId;
        this.schedule = schedule;
        this.triggeredBy = triggeredBy;
        this.link = link;
        this.type = type;
        this.statistics = statistics;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the security assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the security assessment.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The description of the security assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the security assessment.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The current state of the security assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SecurityAssessmentLifecycleState lifecycleState;

        /**
         * The current state of the security assessment.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(SecurityAssessmentLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Details about the current state of the security assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the security assessment.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time when the security assessment was created. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when the security assessment was created. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time when the security assessment was last updated. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time when the security assessment was last updated. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The OCID of the compartment that contains the security assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the security assessment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The display name of the security assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the security assessment.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Array of database target OCIDs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
        private java.util.List<String> targetIds;

        /**
         * Array of database target OCIDs.
         * @param targetIds the value to set
         * @return this builder
         **/
        public Builder targetIds(java.util.List<String> targetIds) {
            this.targetIds = targetIds;
            this.__explicitlySet__.add("targetIds");
            return this;
        }
        /**
         * List containing maps as values.
         * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ignoredTargetIds")
        private java.util.List<Object> ignoredTargetIds;

        /**
         * List containing maps as values.
         * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
         *
         * @param ignoredTargetIds the value to set
         * @return this builder
         **/
        public Builder ignoredTargetIds(java.util.List<Object> ignoredTargetIds) {
            this.ignoredTargetIds = ignoredTargetIds;
            this.__explicitlySet__.add("ignoredTargetIds");
            return this;
        }
        /**
         * List containing maps as values.
         * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ignoredAssessmentIds")
        private java.util.List<Object> ignoredAssessmentIds;

        /**
         * List containing maps as values.
         * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
         *
         * @param ignoredAssessmentIds the value to set
         * @return this builder
         **/
        public Builder ignoredAssessmentIds(java.util.List<Object> ignoredAssessmentIds) {
            this.ignoredAssessmentIds = ignoredAssessmentIds;
            this.__explicitlySet__.add("ignoredAssessmentIds");
            return this;
        }
        /**
         * Indicates whether or not the assessment is a baseline assessment. This applied to saved security assessments only.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBaseline")
        private Boolean isBaseline;

        /**
         * Indicates whether or not the assessment is a baseline assessment. This applied to saved security assessments only.
         * @param isBaseline the value to set
         * @return this builder
         **/
        public Builder isBaseline(Boolean isBaseline) {
            this.isBaseline = isBaseline;
            this.__explicitlySet__.add("isBaseline");
            return this;
        }
        /**
         * Indicates whether or not the security assessment deviates from the baseline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDeviatedFromBaseline")
        private Boolean isDeviatedFromBaseline;

        /**
         * Indicates whether or not the security assessment deviates from the baseline.
         * @param isDeviatedFromBaseline the value to set
         * @return this builder
         **/
        public Builder isDeviatedFromBaseline(Boolean isDeviatedFromBaseline) {
            this.isDeviatedFromBaseline = isDeviatedFromBaseline;
            this.__explicitlySet__.add("isDeviatedFromBaseline");
            return this;
        }
        /**
         * The OCID of the baseline against which the latest assessment was compared.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastComparedBaselineId")
        private String lastComparedBaselineId;

        /**
         * The OCID of the baseline against which the latest assessment was compared.
         * @param lastComparedBaselineId the value to set
         * @return this builder
         **/
        public Builder lastComparedBaselineId(String lastComparedBaselineId) {
            this.lastComparedBaselineId = lastComparedBaselineId;
            this.__explicitlySet__.add("lastComparedBaselineId");
            return this;
        }
        /**
         * The OCID of the security assessment that created this scheduled save assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleSecurityAssessmentId")
        private String scheduleSecurityAssessmentId;

        /**
         * The OCID of the security assessment that created this scheduled save assessment.
         * @param scheduleSecurityAssessmentId the value to set
         * @return this builder
         **/
        public Builder scheduleSecurityAssessmentId(String scheduleSecurityAssessmentId) {
            this.scheduleSecurityAssessmentId = scheduleSecurityAssessmentId;
            this.__explicitlySet__.add("scheduleSecurityAssessmentId");
            return this;
        }
        /**
         * Schedule of the assessment that runs periodically in the specified format: -
         * <version-string>;<version-specific-schedule>
         * <p>
         * Allowed version strings - "v1"
         * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
         * Each of the above fields potentially introduce constraints. A workrequest is created only
         * when clock time satisfies all the constraints. Constraints introduced:
         * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
         * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
         * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
         * <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
         * 4. No constraint introduced when it is '*'. When not, day of week must equal the given value
         * <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
         * 5. No constraint introduced when it is '*'. When not, day of month must equal the given value
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        /**
         * Schedule of the assessment that runs periodically in the specified format: -
         * <version-string>;<version-specific-schedule>
         * <p>
         * Allowed version strings - "v1"
         * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
         * Each of the above fields potentially introduce constraints. A workrequest is created only
         * when clock time satisfies all the constraints. Constraints introduced:
         * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
         * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
         * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
         * <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
         * 4. No constraint introduced when it is '*'. When not, day of week must equal the given value
         * <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
         * 5. No constraint introduced when it is '*'. When not, day of month must equal the given value
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
         * Indicates whether the security assessment was created by system or by a user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("triggeredBy")
        private TriggeredBy triggeredBy;

        /**
         * Indicates whether the security assessment was created by system or by a user.
         * @param triggeredBy the value to set
         * @return this builder
         **/
        public Builder triggeredBy(TriggeredBy triggeredBy) {
            this.triggeredBy = triggeredBy;
            this.__explicitlySet__.add("triggeredBy");
            return this;
        }
        /**
         * The summary of findings for the security assessment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("link")
        private String link;

        /**
         * The summary of findings for the security assessment.
         *
         * @param link the value to set
         * @return this builder
         **/
        public Builder link(String link) {
            this.link = link;
            this.__explicitlySet__.add("link");
            return this;
        }
        /**
         * The type of the security assessment. Possible values are:
         * <p>
         * LATEST: The most up-to-date assessment that is running automatically for a target. It is system generated.
         * SAVED: A saved security assessment. LATEST assessments are always saved in order to maintain the history of runs. A SAVED assessment is also generated by a 'refresh' action (triggered by the user).
         * SAVE_SCHEDULE: The schedule for periodic saves of LATEST assessments.
         * COMPARTMENT: An automatically managed assessment type that stores all details of targets in one compartment.
         * This type keeps an up-to-date assessment of all database risks in one compartment. It is automatically updated when the latest assessment or refresh action is executed. It is also automatically updated when a target is deleted or move to a different compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of the security assessment. Possible values are:
         * <p>
         * LATEST: The most up-to-date assessment that is running automatically for a target. It is system generated.
         * SAVED: A saved security assessment. LATEST assessments are always saved in order to maintain the history of runs. A SAVED assessment is also generated by a 'refresh' action (triggered by the user).
         * SAVE_SCHEDULE: The schedule for periodic saves of LATEST assessments.
         * COMPARTMENT: An automatically managed assessment type that stores all details of targets in one compartment.
         * This type keeps an up-to-date assessment of all database risks in one compartment. It is automatically updated when the latest assessment or refresh action is executed. It is also automatically updated when a target is deleted or move to a different compartment.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statistics")
        private SecurityAssessmentStatistics statistics;

        public Builder statistics(SecurityAssessmentStatistics statistics) {
            this.statistics = statistics;
            this.__explicitlySet__.add("statistics");
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

        public SecurityAssessmentSummary build() {
            SecurityAssessmentSummary __instance__ =
                    new SecurityAssessmentSummary(
                            id,
                            description,
                            lifecycleState,
                            lifecycleDetails,
                            timeCreated,
                            timeUpdated,
                            compartmentId,
                            displayName,
                            targetIds,
                            ignoredTargetIds,
                            ignoredAssessmentIds,
                            isBaseline,
                            isDeviatedFromBaseline,
                            lastComparedBaselineId,
                            scheduleSecurityAssessmentId,
                            schedule,
                            triggeredBy,
                            link,
                            type,
                            statistics,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityAssessmentSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .description(o.getDescription())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .targetIds(o.getTargetIds())
                            .ignoredTargetIds(o.getIgnoredTargetIds())
                            .ignoredAssessmentIds(o.getIgnoredAssessmentIds())
                            .isBaseline(o.getIsBaseline())
                            .isDeviatedFromBaseline(o.getIsDeviatedFromBaseline())
                            .lastComparedBaselineId(o.getLastComparedBaselineId())
                            .scheduleSecurityAssessmentId(o.getScheduleSecurityAssessmentId())
                            .schedule(o.getSchedule())
                            .triggeredBy(o.getTriggeredBy())
                            .link(o.getLink())
                            .type(o.getType())
                            .statistics(o.getStatistics())
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
     * The OCID of the security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the security assessment.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The description of the security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the security assessment.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The current state of the security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SecurityAssessmentLifecycleState lifecycleState;

    /**
     * The current state of the security assessment.
     * @return the value
     **/
    public SecurityAssessmentLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details about the current state of the security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the security assessment.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time when the security assessment was created. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the security assessment was created. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time when the security assessment was last updated. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time when the security assessment was last updated. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The OCID of the compartment that contains the security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the security assessment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The display name of the security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the security assessment.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Array of database target OCIDs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
    private final java.util.List<String> targetIds;

    /**
     * Array of database target OCIDs.
     * @return the value
     **/
    public java.util.List<String> getTargetIds() {
        return targetIds;
    }

    /**
     * List containing maps as values.
     * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ignoredTargetIds")
    private final java.util.List<Object> ignoredTargetIds;

    /**
     * List containing maps as values.
     * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
     *
     * @return the value
     **/
    public java.util.List<Object> getIgnoredTargetIds() {
        return ignoredTargetIds;
    }

    /**
     * List containing maps as values.
     * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ignoredAssessmentIds")
    private final java.util.List<Object> ignoredAssessmentIds;

    /**
     * List containing maps as values.
     * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
     *
     * @return the value
     **/
    public java.util.List<Object> getIgnoredAssessmentIds() {
        return ignoredAssessmentIds;
    }

    /**
     * Indicates whether or not the assessment is a baseline assessment. This applied to saved security assessments only.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBaseline")
    private final Boolean isBaseline;

    /**
     * Indicates whether or not the assessment is a baseline assessment. This applied to saved security assessments only.
     * @return the value
     **/
    public Boolean getIsBaseline() {
        return isBaseline;
    }

    /**
     * Indicates whether or not the security assessment deviates from the baseline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDeviatedFromBaseline")
    private final Boolean isDeviatedFromBaseline;

    /**
     * Indicates whether or not the security assessment deviates from the baseline.
     * @return the value
     **/
    public Boolean getIsDeviatedFromBaseline() {
        return isDeviatedFromBaseline;
    }

    /**
     * The OCID of the baseline against which the latest assessment was compared.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastComparedBaselineId")
    private final String lastComparedBaselineId;

    /**
     * The OCID of the baseline against which the latest assessment was compared.
     * @return the value
     **/
    public String getLastComparedBaselineId() {
        return lastComparedBaselineId;
    }

    /**
     * The OCID of the security assessment that created this scheduled save assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleSecurityAssessmentId")
    private final String scheduleSecurityAssessmentId;

    /**
     * The OCID of the security assessment that created this scheduled save assessment.
     * @return the value
     **/
    public String getScheduleSecurityAssessmentId() {
        return scheduleSecurityAssessmentId;
    }

    /**
     * Schedule of the assessment that runs periodically in the specified format: -
     * <version-string>;<version-specific-schedule>
     * <p>
     * Allowed version strings - "v1"
     * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
     * Each of the above fields potentially introduce constraints. A workrequest is created only
     * when clock time satisfies all the constraints. Constraints introduced:
     * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
     * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
     * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
     * <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
     * 4. No constraint introduced when it is '*'. When not, day of week must equal the given value
     * <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
     * 5. No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    /**
     * Schedule of the assessment that runs periodically in the specified format: -
     * <version-string>;<version-specific-schedule>
     * <p>
     * Allowed version strings - "v1"
     * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
     * Each of the above fields potentially introduce constraints. A workrequest is created only
     * when clock time satisfies all the constraints. Constraints introduced:
     * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
     * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
     * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
     * <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
     * 4. No constraint introduced when it is '*'. When not, day of week must equal the given value
     * <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
     * 5. No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     * @return the value
     **/
    public String getSchedule() {
        return schedule;
    }

    /**
     * Indicates whether the security assessment was created by system or by a user.
     **/
    public enum TriggeredBy {
        User("USER"),
        System("SYSTEM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TriggeredBy.class);

        private final String value;
        private static java.util.Map<String, TriggeredBy> map;

        static {
            map = new java.util.HashMap<>();
            for (TriggeredBy v : TriggeredBy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TriggeredBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TriggeredBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TriggeredBy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the security assessment was created by system or by a user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("triggeredBy")
    private final TriggeredBy triggeredBy;

    /**
     * Indicates whether the security assessment was created by system or by a user.
     * @return the value
     **/
    public TriggeredBy getTriggeredBy() {
        return triggeredBy;
    }

    /**
     * The summary of findings for the security assessment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    private final String link;

    /**
     * The summary of findings for the security assessment.
     *
     * @return the value
     **/
    public String getLink() {
        return link;
    }

    /**
     * The type of the security assessment. Possible values are:
     * <p>
     * LATEST: The most up-to-date assessment that is running automatically for a target. It is system generated.
     * SAVED: A saved security assessment. LATEST assessments are always saved in order to maintain the history of runs. A SAVED assessment is also generated by a 'refresh' action (triggered by the user).
     * SAVE_SCHEDULE: The schedule for periodic saves of LATEST assessments.
     * COMPARTMENT: An automatically managed assessment type that stores all details of targets in one compartment.
     * This type keeps an up-to-date assessment of all database risks in one compartment. It is automatically updated when the latest assessment or refresh action is executed. It is also automatically updated when a target is deleted or move to a different compartment.
     *
     **/
    public enum Type {
        Latest("LATEST"),
        Saved("SAVED"),
        SaveSchedule("SAVE_SCHEDULE"),
        Compartment("COMPARTMENT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the security assessment. Possible values are:
     * <p>
     * LATEST: The most up-to-date assessment that is running automatically for a target. It is system generated.
     * SAVED: A saved security assessment. LATEST assessments are always saved in order to maintain the history of runs. A SAVED assessment is also generated by a 'refresh' action (triggered by the user).
     * SAVE_SCHEDULE: The schedule for periodic saves of LATEST assessments.
     * COMPARTMENT: An automatically managed assessment type that stores all details of targets in one compartment.
     * This type keeps an up-to-date assessment of all database risks in one compartment. It is automatically updated when the latest assessment or refresh action is executed. It is also automatically updated when a target is deleted or move to a different compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of the security assessment. Possible values are:
     * <p>
     * LATEST: The most up-to-date assessment that is running automatically for a target. It is system generated.
     * SAVED: A saved security assessment. LATEST assessments are always saved in order to maintain the history of runs. A SAVED assessment is also generated by a 'refresh' action (triggered by the user).
     * SAVE_SCHEDULE: The schedule for periodic saves of LATEST assessments.
     * COMPARTMENT: An automatically managed assessment type that stores all details of targets in one compartment.
     * This type keeps an up-to-date assessment of all database risks in one compartment. It is automatically updated when the latest assessment or refresh action is executed. It is also automatically updated when a target is deleted or move to a different compartment.
     *
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("statistics")
    private final SecurityAssessmentStatistics statistics;

    public SecurityAssessmentStatistics getStatistics() {
        return statistics;
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
        sb.append("SecurityAssessmentSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", targetIds=").append(String.valueOf(this.targetIds));
        sb.append(", ignoredTargetIds=").append(String.valueOf(this.ignoredTargetIds));
        sb.append(", ignoredAssessmentIds=").append(String.valueOf(this.ignoredAssessmentIds));
        sb.append(", isBaseline=").append(String.valueOf(this.isBaseline));
        sb.append(", isDeviatedFromBaseline=").append(String.valueOf(this.isDeviatedFromBaseline));
        sb.append(", lastComparedBaselineId=").append(String.valueOf(this.lastComparedBaselineId));
        sb.append(", scheduleSecurityAssessmentId=")
                .append(String.valueOf(this.scheduleSecurityAssessmentId));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", triggeredBy=").append(String.valueOf(this.triggeredBy));
        sb.append(", link=").append(String.valueOf(this.link));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", statistics=").append(String.valueOf(this.statistics));
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
        if (!(o instanceof SecurityAssessmentSummary)) {
            return false;
        }

        SecurityAssessmentSummary other = (SecurityAssessmentSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.targetIds, other.targetIds)
                && java.util.Objects.equals(this.ignoredTargetIds, other.ignoredTargetIds)
                && java.util.Objects.equals(this.ignoredAssessmentIds, other.ignoredAssessmentIds)
                && java.util.Objects.equals(this.isBaseline, other.isBaseline)
                && java.util.Objects.equals(
                        this.isDeviatedFromBaseline, other.isDeviatedFromBaseline)
                && java.util.Objects.equals(
                        this.lastComparedBaselineId, other.lastComparedBaselineId)
                && java.util.Objects.equals(
                        this.scheduleSecurityAssessmentId, other.scheduleSecurityAssessmentId)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(this.triggeredBy, other.triggeredBy)
                && java.util.Objects.equals(this.link, other.link)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.statistics, other.statistics)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.targetIds == null ? 43 : this.targetIds.hashCode());
        result =
                (result * PRIME)
                        + (this.ignoredTargetIds == null ? 43 : this.ignoredTargetIds.hashCode());
        result =
                (result * PRIME)
                        + (this.ignoredAssessmentIds == null
                                ? 43
                                : this.ignoredAssessmentIds.hashCode());
        result = (result * PRIME) + (this.isBaseline == null ? 43 : this.isBaseline.hashCode());
        result =
                (result * PRIME)
                        + (this.isDeviatedFromBaseline == null
                                ? 43
                                : this.isDeviatedFromBaseline.hashCode());
        result =
                (result * PRIME)
                        + (this.lastComparedBaselineId == null
                                ? 43
                                : this.lastComparedBaselineId.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleSecurityAssessmentId == null
                                ? 43
                                : this.scheduleSecurityAssessmentId.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.triggeredBy == null ? 43 : this.triggeredBy.hashCode());
        result = (result * PRIME) + (this.link == null ? 43 : this.link.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.statistics == null ? 43 : this.statistics.hashCode());
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
