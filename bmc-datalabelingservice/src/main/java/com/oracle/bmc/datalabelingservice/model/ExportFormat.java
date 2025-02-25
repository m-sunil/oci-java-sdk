/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservice.model;

/**
 * Specifies the export format to be used for exporting snapshot.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportFormat.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExportFormat {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "version"})
    public ExportFormat(Name name, Version version) {
        super();
        this.name = name;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of export format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private Name name;

        /**
         * Name of export format.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(Name name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Version of export format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Version version;

        /**
         * Version of export format.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(Version version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportFormat build() {
            ExportFormat __instance__ = new ExportFormat(name, version);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportFormat o) {
            Builder copiedBuilder = name(o.getName()).version(o.getVersion());

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
     * Name of export format.
     **/
    public enum Name {
        Jsonl("JSONL"),
        JsonlConsolidated("JSONL_CONSOLIDATED"),
        Conll("CONLL"),
        Spacy("SPACY"),
        Coco("COCO"),
        Yolo("YOLO"),
        PascalVoc("PASCAL_VOC"),
        JsonlCompactPlusContent("JSONL_COMPACT_PLUS_CONTENT"),
        ;

        private final String value;
        private static java.util.Map<String, Name> map;

        static {
            map = new java.util.HashMap<>();
            for (Name v : Name.values()) {
                map.put(v.getValue(), v);
            }
        }

        Name(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Name create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Name: " + key);
        }
    };
    /**
     * Name of export format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final Name name;

    /**
     * Name of export format.
     * @return the value
     **/
    public Name getName() {
        return name;
    }

    /**
     * Version of export format.
     **/
    public enum Version {
        V2003("V2003"),
        V5("V5"),
        ;

        private final String value;
        private static java.util.Map<String, Version> map;

        static {
            map = new java.util.HashMap<>();
            for (Version v : Version.values()) {
                map.put(v.getValue(), v);
            }
        }

        Version(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Version create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Version: " + key);
        }
    };
    /**
     * Version of export format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Version version;

    /**
     * Version of export format.
     * @return the value
     **/
    public Version getVersion() {
        return version;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExportFormat(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportFormat)) {
            return false;
        }

        ExportFormat other = (ExportFormat) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
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
