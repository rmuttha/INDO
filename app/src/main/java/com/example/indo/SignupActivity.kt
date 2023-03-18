package com.example.indo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import java.security.MessageDigest

class SignupActivity : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth

    // Inner class to handle database operations
    inner class MyDatabaseHelper(context: Context) {
        private fun hashPassword(password: String): String {
            val bytes = password.toByteArray()
            val md = MessageDigest.getInstance("SHA-256")
            val digest = md.digest(bytes)
            val hashedPassword = digest.fold("") { str, it -> str + "%02x".format(it) }

            // Debug logging statements
            Log.d("Hashing", "Password: $password")
            Log.d("Hashing", "Hashed password: $hashedPassword")

            return hashedPassword
        }

        // Function to add user to Firebase Authentication
        fun addUser(name: String, email: String, password: String) {
            mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this@SignupActivity) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        val user = mAuth.currentUser
                        Toast.makeText(this@SignupActivity, "User created successfully", Toast.LENGTH_SHORT).show()
                        // Go to login page
                        val intent = Intent(this@SignupActivity, LoginActivity::class.java)
                        startActivity(intent)
                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(this@SignupActivity, "Error creating user", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }

    private lateinit var mNameEditText: EditText
    private lateinit var mEmailEditText: EditText
    private lateinit var mPasswordEditText: EditText
    private lateinit var mConfirmPasswordEditText: EditText
    private lateinit var mSignupButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Initialize views
        mNameEditText = findViewById(R.id.editTextTextPersonName3)
        mEmailEditText = findViewById(R.id.editTextTextPersonName2)
        mPasswordEditText = findViewById(R.id.editTextPassword)
        mConfirmPasswordEditText = findViewById(R.id.editTextRePassword)
        mSignupButton = findViewById(R.id.button3)

        mAuth = FirebaseAuth.getInstance()

        // Create an instance of the database helper class
        val dbHelper = MyDatabaseHelper(this)

        mSignupButton.setOnClickListener {
            // Get user input from the EditText views
            val name = mNameEditText.text.toString()
            val email = mEmailEditText.text.toString()
            val password = mPasswordEditText.text.toString()
            val confirmPassword = mConfirmPasswordEditText.text.toString()

            // Validate user input
            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else if (password != confirmPassword) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            } else {
                // Add user to Firebase Authentication
                dbHelper.addUser(name, email, password)
            }
        }
    }
}
