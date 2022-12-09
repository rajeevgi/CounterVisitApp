package com.programmingwithrajeev.visitorcountapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import com.programmingwithrajeev.visitorcountapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)

        // Initialize an integer counter to count the number of visitors
        var countofvisitors = 0

        // handle for the text view
        val visitCountControl = findViewById<TextView>(R.id.visit_count)

        // set text on the text view
        visitCountControl.text = countofvisitors.toString() /// value

        // handle for the button
        val button_click = findViewById<Button>(R.id.button_click)

        // login to the performed when the button is clicked
        button_click.setOnClickListener{
            countofvisitors += 1
            visitCountControl.text = countofvisitors.toString()
        }



    }
}



