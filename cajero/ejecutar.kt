package com.Haroldx7.ejercicio.introduccion.cajero

fun main(){
    val cajero = Cajero()
    println("Cuantos usuarios hay")
    val cantidadUsuarios = readln()!!.toInt()

    cajero.cargarUsurarios(cantidadUsuarios)

    var option: Int
    do{
        println("MENU")
        println("1. Mostrar usuarios")
        println("2. Depositar dinero")
        println("3. Retirar dinero")
        println("4. Salir")
        println("Digite el numero de la opccion:")
        option = readln()!!.toInt()
        when(option) {
            1 -> cajero.mostrarUsiarios()
            2 -> cajero.depositar()
            3 -> cajero.retirar()
            4 -> println("Salir del cajero")
            else -> println("Opccion no valida volver a intentar")
        }

    }while(option != 4)


}