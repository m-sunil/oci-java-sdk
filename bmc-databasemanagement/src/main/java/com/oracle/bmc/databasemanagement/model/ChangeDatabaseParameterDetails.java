/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The value of a database parameter to change.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ChangeDatabaseParameterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChangeDatabaseParameterDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "value", "updateComment"})
    public ChangeDatabaseParameterDetails(String name, String value, String updateComment) {
        super();
        this.name = name;
        this.value = value;
        this.updateComment = updateComment;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The parameter name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The parameter name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The parameter value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The parameter value.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * A comment string to associate with the change in parameter value.
         * It cannot contain control characters or a line break.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateComment")
        private String updateComment;

        /**
         * A comment string to associate with the change in parameter value.
         * It cannot contain control characters or a line break.
         *
         * @param updateComment the value to set
         * @return this builder
         **/
        public Builder updateComment(String updateComment) {
            this.updateComment = updateComment;
            this.__explicitlySet__.add("updateComment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeDatabaseParameterDetails build() {
            ChangeDatabaseParameterDetails __instance__ =
                    new ChangeDatabaseParameterDetails(name, value, updateComment);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeDatabaseParameterDetails o) {
            Builder copiedBuilder =
                    name(o.getName()).value(o.getValue()).updateComment(o.getUpdateComment());

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
     * The parameter name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The parameter name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The parameter value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The parameter value.
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * A comment string to associate with the change in parameter value.
     * It cannot contain control characters or a line break.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateComment")
    private final String updateComment;

    /**
     * A comment string to associate with the change in parameter value.
     * It cannot contain control characters or a line break.
     *
     * @return the value
     **/
    public String getUpdateComment() {
        return updateComment;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChangeDatabaseParameterDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", updateComment=").append(String.valueOf(this.updateComment));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeDatabaseParameterDetails)) {
            return false;
        }

        ChangeDatabaseParameterDetails other = (ChangeDatabaseParameterDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.updateComment, other.updateComment)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.updateComment == null ? 43 : this.updateComment.hashCode());
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
