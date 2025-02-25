/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details about the Kerberos principals.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KerberosDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KerberosDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"principalName", "keytabFile"})
    public KerberosDetails(String principalName, String keytabFile) {
        super();
        this.principalName = principalName;
        this.keytabFile = keytabFile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the Kerberos principal.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("principalName")
        private String principalName;

        /**
         * Name of the Kerberos principal.
         * @param principalName the value to set
         * @return this builder
         **/
        public Builder principalName(String principalName) {
            this.principalName = principalName;
            this.__explicitlySet__.add("principalName");
            return this;
        }
        /**
         * Location of the keytab file
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keytabFile")
        private String keytabFile;

        /**
         * Location of the keytab file
         * @param keytabFile the value to set
         * @return this builder
         **/
        public Builder keytabFile(String keytabFile) {
            this.keytabFile = keytabFile;
            this.__explicitlySet__.add("keytabFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KerberosDetails build() {
            KerberosDetails __instance__ = new KerberosDetails(principalName, keytabFile);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KerberosDetails o) {
            Builder copiedBuilder =
                    principalName(o.getPrincipalName()).keytabFile(o.getKeytabFile());

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
     * Name of the Kerberos principal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principalName")
    private final String principalName;

    /**
     * Name of the Kerberos principal.
     * @return the value
     **/
    public String getPrincipalName() {
        return principalName;
    }

    /**
     * Location of the keytab file
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keytabFile")
    private final String keytabFile;

    /**
     * Location of the keytab file
     * @return the value
     **/
    public String getKeytabFile() {
        return keytabFile;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("KerberosDetails(");
        sb.append("principalName=").append(String.valueOf(this.principalName));
        sb.append(", keytabFile=").append(String.valueOf(this.keytabFile));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KerberosDetails)) {
            return false;
        }

        KerberosDetails other = (KerberosDetails) o;
        return java.util.Objects.equals(this.principalName, other.principalName)
                && java.util.Objects.equals(this.keytabFile, other.keytabFile)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.principalName == null ? 43 : this.principalName.hashCode());
        result = (result * PRIME) + (this.keytabFile == null ? 43 : this.keytabFile.hashCode());
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
