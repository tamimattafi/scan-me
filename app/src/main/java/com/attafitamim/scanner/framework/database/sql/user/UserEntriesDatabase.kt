package com.attafitamim.scanner.framework.database.sql.user

import androidx.room.Database
import androidx.room.RoomDatabase
import com.attafitamim.scanner.framework.database.entities.user.UserEntryEntity

@Database(
    version = UserEntriesDatabase.Parameters.VERSION,
    exportSchema = UserEntriesDatabase.Parameters.EXPORT_SCHEME,
    entities = [UserEntryEntity::class]
)
abstract class UserEntriesDatabase : RoomDatabase() {

    abstract fun userEntriesDao(): UserEntriesDao

    object Parameters {
        const val VERSION = 1
        const val EXPORT_SCHEME = false
        const val NAME = "user-entries-database"
    }

}