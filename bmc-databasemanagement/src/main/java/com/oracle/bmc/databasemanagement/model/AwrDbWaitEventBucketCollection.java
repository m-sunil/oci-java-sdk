/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The percentage distribution of waits in the AWR wait event buckets.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrDbWaitEventBucketCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "awrResultType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrDbWaitEventBucketCollection extends AwrQueryResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryKey")
        private String queryKey;

        public Builder queryKey(String queryKey) {
            this.queryKey = queryKey;
            this.__explicitlySet__.add("queryKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbQueryTimeInSecs")
        private Double dbQueryTimeInSecs;

        public Builder dbQueryTimeInSecs(Double dbQueryTimeInSecs) {
            this.dbQueryTimeInSecs = dbQueryTimeInSecs;
            this.__explicitlySet__.add("dbQueryTimeInSecs");
            return this;
        }
        /**
         * The total waits of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalWaits")
        private Long totalWaits;

        /**
         * The total waits of the database.
         * @param totalWaits the value to set
         * @return this builder
         **/
        public Builder totalWaits(Long totalWaits) {
            this.totalWaits = totalWaits;
            this.__explicitlySet__.add("totalWaits");
            return this;
        }
        /**
         * A list of AWR wait event buckets.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AwrDbWaitEventBucketSummary> items;

        /**
         * A list of AWR wait event buckets.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<AwrDbWaitEventBucketSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDbWaitEventBucketCollection build() {
            AwrDbWaitEventBucketCollection __instance__ =
                    new AwrDbWaitEventBucketCollection(
                            name, version, queryKey, dbQueryTimeInSecs, totalWaits, items);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDbWaitEventBucketCollection o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .version(o.getVersion())
                            .queryKey(o.getQueryKey())
                            .dbQueryTimeInSecs(o.getDbQueryTimeInSecs())
                            .totalWaits(o.getTotalWaits())
                            .items(o.getItems());

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
    public AwrDbWaitEventBucketCollection(
            String name,
            String version,
            String queryKey,
            Double dbQueryTimeInSecs,
            Long totalWaits,
            java.util.List<AwrDbWaitEventBucketSummary> items) {
        super(name, version, queryKey, dbQueryTimeInSecs);
        this.totalWaits = totalWaits;
        this.items = items;
    }

    /**
     * The total waits of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalWaits")
    private final Long totalWaits;

    /**
     * The total waits of the database.
     * @return the value
     **/
    public Long getTotalWaits() {
        return totalWaits;
    }

    /**
     * A list of AWR wait event buckets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AwrDbWaitEventBucketSummary> items;

    /**
     * A list of AWR wait event buckets.
     * @return the value
     **/
    public java.util.List<AwrDbWaitEventBucketSummary> getItems() {
        return items;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AwrDbWaitEventBucketCollection(");
        sb.append("super=").append(super.toString());
        sb.append(", totalWaits=").append(String.valueOf(this.totalWaits));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDbWaitEventBucketCollection)) {
            return false;
        }

        AwrDbWaitEventBucketCollection other = (AwrDbWaitEventBucketCollection) o;
        return java.util.Objects.equals(this.totalWaits, other.totalWaits)
                && java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.totalWaits == null ? 43 : this.totalWaits.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
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
