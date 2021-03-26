package com.attafitamim.scanner.domain.collection

import com.attafitamim.scanner.domain.common.Location

data class Address(
    override val id: Int,
    override val creationDate: Long,
    val name: String,
    val location: Location
) : Item