/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Data Transfer Medium details for the Migration.
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
    builder = DataTransferMediumDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataTransferMediumDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseLinkDetails",
        "objectStorageDetails",
        "awsS3Details"
    })
    public DataTransferMediumDetails(
            DatabaseLinkDetails databaseLinkDetails,
            ObjectStoreBucket objectStorageDetails,
            AwsS3Details awsS3Details) {
        super();
        this.databaseLinkDetails = databaseLinkDetails;
        this.objectStorageDetails = objectStorageDetails;
        this.awsS3Details = awsS3Details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("databaseLinkDetails")
        private DatabaseLinkDetails databaseLinkDetails;

        public Builder databaseLinkDetails(DatabaseLinkDetails databaseLinkDetails) {
            this.databaseLinkDetails = databaseLinkDetails;
            this.__explicitlySet__.add("databaseLinkDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageDetails")
        private ObjectStoreBucket objectStorageDetails;

        public Builder objectStorageDetails(ObjectStoreBucket objectStorageDetails) {
            this.objectStorageDetails = objectStorageDetails;
            this.__explicitlySet__.add("objectStorageDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("awsS3Details")
        private AwsS3Details awsS3Details;

        public Builder awsS3Details(AwsS3Details awsS3Details) {
            this.awsS3Details = awsS3Details;
            this.__explicitlySet__.add("awsS3Details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataTransferMediumDetails build() {
            DataTransferMediumDetails __instance__ =
                    new DataTransferMediumDetails(
                            databaseLinkDetails, objectStorageDetails, awsS3Details);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataTransferMediumDetails o) {
            Builder copiedBuilder =
                    databaseLinkDetails(o.getDatabaseLinkDetails())
                            .objectStorageDetails(o.getObjectStorageDetails())
                            .awsS3Details(o.getAwsS3Details());

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

    @com.fasterxml.jackson.annotation.JsonProperty("databaseLinkDetails")
    private final DatabaseLinkDetails databaseLinkDetails;

    public DatabaseLinkDetails getDatabaseLinkDetails() {
        return databaseLinkDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageDetails")
    private final ObjectStoreBucket objectStorageDetails;

    public ObjectStoreBucket getObjectStorageDetails() {
        return objectStorageDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("awsS3Details")
    private final AwsS3Details awsS3Details;

    public AwsS3Details getAwsS3Details() {
        return awsS3Details;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataTransferMediumDetails(");
        sb.append("databaseLinkDetails=").append(String.valueOf(this.databaseLinkDetails));
        sb.append(", objectStorageDetails=").append(String.valueOf(this.objectStorageDetails));
        sb.append(", awsS3Details=").append(String.valueOf(this.awsS3Details));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataTransferMediumDetails)) {
            return false;
        }

        DataTransferMediumDetails other = (DataTransferMediumDetails) o;
        return java.util.Objects.equals(this.databaseLinkDetails, other.databaseLinkDetails)
                && java.util.Objects.equals(this.objectStorageDetails, other.objectStorageDetails)
                && java.util.Objects.equals(this.awsS3Details, other.awsS3Details)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseLinkDetails == null
                                ? 43
                                : this.databaseLinkDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageDetails == null
                                ? 43
                                : this.objectStorageDetails.hashCode());
        result = (result * PRIME) + (this.awsS3Details == null ? 43 : this.awsS3Details.hashCode());
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
