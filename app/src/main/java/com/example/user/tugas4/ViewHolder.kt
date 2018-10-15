package com.example.user.tugas4

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val tvTitle = itemView.findViewById<TextView>(R.id.titleTV)
    val tvDetail = itemView.findViewById<TextView>(R.id.detailTV)
}