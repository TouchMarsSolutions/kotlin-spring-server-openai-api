package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param &#x60;object&#x60; 
 * @param createdAt 
 * @param level 
 * @param message 
 */
data class FineTuneEvent(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("level", required = true) val level: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("message", required = true) val message: kotlin.String
) {

}

