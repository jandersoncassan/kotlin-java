package br.com.jandera.basic.expression

fun main(){

    // No kotlin o IF é uma expressão e não uma instrução como no Java
    val myInt = 199
    val aInt = 7

    //exemplo
    //no java
    //int lowest = (myInt < aInt) ? myInt : aInt
    //kotlin
    val lawest = if(myInt < aInt) myInt else aInt

    // Nao tem necessidade de dar um return como fariamos no java
    val temp = 25
    val isAirConditionerOn = if (temp >= 26) {
        println("It is warm")
        true
    }else{
        println("It is not so warm")
        false
    }

    println("Is the air conditioner on: $isAirConditionerOn")


}