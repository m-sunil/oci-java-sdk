/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Listing details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AppCatalogListing.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppCatalogListing {
    @Deprecated
    @java.beans.ConstructorProperties({
        "contactUrl",
        "description",
        "listingId",
        "displayName",
        "timePublished",
        "publisherLogoUrl",
        "publisherName",
        "summary"
    })
    public AppCatalogListing(
            String contactUrl,
            String description,
            String listingId,
            String displayName,
            java.util.Date timePublished,
            String publisherLogoUrl,
            String publisherName,
            String summary) {
        super();
        this.contactUrl = contactUrl;
        this.description = description;
        this.listingId = listingId;
        this.displayName = displayName;
        this.timePublished = timePublished;
        this.publisherLogoUrl = publisherLogoUrl;
        this.publisherName = publisherName;
        this.summary = summary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Listing's contact URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactUrl")
        private String contactUrl;

        /**
         * Listing's contact URL.
         * @param contactUrl the value to set
         * @return this builder
         **/
        public Builder contactUrl(String contactUrl) {
            this.contactUrl = contactUrl;
            this.__explicitlySet__.add("contactUrl");
            return this;
        }
        /**
         * Description of the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the listing.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The OCID of the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The OCID of the listing.
         * @param listingId the value to set
         * @return this builder
         **/
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Date and time the listing was published, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
         * Example: {@code 2018-03-20T12:32:53.532Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
        private java.util.Date timePublished;

        /**
         * Date and time the listing was published, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
         * Example: {@code 2018-03-20T12:32:53.532Z}
         *
         * @param timePublished the value to set
         * @return this builder
         **/
        public Builder timePublished(java.util.Date timePublished) {
            this.timePublished = timePublished;
            this.__explicitlySet__.add("timePublished");
            return this;
        }
        /**
         * Publisher's logo URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publisherLogoUrl")
        private String publisherLogoUrl;

        /**
         * Publisher's logo URL.
         * @param publisherLogoUrl the value to set
         * @return this builder
         **/
        public Builder publisherLogoUrl(String publisherLogoUrl) {
            this.publisherLogoUrl = publisherLogoUrl;
            this.__explicitlySet__.add("publisherLogoUrl");
            return this;
        }
        /**
         * Name of the publisher who published this listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publisherName")
        private String publisherName;

        /**
         * Name of the publisher who published this listing.
         * @param publisherName the value to set
         * @return this builder
         **/
        public Builder publisherName(String publisherName) {
            this.publisherName = publisherName;
            this.__explicitlySet__.add("publisherName");
            return this;
        }
        /**
         * Summary of the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        /**
         * Summary of the listing.
         * @param summary the value to set
         * @return this builder
         **/
        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppCatalogListing build() {
            AppCatalogListing __instance__ =
                    new AppCatalogListing(
                            contactUrl,
                            description,
                            listingId,
                            displayName,
                            timePublished,
                            publisherLogoUrl,
                            publisherName,
                            summary);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppCatalogListing o) {
            Builder copiedBuilder =
                    contactUrl(o.getContactUrl())
                            .description(o.getDescription())
                            .listingId(o.getListingId())
                            .displayName(o.getDisplayName())
                            .timePublished(o.getTimePublished())
                            .publisherLogoUrl(o.getPublisherLogoUrl())
                            .publisherName(o.getPublisherName())
                            .summary(o.getSummary());

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
     * Listing's contact URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactUrl")
    private final String contactUrl;

    /**
     * Listing's contact URL.
     * @return the value
     **/
    public String getContactUrl() {
        return contactUrl;
    }

    /**
     * Description of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the listing.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The OCID of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The OCID of the listing.
     * @return the value
     **/
    public String getListingId() {
        return listingId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Date and time the listing was published, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
     * Example: {@code 2018-03-20T12:32:53.532Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
    private final java.util.Date timePublished;

    /**
     * Date and time the listing was published, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
     * Example: {@code 2018-03-20T12:32:53.532Z}
     *
     * @return the value
     **/
    public java.util.Date getTimePublished() {
        return timePublished;
    }

    /**
     * Publisher's logo URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisherLogoUrl")
    private final String publisherLogoUrl;

    /**
     * Publisher's logo URL.
     * @return the value
     **/
    public String getPublisherLogoUrl() {
        return publisherLogoUrl;
    }

    /**
     * Name of the publisher who published this listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisherName")
    private final String publisherName;

    /**
     * Name of the publisher who published this listing.
     * @return the value
     **/
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Summary of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * Summary of the listing.
     * @return the value
     **/
    public String getSummary() {
        return summary;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AppCatalogListing(");
        sb.append("contactUrl=").append(String.valueOf(this.contactUrl));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timePublished=").append(String.valueOf(this.timePublished));
        sb.append(", publisherLogoUrl=").append(String.valueOf(this.publisherLogoUrl));
        sb.append(", publisherName=").append(String.valueOf(this.publisherName));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppCatalogListing)) {
            return false;
        }

        AppCatalogListing other = (AppCatalogListing) o;
        return java.util.Objects.equals(this.contactUrl, other.contactUrl)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timePublished, other.timePublished)
                && java.util.Objects.equals(this.publisherLogoUrl, other.publisherLogoUrl)
                && java.util.Objects.equals(this.publisherName, other.publisherName)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.contactUrl == null ? 43 : this.contactUrl.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.timePublished == null ? 43 : this.timePublished.hashCode());
        result =
                (result * PRIME)
                        + (this.publisherLogoUrl == null ? 43 : this.publisherLogoUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.publisherName == null ? 43 : this.publisherName.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
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
