package br.com.jandera.basic.exercises

fun fizzBuzz(n: Int): List<String> {
    val list= mutableListOf<String>()
    for (it in 1.rangeTo(n)){
        val item = when{
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 ->  "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }
    return list
}

fun fizzBuzz2(n: Int): List<String> {
    val list= mutableListOf<String>()
    (1 .. n).forEach(){
        val item = when{
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 ->  "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }
    return list
}

fun fizzBuzz3(n: Int): List<String> {
    val list= mutableListOf<String>()
    for (it in 1..n){
        val item = when{
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 ->  "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }
    return list
}