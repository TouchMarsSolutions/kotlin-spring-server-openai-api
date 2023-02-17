package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param promptTokens 
 * @param totalTokens 
 */
data class CreateEmbeddingResponseUsage(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("prompt_tokens", required = true) val promptTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("total_tokens", required = true) val totalTokens: kotlin.Int
) {

}

