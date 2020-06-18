package com.globomed.learn

import android.provider.BaseColumns
import android.provider.BaseColumns._ID
import android.provider.Contacts.SettingsColumns.KEY

object GloboMedDBContract {

    object EmployeeEntry : BaseColumns {
        const val TABLE_NAME = "employee"
        const val COLUMN_ID = _ID
        const val COLUMN_NAME = "name"
        const val COLUMN_DOB = "dob"
        const val COLUMN_DESIGNATION = "designation"
        const val COLUMN_SURGEON = "is_surgeon"

        const val SQL_DROP_TABLE = "DROP TABLE IF EXISTS ${EmployeeEntry.TABLE_NAME}"

        const val SQL_CREATE_ENTRIES =
            "CREATE TABLE ${EmployeeEntry.TABLE_NAME} (" +
                    COLUMN_ID  +  " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "$COLUMN_NAME TEXT NOT NULL, " +
                    "$COLUMN_DOB INTEGER NOT NULL, " +
                    "$COLUMN_DESIGNATION TEXT NOT NULL)"

        //alter table to add surgeon column
        const val ALTER_TABLE_1 : String = "ALTER TABLE " +
                "$TABLE_NAME " + "ADD COLUMN " + "$COLUMN_SURGEON INTEGER DEFAULT 0"


    }
}