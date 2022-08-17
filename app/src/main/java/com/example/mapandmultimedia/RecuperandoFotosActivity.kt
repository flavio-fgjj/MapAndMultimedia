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

        val i1 = "https://st.depositphotos.com/1020341/4233/i/450/depositphotos_42333899-stock-photo-portrait-of-huge-beautiful-male.jpg"
        val i2 = "https://t1.ea.ltmcdn.com/pt/posts/8/6/7/a_alimentacao_do_pinguim_20768_600.jpg"
        val i3 = "https://ichef.bbci.co.uk/news/640/cpsprodpb/14A4B/production/_123355548_273225536_5387239747969927_3174953441515970260_n.jpg"
        val i4 = "https://mega.ibxk.com.br/2014/10/31/31154830884249.jpg?ims=610x"
        val i5 = "https://animalbusiness.com.br/wp-content/uploads/2020/07/tigre.jpg"
        val i6 = "https://static.natgeo.pt/files/styles/image_3200/public/01-rats-cities-coronavirus-nationalgeographic_2721591.jpg?w=1600&h=1600"

        Glide.with(this).load(i1).into(binding.imageView1)
        Glide.with(this).load(i2).into(binding.imageView2)
        Glide.with(this).load(i3).into(binding.imageView3)
        Glide.with(this).load(i4).into(binding.imageView4)
        Glide.with(this).load(i5).into(binding.imageView5)
        Glide.with(this).load(i6).into(binding.imageView6)


    }
}