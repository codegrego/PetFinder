package com.freedom.petfinder.common.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiColors(
    @Json(name = "primary")
    val primary: String?,
    @Json(name = "secondary")
    val secondary: Any?,
    @Json(name = "tertiary")
    val tertiary: Any?
)