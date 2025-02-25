/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Specifies the details for an Anomaly Detection model trained with MSET.
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
    builder = ModelTrainingResults.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModelTrainingResults {
    @Deprecated
    @java.beans.ConstructorProperties({
        "fap",
        "multivariateFap",
        "isTrainingGoalAchieved",
        "warning",
        "signalDetails",
        "rowReductionDetails"
    })
    public ModelTrainingResults(
            Float fap,
            Float multivariateFap,
            Boolean isTrainingGoalAchieved,
            String warning,
            java.util.List<PerSignalDetails> signalDetails,
            RowReductionDetails rowReductionDetails) {
        super();
        this.fap = fap;
        this.multivariateFap = multivariateFap;
        this.isTrainingGoalAchieved = isTrainingGoalAchieved;
        this.warning = warning;
        this.signalDetails = signalDetails;
        this.rowReductionDetails = rowReductionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The final-achieved model accuracy metric on individual value level
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fap")
        private Float fap;

        /**
         * The final-achieved model accuracy metric on individual value level
         * @param fap the value to set
         * @return this builder
         **/
        public Builder fap(Float fap) {
            this.fap = fap;
            this.__explicitlySet__.add("fap");
            return this;
        }
        /**
         * The model accuracy metric on timestamp level.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("multivariateFap")
        private Float multivariateFap;

        /**
         * The model accuracy metric on timestamp level.
         * @param multivariateFap the value to set
         * @return this builder
         **/
        public Builder multivariateFap(Float multivariateFap) {
            this.multivariateFap = multivariateFap;
            this.__explicitlySet__.add("multivariateFap");
            return this;
        }
        /**
         * A boolean value to indicate if train goal/targetFap is achieved for trained model
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isTrainingGoalAchieved")
        private Boolean isTrainingGoalAchieved;

        /**
         * A boolean value to indicate if train goal/targetFap is achieved for trained model
         * @param isTrainingGoalAchieved the value to set
         * @return this builder
         **/
        public Builder isTrainingGoalAchieved(Boolean isTrainingGoalAchieved) {
            this.isTrainingGoalAchieved = isTrainingGoalAchieved;
            this.__explicitlySet__.add("isTrainingGoalAchieved");
            return this;
        }
        /**
         * A warning message to explain the reason when targetFap cannot be achieved for trained model
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("warning")
        private String warning;

        /**
         * A warning message to explain the reason when targetFap cannot be achieved for trained model
         * @param warning the value to set
         * @return this builder
         **/
        public Builder warning(String warning) {
            this.warning = warning;
            this.__explicitlySet__.add("warning");
            return this;
        }
        /**
         * The list of signal details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signalDetails")
        private java.util.List<PerSignalDetails> signalDetails;

        /**
         * The list of signal details.
         * @param signalDetails the value to set
         * @return this builder
         **/
        public Builder signalDetails(java.util.List<PerSignalDetails> signalDetails) {
            this.signalDetails = signalDetails;
            this.__explicitlySet__.add("signalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rowReductionDetails")
        private RowReductionDetails rowReductionDetails;

        public Builder rowReductionDetails(RowReductionDetails rowReductionDetails) {
            this.rowReductionDetails = rowReductionDetails;
            this.__explicitlySet__.add("rowReductionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelTrainingResults build() {
            ModelTrainingResults __instance__ =
                    new ModelTrainingResults(
                            fap,
                            multivariateFap,
                            isTrainingGoalAchieved,
                            warning,
                            signalDetails,
                            rowReductionDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelTrainingResults o) {
            Builder copiedBuilder =
                    fap(o.getFap())
                            .multivariateFap(o.getMultivariateFap())
                            .isTrainingGoalAchieved(o.getIsTrainingGoalAchieved())
                            .warning(o.getWarning())
                            .signalDetails(o.getSignalDetails())
                            .rowReductionDetails(o.getRowReductionDetails());

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
     * The final-achieved model accuracy metric on individual value level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fap")
    private final Float fap;

    /**
     * The final-achieved model accuracy metric on individual value level
     * @return the value
     **/
    public Float getFap() {
        return fap;
    }

    /**
     * The model accuracy metric on timestamp level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multivariateFap")
    private final Float multivariateFap;

    /**
     * The model accuracy metric on timestamp level.
     * @return the value
     **/
    public Float getMultivariateFap() {
        return multivariateFap;
    }

    /**
     * A boolean value to indicate if train goal/targetFap is achieved for trained model
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTrainingGoalAchieved")
    private final Boolean isTrainingGoalAchieved;

    /**
     * A boolean value to indicate if train goal/targetFap is achieved for trained model
     * @return the value
     **/
    public Boolean getIsTrainingGoalAchieved() {
        return isTrainingGoalAchieved;
    }

    /**
     * A warning message to explain the reason when targetFap cannot be achieved for trained model
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warning")
    private final String warning;

    /**
     * A warning message to explain the reason when targetFap cannot be achieved for trained model
     * @return the value
     **/
    public String getWarning() {
        return warning;
    }

    /**
     * The list of signal details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signalDetails")
    private final java.util.List<PerSignalDetails> signalDetails;

    /**
     * The list of signal details.
     * @return the value
     **/
    public java.util.List<PerSignalDetails> getSignalDetails() {
        return signalDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rowReductionDetails")
    private final RowReductionDetails rowReductionDetails;

    public RowReductionDetails getRowReductionDetails() {
        return rowReductionDetails;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ModelTrainingResults(");
        sb.append("fap=").append(String.valueOf(this.fap));
        sb.append(", multivariateFap=").append(String.valueOf(this.multivariateFap));
        sb.append(", isTrainingGoalAchieved=").append(String.valueOf(this.isTrainingGoalAchieved));
        sb.append(", warning=").append(String.valueOf(this.warning));
        sb.append(", signalDetails=").append(String.valueOf(this.signalDetails));
        sb.append(", rowReductionDetails=").append(String.valueOf(this.rowReductionDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelTrainingResults)) {
            return false;
        }

        ModelTrainingResults other = (ModelTrainingResults) o;
        return java.util.Objects.equals(this.fap, other.fap)
                && java.util.Objects.equals(this.multivariateFap, other.multivariateFap)
                && java.util.Objects.equals(
                        this.isTrainingGoalAchieved, other.isTrainingGoalAchieved)
                && java.util.Objects.equals(this.warning, other.warning)
                && java.util.Objects.equals(this.signalDetails, other.signalDetails)
                && java.util.Objects.equals(this.rowReductionDetails, other.rowReductionDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fap == null ? 43 : this.fap.hashCode());
        result =
                (result * PRIME)
                        + (this.multivariateFap == null ? 43 : this.multivariateFap.hashCode());
        result =
                (result * PRIME)
                        + (this.isTrainingGoalAchieved == null
                                ? 43
                                : this.isTrainingGoalAchieved.hashCode());
        result = (result * PRIME) + (this.warning == null ? 43 : this.warning.hashCode());
        result =
                (result * PRIME)
                        + (this.signalDetails == null ? 43 : this.signalDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.rowReductionDetails == null
                                ? 43
                                : this.rowReductionDetails.hashCode());
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
