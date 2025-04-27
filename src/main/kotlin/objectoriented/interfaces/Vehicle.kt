package br.com.jandera.objectoriented.interfaces

interface Vehicle {

    val automakerName: String

    fun start(){
        println("== vrummmmmm ==")
    }

    fun stop(){
        println("== brake noise == ")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    fun getDoors(): Int
}