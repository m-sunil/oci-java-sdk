/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the {@code TrafficProtocolParameters} configuration for the UDP protocol.
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
    builder = UdpTrafficProtocolParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UdpTrafficProtocolParameters extends TrafficProtocolParameters {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The source port to use in a {@code PathAnalyzerTest}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourcePort")
        private Integer sourcePort;

        /**
         * The source port to use in a {@code PathAnalyzerTest}.
         * @param sourcePort the value to set
         * @return this builder
         **/
        public Builder sourcePort(Integer sourcePort) {
            this.sourcePort = sourcePort;
            this.__explicitlySet__.add("sourcePort");
            return this;
        }
        /**
         * The destination port to use in a {@code PathAnalyzerTest}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationPort")
        private Integer destinationPort;

        /**
         * The destination port to use in a {@code PathAnalyzerTest}.
         * @param destinationPort the value to set
         * @return this builder
         **/
        public Builder destinationPort(Integer destinationPort) {
            this.destinationPort = destinationPort;
            this.__explicitlySet__.add("destinationPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UdpTrafficProtocolParameters build() {
            UdpTrafficProtocolParameters __instance__ =
                    new UdpTrafficProtocolParameters(sourcePort, destinationPort);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UdpTrafficProtocolParameters o) {
            Builder copiedBuilder =
                    sourcePort(o.getSourcePort()).destinationPort(o.getDestinationPort());

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

    @Deprecated
    public UdpTrafficProtocolParameters(Integer sourcePort, Integer destinationPort) {
        super();
        this.sourcePort = sourcePort;
        this.destinationPort = destinationPort;
    }

    /**
     * The source port to use in a {@code PathAnalyzerTest}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePort")
    private final Integer sourcePort;

    /**
     * The source port to use in a {@code PathAnalyzerTest}.
     * @return the value
     **/
    public Integer getSourcePort() {
        return sourcePort;
    }

    /**
     * The destination port to use in a {@code PathAnalyzerTest}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationPort")
    private final Integer destinationPort;

    /**
     * The destination port to use in a {@code PathAnalyzerTest}.
     * @return the value
     **/
    public Integer getDestinationPort() {
        return destinationPort;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UdpTrafficProtocolParameters(");
        sb.append("super=").append(super.toString());
        sb.append(", sourcePort=").append(String.valueOf(this.sourcePort));
        sb.append(", destinationPort=").append(String.valueOf(this.destinationPort));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UdpTrafficProtocolParameters)) {
            return false;
        }

        UdpTrafficProtocolParameters other = (UdpTrafficProtocolParameters) o;
        return java.util.Objects.equals(this.sourcePort, other.sourcePort)
                && java.util.Objects.equals(this.destinationPort, other.destinationPort)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sourcePort == null ? 43 : this.sourcePort.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationPort == null ? 43 : this.destinationPort.hashCode());
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
