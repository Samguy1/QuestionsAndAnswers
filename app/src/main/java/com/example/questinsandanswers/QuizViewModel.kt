package com.example.questinsandanswers

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
private const val TAG = "QuizViewModel"
const val CURRENT_INDEX_KEY = "CURRENT_INDEX_KEY"

class QuizViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {
    private val questionBank = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_africa, false),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true),
        Question(R.string.question_africa1, true))

     var currentIndex: Int
        get() = savedStateHandle.get(CURRENT_INDEX_KEY) ?: 0
        set(value) = savedStateHandle.set(CURRENT_INDEX_KEY, value)


val currentQuestionAnswer: Boolean
    get() = questionBank[currentIndex].answer

val currentQuestionText: Int
    get() =  questionBank[currentIndex].textResId

fun movetoNext(){
    currentIndex = currentIndex + 1
}

fun movetoPrevious(){
    currentIndex = currentIndex - 1
}
var questionSize: Int = questionBank.size

var currentIndexter: Int = currentIndex
}