package com.example.collegeconnect

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var btn=(findViewById<View>(R.id.continuebtn)as Button).setBackgroundColor(Color.BLUE)



    }
    fun continueToNext(v:View?){
        var i=Intent(applicationContext,SelectUserTypeActivity::class.java)
        startActivity(i)
    }

}