/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The data profile response.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataProfile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataProfile {
    @Deprecated
    @java.beans.ConstructorProperties({
        "entityName",
        "entityProfileResult",
        "attributeProfileResults"
    })
    public DataProfile(
            String entityName,
            EntityProfileResult entityProfileResult,
            java.util.List<AttributeProfileResult> attributeProfileResults) {
        super();
        this.entityName = entityName;
        this.entityProfileResult = entityProfileResult;
        this.attributeProfileResults = attributeProfileResults;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Entity name for which prodilig is requested.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * Entity name for which prodilig is requested.
         * @param entityName the value to set
         * @return this builder
         **/
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityProfileResult")
        private EntityProfileResult entityProfileResult;

        public Builder entityProfileResult(EntityProfileResult entityProfileResult) {
            this.entityProfileResult = entityProfileResult;
            this.__explicitlySet__.add("entityProfileResult");
            return this;
        }
        /**
         * Array of profiling results
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributeProfileResults")
        private java.util.List<AttributeProfileResult> attributeProfileResults;

        /**
         * Array of profiling results
         * @param attributeProfileResults the value to set
         * @return this builder
         **/
        public Builder attributeProfileResults(
                java.util.List<AttributeProfileResult> attributeProfileResults) {
            this.attributeProfileResults = attributeProfileResults;
            this.__explicitlySet__.add("attributeProfileResults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataProfile build() {
            DataProfile __instance__ =
                    new DataProfile(entityName, entityProfileResult, attributeProfileResults);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataProfile o) {
            Builder copiedBuilder =
                    entityName(o.getEntityName())
                            .entityProfileResult(o.getEntityProfileResult())
                            .attributeProfileResults(o.getAttributeProfileResults());

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
     * Entity name for which prodilig is requested.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * Entity name for which prodilig is requested.
     * @return the value
     **/
    public String getEntityName() {
        return entityName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("entityProfileResult")
    private final EntityProfileResult entityProfileResult;

    public EntityProfileResult getEntityProfileResult() {
        return entityProfileResult;
    }

    /**
     * Array of profiling results
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeProfileResults")
    private final java.util.List<AttributeProfileResult> attributeProfileResults;

    /**
     * Array of profiling results
     * @return the value
     **/
    public java.util.List<AttributeProfileResult> getAttributeProfileResults() {
        return attributeProfileResults;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataProfile(");
        sb.append("entityName=").append(String.valueOf(this.entityName));
        sb.append(", entityProfileResult=").append(String.valueOf(this.entityProfileResult));
        sb.append(", attributeProfileResults=")
                .append(String.valueOf(this.attributeProfileResults));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataProfile)) {
            return false;
        }

        DataProfile other = (DataProfile) o;
        return java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.entityProfileResult, other.entityProfileResult)
                && java.util.Objects.equals(
                        this.attributeProfileResults, other.attributeProfileResults)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result =
                (result * PRIME)
                        + (this.entityProfileResult == null
                                ? 43
                                : this.entityProfileResult.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeProfileResults == null
                                ? 43
                                : this.attributeProfileResults.hashCode());
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
