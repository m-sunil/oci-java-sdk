/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies a trigger schedule. Timing information for when to initiate automated syncs.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TriggerSchedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TriggerSchedule {
    @Deprecated
    @java.beans.ConstructorProperties({"scheduleType", "customSchedule"})
    public TriggerSchedule(ScheduleType scheduleType, String customSchedule) {
        super();
        this.scheduleType = scheduleType;
        this.customSchedule = customSchedule;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Different types of trigger schedule:
         * NONE - No automated synchronization schedule.
         * DEFAULT - Trigger schedule is every 30 minutes.
         * CUSTOM - Custom triggering schedule.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private ScheduleType scheduleType;

        /**
         * Different types of trigger schedule:
         * NONE - No automated synchronization schedule.
         * DEFAULT - Trigger schedule is every 30 minutes.
         * CUSTOM - Custom triggering schedule.
         *
         * @param scheduleType the value to set
         * @return this builder
         **/
        public Builder scheduleType(ScheduleType scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }
        /**
         * Valid if type is CUSTOM. Following RFC 5545 recurrence rules, we can specify starting time, occurrence frequency, and interval size.
         * Example for frequency could be DAILY/WEEKLY/HOURLY or any RFC 5545 supported frequency, which is followed by start time of this window.
         * You can control the start time with BYHOUR, BYMINUTE and BYSECONDS. It is followed by the interval size.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customSchedule")
        private String customSchedule;

        /**
         * Valid if type is CUSTOM. Following RFC 5545 recurrence rules, we can specify starting time, occurrence frequency, and interval size.
         * Example for frequency could be DAILY/WEEKLY/HOURLY or any RFC 5545 supported frequency, which is followed by start time of this window.
         * You can control the start time with BYHOUR, BYMINUTE and BYSECONDS. It is followed by the interval size.
         *
         * @param customSchedule the value to set
         * @return this builder
         **/
        public Builder customSchedule(String customSchedule) {
            this.customSchedule = customSchedule;
            this.__explicitlySet__.add("customSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TriggerSchedule build() {
            TriggerSchedule __instance__ = new TriggerSchedule(scheduleType, customSchedule);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TriggerSchedule o) {
            Builder copiedBuilder =
                    scheduleType(o.getScheduleType()).customSchedule(o.getCustomSchedule());

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
     * Different types of trigger schedule:
     * NONE - No automated synchronization schedule.
     * DEFAULT - Trigger schedule is every 30 minutes.
     * CUSTOM - Custom triggering schedule.
     *
     **/
    public enum ScheduleType {
        None("NONE"),
        Default("DEFAULT"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ScheduleType.class);

        private final String value;
        private static java.util.Map<String, ScheduleType> map;

        static {
            map = new java.util.HashMap<>();
            for (ScheduleType v : ScheduleType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ScheduleType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ScheduleType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ScheduleType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Different types of trigger schedule:
     * NONE - No automated synchronization schedule.
     * DEFAULT - Trigger schedule is every 30 minutes.
     * CUSTOM - Custom triggering schedule.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final ScheduleType scheduleType;

    /**
     * Different types of trigger schedule:
     * NONE - No automated synchronization schedule.
     * DEFAULT - Trigger schedule is every 30 minutes.
     * CUSTOM - Custom triggering schedule.
     *
     * @return the value
     **/
    public ScheduleType getScheduleType() {
        return scheduleType;
    }

    /**
     * Valid if type is CUSTOM. Following RFC 5545 recurrence rules, we can specify starting time, occurrence frequency, and interval size.
     * Example for frequency could be DAILY/WEEKLY/HOURLY or any RFC 5545 supported frequency, which is followed by start time of this window.
     * You can control the start time with BYHOUR, BYMINUTE and BYSECONDS. It is followed by the interval size.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customSchedule")
    private final String customSchedule;

    /**
     * Valid if type is CUSTOM. Following RFC 5545 recurrence rules, we can specify starting time, occurrence frequency, and interval size.
     * Example for frequency could be DAILY/WEEKLY/HOURLY or any RFC 5545 supported frequency, which is followed by start time of this window.
     * You can control the start time with BYHOUR, BYMINUTE and BYSECONDS. It is followed by the interval size.
     *
     * @return the value
     **/
    public String getCustomSchedule() {
        return customSchedule;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TriggerSchedule(");
        sb.append("scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", customSchedule=").append(String.valueOf(this.customSchedule));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TriggerSchedule)) {
            return false;
        }

        TriggerSchedule other = (TriggerSchedule) o;
        return java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.customSchedule, other.customSchedule)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result =
                (result * PRIME)
                        + (this.customSchedule == null ? 43 : this.customSchedule.hashCode());
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
