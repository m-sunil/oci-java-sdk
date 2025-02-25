/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * A caching rule criteria condition and value.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CachingRuleCriteria.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CachingRuleCriteria {
    @Deprecated
    @java.beans.ConstructorProperties({"condition", "value"})
    public CachingRuleCriteria(Condition condition, String value) {
        super();
        this.condition = condition;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The condition of the caching rule criteria.
         * - **URL_IS:** Matches if the concatenation of request URL path and query is identical to the contents of the {@code value} field.
         * <p>
         * - **URL_STARTS_WITH:** Matches if the concatenation of request URL path and query starts with the contents of the {@code value} field.
         * <p>
         * - **URL_PART_ENDS_WITH:** Matches if the concatenation of request URL path and query ends with the contents of the {@code value} field.
         * <p>
         * - **URL_PART_CONTAINS:** Matches if the concatenation of request URL path and query contains the contents of the {@code value} field.
         * <p>
         * URLs must start with a {@code /}. URLs can't contain restricted double slashes {@code //}. URLs can't contain the restricted {@code '} {@code &} {@code ?} symbols. Resources to cache can only be specified by a URL, any query parameters are ignored.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private Condition condition;

        /**
         * The condition of the caching rule criteria.
         * - **URL_IS:** Matches if the concatenation of request URL path and query is identical to the contents of the {@code value} field.
         * <p>
         * - **URL_STARTS_WITH:** Matches if the concatenation of request URL path and query starts with the contents of the {@code value} field.
         * <p>
         * - **URL_PART_ENDS_WITH:** Matches if the concatenation of request URL path and query ends with the contents of the {@code value} field.
         * <p>
         * - **URL_PART_CONTAINS:** Matches if the concatenation of request URL path and query contains the contents of the {@code value} field.
         * <p>
         * URLs must start with a {@code /}. URLs can't contain restricted double slashes {@code //}. URLs can't contain the restricted {@code '} {@code &} {@code ?} symbols. Resources to cache can only be specified by a URL, any query parameters are ignored.
         * @param condition the value to set
         * @return this builder
         **/
        public Builder condition(Condition condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /**
         * The value of the caching rule criteria.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The value of the caching rule criteria.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CachingRuleCriteria build() {
            CachingRuleCriteria __instance__ = new CachingRuleCriteria(condition, value);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CachingRuleCriteria o) {
            Builder copiedBuilder = condition(o.getCondition()).value(o.getValue());

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
     * The condition of the caching rule criteria.
     * - **URL_IS:** Matches if the concatenation of request URL path and query is identical to the contents of the {@code value} field.
     * <p>
     * - **URL_STARTS_WITH:** Matches if the concatenation of request URL path and query starts with the contents of the {@code value} field.
     * <p>
     * - **URL_PART_ENDS_WITH:** Matches if the concatenation of request URL path and query ends with the contents of the {@code value} field.
     * <p>
     * - **URL_PART_CONTAINS:** Matches if the concatenation of request URL path and query contains the contents of the {@code value} field.
     * <p>
     * URLs must start with a {@code /}. URLs can't contain restricted double slashes {@code //}. URLs can't contain the restricted {@code '} {@code &} {@code ?} symbols. Resources to cache can only be specified by a URL, any query parameters are ignored.
     **/
    public enum Condition {
        UrlIs("URL_IS"),
        UrlStartsWith("URL_STARTS_WITH"),
        UrlPartEndsWith("URL_PART_ENDS_WITH"),
        UrlPartContains("URL_PART_CONTAINS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Condition.class);

        private final String value;
        private static java.util.Map<String, Condition> map;

        static {
            map = new java.util.HashMap<>();
            for (Condition v : Condition.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Condition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Condition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Condition', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The condition of the caching rule criteria.
     * - **URL_IS:** Matches if the concatenation of request URL path and query is identical to the contents of the {@code value} field.
     * <p>
     * - **URL_STARTS_WITH:** Matches if the concatenation of request URL path and query starts with the contents of the {@code value} field.
     * <p>
     * - **URL_PART_ENDS_WITH:** Matches if the concatenation of request URL path and query ends with the contents of the {@code value} field.
     * <p>
     * - **URL_PART_CONTAINS:** Matches if the concatenation of request URL path and query contains the contents of the {@code value} field.
     * <p>
     * URLs must start with a {@code /}. URLs can't contain restricted double slashes {@code //}. URLs can't contain the restricted {@code '} {@code &} {@code ?} symbols. Resources to cache can only be specified by a URL, any query parameters are ignored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final Condition condition;

    /**
     * The condition of the caching rule criteria.
     * - **URL_IS:** Matches if the concatenation of request URL path and query is identical to the contents of the {@code value} field.
     * <p>
     * - **URL_STARTS_WITH:** Matches if the concatenation of request URL path and query starts with the contents of the {@code value} field.
     * <p>
     * - **URL_PART_ENDS_WITH:** Matches if the concatenation of request URL path and query ends with the contents of the {@code value} field.
     * <p>
     * - **URL_PART_CONTAINS:** Matches if the concatenation of request URL path and query contains the contents of the {@code value} field.
     * <p>
     * URLs must start with a {@code /}. URLs can't contain restricted double slashes {@code //}. URLs can't contain the restricted {@code '} {@code &} {@code ?} symbols. Resources to cache can only be specified by a URL, any query parameters are ignored.
     * @return the value
     **/
    public Condition getCondition() {
        return condition;
    }

    /**
     * The value of the caching rule criteria.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The value of the caching rule criteria.
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CachingRuleCriteria(");
        sb.append("condition=").append(String.valueOf(this.condition));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CachingRuleCriteria)) {
            return false;
        }

        CachingRuleCriteria other = (CachingRuleCriteria) o;
        return java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
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
