package com.example.Hostello
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class  lost_and_found_form : AppCompatActivity() {

    private lateinit var btnSendData : Button
    private lateinit var edittitle : EditText
    private lateinit var editdesc : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lost_and_found_form)

        btnSendData = findViewById(R.id.saveButton)
        edittitle = findViewById(R.id.uploadTitle)
        editdesc = findViewById(R.id.uploadDesc)

        btnSendData.setOnClickListener {
            startActivity(Intent(this,lost_n_found_status_check::class.java)
                .putExtra("tile",edittitle.text.toString())
                .putExtra("description",editdesc.text.toString()))
        }

    }
}