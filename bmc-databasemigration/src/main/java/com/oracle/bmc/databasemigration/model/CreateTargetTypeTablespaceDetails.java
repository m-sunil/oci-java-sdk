/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Migration tablespace settings.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "targetType",
    defaultImpl = CreateTargetTypeTablespaceDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateNonADBAutoCreateTablespaceDetails.class,
        name = "NON_ADB_AUTOCREATE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateNonADBRemapTablespaceDetails.class,
        name = "NON_ADB_REMAP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateADBDedicatedRemapTargetTablespaceDetails.class,
        name = "ADB_D_REMAP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateADBServerlesTablespaceDetails.class,
        name = "ADB_S_REMAP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateADBDedicatedAutoCreateTablespaceDetails.class,
        name = "ADB_D_AUTOCREATE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateTargetTypeTablespaceDetails {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected CreateTargetTypeTablespaceDetails() {
        super();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateTargetTypeTablespaceDetails(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTargetTypeTablespaceDetails)) {
            return false;
        }

        CreateTargetTypeTablespaceDetails other = (CreateTargetTypeTablespaceDetails) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }
}
