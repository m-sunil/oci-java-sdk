/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * The source of the command when imported from an Object Storage URL.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceAgentCommandSourceViaObjectStorageUriDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstanceAgentCommandSourceViaObjectStorageUriDetails
        extends InstanceAgentCommandSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Object Storage URL or pre-authenticated request (PAR) for the command.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
        private String sourceUri;

        /**
         * The Object Storage URL or pre-authenticated request (PAR) for the command.
         * @param sourceUri the value to set
         * @return this builder
         **/
        public Builder sourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            this.__explicitlySet__.add("sourceUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentCommandSourceViaObjectStorageUriDetails build() {
            InstanceAgentCommandSourceViaObjectStorageUriDetails __instance__ =
                    new InstanceAgentCommandSourceViaObjectStorageUriDetails(sourceUri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentCommandSourceViaObjectStorageUriDetails o) {
            Builder copiedBuilder = sourceUri(o.getSourceUri());

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
    public InstanceAgentCommandSourceViaObjectStorageUriDetails(String sourceUri) {
        super();
        this.sourceUri = sourceUri;
    }

    /**
     * The Object Storage URL or pre-authenticated request (PAR) for the command.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
    private final String sourceUri;

    /**
     * The Object Storage URL or pre-authenticated request (PAR) for the command.
     * @return the value
     **/
    public String getSourceUri() {
        return sourceUri;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InstanceAgentCommandSourceViaObjectStorageUriDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", sourceUri=").append(String.valueOf(this.sourceUri));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceAgentCommandSourceViaObjectStorageUriDetails)) {
            return false;
        }

        InstanceAgentCommandSourceViaObjectStorageUriDetails other =
                (InstanceAgentCommandSourceViaObjectStorageUriDetails) o;
        return java.util.Objects.equals(this.sourceUri, other.sourceUri)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sourceUri == null ? 43 : this.sourceUri.hashCode());
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
