package com.attafitamim.scanner.domain.entries

data class TextEntry(
    override val id: Int,
    override val creationDate: Long,
    val body: String
) : UserEntry
