/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A named set of rules associated with a load balancer. Rules are objects that represent actions to apply to a listener,
 * such as adding, altering, or removing HTTP headers. For more information, see
 * [Managing Rule Sets](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrulesets.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RuleSet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RuleSet {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "items"})
    public RuleSet(String name, java.util.List<Rule> items) {
        super();
        this.name = name;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name for this set of rules. It must be unique and it cannot be changed. Avoid entering
         * confidential information.
         * <p>
         * Example: {@code example_rule_set}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name for this set of rules. It must be unique and it cannot be changed. Avoid entering
         * confidential information.
         * <p>
         * Example: {@code example_rule_set}
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * An array of rules that compose the rule set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<Rule> items;

        /**
         * An array of rules that compose the rule set.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<Rule> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuleSet build() {
            RuleSet __instance__ = new RuleSet(name, items);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuleSet o) {
            Builder copiedBuilder = name(o.getName()).items(o.getItems());

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
     * The name for this set of rules. It must be unique and it cannot be changed. Avoid entering
     * confidential information.
     * <p>
     * Example: {@code example_rule_set}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name for this set of rules. It must be unique and it cannot be changed. Avoid entering
     * confidential information.
     * <p>
     * Example: {@code example_rule_set}
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * An array of rules that compose the rule set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<Rule> items;

    /**
     * An array of rules that compose the rule set.
     * @return the value
     **/
    public java.util.List<Rule> getItems() {
        return items;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RuleSet(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RuleSet)) {
            return false;
        }

        RuleSet other = (RuleSet) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
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
