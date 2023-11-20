package com.creativeitinstitute.segmentedprogress

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.creativeitinstitute.segmentedprogress.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.advancedBar2.setProgressPercentage(10.0)



    }
}