/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The details of the available and consumed CPU cores of the Autonomous Exadata Infrastructure instance, including consumption by database workload type.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OCPUs.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OCPUs {
    @Deprecated
    @java.beans.ConstructorProperties({"totalCpu", "consumedCpu", "byWorkloadType"})
    public OCPUs(Float totalCpu, Float consumedCpu, WorkloadType byWorkloadType) {
        super();
        this.totalCpu = totalCpu;
        this.consumedCpu = consumedCpu;
        this.byWorkloadType = byWorkloadType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The total number of OCPUs in the Autonomous Exadata Infrastructure instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalCpu")
        private Float totalCpu;

        /**
         * The total number of OCPUs in the Autonomous Exadata Infrastructure instance.
         * @param totalCpu the value to set
         * @return this builder
         **/
        public Builder totalCpu(Float totalCpu) {
            this.totalCpu = totalCpu;
            this.__explicitlySet__.add("totalCpu");
            return this;
        }
        /**
         * The total number of consumed OCPUs in the Autonomous Exadata Infrastructure instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("consumedCpu")
        private Float consumedCpu;

        /**
         * The total number of consumed OCPUs in the Autonomous Exadata Infrastructure instance.
         * @param consumedCpu the value to set
         * @return this builder
         **/
        public Builder consumedCpu(Float consumedCpu) {
            this.consumedCpu = consumedCpu;
            this.__explicitlySet__.add("consumedCpu");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("byWorkloadType")
        private WorkloadType byWorkloadType;

        public Builder byWorkloadType(WorkloadType byWorkloadType) {
            this.byWorkloadType = byWorkloadType;
            this.__explicitlySet__.add("byWorkloadType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OCPUs build() {
            OCPUs __instance__ = new OCPUs(totalCpu, consumedCpu, byWorkloadType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OCPUs o) {
            Builder copiedBuilder =
                    totalCpu(o.getTotalCpu())
                            .consumedCpu(o.getConsumedCpu())
                            .byWorkloadType(o.getByWorkloadType());

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
     * The total number of OCPUs in the Autonomous Exadata Infrastructure instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCpu")
    private final Float totalCpu;

    /**
     * The total number of OCPUs in the Autonomous Exadata Infrastructure instance.
     * @return the value
     **/
    public Float getTotalCpu() {
        return totalCpu;
    }

    /**
     * The total number of consumed OCPUs in the Autonomous Exadata Infrastructure instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consumedCpu")
    private final Float consumedCpu;

    /**
     * The total number of consumed OCPUs in the Autonomous Exadata Infrastructure instance.
     * @return the value
     **/
    public Float getConsumedCpu() {
        return consumedCpu;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("byWorkloadType")
    private final WorkloadType byWorkloadType;

    public WorkloadType getByWorkloadType() {
        return byWorkloadType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OCPUs(");
        sb.append("totalCpu=").append(String.valueOf(this.totalCpu));
        sb.append(", consumedCpu=").append(String.valueOf(this.consumedCpu));
        sb.append(", byWorkloadType=").append(String.valueOf(this.byWorkloadType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OCPUs)) {
            return false;
        }

        OCPUs other = (OCPUs) o;
        return java.util.Objects.equals(this.totalCpu, other.totalCpu)
                && java.util.Objects.equals(this.consumedCpu, other.consumedCpu)
                && java.util.Objects.equals(this.byWorkloadType, other.byWorkloadType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalCpu == null ? 43 : this.totalCpu.hashCode());
        result = (result * PRIME) + (this.consumedCpu == null ? 43 : this.consumedCpu.hashCode());
        result =
                (result * PRIME)
                        + (this.byWorkloadType == null ? 43 : this.byWorkloadType.hashCode());
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
