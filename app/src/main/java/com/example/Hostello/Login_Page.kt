package com.example.Hostello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login_Page : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        val loginButton = findViewById<Button>(R.id.loginbtn)
        val registerButton = findViewById<TextView>(R.id.signupRedirectText)
        val emailText = findViewById<EditText>(R.id.Login_email)
        val passwordText = findViewById<EditText>(R.id.login_password)
        auth = FirebaseAuth.getInstance()

        // Check if the user is already signed in
        val currentUser = auth.currentUser
        if (currentUser != null) {
            // User is already signed in, navigate to the desired activity
            val intent = Intent(this, welcomepage::class.java)
            intent.putExtra("email", currentUser.email) // Pass the email to the UserPage activity
            startActivity(intent)
            finish()
            return 
        }


        // Handle login button click
        loginButton.setOnClickListener {
            val email = emailText.text.toString()
            val password = passwordText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                loginUser(email, password)
            } else {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }
        }
        // Handle registration button click
        registerButton.setOnClickListener {
            val intent = Intent(this, Signuppage::class.java)
            startActivity(intent)
        }
    }

    private fun loginUser(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Login successful, navigate to the user page activity
                    val intent2=Intent(this, welcomepage::class.java)
                    startActivity(intent2)

                } else {
                    // Login failed, display an error message
                    Toast.makeText(this, "Login failed. Please try again.", Toast.LENGTH_SHORT)
                        .show()
                }

            }
    }
}
