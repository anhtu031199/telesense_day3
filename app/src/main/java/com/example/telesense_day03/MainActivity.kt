package com.example.telesense_day03

import android.os.Bundle

import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    var btn: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn_signup)
        btn?.setOnClickListener({
            if (savedInstanceState == null) {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<RegisterFragment>(R.id.frame_layout)
                }
            }
        })

    }
}