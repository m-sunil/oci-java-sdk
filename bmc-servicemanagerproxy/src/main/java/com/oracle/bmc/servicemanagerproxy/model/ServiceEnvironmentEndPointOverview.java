/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemanagerproxy.model;

/**
 * An overview of service environment endpoints.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210914")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceEnvironmentEndPointOverview.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceEnvironmentEndPointOverview {
    @Deprecated
    @java.beans.ConstructorProperties({"environmentType", "url", "description"})
    public ServiceEnvironmentEndPointOverview(
            EnvironmentType environmentType, String url, String description) {
        super();
        this.environmentType = environmentType;
        this.url = url;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Service environment endpoint type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
        private EnvironmentType environmentType;

        /**
         * Service environment endpoint type.
         * @param environmentType the value to set
         * @return this builder
         **/
        public Builder environmentType(EnvironmentType environmentType) {
            this.environmentType = environmentType;
            this.__explicitlySet__.add("environmentType");
            return this;
        }
        /**
         * Service environment instance URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * Service environment instance URL.
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * Description of the environment link
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the environment link
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceEnvironmentEndPointOverview build() {
            ServiceEnvironmentEndPointOverview __instance__ =
                    new ServiceEnvironmentEndPointOverview(environmentType, url, description);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceEnvironmentEndPointOverview o) {
            Builder copiedBuilder =
                    environmentType(o.getEnvironmentType())
                            .url(o.getUrl())
                            .description(o.getDescription());

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
     * Service environment endpoint type.
     **/
    public enum EnvironmentType {
        InstanceUrlProd("INSTANCE_URL_PROD"),
        InstanceUrlTest("INSTANCE_URL_TEST"),
        InstanceUrlDev("INSTANCE_URL_DEV"),
        Other("OTHER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EnvironmentType.class);

        private final String value;
        private static java.util.Map<String, EnvironmentType> map;

        static {
            map = new java.util.HashMap<>();
            for (EnvironmentType v : EnvironmentType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EnvironmentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EnvironmentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EnvironmentType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Service environment endpoint type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
    private final EnvironmentType environmentType;

    /**
     * Service environment endpoint type.
     * @return the value
     **/
    public EnvironmentType getEnvironmentType() {
        return environmentType;
    }

    /**
     * Service environment instance URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * Service environment instance URL.
     * @return the value
     **/
    public String getUrl() {
        return url;
    }

    /**
     * Description of the environment link
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the environment link
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ServiceEnvironmentEndPointOverview(");
        sb.append("environmentType=").append(String.valueOf(this.environmentType));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceEnvironmentEndPointOverview)) {
            return false;
        }

        ServiceEnvironmentEndPointOverview other = (ServiceEnvironmentEndPointOverview) o;
        return java.util.Objects.equals(this.environmentType, other.environmentType)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.environmentType == null ? 43 : this.environmentType.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
