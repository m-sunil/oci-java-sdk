/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about node to be removed.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RemoveNodeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RemoveNodeDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterAdminPassword", "isForceRemoveEnabled", "nodeId"})
    public RemoveNodeDetails(
            String clusterAdminPassword, Boolean isForceRemoveEnabled, String nodeId) {
        super();
        this.clusterAdminPassword = clusterAdminPassword;
        this.isForceRemoveEnabled = isForceRemoveEnabled;
        this.nodeId = nodeId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
         * @param clusterAdminPassword the value to set
         * @return this builder
         **/
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }
        /**
         * Boolean flag specifying whether or not to force remove node if graceful
         * removal fails.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isForceRemoveEnabled")
        private Boolean isForceRemoveEnabled;

        /**
         * Boolean flag specifying whether or not to force remove node if graceful
         * removal fails.
         *
         * @param isForceRemoveEnabled the value to set
         * @return this builder
         **/
        public Builder isForceRemoveEnabled(Boolean isForceRemoveEnabled) {
            this.isForceRemoveEnabled = isForceRemoveEnabled;
            this.__explicitlySet__.add("isForceRemoveEnabled");
            return this;
        }
        /**
         * OCID of the node to be removed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeId")
        private String nodeId;

        /**
         * OCID of the node to be removed.
         * @param nodeId the value to set
         * @return this builder
         **/
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            this.__explicitlySet__.add("nodeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveNodeDetails build() {
            RemoveNodeDetails __instance__ =
                    new RemoveNodeDetails(clusterAdminPassword, isForceRemoveEnabled, nodeId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveNodeDetails o) {
            Builder copiedBuilder =
                    clusterAdminPassword(o.getClusterAdminPassword())
                            .isForceRemoveEnabled(o.getIsForceRemoveEnabled())
                            .nodeId(o.getNodeId());

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
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     * @return the value
     **/
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    /**
     * Boolean flag specifying whether or not to force remove node if graceful
     * removal fails.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isForceRemoveEnabled")
    private final Boolean isForceRemoveEnabled;

    /**
     * Boolean flag specifying whether or not to force remove node if graceful
     * removal fails.
     *
     * @return the value
     **/
    public Boolean getIsForceRemoveEnabled() {
        return isForceRemoveEnabled;
    }

    /**
     * OCID of the node to be removed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeId")
    private final String nodeId;

    /**
     * OCID of the node to be removed.
     * @return the value
     **/
    public String getNodeId() {
        return nodeId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RemoveNodeDetails(");
        sb.append("clusterAdminPassword=").append(String.valueOf(this.clusterAdminPassword));
        sb.append(", isForceRemoveEnabled=").append(String.valueOf(this.isForceRemoveEnabled));
        sb.append(", nodeId=").append(String.valueOf(this.nodeId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveNodeDetails)) {
            return false;
        }

        RemoveNodeDetails other = (RemoveNodeDetails) o;
        return java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.isForceRemoveEnabled, other.isForceRemoveEnabled)
                && java.util.Objects.equals(this.nodeId, other.nodeId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceRemoveEnabled == null
                                ? 43
                                : this.isForceRemoveEnabled.hashCode());
        result = (result * PRIME) + (this.nodeId == null ? 43 : this.nodeId.hashCode());
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
