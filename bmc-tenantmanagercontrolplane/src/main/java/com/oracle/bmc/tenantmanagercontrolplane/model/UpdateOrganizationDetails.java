/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * The parameters for updating an organization.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOrganizationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOrganizationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"defaultUcmSubscriptionId"})
    public UpdateOrganizationDetails(String defaultUcmSubscriptionId) {
        super();
        this.defaultUcmSubscriptionId = defaultUcmSubscriptionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the default UCM subscription. Any tenancy joining the organization will automatically get assigned this subscription if a subscription if not explictly assigned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultUcmSubscriptionId")
        private String defaultUcmSubscriptionId;

        /**
         * OCID of the default UCM subscription. Any tenancy joining the organization will automatically get assigned this subscription if a subscription if not explictly assigned.
         * @param defaultUcmSubscriptionId the value to set
         * @return this builder
         **/
        public Builder defaultUcmSubscriptionId(String defaultUcmSubscriptionId) {
            this.defaultUcmSubscriptionId = defaultUcmSubscriptionId;
            this.__explicitlySet__.add("defaultUcmSubscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOrganizationDetails build() {
            UpdateOrganizationDetails __instance__ =
                    new UpdateOrganizationDetails(defaultUcmSubscriptionId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOrganizationDetails o) {
            Builder copiedBuilder = defaultUcmSubscriptionId(o.getDefaultUcmSubscriptionId());

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
     * OCID of the default UCM subscription. Any tenancy joining the organization will automatically get assigned this subscription if a subscription if not explictly assigned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultUcmSubscriptionId")
    private final String defaultUcmSubscriptionId;

    /**
     * OCID of the default UCM subscription. Any tenancy joining the organization will automatically get assigned this subscription if a subscription if not explictly assigned.
     * @return the value
     **/
    public String getDefaultUcmSubscriptionId() {
        return defaultUcmSubscriptionId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateOrganizationDetails(");
        sb.append("defaultUcmSubscriptionId=")
                .append(String.valueOf(this.defaultUcmSubscriptionId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOrganizationDetails)) {
            return false;
        }

        UpdateOrganizationDetails other = (UpdateOrganizationDetails) o;
        return java.util.Objects.equals(
                        this.defaultUcmSubscriptionId, other.defaultUcmSubscriptionId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.defaultUcmSubscriptionId == null
                                ? 43
                                : this.defaultUcmSubscriptionId.hashCode());
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
