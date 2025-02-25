/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration of the Database Management service.
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
    builder = CloudDatabaseManagementConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CloudDatabaseManagementConfig {
    @Deprecated
    @java.beans.ConstructorProperties({"managementStatus", "managementType"})
    public CloudDatabaseManagementConfig(
            ManagementStatus managementStatus, ManagementType managementType) {
        super();
        this.managementStatus = managementStatus;
        this.managementType = managementType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The status of the Database Management service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementStatus")
        private ManagementStatus managementStatus;

        /**
         * The status of the Database Management service.
         * @param managementStatus the value to set
         * @return this builder
         **/
        public Builder managementStatus(ManagementStatus managementStatus) {
            this.managementStatus = managementStatus;
            this.__explicitlySet__.add("managementStatus");
            return this;
        }
        /**
         * The Database Management type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementType")
        private ManagementType managementType;

        /**
         * The Database Management type.
         * @param managementType the value to set
         * @return this builder
         **/
        public Builder managementType(ManagementType managementType) {
            this.managementType = managementType;
            this.__explicitlySet__.add("managementType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudDatabaseManagementConfig build() {
            CloudDatabaseManagementConfig __instance__ =
                    new CloudDatabaseManagementConfig(managementStatus, managementType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudDatabaseManagementConfig o) {
            Builder copiedBuilder =
                    managementStatus(o.getManagementStatus()).managementType(o.getManagementType());

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
     * The status of the Database Management service.
     **/
    public enum ManagementStatus {
        Enabling("ENABLING"),
        Enabled("ENABLED"),
        Disabling("DISABLING"),
        Disabled("DISABLED"),
        Updating("UPDATING"),
        FailedEnabling("FAILED_ENABLING"),
        FailedDisabling("FAILED_DISABLING"),
        FailedUpdating("FAILED_UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ManagementStatus.class);

        private final String value;
        private static java.util.Map<String, ManagementStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagementStatus v : ManagementStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ManagementStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagementStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ManagementStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the Database Management service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementStatus")
    private final ManagementStatus managementStatus;

    /**
     * The status of the Database Management service.
     * @return the value
     **/
    public ManagementStatus getManagementStatus() {
        return managementStatus;
    }

    /**
     * The Database Management type.
     **/
    public enum ManagementType {
        Basic("BASIC"),
        Advanced("ADVANCED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ManagementType.class);

        private final String value;
        private static java.util.Map<String, ManagementType> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagementType v : ManagementType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ManagementType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagementType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ManagementType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Database Management type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementType")
    private final ManagementType managementType;

    /**
     * The Database Management type.
     * @return the value
     **/
    public ManagementType getManagementType() {
        return managementType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CloudDatabaseManagementConfig(");
        sb.append("managementStatus=").append(String.valueOf(this.managementStatus));
        sb.append(", managementType=").append(String.valueOf(this.managementType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudDatabaseManagementConfig)) {
            return false;
        }

        CloudDatabaseManagementConfig other = (CloudDatabaseManagementConfig) o;
        return java.util.Objects.equals(this.managementStatus, other.managementStatus)
                && java.util.Objects.equals(this.managementType, other.managementType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managementStatus == null ? 43 : this.managementStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.managementType == null ? 43 : this.managementType.hashCode());
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
