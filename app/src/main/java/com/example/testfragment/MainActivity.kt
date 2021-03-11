package com.example.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.testfragment.fragments.ConsolesFragment
import com.example.testfragment.fragments.GamesFragment
import com.example.testfragment.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity(),
      View.OnClickListener,
      BottomNavigationView.OnNavigationItemSelectedListener,
      NavigationView.OnNavigationItemSelectedListener{

//    private  lateinit var buttonHome: Button
//    private  lateinit var buttonConsoles: Button
//    private  lateinit var buttonGames: Button

    private lateinit var buttonNovoConsole: ImageButton
    private lateinit var editNomeConsole: EditText
    private lateinit var editCreatorConsole: EditText
    private lateinit var editCreateConsole: EditText



    private lateinit var homeFragment: HomeFragment
    private lateinit var gamesFragment: GamesFragment
    private lateinit var consoleFragment: ConsolesFragment

    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var navigationView: NavigationView
    private lateinit var toolbar: Toolbar
    private  lateinit var drawer: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) /* savedInstanceState --> serve para salvar o que o usuário já fez, ou seja, caso
                                              ele vire o celular, as informações que já estão cadastradas continuam na tela,
                                              não somem*/

        setContentView(R.layout.drawer_navigation_layout)


//        buttonHome = findViewById(R.id.button_home)
//        buttonHome.setOnClickListener(this)
//
//        buttonConsoles = findViewById(R.id.button_consoles)
//        buttonConsoles.setOnClickListener(this)
//
//        buttonGames = findViewById(R.id.button_games)
//        buttonGames.setOnClickListener(this)

        homeFragment = HomeFragment()
        gamesFragment = GamesFragment()
        consoleFragment = ConsolesFragment()

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        navigationView = findViewById(R.id.navigation_view)
        navigationView.setNavigationItemSelectedListener(this)

        toolbar = findViewById(R.id.toolbar)
        toolbar.title = "Home"
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer)

        // ****Adicionar o botão que abre o drawer menu(menuzinho do lado esquerdo).
        var toggle = ActionBarDrawerToggle(
            this,
            drawer,
            toolbar,
            R.string.open_drawer,
            R.string.close_drawer)

        drawer.addDrawerListener(toggle)
        toggle.syncState() //syncState serve para avisar o android se o drawer está aberto ou fechado.


        setFragment(homeFragment)
    }

    override  fun onClick(v: View){
//        when (v.id){
//            R.id.button_home -> {
//                supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()
//            }
//
//            R.id.button_consoles -> {
//                supportFragmentManager.beginTransaction().replace(R.id.frame, consoleFragment).commit()
//            }
//
//            R.id.button_games -> {
//                supportFragmentManager.beginTransaction().replace(R.id.frame, gamesFragment).commit()
//            }
//        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.menu_home -> {
                toolbar.title = "Home"
                setFragment(homeFragment)
                /*supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()
                * serve para o mesmo que o setFragment*/
            }

            R.id.menu_console -> {
                toolbar.title = "Consoles"
                setFragment(consoleFragment)
            }

            R.id.menu_game -> {
                toolbar.title = "Games"
                setFragment(gamesFragment)
            }
        }

        // **** Selecionar o item de menu correto na BottomNavigationView
        var selectedMenu = bottomNavigation.menu.findItem(item.itemId)
        selectedMenu.setChecked(true)

        // Fechar o drawer se estiver aberto.

        if(drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        }

        return true
    }

    fun setFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, fragment)
            .commit()
    }
}