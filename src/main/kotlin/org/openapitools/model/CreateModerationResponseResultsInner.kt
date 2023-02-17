package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param flagged 
 * @param categories 
 * @param categoryScores 
 */
data class CreateModerationResponseResultsInner(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("flagged", required = true) val flagged: kotlin.Boolean,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("categories", required = true) val categories: CreateModerationResponseResultsInnerCategories,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("category_scores", required = true) val categoryScores: CreateModerationResponseResultsInnerCategoryScores
) {

}

