package com.example.leometric.kotlindemoone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main2.*

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setTitle("I am Abhay")

        var bundle = intent;
        if (bundle!=null) {
            var user_name = bundle.getStringExtra("user_name");
            var password = bundle.getStringExtra("password")

            username.setText(user_name)
            pwd.setText(password)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }
    override fun onBackPressed() {
        super.onBackPressed()
    }

}
