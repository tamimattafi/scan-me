package com.attafitamim.scanner.data.sources

interface DataSource<T> {

    suspend fun save(item: T)

    suspend fun read(id: Int): T

    suspend fun readAll(): List<T>

    suspend fun update(item: T)

    suspend fun remove(item: T)

}