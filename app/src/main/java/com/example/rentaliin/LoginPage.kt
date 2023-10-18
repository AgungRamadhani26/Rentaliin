package com.example.rentaliin

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginPage : AppCompatActivity(), View.OnClickListener {
    //Deklarasi tipe dari variabel
    private lateinit var etUsernameEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var tvCreateAccount: TextView
    private lateinit var btnLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        //assign varibael yang sudah di Deklarasi
        etUsernameEmail = findViewById(R.id.edit_username)
        etPassword = findViewById(R.id.edit_password)
        tvCreateAccount = findViewById(R.id.create_accont)
        tvCreateAccount.setOnClickListener(this)
        btnLogin = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)

        val bundle = intent.extras
        //jika bundle berisi data / tidak kosong maka akan menampilkan data username dan password pada halaman login
        if (bundle != null){
            etUsernameEmail.setText(bundle.getString("email_address"))
        }

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.create_accont -> {
                val intent = Intent(this@LoginPage, SignUp::class.java)
                startActivity(intent)
            }

            R.id.btn_login -> {
                val intent = Intent(this@LoginPage, Dashboard::class.java)
                startActivity(intent)
            }
        }
    }
}