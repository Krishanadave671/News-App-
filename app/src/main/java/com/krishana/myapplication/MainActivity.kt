package com.krishana.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), newsitemclicked {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview.layoutManager = LinearLayoutManager(this)
        val items = fetchdata()
        val Adapter : newslistAdapter = newslistAdapter(items,this)
        recyclerview.adapter = Adapter
    }

    private  fun fetchdata() : ArrayList<String> {
        val list = ArrayList<String>()
            for (i in 0 until 100){
                list.add("item $i")
            }
        return  list;




    }

    override fun onitemclicked(item: String) {
       Toast.makeText(this, "Clicked item is $item" , Toast.LENGTH_LONG).show()
    }
}
