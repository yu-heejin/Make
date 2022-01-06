package com.example.matzip

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Ggo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gggo)
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment5())
            .commit()
    }

    fun event10(view: View) {
        var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/directions/-/14142308.524174754,4523680.25340499,%EC%A7%80%EC%A7%80%EA%B3%A0%20%EB%8F%99%EB%8D%95%EC%97%AC%EB%8C%80%EC%A0%90,1390157099,PLACE_POI/-/walk?c=14142327.1256617,4523623.7397518,10,0,0,0,dh"))
        startActivity(intent)
    }

    fun event11(view: View) {
        var intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:029097850")
        if(intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }
    }

    fun information3(view: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment5())
            .commit()
    }

    fun photo3(view: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment2())
            .commit()
    }

    fun review3(view: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, Fragment1())
            .commit()
    }
}