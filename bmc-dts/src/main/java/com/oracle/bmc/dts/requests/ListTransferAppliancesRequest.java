/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.requests;

import com.oracle.bmc.dts.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/ListTransferAppliancesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListTransferAppliancesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
public class ListTransferAppliancesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * ID of the Transfer Job
     */
    private String id;

    /**
     * ID of the Transfer Job
     */
    public String getId() {
        return id;
    }
    /**
     * filtering by lifecycleState
     */
    private LifecycleState lifecycleState;

    /**
     * filtering by lifecycleState
     **/
    public enum LifecycleState {
        Requested("REQUESTED"),
        OraclePreparing("ORACLE_PREPARING"),
        Shipping("SHIPPING"),
        Delivered("DELIVERED"),
        Preparing("PREPARING"),
        Finalized("FINALIZED"),
        ReturnDelayed("RETURN_DELAYED"),
        ReturnShipped("RETURN_SHIPPED"),
        ReturnShippedCancelled("RETURN_SHIPPED_CANCELLED"),
        OracleReceived("ORACLE_RECEIVED"),
        OracleReceivedCancelled("ORACLE_RECEIVED_CANCELLED"),
        Processing("PROCESSING"),
        Complete("COMPLETE"),
        CustomerNeverReceived("CUSTOMER_NEVER_RECEIVED"),
        OracleNeverReceived("ORACLE_NEVER_RECEIVED"),
        CustomerLost("CUSTOMER_LOST"),
        Cancelled("CANCELLED"),
        Deleted("DELETED"),
        Rejected("REJECTED"),
        Error("ERROR"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };

    /**
     * filtering by lifecycleState
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListTransferAppliancesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * ID of the Transfer Job
         */
        private String id = null;

        /**
         * ID of the Transfer Job
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * filtering by lifecycleState
         */
        private LifecycleState lifecycleState = null;

        /**
         * filtering by lifecycleState
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
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
        public Builder copy(ListTransferAppliancesRequest o) {
            id(o.getId());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListTransferAppliancesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListTransferAppliancesRequest
         */
        public ListTransferAppliancesRequest build() {
            ListTransferAppliancesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListTransferAppliancesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListTransferAppliancesRequest
         */
        public ListTransferAppliancesRequest buildWithoutInvocationCallback() {
            ListTransferAppliancesRequest request = new ListTransferAppliancesRequest();
            request.id = id;
            request.lifecycleState = lifecycleState;
            return request;
            // new ListTransferAppliancesRequest(id, lifecycleState);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().id(id).lifecycleState(lifecycleState);
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
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListTransferAppliancesRequest)) {
            return false;
        }

        ListTransferAppliancesRequest other = (ListTransferAppliancesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }
}
