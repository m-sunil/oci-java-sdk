/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Instance Group Blue-Green deployment stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputeInstanceGroupBlueGreenDeployStage.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ComputeInstanceGroupBlueGreenDeployStage extends DeployStage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
        private String deployPipelineId;

        public Builder deployPipelineId(String deployPipelineId) {
            this.deployPipelineId = deployPipelineId;
            this.__explicitlySet__.add("deployPipelineId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessorCollection")
        private DeployStagePredecessorCollection deployStagePredecessorCollection;

        public Builder deployStagePredecessorCollection(
                DeployStagePredecessorCollection deployStagePredecessorCollection) {
            this.deployStagePredecessorCollection = deployStagePredecessorCollection;
            this.__explicitlySet__.add("deployStagePredecessorCollection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployEnvironmentIdA")
        private String deployEnvironmentIdA;

        public Builder deployEnvironmentIdA(String deployEnvironmentIdA) {
            this.deployEnvironmentIdA = deployEnvironmentIdA;
            this.__explicitlySet__.add("deployEnvironmentIdA");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployEnvironmentIdB")
        private String deployEnvironmentIdB;

        public Builder deployEnvironmentIdB(String deployEnvironmentIdB) {
            this.deployEnvironmentIdB = deployEnvironmentIdB;
            this.__explicitlySet__.add("deployEnvironmentIdB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deploymentSpecDeployArtifactId")
        private String deploymentSpecDeployArtifactId;

        public Builder deploymentSpecDeployArtifactId(String deploymentSpecDeployArtifactId) {
            this.deploymentSpecDeployArtifactId = deploymentSpecDeployArtifactId;
            this.__explicitlySet__.add("deploymentSpecDeployArtifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactIds")
        private java.util.List<String> deployArtifactIds;

        public Builder deployArtifactIds(java.util.List<String> deployArtifactIds) {
            this.deployArtifactIds = deployArtifactIds;
            this.__explicitlySet__.add("deployArtifactIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rolloutPolicy")
        private ComputeInstanceGroupRolloutPolicy rolloutPolicy;

        public Builder rolloutPolicy(ComputeInstanceGroupRolloutPolicy rolloutPolicy) {
            this.rolloutPolicy = rolloutPolicy;
            this.__explicitlySet__.add("rolloutPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failurePolicy")
        private ComputeInstanceGroupFailurePolicy failurePolicy;

        public Builder failurePolicy(ComputeInstanceGroupFailurePolicy failurePolicy) {
            this.failurePolicy = failurePolicy;
            this.__explicitlySet__.add("failurePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("testLoadBalancerConfig")
        private LoadBalancerConfig testLoadBalancerConfig;

        public Builder testLoadBalancerConfig(LoadBalancerConfig testLoadBalancerConfig) {
            this.testLoadBalancerConfig = testLoadBalancerConfig;
            this.__explicitlySet__.add("testLoadBalancerConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productionLoadBalancerConfig")
        private LoadBalancerConfig productionLoadBalancerConfig;

        public Builder productionLoadBalancerConfig(
                LoadBalancerConfig productionLoadBalancerConfig) {
            this.productionLoadBalancerConfig = productionLoadBalancerConfig;
            this.__explicitlySet__.add("productionLoadBalancerConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeInstanceGroupBlueGreenDeployStage build() {
            ComputeInstanceGroupBlueGreenDeployStage __instance__ =
                    new ComputeInstanceGroupBlueGreenDeployStage(
                            id,
                            description,
                            displayName,
                            projectId,
                            deployPipelineId,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            deployStagePredecessorCollection,
                            freeformTags,
                            definedTags,
                            systemTags,
                            deployEnvironmentIdA,
                            deployEnvironmentIdB,
                            deploymentSpecDeployArtifactId,
                            deployArtifactIds,
                            rolloutPolicy,
                            failurePolicy,
                            testLoadBalancerConfig,
                            productionLoadBalancerConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeInstanceGroupBlueGreenDeployStage o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .projectId(o.getProjectId())
                            .deployPipelineId(o.getDeployPipelineId())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .deployStagePredecessorCollection(
                                    o.getDeployStagePredecessorCollection())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .deployEnvironmentIdA(o.getDeployEnvironmentIdA())
                            .deployEnvironmentIdB(o.getDeployEnvironmentIdB())
                            .deploymentSpecDeployArtifactId(o.getDeploymentSpecDeployArtifactId())
                            .deployArtifactIds(o.getDeployArtifactIds())
                            .rolloutPolicy(o.getRolloutPolicy())
                            .failurePolicy(o.getFailurePolicy())
                            .testLoadBalancerConfig(o.getTestLoadBalancerConfig())
                            .productionLoadBalancerConfig(o.getProductionLoadBalancerConfig());

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

    @Deprecated
    public ComputeInstanceGroupBlueGreenDeployStage(
            String id,
            String description,
            String displayName,
            String projectId,
            String deployPipelineId,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String deployEnvironmentIdA,
            String deployEnvironmentIdB,
            String deploymentSpecDeployArtifactId,
            java.util.List<String> deployArtifactIds,
            ComputeInstanceGroupRolloutPolicy rolloutPolicy,
            ComputeInstanceGroupFailurePolicy failurePolicy,
            LoadBalancerConfig testLoadBalancerConfig,
            LoadBalancerConfig productionLoadBalancerConfig) {
        super(
                id,
                description,
                displayName,
                projectId,
                deployPipelineId,
                compartmentId,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags,
                systemTags);
        this.deployEnvironmentIdA = deployEnvironmentIdA;
        this.deployEnvironmentIdB = deployEnvironmentIdB;
        this.deploymentSpecDeployArtifactId = deploymentSpecDeployArtifactId;
        this.deployArtifactIds = deployArtifactIds;
        this.rolloutPolicy = rolloutPolicy;
        this.failurePolicy = failurePolicy;
        this.testLoadBalancerConfig = testLoadBalancerConfig;
        this.productionLoadBalancerConfig = productionLoadBalancerConfig;
    }

    /**
     * First compute instance group environment OCID for deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployEnvironmentIdA")
    String deployEnvironmentIdA;

    /**
     * Second compute instance group environment OCID for deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployEnvironmentIdB")
    String deployEnvironmentIdB;

    /**
     * The OCID of the artifact that contains the deployment specification.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentSpecDeployArtifactId")
    String deploymentSpecDeployArtifactId;

    /**
     * The list of file artifact OCIDs to deploy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactIds")
    java.util.List<String> deployArtifactIds;

    @com.fasterxml.jackson.annotation.JsonProperty("rolloutPolicy")
    ComputeInstanceGroupRolloutPolicy rolloutPolicy;

    @com.fasterxml.jackson.annotation.JsonProperty("failurePolicy")
    ComputeInstanceGroupFailurePolicy failurePolicy;

    @com.fasterxml.jackson.annotation.JsonProperty("testLoadBalancerConfig")
    LoadBalancerConfig testLoadBalancerConfig;

    @com.fasterxml.jackson.annotation.JsonProperty("productionLoadBalancerConfig")
    LoadBalancerConfig productionLoadBalancerConfig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
