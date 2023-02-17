package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param index 
 * @param &#x60;object&#x60; 
 * @param embedding 
 */
data class CreateEmbeddingResponseDataInner(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("embedding", required = true) val embedding: kotlin.collections.List<java.math.BigDecimal>
) {

}

