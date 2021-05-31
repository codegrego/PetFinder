package com.freedom.petfinder.common.domain.contact

import com.freedom.petfinder.common.domain.adress.Address

data class Contact(
    val phone: String,
    val email: String,
    val address: Address
)

