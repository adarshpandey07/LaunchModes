package com.example.launchmodestask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText( this,"On Create called", Toast.LENGTH_SHORT).show()
    }

    fun LaunchAnotherActivity(view: View) {
        startActivity(Intent(this@MainActivity2, MainActivity::class.java))
    }
    fun LaunchThisActivityAgain(view: View) {
        startActivity(Intent(this@MainActivity2, MainActivity2::class.java))
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText( this,"On new Intent Called", Toast.LENGTH_SHORT).show()
    }


}