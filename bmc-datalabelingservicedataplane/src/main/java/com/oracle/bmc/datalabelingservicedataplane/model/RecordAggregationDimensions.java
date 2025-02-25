/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * The dimensions to summarize record information for a given dataset.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RecordAggregationDimensions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RecordAggregationDimensions {
    @Deprecated
    @java.beans.ConstructorProperties({"isLabeled", "annotationLabelContains"})
    public RecordAggregationDimensions(Boolean isLabeled, String annotationLabelContains) {
        super();
        this.isLabeled = isLabeled;
        this.annotationLabelContains = annotationLabelContains;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether or not the record has been labeled and has associated annotations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLabeled")
        private Boolean isLabeled;

        /**
         * Whether or not the record has been labeled and has associated annotations.
         * @param isLabeled the value to set
         * @return this builder
         **/
        public Builder isLabeled(Boolean isLabeled) {
            this.isLabeled = isLabeled;
            this.__explicitlySet__.add("isLabeled");
            return this;
        }
        /**
         * Whether or not the annotation contains a label.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("annotationLabelContains")
        private String annotationLabelContains;

        /**
         * Whether or not the annotation contains a label.
         * @param annotationLabelContains the value to set
         * @return this builder
         **/
        public Builder annotationLabelContains(String annotationLabelContains) {
            this.annotationLabelContains = annotationLabelContains;
            this.__explicitlySet__.add("annotationLabelContains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecordAggregationDimensions build() {
            RecordAggregationDimensions __instance__ =
                    new RecordAggregationDimensions(isLabeled, annotationLabelContains);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecordAggregationDimensions o) {
            Builder copiedBuilder =
                    isLabeled(o.getIsLabeled())
                            .annotationLabelContains(o.getAnnotationLabelContains());

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
     * Whether or not the record has been labeled and has associated annotations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLabeled")
    private final Boolean isLabeled;

    /**
     * Whether or not the record has been labeled and has associated annotations.
     * @return the value
     **/
    public Boolean getIsLabeled() {
        return isLabeled;
    }

    /**
     * Whether or not the annotation contains a label.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("annotationLabelContains")
    private final String annotationLabelContains;

    /**
     * Whether or not the annotation contains a label.
     * @return the value
     **/
    public String getAnnotationLabelContains() {
        return annotationLabelContains;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RecordAggregationDimensions(");
        sb.append("isLabeled=").append(String.valueOf(this.isLabeled));
        sb.append(", annotationLabelContains=")
                .append(String.valueOf(this.annotationLabelContains));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecordAggregationDimensions)) {
            return false;
        }

        RecordAggregationDimensions other = (RecordAggregationDimensions) o;
        return java.util.Objects.equals(this.isLabeled, other.isLabeled)
                && java.util.Objects.equals(
                        this.annotationLabelContains, other.annotationLabelContains)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isLabeled == null ? 43 : this.isLabeled.hashCode());
        result =
                (result * PRIME)
                        + (this.annotationLabelContains == null
                                ? 43
                                : this.annotationLabelContains.hashCode());
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
