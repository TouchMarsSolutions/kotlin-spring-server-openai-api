package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param created 
 * @param &#x60;data&#x60; 
 */
data class ImagesResponse(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("created", required = true) val created: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: kotlin.collections.List<ImagesResponseDataInner>
) {

}

