package com.attafitamim.scanner.domain.collection

class Event(
    override val id: Int,
    override val creationDate: Long,
    val name: String,
    val description: String,
    val address: Address,
    val time: Long
) : Item