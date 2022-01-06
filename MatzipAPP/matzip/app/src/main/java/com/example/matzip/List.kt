package com.example.matzip

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list)
    }

    fun event6(view: View) {
        val intent = Intent(this, Somi::class.java)
        startActivity(intent)
    }

    fun event7(view: View) {
        val intent = Intent(this, Noodle::class.java)
        startActivity(intent)
    }

    fun event8(view: View) {
        val intent = Intent(this, Ggo::class.java)
        startActivity(intent)
    }

    fun event14(view: View) {
        val intent = Intent(this, Tori::class.java)
        startActivity(intent)
    }

    fun search(view: View) {
        val searchName: TextView = findViewById(R.id.searchRestaurant)
        val nameVal: String = searchName.text.toString()
        val intent: Intent

        if(nameVal.equals("소미네불닭꼬치")) {
            intent  = Intent(this, Somi::class.java)
            startActivity(intent)
        } else if(nameVal.equals("누들아한타이")) {
            intent  = Intent(this, Noodle::class.java)
            startActivity(intent)
        } else if(nameVal.equals("토리돈가스")) {
            intent  = Intent(this, Tori::class.java)
            startActivity(intent)
        } else if(nameVal.equals("지지고")) {
            intent  = Intent(this, Ggo::class.java)
            startActivity(intent)
        } else {
            val builder = AlertDialog.Builder(this)

            builder
                .setMessage("해당하는 맛집이 없습니다.")
                .setPositiveButton("확인",
                    DialogInterface.OnClickListener { dialog, id ->
                    })
            val alertDialog = builder.create()

            alertDialog.show()
        }
    }
}