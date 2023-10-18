package com.example.rentaliin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DetailPesanan : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pesanan)

        //Intent ke payment
        val confirmPesan: Button = findViewById(R.id.btn_confirm)
        confirmPesan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_confirm -> {
                val intent = Intent(this@DetailPesanan, Payment::class.java)
                startActivity(intent)
            }
        }
    }
}