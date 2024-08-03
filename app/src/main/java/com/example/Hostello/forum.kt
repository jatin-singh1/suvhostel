package com.example.Hostello
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class  forum: AppCompatActivity() {

    private lateinit var spinnerComplaintType: Spinner
    private lateinit var editTextComplaintDate: EditText
    private lateinit var editTextComment: EditText
    private lateinit var buttonSubmit: Button

    @SuppressLint("MissingInflatedId", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forum)

        spinnerComplaintType = findViewById(R.id.spinnerComplaintType)
        editTextComplaintDate = findViewById(R.id.editTextComplaintDate)
        editTextComment = findViewById(R.id.editTextComment)
        buttonSubmit = findViewById(R.id.btn)

        // Set up ArrayAdapter for spinner
        val complaintTypes = resources.getStringArray(R.array.complaint_types)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, complaintTypes)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerComplaintType.adapter = adapter

        buttonSubmit.setOnClickListener {
            // Perform actions when submit button clicked
            val complaintType = spinnerComplaintType.selectedItem.toString()
            val complaintDate = editTextComplaintDate.text.toString()
            val comment = editTextComment.text.toString()

        }
        val b = findViewById<Button>(R.id.btn)
        b.setOnClickListener {
            val i = Intent(this, Complain_Submitted_successfully::class.java)
            startActivity(i)

        }
    }
}
