/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * The usage metrics for a request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RequestUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RequestUsage {
    @Deprecated
    @java.beans.ConstructorProperties({"readUnitsConsumed", "writeUnitsConsumed"})
    public RequestUsage(Integer readUnitsConsumed, Integer writeUnitsConsumed) {
        super();
        this.readUnitsConsumed = readUnitsConsumed;
        this.writeUnitsConsumed = writeUnitsConsumed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Read Units consumed by this operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("readUnitsConsumed")
        private Integer readUnitsConsumed;

        /**
         * Read Units consumed by this operation.
         * @param readUnitsConsumed the value to set
         * @return this builder
         **/
        public Builder readUnitsConsumed(Integer readUnitsConsumed) {
            this.readUnitsConsumed = readUnitsConsumed;
            this.__explicitlySet__.add("readUnitsConsumed");
            return this;
        }
        /**
         * Write Units consumed by this operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("writeUnitsConsumed")
        private Integer writeUnitsConsumed;

        /**
         * Write Units consumed by this operation.
         * @param writeUnitsConsumed the value to set
         * @return this builder
         **/
        public Builder writeUnitsConsumed(Integer writeUnitsConsumed) {
            this.writeUnitsConsumed = writeUnitsConsumed;
            this.__explicitlySet__.add("writeUnitsConsumed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestUsage build() {
            RequestUsage __instance__ = new RequestUsage(readUnitsConsumed, writeUnitsConsumed);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestUsage o) {
            Builder copiedBuilder =
                    readUnitsConsumed(o.getReadUnitsConsumed())
                            .writeUnitsConsumed(o.getWriteUnitsConsumed());

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
     * Read Units consumed by this operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("readUnitsConsumed")
    private final Integer readUnitsConsumed;

    /**
     * Read Units consumed by this operation.
     * @return the value
     **/
    public Integer getReadUnitsConsumed() {
        return readUnitsConsumed;
    }

    /**
     * Write Units consumed by this operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("writeUnitsConsumed")
    private final Integer writeUnitsConsumed;

    /**
     * Write Units consumed by this operation.
     * @return the value
     **/
    public Integer getWriteUnitsConsumed() {
        return writeUnitsConsumed;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RequestUsage(");
        sb.append("readUnitsConsumed=").append(String.valueOf(this.readUnitsConsumed));
        sb.append(", writeUnitsConsumed=").append(String.valueOf(this.writeUnitsConsumed));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestUsage)) {
            return false;
        }

        RequestUsage other = (RequestUsage) o;
        return java.util.Objects.equals(this.readUnitsConsumed, other.readUnitsConsumed)
                && java.util.Objects.equals(this.writeUnitsConsumed, other.writeUnitsConsumed)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.readUnitsConsumed == null ? 43 : this.readUnitsConsumed.hashCode());
        result =
                (result * PRIME)
                        + (this.writeUnitsConsumed == null
                                ? 43
                                : this.writeUnitsConsumed.hashCode());
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
