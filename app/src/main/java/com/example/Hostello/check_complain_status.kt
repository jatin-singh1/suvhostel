package com.example.Hostello
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class check_complain_status : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var radioButtonSolved: RadioButton
    private lateinit var radioButtonPending: RadioButton
    private lateinit var buttonSubmit: Button
    private lateinit var textViewStatus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_complain_status)

        radioGroup = findViewById(R.id.radioGroup)
        radioButtonSolved = findViewById(R.id.radioButtonSolved)
        radioButtonPending = findViewById(R.id.radioButtonPending)
        buttonSubmit = findViewById(R.id.buttonSubmit)
        textViewStatus = findViewById(R.id.textViewStatus)

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
