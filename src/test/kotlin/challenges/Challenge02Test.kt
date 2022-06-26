package challenges

import org.junit.Assert.assertEquals
import org.junit.Test

class Challenge02Test {

    private val challenge = Challenge02()

    @Test
    fun `should return the lowest positive integer that does not exist in the array`() {
        val list = listOf(1, 2, -3, -1, 0)

        assertEquals(3, challenge.checkLowestPositive(list))
    }

    @Test
    fun `should return 1 if array just contains a negative numbers or 0`() {
        val list = listOf(-1, -2, -5, 0)

        assertEquals(1, challenge.checkLowestPositive(list))
    }
}