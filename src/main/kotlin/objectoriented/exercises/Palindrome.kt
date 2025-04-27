package br.com.jandera.objectoriented.exercises

class Palindrome {

    fun isPalindrome(str: String): Boolean {
        return str == str.reversed()
    }

    fun isPalindrome2(str: String) = str == str.reversed()


}