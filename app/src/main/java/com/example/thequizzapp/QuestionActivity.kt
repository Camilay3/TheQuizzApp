package com.example.thequizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        setData.getQuestion()


        var demo = setData.getQuestion()
        /* NÃO DEU CERTO
        Log.e("meu teste", "${demo.size}")
        */
    }
}