package com.attafitamim.scanner.data.repositories

import com.attafitamim.scanner.data.sources.UserEntriesDataSource
import com.attafitamim.scanner.domain.entries.UserEntry

class UserEntriesDataSource(userEntriesDataSource: UserEntriesDataSource) : Repository<UserEntry>(userEntriesDataSource)

