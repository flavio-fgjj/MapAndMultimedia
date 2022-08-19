package com.example.mapandmultimedia

import android.annotation.SuppressLint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import com.example.mapandmultimedia.databinding.ActivityVideosMediaPlayerBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityVideosMediaPlayerBinding

class VideosMediaPlayer : AppCompatActivity() {
    private var uri: Uri? = null
    private var isContinously = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVideosMediaPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaController = MediaController(this)
        val vv = binding.vv

        mediaController.setAnchorView(vv)

        val uriPath = "http://techslides.com/demos/sample-videos/small.mp4"
        uri = Uri.parse(uriPath)
        vv.setOnCompletionListener {
            if (isContinously) {
                vv.start()
            }
        }

        binding.btnstop.setOnClickListener { vv.pause() }
        binding.btnplay.setOnClickListener { vv.start() }
        binding.btnonce.setOnClickListener {
            isContinously = false
            binding.progress.visibility = View.VISIBLE
            vv.setMediaController(mediaController)
            vv.setVideoURI(uri)
            vv.requestFocus()
            vv.start()
        }
        binding.btnconti.setOnClickListener {
            isContinously = true
            binding.progress.visibility = View.VISIBLE
            vv.setMediaController(mediaController)
            vv.setVideoURI(uri)
            vv.requestFocus()
            vv.start()
        }

        vv.setOnPreparedListener {
            binding.progress.visibility = View.GONE
        }
    }
}