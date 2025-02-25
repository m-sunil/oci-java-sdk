/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the configuration of the traffic path in {@code PathAnalysisResult}.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Path.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Path {
    @Deprecated
    @java.beans.ConstructorProperties({"forwardRoute", "returnRoute", "topology"})
    public Path(TrafficRoute forwardRoute, TrafficRoute returnRoute, PathTopology topology) {
        super();
        this.forwardRoute = forwardRoute;
        this.returnRoute = returnRoute;
        this.topology = topology;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("forwardRoute")
        private TrafficRoute forwardRoute;

        public Builder forwardRoute(TrafficRoute forwardRoute) {
            this.forwardRoute = forwardRoute;
            this.__explicitlySet__.add("forwardRoute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("returnRoute")
        private TrafficRoute returnRoute;

        public Builder returnRoute(TrafficRoute returnRoute) {
            this.returnRoute = returnRoute;
            this.__explicitlySet__.add("returnRoute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("topology")
        private PathTopology topology;

        public Builder topology(PathTopology topology) {
            this.topology = topology;
            this.__explicitlySet__.add("topology");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Path build() {
            Path __instance__ = new Path(forwardRoute, returnRoute, topology);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Path o) {
            Builder copiedBuilder =
                    forwardRoute(o.getForwardRoute())
                            .returnRoute(o.getReturnRoute())
                            .topology(o.getTopology());

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

    @com.fasterxml.jackson.annotation.JsonProperty("forwardRoute")
    private final TrafficRoute forwardRoute;

    public TrafficRoute getForwardRoute() {
        return forwardRoute;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("returnRoute")
    private final TrafficRoute returnRoute;

    public TrafficRoute getReturnRoute() {
        return returnRoute;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("topology")
    private final PathTopology topology;

    public PathTopology getTopology() {
        return topology;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Path(");
        sb.append("forwardRoute=").append(String.valueOf(this.forwardRoute));
        sb.append(", returnRoute=").append(String.valueOf(this.returnRoute));
        sb.append(", topology=").append(String.valueOf(this.topology));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Path)) {
            return false;
        }

        Path other = (Path) o;
        return java.util.Objects.equals(this.forwardRoute, other.forwardRoute)
                && java.util.Objects.equals(this.returnRoute, other.returnRoute)
                && java.util.Objects.equals(this.topology, other.topology)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.forwardRoute == null ? 43 : this.forwardRoute.hashCode());
        result = (result * PRIME) + (this.returnRoute == null ? 43 : this.returnRoute.hashCode());
        result = (result * PRIME) + (this.topology == null ? 43 : this.topology.hashCode());
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
