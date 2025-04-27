package br.com.jandera.functionalprogramming.lambdas

fun main(){

    val students = getStudents()
    println("students full: $students")

    //o map retorna uma List<T>,é bem parecida com java
    val combos = students.map { a-> "${a.name}: ${a.age}"}
    println("Combos : $combos")

    //se precisarmos buscar apenas 1 parametro podemos utilizar o parametro PADRAO que é o "it"
    //ex: vamos buscar o estudadante mais velho da lista
    println("The oldest student is : ${students.maxByOrNull { it.age }}")

    //vamos filtrar os estudantes com o nome maior que 5 letras
    println("The student with longest name is : ${students.filter { it.name.length > 5 }}")

}