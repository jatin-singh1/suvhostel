package com.example.Hostello

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class lost_n_found_check : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lost_nfound_check)
        val c = findViewById<Button>(R.id.lnfbtn1)
        c.setOnClickListener {
            val i = Intent(this,lost_and_found_form::class.java)
            startActivity(i)
        }
        val d = findViewById<Button>(R.id.lnfbtn2)
        d.setOnClickListener {
            val i = Intent(this, lost_n_found_status_check::class.java)
            startActivity(i)
        }
    }
}