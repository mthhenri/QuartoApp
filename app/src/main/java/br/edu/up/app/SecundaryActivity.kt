package br.edu.up.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SecundaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun nextActivity(view: View) {
        val intent = Intent(this, TertiaryActivity::class.java)
        startActivity(intent)
        onDestroy()
    }
}