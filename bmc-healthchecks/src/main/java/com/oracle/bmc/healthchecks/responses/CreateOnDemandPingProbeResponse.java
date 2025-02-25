/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.responses;

import com.oracle.bmc.healthchecks.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public class CreateOnDemandPingProbeResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide
     * the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The URL for fetching probe results.
     */
    private String location;

    /**
     * The URL for fetching probe results.
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * The returned PingProbe instance.
     */
    private com.oracle.bmc.healthchecks.model.PingProbe pingProbe;

    /**
     * The returned PingProbe instance.
     * @return the value
     */
    public com.oracle.bmc.healthchecks.model.PingProbe getPingProbe() {
        return pingProbe;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "location",
        "pingProbe"
    })
    private CreateOnDemandPingProbeResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String location,
            com.oracle.bmc.healthchecks.model.PingProbe pingProbe) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.pingProbe = pingProbe;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to
         * contact Oracle about a particular request, please provide
         * the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to
         * contact Oracle about a particular request, please provide
         * the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The URL for fetching probe results.
         */
        private String location;

        /**
         * The URL for fetching probe results.
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * The returned PingProbe instance.
         */
        private com.oracle.bmc.healthchecks.model.PingProbe pingProbe;

        /**
         * The returned PingProbe instance.
         * @param pingProbe the value to set
         * @return this builder
         */
        public Builder pingProbe(com.oracle.bmc.healthchecks.model.PingProbe pingProbe) {
            this.pingProbe = pingProbe;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateOnDemandPingProbeResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            pingProbe(o.getPingProbe());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CreateOnDemandPingProbeResponse build() {
            return new CreateOnDemandPingProbeResponse(
                    __httpStatusCode__, opcRequestId, location, pingProbe);
        }
    }

    /**
     * Return a new builder for this response object.
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",pingProbe=").append(String.valueOf(pingProbe));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOnDemandPingProbeResponse)) {
            return false;
        }

        CreateOnDemandPingProbeResponse other = (CreateOnDemandPingProbeResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.pingProbe, other.pingProbe);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.pingProbe == null ? 43 : this.pingProbe.hashCode());
        return result;
    }
}
