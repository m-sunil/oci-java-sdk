/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * List of software package names
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddPackagesToSoftwareSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddPackagesToSoftwareSourceDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"packageNames"})
    public AddPackagesToSoftwareSourceDetails(java.util.List<String> packageNames) {
        super();
        this.packageNames = packageNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * the list of package names
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packageNames")
        private java.util.List<String> packageNames;

        /**
         * the list of package names
         * @param packageNames the value to set
         * @return this builder
         **/
        public Builder packageNames(java.util.List<String> packageNames) {
            this.packageNames = packageNames;
            this.__explicitlySet__.add("packageNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddPackagesToSoftwareSourceDetails build() {
            AddPackagesToSoftwareSourceDetails __instance__ =
                    new AddPackagesToSoftwareSourceDetails(packageNames);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddPackagesToSoftwareSourceDetails o) {
            Builder copiedBuilder = packageNames(o.getPackageNames());

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
     * the list of package names
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageNames")
    private final java.util.List<String> packageNames;

    /**
     * the list of package names
     * @return the value
     **/
    public java.util.List<String> getPackageNames() {
        return packageNames;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AddPackagesToSoftwareSourceDetails(");
        sb.append("packageNames=").append(String.valueOf(this.packageNames));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddPackagesToSoftwareSourceDetails)) {
            return false;
        }

        AddPackagesToSoftwareSourceDetails other = (AddPackagesToSoftwareSourceDetails) o;
        return java.util.Objects.equals(this.packageNames, other.packageNames)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.packageNames == null ? 43 : this.packageNames.hashCode());
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
