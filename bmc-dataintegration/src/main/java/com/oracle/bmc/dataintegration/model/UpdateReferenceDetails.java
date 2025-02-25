/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Application references that need to be updated.
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
    builder = UpdateReferenceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateReferenceDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"options", "targetObject", "childReferences"})
    public UpdateReferenceDetails(
            java.util.Map<String, String> options,
            Object targetObject,
            java.util.List<ChildReferenceDetail> childReferences) {
        super();
        this.options = options;
        this.targetObject = targetObject;
        this.childReferences = childReferences;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of options such as {@code ignoreObjectOnError}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private java.util.Map<String, String> options;

        /**
         * A list of options such as {@code ignoreObjectOnError}.
         * @param options the value to set
         * @return this builder
         **/
        public Builder options(java.util.Map<String, String> options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }
        /**
         * The new target object to reference. This can be of type {@code DataAsset}, {@code Schema} or {@code Task}. In case of {@code DataAsset}, the child references can be of type {@code Connection}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetObject")
        private Object targetObject;

        /**
         * The new target object to reference. This can be of type {@code DataAsset}, {@code Schema} or {@code Task}. In case of {@code DataAsset}, the child references can be of type {@code Connection}.
         * @param targetObject the value to set
         * @return this builder
         **/
        public Builder targetObject(Object targetObject) {
            this.targetObject = targetObject;
            this.__explicitlySet__.add("targetObject");
            return this;
        }
        /**
         * The list of child references that also need to be updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("childReferences")
        private java.util.List<ChildReferenceDetail> childReferences;

        /**
         * The list of child references that also need to be updated.
         * @param childReferences the value to set
         * @return this builder
         **/
        public Builder childReferences(java.util.List<ChildReferenceDetail> childReferences) {
            this.childReferences = childReferences;
            this.__explicitlySet__.add("childReferences");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateReferenceDetails build() {
            UpdateReferenceDetails __instance__ =
                    new UpdateReferenceDetails(options, targetObject, childReferences);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateReferenceDetails o) {
            Builder copiedBuilder =
                    options(o.getOptions())
                            .targetObject(o.getTargetObject())
                            .childReferences(o.getChildReferences());

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
     * A list of options such as {@code ignoreObjectOnError}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final java.util.Map<String, String> options;

    /**
     * A list of options such as {@code ignoreObjectOnError}.
     * @return the value
     **/
    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * The new target object to reference. This can be of type {@code DataAsset}, {@code Schema} or {@code Task}. In case of {@code DataAsset}, the child references can be of type {@code Connection}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetObject")
    private final Object targetObject;

    /**
     * The new target object to reference. This can be of type {@code DataAsset}, {@code Schema} or {@code Task}. In case of {@code DataAsset}, the child references can be of type {@code Connection}.
     * @return the value
     **/
    public Object getTargetObject() {
        return targetObject;
    }

    /**
     * The list of child references that also need to be updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childReferences")
    private final java.util.List<ChildReferenceDetail> childReferences;

    /**
     * The list of child references that also need to be updated.
     * @return the value
     **/
    public java.util.List<ChildReferenceDetail> getChildReferences() {
        return childReferences;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateReferenceDetails(");
        sb.append("options=").append(String.valueOf(this.options));
        sb.append(", targetObject=").append(String.valueOf(this.targetObject));
        sb.append(", childReferences=").append(String.valueOf(this.childReferences));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateReferenceDetails)) {
            return false;
        }

        UpdateReferenceDetails other = (UpdateReferenceDetails) o;
        return java.util.Objects.equals(this.options, other.options)
                && java.util.Objects.equals(this.targetObject, other.targetObject)
                && java.util.Objects.equals(this.childReferences, other.childReferences)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result = (result * PRIME) + (this.targetObject == null ? 43 : this.targetObject.hashCode());
        result =
                (result * PRIME)
                        + (this.childReferences == null ? 43 : this.childReferences.hashCode());
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
