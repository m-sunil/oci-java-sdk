/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Command descriptor for querylanguage CLASSIFY command.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ClassifyCommandDescriptor.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "name"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClassifyCommandDescriptor extends AbstractCommandDescriptor {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
        private String displayQueryString;

        public Builder displayQueryString(String displayQueryString) {
            this.displayQueryString = displayQueryString;
            this.__explicitlySet__.add("displayQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
        private String internalQueryString;

        public Builder internalQueryString(String internalQueryString) {
            this.internalQueryString = internalQueryString;
            this.__explicitlySet__.add("internalQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedFields")
        private java.util.List<AbstractField> referencedFields;

        public Builder referencedFields(java.util.List<AbstractField> referencedFields) {
            this.referencedFields = referencedFields;
            this.__explicitlySet__.add("referencedFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("declaredFields")
        private java.util.List<AbstractField> declaredFields;

        public Builder declaredFields(java.util.List<AbstractField> declaredFields) {
            this.declaredFields = declaredFields;
            this.__explicitlySet__.add("declaredFields");
            return this;
        }
        /**
         * Value specified in CLASSIFY command in queryString if set limits the results returned to top N.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("topCount")
        private Integer topCount;

        /**
         * Value specified in CLASSIFY command in queryString if set limits the results returned to top N.
         *
         * @param topCount the value to set
         * @return this builder
         **/
        public Builder topCount(Integer topCount) {
            this.topCount = topCount;
            this.__explicitlySet__.add("topCount");
            return this;
        }
        /**
         * Value specified in CLASSIFY command in queryString if set limits the results returned to bottom N.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bottomCount")
        private Integer bottomCount;

        /**
         * Value specified in CLASSIFY command in queryString if set limits the results returned to bottom N.
         *
         * @param bottomCount the value to set
         * @return this builder
         **/
        public Builder bottomCount(Integer bottomCount) {
            this.bottomCount = bottomCount;
            this.__explicitlySet__.add("bottomCount");
            return this;
        }
        /**
         * Fields specified in CLASSIFY command in queryString if set include / exclude fields in correlate results.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("correlate")
        private java.util.List<FieldsAddRemoveField> correlate;

        /**
         * Fields specified in CLASSIFY command in queryString if set include / exclude fields in correlate results.
         *
         * @param correlate the value to set
         * @return this builder
         **/
        public Builder correlate(java.util.List<FieldsAddRemoveField> correlate) {
            this.correlate = correlate;
            this.__explicitlySet__.add("correlate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClassifyCommandDescriptor build() {
            ClassifyCommandDescriptor __instance__ =
                    new ClassifyCommandDescriptor(
                            displayQueryString,
                            internalQueryString,
                            category,
                            referencedFields,
                            declaredFields,
                            topCount,
                            bottomCount,
                            correlate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClassifyCommandDescriptor o) {
            Builder copiedBuilder =
                    displayQueryString(o.getDisplayQueryString())
                            .internalQueryString(o.getInternalQueryString())
                            .category(o.getCategory())
                            .referencedFields(o.getReferencedFields())
                            .declaredFields(o.getDeclaredFields())
                            .topCount(o.getTopCount())
                            .bottomCount(o.getBottomCount())
                            .correlate(o.getCorrelate());

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
    public ClassifyCommandDescriptor(
            String displayQueryString,
            String internalQueryString,
            String category,
            java.util.List<AbstractField> referencedFields,
            java.util.List<AbstractField> declaredFields,
            Integer topCount,
            Integer bottomCount,
            java.util.List<FieldsAddRemoveField> correlate) {
        super(displayQueryString, internalQueryString, category, referencedFields, declaredFields);
        this.topCount = topCount;
        this.bottomCount = bottomCount;
        this.correlate = correlate;
    }

    /**
     * Value specified in CLASSIFY command in queryString if set limits the results returned to top N.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("topCount")
    private final Integer topCount;

    /**
     * Value specified in CLASSIFY command in queryString if set limits the results returned to top N.
     *
     * @return the value
     **/
    public Integer getTopCount() {
        return topCount;
    }

    /**
     * Value specified in CLASSIFY command in queryString if set limits the results returned to bottom N.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bottomCount")
    private final Integer bottomCount;

    /**
     * Value specified in CLASSIFY command in queryString if set limits the results returned to bottom N.
     *
     * @return the value
     **/
    public Integer getBottomCount() {
        return bottomCount;
    }

    /**
     * Fields specified in CLASSIFY command in queryString if set include / exclude fields in correlate results.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("correlate")
    private final java.util.List<FieldsAddRemoveField> correlate;

    /**
     * Fields specified in CLASSIFY command in queryString if set include / exclude fields in correlate results.
     *
     * @return the value
     **/
    public java.util.List<FieldsAddRemoveField> getCorrelate() {
        return correlate;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClassifyCommandDescriptor(");
        sb.append("super=").append(super.toString());
        sb.append(", topCount=").append(String.valueOf(this.topCount));
        sb.append(", bottomCount=").append(String.valueOf(this.bottomCount));
        sb.append(", correlate=").append(String.valueOf(this.correlate));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClassifyCommandDescriptor)) {
            return false;
        }

        ClassifyCommandDescriptor other = (ClassifyCommandDescriptor) o;
        return java.util.Objects.equals(this.topCount, other.topCount)
                && java.util.Objects.equals(this.bottomCount, other.bottomCount)
                && java.util.Objects.equals(this.correlate, other.correlate)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.topCount == null ? 43 : this.topCount.hashCode());
        result = (result * PRIME) + (this.bottomCount == null ? 43 : this.bottomCount.hashCode());
        result = (result * PRIME) + (this.correlate == null ? 43 : this.correlate.hashCode());
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
