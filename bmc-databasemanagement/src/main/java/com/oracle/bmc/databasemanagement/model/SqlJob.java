/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the SQL job.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "jobType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlJob extends Job {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabasesDetails")
        private java.util.List<JobDatabase> managedDatabasesDetails;

        public Builder managedDatabasesDetails(
                java.util.List<JobDatabase> managedDatabasesDetails) {
            this.managedDatabasesDetails = managedDatabasesDetails;
            this.__explicitlySet__.add("managedDatabasesDetails");
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
        private ScheduleType scheduleType;

        public Builder scheduleType(ScheduleType scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonProperty("submissionErrorMessage")
        private String submissionErrorMessage;

        public Builder submissionErrorMessage(String submissionErrorMessage) {
            this.submissionErrorMessage = submissionErrorMessage;
            this.__explicitlySet__.add("submissionErrorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The type of SQL. This is a mandatory field for the EXECUTE_SQL operationType.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlType")
        private SqlType sqlType;

        /**
         * The type of SQL. This is a mandatory field for the EXECUTE_SQL operationType.
         * @param sqlType the value to set
         * @return this builder
         **/
        public Builder sqlType(SqlType sqlType) {
            this.sqlType = sqlType;
            this.__explicitlySet__.add("sqlType");
            return this;
        }
        /**
         * The SQL text to be executed in the job. This is a mandatory field for the EXECUTE_SQL operationType.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * The SQL text to be executed in the job. This is a mandatory field for the EXECUTE_SQL operationType.
         * @param sqlText the value to set
         * @return this builder
         **/
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }
        /**
         * The SQL operation type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        /**
         * The SQL operation type.
         * @param operationType the value to set
         * @return this builder
         **/
        public Builder operationType(OperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /**
         * The database user name used to execute the SQL job. If the job is being executed on a Managed Database Group,
         * then the user name should exist on all the databases in the group with the same password.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The database user name used to execute the SQL job. If the job is being executed on a Managed Database Group,
         * then the user name should exist on all the databases in the group with the same password.
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
         * The role of the database user. Indicates whether the database user is a normal user or sysdba.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * The role of the database user. Indicates whether the database user is a normal user or sysdba.
         * @param role the value to set
         * @return this builder
         **/
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlJob build() {
            SqlJob __instance__ =
                    new SqlJob(
                            id,
                            compartmentId,
                            name,
                            description,
                            managedDatabaseGroupId,
                            managedDatabaseId,
                            managedDatabasesDetails,
                            databaseSubType,
                            scheduleType,
                            lifecycleState,
                            timeout,
                            resultLocation,
                            scheduleDetails,
                            submissionErrorMessage,
                            timeCreated,
                            timeUpdated,
                            sqlType,
                            sqlText,
                            operationType,
                            userName,
                            role);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlJob o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .managedDatabaseGroupId(o.getManagedDatabaseGroupId())
                            .managedDatabaseId(o.getManagedDatabaseId())
                            .managedDatabasesDetails(o.getManagedDatabasesDetails())
                            .databaseSubType(o.getDatabaseSubType())
                            .scheduleType(o.getScheduleType())
                            .lifecycleState(o.getLifecycleState())
                            .timeout(o.getTimeout())
                            .resultLocation(o.getResultLocation())
                            .scheduleDetails(o.getScheduleDetails())
                            .submissionErrorMessage(o.getSubmissionErrorMessage())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .sqlType(o.getSqlType())
                            .sqlText(o.getSqlText())
                            .operationType(o.getOperationType())
                            .userName(o.getUserName())
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
    public SqlJob(
            String id,
            String compartmentId,
            String name,
            String description,
            String managedDatabaseGroupId,
            String managedDatabaseId,
            java.util.List<JobDatabase> managedDatabasesDetails,
            DatabaseSubType databaseSubType,
            ScheduleType scheduleType,
            LifecycleState lifecycleState,
            String timeout,
            JobExecutionResultLocation resultLocation,
            JobScheduleDetails scheduleDetails,
            String submissionErrorMessage,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            SqlType sqlType,
            String sqlText,
            OperationType operationType,
            String userName,
            Role role) {
        super(
                id,
                compartmentId,
                name,
                description,
                managedDatabaseGroupId,
                managedDatabaseId,
                managedDatabasesDetails,
                databaseSubType,
                scheduleType,
                lifecycleState,
                timeout,
                resultLocation,
                scheduleDetails,
                submissionErrorMessage,
                timeCreated,
                timeUpdated);
        this.sqlType = sqlType;
        this.sqlText = sqlText;
        this.operationType = operationType;
        this.userName = userName;
        this.role = role;
    }

    /**
     * The type of SQL. This is a mandatory field for the EXECUTE_SQL operationType.
     **/
    public enum SqlType {
        Query("QUERY"),
        Dml("DML"),
        Ddl("DDL"),
        Plsql("PLSQL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SqlType.class);

        private final String value;
        private static java.util.Map<String, SqlType> map;

        static {
            map = new java.util.HashMap<>();
            for (SqlType v : SqlType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SqlType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SqlType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SqlType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of SQL. This is a mandatory field for the EXECUTE_SQL operationType.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlType")
    private final SqlType sqlType;

    /**
     * The type of SQL. This is a mandatory field for the EXECUTE_SQL operationType.
     * @return the value
     **/
    public SqlType getSqlType() {
        return sqlType;
    }

    /**
     * The SQL text to be executed in the job. This is a mandatory field for the EXECUTE_SQL operationType.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * The SQL text to be executed in the job. This is a mandatory field for the EXECUTE_SQL operationType.
     * @return the value
     **/
    public String getSqlText() {
        return sqlText;
    }

    /**
     * The SQL operation type.
     **/
    public enum OperationType {
        ExecuteSql("EXECUTE_SQL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperationType.class);

        private final String value;
        private static java.util.Map<String, OperationType> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationType v : OperationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The SQL operation type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationType operationType;

    /**
     * The SQL operation type.
     * @return the value
     **/
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * The database user name used to execute the SQL job. If the job is being executed on a Managed Database Group,
     * then the user name should exist on all the databases in the group with the same password.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The database user name used to execute the SQL job. If the job is being executed on a Managed Database Group,
     * then the user name should exist on all the databases in the group with the same password.
     *
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * The role of the database user. Indicates whether the database user is a normal user or sysdba.
     **/
    public enum Role {
        Normal("NORMAL"),
        Sysdba("SYSDBA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Role.class);

        private final String value;
        private static java.util.Map<String, Role> map;

        static {
            map = new java.util.HashMap<>();
            for (Role v : Role.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Role(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Role create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Role', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The role of the database user. Indicates whether the database user is a normal user or sysdba.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * The role of the database user. Indicates whether the database user is a normal user or sysdba.
     * @return the value
     **/
    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlJob(");
        sb.append("super=").append(super.toString());
        sb.append(", sqlType=").append(String.valueOf(this.sqlType));
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", userName=").append(String.valueOf(this.userName));
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
        if (!(o instanceof SqlJob)) {
            return false;
        }

        SqlJob other = (SqlJob) o;
        return java.util.Objects.equals(this.sqlType, other.sqlType)
                && java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sqlType == null ? 43 : this.sqlType.hashCode());
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
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
