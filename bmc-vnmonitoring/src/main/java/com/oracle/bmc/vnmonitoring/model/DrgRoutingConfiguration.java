/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Identifies the DRG route table and rule that allowed the traffic to be forwarded.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DrgRoutingConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DrgRoutingConfiguration extends ForwardedRoutingConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DRG route
         * table that allowed the traffic.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("drgRouteTableId")
        private String drgRouteTableId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DRG route
         * table that allowed the traffic.
         *
         * @param drgRouteTableId the value to set
         * @return this builder
         **/
        public Builder drgRouteTableId(String drgRouteTableId) {
            this.drgRouteTableId = drgRouteTableId;
            this.__explicitlySet__.add("drgRouteTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routeRule")
        private DrgRouteRule routeRule;

        public Builder routeRule(DrgRouteRule routeRule) {
            this.routeRule = routeRule;
            this.__explicitlySet__.add("routeRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrgRoutingConfiguration build() {
            DrgRoutingConfiguration __instance__ =
                    new DrgRoutingConfiguration(drgRouteTableId, routeRule);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrgRoutingConfiguration o) {
            Builder copiedBuilder =
                    drgRouteTableId(o.getDrgRouteTableId()).routeRule(o.getRouteRule());

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

    @Deprecated
    public DrgRoutingConfiguration(String drgRouteTableId, DrgRouteRule routeRule) {
        super();
        this.drgRouteTableId = drgRouteTableId;
        this.routeRule = routeRule;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DRG route
     * table that allowed the traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drgRouteTableId")
    private final String drgRouteTableId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DRG route
     * table that allowed the traffic.
     *
     * @return the value
     **/
    public String getDrgRouteTableId() {
        return drgRouteTableId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("routeRule")
    private final DrgRouteRule routeRule;

    public DrgRouteRule getRouteRule() {
        return routeRule;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DrgRoutingConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append(", drgRouteTableId=").append(String.valueOf(this.drgRouteTableId));
        sb.append(", routeRule=").append(String.valueOf(this.routeRule));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrgRoutingConfiguration)) {
            return false;
        }

        DrgRoutingConfiguration other = (DrgRoutingConfiguration) o;
        return java.util.Objects.equals(this.drgRouteTableId, other.drgRouteTableId)
                && java.util.Objects.equals(this.routeRule, other.routeRule)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.drgRouteTableId == null ? 43 : this.drgRouteTableId.hashCode());
        result = (result * PRIME) + (this.routeRule == null ? 43 : this.routeRule.hashCode());
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
