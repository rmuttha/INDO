package com.example.indo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class LoginActivity : AppCompatActivity() {

    private lateinit var mEmailTextView: TextView
    private lateinit var mPasswordTextView: TextView
    private lateinit var mLoginButton: Button
    private lateinit var mSignupButton: Button
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mAuth = FirebaseAuth.getInstance()

        mEmailTextView = findViewById(R.id.editTextTextPersonName)
        mPasswordTextView = findViewById(R.id.editTextTextPassword)
        mLoginButton = findViewById(R.id.button2)
        mSignupButton = findViewById(R.id.button3)

        mLoginButton.setOnClickListener {
            // Validate user's credentials and perform login logic
            val email = mEmailTextView.text.toString()
            val password = mPasswordTextView.text.toString()

            if (!isInputValid(email, password)) {
                return@setOnClickListener
            }

            mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Login successful, start Navigation activity
                        val intent = Intent(this, Navigation::class.java)
                        startActivity(intent)
                    } else {
                        // Login failed, show error message
                        val errorMessage = task.exception?.message ?: "Invalid email or password"
                        showError(errorMessage)
                    }
                }

        }

        mSignupButton.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun isInputValid(email: String, password: String): Boolean {
        if (email.isEmpty()) {
            mEmailTextView.error = "Email is required"
            mEmailTextView.requestFocus()
            return false
        }

        if (password.isEmpty()) {
            mPasswordTextView.error = "Password is required"
            mPasswordTextView.requestFocus()
            return false
        }

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            mEmailTextView.error = "Invalid email format"
            mEmailTextView.requestFocus()
            return false
        }

        return true
    }
}
