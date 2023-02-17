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
data class CreateModerationResponseResultsInnerCategoryScores(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("hate", required = true) val hate: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("hate/threatening", required = true) val hateThreatening: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("self-harm", required = true) val selfHarm: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("sexual", required = true) val sexual: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("sexual/minors", required = true) val sexualMinors: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("violence", required = true) val violence: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("violence/graphic", required = true) val violenceGraphic: java.math.BigDecimal
) {

}

