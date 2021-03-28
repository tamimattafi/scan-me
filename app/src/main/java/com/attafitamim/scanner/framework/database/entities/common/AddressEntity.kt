package com.attafitamim.scanner.framework.database.entities.common

import com.attafitamim.scanner.domain.common.Location

data class AddressEntity(
    val fullAddressName: String,
    val location: Location
)