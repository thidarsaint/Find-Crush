package com.tds.findcrush.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tds.findcrush.R
import com.tds.findcrush.model.Person
import kotlinx.android.synthetic.main.find_crush.view.*

class PersonViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

    var name = itemView.findViewById<TextView>(R.id.txt_name)

    var profile = itemView.findViewById<ImageView>(R.id.img_profile     )

    var postImage = itemView.findViewById<ImageView>(R.id.img_post)
}

class PersonAdapter (var detailList: ArrayList<Person>): RecyclerView.Adapter<PersonViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.find_crush, parent,false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return detailList.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.name.text =detailList[position].name
        holder.profile.setImageResource(detailList[position].profileImage)
        holder.postImage.setImageResource(detailList[position].postImage)
    }

}
