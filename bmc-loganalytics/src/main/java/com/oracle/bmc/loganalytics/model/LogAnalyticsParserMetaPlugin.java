/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParserMetaPlugin
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
    builder = LogAnalyticsParserMetaPlugin.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsParserMetaPlugin {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metaPluginParameters",
        "description",
        "displayName",
        "name"
    })
    public LogAnalyticsParserMetaPlugin(
            java.util.List<LogAnalyticsParserMetaPluginParameter> metaPluginParameters,
            String description,
            String displayName,
            String name) {
        super();
        this.metaPluginParameters = metaPluginParameters;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of plugin parameters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metaPluginParameters")
        private java.util.List<LogAnalyticsParserMetaPluginParameter> metaPluginParameters;

        /**
         * An array of plugin parameters.
         * @param metaPluginParameters the value to set
         * @return this builder
         **/
        public Builder metaPluginParameters(
                java.util.List<LogAnalyticsParserMetaPluginParameter> metaPluginParameters) {
            this.metaPluginParameters = metaPluginParameters;
            this.__explicitlySet__.add("metaPluginParameters");
            return this;
        }
        /**
         * The plugin description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The plugin description.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The plugin display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The plugin display name.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The plugin internal name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The plugin internal name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParserMetaPlugin build() {
            LogAnalyticsParserMetaPlugin __instance__ =
                    new LogAnalyticsParserMetaPlugin(
                            metaPluginParameters, description, displayName, name);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParserMetaPlugin o) {
            Builder copiedBuilder =
                    metaPluginParameters(o.getMetaPluginParameters())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .name(o.getName());

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
     * An array of plugin parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metaPluginParameters")
    private final java.util.List<LogAnalyticsParserMetaPluginParameter> metaPluginParameters;

    /**
     * An array of plugin parameters.
     * @return the value
     **/
    public java.util.List<LogAnalyticsParserMetaPluginParameter> getMetaPluginParameters() {
        return metaPluginParameters;
    }

    /**
     * The plugin description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The plugin description.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The plugin display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The plugin display name.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The plugin internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The plugin internal name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsParserMetaPlugin(");
        sb.append("metaPluginParameters=").append(String.valueOf(this.metaPluginParameters));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsParserMetaPlugin)) {
            return false;
        }

        LogAnalyticsParserMetaPlugin other = (LogAnalyticsParserMetaPlugin) o;
        return java.util.Objects.equals(this.metaPluginParameters, other.metaPluginParameters)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.metaPluginParameters == null
                                ? 43
                                : this.metaPluginParameters.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
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
