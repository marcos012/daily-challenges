package challenges

/**
 * cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns
 * the first and last element of that pair.
 * For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 * */
class Challenge03 {
    fun cons(a: Int, b: Int): String {
        val sb = StringBuilder()

        return sb.append(a, b).toString()
    }

    fun car(str: String): Int {
        return Integer.parseInt(str.first().toString())
    }

    fun cdr(str: String): Int {
        return Integer.parseInt(str.last().toString())
    }
}