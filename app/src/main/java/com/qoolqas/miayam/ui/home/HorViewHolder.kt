package com.qoolqas.miayam.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.qoolqas.miayam.R
import com.qoolqas.miayam.model.Data
import kotlinx.android.synthetic.main.item_card_horizontal.view.*

class HorViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_card_horizontal, parent, false)) {
    private var nameView: TextView? = null
    private var hargaView: TextView? = null


    init {
        nameView = itemView.findViewById(R.id.horName)
        hargaView = itemView.findViewById(R.id.horHarga)
    }

    fun bind(data: Data) {
        nameView?.text = data.name
        hargaView?.text = data.harga

    }

}