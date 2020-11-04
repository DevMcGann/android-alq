package com.gsoft.argentina.alquilorumandroid.modelos

data class PropiedadModel(
    var propietadioId: String,
    var direccion: String,
    var descripcion: String,
    var imagenPrincipal: String,

    var precio: Number = 20000,
    var tipo: String = "CASA",
    var barrio: String = "Centro",
    var bath: Int = 2,
    var rooms: Int = 2,
    var patio: Boolean = true,
    var garage : Boolean = true,

    var contacto : String = "2477445566",

    var lat: String = "111111",
    var long: String = "22222",
    var elevacion:String="15",

    var imagenes: Array<String> ? = null,

    var pago : Boolean = false




    )