package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.*
import java.math.BigDecimal

/**
 * 
 * @param model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
 * @param instruction The instruction that tells the model how to edit the prompt.
 * @param input The input text to use as a starting point for the edit.
 * @param n How many edits to generate for the input and instruction.
 * @param temperature What [sampling temperature](https://towardsdatascience.com/how-to-sample-from-language-models-682bceb97277) to use. Higher values means the model will take more risks. Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.  We generally recommend altering this or `top_p` but not both. 
 * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
 */
data class CreateEditRequest(

    @Schema(example = "null", required = true, description = "ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @Schema(example = "Fix the spelling mistakes.", required = true, description = "The instruction that tells the model how to edit the prompt.")
    @get:JsonProperty("instruction", required = true) val instruction: kotlin.String,

    @Schema(example = "What day of the wek is it?", description = "The input text to use as a starting point for the edit.")
    @get:JsonProperty("input") val input: kotlin.String? = "",

    @get:Min(1)
    @get:Max(20)
    @Schema(example = "1", description = "How many edits to generate for the input and instruction.")
    @get:JsonProperty("n") val n: kotlin.Int? = 1,

    @get:DecimalMin("0")
    @get:DecimalMax("2")
    @Schema(example = "1", description = "What [sampling temperature](https://towardsdatascience.com/how-to-sample-from-language-models-682bceb97277) to use. Higher values means the model will take more risks. Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.  We generally recommend altering this or `top_p` but not both. ")
    @get:JsonProperty("temperature") val temperature: BigDecimal? = BigDecimal.ONE,

    @get:DecimalMin("0")
    @get:DecimalMax("1")
    @Schema(example = "1", description = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ")
    @get:JsonProperty("top_p") val topP: java.math.BigDecimal? = BigDecimal.ONE
) {

}

