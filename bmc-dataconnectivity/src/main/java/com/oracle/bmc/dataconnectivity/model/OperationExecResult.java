/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Operation execution result for a single input set.
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
    builder = OperationExecResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OperationExecResult {
    @Deprecated
    @java.beans.ConstructorProperties({
        "executionStatus",
        "errorMessage",
        "metrics",
        "outputValues",
        "isWhitelistedErrorMessage"
    })
    public OperationExecResult(
            ExecutionStatus executionStatus,
            String errorMessage,
            Object metrics,
            java.util.List<java.util.List<Object>> outputValues,
            Boolean isWhitelistedErrorMessage) {
        super();
        this.executionStatus = executionStatus;
        this.errorMessage = errorMessage;
        this.metrics = metrics;
        this.outputValues = outputValues;
        this.isWhitelistedErrorMessage = isWhitelistedErrorMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Status of the operation job for particular set of input.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionStatus")
        private ExecutionStatus executionStatus;

        /**
         * Status of the operation job for particular set of input.
         * @param executionStatus the value to set
         * @return this builder
         **/
        public Builder executionStatus(ExecutionStatus executionStatus) {
            this.executionStatus = executionStatus;
            this.__explicitlySet__.add("executionStatus");
            return this;
        }
        /**
         * Error message if execution of operation is failed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * Error message if execution of operation is failed.
         * @param errorMessage the value to set
         * @return this builder
         **/
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /**
         * Metrics of operation execution job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private Object metrics;

        /**
         * Metrics of operation execution job.
         * @param metrics the value to set
         * @return this builder
         **/
        public Builder metrics(Object metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }
        /**
         * List of emitted rows for each OUT/INOUT param.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("outputValues")
        private java.util.List<java.util.List<Object>> outputValues;

        /**
         * List of emitted rows for each OUT/INOUT param.
         * @param outputValues the value to set
         * @return this builder
         **/
        public Builder outputValues(java.util.List<java.util.List<Object>> outputValues) {
            this.outputValues = outputValues;
            this.__explicitlySet__.add("outputValues");
            return this;
        }
        /**
         * True, if error message should be displayed on UI.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isWhitelistedErrorMessage")
        private Boolean isWhitelistedErrorMessage;

        /**
         * True, if error message should be displayed on UI.
         * @param isWhitelistedErrorMessage the value to set
         * @return this builder
         **/
        public Builder isWhitelistedErrorMessage(Boolean isWhitelistedErrorMessage) {
            this.isWhitelistedErrorMessage = isWhitelistedErrorMessage;
            this.__explicitlySet__.add("isWhitelistedErrorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperationExecResult build() {
            OperationExecResult __instance__ =
                    new OperationExecResult(
                            executionStatus,
                            errorMessage,
                            metrics,
                            outputValues,
                            isWhitelistedErrorMessage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperationExecResult o) {
            Builder copiedBuilder =
                    executionStatus(o.getExecutionStatus())
                            .errorMessage(o.getErrorMessage())
                            .metrics(o.getMetrics())
                            .outputValues(o.getOutputValues())
                            .isWhitelistedErrorMessage(o.getIsWhitelistedErrorMessage());

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
     * Status of the operation job for particular set of input.
     **/
    public enum ExecutionStatus {
        Failed("FAILED"),
        Success("SUCCESS"),
        Queued("QUEUED"),
        Running("RUNNING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExecutionStatus.class);

        private final String value;
        private static java.util.Map<String, ExecutionStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ExecutionStatus v : ExecutionStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExecutionStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExecutionStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExecutionStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the operation job for particular set of input.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionStatus")
    private final ExecutionStatus executionStatus;

    /**
     * Status of the operation job for particular set of input.
     * @return the value
     **/
    public ExecutionStatus getExecutionStatus() {
        return executionStatus;
    }

    /**
     * Error message if execution of operation is failed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * Error message if execution of operation is failed.
     * @return the value
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Metrics of operation execution job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final Object metrics;

    /**
     * Metrics of operation execution job.
     * @return the value
     **/
    public Object getMetrics() {
        return metrics;
    }

    /**
     * List of emitted rows for each OUT/INOUT param.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outputValues")
    private final java.util.List<java.util.List<Object>> outputValues;

    /**
     * List of emitted rows for each OUT/INOUT param.
     * @return the value
     **/
    public java.util.List<java.util.List<Object>> getOutputValues() {
        return outputValues;
    }

    /**
     * True, if error message should be displayed on UI.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isWhitelistedErrorMessage")
    private final Boolean isWhitelistedErrorMessage;

    /**
     * True, if error message should be displayed on UI.
     * @return the value
     **/
    public Boolean getIsWhitelistedErrorMessage() {
        return isWhitelistedErrorMessage;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OperationExecResult(");
        sb.append("executionStatus=").append(String.valueOf(this.executionStatus));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(", outputValues=").append(String.valueOf(this.outputValues));
        sb.append(", isWhitelistedErrorMessage=")
                .append(String.valueOf(this.isWhitelistedErrorMessage));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperationExecResult)) {
            return false;
        }

        OperationExecResult other = (OperationExecResult) o;
        return java.util.Objects.equals(this.executionStatus, other.executionStatus)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && java.util.Objects.equals(this.outputValues, other.outputValues)
                && java.util.Objects.equals(
                        this.isWhitelistedErrorMessage, other.isWhitelistedErrorMessage)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.executionStatus == null ? 43 : this.executionStatus.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.outputValues == null ? 43 : this.outputValues.hashCode());
        result =
                (result * PRIME)
                        + (this.isWhitelistedErrorMessage == null
                                ? 43
                                : this.isWhitelistedErrorMessage.hashCode());
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
