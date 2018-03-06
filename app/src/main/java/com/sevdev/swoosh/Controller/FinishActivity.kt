package com.sevdev.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sevdev.swoosh.Model.Player
import com.sevdev.swoosh.R
import com.sevdev.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for a ${player.league} ${player.skill} league near you!"
    }
}
