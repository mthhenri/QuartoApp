package br.edu.up.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun nextActivity(view: View) {
        val intent = Intent(this, SecundaryActivity::class.java)
        startActivity(intent)
        onDestroy()
    }
}