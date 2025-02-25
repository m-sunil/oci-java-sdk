/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SteeringPolicyWeightedAnswerData.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SteeringPolicyWeightedAnswerData {
    @Deprecated
    @java.beans.ConstructorProperties({"answerCondition", "value"})
    public SteeringPolicyWeightedAnswerData(String answerCondition, Integer value) {
        super();
        this.answerCondition = answerCondition;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An expression that is used to select a set of answers that match a condition. For example, answers with matching pool properties.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("answerCondition")
        private String answerCondition;

        /**
         * An expression that is used to select a set of answers that match a condition. For example, answers with matching pool properties.
         *
         * @param answerCondition the value to set
         * @return this builder
         **/
        public Builder answerCondition(String answerCondition) {
            this.answerCondition = answerCondition;
            this.__explicitlySet__.add("answerCondition");
            return this;
        }
        /**
         * The weight assigned to the set of selected answers. Answers with a higher weight will be served
         * more frequently. Answers can be given a value between {@code 0} and {@code 255}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Integer value;

        /**
         * The weight assigned to the set of selected answers. Answers with a higher weight will be served
         * more frequently. Answers can be given a value between {@code 0} and {@code 255}.
         *
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(Integer value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyWeightedAnswerData build() {
            SteeringPolicyWeightedAnswerData __instance__ =
                    new SteeringPolicyWeightedAnswerData(answerCondition, value);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyWeightedAnswerData o) {
            Builder copiedBuilder = answerCondition(o.getAnswerCondition()).value(o.getValue());

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
     * An expression that is used to select a set of answers that match a condition. For example, answers with matching pool properties.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("answerCondition")
    private final String answerCondition;

    /**
     * An expression that is used to select a set of answers that match a condition. For example, answers with matching pool properties.
     *
     * @return the value
     **/
    public String getAnswerCondition() {
        return answerCondition;
    }

    /**
     * The weight assigned to the set of selected answers. Answers with a higher weight will be served
     * more frequently. Answers can be given a value between {@code 0} and {@code 255}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Integer value;

    /**
     * The weight assigned to the set of selected answers. Answers with a higher weight will be served
     * more frequently. Answers can be given a value between {@code 0} and {@code 255}.
     *
     * @return the value
     **/
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SteeringPolicyWeightedAnswerData(");
        sb.append("answerCondition=").append(String.valueOf(this.answerCondition));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SteeringPolicyWeightedAnswerData)) {
            return false;
        }

        SteeringPolicyWeightedAnswerData other = (SteeringPolicyWeightedAnswerData) o;
        return java.util.Objects.equals(this.answerCondition, other.answerCondition)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.answerCondition == null ? 43 : this.answerCondition.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
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
