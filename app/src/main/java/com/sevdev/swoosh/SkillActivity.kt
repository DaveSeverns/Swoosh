package com.sevdev.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SkillActivity : AppCompatActivity() {

    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        Log.e("tag",league)
    }
}
