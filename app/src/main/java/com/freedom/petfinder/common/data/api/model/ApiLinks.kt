package com.freedom.petfinder.common.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiLinks(
    @Json(name = "organization")
    val organization: ApiOrganization?,
    @Json(name = "self")
    val self: ApiSelf?,
    @Json(name = "type")
    val type: ApiType?
)