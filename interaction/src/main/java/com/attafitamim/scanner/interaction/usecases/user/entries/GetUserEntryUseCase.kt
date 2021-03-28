package com.attafitamim.scanner.interaction.usecases.user.entries

import com.attafitamim.scanner.data.repositories.UserEntriesDataSource
import com.attafitamim.scanner.domain.entries.UserEntry

class GetUserEntryUseCase(private val userEntriesRepository: UserEntriesDataSource) {
    suspend operator fun invoke(entryId: Int) = userEntriesRepository.get(entryId)
}