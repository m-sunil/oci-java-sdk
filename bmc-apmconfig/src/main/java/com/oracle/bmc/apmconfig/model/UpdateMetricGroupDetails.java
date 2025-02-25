/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * A metric group defines a set of metrics to collect from a span. It uses a span filter to specify which spans to
 * process. The set is then published to a namespace, which is a product level subdivision of metrics.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateMetricGroupDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateMetricGroupDetails extends UpdateConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The name by which a configuration entity is displayed to the end user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name by which a configuration entity is displayed to the end user.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a Span Filter. The filterId is mandatory for the creation
         * of MetricGroups. A filterId is generated when a Span Filter is created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filterId")
        private String filterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a Span Filter. The filterId is mandatory for the creation
         * of MetricGroups. A filterId is generated when a Span Filter is created.
         *
         * @param filterId the value to set
         * @return this builder
         **/
        public Builder filterId(String filterId) {
            this.filterId = filterId;
            this.__explicitlySet__.add("filterId");
            return this;
        }
        /**
         * The namespace to which the metrics are published. It must be one of several predefined namespaces.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The namespace to which the metrics are published. It must be one of several predefined namespaces.
         *
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * A list of dimensions for the metric. This variable should not be used.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<Dimension> dimensions;

        /**
         * A list of dimensions for the metric. This variable should not be used.
         * @param dimensions the value to set
         * @return this builder
         **/
        public Builder dimensions(java.util.List<Dimension> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * The list of metrics in this group.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<Metric> metrics;

        /**
         * The list of metrics in this group.
         *
         * @param metrics the value to set
         * @return this builder
         **/
        public Builder metrics(java.util.List<Metric> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMetricGroupDetails build() {
            UpdateMetricGroupDetails __instance__ =
                    new UpdateMetricGroupDetails(
                            freeformTags,
                            definedTags,
                            displayName,
                            filterId,
                            namespace,
                            dimensions,
                            metrics);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMetricGroupDetails o) {
            Builder copiedBuilder =
                    freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .filterId(o.getFilterId())
                            .namespace(o.getNamespace())
                            .dimensions(o.getDimensions())
                            .metrics(o.getMetrics());

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
    public UpdateMetricGroupDetails(
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String filterId,
            String namespace,
            java.util.List<Dimension> dimensions,
            java.util.List<Metric> metrics) {
        super(freeformTags, definedTags);
        this.displayName = displayName;
        this.filterId = filterId;
        this.namespace = namespace;
        this.dimensions = dimensions;
        this.metrics = metrics;
    }

    /**
     * The name by which a configuration entity is displayed to the end user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name by which a configuration entity is displayed to the end user.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a Span Filter. The filterId is mandatory for the creation
     * of MetricGroups. A filterId is generated when a Span Filter is created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterId")
    private final String filterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a Span Filter. The filterId is mandatory for the creation
     * of MetricGroups. A filterId is generated when a Span Filter is created.
     *
     * @return the value
     **/
    public String getFilterId() {
        return filterId;
    }

    /**
     * The namespace to which the metrics are published. It must be one of several predefined namespaces.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The namespace to which the metrics are published. It must be one of several predefined namespaces.
     *
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * A list of dimensions for the metric. This variable should not be used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.List<Dimension> dimensions;

    /**
     * A list of dimensions for the metric. This variable should not be used.
     * @return the value
     **/
    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * The list of metrics in this group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<Metric> metrics;

    /**
     * The list of metrics in this group.
     *
     * @return the value
     **/
    public java.util.List<Metric> getMetrics() {
        return metrics;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateMetricGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", filterId=").append(String.valueOf(this.filterId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMetricGroupDetails)) {
            return false;
        }

        UpdateMetricGroupDetails other = (UpdateMetricGroupDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.filterId, other.filterId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.filterId == null ? 43 : this.filterId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
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
