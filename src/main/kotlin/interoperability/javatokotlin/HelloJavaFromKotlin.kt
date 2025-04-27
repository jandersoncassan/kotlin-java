package br.com.jandera.interoperability.javatokotlin

import br.com.jandera.interoperability.Animal

fun main(){

    val cat = Animal(10, "cat", "Garfield")
    println(cat.show())

    val dog = Animal(30, "dog", "Totó")
    println(dog.show())

    cat.weight = 13
    println(cat.show())

    //nao da p alterar , atributos final no Java o kotlin trata como "val" imutavel
    //cat.kind = "horse"

}