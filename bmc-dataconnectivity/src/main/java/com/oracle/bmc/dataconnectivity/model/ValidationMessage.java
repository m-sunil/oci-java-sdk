/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The level and validation message.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ValidationMessage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ValidationMessage {
    @Deprecated
    @java.beans.ConstructorProperties({"level", "validationMessage"})
    public ValidationMessage(String level, String validationMessage) {
        super();
        this.level = level;
        this.validationMessage = validationMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * level of validation messages
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private String level;

        /**
         * level of validation messages
         * @param level the value to set
         * @return this builder
         **/
        public Builder level(String level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }
        /**
         * The message itself.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("validationMessage")
        private String validationMessage;

        /**
         * The message itself.
         * @param validationMessage the value to set
         * @return this builder
         **/
        public Builder validationMessage(String validationMessage) {
            this.validationMessage = validationMessage;
            this.__explicitlySet__.add("validationMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidationMessage build() {
            ValidationMessage __instance__ = new ValidationMessage(level, validationMessage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidationMessage o) {
            Builder copiedBuilder = level(o.getLevel()).validationMessage(o.getValidationMessage());

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
     * level of validation messages
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final String level;

    /**
     * level of validation messages
     * @return the value
     **/
    public String getLevel() {
        return level;
    }

    /**
     * The message itself.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validationMessage")
    private final String validationMessage;

    /**
     * The message itself.
     * @return the value
     **/
    public String getValidationMessage() {
        return validationMessage;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ValidationMessage(");
        sb.append("level=").append(String.valueOf(this.level));
        sb.append(", validationMessage=").append(String.valueOf(this.validationMessage));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidationMessage)) {
            return false;
        }

        ValidationMessage other = (ValidationMessage) o;
        return java.util.Objects.equals(this.level, other.level)
                && java.util.Objects.equals(this.validationMessage, other.validationMessage)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result =
                (result * PRIME)
                        + (this.validationMessage == null ? 43 : this.validationMessage.hashCode());
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
