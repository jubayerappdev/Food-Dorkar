package com.mehedi.fooddorkar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.mehedi.fooddorkar.databinding.ActivityLocationBinding

class LocationActivity : AppCompatActivity() {

    private val binding: ActivityLocationBinding by lazy {
        ActivityLocationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val locationList = arrayOf("Dhaka", "Chadpur", "Barishal","Tangail", "Rajshahi")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, locationList)
        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}