package com.example.vigne.studyabroad

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        Handler().postDelayed({
            val i = Intent(this@WelcomeActivity, HomeActivity::class.java)
            startActivity(i)
        }, SPLASH_TIME_OUT.toLong())
    }

    companion object {

        private val SPLASH_TIME_OUT = 4000
    }
}
