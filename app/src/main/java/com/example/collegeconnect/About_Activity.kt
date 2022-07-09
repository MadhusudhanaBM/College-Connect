package com.example.collegeconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class About_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.title="About"
    }
}