package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param id 
 * @param &#x60;object&#x60; 
 * @param created 
 * @param ready 
 */
data class Engine(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("created", required = true) val created: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ready", required = true) val ready: kotlin.Boolean
) {

}

