package br.com.jandera.functionalprogramming.sequences

fun main() {

    val students = getStudents()
    println("Students List : $students")

    //as sequences são geradas a partir do momento que são invocadas,
    // nesse exemplo, eliminamos o 1ºitem da lista e pegamo somente os proximso 3
    val sqStudents = students.drop(1).take(3).toList()
    println("Students sequence: $sqStudents")

    //podemos gerar sequences em tempo real, utilizando o metodo generateSequence,
    // nesse exemplo geramos um sequence iniciando em 100 eliminamos os 5 primeiros e pegamos os proximos 20
    // lembrando que só sera executada no momento que invocarmos o metodo take()
    val numbers = generateSequence(100) { it+1  }
    println("Sequences: ${numbers.drop(5).take(20).toList()}")

    val squares = generateSequence(1) { it+1  }.map { it * it }
    println("squares: ${squares.take(5).toList()}")

    val evenSquares = squares.filter { it % 2 == 0 }
    println("evenSquares: ${evenSquares.take(5).toList()}")

    //finonacci
    val fibonacci = generateSequence (1 to 1) { it.second to it.first + it.second }.map { it.first }
    println("fibonacci: ${fibonacci.take(15).toList()}")


}