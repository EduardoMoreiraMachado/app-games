package br.senai.sp.jandira.games

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senai.sp.jandira.games.databinding.ActivityUserGamesBinding
import br.senai.sp.jandira.games.repository.UserRepository

class UserGamesActivity : AppCompatActivity() {

    lateinit var binding: ActivityUserGamesBinding
    lateinit var userRepository: UserRepository
    private var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserGamesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userRepository = UserRepository(this)

        id = intent.getIntExtra("id", 0)

        val accountUser = userRepository.getUserById(id)

        binding.textViewUserName.text = accountUser.name
        binding.textViewUserEmail.text = accountUser.email

    }
}