package com.example.permissionsexkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object {
        private  const val CAMERA_PERMISSION_CODE = 1
        //  private const val FIND_LOCATION_PERMISSION_CODE = 2
    }
}