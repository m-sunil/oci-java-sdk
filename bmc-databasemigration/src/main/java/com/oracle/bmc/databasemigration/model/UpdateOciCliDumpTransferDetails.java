/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Optional dump transfer details for OCI-CLI-based dump transfer in source or target host.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOciCliDumpTransferDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOciCliDumpTransferDetails extends UpdateHostDumpTransferDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Path to the OCI CLI installation in the node.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ociHome")
        private String ociHome;

        /**
         * Path to the OCI CLI installation in the node.
         *
         * @param ociHome the value to set
         * @return this builder
         **/
        public Builder ociHome(String ociHome) {
            this.ociHome = ociHome;
            this.__explicitlySet__.add("ociHome");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOciCliDumpTransferDetails build() {
            UpdateOciCliDumpTransferDetails __instance__ =
                    new UpdateOciCliDumpTransferDetails(ociHome);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOciCliDumpTransferDetails o) {
            Builder copiedBuilder = ociHome(o.getOciHome());

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

    @Deprecated
    public UpdateOciCliDumpTransferDetails(String ociHome) {
        super();
        this.ociHome = ociHome;
    }

    /**
     * Path to the OCI CLI installation in the node.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ociHome")
    private final String ociHome;

    /**
     * Path to the OCI CLI installation in the node.
     *
     * @return the value
     **/
    public String getOciHome() {
        return ociHome;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateOciCliDumpTransferDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", ociHome=").append(String.valueOf(this.ociHome));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOciCliDumpTransferDetails)) {
            return false;
        }

        UpdateOciCliDumpTransferDetails other = (UpdateOciCliDumpTransferDetails) o;
        return java.util.Objects.equals(this.ociHome, other.ociHome)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ociHome == null ? 43 : this.ociHome.hashCode());
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
