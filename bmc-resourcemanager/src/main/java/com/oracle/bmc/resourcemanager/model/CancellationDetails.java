/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Defines the cancellation details of the job.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CancellationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CancellationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"isForced"})
    public CancellationDetails(Boolean isForced) {
        super();
        this.isForced = isForced;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether a forced cancellation was requested for the job while it was running.
         * A forced cancellation can result in an incorrect state file.
         * For example, the state file might not reflect the exact state of the provisioned resources.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isForced")
        private Boolean isForced;

        /**
         * Indicates whether a forced cancellation was requested for the job while it was running.
         * A forced cancellation can result in an incorrect state file.
         * For example, the state file might not reflect the exact state of the provisioned resources.
         *
         * @param isForced the value to set
         * @return this builder
         **/
        public Builder isForced(Boolean isForced) {
            this.isForced = isForced;
            this.__explicitlySet__.add("isForced");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CancellationDetails build() {
            CancellationDetails __instance__ = new CancellationDetails(isForced);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CancellationDetails o) {
            Builder copiedBuilder = isForced(o.getIsForced());

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
     * Indicates whether a forced cancellation was requested for the job while it was running.
     * A forced cancellation can result in an incorrect state file.
     * For example, the state file might not reflect the exact state of the provisioned resources.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isForced")
    private final Boolean isForced;

    /**
     * Indicates whether a forced cancellation was requested for the job while it was running.
     * A forced cancellation can result in an incorrect state file.
     * For example, the state file might not reflect the exact state of the provisioned resources.
     *
     * @return the value
     **/
    public Boolean getIsForced() {
        return isForced;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CancellationDetails(");
        sb.append("isForced=").append(String.valueOf(this.isForced));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CancellationDetails)) {
            return false;
        }

        CancellationDetails other = (CancellationDetails) o;
        return java.util.Objects.equals(this.isForced, other.isForced)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isForced == null ? 43 : this.isForced.hashCode());
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
