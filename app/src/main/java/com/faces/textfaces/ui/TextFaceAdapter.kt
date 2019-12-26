package com.faces.textfaces.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.faces.textfaces.R
import kotlinx.android.synthetic.main.text_face_adapter_layout.view.*


class TextFaceAdapter(
    private val textFaces: List<String>,
    private val itemClick: (Int) -> Unit
) : RecyclerView.Adapter<TextFaceAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.text_face_adapter_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = textFaces.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.face.text = textFaces[position]
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val face: TextView = itemView.itemText

        init {
            itemView.setOnClickListener { itemClick(adapterPosition) }
        }
    }
}