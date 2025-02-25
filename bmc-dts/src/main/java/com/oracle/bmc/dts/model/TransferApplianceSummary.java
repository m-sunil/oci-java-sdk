/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TransferApplianceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TransferApplianceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"label", "lifecycleState", "serialNumber", "creationTime"})
    public TransferApplianceSummary(
            String label,
            LifecycleState lifecycleState,
            String serialNumber,
            java.util.Date creationTime) {
        super();
        this.label = label;
        this.lifecycleState = lifecycleState;
        this.serialNumber = serialNumber;
        this.creationTime = creationTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
        private java.util.Date creationTime;

        public Builder creationTime(java.util.Date creationTime) {
            this.creationTime = creationTime;
            this.__explicitlySet__.add("creationTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TransferApplianceSummary build() {
            TransferApplianceSummary __instance__ =
                    new TransferApplianceSummary(label, lifecycleState, serialNumber, creationTime);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TransferApplianceSummary o) {
            Builder copiedBuilder =
                    label(o.getLabel())
                            .lifecycleState(o.getLifecycleState())
                            .serialNumber(o.getSerialNumber())
                            .creationTime(o.getCreationTime());

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

    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    public String getLabel() {
        return label;
    }

    /**
     **/
    public enum LifecycleState {
        Requested("REQUESTED"),
        OraclePreparing("ORACLE_PREPARING"),
        Shipping("SHIPPING"),
        Delivered("DELIVERED"),
        Preparing("PREPARING"),
        Finalized("FINALIZED"),
        ReturnDelayed("RETURN_DELAYED"),
        ReturnShipped("RETURN_SHIPPED"),
        ReturnShippedCancelled("RETURN_SHIPPED_CANCELLED"),
        OracleReceived("ORACLE_RECEIVED"),
        OracleReceivedCancelled("ORACLE_RECEIVED_CANCELLED"),
        Processing("PROCESSING"),
        Complete("COMPLETE"),
        CustomerNeverReceived("CUSTOMER_NEVER_RECEIVED"),
        OracleNeverReceived("ORACLE_NEVER_RECEIVED"),
        CustomerLost("CUSTOMER_LOST"),
        Cancelled("CANCELLED"),
        Deleted("DELETED"),
        Rejected("REJECTED"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    private final java.util.Date creationTime;

    public java.util.Date getCreationTime() {
        return creationTime;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TransferApplianceSummary(");
        sb.append("label=").append(String.valueOf(this.label));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", creationTime=").append(String.valueOf(this.creationTime));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TransferApplianceSummary)) {
            return false;
        }

        TransferApplianceSummary other = (TransferApplianceSummary) o;
        return java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.creationTime, other.creationTime)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result = (result * PRIME) + (this.creationTime == null ? 43 : this.creationTime.hashCode());
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
