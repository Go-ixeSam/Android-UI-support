package com.hoanpham.it.vegetablesharing

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryStatusAdapter(val userList: ArrayList<DataClass>) : RecyclerView.Adapter<HistoryStatusAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryStatusAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.history_adapter, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: HistoryStatusAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: DataClass) {
            val tvName1 = itemView.findViewById(R.id.tvName1) as TextView
            val tvDate = itemView.findViewById(R.id.tvDatePush) as TextView
            val tvName2 = itemView.findViewById(R.id.tvName2) as TextView
            val tvNumberChange = itemView.findViewById(R.id.tvNumberChange) as TextView
            val tvNumberHave  = itemView.findViewById(R.id.tvNumberHave) as TextView
            // TODO: 4/1/2021 set data here
        }
    }
}