package com.qoolqas.miayam.ui.home

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.qoolqas.miayam.R
import com.qoolqas.miayam.model.Data
import com.qoolqas.miayam.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.item_list_vertical.view.*

class MakananAdapter (private val list: List<Data>, private val context : Context) :
    RecyclerView.Adapter<MakananAdapter.ViewHolder>() {
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_vertical, parent, false)
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.verNama.text = list[position].name
        holder.view.verHarga.text = list[position].harga
        Glide.with(holder.view)
            .load(list[position].image)
            .placeholder(R.color.gray)
            .into(holder.view.verImage)

        holder.view.setOnClickListener {
            val intent = Intent(holder.view.context, DetailActivity::class.java)
            intent.putExtra("data",list[position])
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            holder.view.context.startActivity(intent)
        }
    }
}
