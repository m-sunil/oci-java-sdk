/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Options for defining the availabiity of a VM instance after a maintenance event that impacts the underlying hardware.
 *
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
    builder = InstanceAvailabilityConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstanceAvailabilityConfig {
    @Deprecated
    @java.beans.ConstructorProperties({"isLiveMigrationPreferred", "recoveryAction"})
    public InstanceAvailabilityConfig(
            Boolean isLiveMigrationPreferred, RecoveryAction recoveryAction) {
        super();
        this.isLiveMigrationPreferred = isLiveMigrationPreferred;
        this.recoveryAction = recoveryAction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether to live migrate supported VM instances to a healthy physical VM host without
         * disrupting running instances during infrastructure maintenance events. If null, Oracle
         * chooses the best option for migrating the VM during infrastructure maintenance events.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLiveMigrationPreferred")
        private Boolean isLiveMigrationPreferred;

        /**
         * Whether to live migrate supported VM instances to a healthy physical VM host without
         * disrupting running instances during infrastructure maintenance events. If null, Oracle
         * chooses the best option for migrating the VM during infrastructure maintenance events.
         *
         * @param isLiveMigrationPreferred the value to set
         * @return this builder
         **/
        public Builder isLiveMigrationPreferred(Boolean isLiveMigrationPreferred) {
            this.isLiveMigrationPreferred = isLiveMigrationPreferred;
            this.__explicitlySet__.add("isLiveMigrationPreferred");
            return this;
        }
        /**
         * The lifecycle state for an instance when it is recovered after infrastructure maintenance.
         * * {@code RESTORE_INSTANCE} - The instance is restored to the lifecycle state it was in before the maintenance event.
         * If the instance was running, it is automatically rebooted. This is the default action when a value is not set.
         * * {@code STOP_INSTANCE} - The instance is recovered in the stopped state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryAction")
        private RecoveryAction recoveryAction;

        /**
         * The lifecycle state for an instance when it is recovered after infrastructure maintenance.
         * * {@code RESTORE_INSTANCE} - The instance is restored to the lifecycle state it was in before the maintenance event.
         * If the instance was running, it is automatically rebooted. This is the default action when a value is not set.
         * * {@code STOP_INSTANCE} - The instance is recovered in the stopped state.
         *
         * @param recoveryAction the value to set
         * @return this builder
         **/
        public Builder recoveryAction(RecoveryAction recoveryAction) {
            this.recoveryAction = recoveryAction;
            this.__explicitlySet__.add("recoveryAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAvailabilityConfig build() {
            InstanceAvailabilityConfig __instance__ =
                    new InstanceAvailabilityConfig(isLiveMigrationPreferred, recoveryAction);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAvailabilityConfig o) {
            Builder copiedBuilder =
                    isLiveMigrationPreferred(o.getIsLiveMigrationPreferred())
                            .recoveryAction(o.getRecoveryAction());

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
     * Whether to live migrate supported VM instances to a healthy physical VM host without
     * disrupting running instances during infrastructure maintenance events. If null, Oracle
     * chooses the best option for migrating the VM during infrastructure maintenance events.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLiveMigrationPreferred")
    private final Boolean isLiveMigrationPreferred;

    /**
     * Whether to live migrate supported VM instances to a healthy physical VM host without
     * disrupting running instances during infrastructure maintenance events. If null, Oracle
     * chooses the best option for migrating the VM during infrastructure maintenance events.
     *
     * @return the value
     **/
    public Boolean getIsLiveMigrationPreferred() {
        return isLiveMigrationPreferred;
    }

    /**
     * The lifecycle state for an instance when it is recovered after infrastructure maintenance.
     * * {@code RESTORE_INSTANCE} - The instance is restored to the lifecycle state it was in before the maintenance event.
     * If the instance was running, it is automatically rebooted. This is the default action when a value is not set.
     * * {@code STOP_INSTANCE} - The instance is recovered in the stopped state.
     *
     **/
    public enum RecoveryAction {
        RestoreInstance("RESTORE_INSTANCE"),
        StopInstance("STOP_INSTANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RecoveryAction.class);

        private final String value;
        private static java.util.Map<String, RecoveryAction> map;

        static {
            map = new java.util.HashMap<>();
            for (RecoveryAction v : RecoveryAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RecoveryAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RecoveryAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RecoveryAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The lifecycle state for an instance when it is recovered after infrastructure maintenance.
     * * {@code RESTORE_INSTANCE} - The instance is restored to the lifecycle state it was in before the maintenance event.
     * If the instance was running, it is automatically rebooted. This is the default action when a value is not set.
     * * {@code STOP_INSTANCE} - The instance is recovered in the stopped state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryAction")
    private final RecoveryAction recoveryAction;

    /**
     * The lifecycle state for an instance when it is recovered after infrastructure maintenance.
     * * {@code RESTORE_INSTANCE} - The instance is restored to the lifecycle state it was in before the maintenance event.
     * If the instance was running, it is automatically rebooted. This is the default action when a value is not set.
     * * {@code STOP_INSTANCE} - The instance is recovered in the stopped state.
     *
     * @return the value
     **/
    public RecoveryAction getRecoveryAction() {
        return recoveryAction;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InstanceAvailabilityConfig(");
        sb.append("isLiveMigrationPreferred=")
                .append(String.valueOf(this.isLiveMigrationPreferred));
        sb.append(", recoveryAction=").append(String.valueOf(this.recoveryAction));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceAvailabilityConfig)) {
            return false;
        }

        InstanceAvailabilityConfig other = (InstanceAvailabilityConfig) o;
        return java.util.Objects.equals(
                        this.isLiveMigrationPreferred, other.isLiveMigrationPreferred)
                && java.util.Objects.equals(this.recoveryAction, other.recoveryAction)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isLiveMigrationPreferred == null
                                ? 43
                                : this.isLiveMigrationPreferred.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryAction == null ? 43 : this.recoveryAction.hashCode());
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
