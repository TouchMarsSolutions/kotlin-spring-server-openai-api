package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.*

/**
 * 
 * @param id 
 * @param &#x60;object&#x60; 
 * @param createdAt 
 * @param updatedAt 
 * @param model 
 * @param fineTunedModel 
 * @param organizationId 
 * @param status 
 * @param hyperparams 
 * @param trainingFiles 
 * @param validationFiles 
 * @param resultFiles 
 * @param events 
 */
data class FineTune(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("updated_at", required = true) val updatedAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("fine_tuned_model", required = true) val fineTunedModel: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("organization_id", required = true) val organizationId: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("status", required = true) val status: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("hyperparams", required = true) val hyperparams: kotlin.Any,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("training_files", required = true) val trainingFiles: kotlin.collections.List<OpenAIFile>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("validation_files", required = true) val validationFiles: kotlin.collections.List<OpenAIFile>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("result_files", required = true) val resultFiles: kotlin.collections.List<OpenAIFile>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("events") val events: kotlin.collections.List<FineTuneEvent>? = null
) {

}

