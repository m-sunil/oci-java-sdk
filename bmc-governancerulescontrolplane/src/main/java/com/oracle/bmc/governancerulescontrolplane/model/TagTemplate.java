/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane.model;

/**
 * Template for governance rules of type tag.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TagTemplate.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TagTemplate extends Template {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the tag namespace. It must be unique across all tag namespaces in the tenancy and cannot be changed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the tag namespace. It must be unique across all tag namespaces in the tenancy and cannot be changed.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Description of the tag namespace.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the tag namespace.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Represents an array of tags for tag namespace.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tag> tags;

        /**
         * Represents an array of tags for tag namespace.
         * @param tags the value to set
         * @return this builder
         **/
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagDefaults")
        private java.util.List<TagDefault> tagDefaults;

        public Builder tagDefaults(java.util.List<TagDefault> tagDefaults) {
            this.tagDefaults = tagDefaults;
            this.__explicitlySet__.add("tagDefaults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TagTemplate build() {
            TagTemplate __instance__ = new TagTemplate(name, description, tags, tagDefaults);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TagTemplate o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .description(o.getDescription())
                            .tags(o.getTags())
                            .tagDefaults(o.getTagDefaults());

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
    public TagTemplate(
            String name,
            String description,
            java.util.List<Tag> tags,
            java.util.List<TagDefault> tagDefaults) {
        super();
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.tagDefaults = tagDefaults;
    }

    /**
     * The name of the tag namespace. It must be unique across all tag namespaces in the tenancy and cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the tag namespace. It must be unique across all tag namespaces in the tenancy and cannot be changed.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Description of the tag namespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the tag namespace.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Represents an array of tags for tag namespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<Tag> tags;

    /**
     * Represents an array of tags for tag namespace.
     * @return the value
     **/
    public java.util.List<Tag> getTags() {
        return tags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tagDefaults")
    private final java.util.List<TagDefault> tagDefaults;

    public java.util.List<TagDefault> getTagDefaults() {
        return tagDefaults;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TagTemplate(");
        sb.append("super=").append(super.toString());
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", tagDefaults=").append(String.valueOf(this.tagDefaults));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TagTemplate)) {
            return false;
        }

        TagTemplate other = (TagTemplate) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.tags, other.tags)
                && java.util.Objects.equals(this.tagDefaults, other.tagDefaults)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.tagDefaults == null ? 43 : this.tagDefaults.hashCode());
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
