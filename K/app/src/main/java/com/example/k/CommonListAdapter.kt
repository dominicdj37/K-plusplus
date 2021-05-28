package com.example.k

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CommonListAdapter (): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemViewType(position: Int): Int {
        return R.layout.item_layout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return  DeviceViewHolder(layoutView)
    }

    override fun getItemCount() = 100

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

}
