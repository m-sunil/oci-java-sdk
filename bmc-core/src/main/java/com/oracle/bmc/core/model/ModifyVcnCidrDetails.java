/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details for updating a CIDR block.
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
    builder = ModifyVcnCidrDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModifyVcnCidrDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"originalCidrBlock", "newCidrBlock"})
    public ModifyVcnCidrDetails(String originalCidrBlock, String newCidrBlock) {
        super();
        this.originalCidrBlock = originalCidrBlock;
        this.newCidrBlock = newCidrBlock;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The CIDR IP address to update.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("originalCidrBlock")
        private String originalCidrBlock;

        /**
         * The CIDR IP address to update.
         *
         * @param originalCidrBlock the value to set
         * @return this builder
         **/
        public Builder originalCidrBlock(String originalCidrBlock) {
            this.originalCidrBlock = originalCidrBlock;
            this.__explicitlySet__.add("originalCidrBlock");
            return this;
        }
        /**
         * The new CIDR IP address.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("newCidrBlock")
        private String newCidrBlock;

        /**
         * The new CIDR IP address.
         *
         * @param newCidrBlock the value to set
         * @return this builder
         **/
        public Builder newCidrBlock(String newCidrBlock) {
            this.newCidrBlock = newCidrBlock;
            this.__explicitlySet__.add("newCidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModifyVcnCidrDetails build() {
            ModifyVcnCidrDetails __instance__ =
                    new ModifyVcnCidrDetails(originalCidrBlock, newCidrBlock);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModifyVcnCidrDetails o) {
            Builder copiedBuilder =
                    originalCidrBlock(o.getOriginalCidrBlock()).newCidrBlock(o.getNewCidrBlock());

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
     * The CIDR IP address to update.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalCidrBlock")
    private final String originalCidrBlock;

    /**
     * The CIDR IP address to update.
     *
     * @return the value
     **/
    public String getOriginalCidrBlock() {
        return originalCidrBlock;
    }

    /**
     * The new CIDR IP address.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newCidrBlock")
    private final String newCidrBlock;

    /**
     * The new CIDR IP address.
     *
     * @return the value
     **/
    public String getNewCidrBlock() {
        return newCidrBlock;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ModifyVcnCidrDetails(");
        sb.append("originalCidrBlock=").append(String.valueOf(this.originalCidrBlock));
        sb.append(", newCidrBlock=").append(String.valueOf(this.newCidrBlock));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModifyVcnCidrDetails)) {
            return false;
        }

        ModifyVcnCidrDetails other = (ModifyVcnCidrDetails) o;
        return java.util.Objects.equals(this.originalCidrBlock, other.originalCidrBlock)
                && java.util.Objects.equals(this.newCidrBlock, other.newCidrBlock)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.originalCidrBlock == null ? 43 : this.originalCidrBlock.hashCode());
        result = (result * PRIME) + (this.newCidrBlock == null ? 43 : this.newCidrBlock.hashCode());
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
