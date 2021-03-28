package com.attafitamim.scanner.domain.entries

import com.attafitamim.scanner.domain.common.Address

data class AddressEntry(
    override val id: Int,
    override val creationDate: Long,
    val title: String,
    val address: Address
) : UserEntry