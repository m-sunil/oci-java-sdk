/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * StatusSummary
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StatusSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StatusSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "chunksProcessed",
        "failureDetails",
        "filename",
        "status",
        "totalChunks"
    })
    public StatusSummary(
            Long chunksProcessed,
            String failureDetails,
            String filename,
            String status,
            Long totalChunks) {
        super();
        this.chunksProcessed = chunksProcessed;
        this.failureDetails = failureDetails;
        this.filename = filename;
        this.status = status;
        this.totalChunks = totalChunks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of chunks processed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("chunksProcessed")
        private Long chunksProcessed;

        /**
         * The number of chunks processed.
         * @param chunksProcessed the value to set
         * @return this builder
         **/
        public Builder chunksProcessed(Long chunksProcessed) {
            this.chunksProcessed = chunksProcessed;
            this.__explicitlySet__.add("chunksProcessed");
            return this;
        }
        /**
         * The failure details, if any.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("failureDetails")
        private String failureDetails;

        /**
         * The failure details, if any.
         * @param failureDetails the value to set
         * @return this builder
         **/
        public Builder failureDetails(String failureDetails) {
            this.failureDetails = failureDetails;
            this.__explicitlySet__.add("failureDetails");
            return this;
        }
        /**
         * The filename.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filename")
        private String filename;

        /**
         * The filename.
         * @param filename the value to set
         * @return this builder
         **/
        public Builder filename(String filename) {
            this.filename = filename;
            this.__explicitlySet__.add("filename");
            return this;
        }
        /**
         * The status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The status.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The total number of chunks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalChunks")
        private Long totalChunks;

        /**
         * The total number of chunks.
         * @param totalChunks the value to set
         * @return this builder
         **/
        public Builder totalChunks(Long totalChunks) {
            this.totalChunks = totalChunks;
            this.__explicitlySet__.add("totalChunks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StatusSummary build() {
            StatusSummary __instance__ =
                    new StatusSummary(
                            chunksProcessed, failureDetails, filename, status, totalChunks);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StatusSummary o) {
            Builder copiedBuilder =
                    chunksProcessed(o.getChunksProcessed())
                            .failureDetails(o.getFailureDetails())
                            .filename(o.getFilename())
                            .status(o.getStatus())
                            .totalChunks(o.getTotalChunks());

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
     * The number of chunks processed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chunksProcessed")
    private final Long chunksProcessed;

    /**
     * The number of chunks processed.
     * @return the value
     **/
    public Long getChunksProcessed() {
        return chunksProcessed;
    }

    /**
     * The failure details, if any.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureDetails")
    private final String failureDetails;

    /**
     * The failure details, if any.
     * @return the value
     **/
    public String getFailureDetails() {
        return failureDetails;
    }

    /**
     * The filename.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filename")
    private final String filename;

    /**
     * The filename.
     * @return the value
     **/
    public String getFilename() {
        return filename;
    }

    /**
     * The status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The status.
     * @return the value
     **/
    public String getStatus() {
        return status;
    }

    /**
     * The total number of chunks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalChunks")
    private final Long totalChunks;

    /**
     * The total number of chunks.
     * @return the value
     **/
    public Long getTotalChunks() {
        return totalChunks;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StatusSummary(");
        sb.append("chunksProcessed=").append(String.valueOf(this.chunksProcessed));
        sb.append(", failureDetails=").append(String.valueOf(this.failureDetails));
        sb.append(", filename=").append(String.valueOf(this.filename));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", totalChunks=").append(String.valueOf(this.totalChunks));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StatusSummary)) {
            return false;
        }

        StatusSummary other = (StatusSummary) o;
        return java.util.Objects.equals(this.chunksProcessed, other.chunksProcessed)
                && java.util.Objects.equals(this.failureDetails, other.failureDetails)
                && java.util.Objects.equals(this.filename, other.filename)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.totalChunks, other.totalChunks)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.chunksProcessed == null ? 43 : this.chunksProcessed.hashCode());
        result =
                (result * PRIME)
                        + (this.failureDetails == null ? 43 : this.failureDetails.hashCode());
        result = (result * PRIME) + (this.filename == null ? 43 : this.filename.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.totalChunks == null ? 43 : this.totalChunks.hashCode());
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
