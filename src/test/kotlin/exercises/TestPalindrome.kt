package exercises

import br.com.jandera.objectoriented.exercises.Palindrome
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class TestPalindrome {

    //deicidi implementar uma classe, poderia ser apenas uma function
    val palindrome = Palindrome()

    @Test
    fun `"civic" is a palindrome`() {

        palindrome.isPalindrome("civic") shouldBeEqualTo true
    }

    @Test
    fun `" civic" is not a palindrome`() {
        palindrome.isPalindrome(" civic") shouldBeEqualTo false
    }

    @Test
    fun `"civic " is not a palindrome`() {
        palindrome.isPalindrome("civic ") shouldBeEqualTo false
    }

    @Test
    fun `"greetings" is not a palindrome`() {
        palindrome.isPalindrome("greetings") shouldBeEqualTo false
    }

    @Test
    fun `"1000000001" a palindrome`() {
        palindrome.isPalindrome("1000000001") shouldBeEqualTo true
    }

    @Test
    fun `"Fish hsif" is not a palindrome`() {
        palindrome.isPalindrome("Fish hsif") shouldBeEqualTo false
    }

    @Test
    fun `"pennep" a palindrome`() {
        palindrome.isPalindrome("pennep") shouldBeEqualTo true
    }

}