package br.senai.sp.jandira.games.dao

import androidx.room.*
import br.senai.sp.jandira.games.model.Game

@Dao
interface GameDao {

    @Insert
    fun save(game: Game): Long

    @Delete
    fun delete(game: Game): Int

    @Update
    fun update(game: Game): Int

    @Query("select * from tbl_game order by title asc")
    fun getAll(): List<Game>

    @Query("select * from tbl_game where id = :id")
    fun getGameById(id: Int): Game

}