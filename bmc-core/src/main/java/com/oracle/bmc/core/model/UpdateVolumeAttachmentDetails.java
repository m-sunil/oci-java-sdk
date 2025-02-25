/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * details for updating a volume attachment.
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
    builder = UpdateVolumeAttachmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateVolumeAttachmentDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"iscsiLoginState"})
    public UpdateVolumeAttachmentDetails(IscsiLoginState iscsiLoginState) {
        super();
        this.iscsiLoginState = iscsiLoginState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The iscsi login state of the volume attachment. For a multipath volume attachment,
         * all iscsi sessions need to be all logged-in or logged-out to be in logged-in or logged-out state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("iscsiLoginState")
        private IscsiLoginState iscsiLoginState;

        /**
         * The iscsi login state of the volume attachment. For a multipath volume attachment,
         * all iscsi sessions need to be all logged-in or logged-out to be in logged-in or logged-out state.
         *
         * @param iscsiLoginState the value to set
         * @return this builder
         **/
        public Builder iscsiLoginState(IscsiLoginState iscsiLoginState) {
            this.iscsiLoginState = iscsiLoginState;
            this.__explicitlySet__.add("iscsiLoginState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVolumeAttachmentDetails build() {
            UpdateVolumeAttachmentDetails __instance__ =
                    new UpdateVolumeAttachmentDetails(iscsiLoginState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVolumeAttachmentDetails o) {
            Builder copiedBuilder = iscsiLoginState(o.getIscsiLoginState());

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
     * The iscsi login state of the volume attachment. For a multipath volume attachment,
     * all iscsi sessions need to be all logged-in or logged-out to be in logged-in or logged-out state.
     *
     **/
    public enum IscsiLoginState {
        Unknown("UNKNOWN"),
        LoggingIn("LOGGING_IN"),
        LoginSucceeded("LOGIN_SUCCEEDED"),
        LoginFailed("LOGIN_FAILED"),
        LoggingOut("LOGGING_OUT"),
        LogoutSucceeded("LOGOUT_SUCCEEDED"),
        LogoutFailed("LOGOUT_FAILED"),
        ;

        private final String value;
        private static java.util.Map<String, IscsiLoginState> map;

        static {
            map = new java.util.HashMap<>();
            for (IscsiLoginState v : IscsiLoginState.values()) {
                map.put(v.getValue(), v);
            }
        }

        IscsiLoginState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IscsiLoginState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IscsiLoginState: " + key);
        }
    };
    /**
     * The iscsi login state of the volume attachment. For a multipath volume attachment,
     * all iscsi sessions need to be all logged-in or logged-out to be in logged-in or logged-out state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("iscsiLoginState")
    private final IscsiLoginState iscsiLoginState;

    /**
     * The iscsi login state of the volume attachment. For a multipath volume attachment,
     * all iscsi sessions need to be all logged-in or logged-out to be in logged-in or logged-out state.
     *
     * @return the value
     **/
    public IscsiLoginState getIscsiLoginState() {
        return iscsiLoginState;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateVolumeAttachmentDetails(");
        sb.append("iscsiLoginState=").append(String.valueOf(this.iscsiLoginState));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVolumeAttachmentDetails)) {
            return false;
        }

        UpdateVolumeAttachmentDetails other = (UpdateVolumeAttachmentDetails) o;
        return java.util.Objects.equals(this.iscsiLoginState, other.iscsiLoginState)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.iscsiLoginState == null ? 43 : this.iscsiLoginState.hashCode());
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
