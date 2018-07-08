package com.example.vigne.studyabroad

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    ////////////////////////////////////////////////////////////////////

    internal var Submit_Button: Button?=null
    internal var Verbal: EditText?=null
    internal var Quant: EditText?=null
    internal var Toefl: EditText?=null
    internal var mText: TextView? = null

    fun init() {
        Verbal = findViewById(R.id.editText_Verbal) as EditText
        Quant = findViewById(R.id.editText8) as EditText
        Toefl = findViewById(R.id.editText_Toefl) as EditText

        Submit_Button = findViewById(R.id.button_Submit) as Button
        Submit_Button?.setOnClickListener {
            val verbal_score = Verbal?.text.toString()
            val quant_score = Quant?.text.toString()
            val toefl_score = Toefl?.text.toString()
            val type = "submit"

            //BackgroundWorker backgroundWorker = new BackgroundWorker(MainActivity.this);
            //backgroundWorker.execute(type, verbal_score,quant_score,toefl_score);
            val result = Intent(this@MainActivity, Main2Activity::class.java)
            result.putExtra("verbal_score", verbal_score)
            result.putExtra("quant_score", quant_score)
            result.putExtra("toefl_score", toefl_score)
            result.putExtra("type", type)
            startActivity(result)
        }


    }


    /////////////////////////////////////////////////////////////////
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

    }

}
