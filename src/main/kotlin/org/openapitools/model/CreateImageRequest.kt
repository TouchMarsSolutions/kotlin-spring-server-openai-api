package org.openapitools.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.*

/**
 * 
 * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
 * @param n The number of images to generate. Must be between 1 and 10.
 * @param propertySize The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 */
data class CreateImageRequest(

    @Schema(example = "A cute baby sea otter", required = true, description = "A text description of the desired image(s). The maximum length is 1000 characters.")
    @get:JsonProperty("prompt", required = true) val prompt: kotlin.String,

    @get:Min(1)
    @get:Max(10)
    @Schema(example = "1", description = "The number of images to generate. Must be between 1 and 10.")
    @get:JsonProperty("n") val n: kotlin.Int? = 1,

    @Schema(example = "1024x1024", description = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.")
    @get:JsonProperty("size") val propertySize: CreateImageRequest.PropertySize? = PropertySize._1024x1024,

    @Schema(example = "url", description = "The format in which the generated images are returned. Must be one of `url` or `b64_json`.")
    @get:JsonProperty("response_format") val responseFormat: CreateImageRequest.ResponseFormat? = ResponseFormat.url,

    @Schema(example = "user-1234", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
    @get:JsonProperty("user") val user: kotlin.String? = null
) {

    /**
    * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
    * Values: _256x256,_512x512,_1024x1024
    */
    enum class PropertySize(val value: kotlin.String) {

        @JsonProperty("256x256") _256x256("256x256"),
        @JsonProperty("512x512") _512x512("512x512"),
        @JsonProperty("1024x1024") _1024x1024("1024x1024")
    }

    /**
    * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
    * Values: url,b64Json
    */
    enum class ResponseFormat(val value: kotlin.String) {

        @JsonProperty("url") url("url"),
        @JsonProperty("b64_json") b64Json("b64_json")
    }

}

