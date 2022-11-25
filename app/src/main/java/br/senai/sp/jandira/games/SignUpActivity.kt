package br.senai.sp.jandira.games

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import br.senai.sp.jandira.games.databinding.ActivitySignUpBinding
import br.senai.sp.jandira.games.model.Game
import br.senai.sp.jandira.games.model.User
import br.senai.sp.jandira.games.repository.GameRepository
import br.senai.sp.jandira.games.repository.UserRepository
import java.net.IDN

class SignUpActivity : AppCompatActivity() {

    lateinit var binding: ActivitySignUpBinding

    lateinit var userRepository: UserRepository

    lateinit var user: User

    private var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)

        user = User()

        setContentView(binding.root)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.menu_save) {
            save()
            return true

        } else if (item.itemId == R.id.menu_settings) {

            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()

            return true

        } else {

            Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show()

            return true

        }

    }

    private fun save() {

        userRepository = UserRepository(this)

        user.email = binding.editTextNewEmail.text.toString()
        user.password = binding.editTextNewPassword.text.toString()
        user.name = binding.editTextNewName.text.toString()
        user.city = binding.editTextNewCity.text.toString()

        val option = binding.radioGroup!!.checkedRadioButtonId

        user.sex = option.toChar()

        val id = userRepository.save(user)

        Toast.makeText(this, "ID $id", Toast.LENGTH_SHORT).show()

        finish()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.menu_new_user, menu)

        return true

    }

}