package com.hoanpham.it.vegetablesharing

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class HistoryVegetableSharingActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var mSpinStatus : Spinner
    private lateinit var mSpinPush : Spinner
    private lateinit var mRecyclerView : RecyclerView
    private lateinit var mAdapter: HistoryStatusAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.history_activity_view)
        mSpinStatus = findViewById(R.id.spinnerStatus)
        mSpinPush = findViewById(R.id.spinnerPush)
        mSpinPush.onItemSelectedListener = this
        mSpinStatus.onItemSelectedListener = this

        val categories: MutableList<String> = ArrayList()
        categories.add("Item 1")
        categories.add("Item 2")
        categories.add("Item 3")
        categories.add("Item 4")
        categories.add("Item 5")
        categories.add("Item 6")

        val dataAdapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories)

        // Drop down layout style - list view with radio button

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // attaching data adapter to spinner

        // attaching data adapter to spinner
        mSpinStatus.adapter = dataAdapter

        val dataAdapter1: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories)

        // Drop down layout style - list view with radio button

        // Drop down layout style - list view with radio button
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        mSpinStatus.adapter = dataAdapter1

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
         when(view){
             mSpinPush -> {
                 // TODO: 4/1/2021 choose and refetchData
             }

             mSpinPush ->{
                 // TODO: 4/1/2021 choose and refetchData
             }
         }
    }
}