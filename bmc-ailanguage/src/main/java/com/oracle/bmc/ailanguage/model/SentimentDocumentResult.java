/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The document response for sentiment detect call.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SentimentDocumentResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SentimentDocumentResult {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "documentSentiment",
        "documentScores",
        "aspects",
        "sentences",
        "languageCode"
    })
    public SentimentDocumentResult(
            String key,
            String documentSentiment,
            java.util.Map<String, Double> documentScores,
            java.util.List<SentimentAspect> aspects,
            java.util.List<SentimentSentence> sentences,
            String languageCode) {
        super();
        this.key = key;
        this.documentSentiment = documentSentiment;
        this.documentScores = documentScores;
        this.aspects = aspects;
        this.sentences = sentences;
        this.languageCode = languageCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Document Unique Identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Document Unique Identifier.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Document level sentiment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documentSentiment")
        private String documentSentiment;

        /**
         * Document level sentiment.
         * @param documentSentiment the value to set
         * @return this builder
         **/
        public Builder documentSentiment(String documentSentiment) {
            this.documentSentiment = documentSentiment;
            this.__explicitlySet__.add("documentSentiment");
            return this;
        }
        /**
         * Scores for each sentiment.
         * Example: {"positive": 1.0, "negative": 0.0}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documentScores")
        private java.util.Map<String, Double> documentScores;

        /**
         * Scores for each sentiment.
         * Example: {"positive": 1.0, "negative": 0.0}
         *
         * @param documentScores the value to set
         * @return this builder
         **/
        public Builder documentScores(java.util.Map<String, Double> documentScores) {
            this.documentScores = documentScores;
            this.__explicitlySet__.add("documentScores");
            return this;
        }
        /**
         * List of detected aspects sentiment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aspects")
        private java.util.List<SentimentAspect> aspects;

        /**
         * List of detected aspects sentiment.
         * @param aspects the value to set
         * @return this builder
         **/
        public Builder aspects(java.util.List<SentimentAspect> aspects) {
            this.aspects = aspects;
            this.__explicitlySet__.add("aspects");
            return this;
        }
        /**
         * List of detected sentences sentiment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sentences")
        private java.util.List<SentimentSentence> sentences;

        /**
         * List of detected sentences sentiment.
         * @param sentences the value to set
         * @return this builder
         **/
        public Builder sentences(java.util.List<SentimentSentence> sentences) {
            this.sentences = sentences;
            this.__explicitlySet__.add("sentences");
            return this;
        }
        /**
         * Language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        /**
         * Language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
         * @param languageCode the value to set
         * @return this builder
         **/
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SentimentDocumentResult build() {
            SentimentDocumentResult __instance__ =
                    new SentimentDocumentResult(
                            key,
                            documentSentiment,
                            documentScores,
                            aspects,
                            sentences,
                            languageCode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SentimentDocumentResult o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .documentSentiment(o.getDocumentSentiment())
                            .documentScores(o.getDocumentScores())
                            .aspects(o.getAspects())
                            .sentences(o.getSentences())
                            .languageCode(o.getLanguageCode());

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
     * Document Unique Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Document Unique Identifier.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Document level sentiment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentSentiment")
    private final String documentSentiment;

    /**
     * Document level sentiment.
     * @return the value
     **/
    public String getDocumentSentiment() {
        return documentSentiment;
    }

    /**
     * Scores for each sentiment.
     * Example: {"positive": 1.0, "negative": 0.0}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentScores")
    private final java.util.Map<String, Double> documentScores;

    /**
     * Scores for each sentiment.
     * Example: {"positive": 1.0, "negative": 0.0}
     *
     * @return the value
     **/
    public java.util.Map<String, Double> getDocumentScores() {
        return documentScores;
    }

    /**
     * List of detected aspects sentiment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aspects")
    private final java.util.List<SentimentAspect> aspects;

    /**
     * List of detected aspects sentiment.
     * @return the value
     **/
    public java.util.List<SentimentAspect> getAspects() {
        return aspects;
    }

    /**
     * List of detected sentences sentiment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sentences")
    private final java.util.List<SentimentSentence> sentences;

    /**
     * List of detected sentences sentiment.
     * @return the value
     **/
    public java.util.List<SentimentSentence> getSentences() {
        return sentences;
    }

    /**
     * Language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    /**
     * Language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
     * @return the value
     **/
    public String getLanguageCode() {
        return languageCode;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SentimentDocumentResult(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", documentSentiment=").append(String.valueOf(this.documentSentiment));
        sb.append(", documentScores=").append(String.valueOf(this.documentScores));
        sb.append(", aspects=").append(String.valueOf(this.aspects));
        sb.append(", sentences=").append(String.valueOf(this.sentences));
        sb.append(", languageCode=").append(String.valueOf(this.languageCode));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SentimentDocumentResult)) {
            return false;
        }

        SentimentDocumentResult other = (SentimentDocumentResult) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.documentSentiment, other.documentSentiment)
                && java.util.Objects.equals(this.documentScores, other.documentScores)
                && java.util.Objects.equals(this.aspects, other.aspects)
                && java.util.Objects.equals(this.sentences, other.sentences)
                && java.util.Objects.equals(this.languageCode, other.languageCode)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.documentSentiment == null ? 43 : this.documentSentiment.hashCode());
        result =
                (result * PRIME)
                        + (this.documentScores == null ? 43 : this.documentScores.hashCode());
        result = (result * PRIME) + (this.aspects == null ? 43 : this.aspects.hashCode());
        result = (result * PRIME) + (this.sentences == null ? 43 : this.sentences.hashCode());
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
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
