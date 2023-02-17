package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param hate 
 * @param hateThreatening 
 * @param selfHarm 
 * @param sexual 
 * @param sexualMinors 
 * @param violence 
 * @param violenceGraphic 
 */
data class CreateModerationResponseResultsInnerCategories(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("hate", required = true) val hate: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("hate/threatening", required = true) val hateThreatening: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("self-harm", required = true) val selfHarm: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("sexual", required = true) val sexual: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("sexual/minors", required = true) val sexualMinors: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("violence", required = true) val violence: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("violence/graphic", required = true) val violenceGraphic: kotlin.Boolean
) {

}

