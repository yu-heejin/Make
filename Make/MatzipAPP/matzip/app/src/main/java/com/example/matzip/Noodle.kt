package com.example.matzip

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Noodle : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.noodle)
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment4())
            .commit()
    }

    fun event8(view: View) {
        var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/directions/-/14142327.12566166,4523623.739751754,%EB%88%84%EB%93%A4%EC%95%84%ED%95%9C%ED%83%80%EC%9D%B4,1986824533,PLACE_POI/-/walk?c=14142327.1256617,4523623.7397518,10,0,0,0,dh"))
        startActivity(intent)
    }

    fun event9(view: View) {
        var intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:050714157178")
        if(intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }
    }

    fun information2(view: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment4())
            .commit()
    }

    fun photo2(view: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment2())
            .commit()
    }

    fun review2(view: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment1())
            .commit()
    }

}