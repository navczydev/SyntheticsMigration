package com.example.syntheticsmigration

import android.app.Activity
import android.os.Bundle
import com.example.syntheticsmigration.databinding.ActivityMain2Binding

class MainActivity2 : Activity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        binding.text.text = "Data from parcel: ${intent?.getParcelableExtra<ParcelMe>("parcel")?.id.toString()}"
        setContentView(binding.root)

    }
}