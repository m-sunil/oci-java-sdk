/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Credentials to access the Oracle SOA Cloud Service application in the source environment. When you create and update a migration,
 * Application Migration connects to the application in the source environment with the supplied credentials and exports the domain
 * configuration.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SoacsDiscoveryDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SoacsDiscoveryDetails extends DiscoveryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * WebLogic administrator username for the Oracle SOA Cloud Service application in the source environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("weblogicUser")
        private String weblogicUser;

        /**
         * WebLogic administrator username for the Oracle SOA Cloud Service application in the source environment.
         * @param weblogicUser the value to set
         * @return this builder
         **/
        public Builder weblogicUser(String weblogicUser) {
            this.weblogicUser = weblogicUser;
            this.__explicitlySet__.add("weblogicUser");
            return this;
        }
        /**
         * Password for this user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("weblogicPassword")
        private String weblogicPassword;

        /**
         * Password for this user.
         * @param weblogicPassword the value to set
         * @return this builder
         **/
        public Builder weblogicPassword(String weblogicPassword) {
            this.weblogicPassword = weblogicPassword;
            this.__explicitlySet__.add("weblogicPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoacsDiscoveryDetails build() {
            SoacsDiscoveryDetails __instance__ =
                    new SoacsDiscoveryDetails(weblogicUser, weblogicPassword);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoacsDiscoveryDetails o) {
            Builder copiedBuilder =
                    weblogicUser(o.getWeblogicUser()).weblogicPassword(o.getWeblogicPassword());

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

    @Deprecated
    public SoacsDiscoveryDetails(String weblogicUser, String weblogicPassword) {
        super();
        this.weblogicUser = weblogicUser;
        this.weblogicPassword = weblogicPassword;
    }

    /**
     * WebLogic administrator username for the Oracle SOA Cloud Service application in the source environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weblogicUser")
    private final String weblogicUser;

    /**
     * WebLogic administrator username for the Oracle SOA Cloud Service application in the source environment.
     * @return the value
     **/
    public String getWeblogicUser() {
        return weblogicUser;
    }

    /**
     * Password for this user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weblogicPassword")
    private final String weblogicPassword;

    /**
     * Password for this user.
     * @return the value
     **/
    public String getWeblogicPassword() {
        return weblogicPassword;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SoacsDiscoveryDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", weblogicUser=").append(String.valueOf(this.weblogicUser));
        sb.append(", weblogicPassword=").append(String.valueOf(this.weblogicPassword));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoacsDiscoveryDetails)) {
            return false;
        }

        SoacsDiscoveryDetails other = (SoacsDiscoveryDetails) o;
        return java.util.Objects.equals(this.weblogicUser, other.weblogicUser)
                && java.util.Objects.equals(this.weblogicPassword, other.weblogicPassword)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.weblogicUser == null ? 43 : this.weblogicUser.hashCode());
        result =
                (result * PRIME)
                        + (this.weblogicPassword == null ? 43 : this.weblogicPassword.hashCode());
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
