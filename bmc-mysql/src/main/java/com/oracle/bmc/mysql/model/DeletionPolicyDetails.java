/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The Deletion policy for the DB System.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeletionPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeletionPolicyDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "automaticBackupRetention",
        "finalBackup",
        "isDeleteProtected"
    })
    public DeletionPolicyDetails(
            AutomaticBackupRetention automaticBackupRetention,
            FinalBackup finalBackup,
            Boolean isDeleteProtected) {
        super();
        this.automaticBackupRetention = automaticBackupRetention;
        this.finalBackup = finalBackup;
        this.isDeleteProtected = isDeleteProtected;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies if any automatic backups created for a DB System should be retained or deleted when the DB System is deleted.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("automaticBackupRetention")
        private AutomaticBackupRetention automaticBackupRetention;

        /**
         * Specifies if any automatic backups created for a DB System should be retained or deleted when the DB System is deleted.
         *
         * @param automaticBackupRetention the value to set
         * @return this builder
         **/
        public Builder automaticBackupRetention(AutomaticBackupRetention automaticBackupRetention) {
            this.automaticBackupRetention = automaticBackupRetention;
            this.__explicitlySet__.add("automaticBackupRetention");
            return this;
        }
        /**
         * Specifies whether or not a backup is taken when the DB System is deleted.
         *   REQUIRE_FINAL_BACKUP: a backup is taken if the DB System is deleted.
         *   SKIP_FINAL_BACKUP: a backup is not taken if the DB System is deleted.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("finalBackup")
        private FinalBackup finalBackup;

        /**
         * Specifies whether or not a backup is taken when the DB System is deleted.
         *   REQUIRE_FINAL_BACKUP: a backup is taken if the DB System is deleted.
         *   SKIP_FINAL_BACKUP: a backup is not taken if the DB System is deleted.
         *
         * @param finalBackup the value to set
         * @return this builder
         **/
        public Builder finalBackup(FinalBackup finalBackup) {
            this.finalBackup = finalBackup;
            this.__explicitlySet__.add("finalBackup");
            return this;
        }
        /**
         * Specifies whether the DB System can be deleted. Set to true to prevent deletion, false (default) to allow.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDeleteProtected")
        private Boolean isDeleteProtected;

        /**
         * Specifies whether the DB System can be deleted. Set to true to prevent deletion, false (default) to allow.
         *
         * @param isDeleteProtected the value to set
         * @return this builder
         **/
        public Builder isDeleteProtected(Boolean isDeleteProtected) {
            this.isDeleteProtected = isDeleteProtected;
            this.__explicitlySet__.add("isDeleteProtected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeletionPolicyDetails build() {
            DeletionPolicyDetails __instance__ =
                    new DeletionPolicyDetails(
                            automaticBackupRetention, finalBackup, isDeleteProtected);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeletionPolicyDetails o) {
            Builder copiedBuilder =
                    automaticBackupRetention(o.getAutomaticBackupRetention())
                            .finalBackup(o.getFinalBackup())
                            .isDeleteProtected(o.getIsDeleteProtected());

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
     * Specifies if any automatic backups created for a DB System should be retained or deleted when the DB System is deleted.
     *
     **/
    public enum AutomaticBackupRetention {
        Delete("DELETE"),
        Retain("RETAIN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AutomaticBackupRetention.class);

        private final String value;
        private static java.util.Map<String, AutomaticBackupRetention> map;

        static {
            map = new java.util.HashMap<>();
            for (AutomaticBackupRetention v : AutomaticBackupRetention.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AutomaticBackupRetention(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutomaticBackupRetention create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AutomaticBackupRetention', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies if any automatic backups created for a DB System should be retained or deleted when the DB System is deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("automaticBackupRetention")
    private final AutomaticBackupRetention automaticBackupRetention;

    /**
     * Specifies if any automatic backups created for a DB System should be retained or deleted when the DB System is deleted.
     *
     * @return the value
     **/
    public AutomaticBackupRetention getAutomaticBackupRetention() {
        return automaticBackupRetention;
    }

    /**
     * Specifies whether or not a backup is taken when the DB System is deleted.
     *   REQUIRE_FINAL_BACKUP: a backup is taken if the DB System is deleted.
     *   SKIP_FINAL_BACKUP: a backup is not taken if the DB System is deleted.
     *
     **/
    public enum FinalBackup {
        SkipFinalBackup("SKIP_FINAL_BACKUP"),
        RequireFinalBackup("REQUIRE_FINAL_BACKUP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FinalBackup.class);

        private final String value;
        private static java.util.Map<String, FinalBackup> map;

        static {
            map = new java.util.HashMap<>();
            for (FinalBackup v : FinalBackup.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FinalBackup(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FinalBackup create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FinalBackup', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies whether or not a backup is taken when the DB System is deleted.
     *   REQUIRE_FINAL_BACKUP: a backup is taken if the DB System is deleted.
     *   SKIP_FINAL_BACKUP: a backup is not taken if the DB System is deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("finalBackup")
    private final FinalBackup finalBackup;

    /**
     * Specifies whether or not a backup is taken when the DB System is deleted.
     *   REQUIRE_FINAL_BACKUP: a backup is taken if the DB System is deleted.
     *   SKIP_FINAL_BACKUP: a backup is not taken if the DB System is deleted.
     *
     * @return the value
     **/
    public FinalBackup getFinalBackup() {
        return finalBackup;
    }

    /**
     * Specifies whether the DB System can be deleted. Set to true to prevent deletion, false (default) to allow.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDeleteProtected")
    private final Boolean isDeleteProtected;

    /**
     * Specifies whether the DB System can be deleted. Set to true to prevent deletion, false (default) to allow.
     *
     * @return the value
     **/
    public Boolean getIsDeleteProtected() {
        return isDeleteProtected;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeletionPolicyDetails(");
        sb.append("automaticBackupRetention=")
                .append(String.valueOf(this.automaticBackupRetention));
        sb.append(", finalBackup=").append(String.valueOf(this.finalBackup));
        sb.append(", isDeleteProtected=").append(String.valueOf(this.isDeleteProtected));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeletionPolicyDetails)) {
            return false;
        }

        DeletionPolicyDetails other = (DeletionPolicyDetails) o;
        return java.util.Objects.equals(
                        this.automaticBackupRetention, other.automaticBackupRetention)
                && java.util.Objects.equals(this.finalBackup, other.finalBackup)
                && java.util.Objects.equals(this.isDeleteProtected, other.isDeleteProtected)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.automaticBackupRetention == null
                                ? 43
                                : this.automaticBackupRetention.hashCode());
        result = (result * PRIME) + (this.finalBackup == null ? 43 : this.finalBackup.hashCode());
        result =
                (result * PRIME)
                        + (this.isDeleteProtected == null ? 43 : this.isDeleteProtected.hashCode());
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
