package com.example.testing2

import android.annotation.SuppressLint
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.LinearLayout.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearLayout = findViewById(R.id.linearLayout) as LinearLayout
        val recyclerView =  RecyclerView(this)

        val images = ArrayList<Outfit>()
        images.add(Outfit(R.drawable.image_casual, "Casual", "Long Skirt"))
        images.add(Outfit(R.drawable.image_casual1, "Casual", " "))
        images.add(Outfit(R.drawable.image_casual2, "Casual", "Long Skirt"))
        images.add(Outfit(R.drawable.image_casual3, "Casual", " "))
        images.add(Outfit(R.drawable.image_casual4, "Casual", " "))
        images.add(Outfit(R.drawable.image_casual5, "Casual","Short Skirt"))
        images.add(Outfit(R.drawable.image_casual6, "Casual", "Long Skirt"))
        images.add(Outfit(R.drawable.image_casual7, "Casual", " "))

        val adapter = OutfitAdapter(images)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        linearLayout.addView(recyclerView)

        //val adapter = OutfitAdapter(images)
        //val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        //recyclerView.adapter = adapter
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
