/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define extra options updating a cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateClusterOptionsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateClusterOptionsDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "admissionControllerOptions",
        "persistentVolumeConfig",
        "serviceLbConfig"
    })
    public UpdateClusterOptionsDetails(
            AdmissionControllerOptions admissionControllerOptions,
            PersistentVolumeConfigDetails persistentVolumeConfig,
            ServiceLbConfigDetails serviceLbConfig) {
        super();
        this.admissionControllerOptions = admissionControllerOptions;
        this.persistentVolumeConfig = persistentVolumeConfig;
        this.serviceLbConfig = serviceLbConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Configurable cluster admission controllers
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("admissionControllerOptions")
        private AdmissionControllerOptions admissionControllerOptions;

        /**
         * Configurable cluster admission controllers
         * @param admissionControllerOptions the value to set
         * @return this builder
         **/
        public Builder admissionControllerOptions(
                AdmissionControllerOptions admissionControllerOptions) {
            this.admissionControllerOptions = admissionControllerOptions;
            this.__explicitlySet__.add("admissionControllerOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeConfig")
        private PersistentVolumeConfigDetails persistentVolumeConfig;

        public Builder persistentVolumeConfig(
                PersistentVolumeConfigDetails persistentVolumeConfig) {
            this.persistentVolumeConfig = persistentVolumeConfig;
            this.__explicitlySet__.add("persistentVolumeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceLbConfig")
        private ServiceLbConfigDetails serviceLbConfig;

        public Builder serviceLbConfig(ServiceLbConfigDetails serviceLbConfig) {
            this.serviceLbConfig = serviceLbConfig;
            this.__explicitlySet__.add("serviceLbConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateClusterOptionsDetails build() {
            UpdateClusterOptionsDetails __instance__ =
                    new UpdateClusterOptionsDetails(
                            admissionControllerOptions, persistentVolumeConfig, serviceLbConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateClusterOptionsDetails o) {
            Builder copiedBuilder =
                    admissionControllerOptions(o.getAdmissionControllerOptions())
                            .persistentVolumeConfig(o.getPersistentVolumeConfig())
                            .serviceLbConfig(o.getServiceLbConfig());

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
     * Configurable cluster admission controllers
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("admissionControllerOptions")
    private final AdmissionControllerOptions admissionControllerOptions;

    /**
     * Configurable cluster admission controllers
     * @return the value
     **/
    public AdmissionControllerOptions getAdmissionControllerOptions() {
        return admissionControllerOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeConfig")
    private final PersistentVolumeConfigDetails persistentVolumeConfig;

    public PersistentVolumeConfigDetails getPersistentVolumeConfig() {
        return persistentVolumeConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serviceLbConfig")
    private final ServiceLbConfigDetails serviceLbConfig;

    public ServiceLbConfigDetails getServiceLbConfig() {
        return serviceLbConfig;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateClusterOptionsDetails(");
        sb.append("admissionControllerOptions=")
                .append(String.valueOf(this.admissionControllerOptions));
        sb.append(", persistentVolumeConfig=").append(String.valueOf(this.persistentVolumeConfig));
        sb.append(", serviceLbConfig=").append(String.valueOf(this.serviceLbConfig));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateClusterOptionsDetails)) {
            return false;
        }

        UpdateClusterOptionsDetails other = (UpdateClusterOptionsDetails) o;
        return java.util.Objects.equals(
                        this.admissionControllerOptions, other.admissionControllerOptions)
                && java.util.Objects.equals(
                        this.persistentVolumeConfig, other.persistentVolumeConfig)
                && java.util.Objects.equals(this.serviceLbConfig, other.serviceLbConfig)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.admissionControllerOptions == null
                                ? 43
                                : this.admissionControllerOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.persistentVolumeConfig == null
                                ? 43
                                : this.persistentVolumeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceLbConfig == null ? 43 : this.serviceLbConfig.hashCode());
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
