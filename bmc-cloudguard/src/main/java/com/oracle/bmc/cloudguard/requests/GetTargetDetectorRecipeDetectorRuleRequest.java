/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetTargetDetectorRecipeDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetTargetDetectorRecipeDetectorRuleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class GetTargetDetectorRecipeDetectorRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * OCID of target
     */
    private String targetId;

    /**
     * OCID of target
     */
    public String getTargetId() {
        return targetId;
    }
    /**
     * OCID of TargetDetectorRecipe
     */
    private String targetDetectorRecipeId;

    /**
     * OCID of TargetDetectorRecipe
     */
    public String getTargetDetectorRecipeId() {
        return targetDetectorRecipeId;
    }
    /**
     * The id of DetectorRule
     */
    private String detectorRuleId;

    /**
     * The id of DetectorRule
     */
    public String getDetectorRuleId() {
        return detectorRuleId;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetTargetDetectorRecipeDetectorRuleRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * OCID of target
         */
        private String targetId = null;

        /**
         * OCID of target
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * OCID of TargetDetectorRecipe
         */
        private String targetDetectorRecipeId = null;

        /**
         * OCID of TargetDetectorRecipe
         * @param targetDetectorRecipeId the value to set
         * @return this builder instance
         */
        public Builder targetDetectorRecipeId(String targetDetectorRecipeId) {
            this.targetDetectorRecipeId = targetDetectorRecipeId;
            return this;
        }

        /**
         * The id of DetectorRule
         */
        private String detectorRuleId = null;

        /**
         * The id of DetectorRule
         * @param detectorRuleId the value to set
         * @return this builder instance
         */
        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = detectorRuleId;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetTargetDetectorRecipeDetectorRuleRequest o) {
            targetId(o.getTargetId());
            targetDetectorRecipeId(o.getTargetDetectorRecipeId());
            detectorRuleId(o.getDetectorRuleId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetTargetDetectorRecipeDetectorRuleRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetTargetDetectorRecipeDetectorRuleRequest
         */
        public GetTargetDetectorRecipeDetectorRuleRequest build() {
            GetTargetDetectorRecipeDetectorRuleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetTargetDetectorRecipeDetectorRuleRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetTargetDetectorRecipeDetectorRuleRequest
         */
        public GetTargetDetectorRecipeDetectorRuleRequest buildWithoutInvocationCallback() {
            GetTargetDetectorRecipeDetectorRuleRequest request =
                    new GetTargetDetectorRecipeDetectorRuleRequest();
            request.targetId = targetId;
            request.targetDetectorRecipeId = targetDetectorRecipeId;
            request.detectorRuleId = detectorRuleId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetTargetDetectorRecipeDetectorRuleRequest(targetId, targetDetectorRecipeId, detectorRuleId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .targetId(targetId)
                .targetDetectorRecipeId(targetDetectorRecipeId)
                .detectorRuleId(detectorRuleId)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",targetDetectorRecipeId=").append(String.valueOf(this.targetDetectorRecipeId));
        sb.append(",detectorRuleId=").append(String.valueOf(this.detectorRuleId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTargetDetectorRecipeDetectorRuleRequest)) {
            return false;
        }

        GetTargetDetectorRecipeDetectorRuleRequest other =
                (GetTargetDetectorRecipeDetectorRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(
                        this.targetDetectorRecipeId, other.targetDetectorRecipeId)
                && java.util.Objects.equals(this.detectorRuleId, other.detectorRuleId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDetectorRecipeId == null
                                ? 43
                                : this.targetDetectorRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRuleId == null ? 43 : this.detectorRuleId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
