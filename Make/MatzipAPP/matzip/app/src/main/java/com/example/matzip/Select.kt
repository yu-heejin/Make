package com.example.matzip

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Select : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.selection)
    }

    fun event5(view: View) {
        val intent = Intent(this, List::class.java)
        startActivity(intent)
    }
}