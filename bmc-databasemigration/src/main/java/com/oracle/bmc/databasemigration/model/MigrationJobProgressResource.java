/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Progress details of a Migration Job.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MigrationJobProgressResource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MigrationJobProgressResource {
    @Deprecated
    @java.beans.ConstructorProperties({"currentStatus", "currentPhase", "phases"})
    public MigrationJobProgressResource(
            JobPhaseStatus currentStatus,
            OdmsJobPhases currentPhase,
            java.util.List<PhaseStatus> phases) {
        super();
        this.currentStatus = currentStatus;
        this.currentPhase = currentPhase;
        this.phases = phases;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Current status of the job.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentStatus")
        private JobPhaseStatus currentStatus;

        /**
         * Current status of the job.
         *
         * @param currentStatus the value to set
         * @return this builder
         **/
        public Builder currentStatus(JobPhaseStatus currentStatus) {
            this.currentStatus = currentStatus;
            this.__explicitlySet__.add("currentStatus");
            return this;
        }
        /**
         * Current phase of the job.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentPhase")
        private OdmsJobPhases currentPhase;

        /**
         * Current phase of the job.
         *
         * @param currentPhase the value to set
         * @return this builder
         **/
        public Builder currentPhase(OdmsJobPhases currentPhase) {
            this.currentPhase = currentPhase;
            this.__explicitlySet__.add("currentPhase");
            return this;
        }
        /**
         * List of phase status for the job.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("phases")
        private java.util.List<PhaseStatus> phases;

        /**
         * List of phase status for the job.
         *
         * @param phases the value to set
         * @return this builder
         **/
        public Builder phases(java.util.List<PhaseStatus> phases) {
            this.phases = phases;
            this.__explicitlySet__.add("phases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrationJobProgressResource build() {
            MigrationJobProgressResource __instance__ =
                    new MigrationJobProgressResource(currentStatus, currentPhase, phases);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrationJobProgressResource o) {
            Builder copiedBuilder =
                    currentStatus(o.getCurrentStatus())
                            .currentPhase(o.getCurrentPhase())
                            .phases(o.getPhases());

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
     * Current status of the job.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentStatus")
    private final JobPhaseStatus currentStatus;

    /**
     * Current status of the job.
     *
     * @return the value
     **/
    public JobPhaseStatus getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Current phase of the job.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentPhase")
    private final OdmsJobPhases currentPhase;

    /**
     * Current phase of the job.
     *
     * @return the value
     **/
    public OdmsJobPhases getCurrentPhase() {
        return currentPhase;
    }

    /**
     * List of phase status for the job.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phases")
    private final java.util.List<PhaseStatus> phases;

    /**
     * List of phase status for the job.
     *
     * @return the value
     **/
    public java.util.List<PhaseStatus> getPhases() {
        return phases;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MigrationJobProgressResource(");
        sb.append("currentStatus=").append(String.valueOf(this.currentStatus));
        sb.append(", currentPhase=").append(String.valueOf(this.currentPhase));
        sb.append(", phases=").append(String.valueOf(this.phases));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MigrationJobProgressResource)) {
            return false;
        }

        MigrationJobProgressResource other = (MigrationJobProgressResource) o;
        return java.util.Objects.equals(this.currentStatus, other.currentStatus)
                && java.util.Objects.equals(this.currentPhase, other.currentPhase)
                && java.util.Objects.equals(this.phases, other.phases)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.currentStatus == null ? 43 : this.currentStatus.hashCode());
        result = (result * PRIME) + (this.currentPhase == null ? 43 : this.currentPhase.hashCode());
        result = (result * PRIME) + (this.phases == null ? 43 : this.phases.hashCode());
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
