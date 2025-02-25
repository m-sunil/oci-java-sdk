/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the storage configuration and status of a tenancy in Logan Analytics application
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Storage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Storage {
    @Deprecated
    @java.beans.ConstructorProperties({"isArchivingEnabled", "archivingConfiguration"})
    public Storage(Boolean isArchivingEnabled, ArchivingConfiguration archivingConfiguration) {
        super();
        this.isArchivingEnabled = isArchivingEnabled;
        this.archivingConfiguration = archivingConfiguration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This indicates if old data can be archived for a tenancy
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isArchivingEnabled")
        private Boolean isArchivingEnabled;

        /**
         * This indicates if old data can be archived for a tenancy
         * @param isArchivingEnabled the value to set
         * @return this builder
         **/
        public Builder isArchivingEnabled(Boolean isArchivingEnabled) {
            this.isArchivingEnabled = isArchivingEnabled;
            this.__explicitlySet__.add("isArchivingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("archivingConfiguration")
        private ArchivingConfiguration archivingConfiguration;

        public Builder archivingConfiguration(ArchivingConfiguration archivingConfiguration) {
            this.archivingConfiguration = archivingConfiguration;
            this.__explicitlySet__.add("archivingConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Storage build() {
            Storage __instance__ = new Storage(isArchivingEnabled, archivingConfiguration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Storage o) {
            Builder copiedBuilder =
                    isArchivingEnabled(o.getIsArchivingEnabled())
                            .archivingConfiguration(o.getArchivingConfiguration());

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
     * This indicates if old data can be archived for a tenancy
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isArchivingEnabled")
    private final Boolean isArchivingEnabled;

    /**
     * This indicates if old data can be archived for a tenancy
     * @return the value
     **/
    public Boolean getIsArchivingEnabled() {
        return isArchivingEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("archivingConfiguration")
    private final ArchivingConfiguration archivingConfiguration;

    public ArchivingConfiguration getArchivingConfiguration() {
        return archivingConfiguration;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Storage(");
        sb.append("isArchivingEnabled=").append(String.valueOf(this.isArchivingEnabled));
        sb.append(", archivingConfiguration=").append(String.valueOf(this.archivingConfiguration));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Storage)) {
            return false;
        }

        Storage other = (Storage) o;
        return java.util.Objects.equals(this.isArchivingEnabled, other.isArchivingEnabled)
                && java.util.Objects.equals(
                        this.archivingConfiguration, other.archivingConfiguration)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isArchivingEnabled == null
                                ? 43
                                : this.isArchivingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.archivingConfiguration == null
                                ? 43
                                : this.archivingConfiguration.hashCode());
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
