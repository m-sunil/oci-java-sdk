/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The health check policy's configuration details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HealthCheckerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HealthCheckerDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "protocol",
        "urlPath",
        "port",
        "returnCode",
        "retries",
        "timeoutInMillis",
        "intervalInMillis",
        "responseBodyRegex"
    })
    public HealthCheckerDetails(
            String protocol,
            String urlPath,
            Integer port,
            Integer returnCode,
            Integer retries,
            Integer timeoutInMillis,
            Integer intervalInMillis,
            String responseBodyRegex) {
        super();
        this.protocol = protocol;
        this.urlPath = urlPath;
        this.port = port;
        this.returnCode = returnCode;
        this.retries = retries;
        this.timeoutInMillis = timeoutInMillis;
        this.intervalInMillis = intervalInMillis;
        this.responseBodyRegex = responseBodyRegex;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The protocol the health check must use; either HTTP or TCP.
         * <p>
         * Example: {@code HTTP}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        /**
         * The protocol the health check must use; either HTTP or TCP.
         * <p>
         * Example: {@code HTTP}
         *
         * @param protocol the value to set
         * @return this builder
         **/
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /**
         * The path against which to run the health check.
         * <p>
         * Example: {@code /healthcheck}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("urlPath")
        private String urlPath;

        /**
         * The path against which to run the health check.
         * <p>
         * Example: {@code /healthcheck}
         *
         * @param urlPath the value to set
         * @return this builder
         **/
        public Builder urlPath(String urlPath) {
            this.urlPath = urlPath;
            this.__explicitlySet__.add("urlPath");
            return this;
        }
        /**
         * The backend server port against which to run the health check. If the port is not specified, the load balancer uses the
         * port information from the {@code Backend} object.
         * <p>
         * Example: {@code 8080}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The backend server port against which to run the health check. If the port is not specified, the load balancer uses the
         * port information from the {@code Backend} object.
         * <p>
         * Example: {@code 8080}
         *
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The status code a healthy backend server should return.
         * <p>
         * Example: {@code 200}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("returnCode")
        private Integer returnCode;

        /**
         * The status code a healthy backend server should return.
         * <p>
         * Example: {@code 200}
         *
         * @param returnCode the value to set
         * @return this builder
         **/
        public Builder returnCode(Integer returnCode) {
            this.returnCode = returnCode;
            this.__explicitlySet__.add("returnCode");
            return this;
        }
        /**
         * The number of retries to attempt before a backend server is considered "unhealthy". This number also applies
         * when recovering a server to the "healthy" state.
         * <p>
         * Example: {@code 3}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("retries")
        private Integer retries;

        /**
         * The number of retries to attempt before a backend server is considered "unhealthy". This number also applies
         * when recovering a server to the "healthy" state.
         * <p>
         * Example: {@code 3}
         *
         * @param retries the value to set
         * @return this builder
         **/
        public Builder retries(Integer retries) {
            this.retries = retries;
            this.__explicitlySet__.add("retries");
            return this;
        }
        /**
         * The maximum time, in milliseconds, to wait for a reply to a health check. A health check is successful only if a reply
         * returns within this timeout period.
         * <p>
         * Example: {@code 3000}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMillis")
        private Integer timeoutInMillis;

        /**
         * The maximum time, in milliseconds, to wait for a reply to a health check. A health check is successful only if a reply
         * returns within this timeout period.
         * <p>
         * Example: {@code 3000}
         *
         * @param timeoutInMillis the value to set
         * @return this builder
         **/
        public Builder timeoutInMillis(Integer timeoutInMillis) {
            this.timeoutInMillis = timeoutInMillis;
            this.__explicitlySet__.add("timeoutInMillis");
            return this;
        }
        /**
         * The interval between health checks, in milliseconds.
         * <p>
         * Example: {@code 10000}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intervalInMillis")
        private Integer intervalInMillis;

        /**
         * The interval between health checks, in milliseconds.
         * <p>
         * Example: {@code 10000}
         *
         * @param intervalInMillis the value to set
         * @return this builder
         **/
        public Builder intervalInMillis(Integer intervalInMillis) {
            this.intervalInMillis = intervalInMillis;
            this.__explicitlySet__.add("intervalInMillis");
            return this;
        }
        /**
         * A regular expression for parsing the response body from the backend server.
         * <p>
         * Example: {@code ^((?!false).|\\s)*$}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responseBodyRegex")
        private String responseBodyRegex;

        /**
         * A regular expression for parsing the response body from the backend server.
         * <p>
         * Example: {@code ^((?!false).|\\s)*$}
         *
         * @param responseBodyRegex the value to set
         * @return this builder
         **/
        public Builder responseBodyRegex(String responseBodyRegex) {
            this.responseBodyRegex = responseBodyRegex;
            this.__explicitlySet__.add("responseBodyRegex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HealthCheckerDetails build() {
            HealthCheckerDetails __instance__ =
                    new HealthCheckerDetails(
                            protocol,
                            urlPath,
                            port,
                            returnCode,
                            retries,
                            timeoutInMillis,
                            intervalInMillis,
                            responseBodyRegex);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthCheckerDetails o) {
            Builder copiedBuilder =
                    protocol(o.getProtocol())
                            .urlPath(o.getUrlPath())
                            .port(o.getPort())
                            .returnCode(o.getReturnCode())
                            .retries(o.getRetries())
                            .timeoutInMillis(o.getTimeoutInMillis())
                            .intervalInMillis(o.getIntervalInMillis())
                            .responseBodyRegex(o.getResponseBodyRegex());

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
     * The protocol the health check must use; either HTTP or TCP.
     * <p>
     * Example: {@code HTTP}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final String protocol;

    /**
     * The protocol the health check must use; either HTTP or TCP.
     * <p>
     * Example: {@code HTTP}
     *
     * @return the value
     **/
    public String getProtocol() {
        return protocol;
    }

    /**
     * The path against which to run the health check.
     * <p>
     * Example: {@code /healthcheck}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("urlPath")
    private final String urlPath;

    /**
     * The path against which to run the health check.
     * <p>
     * Example: {@code /healthcheck}
     *
     * @return the value
     **/
    public String getUrlPath() {
        return urlPath;
    }

    /**
     * The backend server port against which to run the health check. If the port is not specified, the load balancer uses the
     * port information from the {@code Backend} object.
     * <p>
     * Example: {@code 8080}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The backend server port against which to run the health check. If the port is not specified, the load balancer uses the
     * port information from the {@code Backend} object.
     * <p>
     * Example: {@code 8080}
     *
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * The status code a healthy backend server should return.
     * <p>
     * Example: {@code 200}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("returnCode")
    private final Integer returnCode;

    /**
     * The status code a healthy backend server should return.
     * <p>
     * Example: {@code 200}
     *
     * @return the value
     **/
    public Integer getReturnCode() {
        return returnCode;
    }

    /**
     * The number of retries to attempt before a backend server is considered "unhealthy". This number also applies
     * when recovering a server to the "healthy" state.
     * <p>
     * Example: {@code 3}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retries")
    private final Integer retries;

    /**
     * The number of retries to attempt before a backend server is considered "unhealthy". This number also applies
     * when recovering a server to the "healthy" state.
     * <p>
     * Example: {@code 3}
     *
     * @return the value
     **/
    public Integer getRetries() {
        return retries;
    }

    /**
     * The maximum time, in milliseconds, to wait for a reply to a health check. A health check is successful only if a reply
     * returns within this timeout period.
     * <p>
     * Example: {@code 3000}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMillis")
    private final Integer timeoutInMillis;

    /**
     * The maximum time, in milliseconds, to wait for a reply to a health check. A health check is successful only if a reply
     * returns within this timeout period.
     * <p>
     * Example: {@code 3000}
     *
     * @return the value
     **/
    public Integer getTimeoutInMillis() {
        return timeoutInMillis;
    }

    /**
     * The interval between health checks, in milliseconds.
     * <p>
     * Example: {@code 10000}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalInMillis")
    private final Integer intervalInMillis;

    /**
     * The interval between health checks, in milliseconds.
     * <p>
     * Example: {@code 10000}
     *
     * @return the value
     **/
    public Integer getIntervalInMillis() {
        return intervalInMillis;
    }

    /**
     * A regular expression for parsing the response body from the backend server.
     * <p>
     * Example: {@code ^((?!false).|\\s)*$}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseBodyRegex")
    private final String responseBodyRegex;

    /**
     * A regular expression for parsing the response body from the backend server.
     * <p>
     * Example: {@code ^((?!false).|\\s)*$}
     *
     * @return the value
     **/
    public String getResponseBodyRegex() {
        return responseBodyRegex;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HealthCheckerDetails(");
        sb.append("protocol=").append(String.valueOf(this.protocol));
        sb.append(", urlPath=").append(String.valueOf(this.urlPath));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", returnCode=").append(String.valueOf(this.returnCode));
        sb.append(", retries=").append(String.valueOf(this.retries));
        sb.append(", timeoutInMillis=").append(String.valueOf(this.timeoutInMillis));
        sb.append(", intervalInMillis=").append(String.valueOf(this.intervalInMillis));
        sb.append(", responseBodyRegex=").append(String.valueOf(this.responseBodyRegex));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HealthCheckerDetails)) {
            return false;
        }

        HealthCheckerDetails other = (HealthCheckerDetails) o;
        return java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.urlPath, other.urlPath)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.returnCode, other.returnCode)
                && java.util.Objects.equals(this.retries, other.retries)
                && java.util.Objects.equals(this.timeoutInMillis, other.timeoutInMillis)
                && java.util.Objects.equals(this.intervalInMillis, other.intervalInMillis)
                && java.util.Objects.equals(this.responseBodyRegex, other.responseBodyRegex)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.urlPath == null ? 43 : this.urlPath.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.returnCode == null ? 43 : this.returnCode.hashCode());
        result = (result * PRIME) + (this.retries == null ? 43 : this.retries.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInMillis == null ? 43 : this.timeoutInMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalInMillis == null ? 43 : this.intervalInMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.responseBodyRegex == null ? 43 : this.responseBodyRegex.hashCode());
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
