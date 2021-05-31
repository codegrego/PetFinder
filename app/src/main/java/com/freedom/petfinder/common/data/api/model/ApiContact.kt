package com.freedom.petfinder.common.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiContact(
    @Json(name = "address")
    val address: ApiAddress?,
    @Json(name = "email")
    val email: String?,
    @Json(name = "phone")
    val phone: String?
)