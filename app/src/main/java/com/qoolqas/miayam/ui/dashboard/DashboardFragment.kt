package com.qoolqas.miayam.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.qoolqas.miayam.R
import com.qoolqas.miayam.model.Data

class DashboardFragment : Fragment() {


    private lateinit var dashboardViewModel: DashboardViewModel
    private val mNicolasCageMovies = listOf(
        Data(R.drawable.mie1, "Es Teh Manis","10000","Mie Ayam"),
        Data(R.drawable.mie2, "Es Jeruk","10000","Mie Ayam"),
        Data(R.drawable.mie3, "Kopi","10000","Mie Ayam"),
        Data(R.drawable.mie3, "Teh Tawar","10000","Mie Ayam")
    )
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
