/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for links.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Link.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Link {
    @Deprecated
    @java.beans.ConstructorProperties({"rel", "href"})
    public Link(LinkEnum rel, String href) {
        super();
        this.rel = rel;
        this.href = href;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Reference links to the previous page, next page, and other pages.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rel")
        private LinkEnum rel;

        /**
         * Reference links to the previous page, next page, and other pages.
         * @param rel the value to set
         * @return this builder
         **/
        public Builder rel(LinkEnum rel) {
            this.rel = rel;
            this.__explicitlySet__.add("rel");
            return this;
        }
        /**
         * The anchor tag.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        private String href;

        /**
         * The anchor tag.
         * @param href the value to set
         * @return this builder
         **/
        public Builder href(String href) {
            this.href = href;
            this.__explicitlySet__.add("href");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Link build() {
            Link __instance__ = new Link(rel, href);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Link o) {
            Builder copiedBuilder = rel(o.getRel()).href(o.getHref());

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
     * Reference links to the previous page, next page, and other pages.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rel")
    private final LinkEnum rel;

    /**
     * Reference links to the previous page, next page, and other pages.
     * @return the value
     **/
    public LinkEnum getRel() {
        return rel;
    }

    /**
     * The anchor tag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("href")
    private final String href;

    /**
     * The anchor tag.
     * @return the value
     **/
    public String getHref() {
        return href;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Link(");
        sb.append("rel=").append(String.valueOf(this.rel));
        sb.append(", href=").append(String.valueOf(this.href));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Link)) {
            return false;
        }

        Link other = (Link) o;
        return java.util.Objects.equals(this.rel, other.rel)
                && java.util.Objects.equals(this.href, other.href)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rel == null ? 43 : this.rel.hashCode());
        result = (result * PRIME) + (this.href == null ? 43 : this.href.hashCode());
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
