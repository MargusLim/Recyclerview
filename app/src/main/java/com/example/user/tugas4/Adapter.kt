package com.example.user.tugas4

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class Adapter(mContext: Context, val listData : List<Model> ) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
       val view = LayoutInflater.from(p0?.context).inflate(R.layout.design, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val model: Model = listData.get(i)

        viewHolder.tvTitle.setText(model.title)
        viewHolder.tvDetail.setText(model.detail)
    }

}