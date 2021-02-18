package com.example.testfragment.data

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console

class ConsoleDataSource {

    companion object{
        fun getConsoles(context: Context) : ArrayList<Console> {

            var consoles = ArrayList<Console> ()

            consoles.add(Console(1,
                                 "Playstation 4",
                                 "Ken Kutaragi",
                                 "25-03-2016"))
            consoles.add(Console(2,
                                 "X-box 360",
                                 "Microsoft",
                                 "25-03-2016"))
            consoles.add(Console(3,
                                 "Playstation 4",
                                 "Ken Kutaragi",
                                 "25-03-2016"))
            consoles.add(Console(4,
                                 "Playstation 4",
                                 "Ken Kutaragi",
                                 "25-03-2016"))

            return consoles
        }
    }
}