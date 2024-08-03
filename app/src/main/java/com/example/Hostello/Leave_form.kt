package com.example.Hostello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.Hostello.R.id.buttonsbmit

class Leave_form : AppCompatActivity() {
    private lateinit var spinnerLeaveType: Spinner
    private lateinit var startDatePicker: DatePicker
    private lateinit var endDatePicker: DatePicker
    private lateinit var editTextComment: EditText
    private lateinit var buttonAttachDocument: Button
    private lateinit var buttonSubmit: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leave_form)

        spinnerLeaveType = findViewById(R.id.spinnerLeaveType)
        startDatePicker = findViewById(R.id.startDatePicker)
        endDatePicker = findViewById(R.id.endDatePicker)
        editTextComment = findViewById(R.id.editTextComment)
        buttonSubmit = findViewById(buttonsbmit)

        // Populate the leave type spinner
        val leaveTypes = arrayOf("Sick leave", "Public holiday leave", "Other leave")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, leaveTypes)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerLeaveType.adapter = adapter

        buttonSubmit.setOnClickListener {
            // Handle form submission here
            val selectedLeaveType = spinnerLeaveType.selectedItem.toString()
            val startDate =
                "${startDatePicker.dayOfMonth}/${startDatePicker.month + 1}/${startDatePicker.year}"
            val endDate =
                "${endDatePicker.dayOfMonth}/${endDatePicker.month + 1}/${endDatePicker.year}"
            val comment = editTextComment.text.toString()

            // Implement document attachment logic here if needed

            // You can perform actions with the form data, such as sending it to a server
            // or storing it locally based on your requirements
            Toast.makeText(
                this,
                "Leave Type: $selectedLeaveType\nStart Date: $startDate\nEnd Date: $endDate\nComment: $comment",
                Toast.LENGTH_LONG
            ).show()

            val b = findViewById<Button>(R.id.buttonsbmit)
            b.setOnClickListener {
                val i = Intent(this, Leave_submitted_successfully::class.java)
                startActivity(i)

            }

        }
    }
}
