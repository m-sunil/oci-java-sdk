/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * The collection of image details for the product license.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImageResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImageResponse {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "listingName",
        "publisher",
        "listingId",
        "packageVersion"
    })
    public ImageResponse(
            String id,
            String listingName,
            String publisher,
            String listingId,
            String packageVersion) {
        super();
        this.id = id;
        this.listingName = listingName;
        this.publisher = publisher;
        this.listingId = listingId;
        this.packageVersion = packageVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The image ID associated with the product license.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The image ID associated with the product license.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The listing name associated with the product license.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingName")
        private String listingName;

        /**
         * The listing name associated with the product license.
         * @param listingName the value to set
         * @return this builder
         **/
        public Builder listingName(String listingName) {
            this.listingName = listingName;
            this.__explicitlySet__.add("listingName");
            return this;
        }
        /**
         * The image publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publisher")
        private String publisher;

        /**
         * The image publisher.
         * @param publisher the value to set
         * @return this builder
         **/
        public Builder publisher(String publisher) {
            this.publisher = publisher;
            this.__explicitlySet__.add("publisher");
            return this;
        }
        /**
         * The image listing ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The image listing ID.
         * @param listingId the value to set
         * @return this builder
         **/
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /**
         * The image package version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
        private String packageVersion;

        /**
         * The image package version.
         * @param packageVersion the value to set
         * @return this builder
         **/
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            this.__explicitlySet__.add("packageVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageResponse build() {
            ImageResponse __instance__ =
                    new ImageResponse(id, listingName, publisher, listingId, packageVersion);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageResponse o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .listingName(o.getListingName())
                            .publisher(o.getPublisher())
                            .listingId(o.getListingId())
                            .packageVersion(o.getPackageVersion());

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
     * The image ID associated with the product license.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The image ID associated with the product license.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The listing name associated with the product license.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingName")
    private final String listingName;

    /**
     * The listing name associated with the product license.
     * @return the value
     **/
    public String getListingName() {
        return listingName;
    }

    /**
     * The image publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    private final String publisher;

    /**
     * The image publisher.
     * @return the value
     **/
    public String getPublisher() {
        return publisher;
    }

    /**
     * The image listing ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The image listing ID.
     * @return the value
     **/
    public String getListingId() {
        return listingId;
    }

    /**
     * The image package version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * The image package version.
     * @return the value
     **/
    public String getPackageVersion() {
        return packageVersion;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ImageResponse(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", listingName=").append(String.valueOf(this.listingName));
        sb.append(", publisher=").append(String.valueOf(this.publisher));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageResponse)) {
            return false;
        }

        ImageResponse other = (ImageResponse) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.listingName, other.listingName)
                && java.util.Objects.equals(this.publisher, other.publisher)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.listingName == null ? 43 : this.listingName.hashCode());
        result = (result * PRIME) + (this.publisher == null ? 43 : this.publisher.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
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
