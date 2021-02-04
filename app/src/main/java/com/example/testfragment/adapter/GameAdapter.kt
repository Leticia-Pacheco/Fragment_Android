package com.example.testfragment.adapter

import android.icu.text.Transliterator
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.holder.GameViewHolder
import com.example.testfragment.model.Game

//Adapter é uma interface. Estamos dizendo que ela é do tipo GameViewHolder
class GameAdapter: RecyclerView.Adapter<GameViewHolder>() {

    private var gameList = listOf<Game>()

    fun updateGameList(list: List<Game>) {
        gameList = list
        notifyDataSetChanged() //Toda vez que eu passar novos jogos na lista, esse método vai avisar a recyclerView que isso aconteceu
    }

    // Chamado quando RecyclerView precisa de um novo RecyclerView.ViewHolderdo tipo fornecido para representar um item.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_game_layout, parent, false)

        return GameViewHolder(view)
    }


    // Retorna o número total de itens no conjunto de dados mantido pelo adaptador.
    override fun getItemCount(): Int {
        return gameList.size
    }


    // Chamado por RecyclerView para exibir os dados na posição especificada.
    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        holder.bind(gameList[position])
    }

}