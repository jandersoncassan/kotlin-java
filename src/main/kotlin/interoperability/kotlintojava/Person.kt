package br.com.jandera.interoperability.kotlintojava


class Person internal constructor(var firstName: String, var lastName: String){
    init {
        println("created a person named $firstName $lastName")
    }

    constructor (firstName: String, lastName: String, middleName:String):
            this(firstName, lastName)
}