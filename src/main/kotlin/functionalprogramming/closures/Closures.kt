package br.com.jandera.functionalprogramming.closures

//com closures o estato é guardado em cada variavel, no exemplo abaixo devolvemos uma function ,
// o UNIT é semelhante ao void no java
fun closureMarker():()->Unit {
    var num = 0
    return { println(num++) }
}

fun main() {

    val myCounter1 = closureMarker()
    val myCounter2 = closureMarker()
    val myCounter3 = closureMarker()

    myCounter1()
    myCounter1()
    myCounter1()
    myCounter1()
    myCounter1()
    myCounter2()
    myCounter2()
    myCounter1()
    myCounter3()
}