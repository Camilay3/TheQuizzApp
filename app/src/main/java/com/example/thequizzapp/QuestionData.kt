package com.example.thequizzapp

data class QuestionData (
    var id:Int,
    var correct_ans:Int,
    var question:String,
    var option_one:String,
    var option_two:String,
    var option_three:String,
    var option_four:String
        )