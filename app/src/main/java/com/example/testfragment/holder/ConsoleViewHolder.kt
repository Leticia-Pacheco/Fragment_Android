package com.example.testfragment.holder

import android.view.TextureView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import kotlinx.android.synthetic.main.holder_console_layout.view.*
import com.example.testfragment.model.Console

class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    // Declaração e inicialização das variáveis
    val textConsoleName = itemView.findViewById<TextView>(R.id.name_console)
    val textConsoleCreate = itemView.findViewById<TextView>(R.id.creator_console)
//    val imageConsole = itemView.findViewById<ImageView>(R.id.image_console)
    val realeseData = itemView.findViewById<TextView>(R.id.create_console)

    fun bind(console: Console) {
        textConsoleName.text = console.consoleName
        textConsoleCreate.text = console.consoleMaker
//        imageConsole.setImageDrawable(console.consoleImage)
        realeseData.text = console.consoleReleaseDate
    }
}