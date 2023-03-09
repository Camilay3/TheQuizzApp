package com.example.thequizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        val userName=intent.getStringExtra(setData.name)
        val score=intent.getStringExtra(setData.score)
        /*val totalQuestion=intent.getStringExtra("tamanho total")*/
        val totalQuestion = setData.que

        /*congo.text="Parabéns ${userName} !!"*/

        if (score!!.toInt() == 0) {
            congo.text="Que pena, ${userName}"
        } else if (score!!.toInt() < 3) {
            congo.text="Pode melhorar, ${userName}"
        } else {
            congo.text="Parabéns, ${userName}!"
        }

        /*Score.text="${score} / ${totalQuestion}"*/
        Score.text="${score} / ${totalQuestion.size}"
        button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}