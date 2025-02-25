/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about added block volumes.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddBlockStorageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddBlockStorageDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterAdminPassword", "blockVolumeSizeInGBs", "nodeType"})
    public AddBlockStorageDetails(
            String clusterAdminPassword, Long blockVolumeSizeInGBs, NodeType nodeType) {
        super();
        this.clusterAdminPassword = clusterAdminPassword;
        this.blockVolumeSizeInGBs = blockVolumeSizeInGBs;
        this.nodeType = nodeType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
         * @param clusterAdminPassword the value to set
         * @return this builder
         **/
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }
        /**
         * The size of block volume in GB to be added to each worker node. All the
         * details needed for attaching the block volume are managed by service itself.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
        private Long blockVolumeSizeInGBs;

        /**
         * The size of block volume in GB to be added to each worker node. All the
         * details needed for attaching the block volume are managed by service itself.
         *
         * @param blockVolumeSizeInGBs the value to set
         * @return this builder
         **/
        public Builder blockVolumeSizeInGBs(Long blockVolumeSizeInGBs) {
            this.blockVolumeSizeInGBs = blockVolumeSizeInGBs;
            this.__explicitlySet__.add("blockVolumeSizeInGBs");
            return this;
        }
        /**
         * Worker node types, can either be Worker Data node or Compute only worker node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
        private NodeType nodeType;

        /**
         * Worker node types, can either be Worker Data node or Compute only worker node.
         * @param nodeType the value to set
         * @return this builder
         **/
        public Builder nodeType(NodeType nodeType) {
            this.nodeType = nodeType;
            this.__explicitlySet__.add("nodeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddBlockStorageDetails build() {
            AddBlockStorageDetails __instance__ =
                    new AddBlockStorageDetails(
                            clusterAdminPassword, blockVolumeSizeInGBs, nodeType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddBlockStorageDetails o) {
            Builder copiedBuilder =
                    clusterAdminPassword(o.getClusterAdminPassword())
                            .blockVolumeSizeInGBs(o.getBlockVolumeSizeInGBs())
                            .nodeType(o.getNodeType());

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
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     * @return the value
     **/
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    /**
     * The size of block volume in GB to be added to each worker node. All the
     * details needed for attaching the block volume are managed by service itself.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
    private final Long blockVolumeSizeInGBs;

    /**
     * The size of block volume in GB to be added to each worker node. All the
     * details needed for attaching the block volume are managed by service itself.
     *
     * @return the value
     **/
    public Long getBlockVolumeSizeInGBs() {
        return blockVolumeSizeInGBs;
    }

    /**
     * Worker node types, can either be Worker Data node or Compute only worker node.
     **/
    public enum NodeType {
        Worker("WORKER"),
        ComputeOnlyWorker("COMPUTE_ONLY_WORKER"),
        ;

        private final String value;
        private static java.util.Map<String, NodeType> map;

        static {
            map = new java.util.HashMap<>();
            for (NodeType v : NodeType.values()) {
                map.put(v.getValue(), v);
            }
        }

        NodeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NodeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid NodeType: " + key);
        }
    };
    /**
     * Worker node types, can either be Worker Data node or Compute only worker node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
    private final NodeType nodeType;

    /**
     * Worker node types, can either be Worker Data node or Compute only worker node.
     * @return the value
     **/
    public NodeType getNodeType() {
        return nodeType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AddBlockStorageDetails(");
        sb.append("clusterAdminPassword=").append(String.valueOf(this.clusterAdminPassword));
        sb.append(", blockVolumeSizeInGBs=").append(String.valueOf(this.blockVolumeSizeInGBs));
        sb.append(", nodeType=").append(String.valueOf(this.nodeType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddBlockStorageDetails)) {
            return false;
        }

        AddBlockStorageDetails other = (AddBlockStorageDetails) o;
        return java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.blockVolumeSizeInGBs, other.blockVolumeSizeInGBs)
                && java.util.Objects.equals(this.nodeType, other.nodeType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.blockVolumeSizeInGBs == null
                                ? 43
                                : this.blockVolumeSizeInGBs.hashCode());
        result = (result * PRIME) + (this.nodeType == null ? 43 : this.nodeType.hashCode());
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
