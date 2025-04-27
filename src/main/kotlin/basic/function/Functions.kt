package br.com.jandera.basic.function

fun main(){

    println("10 + 20 = ${myMathFunction(10, 20)}")
    println("15 + 25 = ${myExpressionBodyFunction(15, 25)}")
    println("10 + 10 = ${myExpressionBodyFunctionWithInference(10, 10)}")

    println("10 + 10 = ${myFunctionWithDefaults(10, 10)}")
    println("10 + 10 = ${myFunctionWithDefaults(10, 10, "Hello")}")
    println("defaults values= ${myFunctionWithDefaults(message = "Hello")}") //passando o default, precisamos declarar por nome 'arguments named'

}
//para declarar uma função em kotlin , inciamos com a para ? "fun" ("parametros"): "tipo de retorno" e { "corpo da função"}
fun myMathFunction(number1:Int, number2: Int): Int {
    return number1 + number2
}

//tambem podemos utilizar uma função com expression body, "quando a consistencia é muito pequena", na pratica retiramos as { e o return, exemplo
fun myExpressionBodyFunction(number1:Int, number2: Int): Int = number1 + number2

//tambem podemos utilizar uma função com expression body utilizando inference de tipo, na pratica não precisamos passar o tipo de retorno
fun myExpressionBodyFunctionWithInference(number1:Int, number2: Int) = number1 + number2


//podemos passar valores default nos parametros
fun myFunctionWithDefaults(number1: Int = 1, number2: Int = 5, message: String = "Hi"): Int {
    val result = number1 + number2
    println(message)
    return result
}
