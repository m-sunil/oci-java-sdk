/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies Deliver Artifacts stage specific run details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeliverArtifactStageRunProgress.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "buildPipelineStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeliverArtifactStageRunProgress extends BuildPipelineStageRunProgress {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("stageDisplayName")
        private String stageDisplayName;

        public Builder stageDisplayName(String stageDisplayName) {
            this.stageDisplayName = stageDisplayName;
            this.__explicitlySet__.add("stageDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStageId")
        private String buildPipelineStageId;

        public Builder buildPipelineStageId(String buildPipelineStageId) {
            this.buildPipelineStageId = buildPipelineStageId;
            this.__explicitlySet__.add("buildPipelineStageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStagePredecessors")
        private BuildPipelineStagePredecessorCollection buildPipelineStagePredecessors;

        public Builder buildPipelineStagePredecessors(
                BuildPipelineStagePredecessorCollection buildPipelineStagePredecessors) {
            this.buildPipelineStagePredecessors = buildPipelineStagePredecessors;
            this.__explicitlySet__.add("buildPipelineStagePredecessors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deliveredArtifacts")
        private DeliveredArtifactCollection deliveredArtifacts;

        public Builder deliveredArtifacts(DeliveredArtifactCollection deliveredArtifacts) {
            this.deliveredArtifacts = deliveredArtifacts;
            this.__explicitlySet__.add("deliveredArtifacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeliverArtifactStageRunProgress build() {
            DeliverArtifactStageRunProgress __instance__ =
                    new DeliverArtifactStageRunProgress(
                            stageDisplayName,
                            buildPipelineStageId,
                            timeStarted,
                            timeFinished,
                            status,
                            buildPipelineStagePredecessors,
                            deliveredArtifacts);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeliverArtifactStageRunProgress o) {
            Builder copiedBuilder =
                    stageDisplayName(o.getStageDisplayName())
                            .buildPipelineStageId(o.getBuildPipelineStageId())
                            .timeStarted(o.getTimeStarted())
                            .timeFinished(o.getTimeFinished())
                            .status(o.getStatus())
                            .buildPipelineStagePredecessors(o.getBuildPipelineStagePredecessors())
                            .deliveredArtifacts(o.getDeliveredArtifacts());

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
    public DeliverArtifactStageRunProgress(
            String stageDisplayName,
            String buildPipelineStageId,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Status status,
            BuildPipelineStagePredecessorCollection buildPipelineStagePredecessors,
            DeliveredArtifactCollection deliveredArtifacts) {
        super(
                stageDisplayName,
                buildPipelineStageId,
                timeStarted,
                timeFinished,
                status,
                buildPipelineStagePredecessors);
        this.deliveredArtifacts = deliveredArtifacts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deliveredArtifacts")
    private final DeliveredArtifactCollection deliveredArtifacts;

    public DeliveredArtifactCollection getDeliveredArtifacts() {
        return deliveredArtifacts;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeliverArtifactStageRunProgress(");
        sb.append("super=").append(super.toString());
        sb.append(", deliveredArtifacts=").append(String.valueOf(this.deliveredArtifacts));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeliverArtifactStageRunProgress)) {
            return false;
        }

        DeliverArtifactStageRunProgress other = (DeliverArtifactStageRunProgress) o;
        return java.util.Objects.equals(this.deliveredArtifacts, other.deliveredArtifacts)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.deliveredArtifacts == null
                                ? 43
                                : this.deliveredArtifacts.hashCode());
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
