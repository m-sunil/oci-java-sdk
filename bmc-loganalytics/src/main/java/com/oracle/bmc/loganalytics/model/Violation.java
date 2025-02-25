/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Violation
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Violation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Violation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "indexes",
        "ruleDescription",
        "ruleName",
        "ruleRemediation",
        "ruleType"
    })
    public Violation(
            java.util.List<Indexes> indexes,
            String ruleDescription,
            String ruleName,
            String ruleRemediation,
            RuleType ruleType) {
        super();
        this.indexes = indexes;
        this.ruleDescription = ruleDescription;
        this.ruleName = ruleName;
        this.ruleRemediation = ruleRemediation;
        this.ruleType = ruleType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The indices associated with regular expression violations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("indexes")
        private java.util.List<Indexes> indexes;

        /**
         * The indices associated with regular expression violations.
         * @param indexes the value to set
         * @return this builder
         **/
        public Builder indexes(java.util.List<Indexes> indexes) {
            this.indexes = indexes;
            this.__explicitlySet__.add("indexes");
            return this;
        }
        /**
         * The rule description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ruleDescription")
        private String ruleDescription;

        /**
         * The rule description.
         * @param ruleDescription the value to set
         * @return this builder
         **/
        public Builder ruleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            this.__explicitlySet__.add("ruleDescription");
            return this;
        }
        /**
         * The rule name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
        private String ruleName;

        /**
         * The rule name.
         * @param ruleName the value to set
         * @return this builder
         **/
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            this.__explicitlySet__.add("ruleName");
            return this;
        }
        /**
         * The rule remediation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ruleRemediation")
        private String ruleRemediation;

        /**
         * The rule remediation.
         * @param ruleRemediation the value to set
         * @return this builder
         **/
        public Builder ruleRemediation(String ruleRemediation) {
            this.ruleRemediation = ruleRemediation;
            this.__explicitlySet__.add("ruleRemediation");
            return this;
        }
        /**
         * The rule type.  Either WARN or ERROR.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ruleType")
        private RuleType ruleType;

        /**
         * The rule type.  Either WARN or ERROR.
         * @param ruleType the value to set
         * @return this builder
         **/
        public Builder ruleType(RuleType ruleType) {
            this.ruleType = ruleType;
            this.__explicitlySet__.add("ruleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Violation build() {
            Violation __instance__ =
                    new Violation(indexes, ruleDescription, ruleName, ruleRemediation, ruleType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Violation o) {
            Builder copiedBuilder =
                    indexes(o.getIndexes())
                            .ruleDescription(o.getRuleDescription())
                            .ruleName(o.getRuleName())
                            .ruleRemediation(o.getRuleRemediation())
                            .ruleType(o.getRuleType());

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
     * The indices associated with regular expression violations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indexes")
    private final java.util.List<Indexes> indexes;

    /**
     * The indices associated with regular expression violations.
     * @return the value
     **/
    public java.util.List<Indexes> getIndexes() {
        return indexes;
    }

    /**
     * The rule description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleDescription")
    private final String ruleDescription;

    /**
     * The rule description.
     * @return the value
     **/
    public String getRuleDescription() {
        return ruleDescription;
    }

    /**
     * The rule name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
    private final String ruleName;

    /**
     * The rule name.
     * @return the value
     **/
    public String getRuleName() {
        return ruleName;
    }

    /**
     * The rule remediation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleRemediation")
    private final String ruleRemediation;

    /**
     * The rule remediation.
     * @return the value
     **/
    public String getRuleRemediation() {
        return ruleRemediation;
    }

    /**
     * The rule type.  Either WARN or ERROR.
     **/
    public enum RuleType {
        Warn("WARN"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RuleType.class);

        private final String value;
        private static java.util.Map<String, RuleType> map;

        static {
            map = new java.util.HashMap<>();
            for (RuleType v : RuleType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RuleType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RuleType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RuleType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The rule type.  Either WARN or ERROR.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleType")
    private final RuleType ruleType;

    /**
     * The rule type.  Either WARN or ERROR.
     * @return the value
     **/
    public RuleType getRuleType() {
        return ruleType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Violation(");
        sb.append("indexes=").append(String.valueOf(this.indexes));
        sb.append(", ruleDescription=").append(String.valueOf(this.ruleDescription));
        sb.append(", ruleName=").append(String.valueOf(this.ruleName));
        sb.append(", ruleRemediation=").append(String.valueOf(this.ruleRemediation));
        sb.append(", ruleType=").append(String.valueOf(this.ruleType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Violation)) {
            return false;
        }

        Violation other = (Violation) o;
        return java.util.Objects.equals(this.indexes, other.indexes)
                && java.util.Objects.equals(this.ruleDescription, other.ruleDescription)
                && java.util.Objects.equals(this.ruleName, other.ruleName)
                && java.util.Objects.equals(this.ruleRemediation, other.ruleRemediation)
                && java.util.Objects.equals(this.ruleType, other.ruleType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.indexes == null ? 43 : this.indexes.hashCode());
        result =
                (result * PRIME)
                        + (this.ruleDescription == null ? 43 : this.ruleDescription.hashCode());
        result = (result * PRIME) + (this.ruleName == null ? 43 : this.ruleName.hashCode());
        result =
                (result * PRIME)
                        + (this.ruleRemediation == null ? 43 : this.ruleRemediation.hashCode());
        result = (result * PRIME) + (this.ruleType == null ? 43 : this.ruleType.hashCode());
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
