/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The action to trigger a build pipeline.
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
    builder = TriggerBuildPipelineAction.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TriggerBuildPipelineAction extends TriggerAction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("filter")
        private Filter filter;

        public Builder filter(Filter filter) {
            this.filter = filter;
            this.__explicitlySet__.add("filter");
            return this;
        }
        /**
         * The OCID of the build pipeline to be triggered.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineId")
        private String buildPipelineId;

        /**
         * The OCID of the build pipeline to be triggered.
         * @param buildPipelineId the value to set
         * @return this builder
         **/
        public Builder buildPipelineId(String buildPipelineId) {
            this.buildPipelineId = buildPipelineId;
            this.__explicitlySet__.add("buildPipelineId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TriggerBuildPipelineAction build() {
            TriggerBuildPipelineAction __instance__ =
                    new TriggerBuildPipelineAction(filter, buildPipelineId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TriggerBuildPipelineAction o) {
            Builder copiedBuilder = filter(o.getFilter()).buildPipelineId(o.getBuildPipelineId());

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
    public TriggerBuildPipelineAction(Filter filter, String buildPipelineId) {
        super(filter);
        this.buildPipelineId = buildPipelineId;
    }

    /**
     * The OCID of the build pipeline to be triggered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineId")
    private final String buildPipelineId;

    /**
     * The OCID of the build pipeline to be triggered.
     * @return the value
     **/
    public String getBuildPipelineId() {
        return buildPipelineId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TriggerBuildPipelineAction(");
        sb.append("super=").append(super.toString());
        sb.append(", buildPipelineId=").append(String.valueOf(this.buildPipelineId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TriggerBuildPipelineAction)) {
            return false;
        }

        TriggerBuildPipelineAction other = (TriggerBuildPipelineAction) o;
        return java.util.Objects.equals(this.buildPipelineId, other.buildPipelineId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.buildPipelineId == null ? 43 : this.buildPipelineId.hashCode());
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
