package br.com.jandera.advancedfeatures.destructuring

import br.com.jandera.advancedfeatures.operatoroverloading.Coordinates

fun main() {

    showComponents()
    println()

    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1 + c2
    println(c3)

    //exemplo de destruturação
    val(xCoordinate, yCoordinate) = c3
    println("xCoordinate: $xCoordinate")
    println("yCoordinate: $yCoordinate")
    println()
    //buscando direto dos atributos nativos do kotlin
    println("xCoordinate: ${c3.component1()}")
}

fun showComponents(){
    val myPoint =Point(5000, 500, 60000)

    val(myX, myY, myZ) = myPoint

    println("myX : $myX")
    println("myY : $myY")
    println("myZ : $myZ")
}