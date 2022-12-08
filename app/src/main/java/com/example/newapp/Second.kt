package com.example.newapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*


class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
    }
}

//var intent = intent
//        val name = intent.getStringExtra("Name")
//        val age = intent.getStringExtra("Age")
//        val  birthdaytext = findViewById<TextView>(R.id.birdthdaytext)
//        birthdaytext.text = "Name:"+name+"\nAge:"+age
//    }

//    fun back(v: View){
//        val intent = Intent(this,MainActivity::class.java)
//        startActivity(intent)


