package com.example.quizapp

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import java.io.Serializable

data class Questions (
    val id: Int,
    val question: String,
    val image: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
):Serializable