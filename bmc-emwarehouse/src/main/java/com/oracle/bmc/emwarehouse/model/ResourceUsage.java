/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emwarehouse.model;

/**
 * The resource usage information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResourceUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceUsage {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationsInsightsWarehouseId",
        "id",
        "emInstanceCount",
        "targetsCount",
        "emInstances"
    })
    public ResourceUsage(
            String operationsInsightsWarehouseId,
            String id,
            Integer emInstanceCount,
            Integer targetsCount,
            java.util.List<EmInstancesDetails> emInstances) {
        super();
        this.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
        this.id = id;
        this.emInstanceCount = emInstanceCount;
        this.targetsCount = targetsCount;
        this.emInstances = emInstances;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * operations Insights Warehouse Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouseId")
        private String operationsInsightsWarehouseId;

        /**
         * operations Insights Warehouse Identifier
         * @param operationsInsightsWarehouseId the value to set
         * @return this builder
         **/
        public Builder operationsInsightsWarehouseId(String operationsInsightsWarehouseId) {
            this.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
            this.__explicitlySet__.add("operationsInsightsWarehouseId");
            return this;
        }
        /**
         * Unique identifier that is immutable on creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * EmInstanceCount
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emInstanceCount")
        private Integer emInstanceCount;

        /**
         * EmInstanceCount
         * @param emInstanceCount the value to set
         * @return this builder
         **/
        public Builder emInstanceCount(Integer emInstanceCount) {
            this.emInstanceCount = emInstanceCount;
            this.__explicitlySet__.add("emInstanceCount");
            return this;
        }
        /**
         * EmInstance Target count
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
        private Integer targetsCount;

        /**
         * EmInstance Target count
         * @param targetsCount the value to set
         * @return this builder
         **/
        public Builder targetsCount(Integer targetsCount) {
            this.targetsCount = targetsCount;
            this.__explicitlySet__.add("targetsCount");
            return this;
        }
        /**
         * List of emInstances
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emInstances")
        private java.util.List<EmInstancesDetails> emInstances;

        /**
         * List of emInstances
         * @param emInstances the value to set
         * @return this builder
         **/
        public Builder emInstances(java.util.List<EmInstancesDetails> emInstances) {
            this.emInstances = emInstances;
            this.__explicitlySet__.add("emInstances");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceUsage build() {
            ResourceUsage __instance__ =
                    new ResourceUsage(
                            operationsInsightsWarehouseId,
                            id,
                            emInstanceCount,
                            targetsCount,
                            emInstances);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceUsage o) {
            Builder copiedBuilder =
                    operationsInsightsWarehouseId(o.getOperationsInsightsWarehouseId())
                            .id(o.getId())
                            .emInstanceCount(o.getEmInstanceCount())
                            .targetsCount(o.getTargetsCount())
                            .emInstances(o.getEmInstances());

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
     * operations Insights Warehouse Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouseId")
    private final String operationsInsightsWarehouseId;

    /**
     * operations Insights Warehouse Identifier
     * @return the value
     **/
    public String getOperationsInsightsWarehouseId() {
        return operationsInsightsWarehouseId;
    }

    /**
     * Unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * EmInstanceCount
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emInstanceCount")
    private final Integer emInstanceCount;

    /**
     * EmInstanceCount
     * @return the value
     **/
    public Integer getEmInstanceCount() {
        return emInstanceCount;
    }

    /**
     * EmInstance Target count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
    private final Integer targetsCount;

    /**
     * EmInstance Target count
     * @return the value
     **/
    public Integer getTargetsCount() {
        return targetsCount;
    }

    /**
     * List of emInstances
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emInstances")
    private final java.util.List<EmInstancesDetails> emInstances;

    /**
     * List of emInstances
     * @return the value
     **/
    public java.util.List<EmInstancesDetails> getEmInstances() {
        return emInstances;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceUsage(");
        sb.append("operationsInsightsWarehouseId=")
                .append(String.valueOf(this.operationsInsightsWarehouseId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", emInstanceCount=").append(String.valueOf(this.emInstanceCount));
        sb.append(", targetsCount=").append(String.valueOf(this.targetsCount));
        sb.append(", emInstances=").append(String.valueOf(this.emInstances));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceUsage)) {
            return false;
        }

        ResourceUsage other = (ResourceUsage) o;
        return java.util.Objects.equals(
                        this.operationsInsightsWarehouseId, other.operationsInsightsWarehouseId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.emInstanceCount, other.emInstanceCount)
                && java.util.Objects.equals(this.targetsCount, other.targetsCount)
                && java.util.Objects.equals(this.emInstances, other.emInstances)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationsInsightsWarehouseId == null
                                ? 43
                                : this.operationsInsightsWarehouseId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.emInstanceCount == null ? 43 : this.emInstanceCount.hashCode());
        result = (result * PRIME) + (this.targetsCount == null ? 43 : this.targetsCount.hashCode());
        result = (result * PRIME) + (this.emInstances == null ? 43 : this.emInstances.hashCode());
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
