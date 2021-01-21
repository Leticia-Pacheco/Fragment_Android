package com.example.testfragment.data

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console
import com.example.testfragment.model.Game

class GameDataSource {
//Não preciso instanciar o GameDataSource porque tudo está dentro de um objeto

    companion object{
        fun getGames(context: Context) : ArrayList<Game> {

            var games = ArrayList<Game> ()

            //Cada campo mencionado aqui é equivalente aos campos escritos no arquivo game(1 = id, "Call of Duty" = nome do jogo e etc). Obrigatóriamente deve seguir a sequência declarada no arquivo principal
            games.add(Game(1,
                           "Call of Duty",
                           context.getDrawable(R.drawable.mortal_kombat)!!, //essas duas exclamações são para confirmar ao AndEst. que a imagem está realmente dentro da pasta drawable
                           "Mortal Kombat é uma série de jogos criados pelo estúdio de Chicago da Midway Games. Em 2011, depois da falência da Midway, a produção de Mortal Kombat foi adquirida pela Warner Bros, tornando-se em seguida na Netherealm.",
                           4.5,
                           listOf(
                                    Console(1, "Playstation 4", "Sony", "1996-12-01"),
                                    Console(2, "Playstation 1", "Sony", "1996-12-05")
                           )))

            games.add(Game(2,
                           "Fifa 19",
                           context.getDrawable(R.drawable.fifa19)!!, //essas duas exclamações são para confirmar ao AndEst. que a imagem está realmente dentro da pasta drawable
                           "FIFA 19 é um jogo eletrônico de futebol desenvolvido publicado pela EA Sports, que foi lançado localmente em 28 de setembro de 2018.",
                           4.5,
                           listOf(
                                    Console(1, "Playstation 4", "Sony", "2018-09-28"),
                                    Console(2, "Xbox 360", "Sony", "2018-10-06")
                           )))

            games.add(Game(3,
                           "Crash",
                           context.getDrawable(R.drawable.crash)!!, //essas duas exclamações são para confirmar ao AndEst. que a imagem está realmente dentro da pasta drawable
                           "Crash Bandicoot é uma série de jogos criada por Andy Gavin e Jason Rubin, fundadores da Naughty Dog. A série consiste basicamente nas aventuras do bandicoot geneticamente alterado Crash, que luta para impedir o planos do cientista do mal Neo Córtex e seus lacaios.",
                           4.5,
                           listOf(
                                    Console(1, "Playstation 4", "Sony", "1996-09-09"),
                                    Console(2, "Xbox 360", "Sony", "1996-09-16")
                           )))

            games.add(Game(4,
                           "Assasin's Creed Odyssey",
                           context.getDrawable(R.drawable.assasins_creed)!!, //essas duas exclamações são para confirmar ao AndEst. que a imagem está realmente dentro da pasta drawable
                           "Assassin's Creed Odyssey é um jogo eletrônico de RPG de ação desenvolvido pela Ubisoft Quebec e publicado pela Ubisoft. É o décimo primeiro título principal da série Assassin's Creed.",
                           4.5,
                           listOf(
                                    Console(1, "Playstation 4", "Sony", "2018-10-05"),
                                    Console(2, "Xbox One", "Sony", "2018-10-23")
                           )))

            return games
        }
    }
}