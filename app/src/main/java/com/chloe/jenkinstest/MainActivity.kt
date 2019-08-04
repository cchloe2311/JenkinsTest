package com.chloe.jenkinstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_param1.text = BuildConfig.param1.toString()
        tv_param2.text = BuildConfig.param2.toString()
    }
}
