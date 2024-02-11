package com.amanpathak.librarytestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amanpathak.toasty.Toasty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toasty.showToast(this, true)

    }
}