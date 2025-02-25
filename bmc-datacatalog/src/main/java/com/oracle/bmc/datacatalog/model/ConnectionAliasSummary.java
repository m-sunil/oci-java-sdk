/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Summary representation of database aliases parsed from the file metadata.
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
    builder = ConnectionAliasSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConnectionAliasSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"aliasName", "aliasDetails"})
    public ConnectionAliasSummary(String aliasName, String aliasDetails) {
        super();
        this.aliasName = aliasName;
        this.aliasDetails = aliasDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
        private String aliasName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param aliasName the value to set
         * @return this builder
         **/
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            this.__explicitlySet__.add("aliasName");
            return this;
        }
        /**
         * The description about the database alias parsed from the file metadata.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aliasDetails")
        private String aliasDetails;

        /**
         * The description about the database alias parsed from the file metadata.
         *
         * @param aliasDetails the value to set
         * @return this builder
         **/
        public Builder aliasDetails(String aliasDetails) {
            this.aliasDetails = aliasDetails;
            this.__explicitlySet__.add("aliasDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectionAliasSummary build() {
            ConnectionAliasSummary __instance__ =
                    new ConnectionAliasSummary(aliasName, aliasDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectionAliasSummary o) {
            Builder copiedBuilder = aliasName(o.getAliasName()).aliasDetails(o.getAliasDetails());

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
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
    private final String aliasName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getAliasName() {
        return aliasName;
    }

    /**
     * The description about the database alias parsed from the file metadata.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aliasDetails")
    private final String aliasDetails;

    /**
     * The description about the database alias parsed from the file metadata.
     *
     * @return the value
     **/
    public String getAliasDetails() {
        return aliasDetails;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConnectionAliasSummary(");
        sb.append("aliasName=").append(String.valueOf(this.aliasName));
        sb.append(", aliasDetails=").append(String.valueOf(this.aliasDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionAliasSummary)) {
            return false;
        }

        ConnectionAliasSummary other = (ConnectionAliasSummary) o;
        return java.util.Objects.equals(this.aliasName, other.aliasName)
                && java.util.Objects.equals(this.aliasDetails, other.aliasDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.aliasName == null ? 43 : this.aliasName.hashCode());
        result = (result * PRIME) + (this.aliasDetails == null ? 43 : this.aliasDetails.hashCode());
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
