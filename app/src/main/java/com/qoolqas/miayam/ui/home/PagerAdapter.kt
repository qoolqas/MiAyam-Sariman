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
import kotlinx.android.synthetic.main.item_pager_main.view.*

class PagerAdapter (private val list: List<Data>, private val context : Context) :
    RecyclerView.Adapter<PagerAdapter.ViewHolder>() {
    private val limit : Int = 3
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_pager_main, parent, false)
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
        Glide.with(holder.view)
            .load(list[position].image)
            .placeholder(R.color.gray)
            .into(holder.view.testImage)

        holder.view.setOnClickListener {
            val intent = Intent(holder.view.context, DetailActivity::class.java)
            intent.putExtra("data",list[position])
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            holder.view.context.startActivity(intent)
        }
    }
}
