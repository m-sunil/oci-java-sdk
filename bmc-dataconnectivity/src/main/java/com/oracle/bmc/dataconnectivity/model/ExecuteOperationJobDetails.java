/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Contains details of executeOperationJob.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExecuteOperationJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExecuteOperationJobDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"executeOperationJobId", "status", "errorMessage"})
    public ExecuteOperationJobDetails(
            String executeOperationJobId, Status status, String errorMessage) {
        super();
        this.executeOperationJobId = executeOperationJobId;
        this.status = status;
        this.errorMessage = errorMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Job id to track job status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executeOperationJobId")
        private String executeOperationJobId;

        /**
         * Job id to track job status.
         * @param executeOperationJobId the value to set
         * @return this builder
         **/
        public Builder executeOperationJobId(String executeOperationJobId) {
            this.executeOperationJobId = executeOperationJobId;
            this.__explicitlySet__.add("executeOperationJobId");
            return this;
        }
        /**
         * The status of job
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of job
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Error message if job creation is failed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * Error message if job creation is failed.
         * @param errorMessage the value to set
         * @return this builder
         **/
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteOperationJobDetails build() {
            ExecuteOperationJobDetails __instance__ =
                    new ExecuteOperationJobDetails(executeOperationJobId, status, errorMessage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteOperationJobDetails o) {
            Builder copiedBuilder =
                    executeOperationJobId(o.getExecuteOperationJobId())
                            .status(o.getStatus())
                            .errorMessage(o.getErrorMessage());

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
     * Job id to track job status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executeOperationJobId")
    private final String executeOperationJobId;

    /**
     * Job id to track job status.
     * @return the value
     **/
    public String getExecuteOperationJobId() {
        return executeOperationJobId;
    }

    /**
     * The status of job
     **/
    public enum Status {
        Failed("FAILED"),
        Success("SUCCESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of job
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of job
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Error message if job creation is failed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * Error message if job creation is failed.
     * @return the value
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExecuteOperationJobDetails(");
        sb.append("executeOperationJobId=").append(String.valueOf(this.executeOperationJobId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteOperationJobDetails)) {
            return false;
        }

        ExecuteOperationJobDetails other = (ExecuteOperationJobDetails) o;
        return java.util.Objects.equals(this.executeOperationJobId, other.executeOperationJobId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.executeOperationJobId == null
                                ? 43
                                : this.executeOperationJobId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
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
