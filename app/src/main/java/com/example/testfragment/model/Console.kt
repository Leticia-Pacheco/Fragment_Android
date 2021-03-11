package com.example.testfragment.model

import android.graphics.drawable.Drawable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Console(

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    @ColumnInfo(name = "consoleName")
    var consoleName: String,

    @ColumnInfo(name = "consoleMaker")
    var consoleMaker: String,

    @ColumnInfo(name = "consoleReleaseDate")
    var consoleReleaseDate: String

//    var id: Long,
//    var consoleName: String,
//    var consoleMaker: String,
//    var consoleReleaseDate: String
//    var consoleImage: Drawable
)   /*{
        Aqui usaremos apenas para fazer uma função
    }*/