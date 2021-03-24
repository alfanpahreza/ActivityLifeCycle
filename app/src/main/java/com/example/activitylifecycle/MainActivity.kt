package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("lifcycle", "onCreate invoked")
        Toast.makeText(this, "onCreate invoked", Toast.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()
        Log.d("lifcycle", "onStart invoked")
        Toast.makeText(this, "onStart invoked", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Log.d("lifcycle", "onResume invoked")
        Toast.makeText(this, "onResume invoked", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Log.d("lifcycle", "onPause invoked")
        Toast.makeText(this, "onPause invoked", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Log.d("lifcycle", "onStop invoked")
        Toast.makeText(this, "onStop invoked", Toast.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("lifcycle", "onRestart invoked")
        Toast.makeText(this, "onRestart invoked", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifcycle", "onDestroy invoked")
        Toast.makeText(this, "onDestroy invoked", Toast.LENGTH_SHORT).show()
    }
}