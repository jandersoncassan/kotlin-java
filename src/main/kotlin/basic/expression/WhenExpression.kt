package br.com.jandera.basic.expression

fun main(){

    //no kotlin when substitui o switch 'classica'

    val pizzasOrdered = 2

    when(pizzasOrdered){
        0 -> println("Not hungry")
        1 -> println("Hungry")
        2 -> println("Very hungry")
        else -> println("Are you sure ?")
    }

    when(pizzasOrdered){
        0 -> println("Not hungry")
        1,2-> println("Hungry")
        3 -> println("Very hungry")
        else -> println("Are you sure ?")
    }

    // mas nao ficamos limitados a comparar somente com variaves ( constantes ) podemos comparar com resultados
    val pizzasOrdered2 = -2
    when(pizzasOrdered2){
        Math.abs(pizzasOrdered2) -> println("Ordered 0 or more pizzas")
        else -> println("Ordered less than 0")
    }

    // tambem podemos trabalhar com range utilizando o when
    val pizzasOrdered3 = 5
    when(pizzasOrdered3){
        0 -> println("We need orders")
        in 1 .. 4 -> println("Got some orders")
        in 5 .. 8 ->  println("Business is up")
        else -> println("Are you sure ?")
    }

    //tambem podemos utilizar o when sem nenhum argumento
    val pizzasOrdered4 = 1234
    when{
        pizzasOrdered4 <= 0 -> println("None ordered")
        pizzasOrdered4 % 2 == 1 -> println("Odd number ordered")
        pizzasOrdered4 % 2 == 0 -> println("Even number ordered")
        else -> println("Poutz eita poha")
    }

    //pode subistituir o if/else classico e podemos atribuir valores com as condicoes
    val pizzasOrdered5 = 10
    val r = when{
        pizzasOrdered5 <= 0 -> "A"
        pizzasOrdered5 >= 1 && pizzasOrdered5 <= 6 -> "B"
        (pizzasOrdered5 >= 7 && pizzasOrdered5 <= 10) || pizzasOrdered5 == 11  -> "C"
        else -> "D"
    }

    print(r)
}