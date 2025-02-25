/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the configuration for getting a path analysis using the persisted {@code PathAnalyzerTest} resource.
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
    builder = PersistedGetPathAnalysisDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PersistedGetPathAnalysisDetails extends GetPathAnalysisDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the {@code PathAnalyzerTest} resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pathAnalyzerTestId")
        private String pathAnalyzerTestId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the {@code PathAnalyzerTest} resource.
         *
         * @param pathAnalyzerTestId the value to set
         * @return this builder
         **/
        public Builder pathAnalyzerTestId(String pathAnalyzerTestId) {
            this.pathAnalyzerTestId = pathAnalyzerTestId;
            this.__explicitlySet__.add("pathAnalyzerTestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PersistedGetPathAnalysisDetails build() {
            PersistedGetPathAnalysisDetails __instance__ =
                    new PersistedGetPathAnalysisDetails(pathAnalyzerTestId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PersistedGetPathAnalysisDetails o) {
            Builder copiedBuilder = pathAnalyzerTestId(o.getPathAnalyzerTestId());

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
    public PersistedGetPathAnalysisDetails(String pathAnalyzerTestId) {
        super();
        this.pathAnalyzerTestId = pathAnalyzerTestId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the {@code PathAnalyzerTest} resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pathAnalyzerTestId")
    private final String pathAnalyzerTestId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the {@code PathAnalyzerTest} resource.
     *
     * @return the value
     **/
    public String getPathAnalyzerTestId() {
        return pathAnalyzerTestId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PersistedGetPathAnalysisDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", pathAnalyzerTestId=").append(String.valueOf(this.pathAnalyzerTestId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PersistedGetPathAnalysisDetails)) {
            return false;
        }

        PersistedGetPathAnalysisDetails other = (PersistedGetPathAnalysisDetails) o;
        return java.util.Objects.equals(this.pathAnalyzerTestId, other.pathAnalyzerTestId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.pathAnalyzerTestId == null
                                ? 43
                                : this.pathAnalyzerTestId.hashCode());
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
