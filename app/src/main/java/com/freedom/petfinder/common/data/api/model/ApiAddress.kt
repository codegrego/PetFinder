package com.freedom.petfinder.common.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiAddress(
    @Json(name = "address1")
    val address1: Any?,
    @Json(name = "address2")
    val address2: Any?,
    @Json(name = "city")
    val city: String?,
    @Json(name = "country")
    val country: String?,
    @Json(name = "postcode")
    val postcode: String?,
    @Json(name = "state")
    val state: String?
)