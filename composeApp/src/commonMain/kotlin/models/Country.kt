package models

import kotlinx.datetime.TimeZone

data class Country(
    val name: String,
    val zone: TimeZone,
    val image: String
)
