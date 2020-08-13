package com.qoolqas.miayam.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.qoolqas.miayam.R
import com.qoolqas.miayam.model.Data

class DashboardFragment : Fragment() {
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

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
