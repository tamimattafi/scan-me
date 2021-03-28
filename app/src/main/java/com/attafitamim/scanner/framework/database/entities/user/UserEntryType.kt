package com.attafitamim.scanner.framework.database.entities.user

import androidx.annotation.IntDef
import com.attafitamim.scanner.framework.database.entities.user.UserEntryType.Companion.ADDRESS
import com.attafitamim.scanner.framework.database.entities.user.UserEntryType.Companion.CONTACT
import com.attafitamim.scanner.framework.database.entities.user.UserEntryType.Companion.EVENT
import com.attafitamim.scanner.framework.database.entities.user.UserEntryType.Companion.PRODUCT
import com.attafitamim.scanner.framework.database.entities.user.UserEntryType.Companion.TEXT
import com.attafitamim.scanner.framework.database.entities.user.UserEntryType.Companion.WEBSITE

@Retention(AnnotationRetention.SOURCE)
@IntDef(ADDRESS, CONTACT, EVENT, PRODUCT, TEXT, WEBSITE)
annotation class UserEntryType {
    companion object {
        const val ADDRESS = 0
        const val CONTACT = 1
        const val EVENT = 2
        const val PRODUCT = 3
        const val TEXT = 4
        const val WEBSITE = 5
    }
}
