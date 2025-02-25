/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Sets a minimum level of mTLS authentication for all virtual services within the mesh.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MeshMutualTransportLayerSecurity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MeshMutualTransportLayerSecurity {
    @Deprecated
    @java.beans.ConstructorProperties({"minimum"})
    public MeshMutualTransportLayerSecurity(MutualTransportLayerSecurity.Mode minimum) {
        super();
        this.minimum = minimum;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * DISABLED: No minimum virtual services within this mesh can use any mTLS authentication mode.
         * PERMISSIVE: Virtual services within this mesh can use either PERMISSIVE or STRICT modes.
         * STRICT: All virtual services within this mesh must use STRICT mode.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minimum")
        private MutualTransportLayerSecurity.Mode minimum;

        /**
         * DISABLED: No minimum virtual services within this mesh can use any mTLS authentication mode.
         * PERMISSIVE: Virtual services within this mesh can use either PERMISSIVE or STRICT modes.
         * STRICT: All virtual services within this mesh must use STRICT mode.
         *
         * @param minimum the value to set
         * @return this builder
         **/
        public Builder minimum(MutualTransportLayerSecurity.Mode minimum) {
            this.minimum = minimum;
            this.__explicitlySet__.add("minimum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MeshMutualTransportLayerSecurity build() {
            MeshMutualTransportLayerSecurity __instance__ =
                    new MeshMutualTransportLayerSecurity(minimum);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MeshMutualTransportLayerSecurity o) {
            Builder copiedBuilder = minimum(o.getMinimum());

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
     * DISABLED: No minimum virtual services within this mesh can use any mTLS authentication mode.
     * PERMISSIVE: Virtual services within this mesh can use either PERMISSIVE or STRICT modes.
     * STRICT: All virtual services within this mesh must use STRICT mode.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimum")
    private final MutualTransportLayerSecurity.Mode minimum;

    /**
     * DISABLED: No minimum virtual services within this mesh can use any mTLS authentication mode.
     * PERMISSIVE: Virtual services within this mesh can use either PERMISSIVE or STRICT modes.
     * STRICT: All virtual services within this mesh must use STRICT mode.
     *
     * @return the value
     **/
    public MutualTransportLayerSecurity.Mode getMinimum() {
        return minimum;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MeshMutualTransportLayerSecurity(");
        sb.append("minimum=").append(String.valueOf(this.minimum));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MeshMutualTransportLayerSecurity)) {
            return false;
        }

        MeshMutualTransportLayerSecurity other = (MeshMutualTransportLayerSecurity) o;
        return java.util.Objects.equals(this.minimum, other.minimum)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minimum == null ? 43 : this.minimum.hashCode());
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
