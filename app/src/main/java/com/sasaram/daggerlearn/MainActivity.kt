package com.sasaram.daggerlearn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sasaram.daggerlearn.car.Car

class MainActivity : AppCompatActivity() {

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


    }
}