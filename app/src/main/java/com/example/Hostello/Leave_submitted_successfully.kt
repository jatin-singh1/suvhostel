package com.example.Hostello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Leave_submitted_successfully : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leave_submitted_successfully)

        val z=findViewById<Button>(R.id.chckstat1)
        z.setOnClickListener{
            val i= Intent(this,Status_form::class.java)
            startActivity(i)
        }
    }
}