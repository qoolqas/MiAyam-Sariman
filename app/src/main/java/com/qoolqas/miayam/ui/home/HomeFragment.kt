package com.qoolqas.miayam.ui.home

import android.content.res.TypedArray
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.qoolqas.miayam.R
import com.qoolqas.miayam.model.Data
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.*

class HomeFragment : Fragment() {
    private lateinit var rekomendasiAdapter: RekomendasiAdapter
    private var list = mutableListOf<Data>()
    private var linearLayoutManager: LinearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    private var nameData: Array<String> = emptyArray()
    private var hargaData: Array<String> = emptyArray()
    private var deslripsiData: Array<String> = emptyArray()
    private var imageData: TypedArray? = null
    private val mNicolasCageMovies = listOf(
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

        prepare()
        initRv()
        addItem()
        rvHorizontal.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = RekomendasiAdapter(mNicolasCageMovies)
        }

    }

    private fun initRv() {
        rvHorizontal.setHasFixedSize(true)
        rvHorizontal.layoutManager = linearLayoutManager
    }

    private fun prepare() {
        nameData = resources.getStringArray(R.array.name_array)
        hargaData = resources.getStringArray(R.array.harga_array)
        deslripsiData = resources.getStringArray(R.array.deskripsi_array)
        imageData = resources.obtainTypedArray(R.array.image_array)
    }

    private fun addItem() {
        val list: ArrayList<Data> = ArrayList()
        for (i in nameData.indices) {
            val items = Data()
            items.image(imageData!!.getResourceId(i, -1))
            items.name(nameData[i])
            items.harga(hargaData[i])
            items.deskripsi(deslripsiData[i])

            list.add(items)
        }
        rekomendasiAdapter = RekomendasiAdapter(list)
//        rekomendasiAdapter.setOnItemClickListener(this@ListActivity)
        rvHorizontal.adapter = rekomendasiAdapter
    }
    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }
}


