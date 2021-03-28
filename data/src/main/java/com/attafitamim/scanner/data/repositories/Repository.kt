package com.attafitamim.scanner.data.repositories

import com.attafitamim.scanner.data.sources.DataSource

open class Repository<T> (private val dataSource: DataSource<T>) {

    suspend fun add(item: T) = dataSource.save(item)

    suspend fun get(id: Int): T = dataSource.read(id)

    suspend fun getAll(): List<T> = dataSource.readAll()

    suspend fun update(item: T) = dataSource.update(item)

    suspend fun remove(item: T) = dataSource.remove(item)

}