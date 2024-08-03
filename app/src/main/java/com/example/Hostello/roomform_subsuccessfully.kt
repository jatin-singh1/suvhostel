package com.example.Hostello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class roomform_subsuccessfully : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roomform_subsuccessfully)


        val stat = findViewById<Button>(R.id.roomstat1)
        stat.setOnClickListener {
            var i = Intent(this, rooomstatus::class.java)
            startActivity(i)
        }
    }
}