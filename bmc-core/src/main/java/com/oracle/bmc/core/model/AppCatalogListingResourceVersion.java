/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Listing Resource Version
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
    builder = AppCatalogListingResourceVersion.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppCatalogListingResourceVersion {
    @Deprecated
    @java.beans.ConstructorProperties({
        "listingId",
        "timePublished",
        "listingResourceId",
        "listingResourceVersion",
        "availableRegions",
        "compatibleShapes",
        "accessiblePorts",
        "allowedActions"
    })
    public AppCatalogListingResourceVersion(
            String listingId,
            java.util.Date timePublished,
            String listingResourceId,
            String listingResourceVersion,
            java.util.List<String> availableRegions,
            java.util.List<String> compatibleShapes,
            java.util.List<Integer> accessiblePorts,
            java.util.List<AllowedActions> allowedActions) {
        super();
        this.listingId = listingId;
        this.timePublished = timePublished;
        this.listingResourceId = listingResourceId;
        this.listingResourceVersion = listingResourceVersion;
        this.availableRegions = availableRegions;
        this.compatibleShapes = compatibleShapes;
        this.accessiblePorts = accessiblePorts;
        this.allowedActions = allowedActions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the listing this resource version belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The OCID of the listing this resource version belongs to.
         * @param listingId the value to set
         * @return this builder
         **/
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /**
         * Date and time the listing resource version was published, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
         * Example: {@code 2018-03-20T12:32:53.532Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
        private java.util.Date timePublished;

        /**
         * Date and time the listing resource version was published, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
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
         * OCID of the listing resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingResourceId")
        private String listingResourceId;

        /**
         * OCID of the listing resource.
         * @param listingResourceId the value to set
         * @return this builder
         **/
        public Builder listingResourceId(String listingResourceId) {
            this.listingResourceId = listingResourceId;
            this.__explicitlySet__.add("listingResourceId");
            return this;
        }
        /**
         * Resource Version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
        private String listingResourceVersion;

        /**
         * Resource Version.
         * @param listingResourceVersion the value to set
         * @return this builder
         **/
        public Builder listingResourceVersion(String listingResourceVersion) {
            this.listingResourceVersion = listingResourceVersion;
            this.__explicitlySet__.add("listingResourceVersion");
            return this;
        }
        /**
         * List of regions that this listing resource version is available.
         * <p>
         * For information about regions, see
         * [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm).
         * <p>
         * Example: {@code ["us-ashburn-1", "us-phoenix-1"]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableRegions")
        private java.util.List<String> availableRegions;

        /**
         * List of regions that this listing resource version is available.
         * <p>
         * For information about regions, see
         * [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm).
         * <p>
         * Example: {@code ["us-ashburn-1", "us-phoenix-1"]}
         *
         * @param availableRegions the value to set
         * @return this builder
         **/
        public Builder availableRegions(java.util.List<String> availableRegions) {
            this.availableRegions = availableRegions;
            this.__explicitlySet__.add("availableRegions");
            return this;
        }
        /**
         * Array of shapes compatible with this resource.
         * <p>
         * You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
         * <p>
         * Example: {@code ["VM.Standard1.1", "VM.Standard1.2"]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compatibleShapes")
        private java.util.List<String> compatibleShapes;

        /**
         * Array of shapes compatible with this resource.
         * <p>
         * You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
         * <p>
         * Example: {@code ["VM.Standard1.1", "VM.Standard1.2"]}
         *
         * @param compatibleShapes the value to set
         * @return this builder
         **/
        public Builder compatibleShapes(java.util.List<String> compatibleShapes) {
            this.compatibleShapes = compatibleShapes;
            this.__explicitlySet__.add("compatibleShapes");
            return this;
        }
        /**
         * List of accessible ports for instances launched with this listing resource version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessiblePorts")
        private java.util.List<Integer> accessiblePorts;

        /**
         * List of accessible ports for instances launched with this listing resource version.
         * @param accessiblePorts the value to set
         * @return this builder
         **/
        public Builder accessiblePorts(java.util.List<Integer> accessiblePorts) {
            this.accessiblePorts = accessiblePorts;
            this.__explicitlySet__.add("accessiblePorts");
            return this;
        }
        /**
         * Allowed actions for the listing resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedActions")
        private java.util.List<AllowedActions> allowedActions;

        /**
         * Allowed actions for the listing resource.
         * @param allowedActions the value to set
         * @return this builder
         **/
        public Builder allowedActions(java.util.List<AllowedActions> allowedActions) {
            this.allowedActions = allowedActions;
            this.__explicitlySet__.add("allowedActions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppCatalogListingResourceVersion build() {
            AppCatalogListingResourceVersion __instance__ =
                    new AppCatalogListingResourceVersion(
                            listingId,
                            timePublished,
                            listingResourceId,
                            listingResourceVersion,
                            availableRegions,
                            compatibleShapes,
                            accessiblePorts,
                            allowedActions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppCatalogListingResourceVersion o) {
            Builder copiedBuilder =
                    listingId(o.getListingId())
                            .timePublished(o.getTimePublished())
                            .listingResourceId(o.getListingResourceId())
                            .listingResourceVersion(o.getListingResourceVersion())
                            .availableRegions(o.getAvailableRegions())
                            .compatibleShapes(o.getCompatibleShapes())
                            .accessiblePorts(o.getAccessiblePorts())
                            .allowedActions(o.getAllowedActions());

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
     * The OCID of the listing this resource version belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The OCID of the listing this resource version belongs to.
     * @return the value
     **/
    public String getListingId() {
        return listingId;
    }

    /**
     * Date and time the listing resource version was published, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
     * Example: {@code 2018-03-20T12:32:53.532Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
    private final java.util.Date timePublished;

    /**
     * Date and time the listing resource version was published, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
     * Example: {@code 2018-03-20T12:32:53.532Z}
     *
     * @return the value
     **/
    public java.util.Date getTimePublished() {
        return timePublished;
    }

    /**
     * OCID of the listing resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingResourceId")
    private final String listingResourceId;

    /**
     * OCID of the listing resource.
     * @return the value
     **/
    public String getListingResourceId() {
        return listingResourceId;
    }

    /**
     * Resource Version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
    private final String listingResourceVersion;

    /**
     * Resource Version.
     * @return the value
     **/
    public String getListingResourceVersion() {
        return listingResourceVersion;
    }

    /**
     * List of regions that this listing resource version is available.
     * <p>
     * For information about regions, see
     * [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm).
     * <p>
     * Example: {@code ["us-ashburn-1", "us-phoenix-1"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableRegions")
    private final java.util.List<String> availableRegions;

    /**
     * List of regions that this listing resource version is available.
     * <p>
     * For information about regions, see
     * [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm).
     * <p>
     * Example: {@code ["us-ashburn-1", "us-phoenix-1"]}
     *
     * @return the value
     **/
    public java.util.List<String> getAvailableRegions() {
        return availableRegions;
    }

    /**
     * Array of shapes compatible with this resource.
     * <p>
     * You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
     * <p>
     * Example: {@code ["VM.Standard1.1", "VM.Standard1.2"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compatibleShapes")
    private final java.util.List<String> compatibleShapes;

    /**
     * Array of shapes compatible with this resource.
     * <p>
     * You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
     * <p>
     * Example: {@code ["VM.Standard1.1", "VM.Standard1.2"]}
     *
     * @return the value
     **/
    public java.util.List<String> getCompatibleShapes() {
        return compatibleShapes;
    }

    /**
     * List of accessible ports for instances launched with this listing resource version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessiblePorts")
    private final java.util.List<Integer> accessiblePorts;

    /**
     * List of accessible ports for instances launched with this listing resource version.
     * @return the value
     **/
    public java.util.List<Integer> getAccessiblePorts() {
        return accessiblePorts;
    }

    /**
     **/
    public enum AllowedActions {
        Snapshot("SNAPSHOT"),
        BootVolumeDetach("BOOT_VOLUME_DETACH"),
        PreserveBootVolume("PRESERVE_BOOT_VOLUME"),
        SerialConsoleAccess("SERIAL_CONSOLE_ACCESS"),
        BootRecovery("BOOT_RECOVERY"),
        BackupBootVolume("BACKUP_BOOT_VOLUME"),
        CaptureConsoleHistory("CAPTURE_CONSOLE_HISTORY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AllowedActions.class);

        private final String value;
        private static java.util.Map<String, AllowedActions> map;

        static {
            map = new java.util.HashMap<>();
            for (AllowedActions v : AllowedActions.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AllowedActions(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AllowedActions create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AllowedActions', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Allowed actions for the listing resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedActions")
    private final java.util.List<AllowedActions> allowedActions;

    /**
     * Allowed actions for the listing resource.
     * @return the value
     **/
    public java.util.List<AllowedActions> getAllowedActions() {
        return allowedActions;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AppCatalogListingResourceVersion(");
        sb.append("listingId=").append(String.valueOf(this.listingId));
        sb.append(", timePublished=").append(String.valueOf(this.timePublished));
        sb.append(", listingResourceId=").append(String.valueOf(this.listingResourceId));
        sb.append(", listingResourceVersion=").append(String.valueOf(this.listingResourceVersion));
        sb.append(", availableRegions=").append(String.valueOf(this.availableRegions));
        sb.append(", compatibleShapes=").append(String.valueOf(this.compatibleShapes));
        sb.append(", accessiblePorts=").append(String.valueOf(this.accessiblePorts));
        sb.append(", allowedActions=").append(String.valueOf(this.allowedActions));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppCatalogListingResourceVersion)) {
            return false;
        }

        AppCatalogListingResourceVersion other = (AppCatalogListingResourceVersion) o;
        return java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.timePublished, other.timePublished)
                && java.util.Objects.equals(this.listingResourceId, other.listingResourceId)
                && java.util.Objects.equals(
                        this.listingResourceVersion, other.listingResourceVersion)
                && java.util.Objects.equals(this.availableRegions, other.availableRegions)
                && java.util.Objects.equals(this.compatibleShapes, other.compatibleShapes)
                && java.util.Objects.equals(this.accessiblePorts, other.accessiblePorts)
                && java.util.Objects.equals(this.allowedActions, other.allowedActions)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.timePublished == null ? 43 : this.timePublished.hashCode());
        result =
                (result * PRIME)
                        + (this.listingResourceId == null ? 43 : this.listingResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.listingResourceVersion == null
                                ? 43
                                : this.listingResourceVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.availableRegions == null ? 43 : this.availableRegions.hashCode());
        result =
                (result * PRIME)
                        + (this.compatibleShapes == null ? 43 : this.compatibleShapes.hashCode());
        result =
                (result * PRIME)
                        + (this.accessiblePorts == null ? 43 : this.accessiblePorts.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedActions == null ? 43 : this.allowedActions.hashCode());
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
