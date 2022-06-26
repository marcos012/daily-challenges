package challenges

import org.junit.Assert.assertEquals
import org.junit.Test

class Challenge00Test {

    private val challenge = Challenge00()

    @Test
    fun `should return whether any two numbers from the list add up k`() {
        val list = listOf<Long>(10, 15, 3, 7)
        val expectedReturn = listOf(true, false, false, true)

        assertEquals(expectedReturn, challenge.checkSum(list, 17))
    }
}