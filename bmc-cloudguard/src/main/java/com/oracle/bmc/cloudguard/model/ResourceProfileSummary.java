/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Resource profile summary.
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
    builder = ResourceProfileSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceProfileSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sightingsCount",
        "id",
        "resourceId",
        "displayName",
        "type",
        "riskScore",
        "tactics",
        "timeFirstDetected",
        "timeLastDetected",
        "problemsCount"
    })
    public ResourceProfileSummary(
            Integer sightingsCount,
            String id,
            String resourceId,
            String displayName,
            String type,
            Double riskScore,
            java.util.List<TacticSummary> tactics,
            java.util.Date timeFirstDetected,
            java.util.Date timeLastDetected,
            Integer problemsCount) {
        super();
        this.sightingsCount = sightingsCount;
        this.id = id;
        this.resourceId = resourceId;
        this.displayName = displayName;
        this.type = type;
        this.riskScore = riskScore;
        this.tactics = tactics;
        this.timeFirstDetected = timeFirstDetected;
        this.timeLastDetected = timeLastDetected;
        this.problemsCount = problemsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Number of sightings associated with this resource profile
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sightingsCount")
        private Integer sightingsCount;

        /**
         * Number of sightings associated with this resource profile
         * @param sightingsCount the value to set
         * @return this builder
         **/
        public Builder sightingsCount(Integer sightingsCount) {
            this.sightingsCount = sightingsCount;
            this.__explicitlySet__.add("sightingsCount");
            return this;
        }
        /**
         * Unique identifier for resource profile
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for resource profile
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique identifier for resource profile
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Unique identifier for resource profile
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * Resource name for resource profile
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Resource name for resource profile
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Resource type for resource profile
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Resource type for resource profile
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Risk Score for the resource profile
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
        private Double riskScore;

        /**
         * Risk Score for the resource profile
         * @param riskScore the value to set
         * @return this builder
         **/
        public Builder riskScore(Double riskScore) {
            this.riskScore = riskScore;
            this.__explicitlySet__.add("riskScore");
            return this;
        }
        /**
         * List of tactic summary associated with the resource profile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tactics")
        private java.util.List<TacticSummary> tactics;

        /**
         * List of tactic summary associated with the resource profile.
         * @param tactics the value to set
         * @return this builder
         **/
        public Builder tactics(java.util.List<TacticSummary> tactics) {
            this.tactics = tactics;
            this.__explicitlySet__.add("tactics");
            return this;
        }
        /**
         * The date and time the resource profile was first detected. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
        private java.util.Date timeFirstDetected;

        /**
         * The date and time the resource profile was first detected. Format defined by RFC3339.
         * @param timeFirstDetected the value to set
         * @return this builder
         **/
        public Builder timeFirstDetected(java.util.Date timeFirstDetected) {
            this.timeFirstDetected = timeFirstDetected;
            this.__explicitlySet__.add("timeFirstDetected");
            return this;
        }
        /**
         * The date and time the resource profile was last detected. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
        private java.util.Date timeLastDetected;

        /**
         * The date and time the resource profile was last detected. Format defined by RFC3339.
         * @param timeLastDetected the value to set
         * @return this builder
         **/
        public Builder timeLastDetected(java.util.Date timeLastDetected) {
            this.timeLastDetected = timeLastDetected;
            this.__explicitlySet__.add("timeLastDetected");
            return this;
        }
        /**
         * Number of problems associated with this resource profile
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("problemsCount")
        private Integer problemsCount;

        /**
         * Number of problems associated with this resource profile
         * @param problemsCount the value to set
         * @return this builder
         **/
        public Builder problemsCount(Integer problemsCount) {
            this.problemsCount = problemsCount;
            this.__explicitlySet__.add("problemsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceProfileSummary build() {
            ResourceProfileSummary __instance__ =
                    new ResourceProfileSummary(
                            sightingsCount,
                            id,
                            resourceId,
                            displayName,
                            type,
                            riskScore,
                            tactics,
                            timeFirstDetected,
                            timeLastDetected,
                            problemsCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceProfileSummary o) {
            Builder copiedBuilder =
                    sightingsCount(o.getSightingsCount())
                            .id(o.getId())
                            .resourceId(o.getResourceId())
                            .displayName(o.getDisplayName())
                            .type(o.getType())
                            .riskScore(o.getRiskScore())
                            .tactics(o.getTactics())
                            .timeFirstDetected(o.getTimeFirstDetected())
                            .timeLastDetected(o.getTimeLastDetected())
                            .problemsCount(o.getProblemsCount());

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
     * Number of sightings associated with this resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingsCount")
    private final Integer sightingsCount;

    /**
     * Number of sightings associated with this resource profile
     * @return the value
     **/
    public Integer getSightingsCount() {
        return sightingsCount;
    }

    /**
     * Unique identifier for resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for resource profile
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Unique identifier for resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Unique identifier for resource profile
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Resource name for resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Resource name for resource profile
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Resource type for resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Resource type for resource profile
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * Risk Score for the resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
    private final Double riskScore;

    /**
     * Risk Score for the resource profile
     * @return the value
     **/
    public Double getRiskScore() {
        return riskScore;
    }

    /**
     * List of tactic summary associated with the resource profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tactics")
    private final java.util.List<TacticSummary> tactics;

    /**
     * List of tactic summary associated with the resource profile.
     * @return the value
     **/
    public java.util.List<TacticSummary> getTactics() {
        return tactics;
    }

    /**
     * The date and time the resource profile was first detected. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
    private final java.util.Date timeFirstDetected;

    /**
     * The date and time the resource profile was first detected. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeFirstDetected() {
        return timeFirstDetected;
    }

    /**
     * The date and time the resource profile was last detected. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
    private final java.util.Date timeLastDetected;

    /**
     * The date and time the resource profile was last detected. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeLastDetected() {
        return timeLastDetected;
    }

    /**
     * Number of problems associated with this resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemsCount")
    private final Integer problemsCount;

    /**
     * Number of problems associated with this resource profile
     * @return the value
     **/
    public Integer getProblemsCount() {
        return problemsCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceProfileSummary(");
        sb.append("sightingsCount=").append(String.valueOf(this.sightingsCount));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", riskScore=").append(String.valueOf(this.riskScore));
        sb.append(", tactics=").append(String.valueOf(this.tactics));
        sb.append(", timeFirstDetected=").append(String.valueOf(this.timeFirstDetected));
        sb.append(", timeLastDetected=").append(String.valueOf(this.timeLastDetected));
        sb.append(", problemsCount=").append(String.valueOf(this.problemsCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceProfileSummary)) {
            return false;
        }

        ResourceProfileSummary other = (ResourceProfileSummary) o;
        return java.util.Objects.equals(this.sightingsCount, other.sightingsCount)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.riskScore, other.riskScore)
                && java.util.Objects.equals(this.tactics, other.tactics)
                && java.util.Objects.equals(this.timeFirstDetected, other.timeFirstDetected)
                && java.util.Objects.equals(this.timeLastDetected, other.timeLastDetected)
                && java.util.Objects.equals(this.problemsCount, other.problemsCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sightingsCount == null ? 43 : this.sightingsCount.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.riskScore == null ? 43 : this.riskScore.hashCode());
        result = (result * PRIME) + (this.tactics == null ? 43 : this.tactics.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstDetected == null ? 43 : this.timeFirstDetected.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDetected == null ? 43 : this.timeLastDetected.hashCode());
        result =
                (result * PRIME)
                        + (this.problemsCount == null ? 43 : this.problemsCount.hashCode());
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
