package com.example.spaceyangu.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.spaceyangu.R
import com.example.spaceyangu.databinding.ClientSignupBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.firestore

class ClientSignUpActivity: AppCompatActivity() {

    private lateinit var binding: ClientSignupBinding

    override fun onCreate(savedInstaceState:Bundle?){
        super.onCreate(savedInstaceState)
        binding = ClientSignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.client_signup)

        val auth: FirebaseAuth = Firebase.auth
        val db = Firebase.firestore

//        firebaseAuth = FirebaseAuth.getInstance()

        binding.registerButton.setOnClickListener{
            val username = binding.textInputEditText.text.toString()
            val email = binding.editTextTextEmailAddress.text.toString()
            val phoneNumber = binding.editTextPhone.text.toString()
            val password = binding.editTextTextPassword.text.toString()
            val confirmPassword = binding.editTextTextPassword2.text.toString()

            if (username.isNotEmpty() && email.isNotEmpty() && phoneNumber.isNotEmpty() &&
                password.isNotEmpty() && confirmPassword.isNotEmpty()){
                if (password == confirmPassword){

                    auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener{ task ->
                        if (task.isSuccessful){
                            val user = auth.currentUser

                            val userRef = db.collection("users").document(user!!.uid)
                            userRef.set(hashMapOf(
                                "username" to username,
                                "phoneNumber" to phoneNumber
                            ))
                                .addOnSuccessListener {
                                    Log.d("TAG", "User created and data stored")
                                    val intent = Intent(this, SignUpActivity::class.java)
                                    startActivity(intent)
                                }
                                .addOnFailureListener {
                                    Log.w("TAG","Error writing additional user data")
                                    Toast.makeText(this, task.exception.toString(), Toast.LENGTH_SHORT).show()
                                }
//                            }else {
//                                Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT.show())
//                            }

//                                .addOnSeccessListener {
//                                    Log.d("TAG", "User created and data stored")
//                                }
//                                .addOnFailureListener { exception ->
//                                    Log.w("TAG","Error writing additional user data")
//                                }

                        } else {
                            Log.w("TAG","createUSerWithEmailAndPassword failed", task.exception)
                        }
                    }
                }else{
                    Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Field cannot be empty", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
        


