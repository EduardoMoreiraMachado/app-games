package br.senai.sp.jandira.games.model

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//definindo a classe como uma entidade do banco de dados
@Entity(tableName = "tbl_game")
class Game {

    //definindo a variável como um atributo PK
    @PrimaryKey(autoGenerate = true)
    var id = 0

    //var photo: Bitmap? = null
    var title = ""
    var description = ""
    var studio = ""
    //var year = Int
    //var status = Boolean

}