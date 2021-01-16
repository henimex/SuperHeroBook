package com.hendev.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var SKIsimleri = ArrayList<String>()
        SKIsimleri.add("Batman")
        SKIsimleri.add("Antman")
        SKIsimleri.add("Aquaman")
        SKIsimleri.add("Black Widow")
        SKIsimleri.add("Captain America")
        SKIsimleri.add("Hulk")
        SKIsimleri.add("Ironman")
        SKIsimleri.add("Spiderman")
        SKIsimleri.add("Superman")
        SKIsimleri.add("Wonder Woman")

        //Verimsiz Kodlar
        /*
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,           R.drawable.batman)
        val antmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,           R.drawable.antman)
        val captainamericaBitmap = BitmapFactory.decodeResource(applicationContext.resources,   R.drawable.aquaman)
        val blackwidowBitmap = BitmapFactory.decodeResource(applicationContext.resources,       R.drawable.blackwidow)
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources,          R.drawable.captainamerica)
        val hulkBitmap = BitmapFactory.decodeResource(applicationContext.resources,             R.drawable.hulk)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,          R.drawable.ironman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,        R.drawable.spiderman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,         R.drawable.superman)
        val wonderwomanBitmap = BitmapFactory.decodeResource(applicationContext.resources,      R.drawable.wonderwoman)
         */

        //Verimli Tanımlamalar
        val batman_DrawableId = R.drawable.batman
        val antman_DrawableId = R.drawable.antman
        val aquaman_DrawableId = R.drawable.aquaman
        val blackwidow_DrawableId = R.drawable.blackwidow
        val captainamerica_DrawableId = R.drawable.captainamerica
        val hulk_DrawableId = R.drawable.hulk
        val ironman_DrawableId = R.drawable.ironman
        val spiderman_DrawableId = R.drawable.spiderman
        val superman_DrawableId = R.drawable.superman
        val wonderwoman_DrawableId = R.drawable.wonderwoman

        var SKDrawableList = ArrayList<Int>()
        SKDrawableList.add(batman_DrawableId)
        SKDrawableList.add(antman_DrawableId)
        SKDrawableList.add(aquaman_DrawableId)
        SKDrawableList.add(blackwidow_DrawableId)
        SKDrawableList.add(captainamerica_DrawableId)
        SKDrawableList.add(hulk_DrawableId)
        SKDrawableList.add(ironman_DrawableId)
        SKDrawableList.add(ironman_DrawableId)
        SKDrawableList.add(spiderman_DrawableId)
        SKDrawableList.add(superman_DrawableId)
        SKDrawableList.add(wonderwoman_DrawableId)



        /*var SKGoreselleri = ArrayList<Bitmap>()
        SKGoreselleri.add(batmanBitmap)
        SKGoreselleri.add(antmanBitmap)
        SKGoreselleri.add(captainamericaBitmap)
        SKGoreselleri.add(blackwidowBitmap)
        SKGoreselleri.add(aquamanBitmap)
        SKGoreselleri.add(hulkBitmap)
        SKGoreselleri.add(ironmanBitmap)
        SKGoreselleri.add(spidermanBitmap)
        SKGoreselleri.add(supermanBitmap)
        SKGoreselleri.add(wonderwomanBitmap)*/

        val layoutMnager = LinearLayoutManager(this)
        rv.layoutManager=layoutMnager

        val adapter = RecyclerAdapter(SKIsimleri,SKDrawableList)
        rv.adapter = adapter

    }
}