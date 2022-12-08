package com.example.newapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activitysecond.*

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitysecond)
        val bundle: Bundle = intent.extras!!
        val resId: Int = bundle.getInt("text")
        imView.setImageResource(resId)
    }
}