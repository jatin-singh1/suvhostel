package com.example.Hostello

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class applyleave_check : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_applyleave_check)
        val a = findViewById<Button>(R.id.applybtn1)
        a.setOnClickListener {
            val i = Intent(this, Leave_form::class.java)
            startActivity(i)
        }
        val b = findViewById<Button>(R.id.applybtn2)
        b.setOnClickListener {
            val i = Intent(this, Status_form::class.java)
            startActivity(i)

        }

    }
}

