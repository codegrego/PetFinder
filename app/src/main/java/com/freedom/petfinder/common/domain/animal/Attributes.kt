package com.freedom.petfinder.common.domain.animal

data class Attributes(
    val declawed: Boolean?,
    val house_trained: Boolean?,
    val shots_current: Boolean?,
    val spayed_neutered: Boolean?,
    val special_needs: Boolean?
)