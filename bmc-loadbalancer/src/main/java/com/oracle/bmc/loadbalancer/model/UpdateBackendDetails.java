/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for updating a backend server.
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
    builder = UpdateBackendDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateBackendDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"weight", "backup", "drain", "offline"})
    public UpdateBackendDetails(Integer weight, Boolean backup, Boolean drain, Boolean offline) {
        super();
        this.weight = weight;
        this.backup = backup;
        this.drain = drain;
        this.offline = offline;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The load balancing policy weight assigned to the server. Backend servers with a higher weight receive a larger
         * proportion of incoming traffic. For example, a server weighted '3' receives 3 times the number of new connections
         * as a server weighted '1'.
         * For more information on load balancing policies, see
         * [How Load Balancing Policies Work](https://docs.cloud.oracle.com/Content/Balance/Reference/lbpolicies.htm).
         * <p>
         * Example: {@code 3}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Integer weight;

        /**
         * The load balancing policy weight assigned to the server. Backend servers with a higher weight receive a larger
         * proportion of incoming traffic. For example, a server weighted '3' receives 3 times the number of new connections
         * as a server weighted '1'.
         * For more information on load balancing policies, see
         * [How Load Balancing Policies Work](https://docs.cloud.oracle.com/Content/Balance/Reference/lbpolicies.htm).
         * <p>
         * Example: {@code 3}
         *
         * @param weight the value to set
         * @return this builder
         **/
        public Builder weight(Integer weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }
        /**
         * Whether the load balancer should treat this server as a backup unit. If {@code true}, the load balancer forwards no ingress
         * traffic to this backend server unless all other backend servers not marked as "backup" fail the health check policy.
         * <p>
         **Note:** You cannot add a backend server marked as {@code backup} to a backend set that uses the IP Hash policy.
         * <p>
         * Example: {@code false}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backup")
        private Boolean backup;

        /**
         * Whether the load balancer should treat this server as a backup unit. If {@code true}, the load balancer forwards no ingress
         * traffic to this backend server unless all other backend servers not marked as "backup" fail the health check policy.
         * <p>
         **Note:** You cannot add a backend server marked as {@code backup} to a backend set that uses the IP Hash policy.
         * <p>
         * Example: {@code false}
         *
         * @param backup the value to set
         * @return this builder
         **/
        public Builder backup(Boolean backup) {
            this.backup = backup;
            this.__explicitlySet__.add("backup");
            return this;
        }
        /**
         * Whether the load balancer should drain this server. Servers marked "drain" receive no new
         * incoming traffic.
         * <p>
         * Example: {@code false}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("drain")
        private Boolean drain;

        /**
         * Whether the load balancer should drain this server. Servers marked "drain" receive no new
         * incoming traffic.
         * <p>
         * Example: {@code false}
         *
         * @param drain the value to set
         * @return this builder
         **/
        public Builder drain(Boolean drain) {
            this.drain = drain;
            this.__explicitlySet__.add("drain");
            return this;
        }
        /**
         * Whether the load balancer should treat this server as offline. Offline servers receive no incoming
         * traffic.
         * <p>
         * Example: {@code false}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offline")
        private Boolean offline;

        /**
         * Whether the load balancer should treat this server as offline. Offline servers receive no incoming
         * traffic.
         * <p>
         * Example: {@code false}
         *
         * @param offline the value to set
         * @return this builder
         **/
        public Builder offline(Boolean offline) {
            this.offline = offline;
            this.__explicitlySet__.add("offline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBackendDetails build() {
            UpdateBackendDetails __instance__ =
                    new UpdateBackendDetails(weight, backup, drain, offline);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBackendDetails o) {
            Builder copiedBuilder =
                    weight(o.getWeight())
                            .backup(o.getBackup())
                            .drain(o.getDrain())
                            .offline(o.getOffline());

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
     * The load balancing policy weight assigned to the server. Backend servers with a higher weight receive a larger
     * proportion of incoming traffic. For example, a server weighted '3' receives 3 times the number of new connections
     * as a server weighted '1'.
     * For more information on load balancing policies, see
     * [How Load Balancing Policies Work](https://docs.cloud.oracle.com/Content/Balance/Reference/lbpolicies.htm).
     * <p>
     * Example: {@code 3}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    private final Integer weight;

    /**
     * The load balancing policy weight assigned to the server. Backend servers with a higher weight receive a larger
     * proportion of incoming traffic. For example, a server weighted '3' receives 3 times the number of new connections
     * as a server weighted '1'.
     * For more information on load balancing policies, see
     * [How Load Balancing Policies Work](https://docs.cloud.oracle.com/Content/Balance/Reference/lbpolicies.htm).
     * <p>
     * Example: {@code 3}
     *
     * @return the value
     **/
    public Integer getWeight() {
        return weight;
    }

    /**
     * Whether the load balancer should treat this server as a backup unit. If {@code true}, the load balancer forwards no ingress
     * traffic to this backend server unless all other backend servers not marked as "backup" fail the health check policy.
     * <p>
     **Note:** You cannot add a backend server marked as {@code backup} to a backend set that uses the IP Hash policy.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backup")
    private final Boolean backup;

    /**
     * Whether the load balancer should treat this server as a backup unit. If {@code true}, the load balancer forwards no ingress
     * traffic to this backend server unless all other backend servers not marked as "backup" fail the health check policy.
     * <p>
     **Note:** You cannot add a backend server marked as {@code backup} to a backend set that uses the IP Hash policy.
     * <p>
     * Example: {@code false}
     *
     * @return the value
     **/
    public Boolean getBackup() {
        return backup;
    }

    /**
     * Whether the load balancer should drain this server. Servers marked "drain" receive no new
     * incoming traffic.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drain")
    private final Boolean drain;

    /**
     * Whether the load balancer should drain this server. Servers marked "drain" receive no new
     * incoming traffic.
     * <p>
     * Example: {@code false}
     *
     * @return the value
     **/
    public Boolean getDrain() {
        return drain;
    }

    /**
     * Whether the load balancer should treat this server as offline. Offline servers receive no incoming
     * traffic.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offline")
    private final Boolean offline;

    /**
     * Whether the load balancer should treat this server as offline. Offline servers receive no incoming
     * traffic.
     * <p>
     * Example: {@code false}
     *
     * @return the value
     **/
    public Boolean getOffline() {
        return offline;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateBackendDetails(");
        sb.append("weight=").append(String.valueOf(this.weight));
        sb.append(", backup=").append(String.valueOf(this.backup));
        sb.append(", drain=").append(String.valueOf(this.drain));
        sb.append(", offline=").append(String.valueOf(this.offline));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBackendDetails)) {
            return false;
        }

        UpdateBackendDetails other = (UpdateBackendDetails) o;
        return java.util.Objects.equals(this.weight, other.weight)
                && java.util.Objects.equals(this.backup, other.backup)
                && java.util.Objects.equals(this.drain, other.drain)
                && java.util.Objects.equals(this.offline, other.offline)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.weight == null ? 43 : this.weight.hashCode());
        result = (result * PRIME) + (this.backup == null ? 43 : this.backup.hashCode());
        result = (result * PRIME) + (this.drain == null ? 43 : this.drain.hashCode());
        result = (result * PRIME) + (this.offline == null ? 43 : this.offline.hashCode());
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
