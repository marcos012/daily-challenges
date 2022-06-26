package challenges

import org.junit.Assert.assertEquals
import org.junit.Test

class Challenge03Test {

    private val challenge = Challenge03()

    @Test
    fun `should return first element of the pair`() {
        val first = challenge.car(challenge.cons(3, 4))

        assertEquals(3, first)
    }

    @Test
    fun `should return last element of the pair`() {
        val first = challenge.cdr(challenge.cons(3, 4))

        assertEquals(4, first)
    }
}