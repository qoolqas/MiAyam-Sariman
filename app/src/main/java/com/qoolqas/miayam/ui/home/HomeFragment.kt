package com.qoolqas.miayam.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.qoolqas.miayam.LinePagerIndicatorDecoration
import com.qoolqas.miayam.R
import com.qoolqas.miayam.model.Data
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    private var linearLayoutManager: LinearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    private var linearLayoutManager2: LinearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
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
        rvPager.apply {
            val snapHelper = PagerSnapHelper()
            snapHelper.attachToRecyclerView(rvPager)
            rvPager.addItemDecoration(LinePagerIndicatorDecoration())
            rvPager.layoutManager = linearLayoutManager2
            adapter = DecorationAdapter(mNicolasCageMovies)
        }

        rvHorizontal.apply {
            rvHorizontal.layoutManager =linearLayoutManager
            adapter = RekomendasiAdapter(mNicolasCageMovies)
        }
    }
}