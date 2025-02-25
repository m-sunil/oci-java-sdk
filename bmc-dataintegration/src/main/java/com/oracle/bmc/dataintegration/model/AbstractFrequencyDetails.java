/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The model that holds the frequency details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType",
    defaultImpl = AbstractFrequencyDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MonthlyFrequencyDetails.class,
        name = "MONTHLY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CustomFrequencyDetails.class,
        name = "CUSTOM"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DailyFrequencyDetails.class,
        name = "DAILY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = WeeklyFrequencyDetails.class,
        name = "WEEKLY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MonthlyRuleFrequencyDetails.class,
        name = "MONTHLY_RULE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HourlyFrequencyDetails.class,
        name = "HOURLY"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AbstractFrequencyDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"frequency"})
    protected AbstractFrequencyDetails(Frequency frequency) {
        super();
        this.frequency = frequency;
    }

    /**
     * the frequency of the schedule.
     **/
    public enum Frequency {
        Hourly("HOURLY"),
        Daily("DAILY"),
        Monthly("MONTHLY"),
        Weekly("WEEKLY"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Frequency.class);

        private final String value;
        private static java.util.Map<String, Frequency> map;

        static {
            map = new java.util.HashMap<>();
            for (Frequency v : Frequency.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Frequency(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Frequency create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Frequency', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * the frequency of the schedule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("frequency")
    private final Frequency frequency;

    /**
     * the frequency of the schedule.
     * @return the value
     **/
    public Frequency getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AbstractFrequencyDetails(");
        sb.append("frequency=").append(String.valueOf(this.frequency));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractFrequencyDetails)) {
            return false;
        }

        AbstractFrequencyDetails other = (AbstractFrequencyDetails) o;
        return java.util.Objects.equals(this.frequency, other.frequency);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.frequency == null ? 43 : this.frequency.hashCode());
        return result;
    }

    /**
     * The type of the model
     **/
    public enum ModelType {
        Hourly("HOURLY"),
        Daily("DAILY"),
        Monthly("MONTHLY"),
        Weekly("WEEKLY"),
        MonthlyRule("MONTHLY_RULE"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelType.class);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
