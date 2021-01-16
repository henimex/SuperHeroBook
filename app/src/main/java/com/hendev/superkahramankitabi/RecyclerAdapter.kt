package com.hendev.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val heroList: ArrayList<String>, val heroImages: ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.ShViewHolder>() {

    class ShViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return ShViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ShViewHolder, position: Int) {
        holder.itemView.txtHeroName.text = heroList.get(position)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("heroName",heroList.get(position))
            intent.putExtra("heroImage",heroImages.get(position))

/*          val singleton = SingletonClass.SecilenKahraman
            singleton.gorsel = heroImages.get(position)*/

            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return heroList.size
    }
}