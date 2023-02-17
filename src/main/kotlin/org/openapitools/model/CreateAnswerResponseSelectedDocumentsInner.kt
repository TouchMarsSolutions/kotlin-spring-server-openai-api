package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.*

/**
 * 
 * @param document 
 * @param text 
 */
data class CreateAnswerResponseSelectedDocumentsInner(

    @Schema(example = "null", description = "")
    @get:JsonProperty("document") val document: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("text") val text: kotlin.String? = null
) {

}

