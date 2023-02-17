package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.*

/**
 * 
 * @param id 
 * @param &#x60;object&#x60; 
 * @param bytes 
 * @param createdAt 
 * @param filename 
 * @param purpose 
 * @param status 
 * @param statusDetails 
 */
data class OpenAIFile(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("bytes", required = true) val bytes: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("filename", required = true) val filename: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("purpose", required = true) val purpose: kotlin.String,

    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status_details") val statusDetails: kotlin.Any? = null
) {

}

