package com.bignerdranch.android.laba10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
private var num : Int = 0
public lateinit var backgroundColor : ConstraintLayout
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val preferences = getSharedPreferences("Count", MODE_PRIVATE)
        val edit = preferences.edit()
        num = preferences.getInt("Count",num)
        var count = num + 1
        num = count
        backgroundColor = findViewById(R.id.back)

        edit.putInt("Count",num)
        edit.apply()
        if(preferences.getInt("Count",num)==1)
        {
            backgroundColor.setBackgroundResource(R.color.white)
            edit.putInt("Count",num)
            edit.apply()
        }
        else if(preferences.getInt("Count",num)%2==0)
        {
            backgroundColor.setBackgroundResource(R.color.blue)
            edit.putInt("Count",num)
            edit.apply()
        }
        else if(preferences.getInt("Count",num)%1==0)
        {
            backgroundColor.setBackgroundResource(R.color.green)
            edit.putInt("Count",num)
            edit.apply()
        }
    }
}