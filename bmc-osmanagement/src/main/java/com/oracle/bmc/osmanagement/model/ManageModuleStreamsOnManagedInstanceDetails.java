/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * The set of changes to make to the state of the modules, streams, and profiles on a managed instance
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManageModuleStreamsOnManagedInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManageModuleStreamsOnManagedInstanceDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"isDryRun", "enable", "disable", "install", "remove"})
    public ManageModuleStreamsOnManagedInstanceDetails(
            Boolean isDryRun,
            java.util.List<ModuleStreamDetails> enable,
            java.util.List<ModuleStreamDetails> disable,
            java.util.List<ModuleStreamProfileDetails> install,
            java.util.List<ModuleStreamProfileDetails> remove) {
        super();
        this.isDryRun = isDryRun;
        this.enable = enable;
        this.disable = disable;
        this.install = install;
        this.remove = remove;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates if this operation is a dry run or if the operation
         * should be commited.  If set to true, the result of the operation
         * will be evaluated but not committed.  If set to false, the
         * operation is committed to the managed instance.  The default is
         * false.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDryRun")
        private Boolean isDryRun;

        /**
         * Indicates if this operation is a dry run or if the operation
         * should be commited.  If set to true, the result of the operation
         * will be evaluated but not committed.  If set to false, the
         * operation is committed to the managed instance.  The default is
         * false.
         *
         * @param isDryRun the value to set
         * @return this builder
         **/
        public Builder isDryRun(Boolean isDryRun) {
            this.isDryRun = isDryRun;
            this.__explicitlySet__.add("isDryRun");
            return this;
        }
        /**
         * The set of module streams to enable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enable")
        private java.util.List<ModuleStreamDetails> enable;

        /**
         * The set of module streams to enable.
         * @param enable the value to set
         * @return this builder
         **/
        public Builder enable(java.util.List<ModuleStreamDetails> enable) {
            this.enable = enable;
            this.__explicitlySet__.add("enable");
            return this;
        }
        /**
         * The set of module streams to disable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("disable")
        private java.util.List<ModuleStreamDetails> disable;

        /**
         * The set of module streams to disable.
         * @param disable the value to set
         * @return this builder
         **/
        public Builder disable(java.util.List<ModuleStreamDetails> disable) {
            this.disable = disable;
            this.__explicitlySet__.add("disable");
            return this;
        }
        /**
         * The set of module stream profiles to install.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("install")
        private java.util.List<ModuleStreamProfileDetails> install;

        /**
         * The set of module stream profiles to install.
         * @param install the value to set
         * @return this builder
         **/
        public Builder install(java.util.List<ModuleStreamProfileDetails> install) {
            this.install = install;
            this.__explicitlySet__.add("install");
            return this;
        }
        /**
         * The set of module stream profiles to remove.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("remove")
        private java.util.List<ModuleStreamProfileDetails> remove;

        /**
         * The set of module stream profiles to remove.
         * @param remove the value to set
         * @return this builder
         **/
        public Builder remove(java.util.List<ModuleStreamProfileDetails> remove) {
            this.remove = remove;
            this.__explicitlySet__.add("remove");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManageModuleStreamsOnManagedInstanceDetails build() {
            ManageModuleStreamsOnManagedInstanceDetails __instance__ =
                    new ManageModuleStreamsOnManagedInstanceDetails(
                            isDryRun, enable, disable, install, remove);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageModuleStreamsOnManagedInstanceDetails o) {
            Builder copiedBuilder =
                    isDryRun(o.getIsDryRun())
                            .enable(o.getEnable())
                            .disable(o.getDisable())
                            .install(o.getInstall())
                            .remove(o.getRemove());

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
     * Indicates if this operation is a dry run or if the operation
     * should be commited.  If set to true, the result of the operation
     * will be evaluated but not committed.  If set to false, the
     * operation is committed to the managed instance.  The default is
     * false.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDryRun")
    private final Boolean isDryRun;

    /**
     * Indicates if this operation is a dry run or if the operation
     * should be commited.  If set to true, the result of the operation
     * will be evaluated but not committed.  If set to false, the
     * operation is committed to the managed instance.  The default is
     * false.
     *
     * @return the value
     **/
    public Boolean getIsDryRun() {
        return isDryRun;
    }

    /**
     * The set of module streams to enable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enable")
    private final java.util.List<ModuleStreamDetails> enable;

    /**
     * The set of module streams to enable.
     * @return the value
     **/
    public java.util.List<ModuleStreamDetails> getEnable() {
        return enable;
    }

    /**
     * The set of module streams to disable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("disable")
    private final java.util.List<ModuleStreamDetails> disable;

    /**
     * The set of module streams to disable.
     * @return the value
     **/
    public java.util.List<ModuleStreamDetails> getDisable() {
        return disable;
    }

    /**
     * The set of module stream profiles to install.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("install")
    private final java.util.List<ModuleStreamProfileDetails> install;

    /**
     * The set of module stream profiles to install.
     * @return the value
     **/
    public java.util.List<ModuleStreamProfileDetails> getInstall() {
        return install;
    }

    /**
     * The set of module stream profiles to remove.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remove")
    private final java.util.List<ModuleStreamProfileDetails> remove;

    /**
     * The set of module stream profiles to remove.
     * @return the value
     **/
    public java.util.List<ModuleStreamProfileDetails> getRemove() {
        return remove;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ManageModuleStreamsOnManagedInstanceDetails(");
        sb.append("isDryRun=").append(String.valueOf(this.isDryRun));
        sb.append(", enable=").append(String.valueOf(this.enable));
        sb.append(", disable=").append(String.valueOf(this.disable));
        sb.append(", install=").append(String.valueOf(this.install));
        sb.append(", remove=").append(String.valueOf(this.remove));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageModuleStreamsOnManagedInstanceDetails)) {
            return false;
        }

        ManageModuleStreamsOnManagedInstanceDetails other =
                (ManageModuleStreamsOnManagedInstanceDetails) o;
        return java.util.Objects.equals(this.isDryRun, other.isDryRun)
                && java.util.Objects.equals(this.enable, other.enable)
                && java.util.Objects.equals(this.disable, other.disable)
                && java.util.Objects.equals(this.install, other.install)
                && java.util.Objects.equals(this.remove, other.remove)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isDryRun == null ? 43 : this.isDryRun.hashCode());
        result = (result * PRIME) + (this.enable == null ? 43 : this.enable.hashCode());
        result = (result * PRIME) + (this.disable == null ? 43 : this.disable.hashCode());
        result = (result * PRIME) + (this.install == null ? 43 : this.install.hashCode());
        result = (result * PRIME) + (this.remove == null ? 43 : this.remove.hashCode());
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
