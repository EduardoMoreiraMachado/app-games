package br.senai.sp.jandira.games.repository;

import android.content.Context
import br.senai.sp.jandira.games.dao.UserDb;
import br.senai.sp.jandira.games.model.User;

//fornece os dados
class UserRepository(context: Context) {

    //instância das funções da classe ContactDb
    private val db = UserDb.getDataBase(context).userDao()

    fun save(user:User): Long {

        return db.save(user)

    }

    fun update(user:User): Int {

        return db.update(user)

    }

    fun delete(user:User): Int {

        return db.delete(user)

    }

    fun getAll():List<User> {

        return db.getAll()

    }

    fun getUserById(id:Int): User {

        return db.getUserById(id)

    }

}