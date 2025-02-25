/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines details for the security action taken on denied traffic.
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
    builder = DeniedSecurityActionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeniedSecurityActionDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isRestrictedOrPartial",
        "evaluatedSecurityListIds",
        "evaluatedNsgIds"
    })
    public DeniedSecurityActionDetails(
            Boolean isRestrictedOrPartial,
            java.util.List<String> evaluatedSecurityListIds,
            java.util.List<String> evaluatedNsgIds) {
        super();
        this.isRestrictedOrPartial = isRestrictedOrPartial;
        this.evaluatedSecurityListIds = evaluatedSecurityListIds;
        this.evaluatedNsgIds = evaluatedNsgIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If true, the evaluated security list and network security group ID details are incomplete.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRestrictedOrPartial")
        private Boolean isRestrictedOrPartial;

        /**
         * If true, the evaluated security list and network security group ID details are incomplete.
         * @param isRestrictedOrPartial the value to set
         * @return this builder
         **/
        public Builder isRestrictedOrPartial(Boolean isRestrictedOrPartial) {
            this.isRestrictedOrPartial = isRestrictedOrPartial;
            this.__explicitlySet__.add("isRestrictedOrPartial");
            return this;
        }
        /**
         * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of evaluated security lists associcated
         * with the OCI resource's subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("evaluatedSecurityListIds")
        private java.util.List<String> evaluatedSecurityListIds;

        /**
         * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of evaluated security lists associcated
         * with the OCI resource's subnet.
         *
         * @param evaluatedSecurityListIds the value to set
         * @return this builder
         **/
        public Builder evaluatedSecurityListIds(java.util.List<String> evaluatedSecurityListIds) {
            this.evaluatedSecurityListIds = evaluatedSecurityListIds;
            this.__explicitlySet__.add("evaluatedSecurityListIds");
            return this;
        }
        /**
         * List of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of evaluated network security groups
         * associated with the OCI resource's VNIC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("evaluatedNsgIds")
        private java.util.List<String> evaluatedNsgIds;

        /**
         * List of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of evaluated network security groups
         * associated with the OCI resource's VNIC.
         *
         * @param evaluatedNsgIds the value to set
         * @return this builder
         **/
        public Builder evaluatedNsgIds(java.util.List<String> evaluatedNsgIds) {
            this.evaluatedNsgIds = evaluatedNsgIds;
            this.__explicitlySet__.add("evaluatedNsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeniedSecurityActionDetails build() {
            DeniedSecurityActionDetails __instance__ =
                    new DeniedSecurityActionDetails(
                            isRestrictedOrPartial, evaluatedSecurityListIds, evaluatedNsgIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeniedSecurityActionDetails o) {
            Builder copiedBuilder =
                    isRestrictedOrPartial(o.getIsRestrictedOrPartial())
                            .evaluatedSecurityListIds(o.getEvaluatedSecurityListIds())
                            .evaluatedNsgIds(o.getEvaluatedNsgIds());

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
     * If true, the evaluated security list and network security group ID details are incomplete.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRestrictedOrPartial")
    private final Boolean isRestrictedOrPartial;

    /**
     * If true, the evaluated security list and network security group ID details are incomplete.
     * @return the value
     **/
    public Boolean getIsRestrictedOrPartial() {
        return isRestrictedOrPartial;
    }

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of evaluated security lists associcated
     * with the OCI resource's subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("evaluatedSecurityListIds")
    private final java.util.List<String> evaluatedSecurityListIds;

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of evaluated security lists associcated
     * with the OCI resource's subnet.
     *
     * @return the value
     **/
    public java.util.List<String> getEvaluatedSecurityListIds() {
        return evaluatedSecurityListIds;
    }

    /**
     * List of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of evaluated network security groups
     * associated with the OCI resource's VNIC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("evaluatedNsgIds")
    private final java.util.List<String> evaluatedNsgIds;

    /**
     * List of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of evaluated network security groups
     * associated with the OCI resource's VNIC.
     *
     * @return the value
     **/
    public java.util.List<String> getEvaluatedNsgIds() {
        return evaluatedNsgIds;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeniedSecurityActionDetails(");
        sb.append("isRestrictedOrPartial=").append(String.valueOf(this.isRestrictedOrPartial));
        sb.append(", evaluatedSecurityListIds=")
                .append(String.valueOf(this.evaluatedSecurityListIds));
        sb.append(", evaluatedNsgIds=").append(String.valueOf(this.evaluatedNsgIds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeniedSecurityActionDetails)) {
            return false;
        }

        DeniedSecurityActionDetails other = (DeniedSecurityActionDetails) o;
        return java.util.Objects.equals(this.isRestrictedOrPartial, other.isRestrictedOrPartial)
                && java.util.Objects.equals(
                        this.evaluatedSecurityListIds, other.evaluatedSecurityListIds)
                && java.util.Objects.equals(this.evaluatedNsgIds, other.evaluatedNsgIds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isRestrictedOrPartial == null
                                ? 43
                                : this.isRestrictedOrPartial.hashCode());
        result =
                (result * PRIME)
                        + (this.evaluatedSecurityListIds == null
                                ? 43
                                : this.evaluatedSecurityListIds.hashCode());
        result =
                (result * PRIME)
                        + (this.evaluatedNsgIds == null ? 43 : this.evaluatedNsgIds.hashCode());
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
