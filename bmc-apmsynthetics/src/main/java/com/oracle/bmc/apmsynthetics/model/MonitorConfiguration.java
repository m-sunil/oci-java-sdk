/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of monitor configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType",
    defaultImpl = MonitorConfiguration.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ScriptedRestMonitorConfiguration.class,
        name = "SCRIPTED_REST_CONFIG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ScriptedBrowserMonitorConfiguration.class,
        name = "SCRIPTED_BROWSER_CONFIG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RestMonitorConfiguration.class,
        name = "REST_CONFIG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BrowserMonitorConfiguration.class,
        name = "BROWSER_CONFIG"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class MonitorConfiguration {
    @Deprecated
    @java.beans.ConstructorProperties({"isFailureRetried"})
    protected MonitorConfiguration(Boolean isFailureRetried) {
        super();
        this.isFailureRetried = isFailureRetried;
    }

    /**
     * If isFailureRetried is enabled, then a failed call will be retried.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFailureRetried")
    private final Boolean isFailureRetried;

    /**
     * If isFailureRetried is enabled, then a failed call will be retried.
     * @return the value
     **/
    public Boolean getIsFailureRetried() {
        return isFailureRetried;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MonitorConfiguration(");
        sb.append("isFailureRetried=").append(String.valueOf(this.isFailureRetried));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitorConfiguration)) {
            return false;
        }

        MonitorConfiguration other = (MonitorConfiguration) o;
        return java.util.Objects.equals(this.isFailureRetried, other.isFailureRetried);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isFailureRetried == null ? 43 : this.isFailureRetried.hashCode());
        return result;
    }

    /**
     * Type of configuration.
     **/
    public enum ConfigType {
        BrowserConfig("BROWSER_CONFIG"),
        ScriptedBrowserConfig("SCRIPTED_BROWSER_CONFIG"),
        RestConfig("REST_CONFIG"),
        ScriptedRestConfig("SCRIPTED_REST_CONFIG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConfigType.class);

        private final String value;
        private static java.util.Map<String, ConfigType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConfigType v : ConfigType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConfigType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConfigType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConfigType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
