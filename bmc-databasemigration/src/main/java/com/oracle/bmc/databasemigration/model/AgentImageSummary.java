/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Available ODMS Agent Images.
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
    builder = AgentImageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AgentImageSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"version", "downloadUrl"})
    public AgentImageSummary(String version, String downloadUrl) {
        super();
        this.version = version;
        this.downloadUrl = downloadUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * ODMS Agent Image version.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * ODMS Agent Image version.
         *
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * URL to download Agent Image of the ODMS Agent.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("downloadUrl")
        private String downloadUrl;

        /**
         * URL to download Agent Image of the ODMS Agent.
         *
         * @param downloadUrl the value to set
         * @return this builder
         **/
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            this.__explicitlySet__.add("downloadUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AgentImageSummary build() {
            AgentImageSummary __instance__ = new AgentImageSummary(version, downloadUrl);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentImageSummary o) {
            Builder copiedBuilder = version(o.getVersion()).downloadUrl(o.getDownloadUrl());

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
     * ODMS Agent Image version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * ODMS Agent Image version.
     *
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * URL to download Agent Image of the ODMS Agent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("downloadUrl")
    private final String downloadUrl;

    /**
     * URL to download Agent Image of the ODMS Agent.
     *
     * @return the value
     **/
    public String getDownloadUrl() {
        return downloadUrl;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AgentImageSummary(");
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", downloadUrl=").append(String.valueOf(this.downloadUrl));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentImageSummary)) {
            return false;
        }

        AgentImageSummary other = (AgentImageSummary) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.downloadUrl, other.downloadUrl)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.downloadUrl == null ? 43 : this.downloadUrl.hashCode());
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
