package com.hoanpham.it.vegetablesharing

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryAdapter(val userList: ArrayList<DataClass>) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.history_adapter, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: HistoryAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: DataClass) {
            val tvNumber = itemView.findViewById(R.id.tvNumber) as TextView
            val tvName = itemView.findViewById(R.id.tvName) as TextView
            val tvStatusProgress = itemView.findViewById(R.id.tvStatusProgress) as TextView
            val imvProfile = itemView.findViewById(R.id.profile_image) as ImageView
            // TODO: 4/1/2021 set data here
        }
    }
}