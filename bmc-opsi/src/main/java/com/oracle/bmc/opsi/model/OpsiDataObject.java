/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * OPSI data object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "dataObjectType",
    defaultImpl = OpsiDataObject.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HostInsightsDataObject.class,
        name = "HOST_INSIGHTS_DATA_OBJECT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExadataInsightsDataObject.class,
        name = "EXADATA_INSIGHTS_DATA_OBJECT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DatabaseInsightsDataObject.class,
        name = "DATABASE_INSIGHTS_DATA_OBJECT"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class OpsiDataObject {
    @Deprecated
    @java.beans.ConstructorProperties({
        "identifier",
        "displayName",
        "description",
        "columnsMetadata"
    })
    protected OpsiDataObject(
            String identifier,
            String displayName,
            String description,
            java.util.List<DataObjectColumnMetadata> columnsMetadata) {
        super();
        this.identifier = identifier;
        this.displayName = displayName;
        this.description = description;
        this.columnsMetadata = columnsMetadata;
    }

    /**
     * Unique identifier of OPSI data object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Unique identifier of OPSI data object.
     * @return the value
     **/
    public String getIdentifier() {
        return identifier;
    }

    /**
     * User-friendly name of OPSI data object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly name of OPSI data object.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description of OPSI data object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of OPSI data object.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Metadata of columns in a data object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnsMetadata")
    private final java.util.List<DataObjectColumnMetadata> columnsMetadata;

    /**
     * Metadata of columns in a data object.
     * @return the value
     **/
    public java.util.List<DataObjectColumnMetadata> getColumnsMetadata() {
        return columnsMetadata;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OpsiDataObject(");
        sb.append("identifier=").append(String.valueOf(this.identifier));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", columnsMetadata=").append(String.valueOf(this.columnsMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpsiDataObject)) {
            return false;
        }

        OpsiDataObject other = (OpsiDataObject) o;
        return java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.columnsMetadata, other.columnsMetadata);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.columnsMetadata == null ? 43 : this.columnsMetadata.hashCode());
        return result;
    }
}
