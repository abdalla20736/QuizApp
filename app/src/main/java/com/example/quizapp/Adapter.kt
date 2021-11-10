package com.example.quizapp


import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import kotlin.collections.ArrayList
import android.widget.Toast

class Adapter (private val list:ArrayList<String>):
    RecyclerView.Adapter<Adapter.ViewHolder>() {
    private lateinit var clicklistener : onItemClickListener
    private lateinit var context:Context
    interface  onItemClickListener{
        fun onItemClick(position: Int)
    }
   fun setOnItemClickListener(listener: onItemClickListener){
      clicklistener = listener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.getContext()
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.varianttemplate,parent,false),clicklistener) //
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val currentitem = list[position]
        holder.variantname.text = currentitem
        if(position % 1 == 0){
            holder.variantname.setBackgroundColor(Color.parseColor("#D1D12D"))
        }
        if(position % 2 == 0){
            holder.variantname.setBackgroundColor(Color.parseColor("#FF403D"))
        }
        if(position % 3 == 0){
            holder.variantname.setBackgroundColor(Color.parseColor("#00DAFF"))
        }
        if(position % 4 == 0){
            holder.variantname.setBackgroundColor(Color.parseColor("#9CCE00"))
        }
        if(position % 5 == 0){
            holder.variantname.setBackgroundColor(Color.parseColor("#FF8800"))
        }

        if(position % 6 == 0){
            holder.variantname.setBackgroundColor(Color.parseColor("#00DAFF"))
        }



    }

    override fun getItemCount(): Int {
        return list.size
    }
    class ViewHolder(View: View,listener: onItemClickListener) : RecyclerView.ViewHolder(View) {//

        val variantname : TextView = View.findViewById(R.id.variant)

       init {
            View.setOnClickListener{
                listener.onItemClick(adapterPosition)
            }
        }

    }

}
