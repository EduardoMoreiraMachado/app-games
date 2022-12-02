package br.senai.sp.jandira.games

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.senai.sp.jandira.games.databinding.ActivityMainBinding
import br.senai.sp.jandira.games.repository.GameRepository
import br.senai.sp.jandira.games.repository.UserRepository

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.textViewCreateAccount.setOnClickListener {

            val abrirCadastro = Intent(this, SignUpActivity::class.java)

            startActivity(abrirCadastro)
        }

        binding.buttonLogin.setOnClickListener {
            
            validarLogin()

        }
    }

    private fun validarLogin() {

        var i = 0

        userRepository = UserRepository(this)

        val email = binding.editTextYourEmail.text.toString()
        val senha = binding.editTextYourPassword.text.toString()

        val usuarios = userRepository.getAll()

        while (i < usuarios.size) {

            if (email == usuarios[i].email && senha == usuarios[i].password) {

                val abrirUserGamesActivity = Intent(this, UserGamesActivity::class.java)

                abrirUserGamesActivity.putExtra("id", usuarios[i].id)

                startActivity(abrirUserGamesActivity)


                break

            } else if (i > usuarios.size) {

                Toast.makeText(this, "!!", Toast.LENGTH_SHORT).show()

                break

            }

            i++

        }

    }
}