package com.example.telesense_day03

import android.os.Bundle

import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class MainActivity : AppCompatActivity() {
    var btn_signup: TextView? = null
    var btn_signin: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_signup = findViewById(R.id.btn_signup)
        btn_signup?.setOnClickListener({
            if (savedInstanceState == null) {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<RegisterFragment>(R.id.frame_layout)
                }
            }
        })
        btn_signin = findViewById(R.id.btn_signin)
        btn_signin?.setOnClickListener({
            if (savedInstanceState == null) {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace<LoginFragment>(R.id.frame_layout)
                }
            }
        })

    }

    override fun onBackPressed() {

    }
}