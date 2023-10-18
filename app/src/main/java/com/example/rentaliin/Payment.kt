package com.example.rentaliin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Payment : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        //Intent ke history jika sudah melakukan payment
        val confirmPayment: Button = findViewById(R.id.btn_confirm_payment)
        confirmPayment.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_confirm_payment -> {
                val intent = Intent(this@Payment, HistoryDashboard::class.java)
                startActivity(intent)
            }
        }
    }
}