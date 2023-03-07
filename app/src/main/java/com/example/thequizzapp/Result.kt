package com.example.thequizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

    }
}