package com.example.collegeconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate

class SelectUserTypeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_user_type)
    }
    fun register(v: View?) {
        var i = Intent(applicationContext, RegistrationActivity::class.java)
        startActivity(i)
    }
    fun student(v:View?){
        var i=Intent(applicationContext,Login::class.java)
        i.putExtra("user","STUDENT")
        startActivity(i)

    }
    fun faculty(v:View?){
        var i=Intent(applicationContext,Login::class.java)
        i.putExtra("user","FACULTY")
        startActivity(i)
    }

    fun admin(v:View?){
        var i=Intent(applicationContext,Login::class.java)
        i.putExtra("user","ADMIN")
        startActivity(i)
    }

}