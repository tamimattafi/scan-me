package com.attafitamim.scanner.framework.database.entities.common

import androidx.room.Embedded
import com.attafitamim.scanner.domain.common.Location

data class AddressEntity(
    val fullAddressName: String,
    @Embedded val location: Location
)