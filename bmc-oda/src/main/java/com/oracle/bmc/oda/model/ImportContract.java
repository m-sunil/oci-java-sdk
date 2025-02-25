/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * The contract guiding the import experience for the consumer and behavior of the resource providers for all resource types in a package.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImportContract.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImportContract {
    @Deprecated
    @java.beans.ConstructorProperties({"importContract"})
    public ImportContract(java.util.List<ResourceTypeImportContract> importContract) {
        super();
        this.importContract = importContract;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of resource type specific import contracts, one for each resource type listed in the package definition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("importContract")
        private java.util.List<ResourceTypeImportContract> importContract;

        /**
         * A list of resource type specific import contracts, one for each resource type listed in the package definition.
         * @param importContract the value to set
         * @return this builder
         **/
        public Builder importContract(java.util.List<ResourceTypeImportContract> importContract) {
            this.importContract = importContract;
            this.__explicitlySet__.add("importContract");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportContract build() {
            ImportContract __instance__ = new ImportContract(importContract);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportContract o) {
            Builder copiedBuilder = importContract(o.getImportContract());

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
     * A list of resource type specific import contracts, one for each resource type listed in the package definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importContract")
    private final java.util.List<ResourceTypeImportContract> importContract;

    /**
     * A list of resource type specific import contracts, one for each resource type listed in the package definition.
     * @return the value
     **/
    public java.util.List<ResourceTypeImportContract> getImportContract() {
        return importContract;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ImportContract(");
        sb.append("importContract=").append(String.valueOf(this.importContract));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportContract)) {
            return false;
        }

        ImportContract other = (ImportContract) o;
        return java.util.Objects.equals(this.importContract, other.importContract)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.importContract == null ? 43 : this.importContract.hashCode());
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
