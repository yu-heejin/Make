package com.example.matzip

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.INVISIBLE
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class Somi : AppCompatActivity() {
    //val con : ConstraintLayout = findViewById(R.id.base)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.somi)
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment3())
            .commit()
    }

    fun event1(view: View) {
        var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/directions/-/14142327.12566166,4523623.739751754,%EC%86%8C%EB%AF%B8%EB%84%A4%20%EB%B6%88%20%EB%8B%AD%EA%BC%AC%EC%B9%98,1986824533,PLACE_POI/-/walk?c=14131683.5574523,4508387.5347120,10,0,0,0,dh"))
        startActivity(intent)
    }

    fun event2(view: View) {
        var intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:050714339609")
        if(intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }
    }

    fun information(view: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment3())
            .commit()
    }

    fun photo(view: View) {
        //con.visibility = GONE
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment2())
            .commit()
    }

    fun review(view: View) {
        //con.visibility = GONE
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment1())
            .commit()
    }
}