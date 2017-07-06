package com.example.pey.learnarch0.ui.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.pey.learnarch0.R
import com.example.pey.learnarch0.ui.detail.DetailActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickMe.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}
