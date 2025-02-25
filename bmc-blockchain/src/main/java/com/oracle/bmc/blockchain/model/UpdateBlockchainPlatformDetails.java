/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Blockchain Platform details for updating a service.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateBlockchainPlatformDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateBlockchainPlatformDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "storageSizeInTBs",
        "replicas",
        "totalOcpuCapacity",
        "loadBalancerShape",
        "freeformTags",
        "definedTags"
    })
    public UpdateBlockchainPlatformDetails(
            String description,
            Double storageSizeInTBs,
            ReplicaDetails replicas,
            Integer totalOcpuCapacity,
            BlockchainPlatform.LoadBalancerShape loadBalancerShape,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.storageSizeInTBs = storageSizeInTBs;
        this.replicas = replicas;
        this.totalOcpuCapacity = totalOcpuCapacity;
        this.loadBalancerShape = loadBalancerShape;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Platform Description
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Platform Description
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Storage size in TBs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
        private Double storageSizeInTBs;

        /**
         * Storage size in TBs
         * @param storageSizeInTBs the value to set
         * @return this builder
         **/
        public Builder storageSizeInTBs(Double storageSizeInTBs) {
            this.storageSizeInTBs = storageSizeInTBs;
            this.__explicitlySet__.add("storageSizeInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicas")
        private ReplicaDetails replicas;

        public Builder replicas(ReplicaDetails replicas) {
            this.replicas = replicas;
            this.__explicitlySet__.add("replicas");
            return this;
        }
        /**
         * Number of total OCPUs to allocate
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalOcpuCapacity")
        private Integer totalOcpuCapacity;

        /**
         * Number of total OCPUs to allocate
         * @param totalOcpuCapacity the value to set
         * @return this builder
         **/
        public Builder totalOcpuCapacity(Integer totalOcpuCapacity) {
            this.totalOcpuCapacity = totalOcpuCapacity;
            this.__explicitlySet__.add("totalOcpuCapacity");
            return this;
        }
        /**
         * Type of Load Balancer shape - LB_100_MBPS or LB_400_MBPS. Default is LB_100_MBPS.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerShape")
        private BlockchainPlatform.LoadBalancerShape loadBalancerShape;

        /**
         * Type of Load Balancer shape - LB_100_MBPS or LB_400_MBPS. Default is LB_100_MBPS.
         * @param loadBalancerShape the value to set
         * @return this builder
         **/
        public Builder loadBalancerShape(BlockchainPlatform.LoadBalancerShape loadBalancerShape) {
            this.loadBalancerShape = loadBalancerShape;
            this.__explicitlySet__.add("loadBalancerShape");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
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
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBlockchainPlatformDetails build() {
            UpdateBlockchainPlatformDetails __instance__ =
                    new UpdateBlockchainPlatformDetails(
                            description,
                            storageSizeInTBs,
                            replicas,
                            totalOcpuCapacity,
                            loadBalancerShape,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBlockchainPlatformDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .storageSizeInTBs(o.getStorageSizeInTBs())
                            .replicas(o.getReplicas())
                            .totalOcpuCapacity(o.getTotalOcpuCapacity())
                            .loadBalancerShape(o.getLoadBalancerShape())
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
     * Platform Description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Platform Description
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Storage size in TBs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
    private final Double storageSizeInTBs;

    /**
     * Storage size in TBs
     * @return the value
     **/
    public Double getStorageSizeInTBs() {
        return storageSizeInTBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    private final ReplicaDetails replicas;

    public ReplicaDetails getReplicas() {
        return replicas;
    }

    /**
     * Number of total OCPUs to allocate
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalOcpuCapacity")
    private final Integer totalOcpuCapacity;

    /**
     * Number of total OCPUs to allocate
     * @return the value
     **/
    public Integer getTotalOcpuCapacity() {
        return totalOcpuCapacity;
    }

    /**
     * Type of Load Balancer shape - LB_100_MBPS or LB_400_MBPS. Default is LB_100_MBPS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerShape")
    private final BlockchainPlatform.LoadBalancerShape loadBalancerShape;

    /**
     * Type of Load Balancer shape - LB_100_MBPS or LB_400_MBPS. Default is LB_100_MBPS.
     * @return the value
     **/
    public BlockchainPlatform.LoadBalancerShape getLoadBalancerShape() {
        return loadBalancerShape;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateBlockchainPlatformDetails(");
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", storageSizeInTBs=").append(String.valueOf(this.storageSizeInTBs));
        sb.append(", replicas=").append(String.valueOf(this.replicas));
        sb.append(", totalOcpuCapacity=").append(String.valueOf(this.totalOcpuCapacity));
        sb.append(", loadBalancerShape=").append(String.valueOf(this.loadBalancerShape));
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
        if (!(o instanceof UpdateBlockchainPlatformDetails)) {
            return false;
        }

        UpdateBlockchainPlatformDetails other = (UpdateBlockchainPlatformDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.storageSizeInTBs, other.storageSizeInTBs)
                && java.util.Objects.equals(this.replicas, other.replicas)
                && java.util.Objects.equals(this.totalOcpuCapacity, other.totalOcpuCapacity)
                && java.util.Objects.equals(this.loadBalancerShape, other.loadBalancerShape)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.storageSizeInTBs == null ? 43 : this.storageSizeInTBs.hashCode());
        result = (result * PRIME) + (this.replicas == null ? 43 : this.replicas.hashCode());
        result =
                (result * PRIME)
                        + (this.totalOcpuCapacity == null ? 43 : this.totalOcpuCapacity.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerShape == null ? 43 : this.loadBalancerShape.hashCode());
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
