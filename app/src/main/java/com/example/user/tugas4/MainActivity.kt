package com.example.user.tugas4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var listTitle = arrayOf("injit-injit semut", "gundul pacul", "ampar-ampar pisang")
    var listDetail = arrayOf("rinto harahap", "r.c. hardjosubroto", "hamiedan ac")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView_main.setHasFixedSize(true)
        recyclerView_main.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val listData = ArrayList<Model>()

        for (i in 0 until listTitle.size){
            listData.add(Model(listTitle[i], listDetail[i]))
        }

        var adapter = Adapter(this, listData)
        recyclerView_main.adapter = adapter


    }
}
