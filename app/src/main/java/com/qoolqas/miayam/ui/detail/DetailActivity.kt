package com.qoolqas.miayam.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.qoolqas.miayam.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val toolbar = findViewById<Toolbar>(R.id.anim_toolbar)
        setSupportActionBar(toolbar)

        val collapsingToolbarLayout =
            findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar)
        collapsingToolbarLayout.title = ("Mi Ayam")


        collapsingToolbarLayout.setCollapsedTitleTextColor(
            ContextCompat.getColor(this, R.color.colorAccent)
        )
        collapsingToolbarLayout.setExpandedTitleColor(
            ContextCompat.getColor(this, R.color.transparent)
        )
    }
}