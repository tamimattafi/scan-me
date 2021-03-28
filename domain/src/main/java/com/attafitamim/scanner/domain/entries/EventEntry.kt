package com.attafitamim.scanner.domain.entries

class EventEntry(
    override val id: Int,
    override val creationDate: Long,
    val name: String,
    val description: String,
    val address: AddressEntry,
    val time: Long
) : UserEntry