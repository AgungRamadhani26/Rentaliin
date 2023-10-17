package com.example.rentaliin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class ProfilePengguna : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_pengguna)

        // Inten ke dashboard
        val arrowBackProfile: ImageView = findViewById(R.id.arrow_back_profile)
        arrowBackProfile.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.arrow_back_profile -> {
                val intent = Intent(this@ProfilePengguna, Dashboard::class.java)
                startActivity(intent)
            }
        }
    }
}
