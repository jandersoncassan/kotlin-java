package br.com.jandera

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main(args: Array<String>) {
    val name =  if(args.isNotEmpty()) args[0] else "Jande"
    println("Hello \uD83D\uDE0A $name")
}