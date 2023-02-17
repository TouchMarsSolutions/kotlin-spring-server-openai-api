package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param &#x60;object&#x60; 
 * @param &#x60;data&#x60; 
 */
data class ListFilesResponse(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: kotlin.collections.List<OpenAIFile>
) {

}

