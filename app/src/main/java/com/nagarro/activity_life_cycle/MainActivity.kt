package com.nagarro.activity_life_cycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast.makeText(applicationContext, "OnCreateCalled", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
//        val toast = Toast.makeText(applicationContext,"OnStartCalled",Toast.LENGTH_LONG).show()
        Log.d("APP_STATES", "onStart")
    }

    override fun onResume() {
        super.onResume()
//        val toast = Toast.makeText(applicationContext,"OnResumeCalled",Toast.LENGTH_LONG).show()
        Log.d("APP_STATES", "onResume")
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(applicationContext, "OnPauseCalled", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(applicationContext, "onStop Called", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(applicationContext, "OnDestroyCalled", Toast.LENGTH_LONG).show()
    }
}