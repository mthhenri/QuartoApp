package br.edu.up.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TertiaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun nextActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        onDestroy()
    }
}