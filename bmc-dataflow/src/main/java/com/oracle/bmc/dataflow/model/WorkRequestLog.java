/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * A Data Flow work request log object.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkRequestLog.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestLog {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "message", "timestamp", "workRequestid"})
    public WorkRequestLog(Long id, String message, java.util.Date timestamp, String workRequestid) {
        super();
        this.id = id;
        this.message = message;
        this.timestamp = timestamp;
        this.workRequestid = workRequestid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The id of a work request log.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;

        /**
         * The id of a work request log.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(Long id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A human readable log message.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A human readable log message.
         * @param message the value to set
         * @return this builder
         **/
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * The time the log message was written. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The time the log message was written. An RFC3339 formatted datetime string.
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /**
         * The OCID of a work request.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestid")
        private String workRequestid;

        /**
         * The OCID of a work request.
         *
         * @param workRequestid the value to set
         * @return this builder
         **/
        public Builder workRequestid(String workRequestid) {
            this.workRequestid = workRequestid;
            this.__explicitlySet__.add("workRequestid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestLog build() {
            WorkRequestLog __instance__ = new WorkRequestLog(id, message, timestamp, workRequestid);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestLog o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .message(o.getMessage())
                            .timestamp(o.getTimestamp())
                            .workRequestid(o.getWorkRequestid());

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
     * The id of a work request log.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final Long id;

    /**
     * The id of a work request log.
     *
     * @return the value
     **/
    public Long getId() {
        return id;
    }

    /**
     * A human readable log message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A human readable log message.
     * @return the value
     **/
    public String getMessage() {
        return message;
    }

    /**
     * The time the log message was written. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The time the log message was written. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * The OCID of a work request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestid")
    private final String workRequestid;

    /**
     * The OCID of a work request.
     *
     * @return the value
     **/
    public String getWorkRequestid() {
        return workRequestid;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("WorkRequestLog(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", workRequestid=").append(String.valueOf(this.workRequestid));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestLog)) {
            return false;
        }

        WorkRequestLog other = (WorkRequestLog) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.workRequestid, other.workRequestid)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestid == null ? 43 : this.workRequestid.hashCode());
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
