/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The type representing the macro field concept. Macro fields have an expression to define a macro.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MacroField.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MacroField extends TypedObject {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expr")
        private Expression expr;

        public Builder expr(Expression expr) {
            this.expr = expr;
            this.__explicitlySet__.add("expr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private BaseType type;

        public Builder type(BaseType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Specifies whether the type of macro fields is inferred from an expression or useType (false) or the source field (true).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUseSourceType")
        private Boolean isUseSourceType;

        /**
         * Specifies whether the type of macro fields is inferred from an expression or useType (false) or the source field (true).
         * @param isUseSourceType the value to set
         * @return this builder
         **/
        public Builder isUseSourceType(Boolean isUseSourceType) {
            this.isUseSourceType = isUseSourceType;
            this.__explicitlySet__.add("isUseSourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("useType")
        private ConfiguredType useType;

        public Builder useType(ConfiguredType useType) {
            this.useType = useType;
            this.__explicitlySet__.add("useType");
            return this;
        }
        /**
         * Labels are keywords or labels that you can add to data assets, dataflows, and so on. You can define your own labels and use them to categorize content.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * Labels are keywords or labels that you can add to data assets, dataflows, and so on. You can define your own labels and use them to categorize content.
         * @param labels the value to set
         * @return this builder
         **/
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MacroField build() {
            MacroField __instance__ =
                    new MacroField(
                            key,
                            modelVersion,
                            parentRef,
                            configValues,
                            objectStatus,
                            name,
                            description,
                            expr,
                            type,
                            isUseSourceType,
                            useType,
                            labels);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MacroField o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .configValues(o.getConfigValues())
                            .objectStatus(o.getObjectStatus())
                            .name(o.getName())
                            .description(o.getDescription())
                            .expr(o.getExpr())
                            .type(o.getType())
                            .isUseSourceType(o.getIsUseSourceType())
                            .useType(o.getUseType())
                            .labels(o.getLabels());

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
    public MacroField(
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            Integer objectStatus,
            String name,
            String description,
            Expression expr,
            BaseType type,
            Boolean isUseSourceType,
            ConfiguredType useType,
            java.util.List<String> labels) {
        super(key, modelVersion, parentRef, configValues, objectStatus, name, description);
        this.expr = expr;
        this.type = type;
        this.isUseSourceType = isUseSourceType;
        this.useType = useType;
        this.labels = labels;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("expr")
    private final Expression expr;

    public Expression getExpr() {
        return expr;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final BaseType type;

    public BaseType getType() {
        return type;
    }

    /**
     * Specifies whether the type of macro fields is inferred from an expression or useType (false) or the source field (true).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUseSourceType")
    private final Boolean isUseSourceType;

    /**
     * Specifies whether the type of macro fields is inferred from an expression or useType (false) or the source field (true).
     * @return the value
     **/
    public Boolean getIsUseSourceType() {
        return isUseSourceType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("useType")
    private final ConfiguredType useType;

    public ConfiguredType getUseType() {
        return useType;
    }

    /**
     * Labels are keywords or labels that you can add to data assets, dataflows, and so on. You can define your own labels and use them to categorize content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * Labels are keywords or labels that you can add to data assets, dataflows, and so on. You can define your own labels and use them to categorize content.
     * @return the value
     **/
    public java.util.List<String> getLabels() {
        return labels;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MacroField(");
        sb.append("super=").append(super.toString());
        sb.append(", expr=").append(String.valueOf(this.expr));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isUseSourceType=").append(String.valueOf(this.isUseSourceType));
        sb.append(", useType=").append(String.valueOf(this.useType));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MacroField)) {
            return false;
        }

        MacroField other = (MacroField) o;
        return java.util.Objects.equals(this.expr, other.expr)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isUseSourceType, other.isUseSourceType)
                && java.util.Objects.equals(this.useType, other.useType)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.expr == null ? 43 : this.expr.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.isUseSourceType == null ? 43 : this.isUseSourceType.hashCode());
        result = (result * PRIME) + (this.useType == null ? 43 : this.useType.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
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
