package com.freedom.petfinder.common.domain.media

data class Photo(
    val full: String,
    val large: String,
    val medium: String,
    val small: String
)
{
    companion object {
        const val EMPTY_PHOTO = ""
    }

    fun getSmallestAvailablePhoto(): String {
        return when {
            isValidPhoto(small) -> small
            isValidPhoto(medium) -> medium
            isValidPhoto(large) -> large
            isValidPhoto(full) -> full
            else -> EMPTY_PHOTO
        }
    }

    private fun isValidPhoto(photo: String): Boolean {
        return photo.isNotEmpty()
    }
}