/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to remove a data file or temp file from the tablespace.
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
    builder = RemoveDataFileDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RemoveDataFileDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"credentialDetails", "fileType", "dataFile"})
    public RemoveDataFileDetails(
            TablespaceAdminCredentialDetails credentialDetails,
            FileType fileType,
            String dataFile) {
        super();
        this.credentialDetails = credentialDetails;
        this.fileType = fileType;
        this.dataFile = dataFile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private TablespaceAdminCredentialDetails credentialDetails;

        public Builder credentialDetails(TablespaceAdminCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }
        /**
         * Specifies whether the file is a data file or temp file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileType")
        private FileType fileType;

        /**
         * Specifies whether the file is a data file or temp file.
         *
         * @param fileType the value to set
         * @return this builder
         **/
        public Builder fileType(FileType fileType) {
            this.fileType = fileType;
            this.__explicitlySet__.add("fileType");
            return this;
        }
        /**
         * Name of the data file or temp file to be removed from the tablespace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataFile")
        private String dataFile;

        /**
         * Name of the data file or temp file to be removed from the tablespace.
         *
         * @param dataFile the value to set
         * @return this builder
         **/
        public Builder dataFile(String dataFile) {
            this.dataFile = dataFile;
            this.__explicitlySet__.add("dataFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveDataFileDetails build() {
            RemoveDataFileDetails __instance__ =
                    new RemoveDataFileDetails(credentialDetails, fileType, dataFile);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveDataFileDetails o) {
            Builder copiedBuilder =
                    credentialDetails(o.getCredentialDetails())
                            .fileType(o.getFileType())
                            .dataFile(o.getDataFile());

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

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final TablespaceAdminCredentialDetails credentialDetails;

    public TablespaceAdminCredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    /**
     * Specifies whether the file is a data file or temp file.
     *
     **/
    public enum FileType {
        Datafile("DATAFILE"),
        Tempfile("TEMPFILE"),
        ;

        private final String value;
        private static java.util.Map<String, FileType> map;

        static {
            map = new java.util.HashMap<>();
            for (FileType v : FileType.values()) {
                map.put(v.getValue(), v);
            }
        }

        FileType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FileType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid FileType: " + key);
        }
    };
    /**
     * Specifies whether the file is a data file or temp file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileType")
    private final FileType fileType;

    /**
     * Specifies whether the file is a data file or temp file.
     *
     * @return the value
     **/
    public FileType getFileType() {
        return fileType;
    }

    /**
     * Name of the data file or temp file to be removed from the tablespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataFile")
    private final String dataFile;

    /**
     * Name of the data file or temp file to be removed from the tablespace.
     *
     * @return the value
     **/
    public String getDataFile() {
        return dataFile;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RemoveDataFileDetails(");
        sb.append("credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", fileType=").append(String.valueOf(this.fileType));
        sb.append(", dataFile=").append(String.valueOf(this.dataFile));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveDataFileDetails)) {
            return false;
        }

        RemoveDataFileDetails other = (RemoveDataFileDetails) o;
        return java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.fileType, other.fileType)
                && java.util.Objects.equals(this.dataFile, other.dataFile)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result = (result * PRIME) + (this.fileType == null ? 43 : this.fileType.hashCode());
        result = (result * PRIME) + (this.dataFile == null ? 43 : this.dataFile.hashCode());
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
