package br.com.jandera.objectoriented.interfaces

class Car(val color: String): Vehicle {
    override val automakerName = "Honda"

    override fun getDoors() = 5

    internal fun getColor() = color

}