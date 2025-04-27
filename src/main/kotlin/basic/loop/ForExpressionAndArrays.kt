package br.com.jandera.basic.loop

fun main(){


    var index = 0
    for (item in 10.rangeTo(20).step(2)){
        ++index
        println("$index ) $item")
    }
    //OU
    for (item in 10.rangeTo(20).step(2)){
        println("${++index} ) $item")
    }

    println()
    //podemos utilizar um extension method "withIndex" para recuperar o indice dentro do loop for
    for ((indxk, item) in 10.rangeTo(20).step(2).withIndex()){
        println("${indxk + 1} ) $item")
    }

    println()
    //utilizando um array como iterador e pegando valor e indice
    val myArray: Array<Int> = arrayOf(10, 20, 30 ,40, 50)
    for (item in myArray.indices){
        println("At index $item is ${myArray[item]}")
    }
    println()
    //utilizando um array como iterador e pegando somente o valor
    val myArray2: Array<Int> = arrayOf(10, 20, 30 ,40, 50)
    for (item in myArray2){
        println("value is $item ")
    }

}