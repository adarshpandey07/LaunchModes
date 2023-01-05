package com.example.launchmodestask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun LaunchHome(view: View) {
        startActivity(Intent(this@MainActivity, MainActivity::class.java))
    }
    fun LaunchfirstandSecond(view: View) {
        startActivity(Intent(this@MainActivity, MainActivity3::class.java))
        startActivity(Intent(this@MainActivity, MainActivity4::class.java))
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText( this,"On new Intent Called", Toast.LENGTH_SHORT).show()
    }
}