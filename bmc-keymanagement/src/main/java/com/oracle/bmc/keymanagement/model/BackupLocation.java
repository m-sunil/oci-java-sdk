/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Backup upload location
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "destination",
    defaultImpl = BackupLocation.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BackupLocationBucket.class,
        name = "BUCKET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BackupLocationURI.class,
        name = "PRE_AUTHENTICATED_REQUEST_URI"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BackupLocation {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected BackupLocation() {
        super();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BackupLocation(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupLocation)) {
            return false;
        }

        BackupLocation other = (BackupLocation) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }

    /**
     * 'Backup location destination:
     * BUCKET - Uploading or downloading backup via object store bucket
     * PRE_AUTHENTICATED_REQUEST_URI - Uploading or downloading backup via a PreAuthenticated object store URI'
     *
     **/
    public enum Destination {
        Bucket("BUCKET"),
        PreAuthenticatedRequestUri("PRE_AUTHENTICATED_REQUEST_URI"),
        ;

        private final String value;
        private static java.util.Map<String, Destination> map;

        static {
            map = new java.util.HashMap<>();
            for (Destination v : Destination.values()) {
                map.put(v.getValue(), v);
            }
        }

        Destination(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Destination create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Destination: " + key);
        }
    };
}
