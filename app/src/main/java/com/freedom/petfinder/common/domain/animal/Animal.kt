package com.freedom.petfinder.common.domain.animal

import com.freedom.petfinder.common.domain.contact.Contact
import com.freedom.petfinder.common.domain.media.Media
import com.freedom.petfinder.common.domain.organization.Organization
import java.time.LocalDateTime

data class Animal(
    val id: Int,
    val name: String,
    val distance: Float,
    val environment: Environment,
    val gender: String,
    val organization: Organization,
    val published_at: LocalDateTime,
    val adoptionStatus: AdoptionStatus,
    val tags: List<String>,
    val type: String,
    val url: String,
    val media: Media,
    val details: Details
)

data class Details(
    val age: Age,
    val attributes: Attributes,
    val breeds: Breeds,
    val coat: String,
    val colors: Colors,
    val contact: Contact,
    val description: String,
    val size: String,
    val species: String,
)

enum class Age {
    UNKNOWN,
    BABY,
    YOUNG,
    ADULT,
    SENIOR
}

