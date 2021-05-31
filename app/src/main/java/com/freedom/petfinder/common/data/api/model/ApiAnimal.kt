package com.freedom.petfinder.common.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiAnimal(
    @Json(name = "age")
    val age: String?,
    @Json(name = "attributes")
    val attributes: ApiAttributes?,
    @Json(name = "breeds")
    val breeds: ApiBreeds?,
    @Json(name = "coat")
    val coat: String?,
    @Json(name = "colors")
    val colors: ApiColors?,
    @Json(name = "contact")
    val contact: ApiContact?,
    @Json(name = "description")
    val description: String?,
    @Json(name = "distance")
    val distance: Any?,
    @Json(name = "environment")
    val environment: ApiEnvironment?,
    @Json(name = "gender")
    val gender: String?,
    @Json(name = "id")
    val id: Int?,
    @Json(name = "_links")
    val links: ApiLinks?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "organization_id")
    val organizationId: String?,
    @Json(name = "photos")
    val photos: List<ApiPhoto>?,
    @Json(name = "published_at")
    val publishedAt: String?,
    @Json(name = "size")
    val size: String?,
    @Json(name = "species")
    val species: String?,
    @Json(name = "status")
    val status: String?,
    @Json(name = "tags")
    val tags: List<String>?,
    @Json(name = "type")
    val type: String?,
    @Json(name = "url")
    val url: String?,
    @Json(name = "videos")
    val videos: List<ApiVideo>?
)