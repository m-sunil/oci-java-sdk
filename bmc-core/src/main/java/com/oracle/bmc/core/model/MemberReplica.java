/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * OCIDs for the volume replicas in this volume group replica.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MemberReplica.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MemberReplica {
    @Deprecated
    @java.beans.ConstructorProperties({"volumeReplicaId"})
    public MemberReplica(String volumeReplicaId) {
        super();
        this.volumeReplicaId = volumeReplicaId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The volume replica ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeReplicaId")
        private String volumeReplicaId;

        /**
         * The volume replica ID.
         * @param volumeReplicaId the value to set
         * @return this builder
         **/
        public Builder volumeReplicaId(String volumeReplicaId) {
            this.volumeReplicaId = volumeReplicaId;
            this.__explicitlySet__.add("volumeReplicaId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MemberReplica build() {
            MemberReplica __instance__ = new MemberReplica(volumeReplicaId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MemberReplica o) {
            Builder copiedBuilder = volumeReplicaId(o.getVolumeReplicaId());

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
     * The volume replica ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeReplicaId")
    private final String volumeReplicaId;

    /**
     * The volume replica ID.
     * @return the value
     **/
    public String getVolumeReplicaId() {
        return volumeReplicaId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MemberReplica(");
        sb.append("volumeReplicaId=").append(String.valueOf(this.volumeReplicaId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MemberReplica)) {
            return false;
        }

        MemberReplica other = (MemberReplica) o;
        return java.util.Objects.equals(this.volumeReplicaId, other.volumeReplicaId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.volumeReplicaId == null ? 43 : this.volumeReplicaId.hashCode());
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
