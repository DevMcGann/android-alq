package com.gsoft.argentina.alquilorumandroid.repo

import com.gsoft.argentina.alquilorumandroid.modelos.PropiedadModel

class mockDatos {
    companion object{

        fun createDataSet(): ArrayList<PropiedadModel>{
            val list = ArrayList<PropiedadModel>()
            list.add(
                PropiedadModel(
                    propietadioId = "prueba2",
                    direccion = "Calle Verde 123",
                    descripcion = "Choza para boludear, 2 hab, 1 baño, patio, pileta, parrillero",
                    image = "https://image.shutterstock.com/image-photo/house-rent-260nw-84704458.jpg"
                ))

            list.add(
                PropiedadModel(
                    propietadioId = "prueba2",
                    direccion = "Calle Verde 123",
                    descripcion = "Choza para boludear, 2 hab, 1 baño, patio, pileta, parrillero",
                    image = "https://image.shutterstock.com/image-photo/house-rent-260nw-84704458.jpg"
                ))


            list.add(
                PropiedadModel(
                    propietadioId = "prueba2",
                    direccion = "Calle Verde 123",
                    descripcion = "Choza para boludear, 2 hab, 1 baño, patio, pileta, parrillero",
                    image = "https://image.shutterstock.com/image-photo/house-rent-260nw-84704458.jpg"
                ))


            list.add(
                PropiedadModel(
                    propietadioId = "prueba2",
                    direccion = "Calle Verde 123",
                    descripcion = "Choza para boludear, 2 hab, 1 baño, patio, pileta, parrillero",
                    image = "https://image.shutterstock.com/image-photo/house-rent-260nw-84704458.jpg"
                ))


            list.add(
                PropiedadModel(
                    propietadioId = "prueba2",
                    direccion = "Calle Verde 123",
                    descripcion = "Choza para boludear, 2 hab, 1 baño, patio, pileta, parrillero",
                    image = "https://image.shutterstock.com/image-photo/house-rent-260nw-84704458.jpg"
                ))
            return list
        }
    }

}