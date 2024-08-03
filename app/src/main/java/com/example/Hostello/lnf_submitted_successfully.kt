package com.example.Hostello
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class lnf_submitted_successfully : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lnf_submitted_successfully)
        val e=findViewById<Button>(R.id.chckstat12)
        e.setOnClickListener{
            var i= Intent(this,lost_n_found_status_check::class.java)
            startActivity(i)
        }
    }
}