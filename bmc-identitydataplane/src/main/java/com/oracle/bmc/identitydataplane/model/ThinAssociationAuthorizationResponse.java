/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ThinAssociationAuthorizationResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ThinAssociationAuthorizationResponse {
    @Deprecated
    @java.beans.ConstructorProperties({"responses", "associationResult", "decisionCacheDuration"})
    public ThinAssociationAuthorizationResponse(
            java.util.List<ThinAuthorizationResponse> responses,
            AssociationResult associationResult,
            String decisionCacheDuration) {
        super();
        this.responses = responses;
        this.associationResult = associationResult;
        this.decisionCacheDuration = decisionCacheDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The authorization responses.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responses")
        private java.util.List<ThinAuthorizationResponse> responses;

        /**
         * The authorization responses.
         * @param responses the value to set
         * @return this builder
         **/
        public Builder responses(java.util.List<ThinAuthorizationResponse> responses) {
            this.responses = responses;
            this.__explicitlySet__.add("responses");
            return this;
        }
        /**
         * The association verification result.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associationResult")
        private AssociationResult associationResult;

        /**
         * The association verification result.
         * @param associationResult the value to set
         * @return this builder
         **/
        public Builder associationResult(AssociationResult associationResult) {
            this.associationResult = associationResult;
            this.__explicitlySet__.add("associationResult");
            return this;
        }
        /**
         * The decision cache duration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("decisionCacheDuration")
        private String decisionCacheDuration;

        /**
         * The decision cache duration.
         * @param decisionCacheDuration the value to set
         * @return this builder
         **/
        public Builder decisionCacheDuration(String decisionCacheDuration) {
            this.decisionCacheDuration = decisionCacheDuration;
            this.__explicitlySet__.add("decisionCacheDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ThinAssociationAuthorizationResponse build() {
            ThinAssociationAuthorizationResponse __instance__ =
                    new ThinAssociationAuthorizationResponse(
                            responses, associationResult, decisionCacheDuration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ThinAssociationAuthorizationResponse o) {
            Builder copiedBuilder =
                    responses(o.getResponses())
                            .associationResult(o.getAssociationResult())
                            .decisionCacheDuration(o.getDecisionCacheDuration());

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
     * The authorization responses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responses")
    private final java.util.List<ThinAuthorizationResponse> responses;

    /**
     * The authorization responses.
     * @return the value
     **/
    public java.util.List<ThinAuthorizationResponse> getResponses() {
        return responses;
    }

    /**
     * The association verification result.
     **/
    public enum AssociationResult {
        FailUnknown("FAIL_UNKNOWN"),
        FailBadRequest("FAIL_BAD_REQUEST"),
        FailMissingEndorse("FAIL_MISSING_ENDORSE"),
        FailMissingAdmit("FAIL_MISSING_ADMIT"),
        Success("SUCCESS"),
        ;

        private final String value;
        private static java.util.Map<String, AssociationResult> map;

        static {
            map = new java.util.HashMap<>();
            for (AssociationResult v : AssociationResult.values()) {
                map.put(v.getValue(), v);
            }
        }

        AssociationResult(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssociationResult create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AssociationResult: " + key);
        }
    };
    /**
     * The association verification result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationResult")
    private final AssociationResult associationResult;

    /**
     * The association verification result.
     * @return the value
     **/
    public AssociationResult getAssociationResult() {
        return associationResult;
    }

    /**
     * The decision cache duration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("decisionCacheDuration")
    private final String decisionCacheDuration;

    /**
     * The decision cache duration.
     * @return the value
     **/
    public String getDecisionCacheDuration() {
        return decisionCacheDuration;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ThinAssociationAuthorizationResponse(");
        sb.append("responses=").append(String.valueOf(this.responses));
        sb.append(", associationResult=").append(String.valueOf(this.associationResult));
        sb.append(", decisionCacheDuration=").append(String.valueOf(this.decisionCacheDuration));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThinAssociationAuthorizationResponse)) {
            return false;
        }

        ThinAssociationAuthorizationResponse other = (ThinAssociationAuthorizationResponse) o;
        return java.util.Objects.equals(this.responses, other.responses)
                && java.util.Objects.equals(this.associationResult, other.associationResult)
                && java.util.Objects.equals(this.decisionCacheDuration, other.decisionCacheDuration)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.responses == null ? 43 : this.responses.hashCode());
        result =
                (result * PRIME)
                        + (this.associationResult == null ? 43 : this.associationResult.hashCode());
        result =
                (result * PRIME)
                        + (this.decisionCacheDuration == null
                                ? 43
                                : this.decisionCacheDuration.hashCode());
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
