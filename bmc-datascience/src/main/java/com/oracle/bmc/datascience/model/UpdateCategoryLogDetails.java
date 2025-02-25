/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The log details for each category for update.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateCategoryLogDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateCategoryLogDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"access", "predict"})
    public UpdateCategoryLogDetails(LogDetails access, LogDetails predict) {
        super();
        this.access = access;
        this.predict = predict;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("access")
        private LogDetails access;

        public Builder access(LogDetails access) {
            this.access = access;
            this.__explicitlySet__.add("access");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("predict")
        private LogDetails predict;

        public Builder predict(LogDetails predict) {
            this.predict = predict;
            this.__explicitlySet__.add("predict");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCategoryLogDetails build() {
            UpdateCategoryLogDetails __instance__ = new UpdateCategoryLogDetails(access, predict);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCategoryLogDetails o) {
            Builder copiedBuilder = access(o.getAccess()).predict(o.getPredict());

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

    @com.fasterxml.jackson.annotation.JsonProperty("access")
    private final LogDetails access;

    public LogDetails getAccess() {
        return access;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("predict")
    private final LogDetails predict;

    public LogDetails getPredict() {
        return predict;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateCategoryLogDetails(");
        sb.append("access=").append(String.valueOf(this.access));
        sb.append(", predict=").append(String.valueOf(this.predict));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCategoryLogDetails)) {
            return false;
        }

        UpdateCategoryLogDetails other = (UpdateCategoryLogDetails) o;
        return java.util.Objects.equals(this.access, other.access)
                && java.util.Objects.equals(this.predict, other.predict)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.access == null ? 43 : this.access.hashCode());
        result = (result * PRIME) + (this.predict == null ? 43 : this.predict.hashCode());
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
