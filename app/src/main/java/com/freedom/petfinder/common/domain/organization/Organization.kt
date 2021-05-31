package com.freedom.petfinder.common.domain.organization

import com.freedom.petfinder.common.domain.contact.Contact
import com.freedom.petfinder.common.domain.media.Photo

data class Organization(
    val id: String,
    val contact: Contact,
    val distance: Float,
)