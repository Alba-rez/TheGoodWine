package com.example.thegoodwine


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Restaurar el estado de la visibilidad de la pantalla de inicio
        if (savedInstanceState != null) {
            val splashVisibility = savedInstanceState.getInt("splashVisibility", View.GONE)
            val splashContainer = findViewById<FrameLayout>(R.id.splash_container)
            splashContainer.visibility = splashVisibility
        }

        // Después de un cierto tiempo, ocultar la pantalla de inicio y mostrar el resto de la interfaz de usuario
        Handler().postDelayed({
            val splashContainer = findViewById<FrameLayout>(R.id.splash_container)
            splashContainer.visibility = View.GONE
            // Aquí puedes mostrar otros elementos de tu interfaz de usuario
        }, 4000) // 4000 milisegundos = 4 segundos


        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val navHostFragment=supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
        val navController=navHostFragment.navController

        // referencia al drawer layout
        val drawer=findViewById<DrawerLayout>(R.id.drawer_layout)

        //configuración de la toolbar
        val builder= AppBarConfiguration.Builder(navController.graph)
        builder.setOpenableLayout(drawer)
        val appBarConfig=builder.build()
        toolbar.setupWithNavController(navController,appBarConfig)

        // enlazar el drawer con el con el sistema de navegación
        val navView=findViewById<NavigationView>(R.id.nav_view)
        navView.setupWithNavController(navController)


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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        // Guardar el estado de la visibilidad de la pantalla de inicio
        val splashContainer = findViewById<FrameLayout>(R.id.splash_container)
        outState.putInt("splashVisibility", splashContainer.visibility)
    }

}

