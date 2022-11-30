package com.petshop.online.GopalTetsing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.petshop.online.Adapter.Adapter1
import com.petshop.online.R
import kotlinx.android.synthetic.main.recyclercollpasing.*

class Collapsing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsing)

/*
        recycler1.layoutManager= LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        recycler1.setHasFixedSize(true)
        recycler1.adapter= Adapter1(this
        )*/
    }
}