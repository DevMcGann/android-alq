package com.gsoft.argentina.alquilorumandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gsoft.argentina.alquilorumandroid.R
import com.gsoft.argentina.alquilorumandroid.adaptadores.adaptador_propiedades
import com.gsoft.argentina.alquilorumandroid.repo.mockDatos
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var listaDePropiedades: adaptador_propiedades

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = mockDatos.createDataSet()
        listaDePropiedades.submitList(data)
    }

    private fun initRecyclerView(){

        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingDecorator = TopSpacingItemDecoration(50)
            addItemDecoration(topSpacingDecorator)
            listaDePropiedades = adaptador_propiedades()
            adapter = listaDePropiedades
        }
    }
}