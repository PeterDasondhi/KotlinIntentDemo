package com.example.leometric.kotlindemoone

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener(View.OnClickListener {
            nextActivity()
        })
    }


    fun nextActivity() {
        var intent = Intent(this@MainActivity, NextActivity::class.java);
        intent.putExtra("user_name","Abhay")
        intent.putExtra("password","00000")
        startActivity(intent);
    }
}
