/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to create an Oracle Autonomous Database.
 * <p>
 **Notes:**
 * - To specify OCPU core count, you must use either {@code ocpuCount} or {@code cpuCoreCount}. You cannot use both parameters at the same time.
 * - To specify a storage allocation, you must use  either {@code dataStorageSizeInGBs} or {@code dataStorageSizeInTBs}.
 * - See the individual parameter discriptions for more information on the OCPU and storage value parameters.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source",
    defaultImpl = CreateAutonomousDatabaseBase.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateAutonomousDatabaseCloneDetails.class,
        name = "DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateRefreshableAutonomousDatabaseCloneDetails.class,
        name = "CLONE_TO_REFRESHABLE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateAutonomousDatabaseFromBackupDetails.class,
        name = "BACKUP_FROM_ID"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateAutonomousDatabaseFromBackupTimestampDetails.class,
        name = "BACKUP_FROM_TIMESTAMP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateCrossRegionAutonomousDatabaseDataGuardDetails.class,
        name = "CROSS_REGION_DATAGUARD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateAutonomousDatabaseDetails.class,
        name = "NONE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateAutonomousDatabaseBase {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "characterSet",
        "ncharacterSet",
        "dbName",
        "cpuCoreCount",
        "ocpuCount",
        "dbWorkload",
        "dataStorageSizeInTBs",
        "dataStorageSizeInGBs",
        "isFreeTier",
        "kmsKeyId",
        "vaultId",
        "adminPassword",
        "displayName",
        "licenseModel",
        "isPreviewVersionWithServiceTermsAccepted",
        "isAutoScalingEnabled",
        "isDedicated",
        "autonomousContainerDatabaseId",
        "isAccessControlEnabled",
        "whitelistedIps",
        "arePrimaryWhitelistedIpsUsed",
        "standbyWhitelistedIps",
        "isDataGuardEnabled",
        "isLocalDataGuardEnabled",
        "subnetId",
        "nsgIds",
        "privateEndpointLabel",
        "freeformTags",
        "definedTags",
        "dbVersion",
        "customerContacts",
        "isMtlsConnectionRequired",
        "autonomousMaintenanceScheduleType",
        "scheduledOperations",
        "isAutoScalingForStorageEnabled",
        "maxCpuCoreCount",
        "databaseEdition"
    })
    protected CreateAutonomousDatabaseBase(
            String compartmentId,
            String characterSet,
            String ncharacterSet,
            String dbName,
            Integer cpuCoreCount,
            Float ocpuCount,
            DbWorkload dbWorkload,
            Integer dataStorageSizeInTBs,
            Integer dataStorageSizeInGBs,
            Boolean isFreeTier,
            String kmsKeyId,
            String vaultId,
            String adminPassword,
            String displayName,
            LicenseModel licenseModel,
            Boolean isPreviewVersionWithServiceTermsAccepted,
            Boolean isAutoScalingEnabled,
            Boolean isDedicated,
            String autonomousContainerDatabaseId,
            Boolean isAccessControlEnabled,
            java.util.List<String> whitelistedIps,
            Boolean arePrimaryWhitelistedIpsUsed,
            java.util.List<String> standbyWhitelistedIps,
            Boolean isDataGuardEnabled,
            Boolean isLocalDataGuardEnabled,
            String subnetId,
            java.util.List<String> nsgIds,
            String privateEndpointLabel,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String dbVersion,
            java.util.List<CustomerContact> customerContacts,
            Boolean isMtlsConnectionRequired,
            AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType,
            java.util.List<ScheduledOperationDetails> scheduledOperations,
            Boolean isAutoScalingForStorageEnabled,
            Integer maxCpuCoreCount,
            AutonomousDatabaseSummary.DatabaseEdition databaseEdition) {
        super();
        this.compartmentId = compartmentId;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.dbName = dbName;
        this.cpuCoreCount = cpuCoreCount;
        this.ocpuCount = ocpuCount;
        this.dbWorkload = dbWorkload;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.isFreeTier = isFreeTier;
        this.kmsKeyId = kmsKeyId;
        this.vaultId = vaultId;
        this.adminPassword = adminPassword;
        this.displayName = displayName;
        this.licenseModel = licenseModel;
        this.isPreviewVersionWithServiceTermsAccepted = isPreviewVersionWithServiceTermsAccepted;
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        this.isDedicated = isDedicated;
        this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
        this.isAccessControlEnabled = isAccessControlEnabled;
        this.whitelistedIps = whitelistedIps;
        this.arePrimaryWhitelistedIpsUsed = arePrimaryWhitelistedIpsUsed;
        this.standbyWhitelistedIps = standbyWhitelistedIps;
        this.isDataGuardEnabled = isDataGuardEnabled;
        this.isLocalDataGuardEnabled = isLocalDataGuardEnabled;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.privateEndpointLabel = privateEndpointLabel;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.dbVersion = dbVersion;
        this.customerContacts = customerContacts;
        this.isMtlsConnectionRequired = isMtlsConnectionRequired;
        this.autonomousMaintenanceScheduleType = autonomousMaintenanceScheduleType;
        this.scheduledOperations = scheduledOperations;
        this.isAutoScalingForStorageEnabled = isAutoScalingForStorageEnabled;
        this.maxCpuCoreCount = maxCpuCoreCount;
        this.databaseEdition = databaseEdition;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment of the Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment of the Autonomous Database.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The character set for the autonomous database.  The default is AL32UTF8. Allowed values for an Autonomous Database on shared infrastructure as as returned by [List Autonomous Database Character Sets](https://docs.cloud.oracle.com/autonomousDatabaseCharacterSets)
     * <p>
     * For an Autonomous Database on dedicated infrastructure, the allowed values are:
     * <p>
     * AL32UTF8, AR8ADOS710, AR8ADOS720, AR8APTEC715, AR8ARABICMACS, AR8ASMO8X, AR8ISO8859P6, AR8MSWIN1256, AR8MUSSAD768, AR8NAFITHA711, AR8NAFITHA721, AR8SAKHR706, AR8SAKHR707, AZ8ISO8859P9E, BG8MSWIN, BG8PC437S, BLT8CP921, BLT8ISO8859P13, BLT8MSWIN1257, BLT8PC775, BN8BSCII, CDN8PC863, CEL8ISO8859P14, CL8ISO8859P5, CL8ISOIR111, CL8KOI8R, CL8KOI8U, CL8MACCYRILLICS, CL8MSWIN1251, EE8ISO8859P2, EE8MACCES, EE8MACCROATIANS, EE8MSWIN1250, EE8PC852, EL8DEC, EL8ISO8859P7, EL8MACGREEKS, EL8MSWIN1253, EL8PC437S, EL8PC851, EL8PC869, ET8MSWIN923, HU8ABMOD, HU8CWI2, IN8ISCII, IS8PC861, IW8ISO8859P8, IW8MACHEBREWS, IW8MSWIN1255, IW8PC1507, JA16EUC, JA16EUCTILDE, JA16SJIS, JA16SJISTILDE, JA16VMS, KO16KSC5601, KO16KSCCS, KO16MSWIN949, LA8ISO6937, LA8PASSPORT, LT8MSWIN921, LT8PC772, LT8PC774, LV8PC1117, LV8PC8LR, LV8RST104090, N8PC865, NE8ISO8859P10, NEE8ISO8859P4, RU8BESTA, RU8PC855, RU8PC866, SE8ISO8859P3, TH8MACTHAIS, TH8TISASCII, TR8DEC, TR8MACTURKISHS, TR8MSWIN1254, TR8PC857, US7ASCII, US8PC437, UTF8, VN8MSWIN1258, VN8VN3, WE8DEC, WE8DG, WE8ISO8859P1, WE8ISO8859P15, WE8ISO8859P9, WE8MACROMAN8S, WE8MSWIN1252, WE8NCR4970, WE8NEXTSTEP, WE8PC850, WE8PC858, WE8PC860, WE8ROMAN8, ZHS16CGB231280, ZHS16GBK, ZHT16BIG5, ZHT16CCDC, ZHT16DBT, ZHT16HKSCS, ZHT16MSWIN950, ZHT32EUC, ZHT32SOPS, ZHT32TRIS
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    /**
     * The character set for the autonomous database.  The default is AL32UTF8. Allowed values for an Autonomous Database on shared infrastructure as as returned by [List Autonomous Database Character Sets](https://docs.cloud.oracle.com/autonomousDatabaseCharacterSets)
     * <p>
     * For an Autonomous Database on dedicated infrastructure, the allowed values are:
     * <p>
     * AL32UTF8, AR8ADOS710, AR8ADOS720, AR8APTEC715, AR8ARABICMACS, AR8ASMO8X, AR8ISO8859P6, AR8MSWIN1256, AR8MUSSAD768, AR8NAFITHA711, AR8NAFITHA721, AR8SAKHR706, AR8SAKHR707, AZ8ISO8859P9E, BG8MSWIN, BG8PC437S, BLT8CP921, BLT8ISO8859P13, BLT8MSWIN1257, BLT8PC775, BN8BSCII, CDN8PC863, CEL8ISO8859P14, CL8ISO8859P5, CL8ISOIR111, CL8KOI8R, CL8KOI8U, CL8MACCYRILLICS, CL8MSWIN1251, EE8ISO8859P2, EE8MACCES, EE8MACCROATIANS, EE8MSWIN1250, EE8PC852, EL8DEC, EL8ISO8859P7, EL8MACGREEKS, EL8MSWIN1253, EL8PC437S, EL8PC851, EL8PC869, ET8MSWIN923, HU8ABMOD, HU8CWI2, IN8ISCII, IS8PC861, IW8ISO8859P8, IW8MACHEBREWS, IW8MSWIN1255, IW8PC1507, JA16EUC, JA16EUCTILDE, JA16SJIS, JA16SJISTILDE, JA16VMS, KO16KSC5601, KO16KSCCS, KO16MSWIN949, LA8ISO6937, LA8PASSPORT, LT8MSWIN921, LT8PC772, LT8PC774, LV8PC1117, LV8PC8LR, LV8RST104090, N8PC865, NE8ISO8859P10, NEE8ISO8859P4, RU8BESTA, RU8PC855, RU8PC866, SE8ISO8859P3, TH8MACTHAIS, TH8TISASCII, TR8DEC, TR8MACTURKISHS, TR8MSWIN1254, TR8PC857, US7ASCII, US8PC437, UTF8, VN8MSWIN1258, VN8VN3, WE8DEC, WE8DG, WE8ISO8859P1, WE8ISO8859P15, WE8ISO8859P9, WE8MACROMAN8S, WE8MSWIN1252, WE8NCR4970, WE8NEXTSTEP, WE8PC850, WE8PC858, WE8PC860, WE8ROMAN8, ZHS16CGB231280, ZHS16GBK, ZHT16BIG5, ZHT16CCDC, ZHT16DBT, ZHT16HKSCS, ZHT16MSWIN950, ZHT32EUC, ZHT32SOPS, ZHT32TRIS
     *
     * @return the value
     **/
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * The character set for the Autonomous Database.  The default is AL32UTF8. Use [List Autonomous Database Character Sets](https://docs.cloud.oracle.com/autonomousDatabaseCharacterSets) to list the allowed values for an Autonomous Database on shared Exadata infrastructure.
     * For an Autonomous Database on dedicated Exadata infrastructure, the allowed values are:
     * AL16UTF16 or UTF8.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    /**
     * The character set for the Autonomous Database.  The default is AL32UTF8. Use [List Autonomous Database Character Sets](https://docs.cloud.oracle.com/autonomousDatabaseCharacterSets) to list the allowed values for an Autonomous Database on shared Exadata infrastructure.
     * For an Autonomous Database on dedicated Exadata infrastructure, the allowed values are:
     * AL16UTF16 or UTF8.
     *
     * @return the value
     **/
    public String getNcharacterSet() {
        return ncharacterSet;
    }

    /**
     * The database name. The name must begin with an alphabetic character and can contain a maximum of 14 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * The database name. The name must begin with an alphabetic character and can contain a maximum of 14 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy.
     * @return the value
     **/
    public String getDbName() {
        return dbName;
    }

    /**
     * The number of OCPU cores to be made available to the database. For Autonomous Databases on dedicated Exadata infrastructure, the maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code ocpuCount} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of OCPU cores to be made available to the database. For Autonomous Databases on dedicated Exadata infrastructure, the maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code ocpuCount} parameter.
     *
     * @return the value
     **/
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The number of OCPU cores to be made available to the database.
     * <p>
     * The following points apply:
     * - For Autonomous Databases on dedicated Exadata infrastructure, to provision less than 1 core, enter a fractional value in an increment of 0.1. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. (Note that fractional OCPU values are not supported for Autonomous Databasese on shared Exadata infrastructure.)
     * - To provision 1 or more cores, you must enter an integer between 1 and the maximum number of cores available for the infrastructure shape. For example, you can provision 2 cores or 3 cores, but not 2.5 cores. This applies to Autonomous Databases on both shared and dedicated Exadata infrastructure.
     * <p>
     * For Autonomous Databases on dedicated Exadata infrastructure, the maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Float ocpuCount;

    /**
     * The number of OCPU cores to be made available to the database.
     * <p>
     * The following points apply:
     * - For Autonomous Databases on dedicated Exadata infrastructure, to provision less than 1 core, enter a fractional value in an increment of 0.1. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. (Note that fractional OCPU values are not supported for Autonomous Databasese on shared Exadata infrastructure.)
     * - To provision 1 or more cores, you must enter an integer between 1 and the maximum number of cores available for the infrastructure shape. For example, you can provision 2 cores or 3 cores, but not 2.5 cores. This applies to Autonomous Databases on both shared and dedicated Exadata infrastructure.
     * <p>
     * For Autonomous Databases on dedicated Exadata infrastructure, the maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
     *
     * @return the value
     **/
    public Float getOcpuCount() {
        return ocpuCount;
    }

    /**
     * The Autonomous Database workload type. The following values are valid:
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     *
     **/
    public enum DbWorkload {
        Oltp("OLTP"),
        Dw("DW"),
        Ajd("AJD"),
        Apex("APEX"),
        ;

        private final String value;
        private static java.util.Map<String, DbWorkload> map;

        static {
            map = new java.util.HashMap<>();
            for (DbWorkload v : DbWorkload.values()) {
                map.put(v.getValue(), v);
            }
        }

        DbWorkload(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DbWorkload create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DbWorkload: " + key);
        }
    };
    /**
     * The Autonomous Database workload type. The following values are valid:
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    private final DbWorkload dbWorkload;

    /**
     * The Autonomous Database workload type. The following values are valid:
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     *
     * @return the value
     **/
    public DbWorkload getDbWorkload() {
        return dbWorkload;
    }

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database. This storage can later be scaled up if needed. For Autonomous Databases on dedicated Exadata infrastructure, the maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code dataStorageSizeInGBs} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Integer dataStorageSizeInTBs;

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database. This storage can later be scaled up if needed. For Autonomous Databases on dedicated Exadata infrastructure, the maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code dataStorageSizeInGBs} parameter.
     *
     * @return the value
     **/
    public Integer getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /**
     * The size, in gigabytes, of the data volume that will be created and attached to the database. This storage can later be scaled up if needed. The maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Notes**
     * - This parameter is only supported for dedicated Exadata infrastructure.
     * - This parameter cannot be used with the {@code dataStorageSizeInTBs} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * The size, in gigabytes, of the data volume that will be created and attached to the database. This storage can later be scaled up if needed. The maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Notes**
     * - This parameter is only supported for dedicated Exadata infrastructure.
     * - This parameter cannot be used with the {@code dataStorageSizeInTBs} parameter.
     *
     * @return the value
     **/
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * Indicates if this is an Always Free resource. The default value is false. Note that Always Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free databases, memory and CPU cannot be scaled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
    private final Boolean isFreeTier;

    /**
     * Indicates if this is an Always Free resource. The default value is false. Note that Always Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free databases, memory and CPU cannot be scaled.
     *
     * @return the value
     **/
    public Boolean getIsFreeTier() {
        return isFreeTier;
    }

    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * **Important** The {@code adminPassword} must be specified for all Autonomous Databases except for refreshable clones. The password must be between 12 and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol (") or the username "admin", regardless of casing.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * **Important** The {@code adminPassword} must be specified for all Autonomous Databases except for refreshable clones. The password must be between 12 and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol (") or the username "admin", regardless of casing.
     *
     * @return the value
     **/
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * The user-friendly name for the Autonomous Database. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous Database. The name does not have to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     *
     **/
    public enum LicenseModel {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),
        ;

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                map.put(v.getValue(), v);
            }
        }

        LicenseModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LicenseModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LicenseModel: " + key);
        }
    };
    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * If set to {@code TRUE}, indicates that an Autonomous Database preview version is being provisioned, and that the preview version's terms of service have been accepted. Note that preview version software is only available for databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPreviewVersionWithServiceTermsAccepted")
    private final Boolean isPreviewVersionWithServiceTermsAccepted;

    /**
     * If set to {@code TRUE}, indicates that an Autonomous Database preview version is being provisioned, and that the preview version's terms of service have been accepted. Note that preview version software is only available for databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
     *
     * @return the value
     **/
    public Boolean getIsPreviewVersionWithServiceTermsAccepted() {
        return isPreviewVersionWithServiceTermsAccepted;
    }

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database OCPU core count. The default value is {@code FALSE}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    private final Boolean isAutoScalingEnabled;

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database OCPU core count. The default value is {@code FALSE}.
     *
     * @return the value
     **/
    public Boolean getIsAutoScalingEnabled() {
        return isAutoScalingEnabled;
    }

    /**
     * True if the database is on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
    private final Boolean isDedicated;

    /**
     * True if the database is on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
     *
     * @return the value
     **/
    public Boolean getIsDedicated() {
        return isDedicated;
    }

    /**
     * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseId")
    private final String autonomousContainerDatabaseId;

    /**
     * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public String getAutonomousContainerDatabaseId() {
        return autonomousContainerDatabaseId;
    }

    /**
     * Indicates if the database-level access control is enabled.
     * If disabled, database access is defined by the network security rules.
     * If enabled, database access is restricted to the IP addresses defined by the rules specified with the {@code whitelistedIps} property. While specifying {@code whitelistedIps} rules is optional,
     *  if database-level access control is enabled and no rules are specified, the database will become inaccessible. The rules can be added later using the {@code UpdateAutonomousDatabase} API operation or edit option in console.
     * When creating a database clone, the desired access control setting should be specified. By default, database-level access control will be disabled for the clone.
     * <p>
     * This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer platform.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlEnabled")
    private final Boolean isAccessControlEnabled;

    /**
     * Indicates if the database-level access control is enabled.
     * If disabled, database access is defined by the network security rules.
     * If enabled, database access is restricted to the IP addresses defined by the rules specified with the {@code whitelistedIps} property. While specifying {@code whitelistedIps} rules is optional,
     *  if database-level access control is enabled and no rules are specified, the database will become inaccessible. The rules can be added later using the {@code UpdateAutonomousDatabase} API operation or edit option in console.
     * When creating a database clone, the desired access control setting should be specified. By default, database-level access control will be disabled for the clone.
     * <p>
     * This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer platform.
     *
     * @return the value
     **/
    public Boolean getIsAccessControlEnabled() {
        return isAccessControlEnabled;
    }

    /**
     * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * <p>
     * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
    private final java.util.List<String> whitelistedIps;

    /**
     * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * <p>
     * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     *
     * @return the value
     **/
    public java.util.List<String> getWhitelistedIps() {
        return whitelistedIps;
    }

    /**
     * This field will be null if the Autonomous Database is not Data Guard enabled or Access Control is disabled.
     * It's value would be {@code TRUE} if Autonomous Database is Data Guard enabled and Access Control is enabled and if the Autonomous Database uses primary IP access control list (ACL) for standby.
     * It's value would be {@code FALSE} if Autonomous Database is Data Guard enabled and Access Control is enabled and if the Autonomous Database uses different IP access control list (ACL) for standby compared to primary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arePrimaryWhitelistedIpsUsed")
    private final Boolean arePrimaryWhitelistedIpsUsed;

    /**
     * This field will be null if the Autonomous Database is not Data Guard enabled or Access Control is disabled.
     * It's value would be {@code TRUE} if Autonomous Database is Data Guard enabled and Access Control is enabled and if the Autonomous Database uses primary IP access control list (ACL) for standby.
     * It's value would be {@code FALSE} if Autonomous Database is Data Guard enabled and Access Control is enabled and if the Autonomous Database uses different IP access control list (ACL) for standby compared to primary.
     *
     * @return the value
     **/
    public Boolean getArePrimaryWhitelistedIpsUsed() {
        return arePrimaryWhitelistedIpsUsed;
    }

    /**
     * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * <p>
     * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("standbyWhitelistedIps")
    private final java.util.List<String> standbyWhitelistedIps;

    /**
     * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * <p>
     * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     *
     * @return the value
     **/
    public java.util.List<String> getStandbyWhitelistedIps() {
        return standbyWhitelistedIps;
    }

    /**
     * **Deprecated.** Indicates whether the Autonomous Database has local (in-region) Data Guard enabled. Not applicable to cross-region Autonomous Data Guard associations, or to Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
    private final Boolean isDataGuardEnabled;

    /**
     * **Deprecated.** Indicates whether the Autonomous Database has local (in-region) Data Guard enabled. Not applicable to cross-region Autonomous Data Guard associations, or to Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     *
     * @return the value
     **/
    public Boolean getIsDataGuardEnabled() {
        return isDataGuardEnabled;
    }

    /**
     * Indicates whether the Autonomous Database has local (in-region) Data Guard enabled. Not applicable to cross-region Autonomous Data Guard associations, or to Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLocalDataGuardEnabled")
    private final Boolean isLocalDataGuardEnabled;

    /**
     * Indicates whether the Autonomous Database has local (in-region) Data Guard enabled. Not applicable to cross-region Autonomous Data Guard associations, or to Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     * @return the value
     **/
    public Boolean getIsLocalDataGuardEnabled() {
        return isLocalDataGuardEnabled;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet the resource is associated with.
     * <p>
     **Subnet Restrictions:**
     * - For bare metal DB systems and for single node virtual machine DB systems, do not use a subnet that overlaps with 192.168.16.16/28.
     * - For Exadata and virtual machine 2-node RAC systems, do not use a subnet that overlaps with 192.168.128.0/20.
     * - For Autonomous Database, setting this will disable public secure access to the database.
     * <p>
     * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
     * Specifying an overlapping subnet will cause the private interconnect to malfunction.
     * This restriction applies to both the client subnet and the backup subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet the resource is associated with.
     * <p>
     **Subnet Restrictions:**
     * - For bare metal DB systems and for single node virtual machine DB systems, do not use a subnet that overlaps with 192.168.16.16/28.
     * - For Exadata and virtual machine 2-node RAC systems, do not use a subnet that overlaps with 192.168.128.0/20.
     * - For Autonomous Database, setting this will disable public secure access to the database.
     * <p>
     * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
     * Specifying an overlapping subnet will cause the private interconnect to malfunction.
     * This restriction applies to both the client subnet and the backup subnet.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * The private endpoint label for the resource. Setting this to an empty string, after the private endpoint database gets created, will change the same private endpoint database to the public endpoint database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointLabel")
    private final String privateEndpointLabel;

    /**
     * The private endpoint label for the resource. Setting this to an empty string, after the private endpoint database gets created, will change the same private endpoint database to the public endpoint database.
     * @return the value
     **/
    public String getPrivateEndpointLabel() {
        return privateEndpointLabel;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A valid Oracle Database version for Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * A valid Oracle Database version for Autonomous Database.
     * @return the value
     **/
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * Customer Contacts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    private final java.util.List<CustomerContact> customerContacts;

    /**
     * Customer Contacts.
     * @return the value
     **/
    public java.util.List<CustomerContact> getCustomerContacts() {
        return customerContacts;
    }

    /**
     * Indicates whether the Autonomous Database requires mTLS connections.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
    private final Boolean isMtlsConnectionRequired;

    /**
     * Indicates whether the Autonomous Database requires mTLS connections.
     * @return the value
     **/
    public Boolean getIsMtlsConnectionRequired() {
        return isMtlsConnectionRequired;
    }

    /**
     * The maintenance schedule type of the Autonomous Database on shared Exadata infrastructure. The EARLY maintenance schedule of this Autonomous Database
     * follows a schedule that applies patches prior to the REGULAR schedule.The REGULAR maintenance schedule of this Autonomous Database follows the normal cycle.
     *
     **/
    public enum AutonomousMaintenanceScheduleType {
        Early("EARLY"),
        Regular("REGULAR"),
        ;

        private final String value;
        private static java.util.Map<String, AutonomousMaintenanceScheduleType> map;

        static {
            map = new java.util.HashMap<>();
            for (AutonomousMaintenanceScheduleType v : AutonomousMaintenanceScheduleType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AutonomousMaintenanceScheduleType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutonomousMaintenanceScheduleType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AutonomousMaintenanceScheduleType: " + key);
        }
    };
    /**
     * The maintenance schedule type of the Autonomous Database on shared Exadata infrastructure. The EARLY maintenance schedule of this Autonomous Database
     * follows a schedule that applies patches prior to the REGULAR schedule.The REGULAR maintenance schedule of this Autonomous Database follows the normal cycle.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousMaintenanceScheduleType")
    private final AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType;

    /**
     * The maintenance schedule type of the Autonomous Database on shared Exadata infrastructure. The EARLY maintenance schedule of this Autonomous Database
     * follows a schedule that applies patches prior to the REGULAR schedule.The REGULAR maintenance schedule of this Autonomous Database follows the normal cycle.
     *
     * @return the value
     **/
    public AutonomousMaintenanceScheduleType getAutonomousMaintenanceScheduleType() {
        return autonomousMaintenanceScheduleType;
    }

    /**
     * list of scheduled operations
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledOperations")
    private final java.util.List<ScheduledOperationDetails> scheduledOperations;

    /**
     * list of scheduled operations
     * @return the value
     **/
    public java.util.List<ScheduledOperationDetails> getScheduledOperations() {
        return scheduledOperations;
    }

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database storage. The default value is {@code FALSE}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingForStorageEnabled")
    private final Boolean isAutoScalingForStorageEnabled;

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database storage. The default value is {@code FALSE}.
     *
     * @return the value
     **/
    public Boolean getIsAutoScalingForStorageEnabled() {
        return isAutoScalingForStorageEnabled;
    }

    /**
     * The number of Max OCPU cores to be made available to the autonomous database with auto scaling of cpu enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCoreCount")
    private final Integer maxCpuCoreCount;

    /**
     * The number of Max OCPU cores to be made available to the autonomous database with auto scaling of cpu enabled.
     *
     * @return the value
     **/
    public Integer getMaxCpuCoreCount() {
        return maxCpuCoreCount;
    }

    /**
     * The Oracle Database Edition that applies to the Autonomous databases.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final AutonomousDatabaseSummary.DatabaseEdition databaseEdition;

    /**
     * The Oracle Database Edition that applies to the Autonomous databases.
     *
     * @return the value
     **/
    public AutonomousDatabaseSummary.DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateAutonomousDatabaseBase(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", isFreeTier=").append(String.valueOf(this.isFreeTier));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", adminPassword=").append(String.valueOf(this.adminPassword));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", isPreviewVersionWithServiceTermsAccepted=")
                .append(String.valueOf(this.isPreviewVersionWithServiceTermsAccepted));
        sb.append(", isAutoScalingEnabled=").append(String.valueOf(this.isAutoScalingEnabled));
        sb.append(", isDedicated=").append(String.valueOf(this.isDedicated));
        sb.append(", autonomousContainerDatabaseId=")
                .append(String.valueOf(this.autonomousContainerDatabaseId));
        sb.append(", isAccessControlEnabled=").append(String.valueOf(this.isAccessControlEnabled));
        sb.append(", whitelistedIps=").append(String.valueOf(this.whitelistedIps));
        sb.append(", arePrimaryWhitelistedIpsUsed=")
                .append(String.valueOf(this.arePrimaryWhitelistedIpsUsed));
        sb.append(", standbyWhitelistedIps=").append(String.valueOf(this.standbyWhitelistedIps));
        sb.append(", isDataGuardEnabled=").append(String.valueOf(this.isDataGuardEnabled));
        sb.append(", isLocalDataGuardEnabled=")
                .append(String.valueOf(this.isLocalDataGuardEnabled));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", privateEndpointLabel=").append(String.valueOf(this.privateEndpointLabel));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", customerContacts=").append(String.valueOf(this.customerContacts));
        sb.append(", isMtlsConnectionRequired=")
                .append(String.valueOf(this.isMtlsConnectionRequired));
        sb.append(", autonomousMaintenanceScheduleType=")
                .append(String.valueOf(this.autonomousMaintenanceScheduleType));
        sb.append(", scheduledOperations=").append(String.valueOf(this.scheduledOperations));
        sb.append(", isAutoScalingForStorageEnabled=")
                .append(String.valueOf(this.isAutoScalingForStorageEnabled));
        sb.append(", maxCpuCoreCount=").append(String.valueOf(this.maxCpuCoreCount));
        sb.append(", databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousDatabaseBase)) {
            return false;
        }

        CreateAutonomousDatabaseBase other = (CreateAutonomousDatabaseBase) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.isFreeTier, other.isFreeTier)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(
                        this.isPreviewVersionWithServiceTermsAccepted,
                        other.isPreviewVersionWithServiceTermsAccepted)
                && java.util.Objects.equals(this.isAutoScalingEnabled, other.isAutoScalingEnabled)
                && java.util.Objects.equals(this.isDedicated, other.isDedicated)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseId, other.autonomousContainerDatabaseId)
                && java.util.Objects.equals(
                        this.isAccessControlEnabled, other.isAccessControlEnabled)
                && java.util.Objects.equals(this.whitelistedIps, other.whitelistedIps)
                && java.util.Objects.equals(
                        this.arePrimaryWhitelistedIpsUsed, other.arePrimaryWhitelistedIpsUsed)
                && java.util.Objects.equals(this.standbyWhitelistedIps, other.standbyWhitelistedIps)
                && java.util.Objects.equals(this.isDataGuardEnabled, other.isDataGuardEnabled)
                && java.util.Objects.equals(
                        this.isLocalDataGuardEnabled, other.isLocalDataGuardEnabled)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.privateEndpointLabel, other.privateEndpointLabel)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.customerContacts, other.customerContacts)
                && java.util.Objects.equals(
                        this.isMtlsConnectionRequired, other.isMtlsConnectionRequired)
                && java.util.Objects.equals(
                        this.autonomousMaintenanceScheduleType,
                        other.autonomousMaintenanceScheduleType)
                && java.util.Objects.equals(this.scheduledOperations, other.scheduledOperations)
                && java.util.Objects.equals(
                        this.isAutoScalingForStorageEnabled, other.isAutoScalingForStorageEnabled)
                && java.util.Objects.equals(this.maxCpuCoreCount, other.maxCpuCoreCount)
                && java.util.Objects.equals(this.databaseEdition, other.databaseEdition);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInTBs == null
                                ? 43
                                : this.dataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.isFreeTier == null ? 43 : this.isFreeTier.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.isPreviewVersionWithServiceTermsAccepted == null
                                ? 43
                                : this.isPreviewVersionWithServiceTermsAccepted.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingEnabled == null
                                ? 43
                                : this.isAutoScalingEnabled.hashCode());
        result = (result * PRIME) + (this.isDedicated == null ? 43 : this.isDedicated.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseId == null
                                ? 43
                                : this.autonomousContainerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccessControlEnabled == null
                                ? 43
                                : this.isAccessControlEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.whitelistedIps == null ? 43 : this.whitelistedIps.hashCode());
        result =
                (result * PRIME)
                        + (this.arePrimaryWhitelistedIpsUsed == null
                                ? 43
                                : this.arePrimaryWhitelistedIpsUsed.hashCode());
        result =
                (result * PRIME)
                        + (this.standbyWhitelistedIps == null
                                ? 43
                                : this.standbyWhitelistedIps.hashCode());
        result =
                (result * PRIME)
                        + (this.isDataGuardEnabled == null
                                ? 43
                                : this.isDataGuardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isLocalDataGuardEnabled == null
                                ? 43
                                : this.isLocalDataGuardEnabled.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointLabel == null
                                ? 43
                                : this.privateEndpointLabel.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.customerContacts == null ? 43 : this.customerContacts.hashCode());
        result =
                (result * PRIME)
                        + (this.isMtlsConnectionRequired == null
                                ? 43
                                : this.isMtlsConnectionRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousMaintenanceScheduleType == null
                                ? 43
                                : this.autonomousMaintenanceScheduleType.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledOperations == null
                                ? 43
                                : this.scheduledOperations.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingForStorageEnabled == null
                                ? 43
                                : this.isAutoScalingForStorageEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.maxCpuCoreCount == null ? 43 : this.maxCpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseEdition == null ? 43 : this.databaseEdition.hashCode());
        return result;
    }

    /**
     * The source of the database: Use {@code NONE} for creating a new Autonomous Database. Use {@code DATABASE} for creating a new Autonomous Database by cloning an existing Autonomous Database. Use {@code CROSS_REGION_DATAGUARD} to create a standby Data Guard database in another region.
     * <p>
     * For Autonomous Databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), the following cloning options are available: Use {@code BACKUP_FROM_ID} for creating a new Autonomous Database from a specified backup. Use {@code BACKUP_FROM_TIMESTAMP} for creating a point-in-time Autonomous Database clone using backups. For more information, see [Cloning and Moving an Autonomous Database](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/clone-autonomous-database.html#GUID-D771796F-5081-4CFB-A7FF-0F893EABD7BC).
     *
     **/
    public enum Source {
        None("NONE"),
        Database("DATABASE"),
        BackupFromId("BACKUP_FROM_ID"),
        BackupFromTimestamp("BACKUP_FROM_TIMESTAMP"),
        CloneToRefreshable("CLONE_TO_REFRESHABLE"),
        CrossRegionDataguard("CROSS_REGION_DATAGUARD"),
        ;

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                map.put(v.getValue(), v);
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Source: " + key);
        }
    };
}
