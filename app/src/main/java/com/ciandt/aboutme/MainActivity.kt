package com.ciandt.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ciandt.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bioContentScroll.isVerticalScrollBarEnabled=false

        binding.doneButton.setOnClickListener {
            val name = binding.nicknameInput.text.toString()
            if (name.isBlank()){
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            }else{
                binding.textNickname.text = name
                binding.textNickname.visibility = View.VISIBLE
            }

        }
    }
}