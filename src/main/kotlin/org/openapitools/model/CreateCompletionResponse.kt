package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.*

/**
 * 
 * @param id 
 * @param &#x60;object&#x60; 
 * @param created 
 * @param model 
 * @param choices 
 * @param usage 
 */
data class CreateCompletionResponse(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("created", required = true) val created: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("choices", required = true) val choices: kotlin.collections.List<CreateCompletionResponseChoicesInner>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("usage") val usage: CreateCompletionResponseUsage? = null
) {

}

