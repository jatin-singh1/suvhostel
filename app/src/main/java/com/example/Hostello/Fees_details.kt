package com.example.Hostello

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Fees_details : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fees_details)
        val btn = findViewById<Button>(R.id.button_fees)
        btn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://myaccount.somaiya.edu/"))
            startActivity(intent)

        }
            }
        }

