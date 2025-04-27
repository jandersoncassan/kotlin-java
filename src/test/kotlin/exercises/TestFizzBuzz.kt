package exercises

import br.com.jandera.basic.exercises.fizzBuzz
import br.com.jandera.basic.exercises.fizzBuzz2
import br.com.jandera.basic.exercises.fizzBuzz3
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class TestFizzBuzz {

    @Test
    fun `Calling fizzbuzz with 5 returns list with 5 items`() {
        fizzBuzz(5) shouldBeEqualTo listOf("1", "2", "Fizz", "4", "Buzz")
    }

    @Test
    fun `Calling fizzbuzz with 16 returns out the correct values`() {

        val list = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz",
            "7", "8", "Fizz", "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz", "16"
        )

        fizzBuzz2(16) shouldBeEqualTo list
    }

    @Test
    fun `Calling fizzbuzz with 10 returns out the correct values`() {

        val list = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"
        )

        fizzBuzz3(10) shouldBeEqualTo list
    }
}