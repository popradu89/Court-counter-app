package com.example.android.courtcounter


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayForTeamA(0)
        displayForTeamB(0)
    }

    var scoreTeamA = 0
    var scoreTeamB = 0

    fun addThreeForTeamA(view: View) {
        scoreTeamA = scoreTeamA + 3
        displayForTeamA(scoreTeamA)
    }

    fun addTwoForTeamA(view: View) {
        scoreTeamA = scoreTeamA + 2
        displayForTeamA(scoreTeamA)
    }

    fun addOneForTeamA(view: View) {
        scoreTeamA = scoreTeamA + 1
        displayForTeamA(scoreTeamA)
    }

    fun addThreeForTeamB(view: View) {
        scoreTeamB = scoreTeamB + 3
        displayForTeamB(scoreTeamB)
    }

    fun addTwoForTeamB(view: View) {
        scoreTeamB = scoreTeamB + 2
        displayForTeamB(scoreTeamB)
    }

    fun addOneForTeamB(view: View) {
        scoreTeamB = scoreTeamB + 1
        displayForTeamB(scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = findViewById<View>(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = findViewById<View>(R.id.team_b_score) as TextView
        scoreView.text = score.toString()
    }

    fun resetScore (view: View) {
        scoreTeamA = 0
        scoreTeamB = 0
        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
    }

}