/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * General permissions object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CatalogPermissionsSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CatalogPermissionsSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"catalogId", "userPermissions"})
    public CatalogPermissionsSummary(String catalogId, java.util.List<String> userPermissions) {
        super();
        this.catalogId = catalogId;
        this.userPermissions = userPermissions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The data catalog's OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        /**
         * The data catalog's OCID.
         * @param catalogId the value to set
         * @return this builder
         **/
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }
        /**
         * An array of permissions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userPermissions")
        private java.util.List<String> userPermissions;

        /**
         * An array of permissions.
         * @param userPermissions the value to set
         * @return this builder
         **/
        public Builder userPermissions(java.util.List<String> userPermissions) {
            this.userPermissions = userPermissions;
            this.__explicitlySet__.add("userPermissions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CatalogPermissionsSummary build() {
            CatalogPermissionsSummary __instance__ =
                    new CatalogPermissionsSummary(catalogId, userPermissions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CatalogPermissionsSummary o) {
            Builder copiedBuilder =
                    catalogId(o.getCatalogId()).userPermissions(o.getUserPermissions());

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
     * The data catalog's OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    private final String catalogId;

    /**
     * The data catalog's OCID.
     * @return the value
     **/
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * An array of permissions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userPermissions")
    private final java.util.List<String> userPermissions;

    /**
     * An array of permissions.
     * @return the value
     **/
    public java.util.List<String> getUserPermissions() {
        return userPermissions;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CatalogPermissionsSummary(");
        sb.append("catalogId=").append(String.valueOf(this.catalogId));
        sb.append(", userPermissions=").append(String.valueOf(this.userPermissions));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogPermissionsSummary)) {
            return false;
        }

        CatalogPermissionsSummary other = (CatalogPermissionsSummary) o;
        return java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.userPermissions, other.userPermissions)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result =
                (result * PRIME)
                        + (this.userPermissions == null ? 43 : this.userPermissions.hashCode());
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
