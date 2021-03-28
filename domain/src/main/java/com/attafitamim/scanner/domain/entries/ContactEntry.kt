package com.attafitamim.scanner.domain.entries

data class ContactEntry(
    override val id: Int,
    override val creationDate: Long,
    val name: String,
    val number: String,
    val email: String?,
    val address: String?
) : UserEntry