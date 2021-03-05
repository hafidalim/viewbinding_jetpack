package com.example.konversidollar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun convertCurrency(view: View){
        if (dollarText.text.isNotEmpty()){
            val dollarValue = dollarText.text.toString().toDouble()
            val euroValue = dollarValue * 14.000
            textView.text = euroValue.toString()
        }else {
            textView.text = getString(R.string.no_value_string)
        }
    }
}