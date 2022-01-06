package com.example.matzip

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Welcom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)
    }

    fun contract(view: View) {
        val intent = Intent(this, Contract::class.java)
        startActivity(intent)
    }
}