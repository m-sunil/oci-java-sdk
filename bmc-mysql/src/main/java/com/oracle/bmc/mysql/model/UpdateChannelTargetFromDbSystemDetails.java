/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Parameters detailing how to provision the target endpoint that is a DB System.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateChannelTargetFromDbSystemDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "targetType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateChannelTargetFromDbSystemDetails extends UpdateChannelTargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The case-insensitive name that identifies the replication channel. Channel names
         * must follow the rules defined for [MySQL identifiers](https://dev.mysql.com/doc/refman/8.0/en/identifiers.html).
         * The names of non-Deleted Channels must be unique for each DB System.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("channelName")
        private String channelName;

        /**
         * The case-insensitive name that identifies the replication channel. Channel names
         * must follow the rules defined for [MySQL identifiers](https://dev.mysql.com/doc/refman/8.0/en/identifiers.html).
         * The names of non-Deleted Channels must be unique for each DB System.
         *
         * @param channelName the value to set
         * @return this builder
         **/
        public Builder channelName(String channelName) {
            this.channelName = channelName;
            this.__explicitlySet__.add("channelName");
            return this;
        }
        /**
         * The username for the replication applier of the target MySQL DB System.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applierUsername")
        private String applierUsername;

        /**
         * The username for the replication applier of the target MySQL DB System.
         * @param applierUsername the value to set
         * @return this builder
         **/
        public Builder applierUsername(String applierUsername) {
            this.applierUsername = applierUsername;
            this.__explicitlySet__.add("applierUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateChannelTargetFromDbSystemDetails build() {
            UpdateChannelTargetFromDbSystemDetails __instance__ =
                    new UpdateChannelTargetFromDbSystemDetails(channelName, applierUsername);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateChannelTargetFromDbSystemDetails o) {
            Builder copiedBuilder =
                    channelName(o.getChannelName()).applierUsername(o.getApplierUsername());

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
    public UpdateChannelTargetFromDbSystemDetails(String channelName, String applierUsername) {
        super();
        this.channelName = channelName;
        this.applierUsername = applierUsername;
    }

    /**
     * The case-insensitive name that identifies the replication channel. Channel names
     * must follow the rules defined for [MySQL identifiers](https://dev.mysql.com/doc/refman/8.0/en/identifiers.html).
     * The names of non-Deleted Channels must be unique for each DB System.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("channelName")
    private final String channelName;

    /**
     * The case-insensitive name that identifies the replication channel. Channel names
     * must follow the rules defined for [MySQL identifiers](https://dev.mysql.com/doc/refman/8.0/en/identifiers.html).
     * The names of non-Deleted Channels must be unique for each DB System.
     *
     * @return the value
     **/
    public String getChannelName() {
        return channelName;
    }

    /**
     * The username for the replication applier of the target MySQL DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applierUsername")
    private final String applierUsername;

    /**
     * The username for the replication applier of the target MySQL DB System.
     * @return the value
     **/
    public String getApplierUsername() {
        return applierUsername;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateChannelTargetFromDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", channelName=").append(String.valueOf(this.channelName));
        sb.append(", applierUsername=").append(String.valueOf(this.applierUsername));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateChannelTargetFromDbSystemDetails)) {
            return false;
        }

        UpdateChannelTargetFromDbSystemDetails other = (UpdateChannelTargetFromDbSystemDetails) o;
        return java.util.Objects.equals(this.channelName, other.channelName)
                && java.util.Objects.equals(this.applierUsername, other.applierUsername)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.channelName == null ? 43 : this.channelName.hashCode());
        result =
                (result * PRIME)
                        + (this.applierUsername == null ? 43 : this.applierUsername.hashCode());
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
