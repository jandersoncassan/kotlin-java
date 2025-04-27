package br.com.jandera.advancedfeatures.operatoroverloading

fun main() {

    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1 + c2
    val c4 = c2 - c1
    val c5 = c1 * c2
    val c6 = c2 / c1

    println(c3)
    println(c4)
    println(c5)
    println(c6)
}