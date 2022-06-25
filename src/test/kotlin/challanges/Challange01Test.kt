package challanges

import org.junit.Assert.assertEquals
import org.junit.Test

class Challange01Test {

    val challange = Challange01()

    @Test
    fun `should return new array is the product of all the numbers in the original array except the one at i`() {
        val list = listOf(1, 2, 3, 4, 5)
        val expectedReturn = listOf(120, 60, 40, 30, 24)

        assertEquals(expectedReturn, challange.checkProduct(list))
    }
}