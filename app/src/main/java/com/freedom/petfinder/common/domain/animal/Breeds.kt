package com.freedom.petfinder.common.domain.animal

data class Breeds(
    val primary: String,
    val secondary: String,
){
    val mixed: Boolean
        get() = primary.isNotEmpty() && secondary.isNotEmpty()

    val unknown: Boolean
        get() = primary.isEmpty() && secondary.isEmpty()
}