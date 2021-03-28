package com.attafitamim.scanner.domain.entries

data class ProductEntry(
    override val id: Int,
    override val creationDate: Long,
    val name: String,
    val description: String,
    val price: Double,
    val currency: String
) : UserEntry