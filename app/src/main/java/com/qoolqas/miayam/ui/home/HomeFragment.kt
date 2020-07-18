package com.qoolqas.miayam.ui.home

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.qoolqas.miayam.R
import com.qoolqas.miayam.model.Data
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {
    private var linearLayoutManager: LinearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    private lateinit var sliderAdapter:SliderAdapterExample
    private val mNicolasCageMovies = listOf(
        Data(R.drawable.mie1, "Mie Ayam","10000","Mie Ayam"),
        Data(R.drawable.mie2, "Mie Ayam","10000","Mie Ayam"),
        Data(R.drawable.mie3, "Mie Ayam","10000","Mie Ayam"),
        Data(R.drawable.mie1, "Mie Ayam","10000","Mie Ayam"),
        Data(R.drawable.mie2, "Mie Ayam","10000","Mie Ayam"),
        Data(R.drawable.mie3, "Mie Ayam","10000","Mie Ayam"),
        Data(R.drawable.mie1, "Mie Ayam","10000","Mie Ayam"),
        Data(R.drawable.mie2, "Mie Ayam","10000","Mie Ayam"),
        Data(R.drawable.mie3, "Mie Ayam","10000","Mie Ayam")
    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sliderAdapter = SliderAdapterExample(mNicolasCageMovies)
        sliderView.setSliderAdapter(sliderAdapter)
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM) //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION)
        sliderView.autoCycleDirection = SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH
        sliderView.indicatorSelectedColor = Color.WHITE
        sliderView.indicatorUnselectedColor = Color.GRAY
        sliderView.scrollTimeInSec = 3
        sliderView.isAutoCycle = true
        sliderView.startAutoCycle()

        sliderView.setOnIndicatorClickListener {
            Log.i(
                "GGG",
                "onIndicatorClicked: " + sliderView.currentPagePosition
            )
        }


        rvHorizontal.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            rvHorizontal.layoutManager =linearLayoutManager
            // set the custom adapter to the RecyclerView
            adapter = RekomendasiAdapter(mNicolasCageMovies)
        }

    }
    fun renewItems(view: View?) {
        val sliderItemList: MutableList<Data> = ArrayList()
        //dummy data
        for (i in 0..4) {
            val sliderItem = Data()
            sliderItem.name
            if (i % 2 == 0) {
                sliderItem.image
            } else {
                sliderItem.image
            }
            sliderItemList.add(sliderItem)
        }
        sliderAdapter.renewItems(sliderItemList)
    }

    fun removeLastItem(view: View?) {
        if (sliderAdapter.count - 1 >= 0) sliderAdapter.deleteItem(sliderAdapter.count - 1)
    }

    fun addNewItem(view: View?) {
        val sliderItem = Data()
        sliderItem.name
        sliderItem.image
        sliderAdapter.addItem(sliderItem)
    }


}


