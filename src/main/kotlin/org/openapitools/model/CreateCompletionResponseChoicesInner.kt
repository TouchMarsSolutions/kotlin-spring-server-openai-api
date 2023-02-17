package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.*

/**
 * 
 * @param text 
 * @param index 
 * @param logprobs 
 * @param finishReason 
 */
data class CreateCompletionResponseChoicesInner(

    @Schema(example = "null", description = "")
    @get:JsonProperty("text") val text: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("index") val index: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("logprobs") val logprobs: CreateCompletionResponseChoicesInnerLogprobs? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("finish_reason") val finishReason: kotlin.String? = null
) {

}

