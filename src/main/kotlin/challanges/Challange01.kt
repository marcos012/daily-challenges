package challanges

/**
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * Follow-up: what if you can't use division?
 * */
class Challange01 {
    fun checkProduct(list: List<Int>): MutableList<Int> {
        val products = mutableListOf<Int>()

        list.forEach {
            val product = list
                .filter { value -> value != it }
                .reduce { calc, value -> calc * value }

            products.add(product)
        }

        return products
    }
}