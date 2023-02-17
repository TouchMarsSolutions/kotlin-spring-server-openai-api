package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param promptTokens 
 * @param completionTokens 
 * @param totalTokens 
 */
data class CreateCompletionResponseUsage(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("prompt_tokens", required = true) val promptTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("completion_tokens", required = true) val completionTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("total_tokens", required = true) val totalTokens: kotlin.Int
) {

}

