package com.gsoft.argentina.alquilorumandroid.adaptadores

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.gsoft.argentina.alquilorumandroid.R
import com.gsoft.argentina.alquilorumandroid.modelos.PropiedadModel
import kotlinx.android.synthetic.main.layout_houses_item_row.view.*

class adaptador_propiedades   : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TAG: String = "AppDebug"

    private var items: List<PropiedadModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PropiedadViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_houses_item_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is PropiedadViewHolder -> {
                holder.bind(items[position])
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(blogList: List<PropiedadModel>){
        items = blogList
    }

    class PropiedadViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val propiedad_imagen: ImageView = itemView.house_image
        val propiedad_direccion: TextView = itemView.direccion
        val propiedad_descripcion: TextView = itemView.descripcion

        fun bind(propiedad: PropiedadModel){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(propiedad.imagenPrincipal)
                .into(propiedad_imagen)
            propiedad_direccion.text = propiedad.direccion
            propiedad_descripcion.text = propiedad.descripcion

        }

    }




}