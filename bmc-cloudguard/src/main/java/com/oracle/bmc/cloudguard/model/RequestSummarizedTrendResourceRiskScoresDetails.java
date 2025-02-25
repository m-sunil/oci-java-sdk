/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * ResourceRiskScores filter.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestSummarizedTrendResourceRiskScoresDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RequestSummarizedTrendResourceRiskScoresDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"filter", "filterId"})
    public RequestSummarizedTrendResourceRiskScoresDetails(
            ResourceRiskScoreDimension filter, String filterId) {
        super();
        this.filter = filter;
        this.filterId = filterId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The filter type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filter")
        private ResourceRiskScoreDimension filter;

        /**
         * The filter type.
         * @param filter the value to set
         * @return this builder
         **/
        public Builder filter(ResourceRiskScoreDimension filter) {
            this.filter = filter;
            this.__explicitlySet__.add("filter");
            return this;
        }
        /**
         * Id to be passed in to filter the risk scores.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filterId")
        private String filterId;

        /**
         * Id to be passed in to filter the risk scores.
         * @param filterId the value to set
         * @return this builder
         **/
        public Builder filterId(String filterId) {
            this.filterId = filterId;
            this.__explicitlySet__.add("filterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestSummarizedTrendResourceRiskScoresDetails build() {
            RequestSummarizedTrendResourceRiskScoresDetails __instance__ =
                    new RequestSummarizedTrendResourceRiskScoresDetails(filter, filterId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestSummarizedTrendResourceRiskScoresDetails o) {
            Builder copiedBuilder = filter(o.getFilter()).filterId(o.getFilterId());

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
     * The filter type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final ResourceRiskScoreDimension filter;

    /**
     * The filter type.
     * @return the value
     **/
    public ResourceRiskScoreDimension getFilter() {
        return filter;
    }

    /**
     * Id to be passed in to filter the risk scores.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterId")
    private final String filterId;

    /**
     * Id to be passed in to filter the risk scores.
     * @return the value
     **/
    public String getFilterId() {
        return filterId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RequestSummarizedTrendResourceRiskScoresDetails(");
        sb.append("filter=").append(String.valueOf(this.filter));
        sb.append(", filterId=").append(String.valueOf(this.filterId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestSummarizedTrendResourceRiskScoresDetails)) {
            return false;
        }

        RequestSummarizedTrendResourceRiskScoresDetails other =
                (RequestSummarizedTrendResourceRiskScoresDetails) o;
        return java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(this.filterId, other.filterId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + (this.filterId == null ? 43 : this.filterId.hashCode());
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
