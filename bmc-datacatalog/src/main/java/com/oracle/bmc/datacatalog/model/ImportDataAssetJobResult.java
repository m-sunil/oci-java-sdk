/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Information about a data asset import operation.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ImportDataAssetJobResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImportDataAssetJobResult {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dataAssetKey",
        "importJobDefinitionKey",
        "importJobKey",
        "importJobExecutionKey",
        "importJobExecutionStatus"
    })
    public ImportDataAssetJobResult(
            String dataAssetKey,
            String importJobDefinitionKey,
            String importJobKey,
            String importJobExecutionKey,
            JobExecutionState importJobExecutionStatus) {
        super();
        this.dataAssetKey = dataAssetKey;
        this.importJobDefinitionKey = importJobDefinitionKey;
        this.importJobKey = importJobKey;
        this.importJobExecutionKey = importJobExecutionKey;
        this.importJobExecutionStatus = importJobExecutionStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique key of the data asset on which import is triggered.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        /**
         * The unique key of the data asset on which import is triggered.
         * @param dataAssetKey the value to set
         * @return this builder
         **/
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }
        /**
         * The unique key of the job definition resource that is used for the import.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("importJobDefinitionKey")
        private String importJobDefinitionKey;

        /**
         * The unique key of the job definition resource that is used for the import.
         * @param importJobDefinitionKey the value to set
         * @return this builder
         **/
        public Builder importJobDefinitionKey(String importJobDefinitionKey) {
            this.importJobDefinitionKey = importJobDefinitionKey;
            this.__explicitlySet__.add("importJobDefinitionKey");
            return this;
        }
        /**
         * The unique key of the job policy for the import.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("importJobKey")
        private String importJobKey;

        /**
         * The unique key of the job policy for the import.
         * @param importJobKey the value to set
         * @return this builder
         **/
        public Builder importJobKey(String importJobKey) {
            this.importJobKey = importJobKey;
            this.__explicitlySet__.add("importJobKey");
            return this;
        }
        /**
         * The unique key of the parent job execution for which the log resource is created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("importJobExecutionKey")
        private String importJobExecutionKey;

        /**
         * The unique key of the parent job execution for which the log resource is created.
         * @param importJobExecutionKey the value to set
         * @return this builder
         **/
        public Builder importJobExecutionKey(String importJobExecutionKey) {
            this.importJobExecutionKey = importJobExecutionKey;
            this.__explicitlySet__.add("importJobExecutionKey");
            return this;
        }
        /**
         * The status of the import job execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("importJobExecutionStatus")
        private JobExecutionState importJobExecutionStatus;

        /**
         * The status of the import job execution.
         * @param importJobExecutionStatus the value to set
         * @return this builder
         **/
        public Builder importJobExecutionStatus(JobExecutionState importJobExecutionStatus) {
            this.importJobExecutionStatus = importJobExecutionStatus;
            this.__explicitlySet__.add("importJobExecutionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportDataAssetJobResult build() {
            ImportDataAssetJobResult __instance__ =
                    new ImportDataAssetJobResult(
                            dataAssetKey,
                            importJobDefinitionKey,
                            importJobKey,
                            importJobExecutionKey,
                            importJobExecutionStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportDataAssetJobResult o) {
            Builder copiedBuilder =
                    dataAssetKey(o.getDataAssetKey())
                            .importJobDefinitionKey(o.getImportJobDefinitionKey())
                            .importJobKey(o.getImportJobKey())
                            .importJobExecutionKey(o.getImportJobExecutionKey())
                            .importJobExecutionStatus(o.getImportJobExecutionStatus());

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
     * The unique key of the data asset on which import is triggered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    private final String dataAssetKey;

    /**
     * The unique key of the data asset on which import is triggered.
     * @return the value
     **/
    public String getDataAssetKey() {
        return dataAssetKey;
    }

    /**
     * The unique key of the job definition resource that is used for the import.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importJobDefinitionKey")
    private final String importJobDefinitionKey;

    /**
     * The unique key of the job definition resource that is used for the import.
     * @return the value
     **/
    public String getImportJobDefinitionKey() {
        return importJobDefinitionKey;
    }

    /**
     * The unique key of the job policy for the import.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importJobKey")
    private final String importJobKey;

    /**
     * The unique key of the job policy for the import.
     * @return the value
     **/
    public String getImportJobKey() {
        return importJobKey;
    }

    /**
     * The unique key of the parent job execution for which the log resource is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importJobExecutionKey")
    private final String importJobExecutionKey;

    /**
     * The unique key of the parent job execution for which the log resource is created.
     * @return the value
     **/
    public String getImportJobExecutionKey() {
        return importJobExecutionKey;
    }

    /**
     * The status of the import job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importJobExecutionStatus")
    private final JobExecutionState importJobExecutionStatus;

    /**
     * The status of the import job execution.
     * @return the value
     **/
    public JobExecutionState getImportJobExecutionStatus() {
        return importJobExecutionStatus;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ImportDataAssetJobResult(");
        sb.append("dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(", importJobDefinitionKey=").append(String.valueOf(this.importJobDefinitionKey));
        sb.append(", importJobKey=").append(String.valueOf(this.importJobKey));
        sb.append(", importJobExecutionKey=").append(String.valueOf(this.importJobExecutionKey));
        sb.append(", importJobExecutionStatus=")
                .append(String.valueOf(this.importJobExecutionStatus));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportDataAssetJobResult)) {
            return false;
        }

        ImportDataAssetJobResult other = (ImportDataAssetJobResult) o;
        return java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(
                        this.importJobDefinitionKey, other.importJobDefinitionKey)
                && java.util.Objects.equals(this.importJobKey, other.importJobKey)
                && java.util.Objects.equals(this.importJobExecutionKey, other.importJobExecutionKey)
                && java.util.Objects.equals(
                        this.importJobExecutionStatus, other.importJobExecutionStatus)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result =
                (result * PRIME)
                        + (this.importJobDefinitionKey == null
                                ? 43
                                : this.importJobDefinitionKey.hashCode());
        result = (result * PRIME) + (this.importJobKey == null ? 43 : this.importJobKey.hashCode());
        result =
                (result * PRIME)
                        + (this.importJobExecutionKey == null
                                ? 43
                                : this.importJobExecutionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.importJobExecutionStatus == null
                                ? 43
                                : this.importJobExecutionStatus.hashCode());
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
