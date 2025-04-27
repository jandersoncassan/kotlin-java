package br.com.jandera.basic.loop

fun main(){

    //funcionam muito parecido com o java
    var x = 0
    while(x < 10 ){
        println("x = $x")
        x +=3
    }
    // utilizando o do/while a diferença é que o "do" executa pelo menos 1x
    do{
        println("x = $x")
        x -=3
    }while(x >= 0 )

    //instrucao FOR nao kotlin funciona um pouco diferente
    for (item in 1 .. 10){
        //item é um val , não pode ser modificado
        print("$item, ")
    }

    for (ch in "Jandera"){
        println("$ch")
    }
}