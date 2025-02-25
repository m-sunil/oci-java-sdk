/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the user object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = User.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class User {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "firstName",
        "lastName",
        "country",
        "csi",
        "phone",
        "timezone",
        "organizationName",
        "compartmentId",
        "contactEmail"
    })
    public User(
            String key,
            String firstName,
            String lastName,
            String country,
            String csi,
            String phone,
            String timezone,
            String organizationName,
            String compartmentId,
            String contactEmail) {
        super();
        this.key = key;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.csi = csi;
        this.phone = phone;
        this.timezone = timezone;
        this.organizationName = organizationName;
        this.compartmentId = compartmentId;
        this.contactEmail = contactEmail;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique identifier for the user.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * First name of the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        /**
         * First name of the user.
         * @param firstName the value to set
         * @return this builder
         **/
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }
        /**
         * Last name of the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        /**
         * Last name of the user.
         * @param lastName the value to set
         * @return this builder
         **/
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            this.__explicitlySet__.add("lastName");
            return this;
        }
        /**
         * Country of the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Country of the user.
         * @param country the value to set
         * @return this builder
         **/
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /**
         * CSI to be associated to the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("csi")
        private String csi;

        /**
         * CSI to be associated to the user.
         * @param csi the value to set
         * @return this builder
         **/
        public Builder csi(String csi) {
            this.csi = csi;
            this.__explicitlySet__.add("csi");
            return this;
        }
        /**
         * Contact number of the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("phone")
        private String phone;

        /**
         * Contact number of the user.
         * @param phone the value to set
         * @return this builder
         **/
        public Builder phone(String phone) {
            this.phone = phone;
            this.__explicitlySet__.add("phone");
            return this;
        }
        /**
         * Timezone of the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        /**
         * Timezone of the user.
         * @param timezone the value to set
         * @return this builder
         **/
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }
        /**
         * Organization of the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("organizationName")
        private String organizationName;

        /**
         * Organization of the user.
         * @param organizationName the value to set
         * @return this builder
         **/
        public Builder organizationName(String organizationName) {
            this.organizationName = organizationName;
            this.__explicitlySet__.add("organizationName");
            return this;
        }
        /**
         * The OCID of the tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The email of the contact person.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
        private String contactEmail;

        /**
         * The email of the contact person.
         * @param contactEmail the value to set
         * @return this builder
         **/
        public Builder contactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            this.__explicitlySet__.add("contactEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public User build() {
            User __instance__ =
                    new User(
                            key,
                            firstName,
                            lastName,
                            country,
                            csi,
                            phone,
                            timezone,
                            organizationName,
                            compartmentId,
                            contactEmail);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(User o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .firstName(o.getFirstName())
                            .lastName(o.getLastName())
                            .country(o.getCountry())
                            .csi(o.getCsi())
                            .phone(o.getPhone())
                            .timezone(o.getTimezone())
                            .organizationName(o.getOrganizationName())
                            .compartmentId(o.getCompartmentId())
                            .contactEmail(o.getContactEmail());

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
     * Unique identifier for the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique identifier for the user.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * First name of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    private final String firstName;

    /**
     * First name of the user.
     * @return the value
     **/
    public String getFirstName() {
        return firstName;
    }

    /**
     * Last name of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    private final String lastName;

    /**
     * Last name of the user.
     * @return the value
     **/
    public String getLastName() {
        return lastName;
    }

    /**
     * Country of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Country of the user.
     * @return the value
     **/
    public String getCountry() {
        return country;
    }

    /**
     * CSI to be associated to the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    private final String csi;

    /**
     * CSI to be associated to the user.
     * @return the value
     **/
    public String getCsi() {
        return csi;
    }

    /**
     * Contact number of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phone")
    private final String phone;

    /**
     * Contact number of the user.
     * @return the value
     **/
    public String getPhone() {
        return phone;
    }

    /**
     * Timezone of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

    /**
     * Timezone of the user.
     * @return the value
     **/
    public String getTimezone() {
        return timezone;
    }

    /**
     * Organization of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organizationName")
    private final String organizationName;

    /**
     * Organization of the user.
     * @return the value
     **/
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * The OCID of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The email of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
    private final String contactEmail;

    /**
     * The email of the contact person.
     * @return the value
     **/
    public String getContactEmail() {
        return contactEmail;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("User(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", firstName=").append(String.valueOf(this.firstName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", csi=").append(String.valueOf(this.csi));
        sb.append(", phone=").append(String.valueOf(this.phone));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(", organizationName=").append(String.valueOf(this.organizationName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", contactEmail=").append(String.valueOf(this.contactEmail));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User other = (User) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.csi, other.csi)
                && java.util.Objects.equals(this.phone, other.phone)
                && java.util.Objects.equals(this.timezone, other.timezone)
                && java.util.Objects.equals(this.organizationName, other.organizationName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.contactEmail, other.contactEmail)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.csi == null ? 43 : this.csi.hashCode());
        result = (result * PRIME) + (this.phone == null ? 43 : this.phone.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result =
                (result * PRIME)
                        + (this.organizationName == null ? 43 : this.organizationName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.contactEmail == null ? 43 : this.contactEmail.hashCode());
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
