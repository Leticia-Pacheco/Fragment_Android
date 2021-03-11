package com.example.testfragment.dao

import android.content.Context
import androidx.room.Room

class Database {
    companion object {
        fun getDatabase(context: Context): AppDataBase {
            return Room.databaseBuilder(
                context,
                AppDataBase::class.java,
                "db_text_fragment").allowMainThreadQueries().build()
        }
    }
}