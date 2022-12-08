package com.example.exemplemenucontextuel

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var layout : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layout = findViewById(R.id.layout)
        registerForContextMenu(layout)

    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.setHeaderTitle("Context Menu Header")
        menuInflater.inflate(R.menu.contextmenu, menu)

    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.red -> {
                layout.setBackgroundColor(Color.RED)
                true
            }

            R.id.gray -> {
                layout.setBackgroundColor(Color.GRAY)
                true
            }
            R.id.green -> {
                layout.setBackgroundColor(Color.GREEN)
                true
            }

            R.id.yellow -> {
                layout.setBackgroundColor(Color.YELLOW)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

}