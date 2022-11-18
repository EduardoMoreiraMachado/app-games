package br.senai.sp.jandira.games.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.games.R
import br.senai.sp.jandira.games.model.Game

//classe que cria a RecyclerView
class GameAdapter(var gameList: List<Game>, var context: Context): RecyclerView.Adapter<GameAdapter.GameHolder>() {

    fun updateGameList(newGameList: List<Game>) {

        this.gameList = newGameList

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameHolder {

        //mostra o layout que vai inflar no Holder
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_layout, parent, false)

        //retorna o Holder com a view
        return GameHolder(view)

    }

    override fun onBindViewHolder(holder: GameHolder, position: Int) {

        val game = gameList[position]

        holder.textViewTitle.text = game.title
        holder.textViewStudio.text = game.studio
        holder.textViewDescription.text = game.description

    }

    override fun getItemCount(): Int {

        return gameList.size

    }

    //inner class para criar o Holder do Adapter
    class GameHolder(view: View): RecyclerView.ViewHolder(view) {

        val textViewTitle: TextView = view.findViewById(R.id.text_view_title)
        val textViewStudio: TextView = view.findViewById(R.id.text_view_studio)
        val textViewDescription: TextView = view.findViewById(R.id.text_view_description)

    }

}