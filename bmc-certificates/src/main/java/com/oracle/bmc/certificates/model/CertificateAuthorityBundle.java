/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.model;

/**
 * The contents of the certificate, properties of the certificate (and certificate version), and user-provided contextual metadata for the certificate.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CertificateAuthorityBundle.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CertificateAuthorityBundle {
    @Deprecated
    @java.beans.ConstructorProperties({
        "certificateAuthorityId",
        "certificateAuthorityName",
        "serialNumber",
        "certificatePem",
        "certChainPem",
        "versionName",
        "timeCreated",
        "versionNumber",
        "validity",
        "stages",
        "revocationStatus"
    })
    public CertificateAuthorityBundle(
            String certificateAuthorityId,
            String certificateAuthorityName,
            String serialNumber,
            String certificatePem,
            String certChainPem,
            String versionName,
            java.util.Date timeCreated,
            Long versionNumber,
            Validity validity,
            java.util.List<VersionStage> stages,
            RevocationStatus revocationStatus) {
        super();
        this.certificateAuthorityId = certificateAuthorityId;
        this.certificateAuthorityName = certificateAuthorityName;
        this.serialNumber = serialNumber;
        this.certificatePem = certificatePem;
        this.certChainPem = certChainPem;
        this.versionName = versionName;
        this.timeCreated = timeCreated;
        this.versionNumber = versionNumber;
        this.validity = validity;
        this.stages = stages;
        this.revocationStatus = revocationStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the certificate authority (CA).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityId")
        private String certificateAuthorityId;

        /**
         * The OCID of the certificate authority (CA).
         * @param certificateAuthorityId the value to set
         * @return this builder
         **/
        public Builder certificateAuthorityId(String certificateAuthorityId) {
            this.certificateAuthorityId = certificateAuthorityId;
            this.__explicitlySet__.add("certificateAuthorityId");
            return this;
        }
        /**
         * The name of the CA.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityName")
        private String certificateAuthorityName;

        /**
         * The name of the CA.
         * @param certificateAuthorityName the value to set
         * @return this builder
         **/
        public Builder certificateAuthorityName(String certificateAuthorityName) {
            this.certificateAuthorityName = certificateAuthorityName;
            this.__explicitlySet__.add("certificateAuthorityName");
            return this;
        }
        /**
         * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
         * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        /**
         * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
         * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
         *
         * @param serialNumber the value to set
         * @return this builder
         **/
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }
        /**
         * The certificate (in PEM format) for this CA version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
        private String certificatePem;

        /**
         * The certificate (in PEM format) for this CA version.
         * @param certificatePem the value to set
         * @return this builder
         **/
        public Builder certificatePem(String certificatePem) {
            this.certificatePem = certificatePem;
            this.__explicitlySet__.add("certificatePem");
            return this;
        }
        /**
         * The certificate chain (in PEM format) for this CA version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certChainPem")
        private String certChainPem;

        /**
         * The certificate chain (in PEM format) for this CA version.
         * @param certChainPem the value to set
         * @return this builder
         **/
        public Builder certChainPem(String certChainPem) {
            this.certChainPem = certChainPem;
            this.__explicitlySet__.add("certChainPem");
            return this;
        }
        /**
         * The name of the CA.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        /**
         * The name of the CA.
         * @param versionName the value to set
         * @return this builder
         **/
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }
        /**
         * A property indicating when the CA was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * A property indicating when the CA was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The version number of the CA.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
        private Long versionNumber;

        /**
         * The version number of the CA.
         * @param versionNumber the value to set
         * @return this builder
         **/
        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            this.__explicitlySet__.add("versionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validity")
        private Validity validity;

        public Builder validity(Validity validity) {
            this.validity = validity;
            this.__explicitlySet__.add("validity");
            return this;
        }
        /**
         * A list of rotation states for this CA.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stages")
        private java.util.List<VersionStage> stages;

        /**
         * A list of rotation states for this CA.
         * @param stages the value to set
         * @return this builder
         **/
        public Builder stages(java.util.List<VersionStage> stages) {
            this.stages = stages;
            this.__explicitlySet__.add("stages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("revocationStatus")
        private RevocationStatus revocationStatus;

        public Builder revocationStatus(RevocationStatus revocationStatus) {
            this.revocationStatus = revocationStatus;
            this.__explicitlySet__.add("revocationStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateAuthorityBundle build() {
            CertificateAuthorityBundle __instance__ =
                    new CertificateAuthorityBundle(
                            certificateAuthorityId,
                            certificateAuthorityName,
                            serialNumber,
                            certificatePem,
                            certChainPem,
                            versionName,
                            timeCreated,
                            versionNumber,
                            validity,
                            stages,
                            revocationStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateAuthorityBundle o) {
            Builder copiedBuilder =
                    certificateAuthorityId(o.getCertificateAuthorityId())
                            .certificateAuthorityName(o.getCertificateAuthorityName())
                            .serialNumber(o.getSerialNumber())
                            .certificatePem(o.getCertificatePem())
                            .certChainPem(o.getCertChainPem())
                            .versionName(o.getVersionName())
                            .timeCreated(o.getTimeCreated())
                            .versionNumber(o.getVersionNumber())
                            .validity(o.getValidity())
                            .stages(o.getStages())
                            .revocationStatus(o.getRevocationStatus());

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
     * The OCID of the certificate authority (CA).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityId")
    private final String certificateAuthorityId;

    /**
     * The OCID of the certificate authority (CA).
     * @return the value
     **/
    public String getCertificateAuthorityId() {
        return certificateAuthorityId;
    }

    /**
     * The name of the CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityName")
    private final String certificateAuthorityName;

    /**
     * The name of the CA.
     * @return the value
     **/
    public String getCertificateAuthorityName() {
        return certificateAuthorityName;
    }

    /**
     * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
     * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    /**
     * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
     * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
     *
     * @return the value
     **/
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * The certificate (in PEM format) for this CA version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
    private final String certificatePem;

    /**
     * The certificate (in PEM format) for this CA version.
     * @return the value
     **/
    public String getCertificatePem() {
        return certificatePem;
    }

    /**
     * The certificate chain (in PEM format) for this CA version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certChainPem")
    private final String certChainPem;

    /**
     * The certificate chain (in PEM format) for this CA version.
     * @return the value
     **/
    public String getCertChainPem() {
        return certChainPem;
    }

    /**
     * The name of the CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionName")
    private final String versionName;

    /**
     * The name of the CA.
     * @return the value
     **/
    public String getVersionName() {
        return versionName;
    }

    /**
     * A property indicating when the CA was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * A property indicating when the CA was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The version number of the CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    private final Long versionNumber;

    /**
     * The version number of the CA.
     * @return the value
     **/
    public Long getVersionNumber() {
        return versionNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    private final Validity validity;

    public Validity getValidity() {
        return validity;
    }

    /**
     * A list of rotation states for this CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stages")
    private final java.util.List<VersionStage> stages;

    /**
     * A list of rotation states for this CA.
     * @return the value
     **/
    public java.util.List<VersionStage> getStages() {
        return stages;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("revocationStatus")
    private final RevocationStatus revocationStatus;

    public RevocationStatus getRevocationStatus() {
        return revocationStatus;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CertificateAuthorityBundle(");
        sb.append("certificateAuthorityId=").append(String.valueOf(this.certificateAuthorityId));
        sb.append(", certificateAuthorityName=")
                .append(String.valueOf(this.certificateAuthorityName));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", certificatePem=").append(String.valueOf(this.certificatePem));
        sb.append(", certChainPem=").append(String.valueOf(this.certChainPem));
        sb.append(", versionName=").append(String.valueOf(this.versionName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(", validity=").append(String.valueOf(this.validity));
        sb.append(", stages=").append(String.valueOf(this.stages));
        sb.append(", revocationStatus=").append(String.valueOf(this.revocationStatus));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateAuthorityBundle)) {
            return false;
        }

        CertificateAuthorityBundle other = (CertificateAuthorityBundle) o;
        return java.util.Objects.equals(this.certificateAuthorityId, other.certificateAuthorityId)
                && java.util.Objects.equals(
                        this.certificateAuthorityName, other.certificateAuthorityName)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.certificatePem, other.certificatePem)
                && java.util.Objects.equals(this.certChainPem, other.certChainPem)
                && java.util.Objects.equals(this.versionName, other.versionName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(this.validity, other.validity)
                && java.util.Objects.equals(this.stages, other.stages)
                && java.util.Objects.equals(this.revocationStatus, other.revocationStatus)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.certificateAuthorityId == null
                                ? 43
                                : this.certificateAuthorityId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateAuthorityName == null
                                ? 43
                                : this.certificateAuthorityName.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.certificatePem == null ? 43 : this.certificatePem.hashCode());
        result = (result * PRIME) + (this.certChainPem == null ? 43 : this.certChainPem.hashCode());
        result = (result * PRIME) + (this.versionName == null ? 43 : this.versionName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result = (result * PRIME) + (this.validity == null ? 43 : this.validity.hashCode());
        result = (result * PRIME) + (this.stages == null ? 43 : this.stages.hashCode());
        result =
                (result * PRIME)
                        + (this.revocationStatus == null ? 43 : this.revocationStatus.hashCode());
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
