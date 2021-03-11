package com.example.testfragment.dao

import androidx.room.*
import com.example.testfragment.model.Console

@Dao
interface ConsoleDao {

    @Insert
    fun salvarConsole(console: Console)

    @Update
    fun atualizarConsole(console: Console)

    @Query("SELECT * FROM Console ORDER BY id ASC")
    fun listarConsoles() : List<Console>

    @Query("SELECT * FROM Console WHERE id = :id")
    fun listarConsolesPorId(id: Int) : Console

    @Delete
    fun excluirConsole(console: Console)
}