package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.*

/**
 * 
 * @param &#x60;object&#x60; 
 * @param document 
 * @param score 
 */
data class CreateSearchResponseDataInner(

    @Schema(example = "null", description = "")
    @get:JsonProperty("object") val `object`: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("document") val document: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("score") val score: java.math.BigDecimal? = null
) {

}

