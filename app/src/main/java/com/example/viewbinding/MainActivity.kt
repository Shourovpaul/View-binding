package com.example.viewbinding

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignIn.setOnClickListener {
           if(binding.checkBoxSignIn.isChecked){
               //Open a new Screen.
           } else{
               binding.checkBoxSignIn.buttonTintList = ColorStateList.valueOf(Color.RED)
               Toast.makeText(this, "Please Accept the Tram & Condition", Toast.LENGTH_SHORT).show()
           }
        }

    }
}