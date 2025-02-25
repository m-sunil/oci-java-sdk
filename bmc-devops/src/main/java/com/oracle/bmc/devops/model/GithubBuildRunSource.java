/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies details of build run through GitHub.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GithubBuildRunSource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GithubBuildRunSource extends BuildRunSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The trigger that invoked the build run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("triggerId")
        private String triggerId;

        /**
         * The trigger that invoked the build run.
         * @param triggerId the value to set
         * @return this builder
         **/
        public Builder triggerId(String triggerId) {
            this.triggerId = triggerId;
            this.__explicitlySet__.add("triggerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("triggerInfo")
        private TriggerInfo triggerInfo;

        public Builder triggerInfo(TriggerInfo triggerInfo) {
            this.triggerInfo = triggerInfo;
            this.__explicitlySet__.add("triggerInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GithubBuildRunSource build() {
            GithubBuildRunSource __instance__ = new GithubBuildRunSource(triggerId, triggerInfo);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GithubBuildRunSource o) {
            Builder copiedBuilder = triggerId(o.getTriggerId()).triggerInfo(o.getTriggerInfo());

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
    public GithubBuildRunSource(String triggerId, TriggerInfo triggerInfo) {
        super();
        this.triggerId = triggerId;
        this.triggerInfo = triggerInfo;
    }

    /**
     * The trigger that invoked the build run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("triggerId")
    private final String triggerId;

    /**
     * The trigger that invoked the build run.
     * @return the value
     **/
    public String getTriggerId() {
        return triggerId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("triggerInfo")
    private final TriggerInfo triggerInfo;

    public TriggerInfo getTriggerInfo() {
        return triggerInfo;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GithubBuildRunSource(");
        sb.append("super=").append(super.toString());
        sb.append(", triggerId=").append(String.valueOf(this.triggerId));
        sb.append(", triggerInfo=").append(String.valueOf(this.triggerInfo));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GithubBuildRunSource)) {
            return false;
        }

        GithubBuildRunSource other = (GithubBuildRunSource) o;
        return java.util.Objects.equals(this.triggerId, other.triggerId)
                && java.util.Objects.equals(this.triggerInfo, other.triggerInfo)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.triggerId == null ? 43 : this.triggerId.hashCode());
        result = (result * PRIME) + (this.triggerInfo == null ? 43 : this.triggerInfo.hashCode());
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
