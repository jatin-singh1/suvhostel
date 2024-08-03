package com.example.Hostello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Complain_Submitted_successfully : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complain_submitted_successfully)


        val stat=findViewById<Button>(R.id.complainstat1)
        stat.setOnClickListener{
            var i= Intent(this,check_complain_status::class.java)
            startActivity(i)
        }
    }
}