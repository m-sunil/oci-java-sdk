/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A health status summary for the specified load balancer.
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
    builder = LoadBalancerHealthSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LoadBalancerHealthSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"loadBalancerId", "status"})
    public LoadBalancerHealthSummary(String loadBalancerId, Status status) {
        super();
        this.loadBalancerId = loadBalancerId;
        this.status = status;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the load balancer the health status is associated with.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
        private String loadBalancerId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the load balancer the health status is associated with.
         *
         * @param loadBalancerId the value to set
         * @return this builder
         **/
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            this.__explicitlySet__.add("loadBalancerId");
            return this;
        }
        /**
         * The overall health status of the load balancer.
         * <p>
         *  **OK:** All backend sets associated with the load balancer return a status of {@code OK}.
         * <p>
         *  **WARNING:** At least one of the backend sets associated with the load balancer returns a status of {@code WARNING},
         * no backend sets return a status of {@code CRITICAL}, and the load balancer life cycle state is {@code ACTIVE}.
         * <p>
         *  **CRITICAL:** One or more of the backend sets associated with the load balancer return a status of {@code CRITICAL}.
         * <p>
         *  **UNKNOWN:** If any one of the following conditions is true:
         * <p>
         *  The load balancer life cycle state is not {@code ACTIVE}.
         * <p>
         *  No backend sets are defined for the load balancer.
         * <p>
         *  More than half of the backend sets associated with the load balancer return a status of {@code UNKNOWN}, none of the backend
         *        sets return a status of {@code WARNING} or {@code CRITICAL}, and the load balancer life cycle state is {@code ACTIVE}.
         * <p>
         *  The system could not retrieve metrics for any reason.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The overall health status of the load balancer.
         * <p>
         *  **OK:** All backend sets associated with the load balancer return a status of {@code OK}.
         * <p>
         *  **WARNING:** At least one of the backend sets associated with the load balancer returns a status of {@code WARNING},
         * no backend sets return a status of {@code CRITICAL}, and the load balancer life cycle state is {@code ACTIVE}.
         * <p>
         *  **CRITICAL:** One or more of the backend sets associated with the load balancer return a status of {@code CRITICAL}.
         * <p>
         *  **UNKNOWN:** If any one of the following conditions is true:
         * <p>
         *  The load balancer life cycle state is not {@code ACTIVE}.
         * <p>
         *  No backend sets are defined for the load balancer.
         * <p>
         *  More than half of the backend sets associated with the load balancer return a status of {@code UNKNOWN}, none of the backend
         *        sets return a status of {@code WARNING} or {@code CRITICAL}, and the load balancer life cycle state is {@code ACTIVE}.
         * <p>
         *  The system could not retrieve metrics for any reason.
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoadBalancerHealthSummary build() {
            LoadBalancerHealthSummary __instance__ =
                    new LoadBalancerHealthSummary(loadBalancerId, status);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoadBalancerHealthSummary o) {
            Builder copiedBuilder = loadBalancerId(o.getLoadBalancerId()).status(o.getStatus());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the load balancer the health status is associated with.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    private final String loadBalancerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the load balancer the health status is associated with.
     *
     * @return the value
     **/
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * The overall health status of the load balancer.
     * <p>
     *  **OK:** All backend sets associated with the load balancer return a status of {@code OK}.
     * <p>
     *  **WARNING:** At least one of the backend sets associated with the load balancer returns a status of {@code WARNING},
     * no backend sets return a status of {@code CRITICAL}, and the load balancer life cycle state is {@code ACTIVE}.
     * <p>
     *  **CRITICAL:** One or more of the backend sets associated with the load balancer return a status of {@code CRITICAL}.
     * <p>
     *  **UNKNOWN:** If any one of the following conditions is true:
     * <p>
     *  The load balancer life cycle state is not {@code ACTIVE}.
     * <p>
     *  No backend sets are defined for the load balancer.
     * <p>
     *  More than half of the backend sets associated with the load balancer return a status of {@code UNKNOWN}, none of the backend
     *        sets return a status of {@code WARNING} or {@code CRITICAL}, and the load balancer life cycle state is {@code ACTIVE}.
     * <p>
     *  The system could not retrieve metrics for any reason.
     *
     **/
    public enum Status {
        Ok("OK"),
        Warning("WARNING"),
        Critical("CRITICAL"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The overall health status of the load balancer.
     * <p>
     *  **OK:** All backend sets associated with the load balancer return a status of {@code OK}.
     * <p>
     *  **WARNING:** At least one of the backend sets associated with the load balancer returns a status of {@code WARNING},
     * no backend sets return a status of {@code CRITICAL}, and the load balancer life cycle state is {@code ACTIVE}.
     * <p>
     *  **CRITICAL:** One or more of the backend sets associated with the load balancer return a status of {@code CRITICAL}.
     * <p>
     *  **UNKNOWN:** If any one of the following conditions is true:
     * <p>
     *  The load balancer life cycle state is not {@code ACTIVE}.
     * <p>
     *  No backend sets are defined for the load balancer.
     * <p>
     *  More than half of the backend sets associated with the load balancer return a status of {@code UNKNOWN}, none of the backend
     *        sets return a status of {@code WARNING} or {@code CRITICAL}, and the load balancer life cycle state is {@code ACTIVE}.
     * <p>
     *  The system could not retrieve metrics for any reason.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The overall health status of the load balancer.
     * <p>
     *  **OK:** All backend sets associated with the load balancer return a status of {@code OK}.
     * <p>
     *  **WARNING:** At least one of the backend sets associated with the load balancer returns a status of {@code WARNING},
     * no backend sets return a status of {@code CRITICAL}, and the load balancer life cycle state is {@code ACTIVE}.
     * <p>
     *  **CRITICAL:** One or more of the backend sets associated with the load balancer return a status of {@code CRITICAL}.
     * <p>
     *  **UNKNOWN:** If any one of the following conditions is true:
     * <p>
     *  The load balancer life cycle state is not {@code ACTIVE}.
     * <p>
     *  No backend sets are defined for the load balancer.
     * <p>
     *  More than half of the backend sets associated with the load balancer return a status of {@code UNKNOWN}, none of the backend
     *        sets return a status of {@code WARNING} or {@code CRITICAL}, and the load balancer life cycle state is {@code ACTIVE}.
     * <p>
     *  The system could not retrieve metrics for any reason.
     *
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LoadBalancerHealthSummary(");
        sb.append("loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoadBalancerHealthSummary)) {
            return false;
        }

        LoadBalancerHealthSummary other = (LoadBalancerHealthSummary) o;
        return java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.loadBalancerId == null ? 43 : this.loadBalancerId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
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
