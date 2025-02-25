/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 *
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
    builder = ExportImageViaObjectStorageUriDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "destinationType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExportImageViaObjectStorageUriDetails extends ExportImageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("exportFormat")
        private ExportFormat exportFormat;

        public Builder exportFormat(ExportFormat exportFormat) {
            this.exportFormat = exportFormat;
            this.__explicitlySet__.add("exportFormat");
            return this;
        }
        /**
         * The Object Storage URL to export the image to. See [Object
         * Storage URLs](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm#URLs)
         * and [Using Pre-Authenticated Requests](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
         * for constructing URLs for image import/export.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationUri")
        private String destinationUri;

        /**
         * The Object Storage URL to export the image to. See [Object
         * Storage URLs](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm#URLs)
         * and [Using Pre-Authenticated Requests](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
         * for constructing URLs for image import/export.
         *
         * @param destinationUri the value to set
         * @return this builder
         **/
        public Builder destinationUri(String destinationUri) {
            this.destinationUri = destinationUri;
            this.__explicitlySet__.add("destinationUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportImageViaObjectStorageUriDetails build() {
            ExportImageViaObjectStorageUriDetails __instance__ =
                    new ExportImageViaObjectStorageUriDetails(exportFormat, destinationUri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportImageViaObjectStorageUriDetails o) {
            Builder copiedBuilder =
                    exportFormat(o.getExportFormat()).destinationUri(o.getDestinationUri());

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
    public ExportImageViaObjectStorageUriDetails(ExportFormat exportFormat, String destinationUri) {
        super(exportFormat);
        this.destinationUri = destinationUri;
    }

    /**
     * The Object Storage URL to export the image to. See [Object
     * Storage URLs](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm#URLs)
     * and [Using Pre-Authenticated Requests](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for constructing URLs for image import/export.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationUri")
    private final String destinationUri;

    /**
     * The Object Storage URL to export the image to. See [Object
     * Storage URLs](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm#URLs)
     * and [Using Pre-Authenticated Requests](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for constructing URLs for image import/export.
     *
     * @return the value
     **/
    public String getDestinationUri() {
        return destinationUri;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExportImageViaObjectStorageUriDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", destinationUri=").append(String.valueOf(this.destinationUri));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportImageViaObjectStorageUriDetails)) {
            return false;
        }

        ExportImageViaObjectStorageUriDetails other = (ExportImageViaObjectStorageUriDetails) o;
        return java.util.Objects.equals(this.destinationUri, other.destinationUri)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.destinationUri == null ? 43 : this.destinationUri.hashCode());
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
