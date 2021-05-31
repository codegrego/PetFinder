package com.freedom.petfinder.common.domain.pagination

import com.freedom.petfinder.common.domain.link.Link

data class Pagination(
    val count_per_page: Float,
    val total_count: Float,
    val current_page: Float,
    val total_page: Float,
    val _links: List<Link>
)
