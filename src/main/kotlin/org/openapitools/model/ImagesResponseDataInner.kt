package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.*

/**
 * 
 * @param url 
 * @param b64Json 
 */
data class ImagesResponseDataInner(

    @Schema(example = "null", description = "")
    @get:JsonProperty("url") val url: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("b64_json") val b64Json: kotlin.String? = null
) {

}

