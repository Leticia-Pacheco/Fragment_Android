package com.example.testfragment.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.adapter.GameAdapter
import com.example.testfragment.data.GameDataSource
import com.example.testfragment.model.Game

class GamesFragment : Fragment() {

    // lateinit é usado para quando nosso componente é visual

    private lateinit var recyclerGames: RecyclerView
    private val gameAdapter = GameAdapter()
    private var gameList = listOf<Game>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_games, container, false)


        // Instancia a RecyclerView
        recyclerGames = view.findViewById(R.id.recycler_view_games)


        // Determina a orientação da recyclerView (horizontal ou vertical)
        // Para deixar os Cards rodando na vertical
        recyclerGames.layoutManager = LinearLayoutManager(view.context)

        // Para deixar os Cards rodando na horizontal
        // recyclerGames.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)


        // Informar para a recyclerView qual o adapter que ela usará
        recyclerGames.adapter = gameAdapter


        // Dizer ao adapter qual é a fonte de dados
        gameList = GameDataSource.getGames(view.context)


        // Atualizar a lista de jogos do adapter
        gameAdapter.updateGameList(gameList)

        // Tornar o menu visível
        setHasOptionsMenu(true)

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_game, menu)
    }

}