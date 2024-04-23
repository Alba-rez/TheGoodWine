package com.example.thegoodwine

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    private var isIconVisible=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController=findNavController(R.id.fragment_container_view)
        return NavigationUI.onNavDestinationSelected(item, navController )||
                super.onOptionsItemSelected(item)

    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        // Ocultar el ícono de la botella si la pantalla está en modo apaisado
        val isLandscape = resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE
        val isPortrait=resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT
        val bottleIcon = menu.findItem(R.id.chooseFragment)

        if(isLandscape){
            bottleIcon.isVisible
        }
         if(isPortrait){
             bottleIcon.isVisible
         }
        
        return super.onPrepareOptionsMenu(menu)
    }
}

