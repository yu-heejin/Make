package com.example.matzip

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Tori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tori)
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment6())
            .commit()
    }

    fun event12(view: View) {
        var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/directions/-/14142308.524174754,4523680.25340499,%ED%86%A0%EB%A6%AC%EB%8F%88%EA%B0%80%EC%8A%A4,1390157099,PLACE_POI/-/walk?c=14142308.5241748,4523680.2534050,10,0,0,0,dh"))
        startActivity(intent)
    }

    fun event13(view: View) {
        var intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:029199617")
        if(intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }
    }

    fun information4(view: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment6())
            .commit()
    }

    fun photo4(view: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment2())
            .commit()
    }

    fun review4(view: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment1())
            .commit()
    }
}