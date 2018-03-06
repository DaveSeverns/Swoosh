package com.sevdev.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.sevdev.swoosh.Utilities.EXTRA_LEAGUE
import com.sevdev.swoosh.R
import com.sevdev.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        Log.e("tag",league)
    }

    fun onFinishClicked(view: View){
        if(skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please Select a Skill", Toast.LENGTH_SHORT).show()
        }


    }

    fun onBeginnerClick(view: View){
        ballerSkillButton.isChecked = false
        skill = "Beginner"
    }

    fun onBallerClick(view: View){
        beginnerSkillButton.isChecked = false
        skill = "Baller"
    }
}
