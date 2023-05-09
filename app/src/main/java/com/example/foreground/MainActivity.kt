package com.example.foreground

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
//    val intent = Intent(this, ForegroundService::class.java) //Intent for the service

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val button:Button = findViewById(R.id.button)
        button.setOnClickListener{
            onClick()
        }
    }

    fun onClick(){
        val intent = Intent(this, ExampleActivity::class.java)
        this.startActivity(intent)
    }
}