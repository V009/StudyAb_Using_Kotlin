package com.example.vigne.studyabroad

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView
import android.view.View

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private var loancard: CardView? = null
    private var ideacard: CardView? = null
    private var schoolcard: CardView? = null
    private var updatecard: CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        loancard = findViewById(R.id.loancardId) as CardView
        ideacard = findViewById(R.id.ideacardId) as CardView
        schoolcard = findViewById(R.id.schoolcardId) as CardView
        updatecard = findViewById(R.id.updatecardId) as CardView
        //Define Listener
        loancard!!.setOnClickListener(this)
        ideacard!!.setOnClickListener(this)
        schoolcard!!.setOnClickListener(this)
        updatecard!!.setOnClickListener(this)
    }


    override fun onClick(view: View) {

        val i: Intent
        when (view.id) {
            R.id.schoolcardId -> {
                i = Intent(this, MainActivity::class.java)
                startActivity(i)
            }
            R.id.updatecardId -> {
                i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.usnews.com/best-colleges"))
                startActivity(i)
            }
            R.id.loancardId -> {
                i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.discover.com/student-loans/"))
                startActivity(i)
            }
            R.id.ideacardId -> {
                i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.quora.com/How-do-I-start-preparing-for-the-GRE-TOEFL-and-IELTS"))
                startActivity(i)
            }
            else -> {
            }
        }
    }
}
