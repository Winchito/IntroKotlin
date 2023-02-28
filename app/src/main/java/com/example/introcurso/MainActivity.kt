package com.example.introcurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object {
        const val moneda = "COP"
        const val PIN = 1234
    }

    var saldo: Float = 5000.65f
    var sueldo: Float = 25000.68f
    var int: Int = 63

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fecha = "01/08/1990"
        var nombre: String = "John"
        var vip: Boolean = true
        var inicial: Char = 'J'

        // println("Hola"+ nombre)
        var saludo = "Hola " + nombre

        if (vip == true) saludo += ", te queremos mucho"
        else saludo += ", quieres ser VIP? Paga la cuota"


        var dia = fecha.subSequence(0, 2).toString().toInt()


        var mes = fecha.subSequence(3, 5).toString().toInt()

        println(saludo)

        when (mes) {
            1 -> print("\n En Enero está la super oferta con el 7% de interés")
            2, 3 -> print("\n En invierno no hay ofertas de inversiones")
            4, 5, 6 -> print("\n En primavera hay ofertas de inversiones con el 1.5% de interes")
            7, 8, 9 -> print("\n En verano hay ofertas de inversiones con el 2.5% de interes")
            10, 11, 12 -> print("\n En otoño hay ofertas de inversiones con el 3.5% de interes")
            else -> print("\n La fecha es erronea")
        }

        var intentosPin = 0
        var claveIngresada: Int = 1234

        do {

            println("\n Ingrese un PIN")
            // println("Clave Ingresada: ${++claveIngresada}")
            println("Clave Ingresada: $claveIngresada")
            if (claveIngresada == PIN) break
            intentosPin++

        } while (intentosPin < 3 && claveIngresada != PIN)
        if (intentosPin == 3) println("Cuenta bloqueada!")


        mostrarSaldo()
        if (dia == 1) ingresarSaldo()
        ingresarDinero(5000.94f)
        retirarDinero(2000.94f)
        retirarDinero(80000f)


        var recibos: Array<String> = arrayOf("luz", "agua", "gas")

        var matriz = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9, 10, 11, 12, 13, 14)
        )

        for (i in (0 until matriz.size)) {
            println()
            for (j in (0 until matriz[i].size)) {
                println("Posicion[$i][$j]: ${matriz[i][j]}")
            }
        }


        var clientesVIP: Set<Int> = setOf(
            1234,
            5678,
            4044
        ) //Tambien se puede mezclar, solo que en este caso se espcifico a un Entero

        println("Clientes VIP: $clientesVIP")
        println("Numero de clientes VIP: ${clientesVIP.size}")

        if (clientesVIP.contains(1234)) println("1234 es VIP")
        if (clientesVIP.contains(1235)) println("1235 es VIP")

        var clientes: MutableSet<Int> = mutableSetOf(1234, 5678, 4040, 8395)

        println("Clientes: $clientes")

        clientes.add(3026)
        println("Clientes: $clientes")

        clientes.remove(1234)
        println("Clientes: $clientes")

        clientes.clear()
        println("Clientes: $clientes")

        println("Numero de Clientes: ${clientes.size}")

        var divisas: List<String> = listOf("COP","MXN", "USD","EUR")
        println(divisas)

        var bolsa: MutableList<String> = mutableListOf("Coca-Cola", "Pepsi", "Adidas", "Amazon")
        println(bolsa)

        bolsa.add("AMD")
        println(bolsa)

        bolsa.removeAt(2)
        println(bolsa)

        println(bolsa.first())
        println(bolsa.last())
        println(bolsa.elementAt(1))
        println(bolsa.none())

        println(bolsa.firstOrNull())
        bolsa.clear()
        println(bolsa)

        println(bolsa.none())
        println(bolsa.firstOrNull())

        var mapa: Map<Int, String> = mapOf(
            1 to "Colombia",
            2 to "Perú",
            3 to "Ecuador"
        )

        println(mapa)


        var inversiones = mutableMapOf<String, Float>()
        //inversiones.put("Coca-Cola", 5000f)
        println(inversiones)


        var empresa : String? = null

        mostrarSaldo()
        var cantidadInversion = 45000f
        var index = 0

        while(saldo >= cantidadInversion){
            empresa = bolsa.elementAtOrNull(index)
            if(empresa != null){
                saldo -= cantidadInversion
                println("Se ha invertido $cantidadInversion $moneda en la empresa $empresa")
                inversiones.put(empresa, cantidadInversion)
            }else break
            index++
        }



/*
    var a: Int =  5 + 5 //10, Suma
    var b: Int =  10 - 4 //6, Resta
    var c: Int =  4 * 3 //12, Multiplicacion
    var d: Int =  15 / 5 //3, Division
    var e: Int =  10 % 3 //1, Producto
    var f: Int =  10 / 6 //1 división con resultado periodico, mantiene la parte entera

    //PreIncremento, PostIncremento

    var PreIncremento1 = 5
    var PreIncremento2 = 5
    var PostIncremento3 = 5
    var PostIncremento4 = 5

    println(PreIncremento1)
    println(++PreIncremento1) //Incrementa primero luego vuelve, Salida: 6
    println(PreIncremento1) //Salida: 6

    println(PreIncremento1)
    println(--PreIncremento2) //Resta primero luego vuelve, Salida: 4
    println(PreIncremento1) //Salida: 4

    println(PostIncremento3)
    println(PostIncremento3++) //Primero regresa, luego incrementa, Salida: 5
    println(PostIncremento3)    //Salida: 6

    println(PostIncremento4)
    println(PostIncremento4--) //Primero regresa, luego resta, Salida: 5
    println(PostIncremento4) //Salida: 4


    // Operadores abreviados

    saldo += sueldo

    saldo++

    // Operadores de Comparación


    var res =  true
    res = a == b
        println(res)
    res = a != b
        println(res)
    res = a > b
        println(res)
    res = a < b
        println(res)
    res = a >= b
        println(res)
    res = a <= b
        println(res)


    //Operadores logicos

    // condición (operador) condición

    a && b // and
    a || b // or

    !d // ! = negación


*/


    }

    fun mostrarSaldo() {
        println("Tienes $saldo $moneda")
    }

    fun ingresarSaldo() {
        println("Has recibido una transferencia de $saldo $moneda")
        saldo += sueldo
        mostrarSaldo()
    }

    fun ingresarDinero(cantidad: Float) {
        saldo += cantidad
        println("Se ha ingresado una cantidad de $cantidad $moneda")
        mostrarSaldo()
    }

    fun retirarDinero(cantidad: Float) {
        if (verficarCantidad(cantidad)) {
            saldo -= cantidad
            println("Se ha retirado una cantidad de $cantidad $moneda")
            mostrarSaldo()
        } else println("El valor a retirar es mayor al sueldo presente. No se puede realizar la transacción")
    }

    fun verficarCantidad(cantidadRetiro: Float): Boolean {
        return cantidadRetiro <= sueldo
    }

    fun recorrerArray(array: Array<String>) {
        for (i in array)
            println(i)

        for (i in array.indices)
            println(array.get((i)))


        for (i in array.indices)
            println("${i + 1}: ${array.get(i)}")


    }


}