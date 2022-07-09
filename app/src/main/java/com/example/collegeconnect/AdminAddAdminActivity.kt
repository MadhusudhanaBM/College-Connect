package com.example.collegeconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

class AdminAddAdminActivity : AppCompatActivity() {
    private var mAuth: FirebaseAuth? = null
    private var mFirebaseDatabaseInstances: FirebaseFirestore? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_add_admin)
        mAuth = FirebaseAuth.getInstance()
        mFirebaseDatabaseInstances = FirebaseFirestore.getInstance()
        supportActionBar?.title="Add Admin"
    }
    fun addAdmin(v: View?){
        var username= (findViewById<View>(R.id.username)as EditText).text.toString().uppercase(Locale.getDefault())
        var password=(findViewById<View>(R.id.pass)as EditText).text.toString()
        var confPass=(findViewById<View>(R.id.confirmpass)as EditText).text.toString()
        try {
            mFirebaseDatabaseInstances?.collection("Admin")?.document(username)?.get()
                ?.addOnSuccessListener { result ->
                    val admin = result.toObject(Admin::class.java)
                    if (admin != null) {
                        Toast.makeText(this, "ERROR: ADMIN RECORD EXISTS", Toast.LENGTH_LONG).show()
                    } else {
                        if (!(password.equals(confPass))) {
                            Toast.makeText(this,
                                " ERROR: PASSWORD AUTHENTICATION FAILED ", Toast.LENGTH_LONG).show()
                        } else {
                            val ad=Admin(username,password)
                            mFirebaseDatabaseInstances?.collection("Admin")?.document(username!!)?.set(ad)
                            Toast.makeText(this, "ADMIN ADDED SUCESSFULLY", Toast.LENGTH_LONG)
                                .show()
                            }
                        }
                }
        }
        catch(e:Exception)
        {
            Toast.makeText(this, "UNEXPECTED ERROR", Toast.LENGTH_LONG).show()
        }

    }
}
class Admin{
    var username=""
    var password=""
    constructor(username:String,password:String){
        this.username=username
        this.password=password
    }
    constructor()
}