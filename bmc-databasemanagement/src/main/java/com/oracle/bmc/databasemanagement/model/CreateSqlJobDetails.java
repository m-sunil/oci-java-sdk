/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details specific to the SQL job request.
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
    builder = CreateSqlJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "jobType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSqlJobDetails extends CreateJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroupId")
        private String managedDatabaseGroupId;

        public Builder managedDatabaseGroupId(String managedDatabaseGroupId) {
            this.managedDatabaseGroupId = managedDatabaseGroupId;
            this.__explicitlySet__.add("managedDatabaseGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseId")
        private String managedDatabaseId;

        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            this.__explicitlySet__.add("managedDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
        private DatabaseSubType databaseSubType;

        public Builder databaseSubType(DatabaseSubType databaseSubType) {
            this.databaseSubType = databaseSubType;
            this.__explicitlySet__.add("databaseSubType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private Job.ScheduleType scheduleType;

        public Builder scheduleType(Job.ScheduleType scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeout")
        private String timeout;

        public Builder timeout(String timeout) {
            this.timeout = timeout;
            this.__explicitlySet__.add("timeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resultLocation")
        private JobExecutionResultLocation resultLocation;

        public Builder resultLocation(JobExecutionResultLocation resultLocation) {
            this.resultLocation = resultLocation;
            this.__explicitlySet__.add("resultLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleDetails")
        private JobScheduleDetails scheduleDetails;

        public Builder scheduleDetails(JobScheduleDetails scheduleDetails) {
            this.scheduleDetails = scheduleDetails;
            this.__explicitlySet__.add("scheduleDetails");
            return this;
        }
        /**
         * The SQL text to be executed as part of the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * The SQL text to be executed as part of the job.
         * @param sqlText the value to set
         * @return this builder
         **/
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlType")
        private SqlJob.SqlType sqlType;

        public Builder sqlType(SqlJob.SqlType sqlType) {
            this.sqlType = sqlType;
            this.__explicitlySet__.add("sqlType");
            return this;
        }
        /**
         * The SQL operation type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private SqlJob.OperationType operationType;

        /**
         * The SQL operation type.
         * @param operationType the value to set
         * @return this builder
         **/
        public Builder operationType(SqlJob.OperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /**
         * The database user name used to execute the SQL job. If the job is being executed on a
         * Managed Database Group, then the user name should exist on all the databases in the
         * group with the same password.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The database user name used to execute the SQL job. If the job is being executed on a
         * Managed Database Group, then the user name should exist on all the databases in the
         * group with the same password.
         *
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * The password for the database user name used to execute the SQL job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password for the database user name used to execute the SQL job.
         * @param password the value to set
         * @return this builder
         **/
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the secret containing the user password.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the secret containing the user password.
         * @param secretId the value to set
         * @return this builder
         **/
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }
        /**
         * The role of the database user. Indicates whether the database user is a normal user or sysdba.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private SqlJob.Role role;

        /**
         * The role of the database user. Indicates whether the database user is a normal user or sysdba.
         * @param role the value to set
         * @return this builder
         **/
        public Builder role(SqlJob.Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSqlJobDetails build() {
            CreateSqlJobDetails __instance__ =
                    new CreateSqlJobDetails(
                            name,
                            description,
                            compartmentId,
                            managedDatabaseGroupId,
                            managedDatabaseId,
                            databaseSubType,
                            scheduleType,
                            timeout,
                            resultLocation,
                            scheduleDetails,
                            sqlText,
                            sqlType,
                            operationType,
                            userName,
                            password,
                            secretId,
                            role);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSqlJobDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .managedDatabaseGroupId(o.getManagedDatabaseGroupId())
                            .managedDatabaseId(o.getManagedDatabaseId())
                            .databaseSubType(o.getDatabaseSubType())
                            .scheduleType(o.getScheduleType())
                            .timeout(o.getTimeout())
                            .resultLocation(o.getResultLocation())
                            .scheduleDetails(o.getScheduleDetails())
                            .sqlText(o.getSqlText())
                            .sqlType(o.getSqlType())
                            .operationType(o.getOperationType())
                            .userName(o.getUserName())
                            .password(o.getPassword())
                            .secretId(o.getSecretId())
                            .role(o.getRole());

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
    public CreateSqlJobDetails(
            String name,
            String description,
            String compartmentId,
            String managedDatabaseGroupId,
            String managedDatabaseId,
            DatabaseSubType databaseSubType,
            Job.ScheduleType scheduleType,
            String timeout,
            JobExecutionResultLocation resultLocation,
            JobScheduleDetails scheduleDetails,
            String sqlText,
            SqlJob.SqlType sqlType,
            SqlJob.OperationType operationType,
            String userName,
            String password,
            String secretId,
            SqlJob.Role role) {
        super(
                name,
                description,
                compartmentId,
                managedDatabaseGroupId,
                managedDatabaseId,
                databaseSubType,
                scheduleType,
                timeout,
                resultLocation,
                scheduleDetails);
        this.sqlText = sqlText;
        this.sqlType = sqlType;
        this.operationType = operationType;
        this.userName = userName;
        this.password = password;
        this.secretId = secretId;
        this.role = role;
    }

    /**
     * The SQL text to be executed as part of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * The SQL text to be executed as part of the job.
     * @return the value
     **/
    public String getSqlText() {
        return sqlText;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sqlType")
    private final SqlJob.SqlType sqlType;

    public SqlJob.SqlType getSqlType() {
        return sqlType;
    }

    /**
     * The SQL operation type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final SqlJob.OperationType operationType;

    /**
     * The SQL operation type.
     * @return the value
     **/
    public SqlJob.OperationType getOperationType() {
        return operationType;
    }

    /**
     * The database user name used to execute the SQL job. If the job is being executed on a
     * Managed Database Group, then the user name should exist on all the databases in the
     * group with the same password.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The database user name used to execute the SQL job. If the job is being executed on a
     * Managed Database Group, then the user name should exist on all the databases in the
     * group with the same password.
     *
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * The password for the database user name used to execute the SQL job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password for the database user name used to execute the SQL job.
     * @return the value
     **/
    public String getPassword() {
        return password;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the secret containing the user password.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the secret containing the user password.
     * @return the value
     **/
    public String getSecretId() {
        return secretId;
    }

    /**
     * The role of the database user. Indicates whether the database user is a normal user or sysdba.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final SqlJob.Role role;

    /**
     * The role of the database user. Indicates whether the database user is a normal user or sysdba.
     * @return the value
     **/
    public SqlJob.Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateSqlJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(", sqlType=").append(String.valueOf(this.sqlType));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", password=").append(String.valueOf(this.password));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSqlJobDetails)) {
            return false;
        }

        CreateSqlJobDetails other = (CreateSqlJobDetails) o;
        return java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.sqlType, other.sqlType)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result = (result * PRIME) + (this.sqlType == null ? 43 : this.sqlType.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
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
