package challenges

/**
 * cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns
 * the first and last element of that pair.
 * For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 * */
class Challenge03 {
    fun cons(a: Int, b: Int): Pair<Int, Int> {
        return Pair(a, b)
    }

    fun car(pair: Pair<Int, Int>): Int {
        return pair.first
    }

    fun cdr(pair: Pair<Int, Int>): Int {
        return pair.second
    }
}