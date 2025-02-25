/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents the advance http header options that allow the setting of http header size and allow/disallow
 * invalid characters in the http headers.
 * For example httpLargeHeaderSizeInKB=32, the http header could have 4 buffers of 32KBs each
 * This rule applies only to HTTP listeners. No more than one {@code HttpHeaderRule} object can be present in
 * a given listener.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HttpHeaderRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HttpHeaderRule extends Rule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether or not invalid characters in client header fields will be allowed.
         * Valid names are composed of English letters, digits, hyphens and underscores.
         * If "true", invalid characters are allowed in the HTTP header.
         * If "false", invalid characters are not allowed in the HTTP header
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areInvalidCharactersAllowed")
        private Boolean areInvalidCharactersAllowed;

        /**
         * Indicates whether or not invalid characters in client header fields will be allowed.
         * Valid names are composed of English letters, digits, hyphens and underscores.
         * If "true", invalid characters are allowed in the HTTP header.
         * If "false", invalid characters are not allowed in the HTTP header
         *
         * @param areInvalidCharactersAllowed the value to set
         * @return this builder
         **/
        public Builder areInvalidCharactersAllowed(Boolean areInvalidCharactersAllowed) {
            this.areInvalidCharactersAllowed = areInvalidCharactersAllowed;
            this.__explicitlySet__.add("areInvalidCharactersAllowed");
            return this;
        }
        /**
         * The maximum size of each buffer used for reading http client request header.
         * This value indicates the maximum size allowed for each buffer.
         * The allowed values for buffer size are 8, 16, 32 and 64.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("httpLargeHeaderSizeInKB")
        private Integer httpLargeHeaderSizeInKB;

        /**
         * The maximum size of each buffer used for reading http client request header.
         * This value indicates the maximum size allowed for each buffer.
         * The allowed values for buffer size are 8, 16, 32 and 64.
         *
         * @param httpLargeHeaderSizeInKB the value to set
         * @return this builder
         **/
        public Builder httpLargeHeaderSizeInKB(Integer httpLargeHeaderSizeInKB) {
            this.httpLargeHeaderSizeInKB = httpLargeHeaderSizeInKB;
            this.__explicitlySet__.add("httpLargeHeaderSizeInKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpHeaderRule build() {
            HttpHeaderRule __instance__ =
                    new HttpHeaderRule(areInvalidCharactersAllowed, httpLargeHeaderSizeInKB);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpHeaderRule o) {
            Builder copiedBuilder =
                    areInvalidCharactersAllowed(o.getAreInvalidCharactersAllowed())
                            .httpLargeHeaderSizeInKB(o.getHttpLargeHeaderSizeInKB());

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
    public HttpHeaderRule(Boolean areInvalidCharactersAllowed, Integer httpLargeHeaderSizeInKB) {
        super();
        this.areInvalidCharactersAllowed = areInvalidCharactersAllowed;
        this.httpLargeHeaderSizeInKB = httpLargeHeaderSizeInKB;
    }

    /**
     * Indicates whether or not invalid characters in client header fields will be allowed.
     * Valid names are composed of English letters, digits, hyphens and underscores.
     * If "true", invalid characters are allowed in the HTTP header.
     * If "false", invalid characters are not allowed in the HTTP header
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areInvalidCharactersAllowed")
    private final Boolean areInvalidCharactersAllowed;

    /**
     * Indicates whether or not invalid characters in client header fields will be allowed.
     * Valid names are composed of English letters, digits, hyphens and underscores.
     * If "true", invalid characters are allowed in the HTTP header.
     * If "false", invalid characters are not allowed in the HTTP header
     *
     * @return the value
     **/
    public Boolean getAreInvalidCharactersAllowed() {
        return areInvalidCharactersAllowed;
    }

    /**
     * The maximum size of each buffer used for reading http client request header.
     * This value indicates the maximum size allowed for each buffer.
     * The allowed values for buffer size are 8, 16, 32 and 64.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpLargeHeaderSizeInKB")
    private final Integer httpLargeHeaderSizeInKB;

    /**
     * The maximum size of each buffer used for reading http client request header.
     * This value indicates the maximum size allowed for each buffer.
     * The allowed values for buffer size are 8, 16, 32 and 64.
     *
     * @return the value
     **/
    public Integer getHttpLargeHeaderSizeInKB() {
        return httpLargeHeaderSizeInKB;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HttpHeaderRule(");
        sb.append("super=").append(super.toString());
        sb.append(", areInvalidCharactersAllowed=")
                .append(String.valueOf(this.areInvalidCharactersAllowed));
        sb.append(", httpLargeHeaderSizeInKB=")
                .append(String.valueOf(this.httpLargeHeaderSizeInKB));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpHeaderRule)) {
            return false;
        }

        HttpHeaderRule other = (HttpHeaderRule) o;
        return java.util.Objects.equals(
                        this.areInvalidCharactersAllowed, other.areInvalidCharactersAllowed)
                && java.util.Objects.equals(
                        this.httpLargeHeaderSizeInKB, other.httpLargeHeaderSizeInKB)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.areInvalidCharactersAllowed == null
                                ? 43
                                : this.areInvalidCharactersAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.httpLargeHeaderSizeInKB == null
                                ? 43
                                : this.httpLargeHeaderSizeInKB.hashCode());
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
