package com.example.Hostello

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class raisecomplain_check : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raisecomplain_check)
        val c = findViewById<Button>(R.id.complainbtn1)
        c.setOnClickListener {
            val i = Intent(this,complainform::class.java)
            startActivity(i)
        }
        val d = findViewById<Button>(R.id.complaintbtn2)
        d.setOnClickListener {
            val i = Intent(this, check_complain_status::class.java)
            startActivity(i)
        }


    }

}