package com.example.Hostello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class applyroomchange_check : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_applyroomchange_check)
        val p = findViewById<Button>(R.id.button20)
        p.setOnClickListener {
            val i = Intent(this, room_form::class.java)
            startActivity(i)
        }
        val n = findViewById<Button>(R.id.roomchngbtn3)
        n.setOnClickListener {
            val i = Intent(this, rooomstatus::class.java)
            startActivity(i)
        }

    }
}