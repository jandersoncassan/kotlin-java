package br.com.jandera.objectoriented.classes

//Quando declaramos classes com construtor primario não é necessário a palavra chave "constructor".
//class Person constructor(firstName: String, lastName: String){}

/*
class Person(firstName: String, lastName: String){
    init {
        println("created a person named $firstName $lastName")
    }
}*/

//Existem sistuaçãoes que precisamos de algum modificador de acesso na classe
// e utilizamos a palavra chave "internal" e nesse caso precisaremos colocar a palavra chave "constructor"
// e assim podemos ter construtores secundario com a regra de: esses construtores "SEMPRE" devem chamar o constructor primario com a palavra "this"
class Person internal constructor (firstName: String, lastName: String){
    init {
        println("created a person named $firstName $lastName")
    }

    constructor (firstName: String, lastName: String, middleName:String):
            this(firstName, lastName)
}