package com.example.thequizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    /*
    private var questionList:ArrayList<QuestionData>?=null
     */
    private var currentPosition:Int=1
    private var questionList:ArrayList<QuestionData> ? = null
    private var selectedOption:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        setData.getQuestion()

        questionList=setData.getQuestion()

        setQuestion()


        /*
        questionList=setData.getQuestion()
        var que=questionList!![0]
        question_text.text=que.question
        opt_1.setOnClickListener{
            opt_1.background=ContextCompat.getDrawable( this,R.drawable.selected_question_option)
        }
        opt_1.text=que.option_one
        opt_2.text=que.option_two
        opt_3.text=que.option_three
        opt_4.text=que.option_four

        progress_horizontal.progress=1
        progress_horizontal.max=questionList!!.size
*/
        /*
        var demo = setData.getQuestion()
        Log.e("meu teste", "${demo.size}")
        */
    }

    fun setQuestion(){

        val question = questionList!![currentPosition-1]
    }
}