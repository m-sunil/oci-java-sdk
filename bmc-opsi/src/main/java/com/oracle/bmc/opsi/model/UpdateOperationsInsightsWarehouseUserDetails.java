/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOperationsInsightsWarehouseUserDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOperationsInsightsWarehouseUserDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "connectionPassword",
        "isAwrDataAccess",
        "isEmDataAccess",
        "isOpsiDataAccess",
        "freeformTags",
        "definedTags"
    })
    public UpdateOperationsInsightsWarehouseUserDetails(
            String connectionPassword,
            Boolean isAwrDataAccess,
            Boolean isEmDataAccess,
            Boolean isOpsiDataAccess,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.connectionPassword = connectionPassword;
        this.isAwrDataAccess = isAwrDataAccess;
        this.isEmDataAccess = isEmDataAccess;
        this.isOpsiDataAccess = isOpsiDataAccess;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * User provided connection password for the AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionPassword")
        private String connectionPassword;

        /**
         * User provided connection password for the AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
         * @param connectionPassword the value to set
         * @return this builder
         **/
        public Builder connectionPassword(String connectionPassword) {
            this.connectionPassword = connectionPassword;
            this.__explicitlySet__.add("connectionPassword");
            return this;
        }
        /**
         * Indicate whether user has access to AWR data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAwrDataAccess")
        private Boolean isAwrDataAccess;

        /**
         * Indicate whether user has access to AWR data.
         * @param isAwrDataAccess the value to set
         * @return this builder
         **/
        public Builder isAwrDataAccess(Boolean isAwrDataAccess) {
            this.isAwrDataAccess = isAwrDataAccess;
            this.__explicitlySet__.add("isAwrDataAccess");
            return this;
        }
        /**
         * Indicate whether user has access to EM data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEmDataAccess")
        private Boolean isEmDataAccess;

        /**
         * Indicate whether user has access to EM data.
         * @param isEmDataAccess the value to set
         * @return this builder
         **/
        public Builder isEmDataAccess(Boolean isEmDataAccess) {
            this.isEmDataAccess = isEmDataAccess;
            this.__explicitlySet__.add("isEmDataAccess");
            return this;
        }
        /**
         * Indicate whether user has access to OPSI data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOpsiDataAccess")
        private Boolean isOpsiDataAccess;

        /**
         * Indicate whether user has access to OPSI data.
         * @param isOpsiDataAccess the value to set
         * @return this builder
         **/
        public Builder isOpsiDataAccess(Boolean isOpsiDataAccess) {
            this.isOpsiDataAccess = isOpsiDataAccess;
            this.__explicitlySet__.add("isOpsiDataAccess");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOperationsInsightsWarehouseUserDetails build() {
            UpdateOperationsInsightsWarehouseUserDetails __instance__ =
                    new UpdateOperationsInsightsWarehouseUserDetails(
                            connectionPassword,
                            isAwrDataAccess,
                            isEmDataAccess,
                            isOpsiDataAccess,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOperationsInsightsWarehouseUserDetails o) {
            Builder copiedBuilder =
                    connectionPassword(o.getConnectionPassword())
                            .isAwrDataAccess(o.getIsAwrDataAccess())
                            .isEmDataAccess(o.getIsEmDataAccess())
                            .isOpsiDataAccess(o.getIsOpsiDataAccess())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * User provided connection password for the AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionPassword")
    private final String connectionPassword;

    /**
     * User provided connection password for the AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
     * @return the value
     **/
    public String getConnectionPassword() {
        return connectionPassword;
    }

    /**
     * Indicate whether user has access to AWR data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAwrDataAccess")
    private final Boolean isAwrDataAccess;

    /**
     * Indicate whether user has access to AWR data.
     * @return the value
     **/
    public Boolean getIsAwrDataAccess() {
        return isAwrDataAccess;
    }

    /**
     * Indicate whether user has access to EM data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEmDataAccess")
    private final Boolean isEmDataAccess;

    /**
     * Indicate whether user has access to EM data.
     * @return the value
     **/
    public Boolean getIsEmDataAccess() {
        return isEmDataAccess;
    }

    /**
     * Indicate whether user has access to OPSI data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOpsiDataAccess")
    private final Boolean isOpsiDataAccess;

    /**
     * Indicate whether user has access to OPSI data.
     * @return the value
     **/
    public Boolean getIsOpsiDataAccess() {
        return isOpsiDataAccess;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateOperationsInsightsWarehouseUserDetails(");
        sb.append("connectionPassword=").append(String.valueOf(this.connectionPassword));
        sb.append(", isAwrDataAccess=").append(String.valueOf(this.isAwrDataAccess));
        sb.append(", isEmDataAccess=").append(String.valueOf(this.isEmDataAccess));
        sb.append(", isOpsiDataAccess=").append(String.valueOf(this.isOpsiDataAccess));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOperationsInsightsWarehouseUserDetails)) {
            return false;
        }

        UpdateOperationsInsightsWarehouseUserDetails other =
                (UpdateOperationsInsightsWarehouseUserDetails) o;
        return java.util.Objects.equals(this.connectionPassword, other.connectionPassword)
                && java.util.Objects.equals(this.isAwrDataAccess, other.isAwrDataAccess)
                && java.util.Objects.equals(this.isEmDataAccess, other.isEmDataAccess)
                && java.util.Objects.equals(this.isOpsiDataAccess, other.isOpsiDataAccess)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.connectionPassword == null
                                ? 43
                                : this.connectionPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.isAwrDataAccess == null ? 43 : this.isAwrDataAccess.hashCode());
        result =
                (result * PRIME)
                        + (this.isEmDataAccess == null ? 43 : this.isEmDataAccess.hashCode());
        result =
                (result * PRIME)
                        + (this.isOpsiDataAccess == null ? 43 : this.isOpsiDataAccess.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
