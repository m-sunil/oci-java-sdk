/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Summary of access request.
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
    builder = AccessRequestSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AccessRequestSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "requestId",
        "accessReasonSummary",
        "compartmentId",
        "resourceId",
        "resourceName",
        "resourceType",
        "lifecycleState",
        "timeOfCreation",
        "timeOfModification",
        "timeOfUserCreation",
        "duration",
        "extendDuration",
        "severity",
        "isAutoApproved",
        "freeformTags",
        "definedTags"
    })
    public AccessRequestSummary(
            String id,
            String requestId,
            String accessReasonSummary,
            String compartmentId,
            String resourceId,
            String resourceName,
            ResourceTypes resourceType,
            AccessRequestLifecycleStates lifecycleState,
            java.util.Date timeOfCreation,
            java.util.Date timeOfModification,
            java.util.Date timeOfUserCreation,
            Integer duration,
            Integer extendDuration,
            AccessRequestSeverities severity,
            Boolean isAutoApproved,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.requestId = requestId;
        this.accessReasonSummary = accessReasonSummary;
        this.compartmentId = compartmentId;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.lifecycleState = lifecycleState;
        this.timeOfCreation = timeOfCreation;
        this.timeOfModification = timeOfModification;
        this.timeOfUserCreation = timeOfUserCreation;
        this.duration = duration;
        this.extendDuration = extendDuration;
        this.severity = severity;
        this.isAutoApproved = isAutoApproved;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the access request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the access request.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * This is a system-generated identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestId")
        private String requestId;

        /**
         * This is a system-generated identifier.
         * @param requestId the value to set
         * @return this builder
         **/
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            this.__explicitlySet__.add("requestId");
            return this;
        }
        /**
         * Comment associated with the access request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessReasonSummary")
        private String accessReasonSummary;

        /**
         * Comment associated with the access request.
         * @param accessReasonSummary the value to set
         * @return this builder
         **/
        public Builder accessReasonSummary(String accessReasonSummary) {
            this.accessReasonSummary = accessReasonSummary;
            this.__explicitlySet__.add("accessReasonSummary");
            return this;
        }
        /**
         * The OCID of the compartment that contains the access request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the access request.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the target resource associated with the access request. The operator raises an access request to get approval to
         * access the target resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the target resource associated with the access request. The operator raises an access request to get approval to
         * access the target resource.
         *
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The name of the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The name of the target resource.
         * @param resourceName the value to set
         * @return this builder
         **/
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * resourceType for which the AccessRequest is applicable
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceTypes resourceType;

        /**
         * resourceType for which the AccessRequest is applicable
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(ResourceTypes resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The current state of the AccessRequest.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AccessRequestLifecycleStates lifecycleState;

        /**
         * The current state of the AccessRequest.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(AccessRequestLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Time when the access request was created by the operator user in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfCreation")
        private java.util.Date timeOfCreation;

        /**
         * Time when the access request was created by the operator user in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfCreation the value to set
         * @return this builder
         **/
        public Builder timeOfCreation(java.util.Date timeOfCreation) {
            this.timeOfCreation = timeOfCreation;
            this.__explicitlySet__.add("timeOfCreation");
            return this;
        }
        /**
         * Time when the access request was last modified in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfModification")
        private java.util.Date timeOfModification;

        /**
         * Time when the access request was last modified in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfModification the value to set
         * @return this builder
         **/
        public Builder timeOfModification(java.util.Date timeOfModification) {
            this.timeOfModification = timeOfModification;
            this.__explicitlySet__.add("timeOfModification");
            return this;
        }
        /**
         * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfUserCreation")
        private java.util.Date timeOfUserCreation;

        /**
         * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfUserCreation the value to set
         * @return this builder
         **/
        public Builder timeOfUserCreation(java.util.Date timeOfUserCreation) {
            this.timeOfUserCreation = timeOfUserCreation;
            this.__explicitlySet__.add("timeOfUserCreation");
            return this;
        }
        /**
         * Duration in hours for which access is sought on the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Integer duration;

        /**
         * Duration in hours for which access is sought on the target resource.
         * @param duration the value to set
         * @return this builder
         **/
        public Builder duration(Integer duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }
        /**
         * Duration in hours for which extension access is sought on the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("extendDuration")
        private Integer extendDuration;

        /**
         * Duration in hours for which extension access is sought on the target resource.
         * @param extendDuration the value to set
         * @return this builder
         **/
        public Builder extendDuration(Integer extendDuration) {
            this.extendDuration = extendDuration;
            this.__explicitlySet__.add("extendDuration");
            return this;
        }
        /**
         * Priority assigned to the access request by the operator
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private AccessRequestSeverities severity;

        /**
         * Priority assigned to the access request by the operator
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(AccessRequestSeverities severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * Whether the access request was automatically approved.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
        private Boolean isAutoApproved;

        /**
         * Whether the access request was automatically approved.
         * @param isAutoApproved the value to set
         * @return this builder
         **/
        public Builder isAutoApproved(Boolean isAutoApproved) {
            this.isAutoApproved = isAutoApproved;
            this.__explicitlySet__.add("isAutoApproved");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
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

        public AccessRequestSummary build() {
            AccessRequestSummary __instance__ =
                    new AccessRequestSummary(
                            id,
                            requestId,
                            accessReasonSummary,
                            compartmentId,
                            resourceId,
                            resourceName,
                            resourceType,
                            lifecycleState,
                            timeOfCreation,
                            timeOfModification,
                            timeOfUserCreation,
                            duration,
                            extendDuration,
                            severity,
                            isAutoApproved,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRequestSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .requestId(o.getRequestId())
                            .accessReasonSummary(o.getAccessReasonSummary())
                            .compartmentId(o.getCompartmentId())
                            .resourceId(o.getResourceId())
                            .resourceName(o.getResourceName())
                            .resourceType(o.getResourceType())
                            .lifecycleState(o.getLifecycleState())
                            .timeOfCreation(o.getTimeOfCreation())
                            .timeOfModification(o.getTimeOfModification())
                            .timeOfUserCreation(o.getTimeOfUserCreation())
                            .duration(o.getDuration())
                            .extendDuration(o.getExtendDuration())
                            .severity(o.getSeverity())
                            .isAutoApproved(o.getIsAutoApproved())
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
     * The OCID of the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the access request.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * This is a system-generated identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    private final String requestId;

    /**
     * This is a system-generated identifier.
     * @return the value
     **/
    public String getRequestId() {
        return requestId;
    }

    /**
     * Comment associated with the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessReasonSummary")
    private final String accessReasonSummary;

    /**
     * Comment associated with the access request.
     * @return the value
     **/
    public String getAccessReasonSummary() {
        return accessReasonSummary;
    }

    /**
     * The OCID of the compartment that contains the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the access request.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the target resource associated with the access request. The operator raises an access request to get approval to
     * access the target resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the target resource associated with the access request. The operator raises an access request to get approval to
     * access the target resource.
     *
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The name of the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The name of the target resource.
     * @return the value
     **/
    public String getResourceName() {
        return resourceName;
    }

    /**
     * resourceType for which the AccessRequest is applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceTypes resourceType;

    /**
     * resourceType for which the AccessRequest is applicable
     * @return the value
     **/
    public ResourceTypes getResourceType() {
        return resourceType;
    }

    /**
     * The current state of the AccessRequest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AccessRequestLifecycleStates lifecycleState;

    /**
     * The current state of the AccessRequest.
     * @return the value
     **/
    public AccessRequestLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Time when the access request was created by the operator user in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfCreation")
    private final java.util.Date timeOfCreation;

    /**
     * Time when the access request was created by the operator user in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeOfCreation() {
        return timeOfCreation;
    }

    /**
     * Time when the access request was last modified in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfModification")
    private final java.util.Date timeOfModification;

    /**
     * Time when the access request was last modified in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeOfModification() {
        return timeOfModification;
    }

    /**
     * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfUserCreation")
    private final java.util.Date timeOfUserCreation;

    /**
     * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeOfUserCreation() {
        return timeOfUserCreation;
    }

    /**
     * Duration in hours for which access is sought on the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final Integer duration;

    /**
     * Duration in hours for which access is sought on the target resource.
     * @return the value
     **/
    public Integer getDuration() {
        return duration;
    }

    /**
     * Duration in hours for which extension access is sought on the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendDuration")
    private final Integer extendDuration;

    /**
     * Duration in hours for which extension access is sought on the target resource.
     * @return the value
     **/
    public Integer getExtendDuration() {
        return extendDuration;
    }

    /**
     * Priority assigned to the access request by the operator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final AccessRequestSeverities severity;

    /**
     * Priority assigned to the access request by the operator
     * @return the value
     **/
    public AccessRequestSeverities getSeverity() {
        return severity;
    }

    /**
     * Whether the access request was automatically approved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
    private final Boolean isAutoApproved;

    /**
     * Whether the access request was automatically approved.
     * @return the value
     **/
    public Boolean getIsAutoApproved() {
        return isAutoApproved;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AccessRequestSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", requestId=").append(String.valueOf(this.requestId));
        sb.append(", accessReasonSummary=").append(String.valueOf(this.accessReasonSummary));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeOfCreation=").append(String.valueOf(this.timeOfCreation));
        sb.append(", timeOfModification=").append(String.valueOf(this.timeOfModification));
        sb.append(", timeOfUserCreation=").append(String.valueOf(this.timeOfUserCreation));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(", extendDuration=").append(String.valueOf(this.extendDuration));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", isAutoApproved=").append(String.valueOf(this.isAutoApproved));
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
        if (!(o instanceof AccessRequestSummary)) {
            return false;
        }

        AccessRequestSummary other = (AccessRequestSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.requestId, other.requestId)
                && java.util.Objects.equals(this.accessReasonSummary, other.accessReasonSummary)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeOfCreation, other.timeOfCreation)
                && java.util.Objects.equals(this.timeOfModification, other.timeOfModification)
                && java.util.Objects.equals(this.timeOfUserCreation, other.timeOfUserCreation)
                && java.util.Objects.equals(this.duration, other.duration)
                && java.util.Objects.equals(this.extendDuration, other.extendDuration)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.isAutoApproved, other.isAutoApproved)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.requestId == null ? 43 : this.requestId.hashCode());
        result =
                (result * PRIME)
                        + (this.accessReasonSummary == null
                                ? 43
                                : this.accessReasonSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfCreation == null ? 43 : this.timeOfCreation.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfModification == null
                                ? 43
                                : this.timeOfModification.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfUserCreation == null
                                ? 43
                                : this.timeOfUserCreation.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        result =
                (result * PRIME)
                        + (this.extendDuration == null ? 43 : this.extendDuration.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoApproved == null ? 43 : this.isAutoApproved.hashCode());
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
