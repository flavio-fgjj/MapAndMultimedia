package com.example.mapandmultimedia

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.mapandmultimedia.databinding.ActivityAnimationBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityAnimationBinding

class AnimationActivity : AppCompatActivity() {
    private var animations = arrayOf(
        "Fade In",
        "Fade Out",
        "Zoom In",
        "Zoom Out",
        "Blink",
        "Rotate",
        "Move",
        "Slide Up",
        "Slide Down",
        "Bounce"
    )

    private var animationIDs = intArrayOf(
        R.anim.fade_in,
        R.anim.fade_out,
        R.anim.zoom_in,
        R.anim.zoom_out,
        R.anim.blink,
        R.anim.rotate,
        R.anim.move,
        R.anim.slide_up,
        R.anim.slide_down,
        R.anim.bounce
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lv.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, animations)
        binding.lv.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val animation = AnimationUtils.loadAnimation(
                this,
                animationIDs[position]
            )
            binding.tv.startAnimation(animation)
        }
    }
}