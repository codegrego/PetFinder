package com.freedom.petfinder.common.domain.adress

data class Address(
    val address1: String,
    val address2: String,
    val city: String,
    val country: String,
    val postcode: String,
    val state: String
)