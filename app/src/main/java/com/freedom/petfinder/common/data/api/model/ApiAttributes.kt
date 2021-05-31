package com.freedom.petfinder.common.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiAttributes(
    @Json(name = "declawed")
    val declawed: Boolean?,
    @Json(name = "house_trained")
    val houseTrained: Boolean?,
    @Json(name = "shots_current")
    val shotsCurrent: Boolean?,
    @Json(name = "spayed_neutered")
    val spayedNeutered: Boolean?,
    @Json(name = "special_needs")
    val specialNeeds: Boolean?
)