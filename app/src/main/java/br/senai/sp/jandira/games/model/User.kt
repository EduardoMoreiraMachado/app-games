package br.senai.sp.jandira.games.model

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Console
import java.time.LocalDate

//definindo a classe como uma entidade do banco de dados
@Entity(tableName = "tbl_user")
class User {

    //definindo a variável como um atributo PK
    @PrimaryKey(autoGenerate = true)
    var id = 0

    //var photo: Bitmap? = null
    var email = ""
    var password = ""
    var name = ""
    var city = ""

    //@ColumnInfo(name = "data_nascimento")
    //var birthDate: LocalDate? = null
    var sex = 'I'
    //var console: Console? = null
    //var level = EnumLevels.BEGINNER

}