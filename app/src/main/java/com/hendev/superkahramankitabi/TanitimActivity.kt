package com.hendev.superkahramankitabi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val intent = intent
        val incomingName = intent.getStringExtra("heroName")
        txtTanitimHeroName.text = incomingName
        val selectedHeroImage = intent.getIntExtra("heroImage",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,selectedHeroImage)
        imageView.setImageBitmap(bitmap)

/*      val selectedHero = SingletonClass.SecilenKahraman
        val selectedImage = selectedHero.gorsel
        imageView.setImageBitmap(selectedImage)*/
    }
}