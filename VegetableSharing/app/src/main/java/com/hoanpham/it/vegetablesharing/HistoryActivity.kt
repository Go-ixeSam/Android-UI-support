package com.hoanpham.it.vegetablesharing

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class HistoryActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var mSpinStatus : Spinner
    private lateinit var mAdapter : HistoryAdapter
    private lateinit var mRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.history_view)

        mSpinStatus = findViewById(R.id.spinnerStatus)
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
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

    }
}