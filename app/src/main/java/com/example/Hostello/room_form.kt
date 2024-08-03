package com.example.Hostello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class room_form : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_form)

        val spinnerReason: Spinner = findViewById(R.id.spinnerReason)
        val reasons = arrayOf(
            "Roommate compatibility",
            "Conflict",
            "Social and cultural issue",
            "Academic and study needs"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, reasons)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerReason.adapter = adapter

        val buttonSubmit: Button = findViewById(R.id.buttonSubmit1)
        buttonSubmit.setOnClickListener {
            // Get user input from EditText fields
            val roomChangeDetails = findViewById<EditText>(R.id.editTextRoomChange).text.toString()
            val roommateChangeDetails = findViewById<EditText>(R.id.editTextRoommateChange).text.toString()

            // Get selected reason from Spinner
            val selectedReason = spinnerReason.selectedItem.toString()

            // Perform action with the form data (e.g., send to server or handle locally)
            // Implement your logic here to handle the form submission


            val bc = findViewById<Button>(R.id.buttonSubmit1)
            bc.setOnClickListener {
                val i = Intent(this, roomform_subsuccessfully::class.java)
                startActivity(i)

            }
        }
    }
}
