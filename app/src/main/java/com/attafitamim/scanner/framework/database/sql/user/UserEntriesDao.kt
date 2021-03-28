package com.attafitamim.scanner.framework.database.sql.user

import androidx.room.Dao
import com.attafitamim.scanner.framework.database.entities.user.UserEntryEntity
import com.attafitamim.scanner.framework.database.sql.global.BaseDao

@Dao
interface UserEntriesDao : BaseDao<UserEntryEntity>