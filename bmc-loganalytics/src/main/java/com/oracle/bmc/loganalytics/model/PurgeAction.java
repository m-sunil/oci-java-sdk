/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Purge action for scheduled task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PurgeAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PurgeAction extends Action {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Purge query string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("queryString")
        private String queryString;

        /**
         * Purge query string.
         * @param queryString the value to set
         * @return this builder
         **/
        public Builder queryString(String queryString) {
            this.queryString = queryString;
            this.__explicitlySet__.add("queryString");
            return this;
        }
        /**
         * the type of the log data to be purged
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private StorageDataType dataType;

        /**
         * the type of the log data to be purged
         * @param dataType the value to set
         * @return this builder
         **/
        public Builder dataType(StorageDataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /**
         * The duration of data to be retained, which is used to
         * calculate the timeDataEnded when the task fires.
         * The value should be negative.
         * Purge duration in ISO 8601 extended format as described in
         * https://en.wikipedia.org/wiki/ISO_8601#Durations.
         * The largest supported unit is D, e.g. -P365D (not -P1Y) or -P14D (not -P2W).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("purgeDuration")
        private String purgeDuration;

        /**
         * The duration of data to be retained, which is used to
         * calculate the timeDataEnded when the task fires.
         * The value should be negative.
         * Purge duration in ISO 8601 extended format as described in
         * https://en.wikipedia.org/wiki/ISO_8601#Durations.
         * The largest supported unit is D, e.g. -P365D (not -P1Y) or -P14D (not -P2W).
         *
         * @param purgeDuration the value to set
         * @return this builder
         **/
        public Builder purgeDuration(String purgeDuration) {
            this.purgeDuration = purgeDuration;
            this.__explicitlySet__.add("purgeDuration");
            return this;
        }
        /**
         * the compartment OCID under which the data will be purged
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("purgeCompartmentId")
        private String purgeCompartmentId;

        /**
         * the compartment OCID under which the data will be purged
         * @param purgeCompartmentId the value to set
         * @return this builder
         **/
        public Builder purgeCompartmentId(String purgeCompartmentId) {
            this.purgeCompartmentId = purgeCompartmentId;
            this.__explicitlySet__.add("purgeCompartmentId");
            return this;
        }
        /**
         * if true, purge child compartments data
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
        private Boolean compartmentIdInSubtree;

        /**
         * if true, purge child compartments data
         * @param compartmentIdInSubtree the value to set
         * @return this builder
         **/
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            this.__explicitlySet__.add("compartmentIdInSubtree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PurgeAction build() {
            PurgeAction __instance__ =
                    new PurgeAction(
                            queryString,
                            dataType,
                            purgeDuration,
                            purgeCompartmentId,
                            compartmentIdInSubtree);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PurgeAction o) {
            Builder copiedBuilder =
                    queryString(o.getQueryString())
                            .dataType(o.getDataType())
                            .purgeDuration(o.getPurgeDuration())
                            .purgeCompartmentId(o.getPurgeCompartmentId())
                            .compartmentIdInSubtree(o.getCompartmentIdInSubtree());

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
    public PurgeAction(
            String queryString,
            StorageDataType dataType,
            String purgeDuration,
            String purgeCompartmentId,
            Boolean compartmentIdInSubtree) {
        super();
        this.queryString = queryString;
        this.dataType = dataType;
        this.purgeDuration = purgeDuration;
        this.purgeCompartmentId = purgeCompartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
    }

    /**
     * Purge query string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryString")
    private final String queryString;

    /**
     * Purge query string.
     * @return the value
     **/
    public String getQueryString() {
        return queryString;
    }

    /**
     * the type of the log data to be purged
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final StorageDataType dataType;

    /**
     * the type of the log data to be purged
     * @return the value
     **/
    public StorageDataType getDataType() {
        return dataType;
    }

    /**
     * The duration of data to be retained, which is used to
     * calculate the timeDataEnded when the task fires.
     * The value should be negative.
     * Purge duration in ISO 8601 extended format as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations.
     * The largest supported unit is D, e.g. -P365D (not -P1Y) or -P14D (not -P2W).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purgeDuration")
    private final String purgeDuration;

    /**
     * The duration of data to be retained, which is used to
     * calculate the timeDataEnded when the task fires.
     * The value should be negative.
     * Purge duration in ISO 8601 extended format as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations.
     * The largest supported unit is D, e.g. -P365D (not -P1Y) or -P14D (not -P2W).
     *
     * @return the value
     **/
    public String getPurgeDuration() {
        return purgeDuration;
    }

    /**
     * the compartment OCID under which the data will be purged
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purgeCompartmentId")
    private final String purgeCompartmentId;

    /**
     * the compartment OCID under which the data will be purged
     * @return the value
     **/
    public String getPurgeCompartmentId() {
        return purgeCompartmentId;
    }

    /**
     * if true, purge child compartments data
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    private final Boolean compartmentIdInSubtree;

    /**
     * if true, purge child compartments data
     * @return the value
     **/
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PurgeAction(");
        sb.append("super=").append(super.toString());
        sb.append(", queryString=").append(String.valueOf(this.queryString));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", purgeDuration=").append(String.valueOf(this.purgeDuration));
        sb.append(", purgeCompartmentId=").append(String.valueOf(this.purgeCompartmentId));
        sb.append(", compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PurgeAction)) {
            return false;
        }

        PurgeAction other = (PurgeAction) o;
        return java.util.Objects.equals(this.queryString, other.queryString)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.purgeDuration, other.purgeDuration)
                && java.util.Objects.equals(this.purgeCompartmentId, other.purgeCompartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.queryString == null ? 43 : this.queryString.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result =
                (result * PRIME)
                        + (this.purgeDuration == null ? 43 : this.purgeDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.purgeCompartmentId == null
                                ? 43
                                : this.purgeCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
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
