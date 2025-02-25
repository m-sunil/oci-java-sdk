/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * UpsertLogAnalyticsAssociation
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpsertLogAnalyticsAssociation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpsertLogAnalyticsAssociation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "agentId",
        "sourceName",
        "sourceTypeName",
        "entityId",
        "entityName",
        "entityTypeName",
        "host",
        "logGroupId"
    })
    public UpsertLogAnalyticsAssociation(
            String agentId,
            String sourceName,
            String sourceTypeName,
            String entityId,
            String entityName,
            String entityTypeName,
            String host,
            String logGroupId) {
        super();
        this.agentId = agentId;
        this.sourceName = sourceName;
        this.sourceTypeName = sourceTypeName;
        this.entityId = entityId;
        this.entityName = entityName;
        this.entityTypeName = entityTypeName;
        this.host = host;
        this.logGroupId = logGroupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The agent unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The agent unique identifier.
         * @param agentId the value to set
         * @return this builder
         **/
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }
        /**
         * The source name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        /**
         * The source name.
         * @param sourceName the value to set
         * @return this builder
         **/
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }
        /**
         * The source type internal name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceTypeName")
        private String sourceTypeName;

        /**
         * The source type internal name.
         * @param sourceTypeName the value to set
         * @return this builder
         **/
        public Builder sourceTypeName(String sourceTypeName) {
            this.sourceTypeName = sourceTypeName;
            this.__explicitlySet__.add("sourceTypeName");
            return this;
        }
        /**
         * The entity unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * The entity unique identifier.
         * @param entityId the value to set
         * @return this builder
         **/
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /**
         * The entity name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * The entity name.
         * @param entityName the value to set
         * @return this builder
         **/
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }
        /**
         * The entity type internal name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
        private String entityTypeName;

        /**
         * The entity type internal name.
         * @param entityTypeName the value to set
         * @return this builder
         **/
        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = entityTypeName;
            this.__explicitlySet__.add("entityTypeName");
            return this;
        }
        /**
         * The host name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The host name.
         * @param host the value to set
         * @return this builder
         **/
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /**
         * The log group unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        /**
         * The log group unique identifier.
         * @param logGroupId the value to set
         * @return this builder
         **/
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpsertLogAnalyticsAssociation build() {
            UpsertLogAnalyticsAssociation __instance__ =
                    new UpsertLogAnalyticsAssociation(
                            agentId,
                            sourceName,
                            sourceTypeName,
                            entityId,
                            entityName,
                            entityTypeName,
                            host,
                            logGroupId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpsertLogAnalyticsAssociation o) {
            Builder copiedBuilder =
                    agentId(o.getAgentId())
                            .sourceName(o.getSourceName())
                            .sourceTypeName(o.getSourceTypeName())
                            .entityId(o.getEntityId())
                            .entityName(o.getEntityName())
                            .entityTypeName(o.getEntityTypeName())
                            .host(o.getHost())
                            .logGroupId(o.getLogGroupId());

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
     * The agent unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The agent unique identifier.
     * @return the value
     **/
    public String getAgentId() {
        return agentId;
    }

    /**
     * The source name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    /**
     * The source name.
     * @return the value
     **/
    public String getSourceName() {
        return sourceName;
    }

    /**
     * The source type internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceTypeName")
    private final String sourceTypeName;

    /**
     * The source type internal name.
     * @return the value
     **/
    public String getSourceTypeName() {
        return sourceTypeName;
    }

    /**
     * The entity unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * The entity unique identifier.
     * @return the value
     **/
    public String getEntityId() {
        return entityId;
    }

    /**
     * The entity name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * The entity name.
     * @return the value
     **/
    public String getEntityName() {
        return entityName;
    }

    /**
     * The entity type internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
    private final String entityTypeName;

    /**
     * The entity type internal name.
     * @return the value
     **/
    public String getEntityTypeName() {
        return entityTypeName;
    }

    /**
     * The host name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The host name.
     * @return the value
     **/
    public String getHost() {
        return host;
    }

    /**
     * The log group unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    private final String logGroupId;

    /**
     * The log group unique identifier.
     * @return the value
     **/
    public String getLogGroupId() {
        return logGroupId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpsertLogAnalyticsAssociation(");
        sb.append("agentId=").append(String.valueOf(this.agentId));
        sb.append(", sourceName=").append(String.valueOf(this.sourceName));
        sb.append(", sourceTypeName=").append(String.valueOf(this.sourceTypeName));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(", entityTypeName=").append(String.valueOf(this.entityTypeName));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpsertLogAnalyticsAssociation)) {
            return false;
        }

        UpsertLogAnalyticsAssociation other = (UpsertLogAnalyticsAssociation) o;
        return java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.sourceName, other.sourceName)
                && java.util.Objects.equals(this.sourceTypeName, other.sourceTypeName)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.entityTypeName, other.entityTypeName)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceTypeName == null ? 43 : this.sourceTypeName.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeName == null ? 43 : this.entityTypeName.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
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
