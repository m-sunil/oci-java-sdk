/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.model;

/**
 * A container object for state change attributes.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StateChange.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StateChange {
    @Deprecated
    @java.beans.ConstructorProperties({"previous", "current"})
    public StateChange(
            java.util.Map<String, Object> previous, java.util.Map<String, Object> current) {
        super();
        this.previous = previous;
        this.current = current;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Provides the previous state of fields that may have changed during an operation. To determine
         * how the current operation changed a resource, compare the information in this attribute to
         * {@code current}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("previous")
        private java.util.Map<String, Object> previous;

        /**
         * Provides the previous state of fields that may have changed during an operation. To determine
         * how the current operation changed a resource, compare the information in this attribute to
         * {@code current}.
         *
         * @param previous the value to set
         * @return this builder
         **/
        public Builder previous(java.util.Map<String, Object> previous) {
            this.previous = previous;
            this.__explicitlySet__.add("previous");
            return this;
        }
        /**
         * Provides the current state of fields that may have changed during an operation. To determine
         * how the current operation changed a resource, compare the information in this attribute to
         * {@code previous}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("current")
        private java.util.Map<String, Object> current;

        /**
         * Provides the current state of fields that may have changed during an operation. To determine
         * how the current operation changed a resource, compare the information in this attribute to
         * {@code previous}.
         *
         * @param current the value to set
         * @return this builder
         **/
        public Builder current(java.util.Map<String, Object> current) {
            this.current = current;
            this.__explicitlySet__.add("current");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StateChange build() {
            StateChange __instance__ = new StateChange(previous, current);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StateChange o) {
            Builder copiedBuilder = previous(o.getPrevious()).current(o.getCurrent());

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
     * Provides the previous state of fields that may have changed during an operation. To determine
     * how the current operation changed a resource, compare the information in this attribute to
     * {@code current}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("previous")
    private final java.util.Map<String, Object> previous;

    /**
     * Provides the previous state of fields that may have changed during an operation. To determine
     * how the current operation changed a resource, compare the information in this attribute to
     * {@code current}.
     *
     * @return the value
     **/
    public java.util.Map<String, Object> getPrevious() {
        return previous;
    }

    /**
     * Provides the current state of fields that may have changed during an operation. To determine
     * how the current operation changed a resource, compare the information in this attribute to
     * {@code previous}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("current")
    private final java.util.Map<String, Object> current;

    /**
     * Provides the current state of fields that may have changed during an operation. To determine
     * how the current operation changed a resource, compare the information in this attribute to
     * {@code previous}.
     *
     * @return the value
     **/
    public java.util.Map<String, Object> getCurrent() {
        return current;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StateChange(");
        sb.append("previous=").append(String.valueOf(this.previous));
        sb.append(", current=").append(String.valueOf(this.current));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StateChange)) {
            return false;
        }

        StateChange other = (StateChange) o;
        return java.util.Objects.equals(this.previous, other.previous)
                && java.util.Objects.equals(this.current, other.current)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.previous == null ? 43 : this.previous.hashCode());
        result = (result * PRIME) + (this.current == null ? 43 : this.current.hashCode());
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
