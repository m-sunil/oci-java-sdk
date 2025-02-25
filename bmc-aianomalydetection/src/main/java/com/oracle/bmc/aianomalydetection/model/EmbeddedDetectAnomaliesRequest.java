/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * The request body when the user selects to provide byte data in detect call which is Base64 encoded.
 * The default type of the data is CSV and can be JSON by setting the 'contentType'.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EmbeddedDetectAnomaliesRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "requestType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EmbeddedDetectAnomaliesRequest extends DetectAnomaliesDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private ContentType contentType;

        public Builder contentType(ContentType contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private byte[] content;

        public Builder content(byte[] content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmbeddedDetectAnomaliesRequest build() {
            EmbeddedDetectAnomaliesRequest __instance__ =
                    new EmbeddedDetectAnomaliesRequest(modelId, contentType, content);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmbeddedDetectAnomaliesRequest o) {
            Builder copiedBuilder =
                    modelId(o.getModelId()).contentType(o.getContentType()).content(o.getContent());

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
    public EmbeddedDetectAnomaliesRequest(String modelId, ContentType contentType, byte[] content) {
        super(modelId);
        this.contentType = contentType;
        this.content = content;
    }

    /**
     **/
    public enum ContentType {
        Csv("CSV"),
        Json("JSON"),
        ;

        private final String value;
        private static java.util.Map<String, ContentType> map;

        static {
            map = new java.util.HashMap<>();
            for (ContentType v : ContentType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ContentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ContentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ContentType: " + key);
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final ContentType contentType;

    public ContentType getContentType() {
        return contentType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final byte[] content;

    public byte[] getContent() {
        return content;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EmbeddedDetectAnomaliesRequest(");
        sb.append("super=").append(super.toString());
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmbeddedDetectAnomaliesRequest)) {
            return false;
        }

        EmbeddedDetectAnomaliesRequest other = (EmbeddedDetectAnomaliesRequest) o;
        return java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
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
