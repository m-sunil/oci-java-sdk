/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the monitor result data.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonitorResultData.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MonitorResultData {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "byteContent", "stringContent", "timestamp"})
    public MonitorResultData(
            String name, byte[] byteContent, String stringContent, java.util.Date timestamp) {
        super();
        this.name = name;
        this.byteContent = byteContent;
        this.stringContent = stringContent;
        this.timestamp = timestamp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the data.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Data content in byte format.
         * Example: Zip or Screenshot.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("byteContent")
        private byte[] byteContent;

        /**
         * Data content in byte format.
         * Example: Zip or Screenshot.
         *
         * @param byteContent the value to set
         * @return this builder
         **/
        public Builder byteContent(byte[] byteContent) {
            this.byteContent = byteContent;
            this.__explicitlySet__.add("byteContent");
            return this;
        }
        /**
         * Data content in string format.
         * Example: HAR.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stringContent")
        private String stringContent;

        /**
         * Data content in string format.
         * Example: HAR.
         *
         * @param stringContent the value to set
         * @return this builder
         **/
        public Builder stringContent(String stringContent) {
            this.stringContent = stringContent;
            this.__explicitlySet__.add("stringContent");
            return this;
        }
        /**
         * The time when the data was generated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * Example: {@code 2020-02-13T22:47:12.613Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The time when the data was generated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * Example: {@code 2020-02-13T22:47:12.613Z}
         *
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitorResultData build() {
            MonitorResultData __instance__ =
                    new MonitorResultData(name, byteContent, stringContent, timestamp);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitorResultData o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .byteContent(o.getByteContent())
                            .stringContent(o.getStringContent())
                            .timestamp(o.getTimestamp());

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
     * Name of the data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the data.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Data content in byte format.
     * Example: Zip or Screenshot.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("byteContent")
    private final byte[] byteContent;

    /**
     * Data content in byte format.
     * Example: Zip or Screenshot.
     *
     * @return the value
     **/
    public byte[] getByteContent() {
        return byteContent;
    }

    /**
     * Data content in string format.
     * Example: HAR.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stringContent")
    private final String stringContent;

    /**
     * Data content in string format.
     * Example: HAR.
     *
     * @return the value
     **/
    public String getStringContent() {
        return stringContent;
    }

    /**
     * The time when the data was generated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2020-02-13T22:47:12.613Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The time when the data was generated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2020-02-13T22:47:12.613Z}
     *
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MonitorResultData(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", byteContent=").append(String.valueOf(this.byteContent));
        sb.append(", stringContent=").append(String.valueOf(this.stringContent));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitorResultData)) {
            return false;
        }

        MonitorResultData other = (MonitorResultData) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.byteContent, other.byteContent)
                && java.util.Objects.equals(this.stringContent, other.stringContent)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.byteContent == null ? 43 : this.byteContent.hashCode());
        result =
                (result * PRIME)
                        + (this.stringContent == null ? 43 : this.stringContent.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
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
