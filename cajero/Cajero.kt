package com.Haroldx7.ejercicio.introduccion.cajero

class Cajero {
    private val usuarios = mutableListOf<Usuario>()

    fun cargarUsurarios(numeroUsuarios: Int){
        for(x in 1..numeroUsuarios){
            println("Nombre del usuario $x:")
            var nombre = readln()!!.toString();
            println("Saldo del usuario $x:")
            var saldo = readln()!!.toDouble()
            usuarios.add(Usuario(nombre, saldo))
        }
    }

    fun mostrarUsiarios(){
        for((index, usuarios) in usuarios.withIndex()){
            println("Usuario ${index + 1}: ${usuarios.nombre} saldo ${usuarios.saldo}")
        }
    }

    fun depositar(){
        println("Digite el numero del usuario:")
        val numeroUsuario = readln()!!.toInt()
        println("Ingre la cantidad que quiere depositar")
        var cantidad = readln()!!.toDouble()
        usuarios[numeroUsuario - 1].saldo += cantidad
        println("Deposito exitoso: nuevo saldo: ${usuarios[numeroUsuario - 1].saldo}")
    }

    fun retirar(){
        println("Digite el numero del usuario:")
        val numeroUsuario = readln()!!.toInt()
        println("Digite la cantidad a retirar:")
        val cantidad = readln()!!.toDouble()
        if(cantidad <= usuarios[numeroUsuario - 1].saldo){
            usuarios[numeroUsuario - 1].saldo -= cantidad
            println("Retiro exitoso: nuevo saldo: ${usuarios[numeroUsuario - 1].saldo}")
        }
    }
}

