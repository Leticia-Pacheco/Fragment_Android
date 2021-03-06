package com.example.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.testfragment.fragments.ConsolesFragment
import com.example.testfragment.fragments.GamesFragment
import com.example.testfragment.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), View.OnClickListener,
      BottomNavigationView.OnNavigationItemSelectedListener {

    private  lateinit var buttonHome: Button
    private  lateinit var buttonConsoles: Button
    private  lateinit var buttonGames: Button

    private lateinit var homeFragment: HomeFragment
    private lateinit var gamesFragment: GamesFragment
    private lateinit var consoleFragment: ConsolesFragment

    private  lateinit var bottomNavigation: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonHome = findViewById(R.id.button_home)
        buttonHome.setOnClickListener(this)

        buttonConsoles = findViewById(R.id.button_consoles)
        buttonConsoles.setOnClickListener(this)

        buttonGames = findViewById(R.id.button_games)
        buttonGames.setOnClickListener(this)

        homeFragment = HomeFragment()
        gamesFragment = GamesFragment()
        consoleFragment = ConsolesFragment()

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)
    }

    override  fun onClick(v: View){
        when (v.id){
            R.id.button_home -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()
            }

            R.id.button_consoles -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame, consoleFragment).commit()
            }

            R.id.button_games -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame, gamesFragment).commit()
            }
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.menu_home -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()
            }

            R.id.menu_console -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame, consoleFragment).commit()
            }

            R.id.menu_game -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame, gamesFragment).commit()
            }
        }
        return true
    }
}