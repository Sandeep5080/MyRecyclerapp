package com.example.myrecyclerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private  val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //creates new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        //inflates the card_view_design view
        //that is used to old list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    //binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemsViewModel = mList[position]

        //sets the image to the imageview from our item holder class
        holder.imageView1.setImageResource(itemsViewModel.image1)

        holder.imageView2.setImageResource(itemsViewModel.image2)


        //sets the text to the textview from our itemHolder class
        holder.textView.text = itemsViewModel.text1
        holder.textView2.text = itemsViewModel.text2
        //holder.textView3.text = itemsViewModel.text3
    }
    // returns the number of items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    //Holds the views for adding it to the image and text
    class ViewHolder(ItemView:View) : RecyclerView.ViewHolder(ItemView) {
        val imageView1: ImageView = itemView.findViewById(R.id.imageview)
        val imageView2: ImageView = itemView.findViewById(R.id.imageview2)
        val textView: TextView = itemView.findViewById(R.id.textView)
        val textView2: TextView = itemView.findViewById(R.id.textView2)
        //val textView3: TextView = itemView.findViewById(R.id.textView3)
    }

}