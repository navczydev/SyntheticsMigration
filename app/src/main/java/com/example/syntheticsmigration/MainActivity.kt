package com.example.syntheticsmigration

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import com.example.syntheticsmigration.databinding.ActivityMainBinding
import kotlinx.parcelize.Parcelize

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.tv.text = "ij"
        binding.tv.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("parcel", ParcelMe(id = 20))
            }
            startActivity(intent)
        }
        binding.included.tv2.text = getString(R.string.included_text)
        setContentView(binding.root)
        //null safe sample
        binding.logo
    }
}

@Parcelize
data class ParcelMe(val id: Int = 10) : Parcelable