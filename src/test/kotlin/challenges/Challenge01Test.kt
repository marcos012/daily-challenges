package challenges

import org.junit.Assert.assertEquals
import org.junit.Test

class Challenge01Test {

    private val challenge = Challenge01()

    @Test
    fun `should return new array is the product of all the numbers in the original array except the one at i`() {
        val list = listOf(1, 2, 3, 4, 5)
        val expectedReturn = listOf(120, 60, 40, 30, 24)

        assertEquals(expectedReturn, challenge.checkProduct(list))
    }
}