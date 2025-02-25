/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized,
 * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CommitMultipartUploadDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CommitMultipartUploadDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"partsToCommit", "partsToExclude"})
    public CommitMultipartUploadDetails(
            java.util.List<CommitMultipartUploadPartDetails> partsToCommit,
            java.util.List<Integer> partsToExclude) {
        super();
        this.partsToCommit = partsToCommit;
        this.partsToExclude = partsToExclude;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The part numbers and entity tags (ETags) for the parts to be committed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partsToCommit")
        private java.util.List<CommitMultipartUploadPartDetails> partsToCommit;

        /**
         * The part numbers and entity tags (ETags) for the parts to be committed.
         * @param partsToCommit the value to set
         * @return this builder
         **/
        public Builder partsToCommit(
                java.util.List<CommitMultipartUploadPartDetails> partsToCommit) {
            this.partsToCommit = partsToCommit;
            this.__explicitlySet__.add("partsToCommit");
            return this;
        }
        /**
         * The part numbers for the parts to be excluded from the completed object.
         * Each part created for this upload must be in either partsToExclude or partsToCommit, but cannot be in both.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partsToExclude")
        private java.util.List<Integer> partsToExclude;

        /**
         * The part numbers for the parts to be excluded from the completed object.
         * Each part created for this upload must be in either partsToExclude or partsToCommit, but cannot be in both.
         *
         * @param partsToExclude the value to set
         * @return this builder
         **/
        public Builder partsToExclude(java.util.List<Integer> partsToExclude) {
            this.partsToExclude = partsToExclude;
            this.__explicitlySet__.add("partsToExclude");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommitMultipartUploadDetails build() {
            CommitMultipartUploadDetails __instance__ =
                    new CommitMultipartUploadDetails(partsToCommit, partsToExclude);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommitMultipartUploadDetails o) {
            Builder copiedBuilder =
                    partsToCommit(o.getPartsToCommit()).partsToExclude(o.getPartsToExclude());

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
     * The part numbers and entity tags (ETags) for the parts to be committed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partsToCommit")
    private final java.util.List<CommitMultipartUploadPartDetails> partsToCommit;

    /**
     * The part numbers and entity tags (ETags) for the parts to be committed.
     * @return the value
     **/
    public java.util.List<CommitMultipartUploadPartDetails> getPartsToCommit() {
        return partsToCommit;
    }

    /**
     * The part numbers for the parts to be excluded from the completed object.
     * Each part created for this upload must be in either partsToExclude or partsToCommit, but cannot be in both.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partsToExclude")
    private final java.util.List<Integer> partsToExclude;

    /**
     * The part numbers for the parts to be excluded from the completed object.
     * Each part created for this upload must be in either partsToExclude or partsToCommit, but cannot be in both.
     *
     * @return the value
     **/
    public java.util.List<Integer> getPartsToExclude() {
        return partsToExclude;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CommitMultipartUploadDetails(");
        sb.append("partsToCommit=").append(String.valueOf(this.partsToCommit));
        sb.append(", partsToExclude=").append(String.valueOf(this.partsToExclude));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommitMultipartUploadDetails)) {
            return false;
        }

        CommitMultipartUploadDetails other = (CommitMultipartUploadDetails) o;
        return java.util.Objects.equals(this.partsToCommit, other.partsToCommit)
                && java.util.Objects.equals(this.partsToExclude, other.partsToExclude)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.partsToCommit == null ? 43 : this.partsToCommit.hashCode());
        result =
                (result * PRIME)
                        + (this.partsToExclude == null ? 43 : this.partsToExclude.hashCode());
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
