package com.attafitamim.scanner.domain.entries

data class WebsiteEntry(
    override val id: Int,
    override val creationDate: Long,
    val url: String
) : UserEntry