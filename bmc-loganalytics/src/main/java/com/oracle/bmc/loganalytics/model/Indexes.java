/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Indexes
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Indexes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Indexes {
    @Deprecated
    @java.beans.ConstructorProperties({"endIndex", "startIndex"})
    public Indexes(Integer endIndex, Integer startIndex) {
        super();
        this.endIndex = endIndex;
        this.startIndex = startIndex;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The end index.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endIndex")
        private Integer endIndex;

        /**
         * The end index.
         * @param endIndex the value to set
         * @return this builder
         **/
        public Builder endIndex(Integer endIndex) {
            this.endIndex = endIndex;
            this.__explicitlySet__.add("endIndex");
            return this;
        }
        /**
         * The start index.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startIndex")
        private Integer startIndex;

        /**
         * The start index.
         * @param startIndex the value to set
         * @return this builder
         **/
        public Builder startIndex(Integer startIndex) {
            this.startIndex = startIndex;
            this.__explicitlySet__.add("startIndex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Indexes build() {
            Indexes __instance__ = new Indexes(endIndex, startIndex);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Indexes o) {
            Builder copiedBuilder = endIndex(o.getEndIndex()).startIndex(o.getStartIndex());

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
     * The end index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endIndex")
    private final Integer endIndex;

    /**
     * The end index.
     * @return the value
     **/
    public Integer getEndIndex() {
        return endIndex;
    }

    /**
     * The start index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startIndex")
    private final Integer startIndex;

    /**
     * The start index.
     * @return the value
     **/
    public Integer getStartIndex() {
        return startIndex;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Indexes(");
        sb.append("endIndex=").append(String.valueOf(this.endIndex));
        sb.append(", startIndex=").append(String.valueOf(this.startIndex));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Indexes)) {
            return false;
        }

        Indexes other = (Indexes) o;
        return java.util.Objects.equals(this.endIndex, other.endIndex)
                && java.util.Objects.equals(this.startIndex, other.startIndex)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endIndex == null ? 43 : this.endIndex.hashCode());
        result = (result * PRIME) + (this.startIndex == null ? 43 : this.startIndex.hashCode());
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
