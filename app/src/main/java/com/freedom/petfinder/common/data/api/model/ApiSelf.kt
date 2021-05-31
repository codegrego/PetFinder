package com.freedom.petfinder.common.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiSelf(
    @Json(name = "href")
    val href: String?
)