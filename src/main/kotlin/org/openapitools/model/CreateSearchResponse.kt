package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.*

/**
 * 
 * @param &#x60;object&#x60; 
 * @param model 
 * @param &#x60;data&#x60; 
 */
data class CreateSearchResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("object") val `object`: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("model") val model: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("data") val `data`: kotlin.collections.List<CreateSearchResponseDataInner>? = null
) {

}

