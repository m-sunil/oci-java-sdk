/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oce.model;

/**
 * Summary of the OceInstance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190912")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OceInstanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OceInstanceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "guid",
        "description",
        "compartmentId",
        "name",
        "tenancyId",
        "idcsTenancy",
        "tenancyName",
        "instanceUsageType",
        "addOnFeatures",
        "objectStorageNamespace",
        "adminEmail",
        "upgradeSchedule",
        "wafPrimaryDomain",
        "instanceAccessType",
        "instanceLicenseType",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "stateMessage",
        "service",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OceInstanceSummary(
            String id,
            String guid,
            String description,
            String compartmentId,
            String name,
            String tenancyId,
            String idcsTenancy,
            String tenancyName,
            InstanceUsageType instanceUsageType,
            java.util.List<String> addOnFeatures,
            String objectStorageNamespace,
            String adminEmail,
            OceInstance.UpgradeSchedule upgradeSchedule,
            String wafPrimaryDomain,
            InstanceAccessType instanceAccessType,
            LicenseType instanceLicenseType,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            LifecycleDetails lifecycleDetails,
            String stateMessage,
            java.util.Map<String, Object> service,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.guid = guid;
        this.description = description;
        this.compartmentId = compartmentId;
        this.name = name;
        this.tenancyId = tenancyId;
        this.idcsTenancy = idcsTenancy;
        this.tenancyName = tenancyName;
        this.instanceUsageType = instanceUsageType;
        this.addOnFeatures = addOnFeatures;
        this.objectStorageNamespace = objectStorageNamespace;
        this.adminEmail = adminEmail;
        this.upgradeSchedule = upgradeSchedule;
        this.wafPrimaryDomain = wafPrimaryDomain;
        this.instanceAccessType = instanceAccessType;
        this.instanceLicenseType = instanceLicenseType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.stateMessage = stateMessage;
        this.service = service;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier that is immutable on creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique GUID identifier that is immutable on creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("guid")
        private String guid;

        /**
         * Unique GUID identifier that is immutable on creation
         * @param guid the value to set
         * @return this builder
         **/
        public Builder guid(String guid) {
            this.guid = guid;
            this.__explicitlySet__.add("guid");
            return this;
        }
        /**
         * OceInstance description, can be updated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * OceInstance description, can be updated
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Compartment Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * OceInstance Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * OceInstance Name
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Tenancy Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * Tenancy Identifier
         * @param tenancyId the value to set
         * @return this builder
         **/
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * IDCS Tenancy Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTenancy")
        private String idcsTenancy;

        /**
         * IDCS Tenancy Identifier
         * @param idcsTenancy the value to set
         * @return this builder
         **/
        public Builder idcsTenancy(String idcsTenancy) {
            this.idcsTenancy = idcsTenancy;
            this.__explicitlySet__.add("idcsTenancy");
            return this;
        }
        /**
         * Tenancy Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
        private String tenancyName;

        /**
         * Tenancy Name
         * @param tenancyName the value to set
         * @return this builder
         **/
        public Builder tenancyName(String tenancyName) {
            this.tenancyName = tenancyName;
            this.__explicitlySet__.add("tenancyName");
            return this;
        }
        /**
         * Instance type based on its usage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceUsageType")
        private InstanceUsageType instanceUsageType;

        /**
         * Instance type based on its usage
         * @param instanceUsageType the value to set
         * @return this builder
         **/
        public Builder instanceUsageType(InstanceUsageType instanceUsageType) {
            this.instanceUsageType = instanceUsageType;
            this.__explicitlySet__.add("instanceUsageType");
            return this;
        }
        /**
         * a list of add-on features for the ocm instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("addOnFeatures")
        private java.util.List<String> addOnFeatures;

        /**
         * a list of add-on features for the ocm instance
         * @param addOnFeatures the value to set
         * @return this builder
         **/
        public Builder addOnFeatures(java.util.List<String> addOnFeatures) {
            this.addOnFeatures = addOnFeatures;
            this.__explicitlySet__.add("addOnFeatures");
            return this;
        }
        /**
         * Object Storage Namespace of tenancy
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
        private String objectStorageNamespace;

        /**
         * Object Storage Namespace of tenancy
         * @param objectStorageNamespace the value to set
         * @return this builder
         **/
        public Builder objectStorageNamespace(String objectStorageNamespace) {
            this.objectStorageNamespace = objectStorageNamespace;
            this.__explicitlySet__.add("objectStorageNamespace");
            return this;
        }
        /**
         * Admin Email for Notification
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
        private String adminEmail;

        /**
         * Admin Email for Notification
         * @param adminEmail the value to set
         * @return this builder
         **/
        public Builder adminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            this.__explicitlySet__.add("adminEmail");
            return this;
        }
        /**
         * Upgrade schedule type representing service to be upgraded immediately whenever latest version is released
         * or delay upgrade of the service to previous released version
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("upgradeSchedule")
        private OceInstance.UpgradeSchedule upgradeSchedule;

        /**
         * Upgrade schedule type representing service to be upgraded immediately whenever latest version is released
         * or delay upgrade of the service to previous released version
         *
         * @param upgradeSchedule the value to set
         * @return this builder
         **/
        public Builder upgradeSchedule(OceInstance.UpgradeSchedule upgradeSchedule) {
            this.upgradeSchedule = upgradeSchedule;
            this.__explicitlySet__.add("upgradeSchedule");
            return this;
        }
        /**
         * Web Application Firewall(WAF) primary domain
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("wafPrimaryDomain")
        private String wafPrimaryDomain;

        /**
         * Web Application Firewall(WAF) primary domain
         * @param wafPrimaryDomain the value to set
         * @return this builder
         **/
        public Builder wafPrimaryDomain(String wafPrimaryDomain) {
            this.wafPrimaryDomain = wafPrimaryDomain;
            this.__explicitlySet__.add("wafPrimaryDomain");
            return this;
        }
        /**
         * Flag indicating whether the instance access is private or public
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceAccessType")
        private InstanceAccessType instanceAccessType;

        /**
         * Flag indicating whether the instance access is private or public
         * @param instanceAccessType the value to set
         * @return this builder
         **/
        public Builder instanceAccessType(InstanceAccessType instanceAccessType) {
            this.instanceAccessType = instanceAccessType;
            this.__explicitlySet__.add("instanceAccessType");
            return this;
        }
        /**
         * Flag indicating whether the instance license is new cloud or bring your own license
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceLicenseType")
        private LicenseType instanceLicenseType;

        /**
         * Flag indicating whether the instance license is new cloud or bring your own license
         * @param instanceLicenseType the value to set
         * @return this builder
         **/
        public Builder instanceLicenseType(LicenseType instanceLicenseType) {
            this.instanceLicenseType = instanceLicenseType;
            this.__explicitlySet__.add("instanceLicenseType");
            return this;
        }
        /**
         * The time the the OceInstance was created. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the OceInstance was created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the OceInstance was updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the OceInstance was updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the instance lifecycle.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the instance lifecycle.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Details of the current state of the instance lifecycle
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetails lifecycleDetails;

        /**
         * Details of the current state of the instance lifecycle
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
        private String stateMessage;

        /**
         * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param stateMessage the value to set
         * @return this builder
         **/
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = stateMessage;
            this.__explicitlySet__.add("stateMessage");
            return this;
        }
        /**
         * SERVICE data.
         * Example: {@code {"service": {"IDCS": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private java.util.Map<String, Object> service;

        /**
         * SERVICE data.
         * Example: {@code {"service": {"IDCS": "value"}}}
         *
         * @param service the value to set
         * @return this builder
         **/
        public Builder service(java.util.Map<String, Object> service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OceInstanceSummary build() {
            OceInstanceSummary __instance__ =
                    new OceInstanceSummary(
                            id,
                            guid,
                            description,
                            compartmentId,
                            name,
                            tenancyId,
                            idcsTenancy,
                            tenancyName,
                            instanceUsageType,
                            addOnFeatures,
                            objectStorageNamespace,
                            adminEmail,
                            upgradeSchedule,
                            wafPrimaryDomain,
                            instanceAccessType,
                            instanceLicenseType,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            stateMessage,
                            service,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OceInstanceSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .guid(o.getGuid())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .tenancyId(o.getTenancyId())
                            .idcsTenancy(o.getIdcsTenancy())
                            .tenancyName(o.getTenancyName())
                            .instanceUsageType(o.getInstanceUsageType())
                            .addOnFeatures(o.getAddOnFeatures())
                            .objectStorageNamespace(o.getObjectStorageNamespace())
                            .adminEmail(o.getAdminEmail())
                            .upgradeSchedule(o.getUpgradeSchedule())
                            .wafPrimaryDomain(o.getWafPrimaryDomain())
                            .instanceAccessType(o.getInstanceAccessType())
                            .instanceLicenseType(o.getInstanceLicenseType())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .stateMessage(o.getStateMessage())
                            .service(o.getService())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * Unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Unique GUID identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("guid")
    private final String guid;

    /**
     * Unique GUID identifier that is immutable on creation
     * @return the value
     **/
    public String getGuid() {
        return guid;
    }

    /**
     * OceInstance description, can be updated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * OceInstance description, can be updated
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * OceInstance Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * OceInstance Name
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Tenancy Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * Tenancy Identifier
     * @return the value
     **/
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * IDCS Tenancy Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTenancy")
    private final String idcsTenancy;

    /**
     * IDCS Tenancy Identifier
     * @return the value
     **/
    public String getIdcsTenancy() {
        return idcsTenancy;
    }

    /**
     * Tenancy Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
    private final String tenancyName;

    /**
     * Tenancy Name
     * @return the value
     **/
    public String getTenancyName() {
        return tenancyName;
    }

    /**
     * Instance type based on its usage
     **/
    public enum InstanceUsageType {
        Primary("PRIMARY"),
        Nonprimary("NONPRIMARY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InstanceUsageType.class);

        private final String value;
        private static java.util.Map<String, InstanceUsageType> map;

        static {
            map = new java.util.HashMap<>();
            for (InstanceUsageType v : InstanceUsageType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InstanceUsageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InstanceUsageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InstanceUsageType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Instance type based on its usage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceUsageType")
    private final InstanceUsageType instanceUsageType;

    /**
     * Instance type based on its usage
     * @return the value
     **/
    public InstanceUsageType getInstanceUsageType() {
        return instanceUsageType;
    }

    /**
     * a list of add-on features for the ocm instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addOnFeatures")
    private final java.util.List<String> addOnFeatures;

    /**
     * a list of add-on features for the ocm instance
     * @return the value
     **/
    public java.util.List<String> getAddOnFeatures() {
        return addOnFeatures;
    }

    /**
     * Object Storage Namespace of tenancy
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
    private final String objectStorageNamespace;

    /**
     * Object Storage Namespace of tenancy
     * @return the value
     **/
    public String getObjectStorageNamespace() {
        return objectStorageNamespace;
    }

    /**
     * Admin Email for Notification
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
    private final String adminEmail;

    /**
     * Admin Email for Notification
     * @return the value
     **/
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * Upgrade schedule type representing service to be upgraded immediately whenever latest version is released
     * or delay upgrade of the service to previous released version
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeSchedule")
    private final OceInstance.UpgradeSchedule upgradeSchedule;

    /**
     * Upgrade schedule type representing service to be upgraded immediately whenever latest version is released
     * or delay upgrade of the service to previous released version
     *
     * @return the value
     **/
    public OceInstance.UpgradeSchedule getUpgradeSchedule() {
        return upgradeSchedule;
    }

    /**
     * Web Application Firewall(WAF) primary domain
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wafPrimaryDomain")
    private final String wafPrimaryDomain;

    /**
     * Web Application Firewall(WAF) primary domain
     * @return the value
     **/
    public String getWafPrimaryDomain() {
        return wafPrimaryDomain;
    }

    /**
     * Flag indicating whether the instance access is private or public
     **/
    public enum InstanceAccessType {
        Public("PUBLIC"),
        Private("PRIVATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InstanceAccessType.class);

        private final String value;
        private static java.util.Map<String, InstanceAccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (InstanceAccessType v : InstanceAccessType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InstanceAccessType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InstanceAccessType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InstanceAccessType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Flag indicating whether the instance access is private or public
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceAccessType")
    private final InstanceAccessType instanceAccessType;

    /**
     * Flag indicating whether the instance access is private or public
     * @return the value
     **/
    public InstanceAccessType getInstanceAccessType() {
        return instanceAccessType;
    }

    /**
     * Flag indicating whether the instance license is new cloud or bring your own license
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceLicenseType")
    private final LicenseType instanceLicenseType;

    /**
     * Flag indicating whether the instance license is new cloud or bring your own license
     * @return the value
     **/
    public LicenseType getInstanceLicenseType() {
        return instanceLicenseType;
    }

    /**
     * The time the the OceInstance was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the OceInstance was created. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the OceInstance was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the OceInstance was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the instance lifecycle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the instance lifecycle.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details of the current state of the instance lifecycle
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final LifecycleDetails lifecycleDetails;

    /**
     * Details of the current state of the instance lifecycle
     * @return the value
     **/
    public LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    private final String stateMessage;

    /**
     * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getStateMessage() {
        return stateMessage;
    }

    /**
     * SERVICE data.
     * Example: {@code {"service": {"IDCS": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final java.util.Map<String, Object> service;

    /**
     * SERVICE data.
     * Example: {@code {"service": {"IDCS": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, Object> getService() {
        return service;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OceInstanceSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", guid=").append(String.valueOf(this.guid));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", idcsTenancy=").append(String.valueOf(this.idcsTenancy));
        sb.append(", tenancyName=").append(String.valueOf(this.tenancyName));
        sb.append(", instanceUsageType=").append(String.valueOf(this.instanceUsageType));
        sb.append(", addOnFeatures=").append(String.valueOf(this.addOnFeatures));
        sb.append(", objectStorageNamespace=").append(String.valueOf(this.objectStorageNamespace));
        sb.append(", adminEmail=").append(String.valueOf(this.adminEmail));
        sb.append(", upgradeSchedule=").append(String.valueOf(this.upgradeSchedule));
        sb.append(", wafPrimaryDomain=").append(String.valueOf(this.wafPrimaryDomain));
        sb.append(", instanceAccessType=").append(String.valueOf(this.instanceAccessType));
        sb.append(", instanceLicenseType=").append(String.valueOf(this.instanceLicenseType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", stateMessage=").append(String.valueOf(this.stateMessage));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OceInstanceSummary)) {
            return false;
        }

        OceInstanceSummary other = (OceInstanceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.guid, other.guid)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.idcsTenancy, other.idcsTenancy)
                && java.util.Objects.equals(this.tenancyName, other.tenancyName)
                && java.util.Objects.equals(this.instanceUsageType, other.instanceUsageType)
                && java.util.Objects.equals(this.addOnFeatures, other.addOnFeatures)
                && java.util.Objects.equals(
                        this.objectStorageNamespace, other.objectStorageNamespace)
                && java.util.Objects.equals(this.adminEmail, other.adminEmail)
                && java.util.Objects.equals(this.upgradeSchedule, other.upgradeSchedule)
                && java.util.Objects.equals(this.wafPrimaryDomain, other.wafPrimaryDomain)
                && java.util.Objects.equals(this.instanceAccessType, other.instanceAccessType)
                && java.util.Objects.equals(this.instanceLicenseType, other.instanceLicenseType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.stateMessage, other.stateMessage)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.guid == null ? 43 : this.guid.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.idcsTenancy == null ? 43 : this.idcsTenancy.hashCode());
        result = (result * PRIME) + (this.tenancyName == null ? 43 : this.tenancyName.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceUsageType == null ? 43 : this.instanceUsageType.hashCode());
        result =
                (result * PRIME)
                        + (this.addOnFeatures == null ? 43 : this.addOnFeatures.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageNamespace == null
                                ? 43
                                : this.objectStorageNamespace.hashCode());
        result = (result * PRIME) + (this.adminEmail == null ? 43 : this.adminEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradeSchedule == null ? 43 : this.upgradeSchedule.hashCode());
        result =
                (result * PRIME)
                        + (this.wafPrimaryDomain == null ? 43 : this.wafPrimaryDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceAccessType == null
                                ? 43
                                : this.instanceAccessType.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceLicenseType == null
                                ? 43
                                : this.instanceLicenseType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
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
