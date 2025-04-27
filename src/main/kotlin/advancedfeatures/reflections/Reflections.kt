package br.com.jandera.advancedfeatures.reflections

import br.com.jandera.advancedfeatures.annotations.Person

fun main() {

    val person = Person("Stan", "Lee")
    val kClass = person::class

    println("Qualify name: $kClass")
    println()

    println("Simple name: ${kClass.simpleName}")
    println()

   for (fields in kClass.members) {
       println("Properties name: $fields")
   }
    println()
    //only attribute declared for me
    for (fields in kClass.java.declaredFields) {
        println("Properties name: $fields")
        println("Only fields name: ${fields.name}")
        println()
    }

    // iterate in constructor
    for(constructor in kClass.constructors){
        println("Constructors fields: $constructor")
        println("Constructors return: ${constructor.returnType}")
        println("Constructors parameters: ${constructor.parameters}")
    }



}