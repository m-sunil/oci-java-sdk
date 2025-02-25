/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Details used to add a route distribution statement.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddDrgRouteDistributionStatementDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddDrgRouteDistributionStatementDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"matchCriteria", "action", "priority"})
    public AddDrgRouteDistributionStatementDetails(
            java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria,
            Action action,
            Integer priority) {
        super();
        this.matchCriteria = matchCriteria;
        this.action = action;
        this.priority = priority;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The action is applied only if all of the match criteria is met.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("matchCriteria")
        private java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria;

        /**
         * The action is applied only if all of the match criteria is met.
         *
         * @param matchCriteria the value to set
         * @return this builder
         **/
        public Builder matchCriteria(
                java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria) {
            this.matchCriteria = matchCriteria;
            this.__explicitlySet__.add("matchCriteria");
            return this;
        }
        /**
         * Accept: import/export the route "as is"
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * Accept: import/export the route "as is"
         *
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * This field is used to specify the priority of each statement in a route distribution.
         * The priority will be represented as a number between 0 and 65535 where a lower number
         * indicates a higher priority. When a route is processed, statements are applied in the order
         * defined by their priority. The first matching rule dictates the action that will be taken
         * on the route.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * This field is used to specify the priority of each statement in a route distribution.
         * The priority will be represented as a number between 0 and 65535 where a lower number
         * indicates a higher priority. When a route is processed, statements are applied in the order
         * defined by their priority. The first matching rule dictates the action that will be taken
         * on the route.
         *
         * @param priority the value to set
         * @return this builder
         **/
        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddDrgRouteDistributionStatementDetails build() {
            AddDrgRouteDistributionStatementDetails __instance__ =
                    new AddDrgRouteDistributionStatementDetails(matchCriteria, action, priority);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddDrgRouteDistributionStatementDetails o) {
            Builder copiedBuilder =
                    matchCriteria(o.getMatchCriteria())
                            .action(o.getAction())
                            .priority(o.getPriority());

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
     * The action is applied only if all of the match criteria is met.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchCriteria")
    private final java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria;

    /**
     * The action is applied only if all of the match criteria is met.
     *
     * @return the value
     **/
    public java.util.List<DrgRouteDistributionMatchCriteria> getMatchCriteria() {
        return matchCriteria;
    }

    /**
     * Accept: import/export the route "as is"
     *
     **/
    public enum Action {
        Accept("ACCEPT"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
    /**
     * Accept: import/export the route "as is"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * Accept: import/export the route "as is"
     *
     * @return the value
     **/
    public Action getAction() {
        return action;
    }

    /**
     * This field is used to specify the priority of each statement in a route distribution.
     * The priority will be represented as a number between 0 and 65535 where a lower number
     * indicates a higher priority. When a route is processed, statements are applied in the order
     * defined by their priority. The first matching rule dictates the action that will be taken
     * on the route.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * This field is used to specify the priority of each statement in a route distribution.
     * The priority will be represented as a number between 0 and 65535 where a lower number
     * indicates a higher priority. When a route is processed, statements are applied in the order
     * defined by their priority. The first matching rule dictates the action that will be taken
     * on the route.
     *
     * @return the value
     **/
    public Integer getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AddDrgRouteDistributionStatementDetails(");
        sb.append("matchCriteria=").append(String.valueOf(this.matchCriteria));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddDrgRouteDistributionStatementDetails)) {
            return false;
        }

        AddDrgRouteDistributionStatementDetails other = (AddDrgRouteDistributionStatementDetails) o;
        return java.util.Objects.equals(this.matchCriteria, other.matchCriteria)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.matchCriteria == null ? 43 : this.matchCriteria.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
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
