package br.senai.sp.jandira.games.dao

import androidx.room.*
import androidx.room.Dao

import br.senai.sp.jandira.games.model.User;

@Dao
interface UserDao {

    @Insert
    fun save(user: User): Long

    @Delete
    fun delete(user: User): Int

    @Update
    fun update(user: User): Int

    @Query("select * from tbl_user order by name asc")
    fun getAll(): List<User>

    @Query("select * from tbl_user where id = :id")
    fun getUserById(id: Int): User

}