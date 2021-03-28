package com.attafitamim.scanner.framework.database.sql.global

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

interface BaseDao<T> {

    @Insert
    suspend fun insert(item: T)

    @Insert
    suspend fun insertAll(items: List<T>)

    @Update
    suspend fun update(item: T)

    @Insert
    suspend fun updateAll(items: List<T>)

    @Delete
    suspend fun remove(item: T)
    
    @Delete
    suspend fun deleteAll(items: List<T>)

}