/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Command descriptor for querylanguage STATS command.
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
    builder = StatsCommandDescriptor.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "name"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StatsCommandDescriptor extends AbstractCommandDescriptor {
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
         * Group by fields if specified in the query string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupByFields")
        private java.util.List<AbstractField> groupByFields;

        /**
         * Group by fields if specified in the query string.
         *
         * @param groupByFields the value to set
         * @return this builder
         **/
        public Builder groupByFields(java.util.List<AbstractField> groupByFields) {
            this.groupByFields = groupByFields;
            this.__explicitlySet__.add("groupByFields");
            return this;
        }
        /**
         * Statistical functions specified in the query string. Atleast 1 is required for a STATS command.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("functions")
        private java.util.List<FunctionField> functions;

        /**
         * Statistical functions specified in the query string. Atleast 1 is required for a STATS command.
         *
         * @param functions the value to set
         * @return this builder
         **/
        public Builder functions(java.util.List<FunctionField> functions) {
            this.functions = functions;
            this.__explicitlySet__.add("functions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StatsCommandDescriptor build() {
            StatsCommandDescriptor __instance__ =
                    new StatsCommandDescriptor(
                            displayQueryString,
                            internalQueryString,
                            category,
                            referencedFields,
                            declaredFields,
                            groupByFields,
                            functions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StatsCommandDescriptor o) {
            Builder copiedBuilder =
                    displayQueryString(o.getDisplayQueryString())
                            .internalQueryString(o.getInternalQueryString())
                            .category(o.getCategory())
                            .referencedFields(o.getReferencedFields())
                            .declaredFields(o.getDeclaredFields())
                            .groupByFields(o.getGroupByFields())
                            .functions(o.getFunctions());

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
    public StatsCommandDescriptor(
            String displayQueryString,
            String internalQueryString,
            String category,
            java.util.List<AbstractField> referencedFields,
            java.util.List<AbstractField> declaredFields,
            java.util.List<AbstractField> groupByFields,
            java.util.List<FunctionField> functions) {
        super(displayQueryString, internalQueryString, category, referencedFields, declaredFields);
        this.groupByFields = groupByFields;
        this.functions = functions;
    }

    /**
     * Group by fields if specified in the query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupByFields")
    private final java.util.List<AbstractField> groupByFields;

    /**
     * Group by fields if specified in the query string.
     *
     * @return the value
     **/
    public java.util.List<AbstractField> getGroupByFields() {
        return groupByFields;
    }

    /**
     * Statistical functions specified in the query string. Atleast 1 is required for a STATS command.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functions")
    private final java.util.List<FunctionField> functions;

    /**
     * Statistical functions specified in the query string. Atleast 1 is required for a STATS command.
     *
     * @return the value
     **/
    public java.util.List<FunctionField> getFunctions() {
        return functions;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StatsCommandDescriptor(");
        sb.append("super=").append(super.toString());
        sb.append(", groupByFields=").append(String.valueOf(this.groupByFields));
        sb.append(", functions=").append(String.valueOf(this.functions));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StatsCommandDescriptor)) {
            return false;
        }

        StatsCommandDescriptor other = (StatsCommandDescriptor) o;
        return java.util.Objects.equals(this.groupByFields, other.groupByFields)
                && java.util.Objects.equals(this.functions, other.functions)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.groupByFields == null ? 43 : this.groupByFields.hashCode());
        result = (result * PRIME) + (this.functions == null ? 43 : this.functions.hashCode());
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
