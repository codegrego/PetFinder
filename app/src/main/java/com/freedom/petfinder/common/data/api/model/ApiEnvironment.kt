package com.freedom.petfinder.common.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiEnvironment(
    @Json(name = "cats")
    val cats: Boolean?,
    @Json(name = "children")
    val children: Boolean?,
    @Json(name = "dogs")
    val dogs: Boolean?
)