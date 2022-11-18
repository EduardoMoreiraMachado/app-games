package br.senai.sp.jandira.games

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import br.senai.sp.jandira.games.databinding.ActivitySignUpBinding
import br.senai.sp.jandira.games.model.Game
import br.senai.sp.jandira.games.repository.GameRepository

class SignUpActivity : AppCompatActivity() {

    lateinit var binding: ActivitySignUpBinding

    lateinit var gameRepository: GameRepository

    lateinit var game: Game

    private var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.menu_save) {
            Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()

            return true

        } else if (item.itemId == R.id.menu_settings) {

            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()

            return true

        } else {

            Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show()

            return true

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.menu_new_user, menu)

        return true

    }

}