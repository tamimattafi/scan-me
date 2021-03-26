package com.attafitamim.scanner.domain.collection

data class Product(
    override val id: Int,
    override val creationDate: Long,
    val name: String,
    val description: String
) : Item