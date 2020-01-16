package com.example.testing2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycleview_item.view.*

class OutfitAdapter (val imageList: ArrayList<Outfit>) : RecyclerView.Adapter<OutfitAdapter.OutfitViewHolder>(){

    //private var outfits = ArrayList<Outfit>()

    class OutfitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(outfit: Outfit) {
            itemView.imageViewCasual.setImageResource(outfit.image)
        }
    }

    // create each records layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OutfitAdapter.OutfitViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycleview_item, parent, false)

        return OutfitViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: OutfitViewHolder, position: Int) {

        holder.bindItems(imageList[position])

    }

}