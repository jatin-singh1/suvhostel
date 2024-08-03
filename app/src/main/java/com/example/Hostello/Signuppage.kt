package com.example.Hostello

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class Signuppage : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signuppage)

        var name:EditText=findViewById(R.id.signuppage_name)
        var emailText = findViewById<EditText>(R.id.signuppage_email)
        var passwordText = findViewById<EditText>(R.id.signuppage_password)
        var username:EditText=findViewById(R.id.signuppage_username)
        var signuppageButton = findViewById<Button>(R.id.signupbtn)
        var redirectbtn:TextView=findViewById(R.id.loginRedirectText)
        auth = FirebaseAuth.getInstance()

        // Handle register button click
        signuppageButton.setOnClickListener {
            val email = emailText.text.toString()
            val password = passwordText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                registerUser(email, password)
            } else {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_LONG).show()
            }
        }
        redirectbtn.setOnClickListener {
            val intent = Intent(this, Login_Page::class.java)
            startActivity(intent)
        }
    }

    private fun registerUser(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                    // Send email verification
                    user?.sendEmailVerification()?.addOnCompleteListener { verificationTask ->
                        if (verificationTask.isSuccessful) {
                            // Registration successful, display a success message
                            Toast.makeText(this, "Registration successful. Please check your email for verification.", Toast.LENGTH_LONG).show()
                        } else {
                            // Email verification failed, display an error message
                            Toast.makeText(this, "Email verification failed. Please try again.", Toast.LENGTH_LONG).show()
                        }
                    }
                    // Navigate to the main activity
                    val intent = Intent(this, welcomepage::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    // Registration failed, display an error message
                    Toast.makeText(this, "Registration failed. Please try again.", Toast.LENGTH_LONG).show()
                }
            }
    }
}