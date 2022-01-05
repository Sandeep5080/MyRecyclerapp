package com.example.myrecyclerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting recycle view buy its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        //this creates vertical layout manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()


        //this loop will create 20 views containing
        // the image with the count of the view
        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.img,
                "Training" +
                        "-$i","Task -$i ",R.drawable.ic_baseline_av_timer_24))
        }

        //this will pass the ArrayList to our Adaptor
        val adapter = CustomAdapter(data)

        //setting the Adapter with thr recyclerview
        recyclerview.adapter = adapter

    }

}