package com.example.proyectotabs1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

import kotlinx.android.synthetic.main.fragment2.*

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val items = ArrayList<Places>()
        items.add(Places(R.drawable.image1,"Card 1"))
        items.add(Places(R.drawable.image2,"Card 2"))
        items.add(Places(R.drawable.image3,"Card 3"))
        items.add(Places(R.drawable.image4,"Card 4"))
        items.add(Places(R.drawable.image5,"Card 5"))
        items.add(Places(R.drawable.image6,"Card 6"))
        items.add(Places(R.drawable.image7,"Card 7"))
        items.add(Places(R.drawable.image8,"Card 8"))
        items.add(Places(R.drawable.image9,"Card 9"))

        val recView :RecyclerView= recicler
        val adaptador = PlacesAdapter(items)
        recView.setHasFixedSize(true)
        recView.itemAnimator = DefaultItemAnimator()


        recView.adapter = adaptador
        recView.layoutManager= StaggeredGridLayoutManager(2,1)

        adaptador.onClick = {


        }


    }

}