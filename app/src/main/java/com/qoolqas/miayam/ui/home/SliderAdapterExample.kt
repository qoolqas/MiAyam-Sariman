package com.qoolqas.miayam.ui.home

import android.R
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.qoolqas.miayam.model.Data
import com.smarteist.autoimageslider.SliderViewAdapter


class SliderAdapterExample(private val list: List<Data>) :
    SliderViewAdapter<SliderAdapterExample.SliderAdapterVH>() {
    private var mSliderItems: MutableList<Data> = ArrayList()
    fun renewItems(sliderItems: MutableList<Data>) {
        mSliderItems = sliderItems
        notifyDataSetChanged()
    }

    fun deleteItem(position: Int) {
        mSliderItems.removeAt(position)
        notifyDataSetChanged()
    }

    fun addItem(sliderItem: Data) {
        mSliderItems.add(sliderItem)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup): SliderAdapterVH {
        val inflate: View = LayoutInflater.from(parent.context)
            .inflate(com.qoolqas.miayam.R.layout.image_slider_layout_item, parent, false)
        return SliderAdapterVH(inflate)
    }

    override fun onBindViewHolder(
        viewHolder: SliderAdapterVH,
        position: Int
    ) {
        val sliderItem: Data = mSliderItems[position]
        viewHolder.textViewDescription.text = sliderItem.name
        viewHolder.textViewDescription.textSize = 16f
        viewHolder.textViewDescription.setTextColor(Color.WHITE)
        Glide.with(viewHolder.itemView)
            .load(sliderItem.image)
            .fitCenter()
            .into(viewHolder.imageViewBackground)
//        viewHolder.itemView.setOnClickListener {
//            Toast.makeText(context, "This is item in position $position", Toast.LENGTH_SHORT)
//                .show()
//        }
    }

    override fun getCount(): Int {
        //slider view count could be dynamic size
        return mSliderItems.size
    }

    inner class SliderAdapterVH(itemView: View) :
        ViewHolder(itemView) {
        lateinit var itemView1: View
        var imageViewBackground: ImageView
        var imageGifContainer: ImageView
        var textViewDescription: TextView

        init {
            imageViewBackground = itemView.findViewById(com.qoolqas.miayam.R.id.iv_auto_image_slider)
            imageGifContainer = itemView.findViewById(com.qoolqas.miayam.R.id.iv_gif_container)
            textViewDescription = itemView.findViewById(com.qoolqas.miayam.R.id.tv_auto_image_slider)
            this.itemView1 = itemView
        }
    }


}