package com.example.Hostello

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val go=findViewById<Button>(R.id.btn1)
        val go2=findViewById<Button>(R.id.btn2)

        go.setOnClickListener{
            var i=Intent(this,Login_Page::class.java)
            startActivity(i)
        }
        go2.setOnClickListener{
            var j=Intent(this,Signuppage::class.java)
            startActivity(j)
        }

    }
}