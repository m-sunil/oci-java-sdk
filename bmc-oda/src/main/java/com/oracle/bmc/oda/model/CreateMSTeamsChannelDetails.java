/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties required to create an MS Teams channel.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateMSTeamsChannelDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateMSTeamsChannelDetails extends CreateChannelDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionExpiryDurationInMilliseconds")
        private Long sessionExpiryDurationInMilliseconds;

        public Builder sessionExpiryDurationInMilliseconds(
                Long sessionExpiryDurationInMilliseconds) {
            this.sessionExpiryDurationInMilliseconds = sessionExpiryDurationInMilliseconds;
            this.__explicitlySet__.add("sessionExpiryDurationInMilliseconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The Microsoft App ID that you obtained when you created your bot registration in Azure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("msaAppId")
        private String msaAppId;

        /**
         * The Microsoft App ID that you obtained when you created your bot registration in Azure.
         * @param msaAppId the value to set
         * @return this builder
         **/
        public Builder msaAppId(String msaAppId) {
            this.msaAppId = msaAppId;
            this.__explicitlySet__.add("msaAppId");
            return this;
        }
        /**
         * The client secret that you obtained from your bot registration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("msaAppPassword")
        private String msaAppPassword;

        /**
         * The client secret that you obtained from your bot registration.
         * @param msaAppPassword the value to set
         * @return this builder
         **/
        public Builder msaAppPassword(String msaAppPassword) {
            this.msaAppPassword = msaAppPassword;
            this.__explicitlySet__.add("msaAppPassword");
            return this;
        }
        /**
         * The ID of the Skill or Digital Assistant that the Channel is routed to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("botId")
        private String botId;

        /**
         * The ID of the Skill or Digital Assistant that the Channel is routed to.
         * @param botId the value to set
         * @return this builder
         **/
        public Builder botId(String botId) {
            this.botId = botId;
            this.__explicitlySet__.add("botId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMSTeamsChannelDetails build() {
            CreateMSTeamsChannelDetails __instance__ =
                    new CreateMSTeamsChannelDetails(
                            name,
                            description,
                            sessionExpiryDurationInMilliseconds,
                            freeformTags,
                            definedTags,
                            msaAppId,
                            msaAppPassword,
                            botId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMSTeamsChannelDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .description(o.getDescription())
                            .sessionExpiryDurationInMilliseconds(
                                    o.getSessionExpiryDurationInMilliseconds())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .msaAppId(o.getMsaAppId())
                            .msaAppPassword(o.getMsaAppPassword())
                            .botId(o.getBotId());

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
    public CreateMSTeamsChannelDetails(
            String name,
            String description,
            Long sessionExpiryDurationInMilliseconds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String msaAppId,
            String msaAppPassword,
            String botId) {
        super(name, description, sessionExpiryDurationInMilliseconds, freeformTags, definedTags);
        this.msaAppId = msaAppId;
        this.msaAppPassword = msaAppPassword;
        this.botId = botId;
    }

    /**
     * The Microsoft App ID that you obtained when you created your bot registration in Azure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("msaAppId")
    private final String msaAppId;

    /**
     * The Microsoft App ID that you obtained when you created your bot registration in Azure.
     * @return the value
     **/
    public String getMsaAppId() {
        return msaAppId;
    }

    /**
     * The client secret that you obtained from your bot registration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("msaAppPassword")
    private final String msaAppPassword;

    /**
     * The client secret that you obtained from your bot registration.
     * @return the value
     **/
    public String getMsaAppPassword() {
        return msaAppPassword;
    }

    /**
     * The ID of the Skill or Digital Assistant that the Channel is routed to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("botId")
    private final String botId;

    /**
     * The ID of the Skill or Digital Assistant that the Channel is routed to.
     * @return the value
     **/
    public String getBotId() {
        return botId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateMSTeamsChannelDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", msaAppId=").append(String.valueOf(this.msaAppId));
        sb.append(", msaAppPassword=").append(String.valueOf(this.msaAppPassword));
        sb.append(", botId=").append(String.valueOf(this.botId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMSTeamsChannelDetails)) {
            return false;
        }

        CreateMSTeamsChannelDetails other = (CreateMSTeamsChannelDetails) o;
        return java.util.Objects.equals(this.msaAppId, other.msaAppId)
                && java.util.Objects.equals(this.msaAppPassword, other.msaAppPassword)
                && java.util.Objects.equals(this.botId, other.botId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.msaAppId == null ? 43 : this.msaAppId.hashCode());
        result =
                (result * PRIME)
                        + (this.msaAppPassword == null ? 43 : this.msaAppPassword.hashCode());
        result = (result * PRIME) + (this.botId == null ? 43 : this.botId.hashCode());
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
