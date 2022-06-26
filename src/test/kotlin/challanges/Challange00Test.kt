package challanges

import org.junit.Assert.assertEquals
import org.junit.Test

class Challange00Test {

    val challange00 = Challange00()

    @Test
    fun `should return whether any two numbers from the list add up k`() {
        val list = listOf<Long>(10, 15, 3, 7)
        val expectedReturn = listOf(true, false, false, true)

        assertEquals(expectedReturn, challange00.checkSum(list, 17))
    }
}