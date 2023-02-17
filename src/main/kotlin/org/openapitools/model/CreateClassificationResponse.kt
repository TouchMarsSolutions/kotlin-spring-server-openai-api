package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.*

/**
 * 
 * @param &#x60;object&#x60; 
 * @param model 
 * @param searchModel 
 * @param completion 
 * @param label 
 * @param selectedExamples 
 */
data class CreateClassificationResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("object") val `object`: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("model") val model: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("search_model") val searchModel: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("completion") val completion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("label") val label: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("selected_examples") val selectedExamples: kotlin.collections.List<CreateClassificationResponseSelectedExamplesInner>? = null
) {

}

