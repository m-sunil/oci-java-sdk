/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Problem endpoints summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProblemEndpointSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProblemEndpointSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "sightingId",
        "problemId",
        "sightingType",
        "sightingTypeDisplayName",
        "ipAddress",
        "ipAddressType",
        "ipClassificationType",
        "country",
        "latitude",
        "longitude",
        "asnNumber",
        "regions",
        "services",
        "timeLastDetected"
    })
    public ProblemEndpointSummary(
            String id,
            String sightingId,
            String problemId,
            String sightingType,
            String sightingTypeDisplayName,
            String ipAddress,
            String ipAddressType,
            String ipClassificationType,
            String country,
            Double latitude,
            Double longitude,
            String asnNumber,
            java.util.List<String> regions,
            java.util.List<String> services,
            java.util.Date timeLastDetected) {
        super();
        this.id = id;
        this.sightingId = sightingId;
        this.problemId = problemId;
        this.sightingType = sightingType;
        this.sightingTypeDisplayName = sightingTypeDisplayName;
        this.ipAddress = ipAddress;
        this.ipAddressType = ipAddressType;
        this.ipClassificationType = ipClassificationType;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.asnNumber = asnNumber;
        this.regions = regions;
        this.services = services;
        this.timeLastDetected = timeLastDetected;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for problem endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for problem endpoint.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique id for sighting associated with the endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sightingId")
        private String sightingId;

        /**
         * Unique id for sighting associated with the endpoint.
         * @param sightingId the value to set
         * @return this builder
         **/
        public Builder sightingId(String sightingId) {
            this.sightingId = sightingId;
            this.__explicitlySet__.add("sightingId");
            return this;
        }
        /**
         * Unique id for cloudguard problem
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        /**
         * Unique id for cloudguard problem
         * @param problemId the value to set
         * @return this builder
         **/
        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }
        /**
         * Identifier for the sighting type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
        private String sightingType;

        /**
         * Identifier for the sighting type
         * @param sightingType the value to set
         * @return this builder
         **/
        public Builder sightingType(String sightingType) {
            this.sightingType = sightingType;
            this.__explicitlySet__.add("sightingType");
            return this;
        }
        /**
         * Display Name of the sighting type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
        private String sightingTypeDisplayName;

        /**
         * Display Name of the sighting type
         * @param sightingTypeDisplayName the value to set
         * @return this builder
         **/
        public Builder sightingTypeDisplayName(String sightingTypeDisplayName) {
            this.sightingTypeDisplayName = sightingTypeDisplayName;
            this.__explicitlySet__.add("sightingTypeDisplayName");
            return this;
        }
        /**
         * IP Address of the Endpoint
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * IP Address of the Endpoint
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * IP Address type of the Endpoint
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddressType")
        private String ipAddressType;

        /**
         * IP Address type of the Endpoint
         * @param ipAddressType the value to set
         * @return this builder
         **/
        public Builder ipAddressType(String ipAddressType) {
            this.ipAddressType = ipAddressType;
            this.__explicitlySet__.add("ipAddressType");
            return this;
        }
        /**
         * IP Address classification type of the endpoint
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipClassificationType")
        private String ipClassificationType;

        /**
         * IP Address classification type of the endpoint
         * @param ipClassificationType the value to set
         * @return this builder
         **/
        public Builder ipClassificationType(String ipClassificationType) {
            this.ipClassificationType = ipClassificationType;
            this.__explicitlySet__.add("ipClassificationType");
            return this;
        }
        /**
         * Country of the endpoint
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Country of the endpoint
         * @param country the value to set
         * @return this builder
         **/
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /**
         * Latitude of the endpoint
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("latitude")
        private Double latitude;

        /**
         * Latitude of the endpoint
         * @param latitude the value to set
         * @return this builder
         **/
        public Builder latitude(Double latitude) {
            this.latitude = latitude;
            this.__explicitlySet__.add("latitude");
            return this;
        }
        /**
         * Longitude of the endpoint
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("longitude")
        private Double longitude;

        /**
         * Longitude of the endpoint
         * @param longitude the value to set
         * @return this builder
         **/
        public Builder longitude(Double longitude) {
            this.longitude = longitude;
            this.__explicitlySet__.add("longitude");
            return this;
        }
        /**
         * ASN number of the endpoint
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("asnNumber")
        private String asnNumber;

        /**
         * ASN number of the endpoint
         * @param asnNumber the value to set
         * @return this builder
         **/
        public Builder asnNumber(String asnNumber) {
            this.asnNumber = asnNumber;
            this.__explicitlySet__.add("asnNumber");
            return this;
        }
        /**
         * Regions where activities were performed from this IP
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        /**
         * Regions where activities were performed from this IP
         * @param regions the value to set
         * @return this builder
         **/
        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }
        /**
         * Services where activities were performed from this IP
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<String> services;

        /**
         * Services where activities were performed from this IP
         * @param services the value to set
         * @return this builder
         **/
        public Builder services(java.util.List<String> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }
        /**
         * Time when activities were last detected
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
        private java.util.Date timeLastDetected;

        /**
         * Time when activities were last detected
         * @param timeLastDetected the value to set
         * @return this builder
         **/
        public Builder timeLastDetected(java.util.Date timeLastDetected) {
            this.timeLastDetected = timeLastDetected;
            this.__explicitlySet__.add("timeLastDetected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProblemEndpointSummary build() {
            ProblemEndpointSummary __instance__ =
                    new ProblemEndpointSummary(
                            id,
                            sightingId,
                            problemId,
                            sightingType,
                            sightingTypeDisplayName,
                            ipAddress,
                            ipAddressType,
                            ipClassificationType,
                            country,
                            latitude,
                            longitude,
                            asnNumber,
                            regions,
                            services,
                            timeLastDetected);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProblemEndpointSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .sightingId(o.getSightingId())
                            .problemId(o.getProblemId())
                            .sightingType(o.getSightingType())
                            .sightingTypeDisplayName(o.getSightingTypeDisplayName())
                            .ipAddress(o.getIpAddress())
                            .ipAddressType(o.getIpAddressType())
                            .ipClassificationType(o.getIpClassificationType())
                            .country(o.getCountry())
                            .latitude(o.getLatitude())
                            .longitude(o.getLongitude())
                            .asnNumber(o.getAsnNumber())
                            .regions(o.getRegions())
                            .services(o.getServices())
                            .timeLastDetected(o.getTimeLastDetected());

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
     * Unique identifier for problem endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for problem endpoint.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Unique id for sighting associated with the endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingId")
    private final String sightingId;

    /**
     * Unique id for sighting associated with the endpoint.
     * @return the value
     **/
    public String getSightingId() {
        return sightingId;
    }

    /**
     * Unique id for cloudguard problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    private final String problemId;

    /**
     * Unique id for cloudguard problem
     * @return the value
     **/
    public String getProblemId() {
        return problemId;
    }

    /**
     * Identifier for the sighting type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
    private final String sightingType;

    /**
     * Identifier for the sighting type
     * @return the value
     **/
    public String getSightingType() {
        return sightingType;
    }

    /**
     * Display Name of the sighting type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
    private final String sightingTypeDisplayName;

    /**
     * Display Name of the sighting type
     * @return the value
     **/
    public String getSightingTypeDisplayName() {
        return sightingTypeDisplayName;
    }

    /**
     * IP Address of the Endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * IP Address of the Endpoint
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * IP Address type of the Endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddressType")
    private final String ipAddressType;

    /**
     * IP Address type of the Endpoint
     * @return the value
     **/
    public String getIpAddressType() {
        return ipAddressType;
    }

    /**
     * IP Address classification type of the endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipClassificationType")
    private final String ipClassificationType;

    /**
     * IP Address classification type of the endpoint
     * @return the value
     **/
    public String getIpClassificationType() {
        return ipClassificationType;
    }

    /**
     * Country of the endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Country of the endpoint
     * @return the value
     **/
    public String getCountry() {
        return country;
    }

    /**
     * Latitude of the endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latitude")
    private final Double latitude;

    /**
     * Latitude of the endpoint
     * @return the value
     **/
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Longitude of the endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longitude")
    private final Double longitude;

    /**
     * Longitude of the endpoint
     * @return the value
     **/
    public Double getLongitude() {
        return longitude;
    }

    /**
     * ASN number of the endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asnNumber")
    private final String asnNumber;

    /**
     * ASN number of the endpoint
     * @return the value
     **/
    public String getAsnNumber() {
        return asnNumber;
    }

    /**
     * Regions where activities were performed from this IP
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<String> regions;

    /**
     * Regions where activities were performed from this IP
     * @return the value
     **/
    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * Services where activities were performed from this IP
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    private final java.util.List<String> services;

    /**
     * Services where activities were performed from this IP
     * @return the value
     **/
    public java.util.List<String> getServices() {
        return services;
    }

    /**
     * Time when activities were last detected
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
    private final java.util.Date timeLastDetected;

    /**
     * Time when activities were last detected
     * @return the value
     **/
    public java.util.Date getTimeLastDetected() {
        return timeLastDetected;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProblemEndpointSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", sightingId=").append(String.valueOf(this.sightingId));
        sb.append(", problemId=").append(String.valueOf(this.problemId));
        sb.append(", sightingType=").append(String.valueOf(this.sightingType));
        sb.append(", sightingTypeDisplayName=")
                .append(String.valueOf(this.sightingTypeDisplayName));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", ipAddressType=").append(String.valueOf(this.ipAddressType));
        sb.append(", ipClassificationType=").append(String.valueOf(this.ipClassificationType));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", latitude=").append(String.valueOf(this.latitude));
        sb.append(", longitude=").append(String.valueOf(this.longitude));
        sb.append(", asnNumber=").append(String.valueOf(this.asnNumber));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append(", services=").append(String.valueOf(this.services));
        sb.append(", timeLastDetected=").append(String.valueOf(this.timeLastDetected));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProblemEndpointSummary)) {
            return false;
        }

        ProblemEndpointSummary other = (ProblemEndpointSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.sightingId, other.sightingId)
                && java.util.Objects.equals(this.problemId, other.problemId)
                && java.util.Objects.equals(this.sightingType, other.sightingType)
                && java.util.Objects.equals(
                        this.sightingTypeDisplayName, other.sightingTypeDisplayName)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.ipAddressType, other.ipAddressType)
                && java.util.Objects.equals(this.ipClassificationType, other.ipClassificationType)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.latitude, other.latitude)
                && java.util.Objects.equals(this.longitude, other.longitude)
                && java.util.Objects.equals(this.asnNumber, other.asnNumber)
                && java.util.Objects.equals(this.regions, other.regions)
                && java.util.Objects.equals(this.services, other.services)
                && java.util.Objects.equals(this.timeLastDetected, other.timeLastDetected)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.sightingId == null ? 43 : this.sightingId.hashCode());
        result = (result * PRIME) + (this.problemId == null ? 43 : this.problemId.hashCode());
        result = (result * PRIME) + (this.sightingType == null ? 43 : this.sightingType.hashCode());
        result =
                (result * PRIME)
                        + (this.sightingTypeDisplayName == null
                                ? 43
                                : this.sightingTypeDisplayName.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.ipAddressType == null ? 43 : this.ipAddressType.hashCode());
        result =
                (result * PRIME)
                        + (this.ipClassificationType == null
                                ? 43
                                : this.ipClassificationType.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.latitude == null ? 43 : this.latitude.hashCode());
        result = (result * PRIME) + (this.longitude == null ? 43 : this.longitude.hashCode());
        result = (result * PRIME) + (this.asnNumber == null ? 43 : this.asnNumber.hashCode());
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result = (result * PRIME) + (this.services == null ? 43 : this.services.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDetected == null ? 43 : this.timeLastDetected.hashCode());
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
