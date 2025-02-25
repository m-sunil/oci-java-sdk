/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Information about script parameters.
 * isOverwritten specifies that the default parameter present in the script content is overwritten.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScriptParameterInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScriptParameterInfo {
    @Deprecated
    @java.beans.ConstructorProperties({"scriptParameter", "isOverwritten"})
    public ScriptParameterInfo(ScriptParameter scriptParameter, Boolean isOverwritten) {
        super();
        this.scriptParameter = scriptParameter;
        this.isOverwritten = isOverwritten;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("scriptParameter")
        private ScriptParameter scriptParameter;

        public Builder scriptParameter(ScriptParameter scriptParameter) {
            this.scriptParameter = scriptParameter;
            this.__explicitlySet__.add("scriptParameter");
            return this;
        }
        /**
         * If parameter value is default or overwritten.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOverwritten")
        private Boolean isOverwritten;

        /**
         * If parameter value is default or overwritten.
         *
         * @param isOverwritten the value to set
         * @return this builder
         **/
        public Builder isOverwritten(Boolean isOverwritten) {
            this.isOverwritten = isOverwritten;
            this.__explicitlySet__.add("isOverwritten");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScriptParameterInfo build() {
            ScriptParameterInfo __instance__ =
                    new ScriptParameterInfo(scriptParameter, isOverwritten);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScriptParameterInfo o) {
            Builder copiedBuilder =
                    scriptParameter(o.getScriptParameter()).isOverwritten(o.getIsOverwritten());

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

    @com.fasterxml.jackson.annotation.JsonProperty("scriptParameter")
    private final ScriptParameter scriptParameter;

    public ScriptParameter getScriptParameter() {
        return scriptParameter;
    }

    /**
     * If parameter value is default or overwritten.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverwritten")
    private final Boolean isOverwritten;

    /**
     * If parameter value is default or overwritten.
     *
     * @return the value
     **/
    public Boolean getIsOverwritten() {
        return isOverwritten;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ScriptParameterInfo(");
        sb.append("scriptParameter=").append(String.valueOf(this.scriptParameter));
        sb.append(", isOverwritten=").append(String.valueOf(this.isOverwritten));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScriptParameterInfo)) {
            return false;
        }

        ScriptParameterInfo other = (ScriptParameterInfo) o;
        return java.util.Objects.equals(this.scriptParameter, other.scriptParameter)
                && java.util.Objects.equals(this.isOverwritten, other.isOverwritten)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.scriptParameter == null ? 43 : this.scriptParameter.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverwritten == null ? 43 : this.isOverwritten.hashCode());
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
