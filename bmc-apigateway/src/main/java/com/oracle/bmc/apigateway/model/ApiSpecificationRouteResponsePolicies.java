/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Behavior applied to any responses sent by the API for requests on this route.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApiSpecificationRouteResponsePolicies.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApiSpecificationRouteResponsePolicies {
    @Deprecated
    @java.beans.ConstructorProperties({"headerTransformations", "responseCacheStore"})
    public ApiSpecificationRouteResponsePolicies(
            HeaderTransformationPolicy headerTransformations,
            ResponseCacheStorePolicy responseCacheStore) {
        super();
        this.headerTransformations = headerTransformations;
        this.responseCacheStore = responseCacheStore;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("headerTransformations")
        private HeaderTransformationPolicy headerTransformations;

        public Builder headerTransformations(HeaderTransformationPolicy headerTransformations) {
            this.headerTransformations = headerTransformations;
            this.__explicitlySet__.add("headerTransformations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseCacheStore")
        private ResponseCacheStorePolicy responseCacheStore;

        public Builder responseCacheStore(ResponseCacheStorePolicy responseCacheStore) {
            this.responseCacheStore = responseCacheStore;
            this.__explicitlySet__.add("responseCacheStore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiSpecificationRouteResponsePolicies build() {
            ApiSpecificationRouteResponsePolicies __instance__ =
                    new ApiSpecificationRouteResponsePolicies(
                            headerTransformations, responseCacheStore);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiSpecificationRouteResponsePolicies o) {
            Builder copiedBuilder =
                    headerTransformations(o.getHeaderTransformations())
                            .responseCacheStore(o.getResponseCacheStore());

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

    @com.fasterxml.jackson.annotation.JsonProperty("headerTransformations")
    private final HeaderTransformationPolicy headerTransformations;

    public HeaderTransformationPolicy getHeaderTransformations() {
        return headerTransformations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("responseCacheStore")
    private final ResponseCacheStorePolicy responseCacheStore;

    public ResponseCacheStorePolicy getResponseCacheStore() {
        return responseCacheStore;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ApiSpecificationRouteResponsePolicies(");
        sb.append("headerTransformations=").append(String.valueOf(this.headerTransformations));
        sb.append(", responseCacheStore=").append(String.valueOf(this.responseCacheStore));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiSpecificationRouteResponsePolicies)) {
            return false;
        }

        ApiSpecificationRouteResponsePolicies other = (ApiSpecificationRouteResponsePolicies) o;
        return java.util.Objects.equals(this.headerTransformations, other.headerTransformations)
                && java.util.Objects.equals(this.responseCacheStore, other.responseCacheStore)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.headerTransformations == null
                                ? 43
                                : this.headerTransformations.hashCode());
        result =
                (result * PRIME)
                        + (this.responseCacheStore == null
                                ? 43
                                : this.responseCacheStore.hashCode());
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
