package com.example.mapandmultimedia
import android.annotation.SuppressLint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.mapandmultimedia.databinding.ActivityRecuperandoFotosBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityRecuperandoFotosBinding

class RecuperandoFotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecuperandoFotosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val equipes = arrayOf("Leão", "Pinguim", "Urso", "Girafa", "Tigre", "Rato")

        binding.textView1.text = equipes[0]
        binding.textView2.text = equipes[1]
        binding.textView3.text = equipes[2]
        binding.textView4.text = equipes[3]
        binding.textView5.text = equipes[4]
        binding.textView6.text = equipes[5]

        val i1 = "https://img.favpng.com/11/13/14/baby-lions-cartoon-drawing-clip-art-png-favpng-nR6vbcLLXgf7jJ64R4tKbSC31.jpg"
        val i2 = "https://lohitart.com/wp-content/uploads/2021/08/cute-penguin-drawing-and-kawaii-penguin-drawing.jpg"
        val i3 = "https://i.etsystatic.com/10624284/r/il/0933a7/1914367051/il_fullxfull.1914367051_mrlr.jpg"
        val i4 = "https://images.saatchiart.com/saatchi/678149/art/3419367/2489254-HSC00001-7.jpg"
        val i5 = "https://c8.alamy.com/comp/2GHM6JJ/drawing-tiger-face-symbol-of-2022-new-year-for-poster-brochure-banner-invitation-card-vector-illustration-isolated-on-transparent-background-2GHM6JJ.jpg"
        val i6 = "https://www.artmajeur.com/medias/standard/f/l/fleurelisenoble/artwork/12407207_fatrat-30x40-sml.jpg"

        Glide.with(this).load(i1).into(binding.imageView1)
        Glide.with(this).load(i2).into(binding.imageView2)
        Glide.with(this).load(i3).into(binding.imageView3)
        Glide.with(this).load(i4).into(binding.imageView4)
        Glide.with(this).load(i5).into(binding.imageView5)
        Glide.with(this).load(i6).into(binding.imageView6)


    }
}