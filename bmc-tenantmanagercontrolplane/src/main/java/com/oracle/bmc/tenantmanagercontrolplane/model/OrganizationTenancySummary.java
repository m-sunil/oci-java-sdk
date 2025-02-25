/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * An organization tenancy summary entity.
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
    builder = OrganizationTenancySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OrganizationTenancySummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tenancyId",
        "name",
        "lifecycleState",
        "role",
        "timeJoined",
        "timeLeft",
        "isApprovedForTransfer"
    })
    public OrganizationTenancySummary(
            String tenancyId,
            String name,
            OrganizationTenancyLifecycleState lifecycleState,
            OrganizationTenancyRole role,
            java.util.Date timeJoined,
            java.util.Date timeLeft,
            Boolean isApprovedForTransfer) {
        super();
        this.tenancyId = tenancyId;
        this.name = name;
        this.lifecycleState = lifecycleState;
        this.role = role;
        this.timeJoined = timeJoined;
        this.timeLeft = timeLeft;
        this.isApprovedForTransfer = isApprovedForTransfer;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * OCID of the tenancy.
         * @param tenancyId the value to set
         * @return this builder
         **/
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * Name of the tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the tenancy.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Lifecycle state of the OrganizationTenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OrganizationTenancyLifecycleState lifecycleState;

        /**
         * Lifecycle state of the OrganizationTenancy.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(OrganizationTenancyLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Role of the OrganizationTenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private OrganizationTenancyRole role;

        /**
         * Role of the OrganizationTenancy.
         * @param role the value to set
         * @return this builder
         **/
        public Builder role(OrganizationTenancyRole role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /**
         * Date-time when this tenancy joined the organization.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeJoined")
        private java.util.Date timeJoined;

        /**
         * Date-time when this tenancy joined the organization.
         * @param timeJoined the value to set
         * @return this builder
         **/
        public Builder timeJoined(java.util.Date timeJoined) {
            this.timeJoined = timeJoined;
            this.__explicitlySet__.add("timeJoined");
            return this;
        }
        /**
         * Date-time when this tenancy left the organization.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLeft")
        private java.util.Date timeLeft;

        /**
         * Date-time when this tenancy left the organization.
         * @param timeLeft the value to set
         * @return this builder
         **/
        public Builder timeLeft(java.util.Date timeLeft) {
            this.timeLeft = timeLeft;
            this.__explicitlySet__.add("timeLeft");
            return this;
        }
        /**
         * Flag to indicate the tenancy is approved for transfer to another organization.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isApprovedForTransfer")
        private Boolean isApprovedForTransfer;

        /**
         * Flag to indicate the tenancy is approved for transfer to another organization.
         * @param isApprovedForTransfer the value to set
         * @return this builder
         **/
        public Builder isApprovedForTransfer(Boolean isApprovedForTransfer) {
            this.isApprovedForTransfer = isApprovedForTransfer;
            this.__explicitlySet__.add("isApprovedForTransfer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OrganizationTenancySummary build() {
            OrganizationTenancySummary __instance__ =
                    new OrganizationTenancySummary(
                            tenancyId,
                            name,
                            lifecycleState,
                            role,
                            timeJoined,
                            timeLeft,
                            isApprovedForTransfer);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OrganizationTenancySummary o) {
            Builder copiedBuilder =
                    tenancyId(o.getTenancyId())
                            .name(o.getName())
                            .lifecycleState(o.getLifecycleState())
                            .role(o.getRole())
                            .timeJoined(o.getTimeJoined())
                            .timeLeft(o.getTimeLeft())
                            .isApprovedForTransfer(o.getIsApprovedForTransfer());

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
     * OCID of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * OCID of the tenancy.
     * @return the value
     **/
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * Name of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the tenancy.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Lifecycle state of the OrganizationTenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OrganizationTenancyLifecycleState lifecycleState;

    /**
     * Lifecycle state of the OrganizationTenancy.
     * @return the value
     **/
    public OrganizationTenancyLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Role of the OrganizationTenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final OrganizationTenancyRole role;

    /**
     * Role of the OrganizationTenancy.
     * @return the value
     **/
    public OrganizationTenancyRole getRole() {
        return role;
    }

    /**
     * Date-time when this tenancy joined the organization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeJoined")
    private final java.util.Date timeJoined;

    /**
     * Date-time when this tenancy joined the organization.
     * @return the value
     **/
    public java.util.Date getTimeJoined() {
        return timeJoined;
    }

    /**
     * Date-time when this tenancy left the organization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLeft")
    private final java.util.Date timeLeft;

    /**
     * Date-time when this tenancy left the organization.
     * @return the value
     **/
    public java.util.Date getTimeLeft() {
        return timeLeft;
    }

    /**
     * Flag to indicate the tenancy is approved for transfer to another organization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isApprovedForTransfer")
    private final Boolean isApprovedForTransfer;

    /**
     * Flag to indicate the tenancy is approved for transfer to another organization.
     * @return the value
     **/
    public Boolean getIsApprovedForTransfer() {
        return isApprovedForTransfer;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OrganizationTenancySummary(");
        sb.append("tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", timeJoined=").append(String.valueOf(this.timeJoined));
        sb.append(", timeLeft=").append(String.valueOf(this.timeLeft));
        sb.append(", isApprovedForTransfer=").append(String.valueOf(this.isApprovedForTransfer));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrganizationTenancySummary)) {
            return false;
        }

        OrganizationTenancySummary other = (OrganizationTenancySummary) o;
        return java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.timeJoined, other.timeJoined)
                && java.util.Objects.equals(this.timeLeft, other.timeLeft)
                && java.util.Objects.equals(this.isApprovedForTransfer, other.isApprovedForTransfer)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + (this.timeJoined == null ? 43 : this.timeJoined.hashCode());
        result = (result * PRIME) + (this.timeLeft == null ? 43 : this.timeLeft.hashCode());
        result =
                (result * PRIME)
                        + (this.isApprovedForTransfer == null
                                ? 43
                                : this.isApprovedForTransfer.hashCode());
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
