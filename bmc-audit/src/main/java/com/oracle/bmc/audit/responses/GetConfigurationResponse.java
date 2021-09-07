/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.responses;

import com.oracle.bmc.audit.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class GetConfigurationResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The returned Configuration instance.
     */
    private com.oracle.bmc.audit.model.Configuration configuration;

    private GetConfigurationResponse(
            int __httpStatusCode__, com.oracle.bmc.audit.model.Configuration configuration) {
        super(__httpStatusCode__);
        this.configuration = configuration;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetConfigurationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());

            configuration(o.getConfiguration());

            return this;
        }

        public GetConfigurationResponse build() {
            return new GetConfigurationResponse(__httpStatusCode__, configuration);
        }
    }
}
