/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * The configuration details for updating a load balancer backend set.
 * For more information about backend set configuration, see
 * [Managing Backend Sets](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingbackendsets.htm).
 * <p>
 **Caution:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateBackendSetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateBackendSetDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "policy",
        "isPreserveSource",
        "ipVersion",
        "backends",
        "healthChecker"
    })
    public UpdateBackendSetDetails(
            String policy,
            Boolean isPreserveSource,
            IpVersion ipVersion,
            java.util.List<BackendDetails> backends,
            HealthCheckerDetails healthChecker) {
        super();
        this.policy = policy;
        this.isPreserveSource = isPreserveSource;
        this.ipVersion = ipVersion;
        this.backends = backends;
        this.healthChecker = healthChecker;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The network load balancer policy for the backend set. To get a list of available policies, use the
         * {@link #listNetworkLoadBalancersPolicies(ListNetworkLoadBalancersPoliciesRequest) listNetworkLoadBalancersPolicies} operation.
         * <p>
         * Example: {@code FIVE_TUPLE}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private String policy;

        /**
         * The network load balancer policy for the backend set. To get a list of available policies, use the
         * {@link #listNetworkLoadBalancersPolicies(ListNetworkLoadBalancersPoliciesRequest) listNetworkLoadBalancersPolicies} operation.
         * <p>
         * Example: {@code FIVE_TUPLE}
         *
         * @param policy the value to set
         * @return this builder
         **/
        public Builder policy(String policy) {
            this.policy = policy;
            this.__explicitlySet__.add("policy");
            return this;
        }
        /**
         * If this parameter is enabled, then the network load balancer preserves the source IP of the packet when it is forwarded to backends.
         * Backends see the original source IP. If the isPreserveSourceDestination parameter is enabled for the network load balancer resource, then this parameter cannot be disabled.
         * The value is true by default.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSource")
        private Boolean isPreserveSource;

        /**
         * If this parameter is enabled, then the network load balancer preserves the source IP of the packet when it is forwarded to backends.
         * Backends see the original source IP. If the isPreserveSourceDestination parameter is enabled for the network load balancer resource, then this parameter cannot be disabled.
         * The value is true by default.
         *
         * @param isPreserveSource the value to set
         * @return this builder
         **/
        public Builder isPreserveSource(Boolean isPreserveSource) {
            this.isPreserveSource = isPreserveSource;
            this.__explicitlySet__.add("isPreserveSource");
            return this;
        }
        /**
         * The IP version associated with the backend set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipVersion")
        private IpVersion ipVersion;

        /**
         * The IP version associated with the backend set.
         * @param ipVersion the value to set
         * @return this builder
         **/
        public Builder ipVersion(IpVersion ipVersion) {
            this.ipVersion = ipVersion;
            this.__explicitlySet__.add("ipVersion");
            return this;
        }
        /**
         * An array of backends associated with the backend set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backends")
        private java.util.List<BackendDetails> backends;

        /**
         * An array of backends associated with the backend set.
         * @param backends the value to set
         * @return this builder
         **/
        public Builder backends(java.util.List<BackendDetails> backends) {
            this.backends = backends;
            this.__explicitlySet__.add("backends");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("healthChecker")
        private HealthCheckerDetails healthChecker;

        public Builder healthChecker(HealthCheckerDetails healthChecker) {
            this.healthChecker = healthChecker;
            this.__explicitlySet__.add("healthChecker");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBackendSetDetails build() {
            UpdateBackendSetDetails __instance__ =
                    new UpdateBackendSetDetails(
                            policy, isPreserveSource, ipVersion, backends, healthChecker);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBackendSetDetails o) {
            Builder copiedBuilder =
                    policy(o.getPolicy())
                            .isPreserveSource(o.getIsPreserveSource())
                            .ipVersion(o.getIpVersion())
                            .backends(o.getBackends())
                            .healthChecker(o.getHealthChecker());

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
     * The network load balancer policy for the backend set. To get a list of available policies, use the
     * {@link #listNetworkLoadBalancersPolicies(ListNetworkLoadBalancersPoliciesRequest) listNetworkLoadBalancersPolicies} operation.
     * <p>
     * Example: {@code FIVE_TUPLE}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    private final String policy;

    /**
     * The network load balancer policy for the backend set. To get a list of available policies, use the
     * {@link #listNetworkLoadBalancersPolicies(ListNetworkLoadBalancersPoliciesRequest) listNetworkLoadBalancersPolicies} operation.
     * <p>
     * Example: {@code FIVE_TUPLE}
     *
     * @return the value
     **/
    public String getPolicy() {
        return policy;
    }

    /**
     * If this parameter is enabled, then the network load balancer preserves the source IP of the packet when it is forwarded to backends.
     * Backends see the original source IP. If the isPreserveSourceDestination parameter is enabled for the network load balancer resource, then this parameter cannot be disabled.
     * The value is true by default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSource")
    private final Boolean isPreserveSource;

    /**
     * If this parameter is enabled, then the network load balancer preserves the source IP of the packet when it is forwarded to backends.
     * Backends see the original source IP. If the isPreserveSourceDestination parameter is enabled for the network load balancer resource, then this parameter cannot be disabled.
     * The value is true by default.
     *
     * @return the value
     **/
    public Boolean getIsPreserveSource() {
        return isPreserveSource;
    }

    /**
     * The IP version associated with the backend set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipVersion")
    private final IpVersion ipVersion;

    /**
     * The IP version associated with the backend set.
     * @return the value
     **/
    public IpVersion getIpVersion() {
        return ipVersion;
    }

    /**
     * An array of backends associated with the backend set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backends")
    private final java.util.List<BackendDetails> backends;

    /**
     * An array of backends associated with the backend set.
     * @return the value
     **/
    public java.util.List<BackendDetails> getBackends() {
        return backends;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("healthChecker")
    private final HealthCheckerDetails healthChecker;

    public HealthCheckerDetails getHealthChecker() {
        return healthChecker;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateBackendSetDetails(");
        sb.append("policy=").append(String.valueOf(this.policy));
        sb.append(", isPreserveSource=").append(String.valueOf(this.isPreserveSource));
        sb.append(", ipVersion=").append(String.valueOf(this.ipVersion));
        sb.append(", backends=").append(String.valueOf(this.backends));
        sb.append(", healthChecker=").append(String.valueOf(this.healthChecker));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBackendSetDetails)) {
            return false;
        }

        UpdateBackendSetDetails other = (UpdateBackendSetDetails) o;
        return java.util.Objects.equals(this.policy, other.policy)
                && java.util.Objects.equals(this.isPreserveSource, other.isPreserveSource)
                && java.util.Objects.equals(this.ipVersion, other.ipVersion)
                && java.util.Objects.equals(this.backends, other.backends)
                && java.util.Objects.equals(this.healthChecker, other.healthChecker)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.policy == null ? 43 : this.policy.hashCode());
        result =
                (result * PRIME)
                        + (this.isPreserveSource == null ? 43 : this.isPreserveSource.hashCode());
        result = (result * PRIME) + (this.ipVersion == null ? 43 : this.ipVersion.hashCode());
        result = (result * PRIME) + (this.backends == null ? 43 : this.backends.hashCode());
        result =
                (result * PRIME)
                        + (this.healthChecker == null ? 43 : this.healthChecker.hashCode());
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
