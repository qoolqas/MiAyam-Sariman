package com.qoolqas.miayam.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.qoolqas.miayam.R
import com.qoolqas.miayam.model.Data
import kotlinx.android.synthetic.main.item_card_horizontal.view.*

class RekomendasiAdapter (private val list: List<Data>) :
    RecyclerView.Adapter<RekomendasiAdapter.ViewHolder>() {
    private val limit : Int = 5
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
    private var mTitleView: TextView? = null
    private var mYearView: TextView? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_card_horizontal, parent, false)

        )
    }

    override fun getItemCount(): Int {
        return if(list.size > limit){
            limit;
        } else {
            list.size
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.horName.text = list[position].name
        holder.view.horHarga.text = list[position].harga
        Glide.with(holder.view)
            .load(list[position].image)
            .placeholder(R.color.gray)
            .into(holder.view.horImage)

    }
    fun bind(data: Data) {
        mTitleView?.text = data.name
        mYearView?.text = data.harga
    }
}
