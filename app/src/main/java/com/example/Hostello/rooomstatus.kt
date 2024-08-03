package com.example.Hostello
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class rooomstatus : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var radioButtonSolved: RadioButton
    private lateinit var radioButtonPending: RadioButton
    private lateinit var buttonSubmit: Button
    private lateinit var textViewStatus: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rooomstatus)

        radioGroup = findViewById(R.id.radioGroup1)
        radioButtonSolved = findViewById(R.id.radioButtonSolved1)
        radioButtonPending = findViewById(R.id.radioButtonPending1)
        buttonSubmit = findViewById(R.id.buttonSubmit1)
        textViewStatus = findViewById(R.id.textViewStatus1)

        buttonSubmit.setOnClickListener {
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            if (selectedRadioButtonId == radioButtonSolved.id) {
                textViewStatus.text = "Status: Solved"
            } else if (selectedRadioButtonId == radioButtonPending.id) {
                textViewStatus.text = "Status: Pending"
            }
        }
    }
}
