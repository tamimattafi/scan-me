package com.attafitamim.scanner.interaction.usecases.user.entries

import com.attafitamim.scanner.data.repositories.UserEntriesDataSource
import com.attafitamim.scanner.domain.entries.UserEntry

class GetAllUserEntriesUseCase(private val userEntriesRepository: UserEntriesDataSource) {
    suspend operator fun invoke() = userEntriesRepository.getAll()
}