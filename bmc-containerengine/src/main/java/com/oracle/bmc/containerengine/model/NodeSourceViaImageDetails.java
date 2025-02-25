/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Details of the image running on the node.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NodeSourceViaImageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NodeSourceViaImageDetails extends NodeSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the image used to boot the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * The OCID of the image used to boot the node.
         * @param imageId the value to set
         * @return this builder
         **/
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }
        /**
         * The size of the boot volume in GBs. Minimum value is 50 GB. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/Block/Concepts/bootvolumes.htm) for max custom boot volume sizing and OS-specific requirements.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeSizeInGBs")
        private Long bootVolumeSizeInGBs;

        /**
         * The size of the boot volume in GBs. Minimum value is 50 GB. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/Block/Concepts/bootvolumes.htm) for max custom boot volume sizing and OS-specific requirements.
         * @param bootVolumeSizeInGBs the value to set
         * @return this builder
         **/
        public Builder bootVolumeSizeInGBs(Long bootVolumeSizeInGBs) {
            this.bootVolumeSizeInGBs = bootVolumeSizeInGBs;
            this.__explicitlySet__.add("bootVolumeSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodeSourceViaImageDetails build() {
            NodeSourceViaImageDetails __instance__ =
                    new NodeSourceViaImageDetails(imageId, bootVolumeSizeInGBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeSourceViaImageDetails o) {
            Builder copiedBuilder =
                    imageId(o.getImageId()).bootVolumeSizeInGBs(o.getBootVolumeSizeInGBs());

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

    @Deprecated
    public NodeSourceViaImageDetails(String imageId, Long bootVolumeSizeInGBs) {
        super();
        this.imageId = imageId;
        this.bootVolumeSizeInGBs = bootVolumeSizeInGBs;
    }

    /**
     * The OCID of the image used to boot the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * The OCID of the image used to boot the node.
     * @return the value
     **/
    public String getImageId() {
        return imageId;
    }

    /**
     * The size of the boot volume in GBs. Minimum value is 50 GB. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/Block/Concepts/bootvolumes.htm) for max custom boot volume sizing and OS-specific requirements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeSizeInGBs")
    private final Long bootVolumeSizeInGBs;

    /**
     * The size of the boot volume in GBs. Minimum value is 50 GB. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/Block/Concepts/bootvolumes.htm) for max custom boot volume sizing and OS-specific requirements.
     * @return the value
     **/
    public Long getBootVolumeSizeInGBs() {
        return bootVolumeSizeInGBs;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NodeSourceViaImageDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(", bootVolumeSizeInGBs=").append(String.valueOf(this.bootVolumeSizeInGBs));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeSourceViaImageDetails)) {
            return false;
        }

        NodeSourceViaImageDetails other = (NodeSourceViaImageDetails) o;
        return java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.bootVolumeSizeInGBs, other.bootVolumeSizeInGBs)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result =
                (result * PRIME)
                        + (this.bootVolumeSizeInGBs == null
                                ? 43
                                : this.bootVolumeSizeInGBs.hashCode());
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
