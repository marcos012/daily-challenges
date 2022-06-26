package challenges

/**
 * Given a list of numbers and a number k, to return whether any two numbers from the list add up k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * Bonus: Can you do this in one pass?
 * */
class Challenge00 {
    fun checkSum(list: List<Long>, k: Long): List<Boolean> {
        return list.map {
            list.contains(k - it)
        }
    }
}