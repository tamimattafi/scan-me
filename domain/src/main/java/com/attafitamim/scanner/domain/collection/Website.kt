package com.attafitamim.scanner.domain.collection

data class Website(
    override val id: Int,
    override val creationDate: Long,
    val url: String
) : Item