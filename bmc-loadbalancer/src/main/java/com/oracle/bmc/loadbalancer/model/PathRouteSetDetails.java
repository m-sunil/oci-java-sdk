/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A set of path route rules.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PathRouteSetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PathRouteSetDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"pathRoutes"})
    public PathRouteSetDetails(java.util.List<PathRoute> pathRoutes) {
        super();
        this.pathRoutes = pathRoutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The set of path route rules.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pathRoutes")
        private java.util.List<PathRoute> pathRoutes;

        /**
         * The set of path route rules.
         * @param pathRoutes the value to set
         * @return this builder
         **/
        public Builder pathRoutes(java.util.List<PathRoute> pathRoutes) {
            this.pathRoutes = pathRoutes;
            this.__explicitlySet__.add("pathRoutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PathRouteSetDetails build() {
            PathRouteSetDetails __instance__ = new PathRouteSetDetails(pathRoutes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PathRouteSetDetails o) {
            Builder copiedBuilder = pathRoutes(o.getPathRoutes());

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
     * The set of path route rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pathRoutes")
    private final java.util.List<PathRoute> pathRoutes;

    /**
     * The set of path route rules.
     * @return the value
     **/
    public java.util.List<PathRoute> getPathRoutes() {
        return pathRoutes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PathRouteSetDetails(");
        sb.append("pathRoutes=").append(String.valueOf(this.pathRoutes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PathRouteSetDetails)) {
            return false;
        }

        PathRouteSetDetails other = (PathRouteSetDetails) o;
        return java.util.Objects.equals(this.pathRoutes, other.pathRoutes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pathRoutes == null ? 43 : this.pathRoutes.hashCode());
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
