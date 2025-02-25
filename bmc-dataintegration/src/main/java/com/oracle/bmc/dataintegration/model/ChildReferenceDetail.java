/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * References used in an application.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ChildReferenceDetail.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChildReferenceDetail {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "targetObject"})
    public ChildReferenceDetail(String key, Object targetObject) {
        super();
        this.key = key;
        this.targetObject = targetObject;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The child reference key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The child reference key.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The new reference object to use instead of the original reference. For example, this can be a connection reference.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetObject")
        private Object targetObject;

        /**
         * The new reference object to use instead of the original reference. For example, this can be a connection reference.
         * @param targetObject the value to set
         * @return this builder
         **/
        public Builder targetObject(Object targetObject) {
            this.targetObject = targetObject;
            this.__explicitlySet__.add("targetObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChildReferenceDetail build() {
            ChildReferenceDetail __instance__ = new ChildReferenceDetail(key, targetObject);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChildReferenceDetail o) {
            Builder copiedBuilder = key(o.getKey()).targetObject(o.getTargetObject());

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
     * The child reference key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The child reference key.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The new reference object to use instead of the original reference. For example, this can be a connection reference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetObject")
    private final Object targetObject;

    /**
     * The new reference object to use instead of the original reference. For example, this can be a connection reference.
     * @return the value
     **/
    public Object getTargetObject() {
        return targetObject;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChildReferenceDetail(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", targetObject=").append(String.valueOf(this.targetObject));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChildReferenceDetail)) {
            return false;
        }

        ChildReferenceDetail other = (ChildReferenceDetail) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.targetObject, other.targetObject)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.targetObject == null ? 43 : this.targetObject.hashCode());
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
