package com.qoolqas.miayam.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.qoolqas.miayam.R
import com.qoolqas.miayam.model.Data
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    var data: Data? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        data = intent.getParcelableExtra("data")
        detailNama.text = data?.name
        detailHarga.text = data?.harga
        detailDeskripsi.text = data?.deskripsi
        Glide.with(this@DetailActivity)
            .load(data?.image)
            .into(detailHeader)
        val toolbar = findViewById<Toolbar>(R.id.anim_toolbar)
        setSupportActionBar(toolbar)

        val collapsingToolbarLayout =
            findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar)
        collapsingToolbarLayout.title = (data?.name)

        collapsingToolbarLayout.setCollapsedTitleTextColor(
            ContextCompat.getColor(this, R.color.colorAccent)
        )
        collapsingToolbarLayout.setExpandedTitleColor(
            ContextCompat.getColor(this, R.color.transparent)
        )
    }
}