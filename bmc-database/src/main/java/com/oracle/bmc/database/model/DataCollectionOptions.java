/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Indicates user preferences for the various diagnostic collection options for the VM cluster/Cloud VM cluster/VMBM DBCS.
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
    builder = DataCollectionOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataCollectionOptions {
    @Deprecated
    @java.beans.ConstructorProperties({"isDiagnosticsEventsEnabled"})
    public DataCollectionOptions(Boolean isDiagnosticsEventsEnabled) {
        super();
        this.isDiagnosticsEventsEnabled = isDiagnosticsEventsEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether diagnostic collection is enabled for the VM cluster/Cloud VM cluster/VMBM DBCS. Enabling diagnostic collection allows you to receive Events service notifications for guest VM issues. Diagnostic collection also allows Oracle to provide enhanced service and proactive support for your Exadata system. You can enable diagnostic collection during VM cluster/Cloud VM cluster provisioning. You can also disable or enable it at any time using the {@code UpdateVmCluster} or {@code updateCloudVmCluster} API.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDiagnosticsEventsEnabled")
        private Boolean isDiagnosticsEventsEnabled;

        /**
         * Indicates whether diagnostic collection is enabled for the VM cluster/Cloud VM cluster/VMBM DBCS. Enabling diagnostic collection allows you to receive Events service notifications for guest VM issues. Diagnostic collection also allows Oracle to provide enhanced service and proactive support for your Exadata system. You can enable diagnostic collection during VM cluster/Cloud VM cluster provisioning. You can also disable or enable it at any time using the {@code UpdateVmCluster} or {@code updateCloudVmCluster} API.
         *
         * @param isDiagnosticsEventsEnabled the value to set
         * @return this builder
         **/
        public Builder isDiagnosticsEventsEnabled(Boolean isDiagnosticsEventsEnabled) {
            this.isDiagnosticsEventsEnabled = isDiagnosticsEventsEnabled;
            this.__explicitlySet__.add("isDiagnosticsEventsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataCollectionOptions build() {
            DataCollectionOptions __instance__ =
                    new DataCollectionOptions(isDiagnosticsEventsEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataCollectionOptions o) {
            Builder copiedBuilder = isDiagnosticsEventsEnabled(o.getIsDiagnosticsEventsEnabled());

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
     * Indicates whether diagnostic collection is enabled for the VM cluster/Cloud VM cluster/VMBM DBCS. Enabling diagnostic collection allows you to receive Events service notifications for guest VM issues. Diagnostic collection also allows Oracle to provide enhanced service and proactive support for your Exadata system. You can enable diagnostic collection during VM cluster/Cloud VM cluster provisioning. You can also disable or enable it at any time using the {@code UpdateVmCluster} or {@code updateCloudVmCluster} API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDiagnosticsEventsEnabled")
    private final Boolean isDiagnosticsEventsEnabled;

    /**
     * Indicates whether diagnostic collection is enabled for the VM cluster/Cloud VM cluster/VMBM DBCS. Enabling diagnostic collection allows you to receive Events service notifications for guest VM issues. Diagnostic collection also allows Oracle to provide enhanced service and proactive support for your Exadata system. You can enable diagnostic collection during VM cluster/Cloud VM cluster provisioning. You can also disable or enable it at any time using the {@code UpdateVmCluster} or {@code updateCloudVmCluster} API.
     *
     * @return the value
     **/
    public Boolean getIsDiagnosticsEventsEnabled() {
        return isDiagnosticsEventsEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataCollectionOptions(");
        sb.append("isDiagnosticsEventsEnabled=")
                .append(String.valueOf(this.isDiagnosticsEventsEnabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataCollectionOptions)) {
            return false;
        }

        DataCollectionOptions other = (DataCollectionOptions) o;
        return java.util.Objects.equals(
                        this.isDiagnosticsEventsEnabled, other.isDiagnosticsEventsEnabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isDiagnosticsEventsEnabled == null
                                ? 43
                                : this.isDiagnosticsEventsEnabled.hashCode());
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
