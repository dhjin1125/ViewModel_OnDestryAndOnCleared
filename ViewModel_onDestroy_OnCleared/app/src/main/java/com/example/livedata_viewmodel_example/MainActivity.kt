package com.example.livedata_viewmodel_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var aacViewModel : AACViewModel

    private val txt by lazy {
        findViewById<TextView>(R.id.tv)
    }

    private val btn by lazy {
        findViewById<TextView>(R.id.btn)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aacViewModel = ViewModelProvider(this).get(AACViewModel::class.java)


        txt.text = aacViewModel.getCountText().toString()

        btn.setOnClickListener {
            txt.text = aacViewModel.addNumber().toString()
        }
    }
}