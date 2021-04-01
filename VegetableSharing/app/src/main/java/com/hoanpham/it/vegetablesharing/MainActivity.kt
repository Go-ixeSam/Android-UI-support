package com.hoanpham.it.vegetablesharing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var mTvProfileName : TextView
    private lateinit var mImvProfile : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTvProfileName = findViewById(R.id.tvProfileName)
        mImvProfile = findViewById(R.id.profile_image)

        mTvProfileName.setText("")
        Glide.with(mImvProfile).load("")

//        MainActivity -> HistoryVegetableSharingActivity -> HistoryAdapter
    }
}