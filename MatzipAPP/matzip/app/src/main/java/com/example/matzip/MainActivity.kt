package com.example.matzip

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun event3(view: View) {
        val id: TextView = findViewById(R.id.id)
        val idVal: String = id.text.toString()
        val password: TextView = findViewById(R.id.password)
        val passVal: String = password.text.toString()
        val intent: Intent

        if(idVal.equals("dongduk") && passVal.equals("computer")) {
            intent = Intent(this, Select::class.java)
            startActivity(intent)
        } else {
            val builder = AlertDialog.Builder(this)

            builder.setTitle("아이디 혹은 비밀번호 오류!")
                .setMessage("아이디와 비밀번호를 에브리타임을 참고하여 다시 입력해보세요.")
                .setPositiveButton("확인",
                    DialogInterface.OnClickListener { dialog, id ->
                    })
            val alertDialog = builder.create()

            alertDialog.show()
        }

    }

    fun event4(view: View) {
        val intent = Intent(this, Welcom::class.java)
        startActivity(intent)
    }
}