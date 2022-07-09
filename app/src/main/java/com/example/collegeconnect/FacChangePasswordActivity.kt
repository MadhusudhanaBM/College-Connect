package com.example.collegeconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_fac_change_password.*

class FacChangePasswordActivity : AppCompatActivity() {
    private var mAuth: FirebaseAuth? = null
    private var mFirebaseDatabaseInstances: FirebaseFirestore? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fac_change_password)
        mAuth = FirebaseAuth.getInstance()
        mFirebaseDatabaseInstances = FirebaseFirestore.getInstance()
        supportActionBar?.title="Change Password"

    }
    fun newpassword(v:View){
        var i= intent
        var username=i.getStringExtra("FID")
        var currentPass=(findViewById<View>(R.id.currentpass) as EditText).text.toString()
        var newPass=(findViewById<View>(R.id.newpass)as EditText).text.toString()
        var confirmpass=(findViewById<View>(R.id.confirmpass)as EditText).text.toString()

        try {
            mFirebaseDatabaseInstances?.collection("Faculty")!!.document(username.toString()).get()
                .addOnSuccessListener { result ->
                    val fac = result.toObject(Faculty::class.java)
                    if (fac == null) {
                        Toast.makeText(this, "ERROR IN LOADING THE DATA", Toast.LENGTH_LONG).show()
                    } else {
                        if (!(currentPass.equals(fac.password))) {
                            Toast.makeText(this,
                                " ERROR: CURRENT PASSWORD IS NOT CORRECT ",
                                Toast.LENGTH_LONG).show()
                        } else {
                            if (newPass.equals(confirmpass)) {
                                changepass(fac.FID,newPass)
                            } else {
                                Toast.makeText(this,
                                    " ERROR: NEW PASSWORD DOESN'T MATCH WITH THE CONFIRM PASSWORD ",
                                    Toast.LENGTH_LONG).show()
                            }
                        }
                    }
                }

        }
        catch(e:Exception)
        {
            Toast.makeText(this, "UNEXPECTED ERROR", Toast.LENGTH_LONG).show()
        }
    }
    fun changepass(username:String,newpass:String) {
        mFirebaseDatabaseInstances?.collection("Faculty")!!.document(username.toString()).get()
            .addOnSuccessListener { result ->
                val fac = result.toObject(Faculty::class.java)
                if (fac == null) {
                    Toast.makeText(this, "UNEXPECTED ERROR", Toast.LENGTH_LONG).show()
                } else {

                    var u = Faculty(fac.name,
                        fac.honorific,
                        fac.branch,
                        fac.designation,
                        fac.FID,
                        fac.email,
                        fac.mobile,
                        fac.address,
                        newpass,
                        fac.image)
                    mFirebaseDatabaseInstances?.collection("Faculty")?.document(username!!)?.set(u)
                    Toast.makeText(this, "PASSWORD CHANGED SUCESSFULLY", Toast.LENGTH_LONG)
                        .show()

                }
            }
    }
}


