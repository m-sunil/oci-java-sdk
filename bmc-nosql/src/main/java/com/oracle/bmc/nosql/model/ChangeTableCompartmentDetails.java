/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Specification of both from and to compartments.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ChangeTableCompartmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChangeTableCompartmentDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"fromCompartmentId", "toCompartmentId"})
    public ChangeTableCompartmentDetails(String fromCompartmentId, String toCompartmentId) {
        super();
        this.fromCompartmentId = fromCompartmentId;
        this.toCompartmentId = toCompartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the table's current compartment.  Required
         * if the tableNameOrId path parameter is a table name.
         * Optional if tableNameOrId is an OCID.  If tableNameOrId
         * is an OCID, and fromCompartmentId is supplied, the latter
         * must match the identified table's current compartmentId.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fromCompartmentId")
        private String fromCompartmentId;

        /**
         * The OCID of the table's current compartment.  Required
         * if the tableNameOrId path parameter is a table name.
         * Optional if tableNameOrId is an OCID.  If tableNameOrId
         * is an OCID, and fromCompartmentId is supplied, the latter
         * must match the identified table's current compartmentId.
         *
         * @param fromCompartmentId the value to set
         * @return this builder
         **/
        public Builder fromCompartmentId(String fromCompartmentId) {
            this.fromCompartmentId = fromCompartmentId;
            this.__explicitlySet__.add("fromCompartmentId");
            return this;
        }
        /**
         * The OCID of the table's new compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("toCompartmentId")
        private String toCompartmentId;

        /**
         * The OCID of the table's new compartment.
         * @param toCompartmentId the value to set
         * @return this builder
         **/
        public Builder toCompartmentId(String toCompartmentId) {
            this.toCompartmentId = toCompartmentId;
            this.__explicitlySet__.add("toCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeTableCompartmentDetails build() {
            ChangeTableCompartmentDetails __instance__ =
                    new ChangeTableCompartmentDetails(fromCompartmentId, toCompartmentId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeTableCompartmentDetails o) {
            Builder copiedBuilder =
                    fromCompartmentId(o.getFromCompartmentId())
                            .toCompartmentId(o.getToCompartmentId());

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
     * The OCID of the table's current compartment.  Required
     * if the tableNameOrId path parameter is a table name.
     * Optional if tableNameOrId is an OCID.  If tableNameOrId
     * is an OCID, and fromCompartmentId is supplied, the latter
     * must match the identified table's current compartmentId.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fromCompartmentId")
    private final String fromCompartmentId;

    /**
     * The OCID of the table's current compartment.  Required
     * if the tableNameOrId path parameter is a table name.
     * Optional if tableNameOrId is an OCID.  If tableNameOrId
     * is an OCID, and fromCompartmentId is supplied, the latter
     * must match the identified table's current compartmentId.
     *
     * @return the value
     **/
    public String getFromCompartmentId() {
        return fromCompartmentId;
    }

    /**
     * The OCID of the table's new compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toCompartmentId")
    private final String toCompartmentId;

    /**
     * The OCID of the table's new compartment.
     * @return the value
     **/
    public String getToCompartmentId() {
        return toCompartmentId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChangeTableCompartmentDetails(");
        sb.append("fromCompartmentId=").append(String.valueOf(this.fromCompartmentId));
        sb.append(", toCompartmentId=").append(String.valueOf(this.toCompartmentId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeTableCompartmentDetails)) {
            return false;
        }

        ChangeTableCompartmentDetails other = (ChangeTableCompartmentDetails) o;
        return java.util.Objects.equals(this.fromCompartmentId, other.fromCompartmentId)
                && java.util.Objects.equals(this.toCompartmentId, other.toCompartmentId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.fromCompartmentId == null ? 43 : this.fromCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.toCompartmentId == null ? 43 : this.toCompartmentId.hashCode());
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
