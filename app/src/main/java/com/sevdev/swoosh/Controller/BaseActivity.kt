package com.sevdev.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"${javaClass.simpleName} onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"${javaClass.simpleName} onStart")

    }

    override fun onResume() {
        Log.d(TAG,"${javaClass.simpleName} onResume")

        super.onResume()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"${javaClass.simpleName} onRestart")

    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG,"${javaClass.simpleName} onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"${javaClass.simpleName} onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"${javaClass.simpleName} onDestroy")

    }
}
