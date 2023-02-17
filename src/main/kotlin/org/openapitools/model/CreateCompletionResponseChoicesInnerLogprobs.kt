package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.*

/**
 * 
 * @param tokens 
 * @param tokenLogprobs 
 * @param topLogprobs 
 * @param textOffset 
 */
data class CreateCompletionResponseChoicesInnerLogprobs(

    @Schema(example = "null", description = "")
    @get:JsonProperty("tokens") val tokens: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("token_logprobs") val tokenLogprobs: kotlin.collections.List<java.math.BigDecimal>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("top_logprobs") val topLogprobs: kotlin.collections.List<kotlin.Any>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("text_offset") val textOffset: kotlin.collections.List<kotlin.Int>? = null
) {

}

