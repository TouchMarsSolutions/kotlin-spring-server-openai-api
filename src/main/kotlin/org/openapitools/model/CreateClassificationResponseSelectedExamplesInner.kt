package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.*

/**
 * 
 * @param document 
 * @param text 
 * @param label 
 */
data class CreateClassificationResponseSelectedExamplesInner(

    @Schema(example = "null", description = "")
    @get:JsonProperty("document") val document: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("text") val text: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("label") val label: kotlin.String? = null
) {

}

