package com.example.launchmodestask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }

    fun gotoSingleTask(view: View) {
        startActivity(Intent(this@MainActivity4, MainActivity::class.java))
    }
}