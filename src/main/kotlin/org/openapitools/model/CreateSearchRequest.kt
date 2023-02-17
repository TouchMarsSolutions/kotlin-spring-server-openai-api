package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.*

/**
 * 
 * @param query Query to search against the documents.
 * @param documents Up to 200 documents to search over, provided as a list of strings.  The maximum document length (in tokens) is 2034 minus the number of tokens in the query.  You should specify either `documents` or a `file`, but not both. 
 * @param file The ID of an uploaded file that contains documents to search over.  You should specify either `documents` or a `file`, but not both. 
 * @param maxRerank The maximum number of documents to be re-ranked and returned by search.  This flag only takes effect when `file` is set. 
 * @param returnMetadata A special boolean flag for showing metadata. If set to `true`, each document entry in the returned JSON will contain a \"metadata\" field.  This flag only takes effect when `file` is set. 
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 */
data class CreateSearchRequest(

    @get:Size(min=1)
    @Schema(example = "the president", required = true, description = "Query to search against the documents.")
    @get:JsonProperty("query", required = true) val query: kotlin.String,

    @get:Size(min=1,max=200) 
    @Schema(example = "['White House', 'hospital', 'school']", description = "Up to 200 documents to search over, provided as a list of strings.  The maximum document length (in tokens) is 2034 minus the number of tokens in the query.  You should specify either `documents` or a `file`, but not both. ")
    @get:JsonProperty("documents") val documents: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "The ID of an uploaded file that contains documents to search over.  You should specify either `documents` or a `file`, but not both. ")
    @get:JsonProperty("file") val file: kotlin.String? = null,

    @get:Min(1)
    @Schema(example = "null", description = "The maximum number of documents to be re-ranked and returned by search.  This flag only takes effect when `file` is set. ")
    @get:JsonProperty("max_rerank") val maxRerank: kotlin.Int? = 200,

    @Schema(example = "null", description = "A special boolean flag for showing metadata. If set to `true`, each document entry in the returned JSON will contain a \"metadata\" field.  This flag only takes effect when `file` is set. ")
    @get:JsonProperty("return_metadata") val returnMetadata: kotlin.Boolean? = false,

    @Schema(example = "user-1234", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
    @get:JsonProperty("user") val user: kotlin.String? = null
) {

}

