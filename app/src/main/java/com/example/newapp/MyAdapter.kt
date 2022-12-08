package com.example.newapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

//class MyAdapter(val songs:List<Songs>): RecyclerView.Adapter<MyAdapter.MyviewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//        val view = inflater.inflate(R.layout.item_view, parent,false)
//        return MyviewHolder(view)
//
//    }
//
//    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
//        holder.txtTitle.text = songs[position].title
//        holder.txtDescription.text = songs[position].description
//
//
//
//    }
//
//    override fun getItemCount(): Int {
//        return songs.size
//
//    }
//    class MyviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//
//        var txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
//        var txtDescription = itemView.findViewById<TextView>(R.id.txtDescription)
//        init {
//            itemView.setOnClickListener { v: View ->
//                val position: Int = adapterPosition
//                Toast.makeText(itemView.context, "item is clicked", Toast.LENGTH_LONG).show()
//                when (position) {
//                    0 ->{val i = Intent(itemView.context,SecondActivity::class.java)
//                        i.putExtra("text",R.drawable.ic_add_contact)
//                        itemView.context.startActivity(i)
//
//                    }
//                    1 -> {val i = Intent(itemView.context,SecondActivity::class.java)
//                    }
//                    else -> {
//                    }
//                }
//            }
//        }

//}
//}