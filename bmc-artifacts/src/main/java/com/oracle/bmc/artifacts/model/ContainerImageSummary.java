/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Container image summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContainerImageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ContainerImageSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "digest",
        "displayName",
        "id",
        "lifecycleState",
        "repositoryId",
        "repositoryName",
        "timeCreated",
        "version"
    })
    public ContainerImageSummary(
            String compartmentId,
            String digest,
            String displayName,
            String id,
            ContainerImage.LifecycleState lifecycleState,
            String repositoryId,
            String repositoryName,
            java.util.Date timeCreated,
            String version) {
        super();
        this.compartmentId = compartmentId;
        this.digest = digest;
        this.displayName = displayName;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.repositoryId = repositoryId;
        this.repositoryName = repositoryName;
        this.timeCreated = timeCreated;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The compartment OCID to which the container image belongs. Inferred from the container repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID to which the container image belongs. Inferred from the container repository.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The container image digest.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("digest")
        private String digest;

        /**
         * The container image digest.
         * @param digest the value to set
         * @return this builder
         **/
        public Builder digest(String digest) {
            this.digest = digest;
            this.__explicitlySet__.add("digest");
            return this;
        }
        /**
         * The repository name and the most recent version associated with the image.
         * If there are no versions associated with the image, then last known version and digest are used instead.
         * If the last known version is unavailable, then 'unknown' is used instead of the version.
         * <p>
         * Example: {@code ubuntu:latest} or {@code ubuntu:latest@sha256:45b23dee08af5e43a7fea6c4cf9c25ccf269ee113168c19722f87876677c5cb2}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The repository name and the most recent version associated with the image.
         * If there are no versions associated with the image, then last known version and digest are used instead.
         * If the last known version is unavailable, then 'unknown' is used instead of the version.
         * <p>
         * Example: {@code ubuntu:latest} or {@code ubuntu:latest@sha256:45b23dee08af5e43a7fea6c4cf9c25ccf269ee113168c19722f87876677c5cb2}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the container image.
         * <p>
         * Example: {@code ocid1.containerimage.oc1..exampleuniqueID}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the container image.
         * <p>
         * Example: {@code ocid1.containerimage.oc1..exampleuniqueID}
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The current state of the container image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ContainerImage.LifecycleState lifecycleState;

        /**
         * The current state of the container image.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ContainerImage.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The OCID of the container repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
        private String repositoryId;

        /**
         * The OCID of the container repository.
         * @param repositoryId the value to set
         * @return this builder
         **/
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            this.__explicitlySet__.add("repositoryId");
            return this;
        }
        /**
         * The container repository name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryName")
        private String repositoryName;

        /**
         * The container repository name.
         * @param repositoryName the value to set
         * @return this builder
         **/
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = repositoryName;
            this.__explicitlySet__.add("repositoryName");
            return this;
        }
        /**
         * An RFC 3339 timestamp indicating when the image was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * An RFC 3339 timestamp indicating when the image was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The most recent version associated with this image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The most recent version associated with this image.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerImageSummary build() {
            ContainerImageSummary __instance__ =
                    new ContainerImageSummary(
                            compartmentId,
                            digest,
                            displayName,
                            id,
                            lifecycleState,
                            repositoryId,
                            repositoryName,
                            timeCreated,
                            version);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerImageSummary o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .digest(o.getDigest())
                            .displayName(o.getDisplayName())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .repositoryId(o.getRepositoryId())
                            .repositoryName(o.getRepositoryName())
                            .timeCreated(o.getTimeCreated())
                            .version(o.getVersion());

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
     * The compartment OCID to which the container image belongs. Inferred from the container repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID to which the container image belongs. Inferred from the container repository.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The container image digest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("digest")
    private final String digest;

    /**
     * The container image digest.
     * @return the value
     **/
    public String getDigest() {
        return digest;
    }

    /**
     * The repository name and the most recent version associated with the image.
     * If there are no versions associated with the image, then last known version and digest are used instead.
     * If the last known version is unavailable, then 'unknown' is used instead of the version.
     * <p>
     * Example: {@code ubuntu:latest} or {@code ubuntu:latest@sha256:45b23dee08af5e43a7fea6c4cf9c25ccf269ee113168c19722f87876677c5cb2}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The repository name and the most recent version associated with the image.
     * If there are no versions associated with the image, then last known version and digest are used instead.
     * If the last known version is unavailable, then 'unknown' is used instead of the version.
     * <p>
     * Example: {@code ubuntu:latest} or {@code ubuntu:latest@sha256:45b23dee08af5e43a7fea6c4cf9c25ccf269ee113168c19722f87876677c5cb2}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the container image.
     * <p>
     * Example: {@code ocid1.containerimage.oc1..exampleuniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the container image.
     * <p>
     * Example: {@code ocid1.containerimage.oc1..exampleuniqueID}
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The current state of the container image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ContainerImage.LifecycleState lifecycleState;

    /**
     * The current state of the container image.
     * @return the value
     **/
    public ContainerImage.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The OCID of the container repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
    private final String repositoryId;

    /**
     * The OCID of the container repository.
     * @return the value
     **/
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * The container repository name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryName")
    private final String repositoryName;

    /**
     * The container repository name.
     * @return the value
     **/
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * An RFC 3339 timestamp indicating when the image was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * An RFC 3339 timestamp indicating when the image was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The most recent version associated with this image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The most recent version associated with this image.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ContainerImageSummary(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", digest=").append(String.valueOf(this.digest));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(", repositoryName=").append(String.valueOf(this.repositoryName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerImageSummary)) {
            return false;
        }

        ContainerImageSummary other = (ContainerImageSummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.digest, other.digest)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.repositoryName, other.repositoryName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.digest == null ? 43 : this.digest.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryName == null ? 43 : this.repositoryName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
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
