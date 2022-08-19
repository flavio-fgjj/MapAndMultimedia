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
    private var isContinuously = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVideosMediaPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaController = MediaController(this)
        val vv = binding.vv

        mediaController.setAnchorView(vv)

        val uriPath = "https://player.vimeo.com/external/295046839.sd.mp4?s=82a76eec2e85e63006d8ad7821617cea7d11d28d&profile_id=164&oauth2_token_id=57447761"
        uri = Uri.parse(uriPath)
        vv.setOnCompletionListener {
            if (isContinuously) {
                vv.start()
            }
        }

        binding.btnstop.setOnClickListener { vv.pause() }
        binding.btnplay.setOnClickListener { vv.start() }
        binding.btnonce.setOnClickListener {
            isContinuously = false
            binding.progress.visibility = View.VISIBLE
            vv.setMediaController(mediaController)
            vv.setVideoURI(uri)
            vv.requestFocus()
            vv.start()
        }
        binding.btnconti.setOnClickListener {
            isContinuously = true
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