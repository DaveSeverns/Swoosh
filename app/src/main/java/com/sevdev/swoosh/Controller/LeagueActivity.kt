package com.sevdev.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.sevdev.swoosh.Model.Player
import com.sevdev.swoosh.R
import com.sevdev.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){
        womensLeagueButton.isChecked = false
        coedButton.isChecked = false
        player.league = "Mens"
    }

    fun onWomensClicked(view: View){
        mensLeagueButton.isChecked = false
        coedButton.isChecked = false
        player.league = "Womens"
    }

    fun onCoedClicked(view: View){
        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false
        player.league = "Coed"
    }

    fun leagueNextClick(view : View){
        if(player.league != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Select a league.", Toast.LENGTH_SHORT).show()

        }

    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

}
