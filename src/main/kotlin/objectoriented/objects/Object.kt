package br.com.jandera.objectoriented.objects


//existem 2 tipos de objectos (object type e objects declaration) com suas diferenças !

//#Object Type
//objetos podem ser criados dentro de functions ou separadamente
fun main(){
    val location =object {
        var xCoordinate = 200
        var yCoordinate = 400
    }
    println("Coordinates = (${location.xCoordinate}, ${location.yCoordinate})")

    //podemos criar funções dentro desses objetos
    val location1 =object {
        var xCoordinate = 300
        var yCoordinate = 600
        fun printIt(){
            println("Coordinates = ($xCoordinate, $yCoordinate)")
        }
    }
    location1.printIt()

    //se os atributos do objeto forem "var" podemos alterar os valores desses atributos
    location1.xCoordinate = 3000
    location1.yCoordinate = 6000
    location1.printIt()

    //testando object declaration
    val temperature = MySingleton.getLastTeperature()
    println("Last temperature measured = $temperature degress")

}

//#Object Declaration
// Ao contrario de object type a object declaration é uma instrução e não uma expressão,
// não pode ser declarada localmente como em uma função, mas pode ser aninhada em outro objeto para criar uma declaração de objeto

object MySingleton {
    var temperatures = arrayOf(18, 22, 26)
    fun getLastTeperature(): Int = temperatures.last()

}