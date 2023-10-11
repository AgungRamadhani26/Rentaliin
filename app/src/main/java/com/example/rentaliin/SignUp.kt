package com.example.rentaliin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignUp : AppCompatActivity(), View.OnClickListener {
    //Deklarasi tipe dari variabel
    private lateinit var etFirstName: EditText
    private lateinit var etLastName: EditText
    private lateinit var etEmailAddress: EditText
    private lateinit var etPhoneNumber: EditText
    private lateinit var etSetPassword: EditText
    private lateinit var tvLoginHere: TextView
    private lateinit var btnSignUp: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        //assign variabel yang sudah di deklarasi
        etFirstName = findViewById(R.id.edit_first_name)
        etLastName = findViewById(R.id.last_name)
        etEmailAddress = findViewById(R.id.edit_email_address)
        etPhoneNumber = findViewById(R.id.edit_phone_number)
        etSetPassword = findViewById(R.id.edit_set_password)
        tvLoginHere =findViewById(R.id.login_here)
        tvLoginHere.setOnClickListener(this)
        btnSignUp = findViewById(R.id.btn_signup)
        btnSignUp.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_signup -> {
                val  bundle = Bundle()
                bundle.putString("first_name", etFirstName.text.toString())
                bundle.putString("last_name", etLastName.text.toString())
                bundle.putString("email_address", etEmailAddress.text.toString())
                bundle.putString("phone_number", etPhoneNumber.text.toString())
                bundle.putString("set_password", etSetPassword.text.toString())

                val intent = Intent(this@SignUp, LoginPage::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
            R.id.login_here -> {
                val intent = Intent(this@SignUp, LoginPage::class.java)
                startActivity(intent)
            }
        }
    }
}