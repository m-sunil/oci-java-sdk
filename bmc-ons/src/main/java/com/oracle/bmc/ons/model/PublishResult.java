/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons.model;

/**
 * The response to a PublishMessage call.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PublishResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PublishResult {
    @Deprecated
    @java.beans.ConstructorProperties({"messageId", "timeStamp"})
    public PublishResult(String messageId, java.util.Date timeStamp) {
        super();
        this.messageId = messageId;
        this.timeStamp = timeStamp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The UUID of the message.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("messageId")
        private String messageId;

        /**
         * The UUID of the message.
         * @param messageId the value to set
         * @return this builder
         **/
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            this.__explicitlySet__.add("messageId");
            return this;
        }
        /**
         * The time that the service received the message.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStamp")
        private java.util.Date timeStamp;

        /**
         * The time that the service received the message.
         * @param timeStamp the value to set
         * @return this builder
         **/
        public Builder timeStamp(java.util.Date timeStamp) {
            this.timeStamp = timeStamp;
            this.__explicitlySet__.add("timeStamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PublishResult build() {
            PublishResult __instance__ = new PublishResult(messageId, timeStamp);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublishResult o) {
            Builder copiedBuilder = messageId(o.getMessageId()).timeStamp(o.getTimeStamp());

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
     * The UUID of the message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messageId")
    private final String messageId;

    /**
     * The UUID of the message.
     * @return the value
     **/
    public String getMessageId() {
        return messageId;
    }

    /**
     * The time that the service received the message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStamp")
    private final java.util.Date timeStamp;

    /**
     * The time that the service received the message.
     * @return the value
     **/
    public java.util.Date getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PublishResult(");
        sb.append("messageId=").append(String.valueOf(this.messageId));
        sb.append(", timeStamp=").append(String.valueOf(this.timeStamp));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PublishResult)) {
            return false;
        }

        PublishResult other = (PublishResult) o;
        return java.util.Objects.equals(this.messageId, other.messageId)
                && java.util.Objects.equals(this.timeStamp, other.timeStamp)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.messageId == null ? 43 : this.messageId.hashCode());
        result = (result * PRIME) + (this.timeStamp == null ? 43 : this.timeStamp.hashCode());
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
