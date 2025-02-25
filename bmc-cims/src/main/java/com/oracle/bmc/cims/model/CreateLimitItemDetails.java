/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Reserved for future use.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateLimitItemDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateLimitItemDetails extends CreateItemDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private CreateCategoryDetails category;

        public Builder category(CreateCategoryDetails category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subCategory")
        private CreateSubCategoryDetails subCategory;

        public Builder subCategory(CreateSubCategoryDetails subCategory) {
            this.subCategory = subCategory;
            this.__explicitlySet__.add("subCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("issueType")
        private CreateIssueTypeDetails issueType;

        public Builder issueType(CreateIssueTypeDetails issueType) {
            this.issueType = issueType;
            this.__explicitlySet__.add("issueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The limit of the resource currently available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentLimit")
        private Integer currentLimit;

        /**
         * The limit of the resource currently available.
         * @param currentLimit the value to set
         * @return this builder
         **/
        public Builder currentLimit(Integer currentLimit) {
            this.currentLimit = currentLimit;
            this.__explicitlySet__.add("currentLimit");
            return this;
        }
        /**
         * The current usage of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentUsage")
        private Integer currentUsage;

        /**
         * The current usage of the resource.
         * @param currentUsage the value to set
         * @return this builder
         **/
        public Builder currentUsage(Integer currentUsage) {
            this.currentUsage = currentUsage;
            this.__explicitlySet__.add("currentUsage");
            return this;
        }
        /**
         * Reserved for future use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestedLimit")
        private Integer requestedLimit;

        /**
         * Reserved for future use.
         * @param requestedLimit the value to set
         * @return this builder
         **/
        public Builder requestedLimit(Integer requestedLimit) {
            this.requestedLimit = requestedLimit;
            this.__explicitlySet__.add("requestedLimit");
            return this;
        }
        /**
         * The current status of the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limitStatus")
        private LimitStatus limitStatus;

        /**
         * The current status of the request.
         * @param limitStatus the value to set
         * @return this builder
         **/
        public Builder limitStatus(LimitStatus limitStatus) {
            this.limitStatus = limitStatus;
            this.__explicitlySet__.add("limitStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLimitItemDetails build() {
            CreateLimitItemDetails __instance__ =
                    new CreateLimitItemDetails(
                            category,
                            subCategory,
                            issueType,
                            name,
                            currentLimit,
                            currentUsage,
                            requestedLimit,
                            limitStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLimitItemDetails o) {
            Builder copiedBuilder =
                    category(o.getCategory())
                            .subCategory(o.getSubCategory())
                            .issueType(o.getIssueType())
                            .name(o.getName())
                            .currentLimit(o.getCurrentLimit())
                            .currentUsage(o.getCurrentUsage())
                            .requestedLimit(o.getRequestedLimit())
                            .limitStatus(o.getLimitStatus());

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
    public CreateLimitItemDetails(
            CreateCategoryDetails category,
            CreateSubCategoryDetails subCategory,
            CreateIssueTypeDetails issueType,
            String name,
            Integer currentLimit,
            Integer currentUsage,
            Integer requestedLimit,
            LimitStatus limitStatus) {
        super(category, subCategory, issueType, name);
        this.currentLimit = currentLimit;
        this.currentUsage = currentUsage;
        this.requestedLimit = requestedLimit;
        this.limitStatus = limitStatus;
    }

    /**
     * The limit of the resource currently available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentLimit")
    private final Integer currentLimit;

    /**
     * The limit of the resource currently available.
     * @return the value
     **/
    public Integer getCurrentLimit() {
        return currentLimit;
    }

    /**
     * The current usage of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentUsage")
    private final Integer currentUsage;

    /**
     * The current usage of the resource.
     * @return the value
     **/
    public Integer getCurrentUsage() {
        return currentUsage;
    }

    /**
     * Reserved for future use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestedLimit")
    private final Integer requestedLimit;

    /**
     * Reserved for future use.
     * @return the value
     **/
    public Integer getRequestedLimit() {
        return requestedLimit;
    }

    /**
     * The current status of the request.
     **/
    public enum LimitStatus {
        Approved("APPROVED"),
        PartiallyApproved("PARTIALLY_APPROVED"),
        NotApproved("NOT_APPROVED"),
        ;

        private final String value;
        private static java.util.Map<String, LimitStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (LimitStatus v : LimitStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        LimitStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LimitStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LimitStatus: " + key);
        }
    };
    /**
     * The current status of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limitStatus")
    private final LimitStatus limitStatus;

    /**
     * The current status of the request.
     * @return the value
     **/
    public LimitStatus getLimitStatus() {
        return limitStatus;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateLimitItemDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", currentLimit=").append(String.valueOf(this.currentLimit));
        sb.append(", currentUsage=").append(String.valueOf(this.currentUsage));
        sb.append(", requestedLimit=").append(String.valueOf(this.requestedLimit));
        sb.append(", limitStatus=").append(String.valueOf(this.limitStatus));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLimitItemDetails)) {
            return false;
        }

        CreateLimitItemDetails other = (CreateLimitItemDetails) o;
        return java.util.Objects.equals(this.currentLimit, other.currentLimit)
                && java.util.Objects.equals(this.currentUsage, other.currentUsage)
                && java.util.Objects.equals(this.requestedLimit, other.requestedLimit)
                && java.util.Objects.equals(this.limitStatus, other.limitStatus)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.currentLimit == null ? 43 : this.currentLimit.hashCode());
        result = (result * PRIME) + (this.currentUsage == null ? 43 : this.currentUsage.hashCode());
        result =
                (result * PRIME)
                        + (this.requestedLimit == null ? 43 : this.requestedLimit.hashCode());
        result = (result * PRIME) + (this.limitStatus == null ? 43 : this.limitStatus.hashCode());
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
