/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A list of basic masking formats compatible with a supported data type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FormatsForDataType.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FormatsForDataType {
    @Deprecated
    @java.beans.ConstructorProperties({"dataType", "maskingFormats"})
    public FormatsForDataType(String dataType, java.util.List<FormatSummary> maskingFormats) {
        super();
        this.dataType = dataType;
        this.maskingFormats = maskingFormats;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The data type category, which can be one of the following -
         *   Character - Includes CHAR, NCHAR, VARCHAR2, and NVARCHAR2
         *   Numeric - Includes NUMBER, FLOAT, RAW, BINARY_FLOAT, and BINARY_DOUBLE
         *   Date - Includes DATE and TIMESTAMP
         *   LOB - Includes BLOB, CLOB, and NCLOB
         *   All - Includes all the supported data types
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * The data type category, which can be one of the following -
         *   Character - Includes CHAR, NCHAR, VARCHAR2, and NVARCHAR2
         *   Numeric - Includes NUMBER, FLOAT, RAW, BINARY_FLOAT, and BINARY_DOUBLE
         *   Date - Includes DATE and TIMESTAMP
         *   LOB - Includes BLOB, CLOB, and NCLOB
         *   All - Includes all the supported data types
         *
         * @param dataType the value to set
         * @return this builder
         **/
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /**
         * An array of the basic masking formats compatible with the data type category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maskingFormats")
        private java.util.List<FormatSummary> maskingFormats;

        /**
         * An array of the basic masking formats compatible with the data type category.
         * @param maskingFormats the value to set
         * @return this builder
         **/
        public Builder maskingFormats(java.util.List<FormatSummary> maskingFormats) {
            this.maskingFormats = maskingFormats;
            this.__explicitlySet__.add("maskingFormats");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FormatsForDataType build() {
            FormatsForDataType __instance__ = new FormatsForDataType(dataType, maskingFormats);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FormatsForDataType o) {
            Builder copiedBuilder = dataType(o.getDataType()).maskingFormats(o.getMaskingFormats());

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
     * The data type category, which can be one of the following -
     *   Character - Includes CHAR, NCHAR, VARCHAR2, and NVARCHAR2
     *   Numeric - Includes NUMBER, FLOAT, RAW, BINARY_FLOAT, and BINARY_DOUBLE
     *   Date - Includes DATE and TIMESTAMP
     *   LOB - Includes BLOB, CLOB, and NCLOB
     *   All - Includes all the supported data types
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * The data type category, which can be one of the following -
     *   Character - Includes CHAR, NCHAR, VARCHAR2, and NVARCHAR2
     *   Numeric - Includes NUMBER, FLOAT, RAW, BINARY_FLOAT, and BINARY_DOUBLE
     *   Date - Includes DATE and TIMESTAMP
     *   LOB - Includes BLOB, CLOB, and NCLOB
     *   All - Includes all the supported data types
     *
     * @return the value
     **/
    public String getDataType() {
        return dataType;
    }

    /**
     * An array of the basic masking formats compatible with the data type category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingFormats")
    private final java.util.List<FormatSummary> maskingFormats;

    /**
     * An array of the basic masking formats compatible with the data type category.
     * @return the value
     **/
    public java.util.List<FormatSummary> getMaskingFormats() {
        return maskingFormats;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FormatsForDataType(");
        sb.append("dataType=").append(String.valueOf(this.dataType));
        sb.append(", maskingFormats=").append(String.valueOf(this.maskingFormats));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormatsForDataType)) {
            return false;
        }

        FormatsForDataType other = (FormatsForDataType) o;
        return java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.maskingFormats, other.maskingFormats)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingFormats == null ? 43 : this.maskingFormats.hashCode());
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
