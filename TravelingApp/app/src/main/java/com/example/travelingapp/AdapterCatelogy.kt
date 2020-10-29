package com.example.travelingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import org.w3c.dom.Text
import java.util.*
import kotlin.random.Random

class AdapterCatelogy(val catelogyList: MutableList<Catelogy>, val changActivity: (id:Int) -> Unit) :
    RecyclerView.Adapter<AdapterCatelogy.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgSP = itemView.findViewById<ImageView>(R.id.imgCatelogy)
        val txtNamecate = itemView.findViewById<TextView>(R.id.txtNamecatelogy)
        val ratingBar = itemView.findViewById<RatingBar>(R.id.listitemrating)

        fun onClick(id: Int) {
            itemView.setOnClickListener(View.OnClickListener {
                changActivity(id)
            })
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater =
            LayoutInflater.from(parent.context).inflate(R.layout.recyclermain, parent, false)
        return ViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val catelogy: Catelogy = catelogyList[position]

        holder.txtNamecate.text = catelogy.txtCity
        Picasso.get().load(catelogy.imageCate).into(holder.imgSP)
        holder.ratingBar.rating = Random.nextInt(5, 10) / 2.0.toFloat()
        holder.onClick(position)
    }

    override fun getItemCount(): Int {
        return catelogyList.size
    }
}