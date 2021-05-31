package com.freedom.petfinder.common.domain.pagination

import com.freedom.petfinder.common.domain.animal.Animal

data class PaginatedAnimals(
    val animals: List<Animal>,
    val pagination: Pagination
)
