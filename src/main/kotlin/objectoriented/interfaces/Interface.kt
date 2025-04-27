package br.com.jandera.objectoriented.interfaces

fun main(){

    val myCar = Car("yellow")
    myCar.start()
    println("My car's is ${myCar.getColor()}  and your make ${myCar.automakerName}")
    println("My car's exists ${myCar.getDoors()} door")
    println("My car's consume ${myCar.getKmPerLiter()} per liter")
    myCar.stop()
}