package com.attafitamim.scanner.domain.collection

data class Contact(
    override val id: Int,
    override val creationDate: Long,
    val name: String,
    val number: String,
    val email: String?,
    val address: String?
) : Item