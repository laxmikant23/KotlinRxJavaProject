package com.kotlinrxjavaproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_layout.*

class MyFragment : Fragment(){
    var myPlaces : ArrayList<String> = ArrayList()
    private lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPlaces()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_layout,container,false)
    }
    companion object{
        @JvmStatic
        fun newInstance() = MyFragment()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        adapter = MyAdapter()
        adapter.replaceItems(myPlaces)
        rv_animal_list.adapter = adapter
    }
    fun addPlaces(){
        myPlaces.add("Bangalore")
        myPlaces.add("Mysore")
        myPlaces.add("Dharwad")
        myPlaces.add("Hubli")
        myPlaces.add("Bijapur")
        myPlaces.add("Bagalkot")
        myPlaces.add("Belgaum")
        myPlaces.add("Gulbarga")
        myPlaces.add("Mandya")

    }
}