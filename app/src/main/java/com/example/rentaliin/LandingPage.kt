package com.example.rentaliin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class LandingPage : AppCompatActivity(), View.OnClickListener {
    //Deklarasi tipe variabel
    private lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        //assign variabel yang sudah di deklarasi
        tv = findViewById(R.id.textView)
        tv.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.textView -> {
                val intent = Intent(this@LandingPage, SignUp::class.java)
                startActivity(intent)
            }
        }
    }
}