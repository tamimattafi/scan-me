package com.attafitamim.scanner.framework.database.entities.user

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.attafitamim.scanner.framework.database.entities.common.AddressEntity

@Entity
data class UserEntryEntity(
    //Global columns
    @PrimaryKey  val id: Int,
    val creationDate: Long,
    //Recognition columns
    @UserEntryType val type: Int,
    //Common columns
    val name: String,
    val description: String,
    val address: AddressEntity,
    //Website entry columns
    val url: String,
    //Text entry columns
    val body: String,
    //Product entry columns
    val price: Double,
    val currency: String,
    //Event entry columns
    val event: String,
    val time: Long,
    //Contact entry columns
    val number: String,
    val email: String?,
    //Address entry column
    val title: String
)