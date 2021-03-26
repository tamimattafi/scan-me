package com.attafitamim.scanner.domain.collection

data class Text(
    override val id: Int,
    override val creationDate: Long,
    val text: String
) : Item
