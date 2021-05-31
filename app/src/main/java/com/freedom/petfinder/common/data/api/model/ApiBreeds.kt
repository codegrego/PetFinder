package com.freedom.petfinder.common.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiBreeds(
    @Json(name = "mixed")
    val mixed: Boolean?,
    @Json(name = "primary")
    val primary: String?,
    @Json(name = "secondary")
    val secondary: Any?,
    @Json(name = "unknown")
    val unknown: Boolean?
)