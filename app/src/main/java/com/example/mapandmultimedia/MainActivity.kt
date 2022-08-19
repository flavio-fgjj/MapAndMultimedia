package com.example.mapandmultimedia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mapandmultimedia.databinding.ActivityMainBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAccessWebview.setOnClickListener {
            val intent = Intent(this, UsandoWebView::class.java)
            startActivity(intent)
        }

        binding.btnAccessPhotos.setOnClickListener {
            val intent = Intent(this, RecuperandoFotosActivity::class.java)
            startActivity(intent)
        }

        binding.btnAccessAnimation.setOnClickListener {
            val intent = Intent(this, AnimationActivity::class.java)
            startActivity(intent)
        }

        binding.btnAudios.setOnClickListener {  }

        binding.btnVideos.setOnClickListener {  }
    }

}