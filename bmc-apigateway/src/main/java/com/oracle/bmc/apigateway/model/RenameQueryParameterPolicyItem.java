/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * The value will be a copy of the original value of the source parameter and will not be affected by any other
 * transformation policies applied to that parameter.
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
    builder = RenameQueryParameterPolicyItem.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RenameQueryParameterPolicyItem {
    @Deprecated
    @java.beans.ConstructorProperties({"from", "to"})
    public RenameQueryParameterPolicyItem(String from, String to) {
        super();
        this.from = from;
        this.to = to;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The original case-sensitive name of the query parameter.  This name must be unique across transformation
         * policies.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("from")
        private String from;

        /**
         * The original case-sensitive name of the query parameter.  This name must be unique across transformation
         * policies.
         *
         * @param from the value to set
         * @return this builder
         **/
        public Builder from(String from) {
            this.from = from;
            this.__explicitlySet__.add("from");
            return this;
        }
        /**
         * The new name of the query parameter.  This name must be unique across transformation policies.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("to")
        private String to;

        /**
         * The new name of the query parameter.  This name must be unique across transformation policies.
         *
         * @param to the value to set
         * @return this builder
         **/
        public Builder to(String to) {
            this.to = to;
            this.__explicitlySet__.add("to");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RenameQueryParameterPolicyItem build() {
            RenameQueryParameterPolicyItem __instance__ =
                    new RenameQueryParameterPolicyItem(from, to);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenameQueryParameterPolicyItem o) {
            Builder copiedBuilder = from(o.getFrom()).to(o.getTo());

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
     * The original case-sensitive name of the query parameter.  This name must be unique across transformation
     * policies.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("from")
    private final String from;

    /**
     * The original case-sensitive name of the query parameter.  This name must be unique across transformation
     * policies.
     *
     * @return the value
     **/
    public String getFrom() {
        return from;
    }

    /**
     * The new name of the query parameter.  This name must be unique across transformation policies.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("to")
    private final String to;

    /**
     * The new name of the query parameter.  This name must be unique across transformation policies.
     *
     * @return the value
     **/
    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RenameQueryParameterPolicyItem(");
        sb.append("from=").append(String.valueOf(this.from));
        sb.append(", to=").append(String.valueOf(this.to));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RenameQueryParameterPolicyItem)) {
            return false;
        }

        RenameQueryParameterPolicyItem other = (RenameQueryParameterPolicyItem) o;
        return java.util.Objects.equals(this.from, other.from)
                && java.util.Objects.equals(this.to, other.to)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.from == null ? 43 : this.from.hashCode());
        result = (result * PRIME) + (this.to == null ? 43 : this.to.hashCode());
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
