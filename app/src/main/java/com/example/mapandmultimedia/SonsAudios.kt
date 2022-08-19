package com.example.mapandmultimedia

import android.annotation.SuppressLint
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mapandmultimedia.databinding.ActivitySonsAudiosBinding
import java.io.IOException

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivitySonsAudiosBinding

class SonsAudios : AppCompatActivity() {
    val urlCowAudio = "https://memes.casa/audios/vaca-mugindo.mp3"
    val mediaPlayer = MediaPlayer()
    var dog: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySonsAudiosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dog = MediaPlayer.create(this, R.raw.dog)
        binding.btncow.setOnClickListener {
            soundCow()
        }

        binding.btndog.setOnClickListener {
            soundDog()
        }

    }

    private fun soundCow() {
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC)

        if (!mediaPlayer.isPlaying) {
            Toast.makeText(this, "Música Internet", Toast.LENGTH_SHORT).show()

            try {
                mediaPlayer.setDataSource(urlCowAudio)
                mediaPlayer.prepare()
                mediaPlayer.start()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        } else {
            try {
                mediaPlayer.pause()
                mediaPlayer.stop()
                mediaPlayer.reset()
            } catch (e:IOException) {
                e.printStackTrace()
            }
        }
    }

    fun soundDog() {
        dog!!.start()
    }

}