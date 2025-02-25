/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Commit details that need to be used for the build run.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CommitInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CommitInfo {
    @Deprecated
    @java.beans.ConstructorProperties({"repositoryUrl", "repositoryBranch", "commitHash"})
    public CommitInfo(String repositoryUrl, String repositoryBranch, String commitHash) {
        super();
        this.repositoryUrl = repositoryUrl;
        this.repositoryBranch = repositoryBranch;
        this.commitHash = commitHash;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Repository URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

        /**
         * Repository URL.
         * @param repositoryUrl the value to set
         * @return this builder
         **/
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            this.__explicitlySet__.add("repositoryUrl");
            return this;
        }
        /**
         * Name of the repository branch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryBranch")
        private String repositoryBranch;

        /**
         * Name of the repository branch.
         * @param repositoryBranch the value to set
         * @return this builder
         **/
        public Builder repositoryBranch(String repositoryBranch) {
            this.repositoryBranch = repositoryBranch;
            this.__explicitlySet__.add("repositoryBranch");
            return this;
        }
        /**
         * Commit hash pertinent to the repository URL and the specified branch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commitHash")
        private String commitHash;

        /**
         * Commit hash pertinent to the repository URL and the specified branch.
         * @param commitHash the value to set
         * @return this builder
         **/
        public Builder commitHash(String commitHash) {
            this.commitHash = commitHash;
            this.__explicitlySet__.add("commitHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommitInfo build() {
            CommitInfo __instance__ = new CommitInfo(repositoryUrl, repositoryBranch, commitHash);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommitInfo o) {
            Builder copiedBuilder =
                    repositoryUrl(o.getRepositoryUrl())
                            .repositoryBranch(o.getRepositoryBranch())
                            .commitHash(o.getCommitHash());

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
     * Repository URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    private final String repositoryUrl;

    /**
     * Repository URL.
     * @return the value
     **/
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /**
     * Name of the repository branch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryBranch")
    private final String repositoryBranch;

    /**
     * Name of the repository branch.
     * @return the value
     **/
    public String getRepositoryBranch() {
        return repositoryBranch;
    }

    /**
     * Commit hash pertinent to the repository URL and the specified branch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitHash")
    private final String commitHash;

    /**
     * Commit hash pertinent to the repository URL and the specified branch.
     * @return the value
     **/
    public String getCommitHash() {
        return commitHash;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CommitInfo(");
        sb.append("repositoryUrl=").append(String.valueOf(this.repositoryUrl));
        sb.append(", repositoryBranch=").append(String.valueOf(this.repositoryBranch));
        sb.append(", commitHash=").append(String.valueOf(this.commitHash));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommitInfo)) {
            return false;
        }

        CommitInfo other = (CommitInfo) o;
        return java.util.Objects.equals(this.repositoryUrl, other.repositoryUrl)
                && java.util.Objects.equals(this.repositoryBranch, other.repositoryBranch)
                && java.util.Objects.equals(this.commitHash, other.commitHash)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.repositoryUrl == null ? 43 : this.repositoryUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryBranch == null ? 43 : this.repositoryBranch.hashCode());
        result = (result * PRIME) + (this.commitHash == null ? 43 : this.commitHash.hashCode());
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
